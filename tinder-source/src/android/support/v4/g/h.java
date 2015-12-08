// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.g;


public final class h
{
    public static interface a
    {

        public abstract Object a();

        public abstract boolean a(Object obj);
    }

    public static class b
        implements a
    {

        private final Object a[];
        private int b;

        public Object a()
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

        public boolean a(Object obj)
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

        public b(int i)
        {
            if (i <= 0)
            {
                throw new IllegalArgumentException("The max pool size must be > 0");
            } else
            {
                a = new Object[i];
                return;
            }
        }
    }

    public static final class c extends b
    {

        private final Object a = new Object();

        public final Object a()
        {
            Object obj1;
            synchronized (a)
            {
                obj1 = super.a();
            }
            return obj1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final boolean a(Object obj)
        {
            boolean flag;
            synchronized (a)
            {
                flag = super.a(obj);
            }
            return flag;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public c()
        {
            super(10);
        }
    }

}
