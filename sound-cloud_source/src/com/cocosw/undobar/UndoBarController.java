// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cocosw.undobar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;

// Referenced classes of package com.cocosw.undobar:
//            UndoBarStyle, b, c

public class UndoBarController extends LinearLayout
{
    public static interface a
        extends c
    {
    }

    public static final class b
    {

        public final Activity a;
        public UndoBarStyle b;
        public CharSequence c;
        public long d;
        public Parcelable e;
        public c f;
        public int g;

        public b(Activity activity)
        {
            g = -1;
            a = activity;
        }
    }

    public static interface c
    {

        public abstract void onUndo(Parcelable parcelable);
    }


    public static final UndoBarStyle a;
    public static final UndoBarStyle b;
    public static final UndoBarStyle c = new UndoBarStyle(-1, -1, 5000L);
    static final boolean d;
    private static Animation f;
    private static Animation g;
    private UndoBarStyle e;
    private final TextView h;
    private final TextView i;
    private final Handler j;
    private final Runnable k;
    private c l;
    private boolean m;
    private Parcelable n;
    private CharSequence o;
    private int p;
    private boolean q;
    private String r;
    private boolean s;
    private float t;

    public UndoBarController(Context context, AttributeSet attributeset)
    {
        boolean flag = false;
        super(context, attributeset);
        e = a;
        j = new Handler();
        k = new com.cocosw.undobar.b(this);
        p = -1;
        LayoutInflater.from(context).inflate(a.c.undobar, this, true);
        h = (TextView)findViewById(a.b.undobar_message);
        i = (TextView)findViewById(a.b.undobar_button);
        i.setOnClickListener(new com.cocosw.undobar.c(this));
        a(true);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        attributeset = (WindowManager)context.getSystemService("window");
        if (getResources().getConfiguration().orientation == 1)
        {
            flag = true;
        }
        q = flag;
        try
        {
            Method method = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] {
                java/lang/String
            });
            method.setAccessible(true);
            r = (String)method.invoke(null, new Object[] {
                "qemu.hw.mainkeys"
            });
        }
        catch (Throwable throwable)
        {
            r = null;
        }
        context = context.obtainStyledAttributes(new int[] {
            0x10103ef, 0x10103f0
        });
        s = context.getBoolean(1, false);
        context.recycle();
        if (!d && getContext() == null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_261;
        attributeset;
        context.recycle();
        throw attributeset;
        if ((((Activity)getContext()).getWindow().getAttributes().flags & 0x8000000) != 0)
        {
            s = true;
        }
        context = new DisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            attributeset.getDefaultDisplay().getRealMetrics(context);
        } else
        {
            attributeset.getDefaultDisplay().getMetrics(context);
        }
        t = Math.min((float)((DisplayMetrics) (context)).widthPixels / ((DisplayMetrics) (context)).density, (float)((DisplayMetrics) (context)).heightPixels / ((DisplayMetrics) (context)).density);
    }

    static c a(UndoBarController undobarcontroller)
    {
        return undobarcontroller.l;
    }

    public static UndoBarController a(Activity activity, CharSequence charsequence, c c1, Parcelable parcelable, UndoBarStyle undobarstyle, int i1)
    {
        Object obj = activity.findViewById(a.b._undobar);
        UndoBarController undobarcontroller;
        if (obj != null)
        {
            obj = (UndoBarController)((View) (obj)).getParent();
        } else
        {
            obj = null;
        }
        undobarcontroller = ((UndoBarController) (obj));
        if (obj == null)
        {
            undobarcontroller = new UndoBarController(activity, null);
            ((ViewGroup)activity.findViewById(0x1020002)).addView(undobarcontroller);
        }
        if (undobarstyle == null)
        {
            throw new IllegalArgumentException("style must not be empty.");
        } else
        {
            undobarcontroller.e = undobarstyle;
            undobarcontroller.l = c1;
            undobarcontroller.a(false, charsequence, parcelable);
            undobarcontroller.p = i1;
            return undobarcontroller;
        }
    }

    static void a(UndoBarController undobarcontroller, boolean flag)
    {
        undobarcontroller.a(flag);
    }

    private void a(boolean flag)
    {
        j.removeCallbacks(k);
        n = null;
        if (!flag)
        {
            clearAnimation();
            if (e.f != null)
            {
                startAnimation(e.f);
            } else
            {
                startAnimation(g);
            }
        }
        setVisibility(8);
    }

    private void a(boolean flag, CharSequence charsequence, Parcelable parcelable)
    {
label0:
        {
            {
                boolean flag1 = true;
                m = flag;
                n = parcelable;
                o = charsequence;
                h.setText(o, android.widget.TextView.BufferType.SPANNABLE);
                int i1;
                if (e.b > 0)
                {
                    i.setVisibility(0);
                    findViewById(a.b.undobar_divider).setVisibility(0);
                    i.setText(e.b);
                    if (e.a > 0)
                    {
                        i.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(e.a), null, null, null);
                    }
                } else
                {
                    i.setVisibility(8);
                    findViewById(a.b.undobar_divider).setVisibility(8);
                }
                if (e.c > 0)
                {
                    findViewById(a.b._undobar).setBackgroundResource(e.c);
                }
                j.removeCallbacks(k);
                if (e.d > 0L)
                {
                    j.postDelayed(k, e.d);
                }
                if (!flag)
                {
                    clearAnimation();
                    Resources resources;
                    if (e.e != null)
                    {
                        startAnimation(e.e);
                    } else
                    {
                        startAnimation(f);
                    }
                }
                setVisibility(0);
                if (android.os.Build.VERSION.SDK_INT < 19 || p == 0 || p != 1 && !s)
                {
                    break label0;
                }
                charsequence = getContext();
                parcelable = charsequence.getResources();
                if (android.os.Build.VERSION.SDK_INT < 14)
                {
                    break MISSING_BLOCK_LABEL_477;
                }
                resources = charsequence.getResources();
                i1 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
                if (i1 != 0)
                {
                    flag = resources.getBoolean(i1);
                    if ("1".equals(r))
                    {
                        flag = false;
                    } else
                    if ("0".equals(r))
                    {
                        flag = true;
                    }
                } else
                if (!ViewConfiguration.get(charsequence).hasPermanentMenuKey())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_477;
                }
                if (q)
                {
                    charsequence = "navigation_bar_height";
                } else
                {
                    i1 = ((flag1) ? 1 : 0);
                    if (t < 600F)
                    {
                        if (q)
                        {
                            i1 = ((flag1) ? 1 : 0);
                        } else
                        {
                            i1 = 0;
                        }
                    }
                    if (i1 == 0)
                    {
                        break MISSING_BLOCK_LABEL_477;
                    }
                    charsequence = "navigation_bar_height_landscape";
                }
                i1 = parcelable.getIdentifier(charsequence, "dimen", "android");
                if (i1 > 0)
                {
                    i1 = parcelable.getDimensionPixelSize(i1);
                } else
                {
                    i1 = 0;
                }
            }
            setPadding(0, 0, 0, i1);
        }
        return;
        for (i1 = 0; false; i1 = 0)
        {
        }

        break MISSING_BLOCK_LABEL_351;
    }

    static Parcelable b(UndoBarController undobarcontroller)
    {
        return undobarcontroller.n;
    }

    static boolean c(UndoBarController undobarcontroller)
    {
        return undobarcontroller.m;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            m = parcelable.getBoolean("immediate");
            o = parcelable.getCharSequence("undo_message");
            n = parcelable.getParcelable("undo_token");
            e = (UndoBarStyle)parcelable.getParcelable("undo_style");
            if (parcelable.getInt("visible") == 0)
            {
                a(true, o, n);
            }
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("immediate", m);
        bundle.putCharSequence("undo_message", o);
        bundle.putParcelable("undo_token", n);
        bundle.putParcelable("undo_style", e);
        bundle.putInt("visible", getVisibility());
        return bundle;
    }

    static 
    {
        TranslateAnimation translateanimation;
        boolean flag;
        if (!com/cocosw/undobar/UndoBarController.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        a = new UndoBarStyle(a.a.ic_undobar_undo, a.d.undo);
        b = new UndoBarStyle(a.a.ic_retry, a.d.retry, -1L);
        translateanimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 1.0F, 2, 0.0F);
        translateanimation.setDuration(500L);
        translateanimation.setInterpolator(new OvershootInterpolator(1.0F));
        translateanimation.setAnimationListener(null);
        f = translateanimation;
        translateanimation = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, 1.0F);
        translateanimation.setDuration(500L);
        translateanimation.setInterpolator(new AnticipateOvershootInterpolator(1.0F));
        translateanimation.setAnimationListener(null);
        g = translateanimation;
    }
}
