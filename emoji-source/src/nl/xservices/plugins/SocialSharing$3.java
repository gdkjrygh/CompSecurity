// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package nl.xservices.plugins;

import android.content.Intent;
import android.net.Uri;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package nl.xservices.plugins:
//            SocialSharing

class cialSharingRunnable extends cialSharingRunnable
{

    final SocialSharing this$0;
    final String val$image;
    final String val$message;
    final String val$phonenumbers;
    final SocialSharing val$plugin;
    final String val$subject;

    public void run()
    {
        if (android.os.K_INT < 19) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1 = new Intent("android.intent.action.SENDTO");
        StringBuilder stringbuilder = (new StringBuilder()).append("smsto:");
        if (SocialSharing.access$000(val$phonenumbers))
        {
            obj = val$phonenumbers;
        } else
        {
            obj = "";
        }
        ((Intent) (obj1)).setData(Uri.parse(stringbuilder.append(((String) (obj))).toString()));
        obj = obj1;
_L4:
        ((Intent) (obj)).putExtra("sms_body", val$message);
        ((Intent) (obj)).putExtra("sms_subject", val$subject);
        Intent intent;
        try
        {
            if (val$image == null || "".equals(val$image))
            {
                break MISSING_BLOCK_LABEL_142;
            }
            obj1 = SocialSharing.access$300(SocialSharing.this, ((Intent) (obj)), SocialSharing.access$200(SocialSharing.this), val$image, val$subject, 0);
        }
        catch (Exception exception)
        {
            callbackContext.error(exception.getMessage());
            return;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        ((Intent) (obj)).putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (obj1)));
        cordova.startActivityForResult(val$plugin, ((Intent) (obj)), 0);
        return;
_L2:
        intent = new Intent("android.intent.action.VIEW");
        intent.setType("vnd.android-dir/mms-sms");
        obj = intent;
        if (val$phonenumbers != null)
        {
            intent.putExtra("address", val$phonenumbers);
            obj = intent;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    cialSharingRunnable(SocialSharing socialsharing1)
    {
        this$0 = final_socialsharing;
        val$phonenumbers = s;
        val$message = s1;
        val$subject = s2;
        val$image = String.this;
        val$plugin = socialsharing1;
        super(final_socialsharing, final_callbackcontext);
    }
}
