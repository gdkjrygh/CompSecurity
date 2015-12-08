// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            h

static class eption
    implements eption
{

    private static int a(int i, int j, int k, int l, int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if ((j & k) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l |= i1;
        if ((j & l) != 0)
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (flag)
        {
            if (j != 0)
            {
                throw new IllegalArgumentException("bad arguments");
            }
            l = i & ~l;
        } else
        {
            l = i;
            if (j != 0)
            {
                return i & ~k;
            }
        }
        return l;
    }

    public int a(int i)
    {
        if ((i & 0xc0) != 0)
        {
            i |= 1;
        }
        int j = i;
        if ((i & 0x30) != 0)
        {
            j = i | 2;
        }
        return j & 0xf7;
    }

    public void a(KeyEvent keyevent)
    {
    }

    public boolean a(int i, int j)
    {
        return a(a(a(i) & 0xf7, j, 1, 64, 128), j, 2, 16, 32) == j;
    }

    public boolean b(int i)
    {
        return (a(i) & 0xf7) == 0;
    }

    eption()
    {
    }
}
