// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

public class KeyEventCompat
{

    static final KeyEventVersionImpl a;

    public static boolean a(KeyEvent keyevent)
    {
        return a.b(keyevent.getMetaState());
    }

    public static boolean a(KeyEvent keyevent, int i)
    {
        return a.a(keyevent.getMetaState(), i);
    }

    public static void b(KeyEvent keyevent)
    {
        a.a(keyevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new HoneycombKeyEventVersionImpl();
        } else
        {
            a = new BaseKeyEventVersionImpl();
        }
    }

    private class KeyEventVersionImpl
    {

        public abstract void a(KeyEvent keyevent);

        public abstract boolean a(int i, int j);

        public abstract boolean b(int i);
    }


    private class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl
    {
        private class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl
        {
            private class BaseKeyEventVersionImpl
                implements KeyEventVersionImpl
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

                BaseKeyEventVersionImpl()
                {
                }
            }


            public void a(KeyEvent keyevent)
            {
                KeyEventCompatEclair.a(keyevent);
            }

            EclairKeyEventVersionImpl()
            {
            }
        }


        public int a(int i)
        {
            return KeyEventCompatHoneycomb.a(i);
        }

        public boolean a(int i, int j)
        {
            return KeyEventCompatHoneycomb.a(i, j);
        }

        public boolean b(int i)
        {
            return KeyEventCompatHoneycomb.b(i);
        }

        HoneycombKeyEventVersionImpl()
        {
        }
    }

}
