// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class czd
{

    final int a[] = new int[256];
    private int b;

    public czd()
    {
        b = 0;
    }

    public final boolean a()
    {
        return 256 == b;
    }

    public final int b()
    {
        int i = b;
        b = b + 1;
        a[i] = 0;
        return i;
    }

    public final void c()
    {
        b = b - 1;
        if (b < 0)
        {
            throw new ArrayIndexOutOfBoundsException(b);
        } else
        {
            return;
        }
    }
}
