// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Handler;
import android.support.v4.app.m;
import android.support.v4.view.ViewPager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            cv, ca, gg, shelduck, 
//            hi, ci, j, gs, 
//            gl, hk, gk

public final class gj
{

    private static HashMap a = new HashMap();

    public static int a()
    {
        return 0x17ccbc37;
    }

    public static int a(View view)
    {
label0:
        {
            int i;
            try
            {
                view = (ViewGroup)view.getParent();
                if (view == cv.a().j)
                {
                    break label0;
                }
                if (ca.a().c.containsKey(Integer.valueOf(view.getId())))
                {
                    return view.getId();
                }
                i = a(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return -2;
            }
            return i;
        }
        return -2;
    }

    private static int a(ViewGroup viewgroup)
    {
        int i;
        int k;
        i = 0;
        k = i;
        if (viewgroup.getId() <= 0) goto _L2; else goto _L1
_L1:
        k = i;
        if (0x7fffffff - viewgroup.getId() <= 1000) goto _L3; else goto _L2
_L2:
        k = i;
        i = viewgroup.getId() + 1000;
_L4:
        int l;
        k = i;
        l = i;
        if (viewgroup.findViewById(i) == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        k = i;
        l = i;
        if (viewgroup.findViewById(i) instanceof gg)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        l = i;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        i--;
          goto _L4
_L3:
        k = i;
        i = viewgroup.getId();
        i -= 1000;
          goto _L4
        viewgroup;
        l = k;
        return l;
    }

    public static void a(int i)
    {
        Pair pair;
        boolean flag;
        try
        {
            flag = ca.a().c.containsKey(Integer.valueOf(i));
            pair = (Pair)ca.a().c.remove(Integer.valueOf(i));
        }
        catch (Exception exception)
        {
            gs.b("VP remove:", exception);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        (new JSONObject()).putOpt("fragment", Boolean.valueOf(true));
        if (!hi.a(shelduck.a))
        {
            ci.b().d.a("viewDisappeared", ((Pair)j.b().get(Integer.valueOf(i))).first, null);
            j.a(i);
        }
        ca.a().b.add(pair.second);
    }

    public static void a(int i, ViewGroup viewgroup, Object obj)
    {
        gg gg1 = new gg(ci.b().u);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 0);
        gg1.setId(i);
        if (obj != null)
        {
            gg1.setTag(obj);
        }
        gg1.setLayoutParams(layoutparams);
        viewgroup.addView(gg1);
    }

    static void a(int i, Object obj, String s)
    {
        try
        {
            if (!ca.a().c.containsKey(Integer.valueOf(i)) || ca.a().c.containsKey(Integer.valueOf(i)) && !((String)((Pair)ca.a().c.get(Integer.valueOf(i))).second).equals(obj))
            {
                ca.a().c.put(Integer.valueOf(i), new Pair(ci.b().v.getClass().getSimpleName(), obj));
                JSONObject jsonobject = new JSONObject();
                jsonobject.putOpt("fragment", Boolean.valueOf(true));
                if (!hi.a(shelduck.a))
                {
                    ci.b().d.a("viewAppeared", s, jsonobject);
                }
                ci.b().e();
                ca.a().b.add((String)obj);
                j.b().put(Integer.valueOf(i), new Pair(s, Long.valueOf(System.currentTimeMillis())));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("adding vp: ", ((Exception) (obj)));
        }
    }

    public static void a(ViewGroup viewgroup, ViewGroup viewgroup1, int i, String s, String s1, boolean flag, boolean flag1)
    {
        if (viewgroup1.findViewWithTag(s) != null) goto _L2; else goto _L1
_L1:
        if (a.containsKey(s) && ((Boolean)a.get(s)).booleanValue())
        {
            return;
        }
        int k;
        a.put(s, Boolean.valueOf(true));
        k = a(viewgroup1);
        (new Handler()).postDelayed(new gl(k, viewgroup1, s), 10L);
        if (viewgroup1.findViewById(k) == null) goto _L4; else goto _L3
_L3:
        k = 0;
_L9:
        if (k >= viewgroup1.getChildCount()) goto _L4; else goto _L5
_L5:
        if (!(viewgroup1.getChildAt(k) instanceof gg)) goto _L7; else goto _L6
_L6:
        viewgroup1.removeView(viewgroup1.getChildAt(k));
        viewgroup1.invalidate();
_L4:
        a(i, true);
        b(i, s, s1);
        a.put(s, Boolean.valueOf(false));
        hk.c(cv.a().j);
        return;
_L2:
        if (viewgroup1.getVisibility() == 8 || flag)
        {
            try
            {
                if (viewgroup.getParent() instanceof ViewGroup)
                {
                    a(i, true);
                    a((ViewGroup)viewgroup.getParent(), true, new AtomicBoolean());
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                return;
            }
        }
        if (!flag1 || flag)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        if ((viewgroup.getParent() instanceof ViewGroup) && a(((ViewGroup)viewgroup.getParent()).getId(), true))
        {
            b(i, s, s1);
        }
        return;
_L7:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static void a(Object obj, String s)
    {
        int i = 1;
        while (i < ((ViewGroup)obj).getChildCount()) 
        {
            Object obj1 = ((ViewGroup)obj).getChildAt(i);
            if (!(obj1 instanceof ViewGroup) || ((View) (obj1)).getId() == 0x17ccbc37)
            {
                continue;
            }
            obj1 = (ViewGroup)obj1;
            if (((ViewGroup) (obj1)).findViewById(0x17ccbc36) == null)
            {
                a(0x17ccbc36, ((ViewGroup) (obj1)), s);
                try
                {
                    hk.c((ViewGroup)((ViewGroup) (obj1)).getParent());
                }
                catch (Exception exception) { }
            }
            i++;
        }
    }

    public static boolean a(int i, boolean flag)
    {
        try
        {
            if (!ca.a().c.containsKey(Integer.valueOf(i)))
            {
                break MISSING_BLOCK_LABEL_111;
            }
        }
        catch (Exception exception)
        {
            gs.b("fragment removal:", exception);
            return false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        ca.a().c.remove(Integer.valueOf(i));
        if (j.b().containsKey(Integer.valueOf(i)))
        {
            (new JSONObject()).putOpt("fragment", Boolean.valueOf(true));
            if (!hi.a(shelduck.a))
            {
                ci.b().d.a("viewDisappeared", ((Pair)j.b().get(Integer.valueOf(i))).first, null);
                j.a(i);
            }
        }
        return true;
        return false;
    }

    public static boolean a(ViewGroup viewgroup, boolean flag, AtomicBoolean atomicboolean)
    {
        if (!ci.b().r)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        if (ci.b().v == null || viewgroup.findViewById(a(viewgroup)) != null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        if (android.os.Build.VERSION.SDK_INT < 11 || hi.a(shelduck.r) || ci.b().v.getFragmentManager().findFragmentById(viewgroup.getId()) == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        viewgroup.removeOnLayoutChangeListener(ca.a().d);
        viewgroup.addOnLayoutChangeListener(ca.a().d);
        hk.c(viewgroup);
        return false;
        if (hi.a(shelduck.p) || hi.a(shelduck.q) || !Class.forName("android.support.v4.view.ViewPager").isInstance(viewgroup))
        {
            break MISSING_BLOCK_LABEL_151;
        }
        atomicboolean = (ViewPager)viewgroup;
        android.support.v4.view.t t = atomicboolean.getAdapter();
        viewgroup.getViewTreeObserver().addOnGlobalLayoutListener(new gk(atomicboolean, t, viewgroup));
        return false;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        flag = hi.a(shelduck.q);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        m m1 = (m)ci.b().v.getClass().getMethod("getSupportFragmentManager", new Class[0]).invoke(ci.b().v, new Object[0]);
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        try
        {
            if (!atomicboolean.get())
            {
                m1.b();
                atomicboolean.set(true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (AtomicBoolean atomicboolean) { }
        try
        {
            if (m1.a(viewgroup.getId()) == null)
            {
                break MISSING_BLOCK_LABEL_306;
            }
            viewgroup.removeOnLayoutChangeListener(ca.a().e);
            viewgroup.addOnLayoutChangeListener(ca.a().e);
            hk.c(viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            return true;
        }
        return false;
        return true;
        viewgroup;
        if (!(viewgroup instanceof Exception))
        {
            break MISSING_BLOCK_LABEL_287;
        }
        viewgroup = (Exception)viewgroup;
_L1:
        gs.b("F sup: ", viewgroup);
        return false;
        viewgroup = new Exception();
          goto _L1
        viewgroup;
        gs.b("fragstuff", viewgroup);
        return false;
        return false;
    }

    static HashMap b()
    {
        return a;
    }

    private static void b(int i, Object obj, String s)
    {
        HashMap hashmap;
        String s1;
        StringBuilder stringbuilder;
        if (ca.a().c.containsKey(Integer.valueOf(i)) && (!ca.a().c.containsKey(Integer.valueOf(i)) || ((String)((Pair)ca.a().c.get(Integer.valueOf(i))).second).equals(obj)))
        {
            break MISSING_BLOCK_LABEL_237;
        }
        hashmap = ca.a().c;
        s1 = ci.b().v.getClass().getSimpleName();
        stringbuilder = (new StringBuilder()).append(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj = "";
_L1:
        try
        {
            hashmap.put(Integer.valueOf(i), new Pair(s1, stringbuilder.append(((String) (obj))).toString()));
            obj = new JSONObject();
            ((JSONObject) (obj)).putOpt("fragment", Boolean.valueOf(true));
            if (!hi.a(shelduck.a))
            {
                ci.b().d.a("viewAppeared", s, ((JSONObject) (obj)));
            }
            ci.b().e();
            j.b().put(Integer.valueOf(i), new Pair(s, Long.valueOf(System.currentTimeMillis())));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("adding f: ", ((Exception) (obj)));
        }
        break MISSING_BLOCK_LABEL_237;
        obj = (new StringBuilder("_")).append(obj.toString()).toString();
          goto _L1
    }

}
