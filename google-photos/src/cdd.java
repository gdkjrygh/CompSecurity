// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdd
    implements cdk
{

    private final float a;
    private final float b;

    public cdd(float f, float f1)
    {
        a = f;
        b = f1;
    }

    public final float a(float f)
    {
        return (float)(2D / (1.0D + Math.exp(-a * (Math.abs(f) - b)))) - 1.0F;
    }
}
