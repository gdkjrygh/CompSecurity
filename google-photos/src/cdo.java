// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class cdo
{

    final cmm a;
    final float b;
    final float c;
    final cdk d;

    public cdo(cmm cmm, float f, float f1, cdk cdk1)
    {
        a = cmm;
        b = f;
        c = f1;
        d = cdk1;
    }

    public boolean a(cof cof1)
    {
        return c(cof1) != null;
    }

    public float b(cof cof1)
    {
        float f1 = d(cof1);
        float f = f1;
        if (d != null)
        {
            f = d.a(f1);
        }
        return (f - b) / c;
    }

    protected Object c(cof cof1)
    {
        return cof1.c.a(a);
    }

    protected abstract float d(cof cof1);
}
