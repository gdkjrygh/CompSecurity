// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ggv
{

    private static ggv a;

    public ggv()
    {
    }

    public static ggv a()
    {
        return a;
    }

    public abstract gha a(Runnable runnable);

    public abstract void a(gha gha);

    public abstract void b(gha gha);

    public abstract void c(gha gha);

    static 
    {
        if (gcl.a)
        {
            a = new ggw((byte)0);
        } else
        {
            a = new ggy((byte)0);
        }
    }
}
