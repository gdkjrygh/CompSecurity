// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.c;
import android.support.v4.view.a.d;
import android.support.v4.view.a.g;
import android.support.v4.view.ad;
import android.support.v4.view.x;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class k extends android.support.v4.view.a
{
    private final class a extends d
    {

        final k b;

        public final c a(int l)
        {
            return android.support.v4.widget.k.a(b, l);
        }

        public final boolean a(int l, int i1, Bundle bundle)
        {
            return android.support.v4.widget.k.a(b, l, i1, bundle);
        }

        private a()
        {
            b = k.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final String a = android/view/View.getName();
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final int e[] = new int[2];
    private final AccessibilityManager f;
    private final View g;
    private a h;
    private int i;
    private int j;

    public k(View view)
    {
        i = 0x80000000;
        j = 0x80000000;
        if (view == null)
        {
            throw new IllegalArgumentException("View may not be null");
        } else
        {
            g = view;
            f = (AccessibilityManager)view.getContext().getSystemService("accessibility");
            return;
        }
    }

    static c a(k k1, int l)
    {
        c c1;
        switch (l)
        {
        default:
            c1 = android.support.v4.view.a.c.a();
            c1.e(true);
            c1.b(a);
            k1.a(l, c1);
            if (c1.k() == null && c1.l() == null)
            {
                throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            }
            break;

        case -1: 
            c1 = android.support.v4.view.a.c.a(k1.g);
            x.a(k1.g, c1);
            Object obj = new LinkedList();
            k1.a(((List) (obj)));
            View view1;
            for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c.a.b(c1.b, view1, l))
            {
                Integer integer = (Integer)((Iterator) (obj)).next();
                view1 = k1.g;
                l = integer.intValue();
            }

            return c1;
        }
        c1.a(k1.c);
        if (k1.c.isEmpty())
        {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i1 = c1.b();
        if ((i1 & 0x40) != 0)
        {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i1 & 0x80) != 0)
        {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c1.a(k1.g.getContext().getPackageName());
        View view = k1.g;
        c.a.a(c1.b, view, l);
        c1.b(k1.g);
        if (k1.i == l)
        {
            c1.d(true);
            c1.a(128);
        } else
        {
            c1.d(false);
            c1.a(64);
        }
        if (k1.a(k1.c))
        {
            c1.c(true);
            c1.b(k1.c);
        }
        k1.g.getLocationOnScreen(k1.e);
        l = k1.e[0];
        i1 = k1.e[1];
        k1.b.set(k1.c);
        k1.b.offset(l, i1);
        c1.d(k1.b);
        return c1;
    }

    private boolean a(int l, int i1)
    {
        if (l != 0x80000000 && f.isEnabled()) goto _L2; else goto _L1
_L1:
        android.view.ViewParent viewparent;
        return false;
_L2:
        if ((viewparent = g.getParent()) == null) goto _L1; else goto _L3
_L3:
        l;
        JVM INSTR tableswitch -1 -1: default 52
    //                   -1 104;
           goto _L4 _L5
_L4:
        AccessibilityEvent accessibilityevent;
        accessibilityevent = AccessibilityEvent.obtain(i1);
        accessibilityevent.setEnabled(true);
        accessibilityevent.setClassName(a);
        a(l, accessibilityevent);
        if (accessibilityevent.getText().isEmpty() && accessibilityevent.getContentDescription() == null)
        {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        break; /* Loop/switch isn't completed */
_L5:
        accessibilityevent = AccessibilityEvent.obtain(i1);
        x.a(g, accessibilityevent);
_L7:
        return ad.a(viewparent, g, accessibilityevent);
        accessibilityevent.setPackageName(g.getContext().getPackageName());
        g g1 = android.support.v4.view.a.a.a(accessibilityevent);
        View view = g;
        g.a.a(g1.b, view, l);
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean a(Rect rect)
    {
        if (rect == null || rect.isEmpty())
        {
            return false;
        }
        if (g.getWindowVisibility() != 0)
        {
            return false;
        }
        Object obj;
        for (obj = g.getParent(); obj instanceof View; obj = ((View) (obj)).getParent())
        {
            obj = (View)obj;
            if (x.f(((View) (obj))) <= 0.0F || ((View) (obj)).getVisibility() != 0)
            {
                return false;
            }
        }

        if (obj == null)
        {
            return false;
        }
        if (!g.getLocalVisibleRect(d))
        {
            return false;
        } else
        {
            return rect.intersect(d);
        }
    }

    static boolean a(k k1, int l, int i1, Bundle bundle)
    {
        switch (l)
        {
        default:
            switch (i1)
            {
            default:
                return k1.a();

            case 64: // '@'
            case 128: 
                switch (i1)
                {
                default:
                    return false;

                case 64: // '@'
                    if (!k1.f.isEnabled() || !android.support.v4.view.a.b.a(k1.f))
                    {
                        return false;
                    }
                    if (!k1.c(l))
                    {
                        if (k1.i != 0x80000000)
                        {
                            k1.a(k1.i, 0x10000);
                        }
                        k1.i = l;
                        k1.g.invalidate();
                        k1.a(l, 32768);
                        return true;
                    } else
                    {
                        return false;
                    }

                case 128: 
                    break;
                }
                break;
            }
            break;

        case -1: 
            return x.a(k1.g, i1, bundle);
        }
        if (k1.c(l))
        {
            k1.i = 0x80000000;
            k1.g.invalidate();
            k1.a(l, 0x10000);
            return true;
        } else
        {
            return false;
        }
    }

    private void b(int l)
    {
        if (j == l)
        {
            return;
        } else
        {
            int i1 = j;
            j = l;
            a(l, 128);
            a(i1, 256);
            return;
        }
    }

    private boolean c(int l)
    {
        return i == l;
    }

    public abstract int a(float f1, float f2);

    public final void a(int l)
    {
        a(l, 2048);
    }

    public abstract void a(int l, c c1);

    public abstract void a(int l, AccessibilityEvent accessibilityevent);

    public abstract void a(List list);

    public abstract boolean a();

    public final boolean a(MotionEvent motionevent)
    {
        boolean flag = true;
        if (f.isEnabled() && android.support.v4.view.a.b.a(f)) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        switch (motionevent.getAction())
        {
        case 8: // '\b'
        default:
            return false;

        case 7: // '\007'
        case 9: // '\t'
            int l = a(motionevent.getX(), motionevent.getY());
            b(l);
            if (l == 0x80000000)
            {
                return false;
            }
            break;

        case 10: // '\n'
            if (i != 0x80000000)
            {
                b(0x80000000);
                return true;
            } else
            {
                return false;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public d getAccessibilityNodeProvider(View view)
    {
        if (h == null)
        {
            h = new a((byte)0);
        }
        return h;
    }

}
