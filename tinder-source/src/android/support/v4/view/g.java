// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

public final class g
{
    static class a
        implements d
    {

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

        a()
        {
        }
    }

    static class b extends a
    {

        public final void a(KeyEvent keyevent)
        {
            keyevent.startTracking();
        }

        b()
        {
        }
    }

    static final class c extends b
    {

        public final int a(int i)
        {
            return KeyEvent.normalizeMetaState(i);
        }

        public final boolean b(int i)
        {
            return KeyEvent.metaStateHasModifiers(i, 1);
        }

        public final boolean c(int i)
        {
            return KeyEvent.metaStateHasNoModifiers(i);
        }

        c()
        {
        }
    }

    static interface d
    {

        public abstract void a(KeyEvent keyevent);

        public abstract boolean b(int i);

        public abstract boolean c(int i);
    }


    static final d a;

    public static boolean a(KeyEvent keyevent)
    {
        return a.b(keyevent.getMetaState());
    }

    public static boolean b(KeyEvent keyevent)
    {
        return a.c(keyevent.getMetaState());
    }

    public static void c(KeyEvent keyevent)
    {
        a.a(keyevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new c();
        } else
        {
            a = new a();
        }
    }
}
