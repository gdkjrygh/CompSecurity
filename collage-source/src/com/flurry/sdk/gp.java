// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            fz, fp, gd, gr, 
//            gq, fw, fj, fy, 
//            hq, fi, fx, ha, 
//            gx

public abstract class gp
{
    public static interface a
    {

        public abstract void a();
    }


    private fy a;
    protected final String c;
    Set d;
    gr e;
    protected String f;

    public gp(String s, String s1)
    {
        d = new HashSet();
        f = "defaultDataKey_";
        a = new fy() {

            final gp a;

            public void a(fi fi1)
            {
                gd.a(4, a.c, (new StringBuilder()).append("onNetworkStateChanged : isNetworkEnable = ").append(fi1.a).toString());
                if (fi1.a)
                {
                    a.e();
                }
            }

            public void notify(fx fx)
            {
                a((fi)fx);
            }

            
            {
                a = gp.this;
                super();
            }
        };
        c = s1;
        fz.a().a("com.flurry.android.sdk.NetworkStateEvent", a);
        a(s);
    }

    public String a(String s, String s1)
    {
        return (new StringBuilder()).append(f).append(s).append("_").append(s1).toString();
    }

    protected void a(a a1)
    {
        a(((hq) (new hq(a1) {

            final a a;
            final gp b;

            public void safeRun()
            {
                b.g();
                if (a != null)
                {
                    a.a();
                }
            }

            
            {
                b = gp.this;
                a = a1;
                super();
            }
        })));
    }

    protected void a(hq hq)
    {
        fp.a().b(hq);
    }

    protected void a(String s)
    {
        a(((hq) (new hq(s) {

            final String a;
            final gp b;

            public void safeRun()
            {
                b.e = new gr(a);
            }

            
            {
                b = gp.this;
                a = s;
                super();
            }
        })));
    }

    protected void a(String s, String s1, int i)
    {
        a(((hq) (new hq(s, s1) {

            final String a;
            final String b;
            final gp c;

            public void safeRun()
            {
                if (!c.e.a(a, b))
                {
                    gd.a(6, c.c, (new StringBuilder()).append("Internal error. Block wasn't deleted with id = ").append(a).toString());
                }
                if (!c.d.remove(a))
                {
                    gd.a(6, c.c, (new StringBuilder()).append("Internal error. Block with id = ").append(a).append(" was not in progress state").toString());
                }
            }

            
            {
                c = gp.this;
                a = s;
                b = s1;
                super();
            }
        })));
    }

    protected abstract void a(byte abyte0[], String s, String s1);

    public void a(byte abyte0[], String s, String s1, a a1)
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            gd.a(6, c, "Report that has to be sent is EMPTY or NULL");
            return;
        } else
        {
            c(abyte0, s, s1);
            a(a1);
            return;
        }
    }

    protected void b(String s, String s1)
    {
        a(new hq(s) {

            final String a;
            final gp b;

            public void safeRun()
            {
                if (!b.d.remove(a))
                {
                    gd.a(6, b.c, (new StringBuilder()).append("Internal error. Block with id = ").append(a).append(" was not in progress state").toString());
                }
            }

            
            {
                b = gp.this;
                a = s;
                super();
            }
        });
    }

    public void b(byte abyte0[], String s, String s1)
    {
        a(abyte0, s, s1, null);
    }

    protected void c(String s, String s1)
    {
        if (!e.a(s, s1))
        {
            gd.a(6, c, (new StringBuilder()).append("Internal error. Block wasn't deleted with id = ").append(s).toString());
        }
        if (!d.remove(s))
        {
            gd.a(6, c, (new StringBuilder()).append("Internal error. Block with id = ").append(s).append(" was not in progress state").toString());
        }
    }

    protected void c(byte abyte0[], String s, String s1)
    {
        a(new hq(abyte0, s, s1) {

            final byte a[];
            final String b;
            final String c;
            final gp d;

            public void safeRun()
            {
                d.d(a, b, c);
            }

            
            {
                d = gp.this;
                a = abyte0;
                b = s;
                c = s1;
                super();
            }
        });
    }

    public int d()
    {
        return d.size();
    }

    protected void d(byte abyte0[], String s, String s1)
    {
        s = a(s, s1);
        abyte0 = new gq(abyte0);
        s1 = abyte0.a();
        (new fw(fp.a().c().getFileStreamPath(gq.a(s1)), ".yflurrydatasenderblock.", 1, new ha() {

            final gp a;

            public gx a(int i)
            {
                return new gq.a();
            }

            
            {
                a = gp.this;
                super();
            }
        })).a(abyte0);
        gd.a(5, c, (new StringBuilder()).append("Saving Block File ").append(s1).append(" at ").append(fp.a().c().getFileStreamPath(gq.a(s1))).toString());
        e.a(abyte0, s);
    }

    protected void e()
    {
        a(((a) (null)));
    }

    protected boolean f()
    {
        return d() <= 5;
    }

    protected void g()
    {
        if (fj.a().c()) goto _L2; else goto _L1
_L1:
        gd.a(5, c, "Reports were not sent! No Internet connection!");
_L4:
        return;
_L2:
        Object obj;
        obj = e.a();
        if (obj == null || ((List) (obj)).isEmpty())
        {
            gd.a(4, c, "No more reports to send.");
            return;
        }
        obj = ((List) (obj)).iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        String s = (String)((Iterator) (obj)).next();
        if (!f()) goto _L4; else goto _L5
_L5:
        List list;
        int i;
        list = e.c(s);
        gd.a(4, c, (new StringBuilder()).append("Number of not sent blocks = ").append(list.size()).toString());
        i = 0;
_L8:
        if (i >= list.size()) goto _L7; else goto _L6
_L6:
        String s1;
        s1 = (String)list.get(i);
        if (!d.contains(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
_L10:
        i++;
          goto _L8
        if (!f()) goto _L7; else goto _L9
_L9:
        gq gq1 = (gq)(new fw(fp.a().c().getFileStreamPath(gq.a(s1)), ".yflurrydatasenderblock.", 1, new ha() {

            final gp a;

            public gx a(int j)
            {
                return new gq.a();
            }

            
            {
                a = gp.this;
                super();
            }
        })).a();
        if (gq1 == null)
        {
            gd.a(6, c, "Internal ERROR! Cannot read!");
            e.a(s1, s);
        } else
        {
            byte abyte0[] = gq1.b();
            if (abyte0 == null || abyte0.length == 0)
            {
                gd.a(6, c, "Internal ERROR! Report is empty!");
                e.a(s1, s);
            } else
            {
                gd.a(5, c, (new StringBuilder()).append("Reading block info ").append(s1).toString());
                d.add(s1);
                a(abyte0, s1, s);
            }
        }
          goto _L10
    }
}
