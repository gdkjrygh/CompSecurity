// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.Event;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.logging.uiaction.AcknowledgeSignupSession;
import com.netflix.mediaclient.service.logging.uiaction.AddToPlaylistSession;
import com.netflix.mediaclient.service.logging.uiaction.LoginSession;
import com.netflix.mediaclient.service.logging.uiaction.NavigationSession;
import com.netflix.mediaclient.service.logging.uiaction.RateTitleSession;
import com.netflix.mediaclient.service.logging.uiaction.RegisterSession;
import com.netflix.mediaclient.service.logging.uiaction.RemoveFromPlaylistSession;
import com.netflix.mediaclient.service.logging.uiaction.SearchSession;
import com.netflix.mediaclient.service.logging.uiaction.StartPlaySession;
import com.netflix.mediaclient.service.logging.uiaction.SubmitPaymentSession;
import com.netflix.mediaclient.service.logging.uiaction.UpgradeStreamsSession;
import com.netflix.mediaclient.servicemgr.UserActionLogging;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            EventHandler

final class UserActionLoggingImpl
    implements UserActionLogging
{

    private static final String TAG = "nf_log";
    private AcknowledgeSignupSession mAcknowledgeSignup;
    private AddToPlaylistSession mAddToPlaylistSession;
    private DataContext mDataContext;
    private EventHandler mEventHandler;
    private LoginSession mLoginSession;
    private NavigationSession mNavigationSession;
    private RateTitleSession mRateTitleSession;
    private RegisterSession mRegisterSession;
    private RemoveFromPlaylistSession mRemoveFromPlaylistSession;
    private Map mSearchSessions;
    private StartPlaySession mStartPlaySession;
    private SubmitPaymentSession mSubmitPaymentSession;
    private UpgradeStreamsSession mUpgradeStreamsSession;

    UserActionLoggingImpl(EventHandler eventhandler)
    {
        mSearchSessions = new ConcurrentHashMap(5);
        mEventHandler = eventhandler;
    }

    private void handleAcknowledgeSignupEnded(Intent intent)
    {
        Object obj;
        String s;
        String s1;
        s1 = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        s = intent.getStringExtra("view");
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview = null;
        if (StringUtils.isNotEmpty(s1))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s1);
        }
        if (StringUtils.isNotEmpty(s))
        {
            modalview = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        endAcknowledgeSignupSession(completionreason, intent, modalview);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleAcknowledgeSignupStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startAcknowledgeSignupSession(commandname, intent);
    }

    private void handleAddToPlaylistEnded(Intent intent)
    {
        Object obj;
        String s;
        int i;
        s = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        i = intent.getIntExtra("title_rank", 0);
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        endAddToPlaylistSession(completionreason, intent, i);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleAddToPlaylistStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startAddToPlaylistSession(commandname, intent);
    }

    private void handleLoginEnded(Intent intent)
    {
        Object obj;
        String s;
        s = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        endLoginSession(completionreason, intent);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleLoginStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startLoginSession(commandname, intent);
    }

    private void handleNavigationEnded(Intent intent)
    {
        UIError uierror;
        Object obj;
        String s;
        s = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        uierror = null;
        String s1 = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s1))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s1);
        }
        obj = UIError.createInstance(((String) (obj)));
        uierror = ((UIError) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        endNavigationSession(intent, completionreason, uierror);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleNavigationStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startNavigationSession(commandname, intent);
    }

    private void handleRateTitleEnded(Intent intent)
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        obj1 = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        i = intent.getIntExtra("rating", 0);
        j = intent.getIntExtra("rank", 0x80000000);
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(((String) (obj1))))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(((String) (obj1)));
        }
        if (j == 0x80000000)
        {
            obj1 = null;
        } else
        {
            obj1 = Integer.valueOf(j);
        }
        endRateTitleSession(completionreason, intent, ((Integer) (obj1)), i);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleRateTitleStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startRateTitleSession(commandname, intent);
    }

    private void handleRegisterEnded(Intent intent)
    {
        Object obj;
        String s;
        s = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        endRegisterSession(completionreason, intent);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleRegisterStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startRegisterSession(commandname, intent);
    }

    private void handleRemoveFromPlaylistEnded(Intent intent)
    {
        Object obj;
        String s;
        s = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        endRemoveFromPlaylistSession(completionreason, intent);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleRemoveFromPlaylistStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startRemoveFromPlaylistSession(commandname, intent);
    }

    private void handleSearchEnded(Intent intent)
    {
        Object obj;
        String s;
        long l;
        s = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        l = intent.getLongExtra("id", -1L);
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        endSearchSession(l, completionreason, intent);
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleSearchStart(Intent intent)
    {
        Object obj = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(((String) (obj))))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(((String) (obj)));
        }
        String s = intent.getStringExtra("term");
        String s1 = intent.getStringExtra("view");
        obj = null;
        if (StringUtils.isNotEmpty(s1))
        {
            obj = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s1);
        }
        startSearchSession(intent.getLongExtra("id", -1L), commandname, ((com.netflix.mediaclient.servicemgr.IClientLogging.ModalView) (obj)), s);
    }

    private void handleStartPlayEnded(Intent intent)
    {
        Object obj;
        Object obj1;
        int i;
        obj1 = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        i = intent.getIntExtra("rank", 0x80000000);
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(((String) (obj1))))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(((String) (obj1)));
        }
        if (i == 0x80000000)
        {
            obj1 = null;
        } else
        {
            obj1 = Integer.valueOf(i);
        }
        endStartPlaySession(completionreason, intent, ((Integer) (obj1)));
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleStartPlayStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startStartPlaySession(commandname, intent);
    }

    private void handleSubmitPaymentEnded(Intent intent)
    {
        Object obj;
        Object obj1;
        String s;
        String s1;
        boolean flag;
        s = intent.getStringExtra("reason");
        flag = intent.getBooleanExtra("sucess", false);
        s1 = intent.getStringExtra("error_code");
        obj1 = intent.getStringExtra("payment_type");
        obj = intent.getStringExtra("error");
        intent = null;
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L1:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType paymenttype = null;
        if (!StringUtils.isEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        if (!StringUtils.isEmpty(((String) (obj1))))
        {
            paymenttype = com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType.valueOf(((String) (obj1)));
        }
        s = null;
        obj1 = s;
        JSONException jsonexception;
        if (StringUtils.isNotEmpty(s1))
        {
            try
            {
                obj1 = new JSONObject(s1);
            }
            catch (JSONException jsonexception1)
            {
                jsonexception1 = s;
            }
        }
        endSubmitPaymentSession(completionreason, intent, flag, paymenttype, ((JSONObject) (obj1)));
        return;
        jsonexception;
          goto _L1
    }

    private void handleSubmitPaymentStart(Intent intent)
    {
        String s = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(s))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(s);
        }
        s = intent.getStringExtra("view");
        intent = null;
        if (StringUtils.isNotEmpty(s))
        {
            intent = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        startSubmitPaymentSession(commandname, intent);
    }

    private void handleUpgradeStreamsEnded(Intent intent)
    {
        Object obj;
        String s;
        Object obj1;
        s = intent.getStringExtra("reason");
        obj = intent.getStringExtra("error");
        obj1 = intent.getStringExtra("streams");
        intent = null;
        obj1 = com.netflix.mediaclient.servicemgr.UserActionLogging.Streams.find(((String) (obj1)));
        obj = UIError.createInstance(((String) (obj)));
        intent = ((Intent) (obj));
_L2:
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason = null;
        if (StringUtils.isNotEmpty(s))
        {
            completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(s);
        }
        endUpgradeStreamsSession(completionreason, intent, ((com.netflix.mediaclient.servicemgr.UserActionLogging.Streams) (obj1)));
        return;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleUpgradeStreamsStart(Intent intent)
    {
        Object obj = intent.getStringExtra("cmd");
        com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname = null;
        if (!StringUtils.isEmpty(((String) (obj))))
        {
            commandname = com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName.valueOf(((String) (obj)));
        }
        String s = intent.getStringExtra("view");
        obj = null;
        if (StringUtils.isNotEmpty(s))
        {
            obj = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
        }
        s = null;
        String s1 = intent.getStringExtra("streams");
        intent = s;
        if (StringUtils.isNotEmpty(s1))
        {
            intent = com.netflix.mediaclient.servicemgr.UserActionLogging.Streams.find(s1);
        }
        startUpgradeStreamsSession(commandname, ((com.netflix.mediaclient.servicemgr.IClientLogging.ModalView) (obj)), intent);
    }

    private void populateEvent(Event event, DataContext datacontext, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (event == null)
        {
            return;
        } else
        {
            event.setDataContext(datacontext);
            event.setModalView(modalview);
            return;
        }
    }

    public void endAcknowledgeSignupSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error, final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView dest)
    {
        Log.d("nf_log", "AcknowledgeSignup session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$dest;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;

            public void run()
            {
                Log.d("nf_log", "User session ended");
                if (mAcknowledgeSignup == null)
                {
                    Log.w("nf_log", "AcknowledgeSignup session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.AcknowledgeSignupEndedEvent acknowledgesignupendedevent = mAcknowledgeSignup.createEndedEvent(reason, error, dest);
                if (acknowledgesignupendedevent == null)
                {
                    Log.d("nf_log", "AcknowledgeSignup session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(acknowledgesignupendedevent, dataContext, dest);
                    mEventHandler.removeSession(mAcknowledgeSignup);
                    Log.d("nf_log", "AcknowledgeSignup session end event posting...");
                    mEventHandler.post(acknowledgesignupendedevent);
                    mAcknowledgeSignup = null;
                    Log.d("nf_log", "AcknowledgeSignup session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                dest = modalview;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "AcknowledgeSignup session end done.");
    }

    public void endAddToPlaylistSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error, final int titleRank)
    {
        Log.d("nf_log", "AddToPlaylist session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;
            final int val$titleRank;

            public void run()
            {
                Log.d("nf_log", "AddToPlaylist session ended");
                if (mAddToPlaylistSession == null)
                {
                    Log.w("nf_log", "AddToPlaylist session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.AddToPlaylistEndedEvent addtoplaylistendedevent = mAddToPlaylistSession.createEndedEvent(reason, error, titleRank);
                if (addtoplaylistendedevent == null)
                {
                    Log.d("nf_log", "AddToPlaylist session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(addtoplaylistendedevent, dataContext, mAddToPlaylistSession.getView());
                    mEventHandler.removeSession(mAddToPlaylistSession);
                    Log.d("nf_log", "AddToPlaylist session end event posting...");
                    mEventHandler.post(addtoplaylistendedevent);
                    mAddToPlaylistSession = null;
                    Log.d("nf_log", "AddToPlaylist session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                titleRank = i;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "AddToPlaylist session end done.");
    }

    public void endLoginSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error)
    {
        Log.d("nf_log", "Login session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;

            public void run()
            {
                Log.d("nf_log", "Login session ended");
                if (mLoginSession == null)
                {
                    Log.w("nf_log", "Login session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.LoginEndedEvent loginendedevent = mLoginSession.createEndedEvent(reason, error);
                if (loginendedevent == null)
                {
                    Log.d("nf_log", "Login session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(loginendedevent, dataContext, mLoginSession.getView());
                    mEventHandler.removeSession(mLoginSession);
                    Log.d("nf_log", "Login session end event posting...");
                    mEventHandler.post(loginendedevent);
                    mLoginSession = null;
                    Log.d("nf_log", "Login session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "Login session end done.");
    }

    public void endNavigationSession(final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView view, final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error)
    {
        Log.d("nf_log", "Navigation session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$view;

            public void run()
            {
                Log.d("nf_log", "Navigation session ended");
                NavigationSession navigationsession = mNavigationSession;
                if (navigationsession == null)
                {
                    Log.w("nf_log", "Navigation session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.NavigationEndedEvent navigationendedevent = navigationsession.createEndedEvent(view, reason, error);
                if (navigationendedevent == null)
                {
                    Log.d("nf_log", "We stayed in same view, cancel session.");
                } else
                {
                    Log.d("nf_log", "Navigation session end event posting...");
                    populateEvent(navigationendedevent, dataContext, mNavigationSession.getView());
                    mEventHandler.post(navigationendedevent);
                    Log.d("nf_log", "Navigation session end event posted.");
                }
                mEventHandler.removeSession(navigationsession);
                mNavigationSession = null;
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                view = modalview;
                reason = completionreason;
                error = uierror;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "Navigation session end done.");
    }

    public void endRateTitleSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error, final Integer rank, final int rating)
    {
        Log.d("nf_log", "RateTitle session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final Integer val$rank;
            final int val$rating;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;

            public void run()
            {
                Log.d("nf_log", "RateTitle  session ended");
                if (mRateTitleSession == null)
                {
                    Log.w("nf_log", "RateTitle session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.RateTitleEndedEvent ratetitleendedevent = mRateTitleSession.createEndedEvent(reason, error, rank, rating);
                if (ratetitleendedevent == null)
                {
                    Log.d("nf_log", "RateTitle  session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(ratetitleendedevent, dataContext, mRateTitleSession.getView());
                    mEventHandler.removeSession(mRateTitleSession);
                    Log.d("nf_log", "RateTitle session end event posting...");
                    mEventHandler.post(ratetitleendedevent);
                    mRateTitleSession = null;
                    Log.d("nf_log", "RateTitle session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                rank = integer;
                rating = i;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "RateTitle session end done.");
    }

    public void endRegisterSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error)
    {
        Log.d("nf_log", "Register session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;

            public void run()
            {
                Log.d("nf_log", "Register session ended");
                if (mRegisterSession == null)
                {
                    Log.w("nf_log", "Register session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.RegisterEndedEvent registerendedevent = mRegisterSession.createEndedEvent(reason, error);
                if (registerendedevent == null)
                {
                    Log.d("nf_log", "Register session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(registerendedevent, dataContext, mRegisterSession.getView());
                    mEventHandler.removeSession(mRegisterSession);
                    Log.d("nf_log", "Register session end event posting...");
                    mEventHandler.post(registerendedevent);
                    mRegisterSession = null;
                    Log.d("nf_log", "Register session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "Register session end done.");
    }

    public void endRemoveFromPlaylistSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error)
    {
        Log.d("nf_log", "RemoveFromPlaylist session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;

            public void run()
            {
                Log.d("nf_log", "RemoveFromPlaylist session ended");
                if (mRemoveFromPlaylistSession == null)
                {
                    Log.w("nf_log", "RemoveFromPlaylist session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.RemoveFromPlaylistEndedEvent removefromplaylistendedevent = mRemoveFromPlaylistSession.createEndedEvent(reason, error);
                if (removefromplaylistendedevent == null)
                {
                    Log.d("nf_log", "RemoveFromPlaylist session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(removefromplaylistendedevent, dataContext, mRemoveFromPlaylistSession.getView());
                    mEventHandler.removeSession(mRemoveFromPlaylistSession);
                    Log.d("nf_log", "RemoveFromPlaylist session end event posting...");
                    mEventHandler.post(removefromplaylistendedevent);
                    mRemoveFromPlaylistSession = null;
                    Log.d("nf_log", "RemoveFromPlaylist session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "RemoveFromPlaylist session end done.");
    }

    public void endSearchSession(final long requestId, final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error)
    {
        Log.d("nf_log", "Search session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;
            final long val$requestId;

            public void run()
            {
                Log.d("nf_log", "Search session ended");
                SearchSession searchsession = (SearchSession)mSearchSessions.get(Long.valueOf(requestId));
                if (searchsession == null)
                {
                    Log.w("nf_log", (new StringBuilder()).append("Search session does NOT exist for ").append(requestId).toString());
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.SearchEndedEvent searchendedevent = searchsession.createEndedEvent(reason, error);
                if (searchendedevent == null)
                {
                    Log.d("nf_log", "Search session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(searchendedevent, dataContext, searchsession.getView());
                    mEventHandler.removeSession(searchsession);
                    Log.d("nf_log", "Search session end event posting...");
                    mEventHandler.post(searchendedevent);
                    Log.d("nf_log", "Search session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                requestId = l;
                reason = completionreason;
                error = uierror;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "Search session end done.");
    }

    public void endStartPlaySession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error, final Integer rank)
    {
        Log.d("nf_log", "StartPlay session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final Integer val$rank;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;

            public void run()
            {
                Log.d("nf_log", "StartPlay session ended");
                if (mStartPlaySession == null)
                {
                    Log.w("nf_log", "StartPlay session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.StartPlayEndedEvent startplayendedevent = mStartPlaySession.createEndedEvent(reason, error, rank);
                if (startplayendedevent == null)
                {
                    Log.d("nf_log", "StartPlay session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(startplayendedevent, dataContext, mStartPlaySession.getView());
                    mEventHandler.removeSession(mStartPlaySession);
                    Log.d("nf_log", "StartPlay session end event posting...");
                    mEventHandler.post(startplayendedevent);
                    mStartPlaySession = null;
                    Log.d("nf_log", "StartPlay session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                rank = integer;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "StartPlay session end done.");
    }

    public void endSubmitPaymentSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error, final boolean success, final com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType paymentType, final JSONObject errorCode)
    {
        Log.d("nf_log", "SubmitPayment session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final JSONObject val$errorCode;
            final com.netflix.mediaclient.servicemgr.UserActionLogging.PaymentType val$paymentType;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;
            final boolean val$success;

            public void run()
            {
                Log.d("nf_log", "SubmitPayment session ended");
                if (mSubmitPaymentSession == null)
                {
                    Log.w("nf_log", "SubmitPayment session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.SubmitPaymentEndedEvent submitpaymentendedevent = mSubmitPaymentSession.createEndedEvent(reason, error, success, paymentType, errorCode);
                if (submitpaymentendedevent == null)
                {
                    Log.d("nf_log", "SubmitPayment session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(submitpaymentendedevent, dataContext, mSubmitPaymentSession.getView());
                    mEventHandler.removeSession(mSubmitPaymentSession);
                    Log.d("nf_log", "SubmitPayment session end event posting...");
                    mEventHandler.post(submitpaymentendedevent);
                    mSubmitPaymentSession = null;
                    Log.d("nf_log", "SubmitPayment session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                success = flag;
                paymentType = paymenttype;
                errorCode = jsonobject;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "SubmitPayment session end done.");
    }

    public void endUpgradeStreamsSession(final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason reason, final UIError error, final com.netflix.mediaclient.servicemgr.UserActionLogging.Streams endStreams)
    {
        Log.d("nf_log", "UpgradeStreams session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        mEventHandler.executeInBackground(new Runnable() {

            final UserActionLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.UserActionLogging.Streams val$endStreams;
            final UIError val$error;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$reason;

            public void run()
            {
                Log.d("nf_log", "UpgradeStreams session ended");
                if (mUpgradeStreamsSession == null)
                {
                    Log.w("nf_log", "UpgradeStreams session does NOT exist!");
                    return;
                }
                com.netflix.mediaclient.service.logging.uiaction.model.UpgradeStreamsEndedEvent upgradestreamsendedevent = mUpgradeStreamsSession.createEndedEvent(reason, error, endStreams);
                if (upgradestreamsendedevent == null)
                {
                    Log.d("nf_log", "User session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    populateEvent(upgradestreamsendedevent, dataContext, mUpgradeStreamsSession.getView());
                    mEventHandler.removeSession(mUpgradeStreamsSession);
                    Log.d("nf_log", "UpgradeStreams session end event posting...");
                    mEventHandler.post(upgradestreamsendedevent);
                    mUpgradeStreamsSession = null;
                    Log.d("nf_log", "UpgradeStreams session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = UserActionLoggingImpl.this;
                reason = completionreason;
                error = uierror;
                endStreams = streams;
                dataContext = datacontext;
                super();
            }
        });
        Log.d("nf_log", "UpgradeStreams session end done.");
    }

    public boolean handleIntent(Intent intent, boolean flag)
    {
        String s = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_START".equals(s))
        {
            Log.d("nf_log", "ADD_TO_PLAYLIST_START");
            handleAddToPlaylistStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_ENDED".equals(s))
        {
            Log.d("nf_log", "ADD_TO_PLAYLIST_ENDED");
            handleAddToPlaylistEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_START".equals(s))
        {
            Log.d("nf_log", "LOGIN_START");
            handleLoginStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_ENDED".equals(s))
        {
            Log.d("nf_log", "LOGIN_ENDED");
            handleLoginEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_SIGNUP_START".equals(s))
        {
            Log.d("nf_log", "SIGNUP_START");
            handleAcknowledgeSignupStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_SIGNUP_ENDED".equals(s))
        {
            Log.d("nf_log", "SIGNUP_ENDED");
            handleAcknowledgeSignupEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_START".equals(s))
        {
            Log.d("nf_log", "NAVIGATION_START");
            handleNavigationStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_ENDED".equals(s))
        {
            Log.d("nf_log", "NAVIGATION_ENDED");
            handleNavigationEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_START".equals(s))
        {
            Log.d("nf_log", "RATE_TITLE_START");
            handleRateTitleStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_ENDED".equals(s))
        {
            Log.d("nf_log", "RATE_TITLE_ENDED");
            handleRateTitleEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_REGISTER_START".equals(s))
        {
            Log.d("nf_log", "REGISTER_START");
            handleRegisterStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_REGISTER_ENDED".equals(s))
        {
            Log.d("nf_log", "REGISTER_ENDED");
            handleRegisterEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_START".equals(s))
        {
            Log.d("nf_log", "REMOVE_FROM_PLAYLIST_START");
            handleRemoveFromPlaylistStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_ENDED".equals(s))
        {
            Log.d("nf_log", "REMOVE_FROM_PLAYLIST_ENDED");
            handleRemoveFromPlaylistEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_START".equals(s))
        {
            Log.d("nf_log", "SEARCH_START");
            handleSearchStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_ENDED".equals(s))
        {
            Log.d("nf_log", "SEARCH_ENDED");
            handleSearchEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_START".equals(s))
        {
            Log.d("nf_log", "START_PLAY_START");
            handleStartPlayStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_ENDED".equals(s))
        {
            Log.d("nf_log", "START_PLAY_ENDED");
            handleStartPlayEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_SUBMIT_PAYMENT_START".equals(s))
        {
            Log.d("nf_log", "SUBMIT_PAYMENT_START");
            handleSubmitPaymentStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_SUBMIT_PAYMENT_ENDED".equals(s))
        {
            Log.d("nf_log", "SUBMIT_PAYMENT_ENDED");
            handleSubmitPaymentEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_UPGRADE_STREAMS_START".equals(s))
        {
            Log.d("nf_log", "UPGRADE_STREAMS_START");
            handleUpgradeStreamsStart(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_UIA_UPGRADE_STREAMS_ENDED".equals(s))
        {
            Log.d("nf_log", "UPGRADE_STREAMS_ENDED");
            handleUpgradeStreamsEnded(intent);
            return true;
        }
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("We do not support action ").append(s).toString());
        }
        return false;
    }

    public void setDataContext(DataContext datacontext)
    {
        mDataContext = datacontext;
    }

    public void startAcknowledgeSignupSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mAcknowledgeSignup != null)
        {
            Log.e("nf_log", "AcknowledgeSignup session already started!");
            return;
        } else
        {
            Log.d("nf_log", "AcknowledgeSignup session starting...");
            commandname = new AcknowledgeSignupSession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mAcknowledgeSignup = commandname;
            Log.d("nf_log", "AcknowledgeSignup session start done.");
            return;
        }
    }

    public void startAddToPlaylistSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mAddToPlaylistSession != null)
        {
            Log.e("nf_log", "AddToPlaylist session already started!");
            return;
        } else
        {
            Log.d("nf_log", "AddToPlaylist session starting...");
            commandname = new AddToPlaylistSession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mAddToPlaylistSession = commandname;
            Log.d("nf_log", "AddToPlaylist session start done.");
            return;
        }
    }

    public void startLoginSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mLoginSession != null)
        {
            Log.e("nf_log", "Login session already started!");
            return;
        } else
        {
            Log.d("nf_log", "Login session starting...");
            commandname = new LoginSession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mLoginSession = commandname;
            Log.d("nf_log", "Login session start done.");
            return;
        }
    }

    public void startNavigationSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mNavigationSession != null)
        {
            Log.d("nf_log", "Navigation session existed before, overwrite");
            mEventHandler.removeSession(mNavigationSession);
        } else
        {
            Log.d("nf_log", "Navigation session starting...");
        }
        commandname = new NavigationSession(commandname, modalview);
        mEventHandler.addSession(commandname);
        mNavigationSession = commandname;
        Log.d("nf_log", "Navigation session start done.");
    }

    public void startRateTitleSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mRateTitleSession != null)
        {
            Log.e("nf_log", "RateTitle session already started!");
            return;
        } else
        {
            Log.d("nf_log", "RateTitle session starting...");
            commandname = new RateTitleSession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mRateTitleSession = commandname;
            Log.d("nf_log", "RateTitle session start done.");
            return;
        }
    }

    public void startRegisterSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mRegisterSession != null)
        {
            Log.e("nf_log", "Register session already started!");
            return;
        } else
        {
            Log.d("nf_log", "Register session starting...");
            commandname = new RegisterSession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mRegisterSession = commandname;
            Log.d("nf_log", "Register session start done.");
            return;
        }
    }

    public void startRemoveFromPlaylistSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mRemoveFromPlaylistSession != null)
        {
            Log.e("nf_log", "RemoveFromPlaylist session already started!");
            return;
        } else
        {
            Log.d("nf_log", "RemoveFromPlaylist session starting...");
            commandname = new RemoveFromPlaylistSession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mRemoveFromPlaylistSession = commandname;
            Log.d("nf_log", "RemoveFromPlaylist session start done.");
            return;
        }
    }

    public void startSearchSession(long l, com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, String s)
    {
        Log.d("nf_log", "Search session starting...");
        commandname = new SearchSession(l, commandname, modalview, s);
        mEventHandler.addSession(commandname);
        mSearchSessions.put(Long.valueOf(l), commandname);
        Log.d("nf_log", "Search session start done.");
    }

    public void startStartPlaySession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mStartPlaySession != null)
        {
            Log.e("nf_log", "StartPlay session already started!");
            return;
        } else
        {
            Log.d("nf_log", "StartPlay session starting...");
            commandname = new StartPlaySession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mStartPlaySession = commandname;
            Log.d("nf_log", "StartPlay session start done.");
            return;
        }
    }

    public void startSubmitPaymentSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (mSubmitPaymentSession != null)
        {
            Log.e("nf_log", "SubmitPayment session already started!");
            return;
        } else
        {
            Log.d("nf_log", "SubmitPayment session starting...");
            commandname = new SubmitPaymentSession(commandname, modalview);
            mEventHandler.addSession(commandname);
            mSubmitPaymentSession = commandname;
            Log.d("nf_log", "SubmitPayment session start done.");
            return;
        }
    }

    public void startUpgradeStreamsSession(com.netflix.mediaclient.servicemgr.UserActionLogging.CommandName commandname, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, com.netflix.mediaclient.servicemgr.UserActionLogging.Streams streams)
    {
        if (mUpgradeStreamsSession != null)
        {
            Log.e("nf_log", "UpgradeStreams session already started!");
            return;
        } else
        {
            Log.d("nf_log", "UpgradeStreams session starting...");
            commandname = new UpgradeStreamsSession(commandname, modalview, streams);
            mEventHandler.addSession(commandname);
            mUpgradeStreamsSession = commandname;
            Log.d("nf_log", "UpgradeStreams session start done.");
            return;
        }
    }



/*
    static AcknowledgeSignupSession access$002(UserActionLoggingImpl useractionloggingimpl, AcknowledgeSignupSession acknowledgesignupsession)
    {
        useractionloggingimpl.mAcknowledgeSignup = acknowledgesignupsession;
        return acknowledgesignupsession;
    }

*/




/*
    static StartPlaySession access$1002(UserActionLoggingImpl useractionloggingimpl, StartPlaySession startplaysession)
    {
        useractionloggingimpl.mStartPlaySession = startplaysession;
        return startplaysession;
    }

*/



/*
    static SubmitPaymentSession access$1102(UserActionLoggingImpl useractionloggingimpl, SubmitPaymentSession submitpaymentsession)
    {
        useractionloggingimpl.mSubmitPaymentSession = submitpaymentsession;
        return submitpaymentsession;
    }

*/



/*
    static UpgradeStreamsSession access$1202(UserActionLoggingImpl useractionloggingimpl, UpgradeStreamsSession upgradestreamssession)
    {
        useractionloggingimpl.mUpgradeStreamsSession = upgradestreamssession;
        return upgradestreamssession;
    }

*/




/*
    static AddToPlaylistSession access$302(UserActionLoggingImpl useractionloggingimpl, AddToPlaylistSession addtoplaylistsession)
    {
        useractionloggingimpl.mAddToPlaylistSession = addtoplaylistsession;
        return addtoplaylistsession;
    }

*/



/*
    static LoginSession access$402(UserActionLoggingImpl useractionloggingimpl, LoginSession loginsession)
    {
        useractionloggingimpl.mLoginSession = loginsession;
        return loginsession;
    }

*/



/*
    static NavigationSession access$502(UserActionLoggingImpl useractionloggingimpl, NavigationSession navigationsession)
    {
        useractionloggingimpl.mNavigationSession = navigationsession;
        return navigationsession;
    }

*/



/*
    static RateTitleSession access$602(UserActionLoggingImpl useractionloggingimpl, RateTitleSession ratetitlesession)
    {
        useractionloggingimpl.mRateTitleSession = ratetitlesession;
        return ratetitlesession;
    }

*/



/*
    static RegisterSession access$702(UserActionLoggingImpl useractionloggingimpl, RegisterSession registersession)
    {
        useractionloggingimpl.mRegisterSession = registersession;
        return registersession;
    }

*/



/*
    static RemoveFromPlaylistSession access$802(UserActionLoggingImpl useractionloggingimpl, RemoveFromPlaylistSession removefromplaylistsession)
    {
        useractionloggingimpl.mRemoveFromPlaylistSession = removefromplaylistsession;
        return removefromplaylistsession;
    }

*/

}
