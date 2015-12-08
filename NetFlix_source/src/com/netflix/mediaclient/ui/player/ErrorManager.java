// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AlertDialogFactory;
import com.netflix.mediaclient.event.android.NetworkError;
import com.netflix.mediaclient.event.nrdp.device.ReasonCode;
import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.MediaEvent;
import com.netflix.mediaclient.event.nrdp.media.NccpActionId;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.event.nrdp.media.NccpNetworkingError;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.service.logging.client.model.RootCause;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.ui.login.LogoutActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState

public class ErrorManager
{
    private static class LinkTag
    {

        public String href;
        public String text;

        private LinkTag()
        {
        }

    }


    public static final String ACTION_IDS[] = {
        "NFErr_MC_NCCP_NonRecoverableError", "NFErr_MC_NCCP_PotentiallyRecoverableError", "NFErr_MC_NCCP_CustomError", "NFErr_MC_NCCP_RegistrationRequired", "NFErr_MC_NCCP_CTicketRenewalRequired", "NFErr_MC_NCCP_MTicketRenewalRequired", "NFErr_MC_NCCP_ImpossibleImpossibility", "NFErr_MC_NCCP_GetNewCredentials", "NFErr_MC_NCCP_UnsupportedVersion", "NFErr_MC_NCCP_SecondaryCredentialsRenewalRequired", 
        "NFErr_MC_NCCP_AbortPlayback", "NFErr_MC_NCCP_StaleCredentials"
    };
    public static final String MEDIA_ERR_DECODE = "MEDIA_ERR_DECODE";
    public static final String MEDIA_ERR_NETWORK = "MEDIA_ERR_NETWORK";
    public static final String MEDIA_ERR_SRC_NOT_SUPPORTED = "MEDIA_ERR_SRC_NOT_SUPPORTED";
    private static final long PLAYREADY_CERT_REVOKED = 113L;
    private static final String TAG = "ErrorManager";
    private static final Locale US_LOCALE;
    private PlayerActivity context;
    private boolean destroyed;
    private boolean errorPosted;
    private Runnable exit;
    private final Runnable forceExit = new Runnable() {

        final ErrorManager this$0;

        public void run()
        {
            try
            {
                Log.d("ErrorManager", "Waiting 1.5 second to exit app");
                wait(1500L);
            }
            catch (Exception exception)
            {
                Log.w("ErrorManager", "Wait is interrupted", exception);
            }
            Log.d("ErrorManager", "Kill app");
            forceStop();
        }

            
            {
                this$0 = ErrorManager.this;
                super();
            }
    };
    private Handler handler;
    private com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface mConfig;
    private MediaEvent reportedError;
    private Runnable resetApp;
    private Runnable restartApp;
    private final Runnable unregister = new Runnable() {

        final ErrorManager this$0;

        public void run()
        {
            context.startActivity(LogoutActivity.create(context));
            context.finish();
        }

            
            {
                this$0 = ErrorManager.this;
                super();
            }
    };

    public ErrorManager(Handler handler1, PlayerActivity playeractivity, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        errorPosted = false;
        destroyed = false;
        exit = new Runnable() {

            final ErrorManager this$0;

            public void run()
            {
                Log.e("ErrorManager", "Exit");
                context.finish();
            }

            
            {
                this$0 = ErrorManager.this;
                super();
            }
        };
        restartApp = new Runnable() {

            final ErrorManager this$0;

            public void run()
            {
                Log.e("ErrorManager", "restartApp");
                if (context instanceof NetflixActivity)
                {
                    NetflixActivity.finishAllActivities(context);
                }
                Intent intent = new Intent();
                intent.setClass(context, com/netflix/mediaclient/service/NetflixService);
                context.stopService(intent);
            }

            
            {
                this$0 = ErrorManager.this;
                super();
            }
        };
        resetApp = new Runnable() {

            final ErrorManager this$0;

            public void run()
            {
                AndroidUtils.clearApplicationData(context);
                Log.e("ErrorManager", "resetApp");
                if (context instanceof NetflixActivity)
                {
                    NetflixActivity.finishAllActivities(context);
                }
                Intent intent = new Intent();
                intent.setClass(context, com/netflix/mediaclient/service/NetflixService);
                context.stopService(intent);
            }

            
            {
                this$0 = ErrorManager.this;
                super();
            }
        };
        handler = handler1;
        context = playeractivity;
        mConfig = configurationagentinterface;
    }

    private LinkTag extractLink(String s, StringBuilder stringbuilder)
    {
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("Trimmed message: ").append(s).toString());
        }
        String s1 = s.toLowerCase(US_LOCALE);
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("Lower case test message: ").append(s1).toString());
        }
        int i = s1.indexOf("<a href=\"");
        if (i < 0)
        {
            Log.d("ErrorManager", "Not a concurrent stream upgrade message");
            s = null;
        } else
        {
            int j = s1.indexOf("\"", i + 10);
            if (j < 0)
            {
                Log.d("ErrorManager", "Not a concurrent stream upgrade message");
                return null;
            }
            LinkTag linktag = new LinkTag();
            linktag.href = s.substring(i + 9, j);
            j = s1.indexOf(">", j);
            String s2 = s1.substring(j + 1);
            if (Log.isLoggable("ErrorManager", 3))
            {
                Log.d("ErrorManager", (new StringBuilder()).append("HREF extracted: ").append(linktag.href).toString());
                Log.d("ErrorManager", (new StringBuilder()).append("Rest of message: ").append(s2).toString());
            }
            int k = s1.indexOf("</a>");
            if (i > k)
            {
                Log.e("ErrorManager", (new StringBuilder()).append("Closing </a> found before <a>!").append(k).append(" < ").append(i).toString());
                return null;
            }
            linktag.text = s.substring(j + 1, k);
            if (k + 5 >= s.length())
            {
                s1 = "";
            } else
            {
                s1 = s.substring(k + 4);
            }
            if (Log.isLoggable("ErrorManager", 3))
            {
                Log.d("ErrorManager", (new StringBuilder()).append("TEXT extracted: ").append(linktag.text).toString());
                Log.d("ErrorManager", (new StringBuilder()).append("Rest of message: ").append(s1).toString());
            }
            stringbuilder.append(s.substring(0, i));
            if (Log.isLoggable("ErrorManager", 3))
            {
                Log.d("ErrorManager", (new StringBuilder()).append("User message (part before link): ").append(stringbuilder.toString()).toString());
            }
            stringbuilder.append(" ").append(s1);
            s = linktag;
            if (Log.isLoggable("ErrorManager", 3))
            {
                Log.d("ErrorManager", (new StringBuilder()).append("User message (part after link): ").append(stringbuilder.toString()).toString());
                return linktag;
            }
        }
        return s;
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId1(NccpActionId nccpactionid, String s)
    {
        Log.d("ErrorManager", "actionID 1 NFErr_MC_NCCP_NonRecoverableError");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c0080), null, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId10(NccpActionId nccpactionid, String s)
    {
        Log.w("ErrorManager", "ActionID 10 NFErr_MC_NCCP_CustomerCredentialsRenewalRequired");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c0086), null, unregister);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId11(NccpActionId nccpactionid, String s)
    {
label0:
        {
            Log.w("ErrorManager", "ActionID 11 ");
            String s1 = nccpactionid.getMessage();
            if (s1 != null)
            {
                nccpactionid = s1;
                if (!"".equals(s1.trim()))
                {
                    break label0;
                }
            }
            nccpactionid = context.getString(0x7f0c0087);
        }
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, nccpactionid, null, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId12(NccpActionId nccpactionid, String s)
    {
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c0088), null, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId2(NccpActionId nccpactionid, String s)
    {
        Log.w("ErrorManager", "ActionID 2 NFErr_MC_NCCP_PotentiallyRecoverableError");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c0081), null, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId3(NccpActionId nccpactionid, String s)
    {
        String s1 = nccpactionid.getMessage();
        Runnable runnable = exit;
        if (s1 == null)
        {
            nccpactionid = context.getString(0x7f0c0082);
            Log.e("ErrorManager", "ActionID 3 NFErr_MC_NCCP_CustomError: Error message expected, but not received, displaying generic error");
        } else
        {
            if (Log.isLoggable("ErrorManager", 6))
            {
                Log.e("ErrorManager", (new StringBuilder()).append("ActionID 3 NFErr_MC_NCCP_CustomError: ").append(s1).toString());
            }
            com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor alertdialogdescriptor = getErrorDescriptorForConcurrentStreamUpgrade(nccpactionid, s);
            nccpactionid = s1;
            if (alertdialogdescriptor != null)
            {
                Log.d("ErrorManager", "ActionID 3: Concurrent stream upgrade message");
                return alertdialogdescriptor;
            }
        }
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, nccpactionid, null, runnable);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId4(NccpActionId nccpactionid, String s)
    {
        Log.w("ErrorManager", "ActionID 4 NFErr_MC_NCCP_RegistrationRequired");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c00e5), null, unregister);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId5(NccpActionId nccpactionid, String s)
    {
        Log.w("ErrorManager", "ActionID 5 NFErr_MC_NCCP_CTicketRenewalRequired, AUTHENTICATION_RENEW_REQUIRE");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c0083), null, unregister);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId6(NccpActionId nccpactionid, String s)
    {
        Log.w("ErrorManager", "ActionID 6 NFErr_MC_NCCP_MTicketRenewalRequired, AUTHORIZATION_RENEW_REQUIRED");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c00e7), null, unregister);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId7(NccpActionId nccpactionid, String s)
    {
        Log.w("ErrorManager", "ActionID 7 NFErr_MC_NCCP_ImpossibleImpossibility, logout");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c00e8), null, unregister);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId8(NccpActionId nccpactionid, String s)
    {
        Log.w("ErrorManager", "ActionID 8 NFErr_MC_NCCP_GetNewCredentials");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c0084), null, unregister);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForActionId9(NccpActionId nccpactionid, String s)
    {
        String s1 = nccpactionid.getMessage();
        if (s1 != null) goto _L2; else goto _L1
_L1:
        nccpactionid = context.getString(0x7f0c0085);
        Log.e("ErrorManager", "ActionID 9 NFErr_MC_NCCP_UnsupportedVersion: force exit app, generic message");
_L4:
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, nccpactionid, null, forceExit);
_L2:
        nccpactionid = s1;
        if (Log.isLoggable("ErrorManager", 6))
        {
            Log.e("ErrorManager", (new StringBuilder()).append("ActionID 9 NFErr_MC_NCCP_UnsupportedVersion: force exit app, with custom message: ").append(s1).toString());
            nccpactionid = s1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForConcurrentStreamUpgrade(NccpActionId nccpactionid, String s)
    {
        StringBuilder stringbuilder;
        LinkTag linktag;
label0:
        {
            if (Log.isLoggable("ErrorManager", 3))
            {
                Log.d("ErrorManager", (new StringBuilder()).append("Original message: ").append(nccpactionid.getMessage()).toString());
            }
            if (nccpactionid.getReasonCode() != 102)
            {
                return null;
            }
            stringbuilder = new StringBuilder();
            nccpactionid = StringUtils.trimWhiteSpace(nccpactionid.getMessage());
            linktag = extractLink(nccpactionid, stringbuilder);
            if (linktag == null)
            {
                context.setMaxStreamsReachedDialogId(context.reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.maxStreamsReached));
                return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, nccpactionid, null, exit);
            }
            if (Log.isLoggable("ErrorManager", 3))
            {
                Log.d("ErrorManager", (new StringBuilder()).append("Link found: href=").append(linktag.href).append(", text=").append(linktag.text).toString());
            }
            String s1 = linktag.text;
            if (s1 != null)
            {
                nccpactionid = s1;
                if (!"".equals(s1.trim()))
                {
                    break label0;
                }
            }
            nccpactionid = context.getString(0x7f0c00f7);
        }
        String s2 = context.getString(0x7f0c00f8);
        Log.d("ErrorManager", "Check if link contains NCCP reason code");
        if (linktag.href.startsWith("RC:"))
        {
            Log.d("ErrorManager", "NCCP reason code found");
            try
            {
                nccpactionid = getErrorDescriptorForConcurrentStreamUpgradeWithNccpReasonCode(linktag, s, stringbuilder.toString(), nccpactionid, s2);
            }
            // Misplaced declaration of an exception variable
            catch (NccpActionId nccpactionid)
            {
                Log.e("ErrorManager", "Failed to process upgrade with NCCP reason code, return generic action id 3 message", nccpactionid);
                return null;
            }
            return nccpactionid;
        } else
        {
            Log.d("ErrorManager", "NCCP reason code NOT found, treat it as path of URL");
            context.setMaxStreamsReachedDialogId(context.reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.maxStreamsReached));
            return getErrorDescriptorForConcurrentStreamUpgradeRegular(linktag, s, stringbuilder.toString(), nccpactionid, s2);
        }
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForConcurrentStreamUpgradeRegular(final LinkTag link, String s, String s1, String s2, String s3)
    {
        link = new Runnable() {

            final ErrorManager this$0;
            final LinkTag val$link;

            public void run()
            {
                String s4;
                if (link.href.toLowerCase(ErrorManager.US_LOCALE).trim().startsWith("http"))
                {
                    s4 = link.href;
                } else
                {
                    s4 = (new StringBuilder()).append("http://www.netflix.com").append("/").append(link.href).toString();
                }
                Log.d("ErrorManager", "Launch browser");
                context.runOnUiThread(s4. new Runnable() {

                    final _cls3 this$1;
                    final String val$urlLink;

                    public void run()
                    {
                        if (Log.isLoggable("ErrorManager", 3))
                        {
                            Log.d("ErrorManager", (new StringBuilder()).append("Open browser to ").append(urlLink).toString());
                        }
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(urlLink)));
                        Log.d("ErrorManager", "Exit from playback after browser is started");
                        context.finish();
                    }

            
            {
                this$1 = final__pcls3;
                urlLink = String.this;
                super();
            }
                });
            }

            
            {
                this$0 = ErrorManager.this;
                link = linktag;
                super();
            }
        };
        context.setMaxStreamsReachedDialogId(context.reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.maxStreamsReached));
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.TwoButtonAlertDialogDescriptor(s, s1, s2, link, s3, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getErrorDescriptorForConcurrentStreamUpgradeWithNccpReasonCode(final LinkTag json, String s, String s1, String s2, String s3)
        throws JSONException
    {
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("Link found: href=").append(json.href).append(", text=").append(json.text).toString());
        }
        String as[] = StringUtils.extractTokens(json.href, ";");
        json = new JSONObject();
        if (as.length != 2)
        {
            Log.e("ErrorManager", "Problem with RC format! ; is missing!");
            return null;
        }
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("HREF token: ").append(as[0]).append(", ").append(as[1]).toString());
        }
        String as1[] = StringUtils.extractTokens(as[0], ":");
        if (as1.length != 2)
        {
            Log.e("ErrorManager", "Problem with RC format!");
            return null;
        }
        if (!"RC".equalsIgnoreCase(as1[0]))
        {
            Log.e("ErrorManager", (new StringBuilder()).append("RC is NOT first element, but: ").append(as1[0]).toString());
            return null;
        }
        json.put("RC", as1[1]);
        as = StringUtils.extractTokens(as[1], "&");
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("# of parameters found in NCCP reason code: ").append(as.length).toString());
        }
        int i = 0;
        while (i < as.length) 
        {
            String as2[] = StringUtils.extractTokens(as[i], "=");
            if (as2.length == 2)
            {
                json.put(as2[0], as2[1]);
            } else
            if (Log.isLoggable("ErrorManager", 5))
            {
                Log.w("ErrorManager", (new StringBuilder()).append("Parameter ").append(i).append(" does not have proper format: ").append(as[i]).append(". Skipping.").toString());
            }
            i++;
        }
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("JSON: ").append(json).toString());
        }
        json = new Runnable() {

            final ErrorManager this$0;
            final JSONObject val$json;

            public void run()
            {
                Log.d("ErrorManager", "Publish NCCP reason code event to UI");
                context.getNetflixApplication().publishEvent(new ReasonCode(json));
                Log.d("ErrorManager", "Exit from playback after UI is alerted to handle");
                context.finish();
            }

            
            {
                this$0 = ErrorManager.this;
                json = jsonobject;
                super();
            }
        };
        context.setMaxStreamsReachedDialogId(context.reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.maxStreamsReached));
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.TwoButtonAlertDialogDescriptor(s, s1, s2, json, s3, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getHandler(MediaEvent mediaevent)
    {
        if (mediaevent instanceof NccpActionId)
        {
            return getHandlerForActionIdError((NccpActionId)mediaevent);
        }
        if (mediaevent instanceof NetworkError)
        {
            return getHandlerForNetworkError((NetworkError)mediaevent);
        }
        if (mediaevent instanceof NccpNetworkingError)
        {
            return getHandlerForNetworkingError((NccpNetworkingError)mediaevent);
        }
        if (mediaevent instanceof Error)
        {
            return getHandlerForMediaError((Error)mediaevent);
        } else
        {
            Log.e("ErrorManager", "Ukwnown NCCP error, display generic error!");
            return getUknownErrorDescriptor(mediaevent, "");
        }
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getHandlerForActionIdError(NccpActionId nccpactionid)
    {
        Log.d("ErrorManager", (new StringBuilder()).append("NccpError ").append(nccpactionid).toString());
        switch (nccpactionid.getActionId())
        {
        default:
            Log.w("ErrorManager", "default, try to find correct error");
            return getUknownErrorDescriptor(nccpactionid, "");

        case 1: // '\001'
            return getErrorDescriptorForActionId1(nccpactionid, "");

        case 2: // '\002'
            return getErrorDescriptorForActionId2(nccpactionid, "");

        case 3: // '\003'
            return getErrorDescriptorForActionId3(nccpactionid, "");

        case 4: // '\004'
            return getErrorDescriptorForActionId4(nccpactionid, "");

        case 5: // '\005'
            return getErrorDescriptorForActionId5(nccpactionid, "");

        case 6: // '\006'
            return getErrorDescriptorForActionId6(nccpactionid, "");

        case 7: // '\007'
            return getErrorDescriptorForActionId7(nccpactionid, "");

        case 8: // '\b'
            return getErrorDescriptorForActionId8(nccpactionid, "");

        case 9: // '\t'
            return getErrorDescriptorForActionId9(nccpactionid, "");

        case 10: // '\n'
            return getErrorDescriptorForActionId10(nccpactionid, "");

        case 11: // '\013'
            Log.d("ErrorManager", "ActionID 11 NFErr_MC_AbortPlayback");
            return getErrorDescriptorForActionId11(nccpactionid, "");

        case 12: // '\f'
            Log.d("ErrorManager", "ActionID 12 NFErr_MC_StaleCredentials");
            break;
        }
        return getErrorDescriptorForActionId12(nccpactionid, "");
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getHandlerForMediaError(Error error)
    {
        boolean flag = error.checkForOpenDeviceFailureInStack();
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("MediaError ").append(error).toString());
            Log.d("ErrorManager", (new StringBuilder()).append("checkForOpenDeviceFailureInStack : ").append(flag).toString());
        }
        if (error.getError() == 0xf0010004)
        {
            return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor("", context.getString(0x7f0c00e0), null, restartApp);
        }
        if (error.getError() == 0xf0010005 && flag)
        {
            error = context.getString(0x7f0c00e0);
            if (mConfig.getCurrentPlayerType() == PlayerType.device12 && mConfig.isCurrentDrmWidevine())
            {
                return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor("", error, null, restartApp);
            } else
            {
                return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor("", error, null, resetApp);
            }
        } else
        {
            return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor("", context.getString(0x7f0c00a7), null, exit);
        }
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getHandlerForNetworkError(NetworkError networkerror)
    {
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("NetworkError ").append(networkerror).toString());
        }
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor("", context.getString(0x7f0c010e), null, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getHandlerForNetworkingError(NccpNetworkingError nccpnetworkingerror)
    {
        if (Log.isLoggable("ErrorManager", 3))
        {
            Log.d("ErrorManager", (new StringBuilder()).append("NccpNetworkingError ").append(nccpnetworkingerror).toString());
        }
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor("", context.getString(0x7f0c00c3), null, exit);
    }

    private com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor getUknownErrorDescriptor(MediaEvent mediaevent, String s)
    {
        Log.w("ErrorManager", "Uknown error");
        return new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(s, context.getString(0x7f0c007f), null, exit);
    }

    private Runnable handle(final MediaEvent pe)
    {
        Log.d("ErrorManager", (new StringBuilder()).append("Handle error ").append(pe).toString());
        return new Runnable() {

            final ErrorManager this$0;
            final MediaEvent val$pe;

            public void run()
            {
                handleError(pe);
            }

            
            {
                this$0 = ErrorManager.this;
                pe = mediaevent;
                super();
            }
        };
    }

    private void handleError(MediaEvent mediaevent)
    {
        this;
        JVM INSTR monitorenter ;
        if (!destroyed) goto _L2; else goto _L1
_L1:
        Log.w("ErrorManager", "ErrorManager is already destroyed, ignoring...");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!handlePlayReadyRevocation(mediaevent))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        reportStartPlayEnded(RootCause.clientFailure, ActionOnUIError.handledSilently, null, null);
        Log.d("ErrorManager", "Playready certificate revocated, do not display error!");
          goto _L3
        mediaevent;
        throw mediaevent;
        com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor alertdialogdescriptor = getHandler(mediaevent);
        if (alertdialogdescriptor == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        reportStartPlayEnded(RootCause.clientFailure, ActionOnUIError.displayedError, alertdialogdescriptor.getMessage(), null);
        mediaevent = AlertDialogFactory.createDialog(context, handler, alertdialogdescriptor);
        if (mediaevent == null) goto _L3; else goto _L4
_L4:
        mediaevent.show();
        context.setErrorDialogId(context.reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.errorDialog));
          goto _L3
        Log.w("ErrorManager", (new StringBuilder()).append("We decided to ignore ").append(mediaevent).toString());
        errorPosted = false;
          goto _L3
    }

    private boolean handlePlayReadyRevocation(MediaEvent mediaevent)
    {
        if (!(mediaevent instanceof NccpActionId))
        {
            Log.d("ErrorManager", "Not action ID error");
            return false;
        }
        if ((long)((NccpActionId)mediaevent).getReasonCode() == 113L)
        {
            Log.e("ErrorManager", "Playready certificate revocated, we do not have backup player, report an error!");
            return false;
        } else
        {
            Log.e("ErrorManager", "Regular error, handle as popup");
            return false;
        }
    }

    private void reportStartPlayEnded(RootCause rootcause, ActionOnUIError actiononuierror, String s, Integer integer)
    {
        if (context.getState().playStartInProgress.getAndSet(false))
        {
            rootcause = new UIError(rootcause, actiononuierror, s, null);
            LogUtils.reportPlayActionEnded(context, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, rootcause, integer);
        }
    }

    private void unmuteAudio()
    {
        AudioManager audiomanager = (AudioManager)context.getSystemService("audio");
        if (audiomanager != null)
        {
            audiomanager.setStreamMute(3, false);
            Log.d("ErrorManager", "UN-MUTED");
        }
    }

    public boolean addError(NccpError nccperror)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (!destroyed) goto _L2; else goto _L1
_L1:
        Log.w("ErrorManager", "ErrorManager is already destroyed, ignoring...");
        flag = false;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!errorPosted)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        Log.w("ErrorManager", "ErrorManager already posted an error message, ignoring...");
          goto _L3
        nccperror;
        throw nccperror;
        errorPosted = true;
        reportedError = nccperror;
        handler.post(handle(nccperror));
          goto _L3
    }

    public boolean addMediaError(Error error)
    {
        this;
        JVM INSTR monitorenter ;
        if (!destroyed)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        Log.w("ErrorManager", "ErrorManager is already destroyed, ignoring...");
        this;
        JVM INSTR monitorexit ;
        return false;
        if (!errorPosted)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        Log.w("ErrorManager", "ErrorManager already posted an error message, ignoring...");
        this;
        JVM INSTR monitorexit ;
        return true;
        error;
        this;
        JVM INSTR monitorexit ;
        throw error;
        errorPosted = true;
        reportedError = error;
        handler.post(handle(error));
        this;
        JVM INSTR monitorexit ;
        return true;
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        destroyed = true;
        context = null;
        handler = null;
        exit = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void forceStop()
    {
        this;
        JVM INSTR monitorenter ;
        unmuteAudio();
        int i = Process.myPid();
        Log.d("ErrorManager", (new StringBuilder()).append("Destroying app proces ").append(i).append("...").toString());
        Process.killProcess(i);
        Log.d("ErrorManager", (new StringBuilder()).append("Destroying app proces ").append(i).append(" done.").toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public MediaEvent getReportedError()
    {
        return reportedError;
    }

    public final boolean isErrorReported()
    {
        return errorPosted;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        errorPosted = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        US_LOCALE = Locale.US;
    }



}
