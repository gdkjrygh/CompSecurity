// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdt extends cdo
{

    private final cdh e;

    public cdt(cmm cmm, float f, float f1, cdh cdh1, cdk cdk)
    {
        super(cmm, f, f1, cdk);
        e = cdh1;
    }

    public final boolean a(cof cof)
    {
        return c(cof) != null;
    }

    protected final float d(cof cof)
    {
        cof = (float[])c(cof);
        return e.a(cof);
    }
}
