// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;


// Referenced classes of package com.google.android.m4b.maps.bv:
//            ab

static final class 
{

    final int a[] = new int[400];
    final int b[] = new int[100];
    final int c[] = new int[100];
    int d;
    int e;
    int f;

    public final int a(int i, int j)
    {
        int ai[] = a;
        for (int k = d - 1; k >= 0; k--)
        {
            int l = k * 4;
            if (ai[l] <= i && ai[l + 1] <= j && i < ai[l + 2] && j < ai[l + 3])
            {
                return b[k];
            }
        }

        return -1;
    }

    public ()
    {
    }
}
