// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddp
    implements ddr
{

    public ddp()
    {
    }

    public static Float a(Float float1, Float float2, float f)
    {
        return Float.valueOf(float1.floatValue() * (1.0F - f) + float2.floatValue() * f);
    }

    public final volatile Object a(Object obj, Object obj1, float f)
    {
        return a((Float)obj, (Float)obj1, f);
    }
}
