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

class this._cls1 extends TimerTask
{

    final is._cls0 this$1;

    public void run()
    {
        cordova.getActivity().runOnUiThread(new Runnable() {

            final SocialSharing._cls2._cls1 this$2;

            public void run()
            {
                SocialSharing.access$600(this$0, msg, SocialSharing.access$500(this$0));
            }

            
            {
                this$2 = SocialSharing._cls2._cls1.this;
                super();
            }
        });
    }

    alSharingRunnable()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class nl/xservices/plugins/SocialSharing$2

/* anonymous class */
    class SocialSharing._cls2 extends SocialSharing.SocialSharingRunnable
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
            s = msg;
            String s2;
            int i;
            if (files.length() > 1)
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
            if (files.length() <= 0) goto _L2; else goto _L1
_L1:
            obj1 = new ArrayList();
            s2 = SocialSharing.access$200(SocialSharing.this);
            obj = null;
            i = 0;
_L4:
            if (i >= files.length())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = SocialSharing.access$300(SocialSharing.this, intent, s2, files.getString(i), subject, i);
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
            if (SocialSharing.access$000(subject))
            {
                intent.putExtra("android.intent.extra.SUBJECT", subject);
            }
            obj = s;
            if (SocialSharing.access$000(url))
            {
                if (SocialSharing.access$000(s))
                {
                    obj = (new StringBuilder()).append(s).append(" ").append(url).toString();
                } else
                {
                    obj = url;
                }
            }
            if (SocialSharing.access$000(((String) (obj))))
            {
                intent.putExtra("android.intent.extra.TEXT", ((String) (obj)));
                intent.putExtra("sms_body", ((String) (obj)));
            }
            if (appPackageName == null)
            {
                break MISSING_BLOCK_LABEL_485;
            }
            obj1 = appPackageName;
            obj = null;
            s = ((String) (obj1));
            if (((String) (obj1)).contains("/"))
            {
                obj = appPackageName.split("/");
                s = obj[0];
                obj = obj[1];
            }
            obj1 = SocialSharing.access$400(SocialSharing.this, callbackContext, intent, s);
            if (obj1 == null) goto _L10; else goto _L9
_L9:
            if (!peek) goto _L12; else goto _L11
_L11:
            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK));
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
            mycordova.startActivityForResult(plugin, intent, 0);
            if (SocialSharing.access$500(SocialSharing.this) == null) goto _L10; else goto _L13
_L13:
            (new Timer()).schedule(new SocialSharing._cls2._cls1(), 2000L);
            return;
            if (peek)
            {
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK));
                return;
            } else
            {
                mycordova.startActivityForResult(plugin, Intent.createChooser(intent, null), 1);
                return;
            }
        }

            
            {
                this$0 = final_socialsharing;
                msg = s;
                files = jsonarray;
                subject = s1;
                url = s2;
                appPackageName = s3;
                peek = flag;
                mycordova = CordovaInterface.this;
                plugin = cordovaplugin;
                super(final_socialsharing, final_callbackcontext);
            }
    }

}
