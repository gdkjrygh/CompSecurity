// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            KeyEventCompatEclair, KeyEventCompatHoneycomb

public class KeyEventCompat
{
    static class BaseKeyEventVersionImpl
        implements KeyEventVersionImpl
    {

        private static int metaStateFilterDirectionalModifiers(int i, int j, int k, int l, int i1)
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

        public boolean metaStateHasModifiers(int i, int j)
        {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & 0xf7, j, 1, 64, 128), j, 2, 16, 32) == j;
        }

        public boolean metaStateHasNoModifiers(int i)
        {
            return (normalizeMetaState(i) & 0xf7) == 0;
        }

        public int normalizeMetaState(int i)
        {
            int j = i;
            if ((i & 0xc0) != 0)
            {
                j = i | 1;
            }
            i = j;
            if ((j & 0x30) != 0)
            {
                i = j | 2;
            }
            return i & 0xf7;
        }

        public void startTracking(KeyEvent keyevent)
        {
        }

        BaseKeyEventVersionImpl()
        {
        }
    }

    static class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl
    {

        public void startTracking(KeyEvent keyevent)
        {
            KeyEventCompatEclair.startTracking(keyevent);
        }

        EclairKeyEventVersionImpl()
        {
        }
    }

    static class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl
    {

        public boolean metaStateHasModifiers(int i, int j)
        {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(i, j);
        }

        public boolean metaStateHasNoModifiers(int i)
        {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i);
        }

        public int normalizeMetaState(int i)
        {
            return KeyEventCompatHoneycomb.normalizeMetaState(i);
        }

        HoneycombKeyEventVersionImpl()
        {
        }
    }

    static interface KeyEventVersionImpl
    {

        public abstract boolean metaStateHasModifiers(int i, int j);

        public abstract boolean metaStateHasNoModifiers(int i);

        public abstract void startTracking(KeyEvent keyevent);
    }


    static final KeyEventVersionImpl IMPL;

    public static boolean hasModifiers(KeyEvent keyevent, int i)
    {
        return IMPL.metaStateHasModifiers(keyevent.getMetaState(), i);
    }

    public static boolean hasNoModifiers(KeyEvent keyevent)
    {
        return IMPL.metaStateHasNoModifiers(keyevent.getMetaState());
    }

    public static void startTracking(KeyEvent keyevent)
    {
        IMPL.startTracking(keyevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else
        {
            IMPL = new BaseKeyEventVersionImpl();
        }
    }
}
