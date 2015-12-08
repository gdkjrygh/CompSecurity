// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


public final class h
{
    public static interface a
    {

        public abstract Object a();

        public abstract boolean a(Object obj);
    }

    public static final class b
        implements a
    {

        private final Object a[] = new Object[30];
        private int b;

        public final Object a()
        {
            if (b > 0)
            {
                int i = b - 1;
                Object obj = a[i];
                a[i] = null;
                b = b - 1;
                return obj;
            } else
            {
                return null;
            }
        }

        public final boolean a(Object obj)
        {
            int i;
            boolean flag;
            flag = false;
            i = 0;
_L8:
            if (i >= b) goto _L2; else goto _L1
_L1:
            if (a[i] != obj) goto _L4; else goto _L3
_L3:
            i = 1;
_L6:
            if (i != 0)
            {
                throw new IllegalStateException("Already in the pool!");
            }
            break; /* Loop/switch isn't completed */
_L4:
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            i = 0;
            if (true) goto _L6; else goto _L5
_L5:
            if (b < a.length)
            {
                a[b] = obj;
                b = b + 1;
                flag = true;
            }
            return flag;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public b()
        {
        }
    }

}
