// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package nl.xservices.plugins;

import android.content.Intent;
import android.text.Html;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;

// Referenced classes of package nl.xservices.plugins:
//            SocialSharing

class cialSharingRunnable extends cialSharingRunnable
{

    final SocialSharing this$0;
    final JSONArray val$bcc;
    final JSONArray val$cc;
    final JSONArray val$files;
    final String val$message;
    final SocialSharing val$plugin;
    final String val$subject;
    final JSONArray val$to;

    public void run()
    {
        Intent intent;
        ArrayList arraylist;
        intent = new Intent("android.intent.action.SEND_MULTIPLE");
        String s;
        android.net.Uri uri;
        int i;
        if (SocialSharing.access$000(val$message))
        {
            if (Pattern.compile(".*\\<[^>]+>.*", 32).matcher(val$message).matches())
            {
                intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(val$message));
                intent.setType("text/html");
            } else
            {
                intent.putExtra("android.intent.extra.TEXT", val$message);
                intent.setType("text/plain");
            }
        }
        if (SocialSharing.access$000(val$subject))
        {
            intent.putExtra("android.intent.extra.SUBJECT", val$subject);
        }
        if (val$to != null && val$to.length() > 0)
        {
            intent.putExtra("android.intent.extra.EMAIL", SocialSharing.access$100(val$to));
        }
        if (val$cc != null && val$cc.length() > 0)
        {
            intent.putExtra("android.intent.extra.CC", SocialSharing.access$100(val$cc));
        }
        if (val$bcc != null && val$bcc.length() > 0)
        {
            intent.putExtra("android.intent.extra.BCC", SocialSharing.access$100(val$bcc));
        }
        if (val$files.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        arraylist = new ArrayList();
        s = SocialSharing.access$200(SocialSharing.this);
        i = 0;
_L2:
        if (i >= val$files.length())
        {
            break; /* Loop/switch isn't completed */
        }
        uri = SocialSharing.access$300(SocialSharing.this, intent, s, val$files.getString(i), val$subject, i);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        arraylist.add(uri);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            if (!arraylist.isEmpty())
            {
                intent.putExtra("android.intent.extra.STREAM", arraylist);
            }
        }
        catch (Exception exception)
        {
            callbackContext.error(exception.getMessage());
        }
        intent.setType("application/octet-stream");
        cordova.startActivityForResult(val$plugin, Intent.createChooser(intent, "Choose Email App"), 2);
        return;
    }

    cialSharingRunnable(SocialSharing socialsharing1)
    {
        this$0 = final_socialsharing;
        val$message = s;
        val$subject = s1;
        val$to = jsonarray;
        val$cc = jsonarray1;
        val$bcc = jsonarray2;
        val$files = JSONArray.this;
        val$plugin = socialsharing1;
        super(final_socialsharing, final_callbackcontext);
    }
}
