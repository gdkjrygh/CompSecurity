// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aoB
{
    public static interface a
    {

        public abstract float a();
    }


    private final a a;
    private final a b;

    public aoB(a a1, a a2)
    {
        a = a1;
        b = a2;
    }

    public final float a()
    {
        return a.a();
    }

    public final float b()
    {
        return b.a();
    }
}
