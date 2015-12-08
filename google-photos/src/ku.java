// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ku
{

    private static kv a;

    public static int a(int i, int j)
    {
        return a.a(i, j);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new kx();
        } else
        {
            a = new kw();
        }
    }
}
