// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public final class g
{
    static class a extends e
    {

        public final Object a()
        {
            return AccessibilityRecord.obtain();
        }

        public final void a(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setFromIndex(i);
        }

        public final void a(Object obj, boolean flag)
        {
            ((AccessibilityRecord)obj).setScrollable(flag);
        }

        public final void b(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setItemCount(i);
        }

        public final void c(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setScrollX(i);
        }

        public final void d(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setScrollY(i);
        }

        public final void e(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setToIndex(i);
        }

        a()
        {
        }
    }

    static class b extends a
    {

        public final void f(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setMaxScrollX(i);
        }

        public final void g(Object obj, int i)
        {
            ((AccessibilityRecord)obj).setMaxScrollY(i);
        }

        b()
        {
        }
    }

    public static interface c
    {

        public abstract Object a();

        public abstract void a(Object obj, int i);

        public abstract void a(Object obj, View view, int i);

        public abstract void a(Object obj, boolean flag);

        public abstract void b(Object obj, int i);

        public abstract void c(Object obj, int i);

        public abstract void d(Object obj, int i);

        public abstract void e(Object obj, int i);

        public abstract void f(Object obj, int i);

        public abstract void g(Object obj, int i);
    }

    static final class d extends b
    {

        public final void a(Object obj, View view, int i)
        {
            ((AccessibilityRecord)obj).setSource(view, i);
        }

        d()
        {
        }
    }

    static class e
        implements c
    {

        public Object a()
        {
            return null;
        }

        public void a(Object obj, int i)
        {
        }

        public void a(Object obj, View view, int i)
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

        e()
        {
        }
    }


    public static final c a;
    public final Object b;

    public g(Object obj)
    {
        b = obj;
    }

    public static g a()
    {
        return new g(a.a());
    }

    public final void a(int i)
    {
        a.b(b, i);
    }

    public final void a(boolean flag)
    {
        a.a(b, flag);
    }

    public final void b(int i)
    {
        a.a(b, i);
    }

    public final void c(int i)
    {
        a.e(b, i);
    }

    public final boolean equals(Object obj)
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
        obj = (g)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((g) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((g) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
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
            a = new d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            a = new b();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new a();
        } else
        {
            a = new e();
        }
    }
}
