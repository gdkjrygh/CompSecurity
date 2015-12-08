// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package nl.xservices.plugins;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

// Referenced classes of package nl.xservices.plugins:
//            SocialSharing

class cialSharingRunnable extends cialSharingRunnable
{

    final SocialSharing this$0;
    final String val$appPackageName;
    final JSONArray val$files;
    final String val$msg;
    final CordovaInterface val$mycordova;
    final boolean val$peek;
    final CordovaPlugin val$plugin;
    final String val$subject;
    final String val$url;

    public void run()
    {
        Object obj;
        String s;
        Object obj1;
        Intent intent;
        boolean flag;
        s = val$msg;
        String s2;
        int i;
        if (val$files.length() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = "android.intent.action.SEND_MULTIPLE";
        } else
        {
            obj = "android.intent.action.SEND";
        }
        intent = new Intent(((String) (obj)));
        intent.addFlags(0x80000);
        if (val$files.length() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = new ArrayList();
        s2 = SocialSharing.access$200(SocialSharing.this);
        obj = null;
        i = 0;
_L4:
        if (i >= val$files.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = SocialSharing.access$300(SocialSharing.this, intent, s2, val$files.getString(i), val$subject, i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        ((ArrayList) (obj1)).add(obj);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (((ArrayList) (obj1)).isEmpty()) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        try
        {
            intent.putExtra("android.intent.extra.STREAM", ((java.io.Serializable) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            callbackContext.error(((Exception) (obj)).getMessage());
        }
_L6:
        if (SocialSharing.access$000(val$subject))
        {
            intent.putExtra("android.intent.extra.SUBJECT", val$subject);
        }
        obj = s;
        if (SocialSharing.access$000(val$url))
        {
            if (SocialSharing.access$000(s))
            {
                obj = (new StringBuilder()).append(s).append(" ").append(val$url).toString();
            } else
            {
                obj = val$url;
            }
        }
        if (SocialSharing.access$000(((String) (obj))))
        {
            intent.putExtra("android.intent.extra.TEXT", ((String) (obj)));
            intent.putExtra("sms_body", ((String) (obj)));
        }
        if (val$appPackageName == null)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        obj1 = val$appPackageName;
        obj = null;
        s = ((String) (obj1));
        if (((String) (obj1)).contains("/"))
        {
            obj = val$appPackageName.split("/");
            s = obj[0];
            obj = obj[1];
        }
        obj1 = SocialSharing.access$400(SocialSharing.this, callbackContext, intent, s);
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        if (!val$peek) goto _L12; else goto _L11
_L11:
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.tus.OK));
_L10:
        return;
_L8:
        intent.putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj)));
          goto _L6
_L2:
        intent.setType("text/plain");
          goto _L6
_L12:
        intent.addCategory("android.intent.category.LAUNCHER");
        String s1 = ((ActivityInfo) (obj1)).applicationInfo.packageName;
        if (obj == null)
        {
            obj = ((ActivityInfo) (obj1)).name;
        }
        intent.setComponent(new ComponentName(s1, ((String) (obj))));
        val$mycordova.startActivityForResult(val$plugin, intent, 0);
        if (SocialSharing.access$500(SocialSharing.this) == null) goto _L10; else goto _L13
_L13:
        (new Timer()).schedule(new TimerTask() {

            final SocialSharing._cls2 this$1;

            public void run()
            {
                cordova.getActivity().runOnUiThread(new Runnable() {

                    final _cls1 this$2;

                    public void run()
                    {
                        SocialSharing.access$600(this$0, msg, SocialSharing.access$500(this$0));
                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$1 = SocialSharing._cls2.this;
                super();
            }
        }, 2000L);
        return;
        if (val$peek)
        {
            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.tus.OK));
            return;
        } else
        {
            val$mycordova.startActivityForResult(val$plugin, Intent.createChooser(intent, null), 1);
            return;
        }
    }

    _cls1.this._cls1(CordovaPlugin cordovaplugin)
    {
        this$0 = final_socialsharing;
        val$msg = s;
        val$files = jsonarray;
        val$subject = s1;
        val$url = s2;
        val$appPackageName = s3;
        val$peek = flag;
        val$mycordova = CordovaInterface.this;
        val$plugin = cordovaplugin;
        super(final_socialsharing, final_callbackcontext);
    }
}
