// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            BrowserInfo, StringUtils, JSExecutor, JavaScriptInterface

class BrowserInfoGatherer extends BrowserInfo
{

    private static final String i = StringUtils.a(com/threatmetrix/TrustDefenderMobile/BrowserInfoGatherer);
    private Context j;
    private boolean k;
    private boolean l;
    private JavaScriptInterface m;
    private JSExecutor n;
    private CountDownLatch o;
    private long p;

    BrowserInfoGatherer()
    {
        j = null;
        k = false;
        l = false;
        m = null;
        n = null;
        o = null;
        p = 0L;
    }

    static Context a(BrowserInfoGatherer browserinfogatherer)
    {
        return browserinfogatherer.j;
    }

    static JSExecutor a(BrowserInfoGatherer browserinfogatherer, JSExecutor jsexecutor)
    {
        browserinfogatherer.n = jsexecutor;
        return jsexecutor;
    }

    private static String a(String s, String s1, ArrayList arraylist)
    {
        s = a(arraylist, s);
        if (s == null) goto _L2; else goto _L1
_L1:
        s = (String)s.get("name");
        if (s == null) goto _L2; else goto _L3
_L3:
        arraylist = s.replace("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY -]", "");
        s = arraylist;
        if (!arraylist.isEmpty())
        {
            s = "true";
        }
_L5:
        return (new StringBuilder()).append(s1).append("^").append(s).append("!").toString();
_L2:
        s = "false";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static HashMap a(ArrayList arraylist, String s)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            HashMap hashmap = (HashMap)arraylist.next();
            String s1 = (String)hashmap.get("name");
            if (s1 != null && s1.toLowerCase(Locale.US).contains(s.toLowerCase(Locale.US)))
            {
                return hashmap;
            }
        }

        return null;
    }

    private void a(String s)
    {
        c = s.replaceAll("(<FIELD_SEP>|<REC_SEP>)", "");
        d = StringUtils.b(c);
        Object obj = new ArrayList();
        s = s.split("<REC_SEP>");
        int j1 = s.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = s[i1];
            if (Thread.currentThread().isInterrupted())
            {
                return;
            }
            HashMap hashmap = new HashMap();
            String as[] = s1.split("<FIELD_SEP>");
            if (as.length == 4)
            {
                hashmap.put("name", as[0]);
                hashmap.put("description", as[1]);
                hashmap.put("filename", as[2]);
                hashmap.put("length", as[3]);
                ((ArrayList) (obj)).add(hashmap);
            }
        }

        b = Integer.toString(((ArrayList) (obj)).size());
        s = new StringBuilder();
        s.append(a("QuickTime Plug-in", "plugin_quicktime", ((ArrayList) (obj))));
        s.append(a("Adobe Acrobat", "plugin_adobe_acrobat", ((ArrayList) (obj))));
        s.append(a("Java", "plugin_java", ((ArrayList) (obj))));
        s.append(a("SVG Viewer", "plugin_svg_viewer", ((ArrayList) (obj))));
        s.append(a("Flash", "plugin_flash", ((ArrayList) (obj))));
        s.append(a("Windows Media Player", "plugin_windows_media_player", ((ArrayList) (obj))));
        s.append(a("Silverlight", "plugin_silverlight", ((ArrayList) (obj))));
        s.append(a("Real Player", "plugin_realplayer", ((ArrayList) (obj))));
        s.append(a("ShockWave Director", "plugin_shockwave", ((ArrayList) (obj))));
        s.append(a("VLC", "plugin_vlc_player", ((ArrayList) (obj))));
        s.append(a("DevalVR", "plugin_devalvr", ((ArrayList) (obj))));
        a = s.toString();
        obj = i;
        StringBuilder stringbuilder = (new StringBuilder()).append("Got").append(b).append(":");
        if (a != null)
        {
            s = a;
        } else
        {
            s = "";
        }
        Log.d(((String) (obj)), stringbuilder.append(s).toString());
    }

    static JavaScriptInterface b(BrowserInfoGatherer browserinfogatherer)
    {
        return browserinfogatherer.m;
    }

    static boolean c(BrowserInfoGatherer browserinfogatherer)
    {
        return browserinfogatherer.k;
    }

    static JSExecutor d(BrowserInfoGatherer browserinfogatherer)
    {
        return browserinfogatherer.n;
    }

    static void e(BrowserInfoGatherer browserinfogatherer)
    {
        browserinfogatherer.k();
    }

    static String j()
    {
        return i;
    }

    private void k()
    {
        if (!Thread.currentThread().isInterrupted())
        {
            if ((p & 32L) != 0L)
            {
                String s = n.a("(function () { var plugins_string='', i=0; for (p=navigator.plugins[0]; i< navigator.plugins.length;p=navigator.plugins[i++]) {  plugins_string += p.name + '<FIELD_SEP>' + p.description + '<FIELD_SEP>' + p.filename + '<FIELD_SEP>' + p.length.toString() + '<REC_SEP>'; } return plugins_string;})();");
                if (s != null)
                {
                    a(s);
                }
            }
            if (!Thread.currentThread().isInterrupted() && (p & 4L) != 0L)
            {
                String s1 = n.a("navigator.mimeTypes.length");
                if (s1 != null)
                {
                    try
                    {
                        f = Integer.parseInt(s1);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        Log.e(i, "failed to convert", numberformatexception);
                    }
                }
                g = n.a("(function () { var mime_string='', i=0; for (var m=navigator.mimeTypes[0]; i< navigator.mimeTypes.length;m=navigator.mimeTypes[i++]) {  mime_string += m.type; } return mime_string;})();");
                if (g != null)
                {
                    h = StringUtils.b(g);
                    Log.d(i, (new StringBuilder()).append("Got:").append(g).toString());
                    return;
                } else
                {
                    h = "";
                    return;
                }
            }
        }
    }

    private void l()
    {
        int i1;
        if ((p & 32L) != 0L && m.c.size() > 0)
        {
            String s = (String)m.c.get(0);
            i1 = 1;
            String s1;
            StringBuilder stringbuilder;
            if (s != null && !s.isEmpty())
            {
                a(s);
            } else
            {
                d = "";
            }
        } else
        {
            i1 = 0;
        }
        if (!Thread.currentThread().isInterrupted() && (p & 4L) != 0L && m.c.size() > i1)
        {
            s = (String)m.c.get(i1);
            i1++;
            Object obj;
            if (s != null && !s.isEmpty())
            {
                try
                {
                    f = Integer.parseInt(s);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e(i, "failed to convert", ((Throwable) (obj)));
                    f = 0;
                }
            } else
            {
                f = 0;
            }
            if (f > 0 && m.c.size() > i1)
            {
                g = (String)m.c.get(i1);
            }
            if (g != null)
            {
                h = StringUtils.b(g);
                Log.d(i, (new StringBuilder()).append("Got:").append(g).toString());
            } else
            {
                h = "";
            }
            s1 = i;
            stringbuilder = (new StringBuilder()).append("Got mime ").append(f).append(":");
            if (g != null)
            {
                obj = g;
            } else
            {
                obj = "";
            }
            Log.d(s1, stringbuilder.append(((String) (obj))).toString());
        }
    }

    void a(boolean flag)
    {
        if (o == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        Log.d(i, (new StringBuilder()).append("waiting for getBrowserInfo to finished, latch: ").append(o.getCount()).append(" - ").append(o.hashCode()).toString());
        if (o.await(10L, TimeUnit.SECONDS))
        {
            if (flag)
            {
                try
                {
                    if (JSExecutor.b() || JSExecutor.a())
                    {
                        l();
                        return;
                    }
                }
                catch (InterruptedException interruptedexception)
                {
                    Log.e(i, "getBrowserInfo interrupted", interruptedexception);
                }
            }
            break MISSING_BLOCK_LABEL_160;
        }
        Log.e(i, (new StringBuilder()).append("getBrowserInfo no response from UI thread before timeout using latch: ").append(o.hashCode()).append(" with count: ").append(o.getCount()).toString());
        l = true;
        return;
    }

    boolean a(Context context, boolean flag, long l1)
    {
label0:
        {
            j = context;
            k = flag;
            p = l1;
            if (!k)
            {
                return false;
            }
            String s = i;
            StringBuilder stringbuilder = (new StringBuilder()).append("initJSExecutor: jsProblem = ").append(l).append(", jsExec = ").append(n).append(", hasBadOptions = ");
            if (n != null)
            {
                context = Boolean.valueOf(n.a(flag));
            } else
            {
                context = "true";
            }
            Log.d(s, stringbuilder.append(context).toString());
            if (!l && n == null || n != null && n.a(k))
            {
                CountDownLatch countdownlatch = new CountDownLatch(1);
                Handler handler = new Handler(Looper.getMainLooper());
                boolean flag1;
                if (JSExecutor.b() || JSExecutor.a())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    context = countdownlatch;
                } else
                {
                    context = null;
                }
                m = new JavaScriptInterface(context);
                Log.d(i, (new StringBuilder()).append("Firing off initJSExecutor on UI thread using latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
                handler.post(new CompleteBrowserInfoRequest(this, countdownlatch) {
            private class CompleteBrowserInfoRequest
                implements Runnable
            {

                BrowserInfoGatherer b;
                CountDownLatch c;

                public void run()
                {
                    throw new NoSuchMethodError();
                }

                public CompleteBrowserInfoRequest(CountDownLatch countdownlatch)
                {
                    b = null;
                    c = null;
                    b = BrowserInfoGatherer.this;
                    c = countdownlatch;
                }
            }


                    final BrowserInfoGatherer a;

                    public void run()
                    {
                        Log.d(BrowserInfoGatherer.j(), "Calling initJSExecutor() - on UI thread");
                        BrowserInfoGatherer.a(b, new JSExecutor(BrowserInfoGatherer.a(a), BrowserInfoGatherer.b(a), BrowserInfoGatherer.c(a)));
                        try
                        {
                            BrowserInfoGatherer.d(b).d();
                        }
                        catch (InterruptedException interruptedexception)
                        {
                            Log.e(BrowserInfoGatherer.j(), "Interrupted initing js engine");
                        }
                        Log.d(BrowserInfoGatherer.j(), "js exec init complete");
                        if (c != null)
                        {
                            Log.d(BrowserInfoGatherer.j(), (new StringBuilder()).append("js exec init countdown using latch: ").append(c.hashCode()).append(" with count: ").append(c.getCount()).toString());
                            c.countDown();
                        }
                    }

            
            {
                a = BrowserInfoGatherer.this;
                browserinfogatherer1. super(countdownlatch);
            }
                });
                try
                {
                    if (countdownlatch.await(10L, TimeUnit.SECONDS))
                    {
                        break label0;
                    }
                    l = true;
                    Log.e(i, (new StringBuilder()).append("initJSExecutor no response from UI thread before timeout using init latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.e(i, "Interrupted initing js engine");
                    return false;
                }
                return false;
            }
            Log.d(i, "reused JS Interface");
        }
        return true;
    }

    public String d()
    {
        if (c == null)
        {
            if (n == null || l)
            {
                e = JSExecutor.c();
            } else
            {
                e = n.a(j);
            }
        }
        return e;
    }

    boolean g()
    {
        return n != null && !l;
    }

    boolean h()
    {
        return g() && k;
    }

    void i()
    {
        int i1 = 1;
        byte byte0 = 1;
        CountDownLatch countdownlatch;
        Handler handler;
        JavaScriptInterface javascriptinterface;
        boolean flag;
        if (JSExecutor.b() || JSExecutor.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if ((p & 32L) != 0L)
            {
                byte0 = 2;
            }
            i1 = byte0;
            if ((p & 4L) != 0L)
            {
                i1 = byte0 + 2;
            }
        }
        o = new CountDownLatch(i1);
        handler = new Handler(Looper.getMainLooper());
        Log.d(i, (new StringBuilder()).append("Firing off getBrowserInfo on UI thread using latch: ").append(o.hashCode()).append(" with count: ").append(i1).toString());
        javascriptinterface = m;
        if (flag)
        {
            countdownlatch = o;
        } else
        {
            countdownlatch = null;
        }
        javascriptinterface.a(countdownlatch);
        handler.post(new CompleteBrowserInfoRequest(this, o) {

            final BrowserInfoGatherer a;

            public void run()
            {
                try
                {
                    Log.d(BrowserInfoGatherer.j(), "Calling getBrowserInfo() - on UI thread");
                    BrowserInfoGatherer.e(b);
                }
                catch (InterruptedException interruptedexception)
                {
                    Log.d(BrowserInfoGatherer.j(), "getBrowserInfo interrupted", interruptedexception);
                }
                if (c != null)
                {
                    Log.d(BrowserInfoGatherer.j(), (new StringBuilder()).append("getBrowserInfo countdown using latch: ").append(c.hashCode()).append(" with count: ").append(c.getCount()).toString());
                    c.countDown();
                }
            }

            
            {
                a = BrowserInfoGatherer.this;
                browserinfogatherer1. super(countdownlatch);
            }
        });
    }

}
