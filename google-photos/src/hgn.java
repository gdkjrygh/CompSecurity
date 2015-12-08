// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class hgn
    implements ds
{

    private static final int d;
    public final String a;
    public qgz b;
    public hgk c;
    private final int e;
    private final String f;
    private final hgk g;
    private final noz h;
    private final ifj i;
    private final muz j;
    private boolean k;

    private hgn(Context context, int l, String s, String s1, hgk hgk1)
    {
        boolean flag;
        if (l != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        h = noz.a(context, "ReadMediaCollectionById", new String[0]);
        e = l;
        a = s;
        f = s1;
        j = (muz)olm.a(context, muz);
        s = hgk1;
        if (hgk1 == null)
        {
            s = hgk.a(j.a());
        }
        g = s;
        i = (ifj)olm.a(context, ifj);
        if (i.a(l))
        {
            k = true;
        }
    }

    public static hgn a(Context context, int l, String s)
    {
        return new hgn(context, l, s, null, null);
    }

    public static hgn a(Context context, int l, String s, hgk hgk1, String s1)
    {
        return new hgn(context, l, s, s1, hgk1);
    }

    public static hgn a(Context context, int l, String s, String s1)
    {
        return new hgn(context, l, s, s1, null);
    }

    public final void a(hpr hpr)
    {
        if (h.a())
        {
            noy.a("mediaKey", a);
            noy.a("rpcError", hpr);
        }
    }

    public final void a(qlw qlw)
    {
        qlw = (qrf)qlw;
        if (qlw != null)
        {
            b = ((qrf) (qlw)).b;
            if (b != null)
            {
                Object obj = null;
                qlw = obj;
                if (b.b != null)
                {
                    qlw = obj;
                    if (b.b.length > 0)
                    {
                        qlw = obj;
                        if (b.b[0] != null)
                        {
                            qfz qfz1 = b.b[0];
                            qlw = obj;
                            if (qfz1.e != null)
                            {
                                qlw = obj;
                                if (qfz1.e.length > 0)
                                {
                                    qlw = obj;
                                    if (qfz1.e[0] != null)
                                    {
                                        qlw = qfz1.e[0].c;
                                    }
                                }
                            }
                        }
                    }
                }
                c = new hgk(b.a, qlw, g.a);
            }
        } else
        if (h.a())
        {
            noy.a("mediaKey", a);
            return;
        }
    }

    public final qlr f()
    {
        return qrf.a;
    }

    public final int g()
    {
        return d;
    }

    public final qlr g_()
    {
        return qre.a;
    }

    public final boolean j()
    {
        return b != null;
    }

    public final String k_()
    {
        return "ReadMediaCollectionById";
    }

    public final qlw l_()
    {
label0:
        {
            boolean flag1 = false;
            qre qre1 = new qre();
            qre1.b = new qgy();
            qbl qbl1 = new qbl();
            qbl1.a = new qbx();
            qbl1.a.a = a;
            if (f != null)
            {
                qbl1.c = f;
            }
            qbl1.b = new qfa();
            qez qez1 = new qez();
            qez1.a = 1;
            qez1.b = Boolean.valueOf(false);
            qbl1.b.a = (new qez[] {
                qez1
            });
            qre1.b.a = (new qbl[] {
                qbl1
            });
            qre1.b.b = b.h();
            qre1.b.b.g = b.k();
            if (i.a(e))
            {
                if (k)
                {
                    qre1.b.b.a.j = new qcf();
                }
                boolean flag;
                if (g.a() || g.c())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    qbl1.d = new qhs[1];
                    qbl1.d[0] = new qhs();
                    qbl1.d[0].a = 1;
                    qbl1.d[0].b = g.c;
                }
            }
            if (!g.a())
            {
                flag = flag1;
                if (!g.b())
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag)
        {
            qre1.b.c = b.i();
            qre1.b.e = g.b;
        }
        qre1.b.d = b.j();
        return qre1;
    }

    static 
    {
        d = qmb.b(qrf.a.b);
    }
}
