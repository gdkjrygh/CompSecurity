// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            e, a

abstract class l
    implements e.a
{
    public static class a extends d
    {

        private final int a;
        private final WeakHashMap b = new WeakHashMap();

        static int a(a a1)
        {
            return a1.a;
        }

        private android.view.View.AccessibilityDelegate d(View view)
        {
            try
            {
                view = (android.view.View.AccessibilityDelegate)view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.w("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", view);
                return null;
            }
            return view;
        }

        public void a()
        {
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (java.util.Map.Entry)iterator.next();
                View view = (View)((java.util.Map.Entry) (obj)).getKey();
        /* block-local class not found */
        class a {}

                obj = (a)((java.util.Map.Entry) (obj)).getValue();
                android.view.View.AccessibilityDelegate accessibilitydelegate = d(view);
                if (accessibilitydelegate == obj)
                {
                    view.setAccessibilityDelegate(((a) (obj)).a());
                } else
                if (accessibilitydelegate instanceof a)
                {
                    ((a)accessibilitydelegate).a(((a) (obj)));
                }
            } while (true);
            b.clear();
        }

        public void a(View view)
        {
            Object obj = d(view);
            if ((obj instanceof a) && ((a)obj).a(e()))
            {
                return;
            } else
            {
                obj = new a(((android.view.View.AccessibilityDelegate) (obj)));
                view.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (obj)));
                b.put(view, obj);
                return;
            }
        }

        public volatile void b(View view)
        {
            super.b(view);
        }

        protected String d()
        {
            return (new StringBuilder()).append(e()).append(" event when (").append(a).append(")").toString();
        }

        public a(List list, int i1, String s, h h1)
        {
            super(list, s, h1, false);
            a = i1;
        }
    }

    public static class b extends d
    {

        private final Map a = new HashMap();

        public void a()
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((TextView)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            a.clear();
        }

        public void a(View view)
        {
            if (view instanceof TextView)
            {
                view = (TextView)view;
        /* block-local class not found */
        class a {}

                a a1 = new a(view);
                TextWatcher textwatcher = (TextWatcher)a.get(view);
                if (textwatcher != null)
                {
                    view.removeTextChangedListener(textwatcher);
                }
                view.addTextChangedListener(a1);
                a.put(view, a1);
            }
        }

        public volatile void b(View view)
        {
            super.b(view);
        }

        protected String d()
        {
            return (new StringBuilder()).append(e()).append(" on Text Change").toString();
        }

        public b(List list, String s, h h1)
        {
            super(list, s, h1, true);
        }
    }

    private static class c
    {

        private boolean a(TreeMap treemap, View view, List list)
        {
            if (list.contains(view))
            {
                return false;
            }
            if (treemap.containsKey(view))
            {
                List list1 = (List)treemap.remove(view);
                list.add(view);
                int j1 = list1.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    if (!a(treemap, (View)list1.get(i1), list))
                    {
                        return false;
                    }
                }

                list.remove(view);
            }
            return true;
        }

        public boolean a(TreeMap treemap)
        {
            ArrayList arraylist = new ArrayList();
            while (!treemap.isEmpty()) 
            {
                if (!a(treemap, (View)treemap.firstKey(), ((List) (arraylist))))
                {
                    return false;
                }
            }
            return true;
        }

        private c()
        {
        }

    }

    private static abstract class d extends l
    {

        private final h a;
        private final String b;
        private final boolean c;

        protected void c(View view)
        {
            a.a(view, b, c);
        }

        protected String e()
        {
            return b;
        }

        public d(List list, String s, h h1, boolean flag)
        {
            super(list);
            a = h1;
            b = s;
            c = flag;
        }
    }

    public static class e
    {

        private final String a;
        private final String b;

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public e(String s, String s1)
        {
            a = s;
            b = s1;
        }
    }

    public static class f
    {

        public final int a;
        public final int b;
        public final int c;

        public f(int i1, int j1, int k1)
        {
            a = i1;
            b = j1;
            c = k1;
        }
    }

    public static class g extends l
    {

        private static final Set d = new HashSet(Arrays.asList(new Integer[] {
            Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(7)
        }));
        private static final Set e = new HashSet(Arrays.asList(new Integer[] {
            Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8)
        }));
        private final WeakHashMap a = new WeakHashMap();
        private final List b;
        private final String c;
        private boolean f;
        private final i g;
        private final c h = new c();

        private boolean a(Set set, SparseArray sparsearray)
        {
        /* block-local class not found */
        class _cls1 {}

            TreeMap treemap = new TreeMap(new _cls1());
            int j1 = sparsearray.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = (View)sparsearray.valueAt(i1);
                int ai[] = ((android.widget.RelativeLayout.LayoutParams)view.getLayoutParams()).getRules();
                ArrayList arraylist = new ArrayList();
                Iterator iterator = set.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    int k1 = ai[((Integer)iterator.next()).intValue()];
                    if (k1 > 0 && k1 != view.getId())
                    {
                        arraylist.add(sparsearray.get(k1));
                    }
                } while (true);
                treemap.put(view, arraylist);
            }

            return h.a(treemap);
        }

        public void a()
        {
            View view;
            android.widget.RelativeLayout.LayoutParams layoutparams;
            for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); view.setLayoutParams(layoutparams))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                view = (View)entry.getKey();
                int ai[] = (int[])entry.getValue();
                layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
                for (int i1 = 0; i1 < ai.length; i1++)
                {
                    layoutparams.addRule(i1, ai[i1]);
                }

            }

            f = false;
        }

        public void a(View view)
        {
            SparseArray sparsearray;
            int j1;
            int k1;
            view = (ViewGroup)view;
            sparsearray = new SparseArray();
            k1 = view.getChildCount();
            for (int i1 = 0; i1 < k1; i1++)
            {
                View view1 = view.getChildAt(i1);
                int l1 = view1.getId();
                if (l1 > 0)
                {
                    sparsearray.put(l1, view1);
                }
            }

            k1 = b.size();
            j1 = 0;
_L5:
            if (j1 >= k1) goto _L2; else goto _L1
_L1:
            View view2;
            view = (f)b.get(j1);
            view2 = (View)sparsearray.get(((f) (view)).a);
            if (view2 != null) goto _L4; else goto _L3
_L3:
            j1++;
              goto _L5
_L4:
            android.widget.RelativeLayout.LayoutParams layoutparams;
            int ai[];
            layoutparams = (android.widget.RelativeLayout.LayoutParams)view2.getLayoutParams();
            ai = (int[])layoutparams.getRules().clone();
            if (ai[((f) (view)).b] == ((f) (view)).c) goto _L3; else goto _L6
_L6:
            if (!a.containsKey(view2))
            {
                a.put(view2, ai);
            }
            layoutparams.addRule(((f) (view)).b, ((f) (view)).c);
            if (d.contains(Integer.valueOf(((f) (view)).b)))
            {
                view = d;
            } else
            if (e.contains(Integer.valueOf(((f) (view)).b)))
            {
                view = e;
            } else
            {
                view = null;
            }
            if (view == null || a(((Set) (view)), sparsearray))
            {
                break MISSING_BLOCK_LABEL_290;
            }
            a();
            g.a(new e("circular_dependency", c));
_L2:
            return;
            view2.setLayoutParams(layoutparams);
              goto _L3
        }

        public void b(View view)
        {
            if (f)
            {
                c().a(view, b(), this);
            }
        }

        protected String d()
        {
            return "Layout Update";
        }


        public g(List list, List list1, String s, i i1)
        {
            super(list);
            b = list1;
            c = s;
            f = true;
            g = i1;
        }
    }

    public static interface h
    {

        public abstract void a(View view, String s, boolean flag);
    }

    public static interface i
    {

        public abstract void a(e e1);
    }

    public static class j extends l
    {

        private final com.mixpanel.android.viewcrawler.a a;
        private final com.mixpanel.android.viewcrawler.a b;
        private final WeakHashMap c = new WeakHashMap();
        private final Object d[] = new Object[1];

        public void a()
        {
            Iterator iterator = c.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (java.util.Map.Entry)iterator.next();
                View view = (View)((java.util.Map.Entry) (obj)).getKey();
                obj = ((java.util.Map.Entry) (obj)).getValue();
                if (obj != null)
                {
                    d[0] = obj;
                    a.a(view, d);
                }
            } while (true);
        }

        public void a(View view)
        {
            if (b == null) goto _L2; else goto _L1
_L1:
            Object aobj[] = a.a();
            if (1 != aobj.length) goto _L2; else goto _L3
_L3:
            Object obj;
            Object obj1;
            obj1 = aobj[0];
            obj = b.a(view);
            if (obj1 != obj) goto _L5; else goto _L4
_L4:
            return;
_L5:
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!(obj1 instanceof Bitmap) || !(obj instanceof Bitmap)) goto _L7; else goto _L6
_L6:
            if (((Bitmap)obj1).sameAs((Bitmap)obj)) goto _L4; else goto _L8
_L8:
            Bitmap bitmap;
            if (!(obj instanceof Bitmap) && !(obj instanceof BitmapDrawable) && !c.containsKey(view))
            {
                d[0] = obj;
                if (a.a(d))
                {
                    c.put(view, obj);
                } else
                {
                    c.put(view, null);
                }
            }
_L2:
            a.a(view);
            return;
_L7:
            if (!(obj1 instanceof BitmapDrawable) || !(obj instanceof BitmapDrawable))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = ((BitmapDrawable)obj1).getBitmap();
            bitmap = ((BitmapDrawable)obj).getBitmap();
            if (obj1 == null || !((Bitmap) (obj1)).sameAs(bitmap)) goto _L8; else goto _L9
_L9:
            return;
            if (!obj1.equals(obj)) goto _L8; else goto _L10
_L10:
        }

        public volatile void b(View view)
        {
            b(view);
        }

        protected String d()
        {
            return "Property Mutator";
        }

        public j(List list, com.mixpanel.android.viewcrawler.a a1, com.mixpanel.android.viewcrawler.a a2)
        {
            super(list);
            a = a1;
            b = a2;
        }
    }

    public static class k extends d
    {

        private boolean a;

        public void a()
        {
        }

        public void a(View view)
        {
            if (view != null && !a)
            {
                c(view);
            }
            boolean flag;
            if (view != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        public volatile void b(View view)
        {
            super.b(view);
        }

        protected String d()
        {
            return (new StringBuilder()).append(e()).append(" when Detected").toString();
        }

        public k(List list, String s, h h1)
        {
            super(list, s, h1, false);
            a = false;
        }
    }


    private static final String c = "MixpanelAPI.ViewVisitor";
    private final List a;
    private final com.mixpanel.android.viewcrawler.e b = new com.mixpanel.android.viewcrawler.e();

    protected l(List list)
    {
        a = list;
    }

    public abstract void a();

    protected List b()
    {
        return a;
    }

    public void b(View view)
    {
        b.a(view, a, this);
    }

    protected com.mixpanel.android.viewcrawler.e c()
    {
        return b;
    }

    protected abstract String d();
}
