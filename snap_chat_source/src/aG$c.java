// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

static final class > extends >
{

    public final bl a(Object obj, View view)
    {
        obj = ((android.view.AccessibilityDelegate)obj).getAccessibilityNodeProvider(view);
        if (obj != null)
        {
            return new bl(obj);
        } else
        {
            return null;
        }
    }

    public final Object a(aG ag)
    {
        return new <init>(new aI.a(ag) {

            private aG a;

            public final Object a(View view)
            {
                view = aG.a(view);
                if (view != null)
                {
                    return ((bl) (view)).a;
                } else
                {
                    return null;
                }
            }

            public final void a(View view, int i)
            {
                aG.a(view, i);
            }

            public final void a(View view, Object obj)
            {
                a.a(view, new bk(obj));
            }

            public final boolean a(View view, int i, Bundle bundle)
            {
                return a.a(view, i, bundle);
            }

            public final boolean a(View view, AccessibilityEvent accessibilityevent)
            {
                return a.b(view, accessibilityevent);
            }

            public final boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
            {
                return a.a(viewgroup, view, accessibilityevent);
            }

            public final void b(View view, AccessibilityEvent accessibilityevent)
            {
                a.d(view, accessibilityevent);
            }

            public final void c(View view, AccessibilityEvent accessibilityevent)
            {
                aG.c(view, accessibilityevent);
            }

            public final void d(View view, AccessibilityEvent accessibilityevent)
            {
                aG.a(view, accessibilityevent);
            }

            
            {
                a = ag;
                super();
            }
        });
    }

    public final boolean a(Object obj, View view, int i, Bundle bundle)
    {
        return ((android.view.AccessibilityDelegate)obj).performAccessibilityAction(view, i, bundle);
    }

    >()
    {
    }
}
