// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            js, jv, ji, op, 
//            ko, ow, oo, pf

public final class kp extends js
{

    public kp(op op1)
    {
        super(op1);
    }

    public final jv a()
    {
        return jv.c;
    }

    public final void a(ji ji1)
    {
        ji1.f.a(super.a.g());
    }

    public final void a(ji ji1, ow ow1)
    {
        oo oo1 = super.a.g();
        int i = ji1.f.b(oo1);
        if (ow1.a())
        {
            ow1.a(0, (new StringBuilder()).append(e()).append(' ').append(oo1.h_()).toString());
            ow1.a(4, (new StringBuilder("  descriptor_idx: ")).append(pf.a(i)).toString());
        }
        ow1.d(i);
    }

    public final int i_()
    {
        return 4;
    }
}
