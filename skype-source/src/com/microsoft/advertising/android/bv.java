// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import java.net.URLEncoder;
import java.util.Locale;

// Referenced classes of package com.microsoft.advertising.android:
//            by, u, av, af

final class bv
{

    private static boolean a;
    private static bv b = new bv();
    private volatile String c;
    private String d;
    private String e;
    private AsyncTask f;

    bv()
    {
        d = null;
        e = null;
        f = null;
    }

    public static bv a()
    {
        return b;
    }

    private static String a(String s, String s1)
    {
        StringBuilder stringbuilder;
        try
        {
            s = by.a(s);
            stringbuilder = new StringBuilder();
            a(stringbuilder, new u[] {
                u.a, u.p, u.b, u.c, u.d, u.e, u.f, u.g
            });
            stringbuilder.append((new StringBuilder("&")).append(u.h.a()).append("=").append(s1).toString());
            stringbuilder.append((new StringBuilder("&")).append(u.i.a()).append("=").append(u.i.e()).toString());
            stringbuilder.append((new StringBuilder("&")).append(u.j.a()).append("=").append(u.j.e()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            av.c("initDefaultParameters", s.getMessage());
            return "";
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (s.length() > 0)
        {
            stringbuilder.append((new StringBuilder("&")).append(u.k.a()).append("=").append(s).toString());
        }
        stringbuilder.append((new StringBuilder("&")).append(u.l.a()).append("=").append(URLEncoder.encode(Build.MANUFACTURER, "UTF-8")).toString());
        stringbuilder.append((new StringBuilder("&")).append(u.m.a()).append("=").append(URLEncoder.encode(Build.MODEL, "UTF-8")).toString());
        stringbuilder.append((new StringBuilder("&")).append(u.n.a()).append("=").append(u.n.e()).toString());
        stringbuilder.append((new StringBuilder("&")).append(u.o.a()).append("=").append(URLEncoder.encode(android.os.Build.VERSION.RELEASE, "UTF-8")).toString());
        a(stringbuilder, new u[] {
            u.G, u.F
        });
        s = stringbuilder.toString();
        return s;
    }

    static void a(bv bv1, Context context)
    {
        bv1.d = by.a(context, "INSTALLATION");
        bv1.e = Locale.getDefault().toString().replace("_", "-");
        bv1.c = a(bv1.d, bv1.e);
    }

    private static transient void a(StringBuilder stringbuilder, u au[])
    {
        if (af.a(au))
        {
            int j = au.length;
            int i = 0;
            while (i < j) 
            {
                u u1 = au[i];
                if (u1 != null)
                {
                    stringbuilder.append(String.format("&%s=%s", new Object[] {
                        u1.a(), u1.e()
                    }));
                }
                i++;
            }
        }
    }

    static boolean c()
    {
        return a;
    }

    public final void a(Context context)
    {
        if (f == null && c == null)
        {
            f = (new AsyncTask(context) {

                final bv a;
                private final Context b;

                protected final transient Object doInBackground(Object aobj[])
                {
                    bv.a(a, b);
                    return Integer.valueOf(0);
                }

            
            {
                a = bv.this;
                b = context;
                super();
            }
            }).execute(new Void[0]);
            return;
        } else
        {
            av.a("StaticAdServerParameters", "Async Task has already started");
            return;
        }
    }

    public final String b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj = f;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        f.get();
_L1:
        f = null;
        obj = c;
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Object obj1;
        obj1;
        av.a("StaticAdServerParameters", "Exception while Initializing Static AdRequest Params", ((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

}
