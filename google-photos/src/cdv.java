// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdv extends cdo
{

    private final cdi e;

    public cdv(cmm cmm, float f, float f1, cdi cdi1, cdk cdk)
    {
        super(cmm, f, f1, cdk);
        e = cdi1;
    }

    public final boolean a(cof cof)
    {
        return c(cof) != null;
    }

    protected final float d(cof cof)
    {
        cof = (cob)c(cof);
        return e.a(cof);
    }
}
