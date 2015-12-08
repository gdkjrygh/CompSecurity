// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, cv, gs, fz, 
//            gd, gb, turkey, cr, 
//            go, gj, ca, gr, 
//            shelduck, hi, bd, bj, 
//            bh, bi, bk, ho, 
//            hl, hm

public final class hk
{

    public static int a(float f1)
    {
        return Math.round(((float)ci.b().u.getResources().getDisplayMetrics().densityDpi / 160F) * f1);
    }

    public static int a(Context context)
    {
        int i = 0;
        int j = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (j > 0)
        {
            i = context.getResources().getDimensionPixelSize(j);
        }
        return i;
    }

    private static int a(RecyclerView recyclerview, View view)
    {
        View view1;
        int i;
        view1 = view;
        i = -1;
_L1:
        if (i != -1 || view1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        int j = recyclerview.getChildPosition(view1);
        i = j;
          goto _L1
        Exception exception;
        exception;
        boolean flag;
        try
        {
            view1 = (View)view1.getParent();
            if (view instanceof RecyclerView)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = view1 instanceof RecyclerView;
        }
        // Misplaced declaration of an exception variable
        catch (RecyclerView recyclerview)
        {
            return -1;
        }
        if (!flag) goto _L1; else goto _L2
_L2:
        return -1;
        return i;
    }

    private static int a(AbsListView abslistview, View view)
    {
        int j = abslistview.getPositionForView(view);
        int i = j;
        if (j == -1)
        {
            try
            {
                i = a(abslistview, ((View) ((ViewGroup)view.getParent())));
            }
            // Misplaced declaration of an exception variable
            catch (AbsListView abslistview)
            {
                return -1;
            }
        }
        return i;
    }

    public static android.app.AlertDialog.Builder a(String s, String as[], android.content.DialogInterface.OnClickListener onclicklistener)
    {
        return (new android.app.AlertDialog.Builder(ci.b().v)).setTitle(s).setItems(as, onclicklistener).setCancelable(true);
    }

    private static View a(int i, RecyclerView recyclerview)
    {
        android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerview.getLayoutManager();
        if (!(layoutmanager instanceof LinearLayoutManager)) goto _L2; else goto _L1
_L1:
        int j = ((LinearLayoutManager)layoutmanager).findFirstVisibleItemPosition();
_L4:
        j = i - j;
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i < recyclerview.getChildCount())
        {
            try
            {
                recyclerview = recyclerview.getChildAt(j);
            }
            // Misplaced declaration of an exception variable
            catch (RecyclerView recyclerview)
            {
                return null;
            }
            return recyclerview;
        }
        break; /* Loop/switch isn't completed */
_L2:
        j = 0;
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    private static View a(int i, ListView listview)
    {
        i -= listview.getFirstVisiblePosition() - listview.getHeaderViewsCount();
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (i >= listview.getChildCount())
        {
            return null;
        }
        listview = listview.getChildAt(i);
        return listview;
        listview;
        return null;
    }

    public static View a(JSONObject jsonobject)
    {
        Integer integer;
        int i;
        boolean flag;
        boolean flag1;
        try
        {
            integer = Integer.valueOf(jsonobject.optString("anID"));
            flag = jsonobject.has("isInListView");
            flag1 = jsonobject.has("isInRecycler");
            jsonobject = jsonobject.optJSONObject("cellInfo");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            gs.b("error finding view from json", jsonobject);
            return null;
        }
        if (!flag && !flag1 || jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (jsonobject.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        i = jsonobject.optInt("position");
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        jsonobject = (ListView)e(cv.a().j.findViewById(integer.intValue()));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        jsonobject = a(i, ((ListView) (jsonobject)));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        return jsonobject.findViewById(integer.intValue());
        jsonobject = f(cv.a().j.findViewById(integer.intValue()));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        jsonobject = a(i, ((RecyclerView) (jsonobject)));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        return jsonobject.findViewById(integer.intValue());
        jsonobject = cv.a().j.findViewById(integer.intValue());
        return jsonobject;
    }

    public static TextView a(String s, int i, int j, int k)
    {
        TextView textview = new TextView(ci.b().v);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.setMargins(0, 0, k, j);
        textview.setText(s);
        textview.setTextColor(-1);
        textview.setGravity(1);
        textview.setId(i);
        layoutparams.gravity = 49;
        textview.setLayoutParams(layoutparams);
        return textview;
    }

    public static fz a(turkey turkey1)
    {
        fz fz1 = new fz(ci.b().u);
        android.widget.FrameLayout.LayoutParams layoutparams;
        layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutparams.setMargins(0, a(ci.b().u), 0, 0);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        fz1.setBackground(new gd(gb.a(turkey1)));
_L1:
        fz1.setLayoutParams(layoutparams);
        fz1.setId(0x17ccbc35);
        fz1.setTag(turkey1.name());
        return fz1;
        try
        {
            fz1.setBackgroundDrawable(new gd(gb.a(turkey1)));
        }
        // Misplaced declaration of an exception variable
        catch (turkey turkey1)
        {
            gs.b("border", turkey1);
            return fz1;
        }
          goto _L1
    }

    private static Class a(Class class1)
    {
        Class class2 = null;
        cr.a();
        if (cr.d().contains(class1.getSimpleName()))
        {
            return class1;
        }
        if (!class1.getSimpleName().equals("Object"))
        {
            class2 = a(class1.getSuperclass());
        }
        return class2;
    }

    public static ArrayList a(float f1, float f2, ViewGroup viewgroup)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        viewgroup = b(viewgroup).listIterator();
_L14:
        if (!viewgroup.hasNext()) goto _L2; else goto _L1
_L1:
        View view;
        int ai[];
        view = (View)viewgroup.next();
        if (arraylist.contains(view))
        {
            continue; /* Loop/switch isn't completed */
        }
        ai = new int[2];
        view.getLocationOnScreen(ai);
        int i;
        int j;
        i = ai[0];
        j = ai[1];
        if (f1 <= (float)i)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 >= (float)(i + view.getWidth()) || f2 <= (float)j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f2 >= (float)(j + view.getHeight()) || view.getId() == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(view instanceof AbsListView)) goto _L4; else goto _L3
_L3:
        int ai1[];
        ai1 = new int[2];
        j = ((AbsListView)view).getChildCount();
        i = 0;
_L12:
        if (i >= j) goto _L4; else goto _L5
_L5:
        Object obj;
        View view1;
        obj = ((AbsListView)view).getChildAt(i);
        view1 = new View(ci.b().v);
        ((View) (obj)).getLocationOnScreen(ai1);
        int k;
        int l;
        k = ai1[0];
        l = ai1[1];
        if (f1 <= (float)k) goto _L7; else goto _L6
_L6:
        if (f1 >= (float)(k + view.getWidth()) || f2 <= (float)l) goto _L7; else goto _L8
_L8:
        if (f2 >= (float)(view.getHeight() + l)) goto _L7; else goto _L9
_L9:
        if (!(obj instanceof ViewGroup)) goto _L11; else goto _L10
_L10:
        ArrayList arraylist1 = b((ViewGroup)obj);
        view1.setTag(Integer.valueOf(i));
        view1.setId(0x17ccbc3b);
        ((ViewGroup)obj).addView(view1);
        for (obj = arraylist1.iterator(); ((Iterator) (obj)).hasNext(); viewgroup.add((View)((Iterator) (obj)).next())) { }
          goto _L4
_L11:
        viewgroup.add(obj);
_L4:
        if (!arraylist.contains(view))
        {
            arraylist.add(view);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i++;
        if (true) goto _L12; else goto _L2
_L2:
        Collections.reverse(arraylist);
        return arraylist;
        Throwable throwable;
        throwable;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static JSONObject a(View view)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        Object obj1;
        Object obj2;
        String as[];
        android.content.res.Resources.NotFoundException notfoundexception;
        int i;
        try
        {
            jsonobject.put("id", view.getId());
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return jsonobject;
        }
        obj = "";
        obj2 = ci.b().u.getResources().getResourceEntryName(view.getId());
        obj = obj2;
_L6:
        jsonobject.put("identifier", obj);
        obj = a(view.getClass());
        obj2 = view.getClass().getSimpleName();
        jsonobject.put("baseClass", ((Class) (obj)).getSimpleName());
        if (!((Class) (obj)).getSimpleName().equals(obj2))
        {
            jsonobject.put("class", obj2);
        }
        jsonobject.put("subClasses", d(view));
        if (ci.b().v != null)
        {
            jsonobject.put("activity", ci.b().w);
        }
        jsonobject.put("methodInfo", go.a(view.getClass(), view));
        jsonobject.put("position", c(view));
        i = gj.a(view);
        if (i == -2)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        jsonobject.put("fragId", i);
        obj2 = (String)((Pair)ca.a().c.get(Integer.valueOf(i))).second;
        jsonobject.put("fragIdentifier", obj2);
        if (((String) (obj2)).contains("_viewpager_"))
        {
            obj = new JSONObject();
            as = ((String) (obj2)).split("_");
            if (as.length > 0)
            {
                ((JSONObject) (obj)).put("position", Integer.valueOf(as[as.length - 1]));
                jsonobject.put("cellInfo", obj);
            }
        }
_L2:
        obj = e(view);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        jsonobject.put("isInListView", true);
        if (a(((AbsListView) (obj)), view) != -1)
        {
            as = new JSONObject();
            as.put("position", a(((AbsListView) (obj)), view));
            jsonobject.put("cellInfo", as);
        }
        obj = f(view);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        jsonobject.put("isInRecycler", true);
        if (a(((RecyclerView) (obj)), view) != -1)
        {
            as = new JSONObject();
            as.put("position", a(((RecyclerView) (obj)), view));
            jsonobject.put("cellInfo", as);
        }
_L3:
        jsonobject.put("imgFileName", gr.a(view));
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            jsonobject.put("hasOnClick", view.hasOnClickListeners());
        }
        break MISSING_BLOCK_LABEL_464;
        obj1;
        if (!gs.b()) goto _L2; else goto _L1
_L1:
        gs.a("error setting viewpager fragment id");
          goto _L2
        obj1;
        if (!(obj1 instanceof Exception))
        {
            break MISSING_BLOCK_LABEL_455;
        }
        obj1 = (Exception)obj1;
_L4:
        gs.b("recview err", ((Exception) (obj1)));
          goto _L3
        obj1 = null;
          goto _L4
        notfoundexception;
        if (true) goto _L6; else goto _L5
_L5:
        return jsonobject;
    }

    static void a(int i, ViewGroup viewgroup, int j, JSONObject jsonobject, boolean flag)
    {
        if (hi.a(shelduck.k))
        {
            return;
        }
        viewgroup = viewgroup.findViewById(j);
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        viewgroup = (ListView)e(viewgroup);
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        viewgroup = a(i, ((ListView) (viewgroup)));
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        viewgroup = viewgroup.findViewById(j);
        if (viewgroup != null)
        {
            try
            {
                a(jsonobject, ((View) (viewgroup)), flag, true);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup) { }
        }
    }

    public static void a(AlertDialog alertdialog)
    {
        alertdialog = alertdialog.getWindow();
        android.view.WindowManager.LayoutParams layoutparams = alertdialog.getAttributes();
        layoutparams.gravity = 80;
        layoutparams.flags = layoutparams.flags & -3;
        alertdialog.setAttributes(layoutparams);
    }

    public static void a(View view, Object obj, String s, String s1)
        throws JSONException
    {
        JSONArray jsonarray;
        int i;
        int j;
        jsonarray = ci.b().t.l;
        j = view.getId();
        i = 0;
_L3:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (((JSONObject)jsonarray.get(i)).optJSONObject("initProperties").optInt("anID") != j) goto _L2; else goto _L1
_L1:
        if (i != -1)
        {
            view = jsonarray.getJSONObject(i).optJSONObject("anProperties").optJSONObject(s);
            view.put("value", obj);
            view.put("type", s1);
        }
        return;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    static void a(ViewGroup viewgroup, int i, JSONObject jsonobject, boolean flag)
    {
        if (!(viewgroup instanceof AbsListView)) goto _L2; else goto _L1
_L1:
        if (!hi.a(shelduck.k)) goto _L4; else goto _L3
_L3:
        return;
_L2:
        boolean flag1;
        if (!(viewgroup instanceof RecyclerView))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = hi.a(shelduck.l);
        if (flag1) goto _L3; else goto _L4
_L4:
        ArrayList arraylist = new ArrayList();
_L6:
        if (viewgroup.findViewById(i) == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        View view = viewgroup.findViewById(i);
        if (view == null) goto _L6; else goto _L5
_L5:
        Object obj = view.getTag(cv.a().o);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (!(obj instanceof HashMap))
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj = (HashMap)obj;
_L7:
        ((HashMap) (obj)).put("shouldReset", Boolean.valueOf(false));
        view.setTag(cv.a().o, obj);
        a(jsonobject, view, flag, true);
        arraylist.add(new Pair(view, Integer.valueOf(view.getId())));
        view.setId(0);
          goto _L6
        obj = new HashMap();
          goto _L7
        viewgroup = arraylist.iterator();
        while (viewgroup.hasNext()) 
        {
            jsonobject = (Pair)viewgroup.next();
            try
            {
                ((View)((Pair) (jsonobject)).first).setId(((Integer)((Pair) (jsonobject)).second).intValue());
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject) { }
        }
          goto _L3
        Object obj1;
        obj1;
          goto _L4
        obj1;
          goto _L6
    }

    public static void a(ViewGroup viewgroup, boolean flag, AtomicBoolean atomicboolean)
    {
        if (!ci.b().j)
        {
            return;
        }
        int j = viewgroup.getChildCount();
        int i;
        boolean flag1;
        i = 0;
        flag1 = flag;
_L3:
        boolean flag2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_580;
        }
        flag2 = flag1;
        Object obj = viewgroup.getChildAt(i);
        flag = flag1;
        flag2 = flag1;
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag = flag1;
        flag2 = flag1;
        if (((View) (obj)).getId() == 0x17ccbc36)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag = flag1;
        flag2 = flag1;
        if (((View) (obj)).getId() == 0x17ccbc35)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag = flag1;
        flag2 = flag1;
        if (gj.a((ViewGroup)obj, flag1, atomicboolean))
        {
            flag = true;
        }
        flag2 = flag;
        a((ViewGroup)obj, flag, atomicboolean);
        flag2 = flag;
        if (!(obj instanceof AbsListView))
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag;
        if (hi.a(shelduck.k))
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag;
        Object obj2 = (AbsListView)obj;
        obj = null;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        if (((Class) (obj)).getSimpleName().equals("View") || ((Class) (obj)).getSimpleName().equals("AbsListView"))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj = obj2.getClass();
          goto _L1
        obj = ((Class) (obj)).getSuperclass();
          goto _L1
        Object obj3 = ((Class) (obj)).getDeclaredField("mOnScrollListener");
        ((Field) (obj3)).setAccessible(true);
        android.widget.AbsListView.OnScrollListener onscrolllistener = (android.widget.AbsListView.OnScrollListener)((Field) (obj3)).get(obj2);
        if (!(onscrolllistener instanceof bj))
        {
            ((Field) (obj3)).set(obj2, new bj(onscrolllistener));
        }
        obj = ((Class) (obj)).getDeclaredField("mRecycler");
        ((Field) (obj)).setAccessible(true);
        obj = ((Field) (obj)).get(obj2);
        obj2 = obj.getClass().getDeclaredField("mRecyclerListener");
        ((Field) (obj2)).setAccessible(true);
        obj3 = (android.widget.AbsListView.RecyclerListener)((Field) (obj2)).get(obj);
        if (!(obj3 instanceof bh))
        {
            ((Field) (obj2)).set(obj, new bh(((android.widget.AbsListView.RecyclerListener) (obj3))));
        }
_L4:
        i++;
        flag1 = flag;
        if (true) goto _L3; else goto _L2
        obj;
        flag2 = flag;
        gs.b("Problem getting OnScrollListener for ListView", ((Exception) (obj)));
          goto _L4
_L2:
        flag2 = flag;
        if (!(obj instanceof RecyclerView)) goto _L4; else goto _L5
_L5:
        flag2 = flag;
        if (hi.a(shelduck.l)) goto _L4; else goto _L6
_L6:
        flag2 = flag;
        obj2 = (RecyclerView)obj;
        obj = null;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        if (((Class) (obj)).getSimpleName().equals("View") || ((Class) (obj)).getSimpleName().equals("RecyclerView"))
        {
            break MISSING_BLOCK_LABEL_439;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_431;
        }
        obj = obj2.getClass();
          goto _L7
        obj = ((Class) (obj)).getSuperclass();
          goto _L7
        Object obj4 = ((Class) (obj)).getDeclaredField("mScrollListener");
        ((Field) (obj4)).setAccessible(true);
        android.support.v7.widget.RecyclerView.OnScrollListener onscrolllistener1 = (android.support.v7.widget.RecyclerView.OnScrollListener)((Field) (obj4)).get(obj2);
        if (!(onscrolllistener1 instanceof bi))
        {
            ((Field) (obj4)).set(obj2, new bi(onscrolllistener1));
        }
        obj = ((Class) (obj)).getDeclaredField("mRecyclerListener");
        ((Field) (obj)).setAccessible(true);
        obj4 = (android.support.v7.widget.RecyclerView.RecyclerListener)((Field) (obj)).get(obj2);
        if (!(obj4 instanceof bk))
        {
            ((Field) (obj)).set(obj2, new bk(((android.support.v7.widget.RecyclerView.RecyclerListener) (obj4))));
        }
          goto _L4
        Object obj1;
        obj1;
        flag2 = flag;
        gs.b("Problem getting OnScrollListener for RecyclerView", ((Exception) (obj1)));
          goto _L4
        obj1;
          goto _L4
        obj1;
        flag = flag2;
        gs.b("Attaching listeners:", ((Exception) (obj1)));
          goto _L4
        viewgroup;
        gs.b("Attaching listeners:", viewgroup);
    }

    private static void a(JSONObject jsonobject, View view, boolean flag, boolean flag1)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("anProperties");
        if (jsonobject1 == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = jsonobject1.keys();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        String s = (String)iterator.next();
        try
        {
            if (!(jsonobject1.get(s) instanceof JSONObject))
            {
                continue; /* Loop/switch isn't completed */
            }
            JSONObject jsonobject2 = jsonobject1.optJSONObject(s);
            go.a(view, s, jsonobject2.opt("value"), jsonobject2.optString("type"), flag, flag1);
        }
        catch (JSONException jsonexception)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        cv.a().c.remove(Integer.valueOf(jsonobject.optJSONObject("initProperties").optInt("anID")));
        continue; /* Loop/switch isn't completed */
        jsonobject;
        if (jsonobject instanceof Exception)
        {
            jsonobject = (Exception)jsonobject;
        } else
        {
            jsonobject = new Exception();
        }
        gs.a("Problem applying methods", jsonobject);
_L2:
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean a(ViewGroup viewgroup)
    {
        return viewgroup != null && viewgroup.findViewById(0x17ccbc35) != null;
    }

    public static ArrayList b(ViewGroup viewgroup)
    {
        ArrayList arraylist = new ArrayList();
        int j;
        if (!viewgroup.getClass().getName().contains("DecorView"))
        {
            arraylist.add(viewgroup);
        }
        j = viewgroup.getChildCount();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        View view = viewgroup.getChildAt(i);
        if ((view instanceof ViewGroup) && view.getId() != 0x17ccbc36 && view.getId() != 0x17ccbc35)
        {
            arraylist.addAll(b((ViewGroup)view));
            break MISSING_BLOCK_LABEL_142;
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        try
        {
            if (!(view instanceof ViewStub) && view.getId() != 0x17ccbc36 && view.getId() != 0x17ccbc35)
            {
                arraylist.add(view);
            }
            break MISSING_BLOCK_LABEL_142;
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            gs.b("Finding all views: ", viewgroup);
        }
        return arraylist;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void b(int i, ViewGroup viewgroup, int j, JSONObject jsonobject, boolean flag)
    {
        if (gs.b())
        {
            gs.a("Applying to recycler cell");
        }
        if (hi.a(shelduck.l))
        {
            return;
        }
        viewgroup = viewgroup.findViewById(j);
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        viewgroup = f(viewgroup);
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        viewgroup = a(i, viewgroup);
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        viewgroup = viewgroup.findViewById(j);
        if (viewgroup != null)
        {
            try
            {
                a(jsonobject, viewgroup, flag, true);
                if (gs.b())
                {
                    gs.a("made it! applying methods to recycler cell");
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup) { }
        }
    }

    static void b(View view)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(500L);
        alphaanimation.setAnimationListener(new ho(view));
        alphaanimation.setInterpolator(new LinearInterpolator());
        view.startAnimation(alphaanimation);
    }

    public static boolean b(AlertDialog alertdialog)
    {
        return alertdialog != null && alertdialog.isShowing();
    }

    private static JSONObject c(View view)
        throws JSONException
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = new JSONObject();
        jsonobject1 = new JSONObject();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        jsonobject.put("startX", ai[0]);
        jsonobject.put("startY", ai[1]);
        jsonobject.put("endX", ai[0] + view.getWidth());
        jsonobject.put("endY", ai[1] + view.getHeight());
        if (ci.b().v == null) goto _L2; else goto _L1
_L1:
        Object obj;
        view = ci.b().v.getWindowManager().getDefaultDisplay();
        obj = new DisplayMetrics();
        view.getMetrics(((DisplayMetrics) (obj)));
        int i = ((DisplayMetrics) (obj)).widthPixels;
        int l = ((DisplayMetrics) (obj)).heightPixels;
        int j = i;
_L3:
        int k;
        k = l;
        i = j;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        k = l;
        i = j;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        i = j;
        j = ((Integer)android/view/Display.getMethod("getRawWidth", new Class[0]).invoke(view, new Object[0])).intValue();
        i = j;
        k = ((Integer)android/view/Display.getMethod("getRawHeight", new Class[0]).invoke(view, new Object[0])).intValue();
        i = j;
_L4:
        l = k;
        j = i;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        j = i;
        obj = new Point();
        j = i;
        android/view/Display.getMethod("getRealSize", new Class[] {
            android/graphics/Point
        }).invoke(view, new Object[] {
            obj
        });
        j = i;
        i = ((Point) (obj)).x;
        j = i;
        l = ((Point) (obj)).y;
        j = i;
_L5:
        jsonobject1.put("width", j);
        jsonobject1.put("height", l);
_L2:
        jsonobject.put("screenDimensions", jsonobject1);
        if (gs.b())
        {
            gs.a(jsonobject.toString());
        }
        return jsonobject;
        Exception exception;
        exception;
        i = 0;
_L6:
        l = 0;
        j = i;
          goto _L3
        exception;
        gs.b("getting screen dimensions, but probably fine to ignore", exception);
        k = l;
          goto _L4
        view;
        l = k;
          goto _L5
        exception;
          goto _L6
    }

    public static void c(ViewGroup viewgroup)
        throws JSONException
    {
        if (hi.a(shelduck.m) || ci.b().t == null || !ci.b().j) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        HashMap hashmap;
        if (gs.b())
        {
            gs.a((new StringBuilder("Setting properties to view: ")).append(viewgroup.getClass().getSimpleName()).toString());
        }
        jsonarray = ci.b().t.l;
        hashmap = ci.b().t.r;
        Object obj1;
        for (Iterator iterator = cv.a().c.keySet().iterator(); iterator.hasNext(); jsonarray.put(cv.a().c.get(obj1)))
        {
            obj1 = iterator.next();
        }

          goto _L3
        viewgroup;
        gs.b("Critical: SetProps didn't work", viewgroup);
_L2:
        return;
_L3:
        if (jsonarray == null) goto _L2; else goto _L4
_L4:
        int i = jsonarray.length() - 1;
_L48:
        if (i < 0) goto _L2; else goto _L5
_L5:
        JSONObject jsonobject = (JSONObject)jsonarray.opt(i);
        Object obj = jsonobject.optJSONObject("initProperties");
        Object obj2;
        String s;
        int k;
        s = jsonobject.optString("_view");
        k = ((JSONObject) (obj)).optInt("fragId");
        obj2 = ((JSONObject) (obj)).optString("fragIdentifier");
        if (!hashmap.containsKey(s) || !((String)hashmap.get(s)).equals(ci.b().w)) goto _L7; else goto _L6
_L6:
        if (k == 0) goto _L9; else goto _L8
_L8:
        if (obj2 == null) goto _L11; else goto _L10
_L10:
        if (ca.a().c.containsKey(Integer.valueOf(k)) && ((String)((Pair)ca.a().c.get(Integer.valueOf(k))).second).equals(obj2)) goto _L9; else goto _L11
_L11:
        if (!ca.a().c.containsKey(Integer.valueOf(k)) || ca.a().b.isEmpty()) goto _L7; else goto _L9
_L9:
        int j;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        j = ((JSONObject) (obj)).optInt("anID");
        flag1 = ((JSONObject) (obj)).has("isInListView");
        flag2 = ((JSONObject) (obj)).has("isInRecycler");
        flag3 = jsonobject.optBoolean("cellElement");
        obj = ((JSONObject) (obj)).optJSONObject("cellInfo");
        flag = jsonobject.optBoolean("reset", false);
        if (!flag1 && !flag2 || !flag3) goto _L13; else goto _L12
_L12:
        if (!e(viewgroup))
        {
            break MISSING_BLOCK_LABEL_441;
        }
        obj = new Handler(Looper.getMainLooper());
        obj2 = new hl(viewgroup, j, jsonobject, flag);
        int l;
        long l1;
        if (k == 0)
        {
            l1 = 10L;
        } else
        {
            l1 = 285L;
        }
        ((Handler) (obj)).postDelayed(((Runnable) (obj2)), l1);
        a(viewgroup, j, jsonobject, flag);
          goto _L7
_L49:
        if (obj == null) goto _L15; else goto _L14
_L14:
        if (((JSONObject) (obj)).length() <= 0) goto _L15; else goto _L16
_L16:
        l = ((JSONObject) (obj)).optInt("position");
        obj2 = viewgroup.findViewById(j);
        if (obj2 == null) goto _L18; else goto _L17
_L17:
        obj = ((View) (obj2)).getTag(cv.a().o);
        if (obj == null) goto _L20; else goto _L19
_L19:
        if (!(obj instanceof HashMap)) goto _L20; else goto _L21
_L21:
        obj = (HashMap)obj;
_L24:
        ((HashMap) (obj)).put("shouldReset", Boolean.valueOf(true));
        ((View) (obj2)).setTag(cv.a().o, obj);
_L18:
        if (l == -1)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        if (!e(viewgroup))
        {
            break MISSING_BLOCK_LABEL_601;
        }
        obj = new Handler(Looper.getMainLooper());
        obj2 = new hm(flag2, l, viewgroup, j, jsonobject, flag);
        if (k == 0)
        {
            l1 = 10L;
        } else
        {
            l1 = 285L;
        }
        ((Handler) (obj)).postDelayed(((Runnable) (obj2)), l1);
        if (!flag2) goto _L23; else goto _L22
_L22:
        b(l, viewgroup, j, jsonobject, flag);
          goto _L7
        obj;
        gs.b("Some issues with lists or something", ((Exception) (obj)));
          goto _L7
_L20:
        obj = new HashMap();
          goto _L24
_L23:
        a(l, viewgroup, j, jsonobject, flag);
          goto _L7
_L15:
        if (obj2 == null) goto _L26; else goto _L25
_L25:
        flag1 = ((String) (obj2)).equals("");
        if (flag1) goto _L26; else goto _L27
_L27:
        if (obj2 == null) goto _L29; else goto _L28
_L28:
        if (((String) (obj2)).equals("") || !((String) (obj2)).contains("_viewpager_")) goto _L29; else goto _L30
_L30:
        if (!(viewgroup instanceof ViewPager)) goto _L32; else goto _L31
_L31:
        obj = (ViewPager)viewgroup;
_L41:
        obj = ((ViewPager) (obj)).getAdapter();
        String as[] = ((String) (obj2)).split("_");
        k = Integer.valueOf(as[as.length - 1]).intValue();
        if (!(obj instanceof o)) goto _L34; else goto _L33
_L33:
        obj = ((o)obj).a(k);
_L44:
        if (obj == null) goto _L7; else goto _L35
_L35:
        if (((Fragment) (obj)).getView() == null || !(((Fragment) (obj)).getView() instanceof ViewGroup)) goto _L7; else goto _L36
_L36:
        obj = (ViewGroup)((Fragment) (obj)).getView();
_L45:
        if (obj == null) goto _L7; else goto _L37
_L37:
        obj = ((ViewGroup) (obj)).findViewById(j);
        if (obj == null) goto _L7; else goto _L38
_L38:
        if (gs.b())
        {
            gs.a((new StringBuilder("Found View: ")).append(obj.getClass().getSimpleName()).toString());
        }
        a(jsonobject, ((View) (obj)), flag, false);
          goto _L7
_L32:
        obj = viewgroup.findViewById(gj.a());
        if (obj == null) goto _L7; else goto _L39
_L39:
        if (!(((View) (obj)).getParent() instanceof ViewPager)) goto _L7; else goto _L40
_L40:
        obj = (ViewPager)((View) (obj)).getParent();
          goto _L41
_L34:
        if (ca.a().a == null) goto _L43; else goto _L42
_L42:
        obj = (Fragment)ca.a().a.invoke(obj, new Object[] {
            Integer.valueOf(k)
        });
          goto _L44
_L29:
        obj = viewgroup;
          goto _L45
        obj;
        obj = viewgroup;
          goto _L45
_L26:
        if (viewgroup == null) goto _L7; else goto _L46
_L46:
        obj = viewgroup.findViewById(j);
        if (obj == null) goto _L7; else goto _L47
_L47:
        if (gs.b())
        {
            gs.a((new StringBuilder("Found View: ")).append(obj.getClass().getSimpleName()).toString());
        }
        a(jsonobject, ((View) (obj)), flag, false);
          goto _L7
        obj;
          goto _L7
_L43:
        obj = null;
          goto _L44
_L7:
        i--;
          goto _L48
_L13:
        if (!flag1 && !flag2) goto _L15; else goto _L49
    }

    private static JSONArray d(View view)
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            view = view.getClass();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            gs.b("Class hierarchy: ", view);
            return jsonarray;
        }
        if (view == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (view.getSimpleName().equals("View"))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray.put(view.getSimpleName());
        view = view.getSuperclass();
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_13;
_L1:
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        jsonarray.put(view.getSimpleName());
        return jsonarray;
    }

    public static void d(ViewGroup viewgroup)
    {
        for (int i = 0; i < viewgroup.getChildCount(); i++)
        {
            View view = viewgroup.getChildAt(i);
            Object obj = view.getTag(cv.a().o);
            if (obj != null && (obj instanceof HashMap))
            {
                Object obj1 = ((HashMap)obj).get("shouldReset");
                if (obj1 == null || (obj1 instanceof Boolean) && ((Boolean)obj1).booleanValue())
                {
                    obj = (HashMap)obj;
                    Iterator iterator = ((HashMap) (obj)).keySet().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        Object obj2 = iterator.next();
                        if (obj2 instanceof String)
                        {
                            String s = (String)obj2;
                            obj2 = ((HashMap) (obj)).get(obj2);
                            if (obj2 instanceof HashMap)
                            {
                                obj2 = (HashMap)obj2;
                                Object obj3 = ((HashMap) (obj2)).get("parameterType");
                                if (obj3 instanceof String)
                                {
                                    obj3 = (String)obj3;
                                    go.a(view, s, ((HashMap) (obj2)).get(s), ((String) (obj3)), true, false);
                                }
                            }
                        }
                    } while (true);
                    view.setTag(cv.a().o, null);
                }
            }
            if (view instanceof ViewGroup)
            {
                d((ViewGroup)view);
            }
        }

    }

    private static AbsListView e(View view)
    {
        view = (ViewGroup)view.getParent();
        if (view != cv.a().j && (view instanceof AbsListView))
        {
            return (AbsListView)view;
        }
        if (view != cv.a().j && view != null)
        {
            try
            {
                view = e(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return null;
            }
            return view;
        } else
        {
            return null;
        }
    }

    private static boolean e(ViewGroup viewgroup)
    {
        Object obj = viewgroup.getTag(cv.a().o);
        if (obj != null && (obj instanceof HashMap))
        {
            obj = (HashMap)obj;
            Object obj1 = ((HashMap) (obj)).get("listOrFragmentFirstTime");
            if (obj1 != null && (obj1 instanceof Boolean))
            {
                return ((Boolean)obj1).booleanValue();
            }
            ((HashMap) (obj)).put("listOrFragmentFirstTime", Boolean.valueOf(false));
            viewgroup.setTag(cv.a().o, obj);
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("listOrFragmentFirstTime", Boolean.valueOf(false));
            viewgroup.setTag(cv.a().o, hashmap);
        }
        return true;
    }

    private static RecyclerView f(View view)
    {
        view = (ViewGroup)view.getParent();
        if (view != cv.a().j && (view instanceof RecyclerView))
        {
            return (RecyclerView)view;
        }
        if (view != cv.a().j && view != null)
        {
            try
            {
                view = f(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return null;
            }
            return view;
        } else
        {
            return null;
        }
    }
}
