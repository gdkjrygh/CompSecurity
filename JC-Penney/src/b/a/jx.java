// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            js, ok, ji, om, 
//            ko, kq, ow, pf

public abstract class jx extends js
{

    final ok b;

    public jx(ok ok1)
    {
        super(ok1.g());
        b = ok1;
    }

    public void a(ji ji1)
    {
        super.a(ji1);
        ji1.f.a(b.h().b());
    }

    public final void a(ji ji1, ow ow1)
    {
        kq kq1 = ji1.g;
        ko ko1 = ji1.f;
        om om1 = b.h();
        int i = kq1.b(super.a);
        int j = ko1.b(om1.b());
        int k = b(ji1);
        if (ow1.a())
        {
            ow1.a(0, (new StringBuilder()).append(e()).append(' ').append(b.h_()).toString());
            ow1.a(2, (new StringBuilder("  class_idx: ")).append(pf.b(i)).toString());
            ow1.a(2, String.format("  %-10s %s", new Object[] {
                (new StringBuilder()).append(c()).append(':').toString(), pf.b(k)
            }));
            ow1.a(4, (new StringBuilder("  name_idx:  ")).append(pf.a(j)).toString());
        }
        ow1.c(i);
        ow1.c(k);
        ow1.d(j);
    }

    protected abstract int b(ji ji1);

    protected abstract String c();

    public final int i_()
    {
        return 8;
    }
}
