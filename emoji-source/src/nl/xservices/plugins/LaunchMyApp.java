// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package nl.xservices.plugins;

import android.content.Intent;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class LaunchMyApp extends CordovaPlugin
{

    private static final String ACTION_CHECKINTENT = "checkIntent";

    public LaunchMyApp()
    {
    }

    private static void escapeJavaStyleString(Writer writer, String s, boolean flag, boolean flag1)
        throws IOException
    {
        if (writer == null)
        {
            throw new IllegalArgumentException("The Writer must not be null");
        }
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        j = s.length();
        i = 0;
_L3:
        char c;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        c = s.charAt(i);
        if (c > '\u0FFF')
        {
            writer.write((new StringBuilder()).append("\\u").append(hex(c)).toString());
        } else
        if (c > '\377')
        {
            writer.write((new StringBuilder()).append("\\u0").append(hex(c)).toString());
        } else
        {
label0:
            {
                if (c <= '\177')
                {
                    break label0;
                }
                writer.write((new StringBuilder()).append("\\u00").append(hex(c)).toString());
            }
        }
_L5:
        i++;
          goto _L3
        continue; /* Loop/switch isn't completed */
        if (c < ' ')
        {
            switch (c)
            {
            case 11: // '\013'
            default:
                if (c > '\017')
                {
                    writer.write((new StringBuilder()).append("\\u00").append(hex(c)).toString());
                } else
                {
                    writer.write((new StringBuilder()).append("\\u000").append(hex(c)).toString());
                }
                break;

            case 8: // '\b'
                writer.write(92);
                writer.write(98);
                break;

            case 10: // '\n'
                writer.write(92);
                writer.write(110);
                break;

            case 9: // '\t'
                writer.write(92);
                writer.write(116);
                break;

            case 12: // '\f'
                writer.write(92);
                writer.write(102);
                break;

            case 13: // '\r'
                writer.write(92);
                writer.write(114);
                break;
            }
        } else
        {
            switch (c)
            {
            default:
                writer.write(c);
                break;

            case 39: // '\''
                if (flag)
                {
                    writer.write(92);
                }
                writer.write(39);
                break;

            case 34: // '"'
                writer.write(92);
                writer.write(34);
                break;

            case 92: // '\\'
                writer.write(92);
                writer.write(92);
                break;

            case 47: // '/'
                if (flag1)
                {
                    writer.write(92);
                }
                writer.write(47);
                break;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L1; else goto _L6
_L6:
    }

    private static String hex(char c)
    {
        return Integer.toHexString(c).toUpperCase(Locale.ENGLISH);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if ("checkIntent".equalsIgnoreCase(s))
        {
            s = ((CordovaActivity)webView.getContext()).getIntent();
            if (s.getDataString() != null)
            {
                callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, s.getDataString()));
                s.setData(null);
                return true;
            } else
            {
                callbackcontext.error("App was not started via the launchmyapp URL scheme. Ignoring this errorcallback is the best approach.");
                return false;
            }
        } else
        {
            callbackcontext.error("This plugin only responds to the checkIntent action.");
            return false;
        }
    }

    public void onNewIntent(Intent intent)
    {
        String s;
        s = intent.getDataString();
        if (s == null || !s.contains("://"))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        intent.setData(null);
        intent = new StringWriter(s.length() * 2);
        escapeJavaStyleString(intent, s, true, false);
        webView.loadUrl((new StringBuilder()).append("javascript:handleOpenURL('").append(intent.toString()).append("');").toString());
        return;
        intent;
    }
}
