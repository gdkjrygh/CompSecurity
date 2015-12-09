// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.os.AsyncTask;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import java.util.concurrent.ExecutionException;
import p.bz.u;
import p.cw.c;
import p.cx.g;
import p.cx.t;
import p.cx.v;
import p.df.a;

public class an extends AsyncTask
{

    private final int a = 2000;
    private v b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private p.cx.v.a g;

    public an()
    {
        c = false;
        d = false;
        g = new p.cx.v.a() {

            final an a;
            private final int b = 3;
            private boolean c;
            private int d;

            public void a(g g1)
            {
                if (c && !p.cm.an.a(a))
                {
                    if (p.cm.an.b(a))
                    {
                        p.cm.an.a(a, p.cm.an.c(a), an.d(a));
                    }
                    p.cm.an.a(a, true);
                }
                c = true;
                d = d + 1;
                if (d == 3)
                {
                    try
                    {
                        g1 = (String)a.get();
                    }
                    // Misplaced declaration of an exception variable
                    catch (g g1)
                    {
                        a.cancel(true);
                        g1 = null;
                    }
                    // Misplaced declaration of an exception variable
                    catch (g g1)
                    {
                        a.cancel(true);
                        g1 = null;
                    }
                    p.cm.an.a(a, g1, an.d(a));
                }
            }

            
            {
                a = an.this;
                super();
                c = false;
                d = 0;
            }
        };
    }

    private String a()
    {
        af af1 = b.a.d();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format("email=%s&", new Object[] {
            af1.c()
        }));
        stringbuilder.append(String.format("zip=%s&", new Object[] {
            af1.m()
        }));
        stringbuilder.append(String.format("gender=%s&", new Object[] {
            af1.l()
        }));
        stringbuilder.append(String.format("age=%s", new Object[] {
            Integer.valueOf(af1.k())
        }));
        return stringbuilder.toString();
    }

    private void a(String s1, v v1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!"submit_personal_info_failure".equalsIgnoreCase(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a.e().a(new u(flag));
        v1.a();
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    static void a(an an1, String s1, v v1)
    {
        an1.a(s1, v1);
    }

    static boolean a(an an1)
    {
        return an1.d;
    }

    static boolean a(an an1, boolean flag)
    {
        an1.d = flag;
        return flag;
    }

    static boolean b(an an1)
    {
        return an1.c;
    }

    static String c(an an1)
    {
        return an1.e;
    }

    static v d(an an1)
    {
        return an1.b;
    }

    protected transient String a(Object aobj[])
    {
        f = (String)aobj[0];
        e = "submit_personal_info_failure";
        if (s.a(f) || isCancelled())
        {
            return e;
        }
        b = new v();
        b.a(g, 0, 2000);
        try
        {
            e = b.a.b().p().a(f, a(), p.cx.t.a.b);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            e = "submit_personal_info_failure";
            p.df.a.c("SubmitPersonalInfoAsyncTask", "SubmitPersonalInfoAsyncTask exception (handled): ", ((Throwable) (aobj)));
        }
        return e;
    }

    protected void a(String s1)
    {
        e = s1;
        c = true;
        if (d)
        {
            a(s1, b);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onCancelled()
    {
        a(e, b);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }
}
