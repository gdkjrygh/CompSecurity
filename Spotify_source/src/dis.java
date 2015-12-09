// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dis
{

    public static float a(float f, float f1, float f2)
    {
        return Math.max(f1, Math.min(f, f2));
    }

    public static float a(float f, float f1, float f2, float f3, float f4)
    {
        return ((f - f1) * (f4 - f3)) / (f2 - f1) + f3;
    }
}
