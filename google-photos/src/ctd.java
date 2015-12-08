// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ctd
{

    public float a;
    public long b;
    public ctd c;

    public ctd(float f, long l, ctd ctd1)
    {
        a = f;
        b = l;
        c = ctd1;
    }

    public final String toString()
    {
        return String.format("(%f %d)", new Object[] {
            Float.valueOf(a), Long.valueOf(b)
        });
    }
}
