// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mln
{

    public final float a;
    public final float b;

    public mln(float f, float f1)
    {
        a = f;
        b = f1;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof mln) && ((mln)obj).a == a && ((mln)obj).b == b;
    }

    public final int hashCode()
    {
        return (Float.floatToIntBits(a) + 1369) * 37 + Float.floatToIntBits(b);
    }
}
