// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


public class AccessibilityRecordCompat
{

    private static final AccessibilityRecordImpl a;
    private final Object b;

    public AccessibilityRecordCompat(Object obj)
    {
        b = obj;
    }

    public static AccessibilityRecordCompat a()
    {
        return new AccessibilityRecordCompat(a.a());
    }

    public void a(int i)
    {
        a.b(b, i);
    }

    public void a(boolean flag)
    {
        a.a(b, flag);
    }

    public void b(int i)
    {
        a.a(b, i);
    }

    public void c(int i)
    {
        a.e(b, i);
    }

    public void d(int i)
    {
        a.c(b, i);
    }

    public void e(int i)
    {
        a.d(b, i);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (AccessibilityRecordCompat)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AccessibilityRecordCompat) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((AccessibilityRecordCompat) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public void f(int i)
    {
        a.f(b, i);
    }

    public void g(int i)
    {
        a.g(b, i);
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new AccessibilityRecordJellyBeanImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            a = new AccessibilityRecordIcsMr1Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new AccessibilityRecordIcsImpl();
        } else
        {
            a = new AccessibilityRecordStubImpl();
        }
    }

    private class AccessibilityRecordImpl
    {

        public abstract Object a();

        public abstract void a(Object obj, int i);

        public abstract void a(Object obj, boolean flag);

        public abstract void b(Object obj, int i);

        public abstract void c(Object obj, int i);

        public abstract void d(Object obj, int i);

        public abstract void e(Object obj, int i);

        public abstract void f(Object obj, int i);

        public abstract void g(Object obj, int i);
    }


    private class AccessibilityRecordJellyBeanImpl extends AccessibilityRecordIcsMr1Impl
    {
        private class AccessibilityRecordIcsMr1Impl extends AccessibilityRecordIcsImpl
        {
            private class AccessibilityRecordIcsImpl extends AccessibilityRecordStubImpl
            {
                private class AccessibilityRecordStubImpl
                    implements AccessibilityRecordImpl
                {

                    public Object a()
                    {
                        return null;
                    }

                    public void a(Object obj, int i)
                    {
                    }

                    public void a(Object obj, boolean flag)
                    {
                    }

                    public void b(Object obj, int i)
                    {
                    }

                    public void c(Object obj, int i)
                    {
                    }

                    public void d(Object obj, int i)
                    {
                    }

                    public void e(Object obj, int i)
                    {
                    }

                    public void f(Object obj, int i)
                    {
                    }

                    public void g(Object obj, int i)
                    {
                    }

                    AccessibilityRecordStubImpl()
                    {
                    }
                }


                public Object a()
                {
                    return AccessibilityRecordCompatIcs.a();
                }

                public void a(Object obj, int i)
                {
                    AccessibilityRecordCompatIcs.a(obj, i);
                }

                public void a(Object obj, boolean flag)
                {
                    AccessibilityRecordCompatIcs.a(obj, flag);
                }

                public void b(Object obj, int i)
                {
                    AccessibilityRecordCompatIcs.b(obj, i);
                }

                public void c(Object obj, int i)
                {
                    AccessibilityRecordCompatIcs.c(obj, i);
                }

                public void d(Object obj, int i)
                {
                    AccessibilityRecordCompatIcs.d(obj, i);
                }

                public void e(Object obj, int i)
                {
                    AccessibilityRecordCompatIcs.e(obj, i);
                }

                AccessibilityRecordIcsImpl()
                {
                }
            }


            public void f(Object obj, int i)
            {
                AccessibilityRecordCompatIcsMr1.a(obj, i);
            }

            public void g(Object obj, int i)
            {
                AccessibilityRecordCompatIcsMr1.b(obj, i);
            }

            AccessibilityRecordIcsMr1Impl()
            {
            }
        }


        AccessibilityRecordJellyBeanImpl()
        {
        }
    }

}
