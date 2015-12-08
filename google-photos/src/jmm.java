// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jmm
{

    public static boolean a(int i, int j, jnl jnl1)
    {
        if (i == 4 && j >= 8)
        {
            i = jnl1.b;
            j = jnl1.d();
            int k = jnl1.e();
            int l = jnl1.h();
            int i1 = jnl1.d();
            jnl1.b(i);
            if (j == 181 && k == 49 && l == 0x47413934 && i1 == 3)
            {
                return true;
            }
        }
        return false;
    }
}
