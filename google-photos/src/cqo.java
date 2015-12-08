// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cqo
{

    public final long a;
    public final float b;

    public cqo(long l, float f)
    {
        a = b.b(l, "timestampUs");
        if (f < 0.0F)
        {
            b.a((new StringBuilder()).append("volume").append(" must be zero or positive: ").append(f), null);
        }
        b = f;
    }
}
