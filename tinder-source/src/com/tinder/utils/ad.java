// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tinder.enums.UserPhotoSize;
import com.tinder.managers.ManagerApp;
import com.tinder.views.BaseScroller;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

// Referenced classes of package com.tinder.utils:
//            v, o

public final class ad
{

    public static final boolean a;
    private static final Hashtable b = new Hashtable();
    private static UserPhotoSize c = null;
    private static int d;
    private static int e;
    private static float f;
    private static float g;
    private static int h = -1;
    private static float i;
    private static float j;
    private static int k = -1;

    public static float a(float f1)
    {
        return (float)a(ManagerApp.c()) * f1;
    }

    public static float a(float f1, Context context)
    {
        return ((float)context.getResources().getDisplayMetrics().densityDpi / 160F) * f1;
    }

    public static int a(Context context)
    {
        if (d == 0)
        {
            context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            context.getMetrics(displaymetrics);
            d = displaymetrics.widthPixels;
        }
        return d;
    }

    public static Point a(View view)
    {
        int ai[] = new int[2];
        view.getLocationInWindow(ai);
        return new Point(ai[0], ai[1]);
    }

    public static Typeface a(Context context, String s)
    {
label0:
        {
            synchronized (b)
            {
                if (b.get(s) == null)
                {
                    break label0;
                }
                SoftReference softreference = (SoftReference)b.get(s);
                if (softreference.get() == null)
                {
                    break label0;
                }
                context = (Typeface)softreference.get();
            }
            return context;
        }
        context = Typeface.createFromAsset(context.getAssets(), (new StringBuilder("fonts/")).append(s).toString());
        b.put(s, new SoftReference(context));
        hashtable;
        JVM INSTR monitorexit ;
        return context;
        context;
        hashtable;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static UserPhotoSize a(Activity activity)
    {
        if (c == null)
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            int l = displaymetrics.densityDpi;
            if (l == 213 || l == 320 || l == 480 || l == 640 || activity.getResources().getBoolean(0x7f0c0004))
            {
                c = UserPhotoSize.LARGE;
            } else
            if (l == 120)
            {
                c = UserPhotoSize.SMALL;
            } else
            {
                c = UserPhotoSize.MED;
            }
        }
        return c;
    }

    public static void a(Dialog dialog)
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            android.view.WindowManager.LayoutParams layoutparams = dialog.getWindow().getAttributes();
            layoutparams.dimAmount = 0.7F;
            dialog.getWindow().setAttributes(layoutparams);
            dialog.getWindow().addFlags(2);
        }
    }

    public static void a(Context context, View view)
    {
        if (view == null)
        {
            v.a("View is null, can't show keyboard");
            return;
        }
        view.requestFocus();
        context = (InputMethodManager)context.getSystemService("input_method");
        if (context != null)
        {
            context.showSoftInput(view, 2);
            return;
        } else
        {
            v.a("inputMethodManager or view null, can't show keyboard");
            return;
        }
    }

    public static void a(IBinder ibinder, Activity activity)
    {
        (new StringBuilder("windowToken=")).append(ibinder);
        activity = (InputMethodManager)activity.getSystemService("input_method");
        if (activity != null && ibinder != null)
        {
            activity.hideSoftInputFromWindow(ibinder, 0);
            return;
        } else
        {
            v.a("inputMethodManager or view null, can't hide keyboard");
            return;
        }
    }

    public static void a(ViewPager viewpager, int l)
    {
        Field field;
        Object obj;
        try
        {
            field = android/support/v4/view/ViewPager.getDeclaredField("mScroller");
            field.setAccessible(true);
            obj = android/support/v4/view/ViewPager.getDeclaredField("sInterpolator");
            ((Field) (obj)).setAccessible(true);
            obj = new BaseScroller(viewpager.getContext(), (Interpolator)((Field) (obj)).get(null));
        }
        // Misplaced declaration of an exception variable
        catch (ViewPager viewpager)
        {
            v.a("Parent ViewPager implementation does not contain either mScroller or sInterpolator", viewpager);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewPager viewpager)
        {
            v.a("Failed to set value of found variables, wrong data type", viewpager);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewPager viewpager)
        {
            v.a("Failed to set value of found variable", viewpager);
            return;
        }
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        ((BaseScroller) (obj)).setDuration(l);
        field.set(viewpager, obj);
        return;
    }

    public static void a(View view, float f1)
    {
        view.setOnTouchListener(new android.view.View.OnTouchListener(f1) {

            final float a;

            public final boolean onTouch(View view1, MotionEvent motionevent)
            {
                motionevent.getActionMasked();
                JVM INSTR tableswitch 0 3: default 36
            //                           0 38
            //                           1 49
            //                           2 36
            //                           3 49;
                   goto _L1 _L2 _L3 _L1 _L3
_L1:
                return false;
_L2:
                view1.setAlpha(a);
                continue; /* Loop/switch isn't completed */
_L3:
                view1.setAlpha(1.0F);
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = f1;
                super();
            }
        });
    }

    public static void a(View view, Drawable drawable)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public static void a(View view, boolean flag)
    {
        (new StringBuilder("view=")).append(view);
        for (view = view.getParent(); view != null; view = view.getParent())
        {
            view.requestDisallowInterceptTouchEvent(flag);
        }

    }

    public static void a(Window window, Context context, View view)
    {
        int l = a(context);
        int i1 = b(context);
        context = window.getAttributes();
        context.width = l;
        context.height = i1;
        window.setAttributes(context);
        window = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
        window.addRule(14);
        view.setLayoutParams(window);
    }

    public static void a(ImageView imageview, float f1)
    {
        if (a)
        {
            imageview.setImageAlpha((int)o.a(f1, 0.0F, 0.0F, 1.0F, 255F));
            return;
        } else
        {
            imageview.setAlpha(f1);
            return;
        }
    }

    public static void a(ListView listview)
    {
        ListAdapter listadapter = listview.getAdapter();
        if (listadapter == null)
        {
            return;
        }
        int l = 0;
        int i1 = 0;
        for (; l < listadapter.getCount(); l++)
        {
            View view1 = listadapter.getView(l, null, listview);
            View view = view1;
            if (view1 == null)
            {
                view = listview.getChildAt(0);
            }
            view.measure(-2, -2);
            i1 = (int)((float)i1 + (float)view.getMeasuredHeight() * 1.5F);
        }

        android.view.ViewGroup.LayoutParams layoutparams = listview.getLayoutParams();
        layoutparams.height = listview.getDividerHeight() * (listadapter.getCount() - 1) + i1;
        listview.setLayoutParams(layoutparams);
        listview.requestLayout();
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    public static boolean a(MotionEvent motionevent)
    {
        return a(motionevent, 0, 130, 50);
    }

    public static boolean a(MotionEvent motionevent, int l, int i1, int j1)
    {
        int k1 = motionevent.getActionMasked();
        if (motionevent.getPointerCount() != 0) goto _L2; else goto _L1
_L1:
        double d1 = 4.9406564584124654E-324D;
_L14:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 239
    //                   1 400
    //                   2 279;
           goto _L3 _L4 _L5 _L6
_L3:
        return false;
_L2:
        k1;
        JVM INSTR tableswitch 0 2: default 80
    //                   0 88
    //                   1 232
    //                   2 131;
           goto _L7 _L8 _L9 _L10
_L7:
        d1 = 4.9406564584124654E-324D;
          goto _L11
_L8:
        h = motionevent.getPointerId(0);
        int l1 = motionevent.findPointerIndex(h);
        f = motionevent.getX(l1);
        g = motionevent.getY(l1);
        d1 = 4.9406564584124654E-324D;
          goto _L11
_L10:
        int i2 = motionevent.findPointerIndex(h);
        if (i2 == -1)
        {
            v.b((new StringBuilder("Invalid pointerId=")).append(h).append(" in getMovementAngle").toString());
            d1 = 4.9406564584124654E-324D;
        } else
        {
            float f1 = motionevent.getX(i2);
            float f3 = motionevent.getY(i2);
            float f4 = f;
            d1 = (Math.atan2(g - f3, f4 - f1) * 180D) / 3.1415926535897931D;
        }
          goto _L11
_L9:
        h = -1;
          goto _L7
_L4:
        k = motionevent.getPointerId(0);
        int j2 = motionevent.findPointerIndex(k);
        i = motionevent.getX(j2);
        j = motionevent.getY(j2);
        d1 = 4.9406564584124654E-324D;
_L6:
        if (d1 != 4.9406564584124654E-324D)
        {
            d1 = Math.abs(d1);
            i1 = Math.abs(i1);
            j1 = Math.abs(j1);
            int k2 = motionevent.findPointerIndex(k);
            if (k2 == -1)
            {
                v.b((new StringBuilder("Invalid pointerId=")).append(k).append(" in getMovementAngle").toString());
                return false;
            }
            motionevent.getX(k2);
            float f2 = motionevent.getY(k2);
            return Math.abs(j - f2) > (float)l && d1 >= (double)j1 && d1 <= (double)i1;
        }
          goto _L12
_L5:
        k = -1;
_L12:
        if (true) goto _L3; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static boolean a(View view, Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        try
        {
            context = a(context, s);
            if (view instanceof TextView)
            {
                ((TextView)view).setTypeface(context);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return false;
        }
        return true;
    }

    public static transient boolean a(Dialog adialog[])
    {
        int l = 0;
        boolean flag = false;
        while (l <= 0) 
        {
            if (c(adialog[0]))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l++;
        }
        return flag;
    }

    public static float b(float f1)
    {
        return (float)b(ManagerApp.c()) * f1;
    }

    public static int b()
    {
        return b(ManagerApp.c());
    }

    public static int b(Context context)
    {
        if (e == 0)
        {
            context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            context.getMetrics(displaymetrics);
            e = displaymetrics.heightPixels;
        }
        return e;
    }

    public static Point b(Activity activity)
    {
        Point point = new Point();
        if (activity != null)
        {
            activity = activity.getWindowManager().getDefaultDisplay();
            point.set(activity.getWidth(), activity.getHeight());
        }
        return point;
    }

    public static void b(View view)
    {
        a(view, 0.5F);
    }

    public static void b(View view, float f1)
    {
        int l = Math.min(255, (int)(255F * f1));
        AlphaAnimation alphaanimation = new AlphaAnimation(view.getAlpha(), l);
        alphaanimation.setDuration(0L);
        alphaanimation.setFillAfter(true);
        view.startAnimation(alphaanimation);
    }

    public static boolean b(Dialog dialog)
    {
        return dialog != null && dialog.isShowing();
    }

    public static int c()
    {
        return a(ManagerApp.c());
    }

    public static int c(Activity activity)
    {
        boolean flag = false;
        int l = ((flag) ? 1 : 0);
        if (!d(activity))
        {
            int i1 = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            l = ((flag) ? 1 : 0);
            if (i1 > 0)
            {
                l = activity.getResources().getDimensionPixelSize(i1);
            }
        }
        return l;
    }

    public static int c(Context context)
    {
        int l = 0;
        int i1 = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (i1 > 0)
        {
            l = context.getResources().getDimensionPixelSize(i1);
        }
        return l;
    }

    public static void c(View view)
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)view.getContext().getSystemService("input_method");
        view = view.getWindowToken();
        if (inputmethodmanager != null && view != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(view, 0);
            return;
        } else
        {
            v.a("inputMethodManager or view null, can't hide keyboard");
            return;
        }
    }

    public static void c(View view, float f1)
    {
        view.setScaleX(f1);
        view.setScaleY(f1);
    }

    public static boolean c(Dialog dialog)
    {
        if (dialog != null && dialog.isShowing())
        {
            dialog.dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    public static String d(Context context)
    {
        float f1 = context.getResources().getDisplayMetrics().density;
        if ((double)f1 <= 0.75D)
        {
            return "ldpi";
        }
        if (f1 <= 1.0F)
        {
            return "mdpi";
        }
        if ((double)f1 <= 1.5D)
        {
            return "hdpi";
        }
        if ((double)f1 <= 2D)
        {
            return "xhdpi";
        }
        if ((double)f1 <= 3D)
        {
            return "xxhdpi";
        } else
        {
            return "xxxhdpi";
        }
    }

    public static boolean d()
    {
        return !"5.0.2".equals(android.os.Build.VERSION.RELEASE) && !"4.3".equals(android.os.Build.VERSION.RELEASE) && !"4.1.1".equals(android.os.Build.VERSION.RELEASE) && !"5.1.1".equals(android.os.Build.VERSION.RELEASE);
    }

    private static boolean d(Activity activity)
    {
        boolean flag = false;
        activity = activity.getWindowManager().getDefaultDisplay();
        int l;
        try
        {
            l = ((Integer)android/view/Display.getMethod("getRawHeight", new Class[0]).invoke(activity, new Object[0])).intValue();
        }
        catch (Exception exception)
        {
            v.b((new StringBuilder("exception=")).append(exception.getMessage()).toString());
            l = 0;
        }
        if (l - activity.getHeight() > 0)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean e()
    {
        return o.e() && !"5.0.2".equals(android.os.Build.VERSION.RELEASE) && !"5.1.1".equals(android.os.Build.VERSION.RELEASE);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
