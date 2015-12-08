// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.widget:
//            InterceptionListener

public class VirtualAccessibilityNodeProvider extends AccessibilityNodeProvider
    implements InterceptionListener
{

    static final Field a;
    static final Method b;
    private static final Logger d = Logger.getLogger("VirtualAccessibilityNodeProvider");
    final View c;
    private final int e[] = new int[2];
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final SparseArray h = new SparseArray();
    private final SparseArray i = new SparseArray();
    private final SparseIntArray j = new SparseIntArray();

    public VirtualAccessibilityNodeProvider(View view)
    {
        c = view;
    }

    private View a(int k)
    {
        if (k == -1)
        {
            return c;
        }
        if ((0x40000000 & k) == 0)
        {
            return (View)h.get(k);
        } else
        {
            return b(k);
        }
    }

    private static void a(Rect rect, int k, int ai[])
    {
        rect.offset(ai[0] * k, ai[1] * k);
    }

    private void a(Rect rect, View view)
    {
        view.getLocationOnScreen(e);
        a(rect, -1, e);
    }

    private void a(View view, Rect rect)
    {
        view.getHitRect(rect);
        ((View)view.getParent()).getLocationOnScreen(e);
        a(rect, 1, e);
    }

    private void a(AccessibilityNodeInfo accessibilitynodeinfo, Rect rect)
    {
        accessibilitynodeinfo.setBoundsInScreen(rect);
        accessibilitynodeinfo.getBoundsInScreen(g);
        if (g.left != rect.left || g.right != rect.right)
        {
            int k = rect.left - g.left;
            int l = rect.top - g.top;
            g.offset(k + k, l + l);
            accessibilitynodeinfo.setBoundsInScreen(g);
        }
    }

    private void a(List list, String s, int k)
    {
        View view = a(k);
        if (view != null && view.getContentDescription().toString().toLowerCase(Locale.getDefault()).contains(s))
        {
            list.add(createAccessibilityNodeInfo(k));
        }
        for (int l = 0; l < j.size(); l++)
        {
            if (j.valueAt(l) == k)
            {
                a(list, s, j.keyAt(l));
            }
        }

    }

    private View b(int k)
    {
        Object obj = (WeakReference)i.get(k);
        if (obj == null)
        {
            obj = null;
        } else
        {
            View view = (View)((WeakReference) (obj)).get();
            obj = view;
            if (view == null)
            {
                i.delete(k);
                j.delete(k);
                return view;
            }
        }
        return ((View) (obj));
    }

    public final void a()
    {
        h.clear();
        i.clear();
        j.clear();
    }

    public final void a(View view)
    {
        if (view != null)
        {
            h.put(0, view);
            j.put(0, -1);
        }
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int k)
    {
        View view;
        Object obj;
        int l;
        if (k == -1)
        {
            AccessibilityNodeInfo accessibilitynodeinfo = AccessibilityNodeInfo.obtain(c);
            c.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            accessibilitynodeinfo.getBoundsInScreen(f);
            if (f.isEmpty())
            {
                a(c, f);
            }
            for (k = 0; k < h.size(); k++)
            {
                View view1 = (View)h.valueAt(k);
                accessibilitynodeinfo.addChild(view1, h.keyAt(k));
                a(view1, g);
                f.union(g);
            }

            a(accessibilitynodeinfo, f);
            a(f, (View)c.getParent());
            accessibilitynodeinfo.setBoundsInParent(f);
            return accessibilitynodeinfo;
        }
        int i1 = -1;
        obj = (View)h.get(k);
        l = i1;
        view = ((View) (obj));
        if (obj == null)
        {
            obj = b(k);
            l = i1;
            view = ((View) (obj));
            if (obj != null)
            {
                l = j.get(k);
                view = ((View) (obj));
            }
        }
        if (view == null)
        {
            return null;
        }
        obj = view.createAccessibilityNodeInfo();
        ((AccessibilityNodeInfo) (obj)).setPackageName(c.getContext().getPackageName());
        ((AccessibilityNodeInfo) (obj)).setClassName(view.getClass().getName());
        ((AccessibilityNodeInfo) (obj)).setSource(view, k);
        Object obj1;
        View view2;
        int j1;
        if (l == -1)
        {
            ((AccessibilityNodeInfo) (obj)).setParent(c, l);
        } else
        {
            ((AccessibilityNodeInfo) (obj)).setParent((View)view.getParent(), l);
        }
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        if (b != null)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l == 0) goto _L2; else goto _L3
_L3:
        obj1 = a.get(obj);
        b.invoke(obj1, new Object[0]);
        obj1 = (ViewGroup)view;
        i1 = ((ViewGroup) (obj1)).getChildCount();
        l = 0;
_L4:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        view2 = ((ViewGroup) (obj1)).getChildAt(l);
        j1 = System.identityHashCode(view2) >>> 2 | 0x40000000;
        i.put(j1, new WeakReference(view2));
        j.put(j1, k);
        ((AccessibilityNodeInfo) (obj)).addChild(view2, j1);
        l++;
        if (true) goto _L4; else goto _L2
        Exception exception;
        exception;
        d.info((new StringBuilder("Can't clear real children of node ")).append(((AccessibilityNodeInfo) (obj)).getClassName()).toString());
        exception.printStackTrace();
_L2:
        a(view, f);
        a(((AccessibilityNodeInfo) (obj)), f);
        a(f, c);
        ((AccessibilityNodeInfo) (obj)).setBoundsInParent(f);
        ((AccessibilityNodeInfo) (obj)).setVisibleToUser(true);
        return ((AccessibilityNodeInfo) (obj));
    }

    public List findAccessibilityNodeInfosByText(String s, int k)
    {
        LinkedList linkedlist = new LinkedList();
        a(linkedlist, s.toLowerCase(Locale.getDefault()), k);
        return linkedlist;
    }

    public AccessibilityNodeInfo findFocus(int k)
    {
        return super.findFocus(k);
    }

    public boolean performAction(int k, int l, Bundle bundle)
    {
        if (k == -1)
        {
            return c.performAccessibilityAction(l, bundle);
        }
        View view = a(k);
        return view != null && view.performAccessibilityAction(l, bundle);
    }

    static 
    {
        Method method;
        Field field;
        try
        {
            field = android/view/accessibility/AccessibilityNodeInfo.getDeclaredField("mChildNodeIds");
            field.setAccessible(true);
            method = field.getType().getDeclaredMethod("clear", new Class[0]);
        }
        catch (Exception exception)
        {
            field = null;
            exception = null;
        }
        a = field;
        b = method;
    }
}
