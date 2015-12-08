// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebView;
import com.kik.cards.web.ap;
import com.kik.cards.web.au;
import com.kik.cards.web.ax;
import com.kik.cards.web.az;
import com.kik.cards.web.ba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.plugin:
//            h, e

public class JavascriptGlue
    implements ax
{
    private class JsInterface
    {

        final JavascriptGlue a;

        public String invokeAsyncFunction(String s, String s1, String s2, String s3)
        {
            if (JavascriptGlue.a(a))
            {
                return "";
            }
            if (!com.kik.cards.web.plugin.JavascriptGlue.c(a))
            {
                JavascriptGlue.d(a);
            }
            return JavascriptGlue.e(a).a(s, s1, s2, s3);
        }

        public String invokeFunction(String s, String s1, String s2)
        {
            if (JavascriptGlue.a(a))
            {
                return "";
            }
            if (!com.kik.cards.web.plugin.JavascriptGlue.c(a))
            {
                JavascriptGlue.d(a);
            }
            return JavascriptGlue.e(a).a(s, s1, s2);
        }

        public String poll()
        {
            if (JavascriptGlue.a(a))
            {
                return "";
            }
            String s = "";
            synchronized (JavascriptGlue.f(a))
            {
                JavascriptGlue.g(a);
                if (JavascriptGlue.f(a).size() > 0)
                {
                    s = (String)JavascriptGlue.f(a).removeFirst();
                }
            }
            return s;
            exception;
            linkedlist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private JsInterface()
        {
            a = JavascriptGlue.this;
            super();
        }

        JsInterface(e e1)
        {
            this();
        }
    }

    private final class a
        implements Runnable
    {

        final long a;
        final String b;
        final String c[];
        final JavascriptGlue d;

        public final void run()
        {
            if (JavascriptGlue.h(d) != null && !JavascriptGlue.a(d)) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Object obj = JavascriptGlue.f(d);
            obj;
            JVM INSTR monitorenter ;
            boolean flag;
            if (a == JavascriptGlue.i(d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj;
            JVM INSTR monitorexit ;
            if (!flag) goto _L1; else goto _L3
_L3:
            com.kik.cards.web.plugin.JavascriptGlue.c().a("BAD: timed out waiting for poll, forcing javascript poll.");
            try
            {
                JavascriptGlue.h(d).loadUrl("javascript:cards._.bridge.forceAndroidPoll();");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.kik.cards.web.plugin.JavascriptGlue.c().a("Exception while trying to force poll", ((Throwable) (obj)));
            }
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a(long l, String s, String as[])
        {
            d = JavascriptGlue.this;
            super();
            a = l;
            b = s;
            c = as;
        }

        a(long l, String s, String as[], byte byte0)
        {
            this(l, s, as);
        }
    }

    private final class b extends ba
    {

        final JavascriptGlue a;

        private String a(JSONArray jsonarray, String s)
        {
            int k = 1;
            Object obj = jsonarray.getString(0);
            if ("poll".equals(obj))
            {
                return com.kik.cards.web.plugin.JavascriptGlue.b(a).poll();
            }
            if ("invokeAsyncFunction".equals(obj))
            {
                return com.kik.cards.web.plugin.JavascriptGlue.b(a).invokeAsyncFunction(jsonarray.getString(1), jsonarray.getString(2), jsonarray.getString(3), s);
            }
            if ("invokeFunction".equals(obj))
            {
                return com.kik.cards.web.plugin.JavascriptGlue.b(a).invokeFunction(jsonarray.getString(1), jsonarray.getString(2), s);
            }
            if ("batchInvoke".equals(obj))
            {
                obj = new JSONArray();
                for (; k < jsonarray.length(); k++)
                {
                    ((JSONArray) (obj)).put(a(jsonarray.getJSONArray(k), s));
                }

                return ((JSONArray) (obj)).toString();
            } else
            {
                throw new NoSuchMethodException(((String) (obj)));
            }
        }

        public final boolean onConsoleMessage(ConsoleMessage consolemessage)
        {
            super.onConsoleMessage(consolemessage);
            JavascriptGlue.a(a, consolemessage.message());
            return true;
        }

        public final boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
        {
            if (JavascriptGlue.a(a))
            {
                com.kik.cards.web.plugin.JavascriptGlue.c().b("Prompt after unhook: {}", s2);
                jspromptresult.cancel();
                return true;
            }
            if (!"CardsBridge".equals(s1))
            {
                break MISSING_BLOCK_LABEL_60;
            }
            jspromptresult.confirm(a(new JSONArray(s2), s));
            return true;
            webview;
_L2:
            jspromptresult.cancel();
            return true;
            webview;
            continue; /* Loop/switch isn't completed */
            webview;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public b(au au, az az)
        {
            a = JavascriptGlue.this;
            super(au, az);
        }
    }


    private static final org.c.b i = org.c.c.a("CardsWebGlue");
    private final h a;
    private final WebView b;
    private final LinkedList c = new LinkedList();
    private final JsInterface d = new JsInterface(null);
    private final b e;
    private volatile boolean f;
    private boolean g;
    private long h;
    private List j;

    private JavascriptGlue(WebView webview, h h1, au au, az az)
    {
        f = false;
        g = false;
        h = 0L;
        j = new ArrayList();
        a = h1;
        b = webview;
        e = new b(au, az);
    }

    public static JavascriptGlue a(WebView webview, h h1, au au, az az)
    {
        au = new JavascriptGlue(webview, h1, au, az);
        h1.a(au);
        webview.setWebChromeClient(((JavascriptGlue) (au)).e);
        return au;
    }

    static void a(JavascriptGlue javascriptglue, String s)
    {
        for (javascriptglue = javascriptglue.j.iterator(); javascriptglue.hasNext(); ((ap)javascriptglue.next()).a(s)) { }
    }

    static boolean a(JavascriptGlue javascriptglue)
    {
        return javascriptglue.f;
    }

    static JsInterface b(JavascriptGlue javascriptglue)
    {
        return javascriptglue.d;
    }

    static org.c.b c()
    {
        return i;
    }

    static boolean c(JavascriptGlue javascriptglue)
    {
        return javascriptglue.g;
    }

    static boolean d(JavascriptGlue javascriptglue)
    {
        javascriptglue.g = true;
        return true;
    }

    static h e(JavascriptGlue javascriptglue)
    {
        return javascriptglue.a;
    }

    static LinkedList f(JavascriptGlue javascriptglue)
    {
        return javascriptglue.c;
    }

    static long g(JavascriptGlue javascriptglue)
    {
        long l = javascriptglue.h;
        javascriptglue.h = 1L + l;
        return l;
    }

    static WebView h(JavascriptGlue javascriptglue)
    {
        return javascriptglue.b;
    }

    static long i(JavascriptGlue javascriptglue)
    {
        return javascriptglue.h;
    }

    public final ba a()
    {
        return e;
    }

    public final void a(ap ap1)
    {
        j.add(ap1);
    }

    public final transient void a(String s, String as[])
    {
        LinkedList linkedlist = c;
        linkedlist;
        JVM INSTR monitorenter ;
        LinkedList linkedlist1;
        StringBuilder stringbuilder;
        linkedlist1 = c;
        stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        stringbuilder.append("(");
        int k = 0;
_L2:
        if (k >= as.length)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        stringbuilder.append(",");
        if (as[k] != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        stringbuilder.append("null");
        break MISSING_BLOCK_LABEL_174;
        stringbuilder.append(JSONObject.quote(as[k]));
        break MISSING_BLOCK_LABEL_174;
        s;
        linkedlist;
        JVM INSTR monitorexit ;
        throw s;
        long l;
        stringbuilder.append(");");
        linkedlist1.add(stringbuilder.toString());
        l = h;
        linkedlist;
        JVM INSTR monitorexit ;
        if (b != null)
        {
            b.post(new e(this));
            b.postDelayed(new a(l, s, as, (byte)0), 200L);
        }
        return;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b()
    {
        synchronized (c)
        {
            c.clear();
            h = -1L;
        }
        a.a(null);
        f = true;
        return;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
