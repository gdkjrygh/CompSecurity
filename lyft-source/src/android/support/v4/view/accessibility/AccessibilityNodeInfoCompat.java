// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;

public class AccessibilityNodeInfoCompat
{

    private static final AccessibilityNodeInfoImpl a;
    private final Object b;

    public AccessibilityNodeInfoCompat(Object obj)
    {
        b = obj;
    }

    public static AccessibilityNodeInfoCompat a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        return a(a.a(accessibilitynodeinfocompat.b));
    }

    static AccessibilityNodeInfoCompat a(Object obj)
    {
        if (obj != null)
        {
            return new AccessibilityNodeInfoCompat(obj);
        } else
        {
            return null;
        }
    }

    private static String b(int i1)
    {
        switch (i1)
        {
        default:
            return "ACTION_UNKNOWN";

        case 1: // '\001'
            return "ACTION_FOCUS";

        case 2: // '\002'
            return "ACTION_CLEAR_FOCUS";

        case 4: // '\004'
            return "ACTION_SELECT";

        case 8: // '\b'
            return "ACTION_CLEAR_SELECTION";

        case 16: // '\020'
            return "ACTION_CLICK";

        case 32: // ' '
            return "ACTION_LONG_CLICK";

        case 64: // '@'
            return "ACTION_ACCESSIBILITY_FOCUS";

        case 128: 
            return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";

        case 256: 
            return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";

        case 512: 
            return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";

        case 1024: 
            return "ACTION_NEXT_HTML_ELEMENT";

        case 2048: 
            return "ACTION_PREVIOUS_HTML_ELEMENT";

        case 4096: 
            return "ACTION_SCROLL_FORWARD";

        case 8192: 
            return "ACTION_SCROLL_BACKWARD";

        case 65536: 
            return "ACTION_CUT";

        case 16384: 
            return "ACTION_COPY";

        case 32768: 
            return "ACTION_PASTE";

        case 131072: 
            return "ACTION_SET_SELECTION";
        }
    }

    static AccessibilityNodeInfoImpl u()
    {
        return a;
    }

    public Object a()
    {
        return b;
    }

    public void a(int i1)
    {
        a.a(b, i1);
    }

    public void a(Rect rect)
    {
        a.a(b, rect);
    }

    public void a(View view)
    {
        a.c(b, view);
    }

    public void a(CharSequence charsequence)
    {
        a.c(b, charsequence);
    }

    public void a(boolean flag)
    {
        a.c(b, flag);
    }

    public boolean a(AccessibilityActionCompat accessibilityactioncompat)
    {
        return a.a(b, AccessibilityActionCompat.a(accessibilityactioncompat));
    }

    public int b()
    {
        return a.b(b);
    }

    public void b(Rect rect)
    {
        a.c(b, rect);
    }

    public void b(View view)
    {
        a.a(b, view);
    }

    public void b(CharSequence charsequence)
    {
        a.a(b, charsequence);
    }

    public void b(Object obj)
    {
        a.b(b, ((CollectionInfoCompat)obj).a);
    }

    public void b(boolean flag)
    {
        a.d(b, flag);
    }

    public void c(Rect rect)
    {
        a.b(b, rect);
    }

    public void c(View view)
    {
        a.b(b, view);
    }

    public void c(CharSequence charsequence)
    {
        a.b(b, charsequence);
    }

    public void c(Object obj)
    {
        a.c(b, CollectionItemInfoCompat.a((CollectionItemInfoCompat)obj));
    }

    public void c(boolean flag)
    {
        a.h(b, flag);
    }

    public boolean c()
    {
        return a.g(b);
    }

    public void d(Rect rect)
    {
        a.d(b, rect);
    }

    public void d(boolean flag)
    {
        a.i(b, flag);
    }

    public boolean d()
    {
        return a.h(b);
    }

    public void e(boolean flag)
    {
        a.g(b, flag);
    }

    public boolean e()
    {
        return a.k(b);
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
        obj = (AccessibilityNodeInfoCompat)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AccessibilityNodeInfoCompat) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((AccessibilityNodeInfoCompat) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public void f(boolean flag)
    {
        a.a(b, flag);
    }

    public boolean f()
    {
        return a.l(b);
    }

    public void g(boolean flag)
    {
        a.e(b, flag);
    }

    public boolean g()
    {
        return a.r(b);
    }

    public void h(boolean flag)
    {
        a.b(b, flag);
    }

    public boolean h()
    {
        return a.s(b);
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

    public void i(boolean flag)
    {
        a.f(b, flag);
    }

    public boolean i()
    {
        return a.p(b);
    }

    public boolean j()
    {
        return a.i(b);
    }

    public boolean k()
    {
        return a.m(b);
    }

    public boolean l()
    {
        return a.j(b);
    }

    public boolean m()
    {
        return a.n(b);
    }

    public boolean n()
    {
        return a.o(b);
    }

    public CharSequence o()
    {
        return a.e(b);
    }

    public CharSequence p()
    {
        return a.c(b);
    }

    public CharSequence q()
    {
        return a.f(b);
    }

    public CharSequence r()
    {
        return a.d(b);
    }

    public void s()
    {
        a.q(b);
    }

    public String t()
    {
        return a.t(b);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringbuilder.append((new StringBuilder()).append("; boundsInParent: ").append(rect).toString());
        c(rect);
        stringbuilder.append((new StringBuilder()).append("; boundsInScreen: ").append(rect).toString());
        stringbuilder.append("; packageName: ").append(o());
        stringbuilder.append("; className: ").append(p());
        stringbuilder.append("; text: ").append(q());
        stringbuilder.append("; contentDescription: ").append(r());
        stringbuilder.append("; viewId: ").append(t());
        stringbuilder.append("; checkable: ").append(c());
        stringbuilder.append("; checked: ").append(d());
        stringbuilder.append("; focusable: ").append(e());
        stringbuilder.append("; focused: ").append(f());
        stringbuilder.append("; selected: ").append(i());
        stringbuilder.append("; clickable: ").append(j());
        stringbuilder.append("; longClickable: ").append(k());
        stringbuilder.append("; enabled: ").append(l());
        stringbuilder.append("; password: ").append(m());
        stringbuilder.append((new StringBuilder()).append("; scrollable: ").append(n()).toString());
        stringbuilder.append("; [");
        int i1 = b();
        do
        {
            if (i1 == 0)
            {
                break;
            }
            int k1 = 1 << Integer.numberOfTrailingZeros(i1);
            int j1 = i1 & ~k1;
            stringbuilder.append(b(k1));
            i1 = j1;
            if (j1 != 0)
            {
                stringbuilder.append(", ");
                i1 = j1;
            }
        } while (true);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            a = new AccessibilityNodeInfoApi22Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new AccessibilityNodeInfoApi21Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new AccessibilityNodeInfoKitKatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new AccessibilityNodeInfoJellybeanMr2Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new AccessibilityNodeInfoJellybeanMr1Impl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new AccessibilityNodeInfoJellybeanImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new AccessibilityNodeInfoIcsImpl();
        } else
        {
            a = new AccessibilityNodeInfoStubImpl();
        }
    }

    private class AccessibilityNodeInfoImpl
    {

        public abstract Object a(int i1, int j1, int k1, int l1, boolean flag, boolean flag1);

        public abstract Object a(int i1, int j1, boolean flag, int k1);

        public abstract Object a(int i1, CharSequence charsequence);

        public abstract Object a(Object obj);

        public abstract void a(Object obj, int i1);

        public abstract void a(Object obj, Rect rect);

        public abstract void a(Object obj, View view);

        public abstract void a(Object obj, CharSequence charsequence);

        public abstract void a(Object obj, boolean flag);

        public abstract boolean a(Object obj, Object obj1);

        public abstract int b(Object obj);

        public abstract void b(Object obj, Rect rect);

        public abstract void b(Object obj, View view);

        public abstract void b(Object obj, CharSequence charsequence);

        public abstract void b(Object obj, Object obj1);

        public abstract void b(Object obj, boolean flag);

        public abstract CharSequence c(Object obj);

        public abstract void c(Object obj, Rect rect);

        public abstract void c(Object obj, View view);

        public abstract void c(Object obj, CharSequence charsequence);

        public abstract void c(Object obj, Object obj1);

        public abstract void c(Object obj, boolean flag);

        public abstract CharSequence d(Object obj);

        public abstract void d(Object obj, Rect rect);

        public abstract void d(Object obj, boolean flag);

        public abstract CharSequence e(Object obj);

        public abstract void e(Object obj, boolean flag);

        public abstract CharSequence f(Object obj);

        public abstract void f(Object obj, boolean flag);

        public abstract void g(Object obj, boolean flag);

        public abstract boolean g(Object obj);

        public abstract void h(Object obj, boolean flag);

        public abstract boolean h(Object obj);

        public abstract void i(Object obj, boolean flag);

        public abstract boolean i(Object obj);

        public abstract boolean j(Object obj);

        public abstract boolean k(Object obj);

        public abstract boolean l(Object obj);

        public abstract boolean m(Object obj);

        public abstract boolean n(Object obj);

        public abstract boolean o(Object obj);

        public abstract boolean p(Object obj);

        public abstract void q(Object obj);

        public abstract boolean r(Object obj);

        public abstract boolean s(Object obj);

        public abstract String t(Object obj);
    }


    private class AccessibilityActionCompat
    {

        public static final AccessibilityActionCompat a = new AccessibilityActionCompat(1, null);
        public static final AccessibilityActionCompat b = new AccessibilityActionCompat(2, null);
        public static final AccessibilityActionCompat c = new AccessibilityActionCompat(4, null);
        public static final AccessibilityActionCompat d = new AccessibilityActionCompat(8, null);
        public static final AccessibilityActionCompat e = new AccessibilityActionCompat(16, null);
        public static final AccessibilityActionCompat f = new AccessibilityActionCompat(32, null);
        public static final AccessibilityActionCompat g = new AccessibilityActionCompat(64, null);
        public static final AccessibilityActionCompat h = new AccessibilityActionCompat(128, null);
        public static final AccessibilityActionCompat i = new AccessibilityActionCompat(256, null);
        public static final AccessibilityActionCompat j = new AccessibilityActionCompat(512, null);
        public static final AccessibilityActionCompat k = new AccessibilityActionCompat(1024, null);
        public static final AccessibilityActionCompat l = new AccessibilityActionCompat(2048, null);
        public static final AccessibilityActionCompat m = new AccessibilityActionCompat(4096, null);
        public static final AccessibilityActionCompat n = new AccessibilityActionCompat(8192, null);
        public static final AccessibilityActionCompat o = new AccessibilityActionCompat(16384, null);
        public static final AccessibilityActionCompat p = new AccessibilityActionCompat(32768, null);
        public static final AccessibilityActionCompat q = new AccessibilityActionCompat(0x10000, null);
        public static final AccessibilityActionCompat r = new AccessibilityActionCompat(0x20000, null);
        public static final AccessibilityActionCompat s = new AccessibilityActionCompat(0x40000, null);
        public static final AccessibilityActionCompat t = new AccessibilityActionCompat(0x80000, null);
        public static final AccessibilityActionCompat u = new AccessibilityActionCompat(0x100000, null);
        public static final AccessibilityActionCompat v = new AccessibilityActionCompat(0x200000, null);
        private final Object w;

        static Object a(AccessibilityActionCompat accessibilityactioncompat)
        {
            return accessibilityactioncompat.w;
        }


        public AccessibilityActionCompat(int i1, CharSequence charsequence)
        {
            this(AccessibilityNodeInfoCompat.u().a(i1, charsequence));
        }

        private AccessibilityActionCompat(Object obj)
        {
            w = obj;
        }
    }


    private class CollectionInfoCompat
    {

        final Object a;

        public static CollectionInfoCompat a(int i1, int j1, boolean flag, int k1)
        {
            return new CollectionInfoCompat(AccessibilityNodeInfoCompat.u().a(i1, j1, flag, k1));
        }

        private CollectionInfoCompat(Object obj)
        {
            a = obj;
        }
    }


    private class CollectionItemInfoCompat
    {

        private final Object a;

        public static CollectionItemInfoCompat a(int i1, int j1, int k1, int l1, boolean flag, boolean flag1)
        {
            return new CollectionItemInfoCompat(AccessibilityNodeInfoCompat.u().a(i1, j1, k1, l1, flag, flag1));
        }

        static Object a(CollectionItemInfoCompat collectioniteminfocompat)
        {
            return collectioniteminfocompat.a;
        }

        private CollectionItemInfoCompat(Object obj)
        {
            a = obj;
        }
    }


    private class AccessibilityNodeInfoApi22Impl extends AccessibilityNodeInfoApi21Impl
    {
        private class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl
        {
            private class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl
            {
                private class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanMr1Impl
                {
                    private class AccessibilityNodeInfoJellybeanMr1Impl extends AccessibilityNodeInfoJellybeanImpl
                    {
                        private class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl
                        {
                            private class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl
                            {
                                private class AccessibilityNodeInfoStubImpl
                                    implements AccessibilityNodeInfoImpl
                                {

                                    public Object a(int i1, int j1, int k1, int l1, boolean flag, boolean flag1)
                                    {
                                        return null;
                                    }

                                    public Object a(int i1, int j1, boolean flag, int k1)
                                    {
                                        return null;
                                    }

                                    public Object a(int i1, CharSequence charsequence)
                                    {
                                        return null;
                                    }

                                    public Object a(Object obj)
                                    {
                                        return null;
                                    }

                                    public void a(Object obj, int i1)
                                    {
                                    }

                                    public void a(Object obj, Rect rect)
                                    {
                                    }

                                    public void a(Object obj, View view)
                                    {
                                    }

                                    public void a(Object obj, CharSequence charsequence)
                                    {
                                    }

                                    public void a(Object obj, boolean flag)
                                    {
                                    }

                                    public boolean a(Object obj, Object obj1)
                                    {
                                        return false;
                                    }

                                    public int b(Object obj)
                                    {
                                        return 0;
                                    }

                                    public void b(Object obj, Rect rect)
                                    {
                                    }

                                    public void b(Object obj, View view)
                                    {
                                    }

                                    public void b(Object obj, CharSequence charsequence)
                                    {
                                    }

                                    public void b(Object obj, Object obj1)
                                    {
                                    }

                                    public void b(Object obj, boolean flag)
                                    {
                                    }

                                    public CharSequence c(Object obj)
                                    {
                                        return null;
                                    }

                                    public void c(Object obj, Rect rect)
                                    {
                                    }

                                    public void c(Object obj, View view)
                                    {
                                    }

                                    public void c(Object obj, CharSequence charsequence)
                                    {
                                    }

                                    public void c(Object obj, Object obj1)
                                    {
                                    }

                                    public void c(Object obj, boolean flag)
                                    {
                                    }

                                    public CharSequence d(Object obj)
                                    {
                                        return null;
                                    }

                                    public void d(Object obj, Rect rect)
                                    {
                                    }

                                    public void d(Object obj, boolean flag)
                                    {
                                    }

                                    public CharSequence e(Object obj)
                                    {
                                        return null;
                                    }

                                    public void e(Object obj, boolean flag)
                                    {
                                    }

                                    public CharSequence f(Object obj)
                                    {
                                        return null;
                                    }

                                    public void f(Object obj, boolean flag)
                                    {
                                    }

                                    public void g(Object obj, boolean flag)
                                    {
                                    }

                                    public boolean g(Object obj)
                                    {
                                        return false;
                                    }

                                    public void h(Object obj, boolean flag)
                                    {
                                    }

                                    public boolean h(Object obj)
                                    {
                                        return false;
                                    }

                                    public void i(Object obj, boolean flag)
                                    {
                                    }

                                    public boolean i(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean j(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean k(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean l(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean m(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean n(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean o(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean p(Object obj)
                                    {
                                        return false;
                                    }

                                    public void q(Object obj)
                                    {
                                    }

                                    public boolean r(Object obj)
                                    {
                                        return false;
                                    }

                                    public boolean s(Object obj)
                                    {
                                        return false;
                                    }

                                    public String t(Object obj)
                                    {
                                        return null;
                                    }

                                    AccessibilityNodeInfoStubImpl()
                                    {
                                    }
                                }


                                public Object a(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.a(obj);
                                }

                                public void a(Object obj, int i1)
                                {
                                    AccessibilityNodeInfoCompatIcs.a(obj, i1);
                                }

                                public void a(Object obj, Rect rect)
                                {
                                    AccessibilityNodeInfoCompatIcs.a(obj, rect);
                                }

                                public void a(Object obj, View view)
                                {
                                    AccessibilityNodeInfoCompatIcs.a(obj, view);
                                }

                                public void a(Object obj, CharSequence charsequence)
                                {
                                    AccessibilityNodeInfoCompatIcs.a(obj, charsequence);
                                }

                                public void a(Object obj, boolean flag)
                                {
                                    AccessibilityNodeInfoCompatIcs.a(obj, flag);
                                }

                                public int b(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.b(obj);
                                }

                                public void b(Object obj, Rect rect)
                                {
                                    AccessibilityNodeInfoCompatIcs.b(obj, rect);
                                }

                                public void b(Object obj, View view)
                                {
                                    AccessibilityNodeInfoCompatIcs.b(obj, view);
                                }

                                public void b(Object obj, CharSequence charsequence)
                                {
                                    AccessibilityNodeInfoCompatIcs.b(obj, charsequence);
                                }

                                public void b(Object obj, boolean flag)
                                {
                                    AccessibilityNodeInfoCompatIcs.b(obj, flag);
                                }

                                public CharSequence c(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.c(obj);
                                }

                                public void c(Object obj, Rect rect)
                                {
                                    AccessibilityNodeInfoCompatIcs.c(obj, rect);
                                }

                                public void c(Object obj, View view)
                                {
                                    AccessibilityNodeInfoCompatIcs.c(obj, view);
                                }

                                public void c(Object obj, CharSequence charsequence)
                                {
                                    AccessibilityNodeInfoCompatIcs.c(obj, charsequence);
                                }

                                public void c(Object obj, boolean flag)
                                {
                                    AccessibilityNodeInfoCompatIcs.c(obj, flag);
                                }

                                public CharSequence d(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.d(obj);
                                }

                                public void d(Object obj, Rect rect)
                                {
                                    AccessibilityNodeInfoCompatIcs.d(obj, rect);
                                }

                                public void d(Object obj, boolean flag)
                                {
                                    AccessibilityNodeInfoCompatIcs.d(obj, flag);
                                }

                                public CharSequence e(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.e(obj);
                                }

                                public void e(Object obj, boolean flag)
                                {
                                    AccessibilityNodeInfoCompatIcs.e(obj, flag);
                                }

                                public CharSequence f(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.f(obj);
                                }

                                public void f(Object obj, boolean flag)
                                {
                                    AccessibilityNodeInfoCompatIcs.f(obj, flag);
                                }

                                public void g(Object obj, boolean flag)
                                {
                                    AccessibilityNodeInfoCompatIcs.g(obj, flag);
                                }

                                public boolean g(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.g(obj);
                                }

                                public boolean h(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.h(obj);
                                }

                                public boolean i(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.i(obj);
                                }

                                public boolean j(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.j(obj);
                                }

                                public boolean k(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.k(obj);
                                }

                                public boolean l(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.l(obj);
                                }

                                public boolean m(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.m(obj);
                                }

                                public boolean n(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.n(obj);
                                }

                                public boolean o(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.o(obj);
                                }

                                public boolean p(Object obj)
                                {
                                    return AccessibilityNodeInfoCompatIcs.p(obj);
                                }

                                public void q(Object obj)
                                {
                                    AccessibilityNodeInfoCompatIcs.q(obj);
                                }

                                AccessibilityNodeInfoIcsImpl()
                                {
                                }
                            }


                            public void h(Object obj, boolean flag)
                            {
                                AccessibilityNodeInfoCompatJellyBean.a(obj, flag);
                            }

                            public void i(Object obj, boolean flag)
                            {
                                AccessibilityNodeInfoCompatJellyBean.b(obj, flag);
                            }

                            public boolean r(Object obj)
                            {
                                return AccessibilityNodeInfoCompatJellyBean.a(obj);
                            }

                            public boolean s(Object obj)
                            {
                                return AccessibilityNodeInfoCompatJellyBean.b(obj);
                            }

                            AccessibilityNodeInfoJellybeanImpl()
                            {
                            }
                        }


                        AccessibilityNodeInfoJellybeanMr1Impl()
                        {
                        }
                    }


                    public String t(Object obj)
                    {
                        return AccessibilityNodeInfoCompatJellybeanMr2.a(obj);
                    }

                    AccessibilityNodeInfoJellybeanMr2Impl()
                    {
                    }
                }


                public Object a(int i1, int j1, int k1, int l1, boolean flag, boolean flag1)
                {
                    return AccessibilityNodeInfoCompatKitKat.a(i1, j1, k1, l1, flag);
                }

                public Object a(int i1, int j1, boolean flag, int k1)
                {
                    return AccessibilityNodeInfoCompatKitKat.a(i1, j1, flag, k1);
                }

                public void b(Object obj, Object obj1)
                {
                    AccessibilityNodeInfoCompatKitKat.a(obj, obj1);
                }

                public void c(Object obj, Object obj1)
                {
                    AccessibilityNodeInfoCompatKitKat.b(obj, obj1);
                }

                AccessibilityNodeInfoKitKatImpl()
                {
                }
            }


            public Object a(int i1, int j1, int k1, int l1, boolean flag, boolean flag1)
            {
                return AccessibilityNodeInfoCompatApi21.a(i1, j1, k1, l1, flag, flag1);
            }

            public Object a(int i1, int j1, boolean flag, int k1)
            {
                return AccessibilityNodeInfoCompatApi21.a(i1, j1, flag, k1);
            }

            public Object a(int i1, CharSequence charsequence)
            {
                return AccessibilityNodeInfoCompatApi21.a(i1, charsequence);
            }

            public boolean a(Object obj, Object obj1)
            {
                return AccessibilityNodeInfoCompatApi21.a(obj, obj1);
            }

            AccessibilityNodeInfoApi21Impl()
            {
            }
        }


        AccessibilityNodeInfoApi22Impl()
        {
        }
    }

}
