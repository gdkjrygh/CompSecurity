// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import FB;
import Fx;
import MB;
import Mf;
import aP;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.ArrayList;

public abstract class CaptionEditText extends EditText
{
    class IMMResult extends ResultReceiver
    {

        private CaptionEditText a;

        public void onReceiveResult(int i1, Bundle bundle)
        {
            Timber.c("CaptionEditText", "CaptionDebug: result from IME is %d", new Object[] {
                Integer.valueOf(i1)
            });
            if (i1 == 2 || i1 == 0)
            {
                CaptionEditText.a(a, true);
            } else
            if (i1 == 3 || i1 == 1)
            {
                CaptionEditText.a(a, false);
                return;
            }
        }

        public IMMResult()
        {
            a = CaptionEditText.this;
            super(null);
        }
    }

    public final class a extends AlphaAnimation
    {

        final CaptionEditText a;

        a(boolean flag)
        {
            float f2 = 1.0F;
            a = CaptionEditText.this;
            float f1;
            if (flag)
            {
                f1 = 0.0F;
            } else
            {
                f1 = 1.0F;
            }
            if (!flag)
            {
                f2 = 0.0F;
            }
            super(f1, f2);
            setDuration(410L);
            setFillAfter(true);
            setAnimationListener(new _cls1(this, flag));
        }
    }

    public final class b extends TranslateAnimation
    {

        final CaptionEditText a;

        b(int i1, int j1, int k1, int l1)
        {
            a = CaptionEditText.this;
            super(0, i1, 0, j1, 0, k1, 0, l1);
            setDuration(410L);
            setFillAfter(true);
            setInterpolator(new DecelerateInterpolator());
            CaptionEditText.this.a(0, 0);
            setAnimationListener(new _cls1(this, j1, l1));
        }
    }


    private static final double t = Math.tan(Math.toRadians(30D));
    private ArrayList A;
    boolean a;
    protected IMMResult b;
    InputMethodManager c;
    protected FB d;
    protected int e;
    protected boolean f;
    protected boolean g;
    boolean h;
    protected boolean i;
    boolean j;
    float k;
    float l;
    protected int m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected int q;
    protected int r;
    protected TextWatcher s;
    private boolean u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public CaptionEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        b = new IMMResult();
        e = -1;
        u = false;
        f = false;
        g = false;
        h = false;
        i = false;
        m = -1;
        A = new ArrayList();
        n = false;
        o = false;
        p = false;
        q = -1;
        r = -1;
        setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            private CaptionEditText a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                if (i1 == 0 || i1 == 6)
                {
                    a.b(true);
                }
                return false;
            }

            
            {
                a = CaptionEditText.this;
                super();
            }
        });
        x = ViewConfiguration.get(context).getScaledTouchSlop();
        setVisibility(4);
        clearFocus();
        getRootView().requestFocus();
    }

    static boolean a(CaptionEditText captionedittext)
    {
        captionedittext.u = false;
        return false;
    }

    static boolean a(CaptionEditText captionedittext, boolean flag)
    {
        captionedittext.a = flag;
        return flag;
    }

    protected final void a(float f1)
    {
        setX(f1);
        k = f1;
    }

    protected final void a(float f1, float f2)
    {
        a(f1);
        b(f2);
    }

    protected final void a(int i1)
    {
        Timber.c("CaptionEditText", (new StringBuilder("Set Input filter with max text length: ")).append(i1).toString(), new Object[0]);
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(i1)
        });
        m = i1;
    }

    protected final void a(int i1, int j1)
    {
        setX(i1);
        setY(j1);
    }

    protected void a(ArrayList arraylist)
    {
        A = arraylist;
    }

    protected void a(boolean flag)
    {
        c();
        n = true;
        u = false;
        setVisibility(0);
        setAlpha(1.0F);
        invalidate();
        if (o)
        {
            o = false;
            return;
        }
        requestFocus();
        setCursorVisible(false);
        Object obj;
        if (flag)
        {
            setY((int)l);
            obj = new a(true);
        } else
        {
            obj = f();
        }
        startAnimation(((Animation) (obj)));
        c.showSoftInput(this, 2, b);
        setSelection(getText().length());
        setCursorVisible(true);
        Mf.a().a(new MB(true));
    }

    protected boolean a(MotionEvent motionevent)
    {
        if (aP.a(motionevent) == 1)
        {
            if (!u)
            {
                int i1 = getOffsetForPosition(motionevent.getX(), motionevent.getY() - (float)d());
                if (i1 >= 0)
                {
                    setSelection(i1);
                }
            }
            u = false;
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    protected final void b()
    {
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    protected final void b(float f1)
    {
        setY(f1);
        l = f1;
    }

    protected final void b(int i1)
    {
        e = i1;
    }

    protected abstract void b(MotionEvent motionevent);

    public abstract void b(boolean flag);

    protected abstract void c();

    protected final void c(boolean flag)
    {
        i = flag;
    }

    public boolean c(MotionEvent motionevent)
    {
        return motionevent.getRawY() > (float)(getTop() - 75) && motionevent.getY() < (float)(getBottom() + 75);
    }

    protected abstract int d();

    protected void e()
    {
        n = true;
        u = false;
        requestFocus();
        Mf.a().a(new MB(true));
        c.showSoftInput(this, 2, b);
    }

    protected abstract Animation f();

    protected abstract Animation g();

    public final void h()
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        q = Math.min((int)(((float)displaymetrics.heightPixels / 2.0F + ((float)displaymetrics.widthPixels * 1.5F) / 2.0F) - (float)getHeight()), displaymetrics.heightPixels - getHeight());
        r = Math.max((int)((float)displaymetrics.heightPixels / 2.0F - ((float)displaymetrics.widthPixels * 1.5F) / 2.0F), 0);
    }

    protected final int i()
    {
        return e;
    }

    protected ArrayList j()
    {
        return A;
    }

    protected abstract Fx k();

    public boolean onKeyPreIme(int i1, KeyEvent keyevent)
    {
        if (n && keyevent.getAction() == 1 && i1 == 4)
        {
            b(true);
        }
        if (n && !a && i1 == 67 && TextUtils.isEmpty(getText()))
        {
            b(true);
        }
        return super.onKeyPreIme(i1, keyevent);
    }

    protected void onScrollChanged(int i1, int j1, int k1, int l1)
    {
        super.onScrollChanged(i1, j1, k1, l1);
        u = true;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if (n)
        {
            setVisibility(0);
            c.showSoftInput(this, 2, b);
            requestFocus();
        } else
        if (!TextUtils.isEmpty(getText()) && h && getTop() + j1 >= q)
        {
            post(new Runnable(new Handler(), new Runnable() {

                private CaptionEditText a;

                public final void run()
                {
                    a.h();
                    int i2 = Math.min((int)a.l, a.q);
                    if (i2 != a.getTop())
                    {
                        a.b(i2);
                    }
                    a.setVisibility(0);
                }

            
            {
                a = CaptionEditText.this;
                super();
            }
            }) {

                private Handler a;
                private Runnable b;
                private CaptionEditText c;

                public final void run()
                {
                    c.setVisibility(4);
                    c.setY(0.0F);
                    a.postDelayed(b, 10L);
                }

            
            {
                c = CaptionEditText.this;
                a = handler;
                b = runnable;
                super();
            }
            });
            h = false;
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        i1 = aP.a(motionevent);
        if (!hasFocus() || !n) goto _L2; else goto _L1
_L1:
        flag = a(motionevent);
_L8:
        return flag;
_L2:
        i1;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 82
    //                   1 264
    //                   2 105;
           goto _L3 _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_264;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L9:
        flag = flag1;
        if (!n)
        {
            b(motionevent);
            return true;
        }
        if (true) goto _L8; else goto _L7
_L7:
        v = motionevent.getRawY();
        w = motionevent.getRawX();
        h();
          goto _L9
_L6:
        float f1 = motionevent.getRawY();
        float f2 = motionevent.getRawX();
        float f3 = f2 - w;
        float f4 = f1 - v;
        y = y + Math.abs(f3);
        z = z + Math.abs(f4);
        if (Math.abs(f3) >= x || Math.abs(f4) >= x || y >= x || z >= x)
        {
            o = true;
        }
        if (!p)
        {
            if ((double)Math.abs(y) > (double)z * t)
            {
                flag = true;
            }
            p = flag;
        }
        v = f1;
        w = f2;
          goto _L9
        y = 0.0F;
        z = 0.0F;
        if (o)
        {
            o = false;
        } else
        {
            a(false);
        }
          goto _L9
    }

    public void setInterface(FB fb)
    {
        d = fb;
    }


    // Unreferenced inner class com/snapchat/android/ui/caption/CaptionEditText$a$1

/* anonymous class */
    final class a._cls1
        implements android.view.animation.Animation.AnimationListener
    {

        private boolean a;
        private a b;

        public final void onAnimationEnd(Animation animation)
        {
            if (a)
            {
                b.a.setVisibility(0);
                b.a.setAlpha(1.0F);
                b.a.setCursorVisible(true);
            } else
            {
                b.a.setVisibility(4);
                b.a.setAlpha(0.0F);
            }
            b.a.invalidate();
            b.a.clearAnimation();
            b.a.g = false;
            b.a.f = false;
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
            b.a.f = true;
        }

            
            {
                b = a1;
                a = flag;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/caption/CaptionEditText$b$1

/* anonymous class */
    final class b._cls1
        implements android.view.animation.Animation.AnimationListener
    {

        private boolean a;
        private int b;
        private int c;
        private b d;

        public final void onAnimationEnd(Animation animation)
        {
            if (a)
            {
                d.a.setVisibility(0);
                d.a.setAlpha(1.0F);
                d.a.setCursorVisible(true);
            } else
            {
                d.a.setVisibility(4);
                d.a.setAlpha(0.0F);
            }
            d.a.invalidate();
            d.a.a(b, c);
            d.a.clearAnimation();
            d.a.g = false;
            d.a.f = false;
            CaptionEditText.a(d.a);
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
            d.a.f = true;
        }

            
            {
                d = b1;
                a = true;
                b = i1;
                c = j1;
                super();
            }
    }

}
