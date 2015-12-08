// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.r;


// Referenced classes of package com.google.android.m4b.maps.r:
//            d, c

public final class a
    implements d
{

    private static final d a = new a();

    private a()
    {
    }

    public static d a()
    {
        return a;
    }

    public final void a(c c1, int i, int j)
    {
        for (int k = i; k <= j; k++)
        {
            for (int l = k; l > i && c1.a(l, l - 1); l--)
            {
                c1.b(l, l - 1);
            }

        }

    }

}
