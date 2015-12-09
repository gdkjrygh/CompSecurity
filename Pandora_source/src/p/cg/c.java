// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cg;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pandora.android.provider.b;
import com.pandora.radio.data.af;
import com.pandora.radio.data.f;
import java.net.URLDecoder;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p.df.a;

// Referenced classes of package p.cg:
//            a

public class c extends WebViewClient
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cg/c$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("sendDataToAcc", 0);
            b = new a("sendDataToApp", 1);
            c = new a("requestInfo", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    private static class b
    {

        a a;
        byte b[];

        boolean a()
        {
            return a != null && b != null;
        }

        b(String s)
        {
            s = p.cg.c.a().matcher(s);
            if (s.matches() && s.groupCount() == 4)
            {
                try
                {
                    a = a.valueOf(s.group(3));
                }
                catch (Exception exception) { }
                if (s.group(4) != null)
                {
                    b = p.bn.a.a(URLDecoder.decode(s.group(4)));
                }
            }
        }
    }


    private static final Pattern a = Pattern.compile("(.+)://(\\d+)/([^?]+)\\?data=(.+)?");
    private p.cg.a b;

    public c(p.cg.a a1)
    {
        b = a1;
    }

    static Pattern a()
    {
        return a;
    }

    private void a(JSONObject jsonobject, String s, Object obj)
    {
        try
        {
            jsonobject.put(s, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            p.df.a.b("WebViewBridgeClient", (new StringBuilder()).append("Error encountered while populating JSON object for key: ").append(s).append(" with value: ").append(obj).toString(), jsonobject);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!s.toLowerCase(Locale.US).startsWith("bridge:") || !a.matcher(s).matches()) goto _L2; else goto _L1
_L1:
        webview = new b(s);
        if (!webview.a()) goto _L4; else goto _L3
_L3:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[p.cg.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cg.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.cg._cls1.a[((b) (webview)).a.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 82
    //                   2 96
    //                   3 110;
           goto _L5 _L6 _L7 _L8
_L5:
        return true;
_L6:
        b.b(((b) (webview)).b);
        continue; /* Loop/switch isn't completed */
_L7:
        b.a(((b) (webview)).b);
        continue; /* Loop/switch isn't completed */
_L8:
        webview = new String(((b) (webview)).b);
        s = com.pandora.android.provider.b.a;
        Object obj = s.b().l().g();
        String s1 = s.d().c();
        JSONObject jsonobject = new JSONObject();
        if (obj != null)
        {
            for (obj = ((Hashtable) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                try
                {
                    jsonobject.put(String.valueOf(entry.getKey()), entry.getValue());
                }
                catch (JSONException jsonexception)
                {
                    p.df.a.c("WebViewBridgeClient", "Error encounterd while processing device properties", jsonexception);
                }
            }

        }
        a(jsonobject, "username", s1);
        a(jsonobject, "version", (new StringBuilder()).append(s.i()).append(" ").append(s.k()).toString());
        a(jsonobject, "os", "Android");
        a(jsonobject, "model", (new StringBuilder()).append(Build.MODEL).append(" - ").append(f.j()).toString());
        b.a(webview, jsonobject.toString().getBytes());
        continue; /* Loop/switch isn't completed */
_L4:
        p.df.a.c("WebViewBridgeClient", (new StringBuilder()).append("received the request but it's not good: ").append(s).toString());
        if (true) goto _L5; else goto _L2
_L2:
        return super.shouldOverrideUrlLoading(webview, s);
    }

}
