// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bk, t, s, g

public final class d
{

    public static int a(a a1)
    {
        if (a1 == null)
        {
            return 0;
        } else
        {
            return com.google.android.m4b.maps.ak.a.b();
        }
    }

    public static int a(bk bk1)
    {
        if (bk1 == null)
        {
            return 0;
        } else
        {
            return bk1.b();
        }
    }

    public static int a(g g)
    {
        return g != null ? 24 : 0;
    }

    public static int a(t t1)
    {
        boolean flag = false;
        if (t1 == null)
        {
            return 0;
        }
        int k;
        int i1;
        if (t1.b == null)
        {
            k = 0;
        } else
        {
            k = t1.b.length * 4;
        }
        if (t1.c != null)
        {
            s as[] = t1.c;
            int j1 = as.length;
            int l = 0;
            int i = 0;
            do
            {
                i1 = i;
                if (l >= j1)
                {
                    break;
                }
                i1 = as[l].b();
                l++;
                i = i1 + i;
            } while (true);
        } else
        {
            i1 = 0;
        }
        t1 = t1.f;
        int j;
        if (t1 == null)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = t1.b();
        }
        return j + (k + 60 + i1);
    }

    public static int a(String s1)
    {
        if (s1 == null)
        {
            return 0;
        } else
        {
            return ((s1.length() + 1) / 4) * 4 * 2 + 40;
        }
    }

    public static void a(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = (byte)(i >> 24);
        j = k + 1;
        abyte0[k] = (byte)(i >> 16);
        abyte0[j] = (byte)(i >> 8);
        abyte0[j + 1] = (byte)i;
    }

    public static boolean a(int i, int j)
    {
        return (i & j) != 0;
    }
}
