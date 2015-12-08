// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            y

class v
    implements y
{

    v()
    {
    }

    private static int a(int i, int j, int k, int l)
    {
        boolean flag1 = true;
        boolean flag;
        if ((j & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = k | l;
        if ((l & 1) != 0)
        {
            k = ((flag1) ? 1 : 0);
        } else
        {
            k = 0;
        }
        if (flag)
        {
            if (k != 0)
            {
                throw new IllegalArgumentException("bad arguments");
            }
            l = i & ~l;
        } else
        {
            l = i;
            if (k != 0)
            {
                return i & ~j;
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

    public boolean b(int i)
    {
        return a(a(a(i) & 0xf7, 1, 64, 128), 2, 16, 32) == 1;
    }

    public boolean c(int i)
    {
        return (a(i) & 0xf7) == 0;
    }
}
