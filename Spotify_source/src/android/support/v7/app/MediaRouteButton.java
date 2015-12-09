// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import aa;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import dm;
import rz;
import sa;
import se;
import sm;
import sn;
import sp;
import t;
import u;
import wq;
import ws;
import xd;
import yr;

public class MediaRouteButton extends View
{

    private static final int j[] = {
        0x10100a0
    };
    private static final int k[] = {
        0x101009f
    };
    private final ws a;
    private final rz b;
    private wq c;
    private boolean d;
    private Drawable e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;

    public MediaRouteButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010014);
    }

    public MediaRouteButton(Context context, AttributeSet attributeset, int l)
    {
        super(sp.a(context), attributeset, l);
        c = wq.c;
        sn.a();
        context = getContext();
        a = ws.a(context);
        b = new rz(this, (byte)0);
        context = context.obtainStyledAttributes(attributeset, yr.a, l, 0);
        attributeset = context.getDrawable(yr.d);
        if (e != null)
        {
            e.setCallback(null);
            unscheduleDrawable(e);
        }
        e = attributeset;
        if (attributeset != null)
        {
            attributeset.setCallback(this);
            attributeset.setState(getDrawableState());
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            attributeset.setVisible(flag, false);
        }
        refreshDrawableState();
        h = context.getDimensionPixelSize(yr.c, 0);
        i = context.getDimensionPixelSize(yr.b, 0);
        context.recycle();
        setClickable(true);
        setLongClickable(true);
    }

    private void a()
    {
        boolean flag = false;
        boolean flag1 = true;
        if (d)
        {
            xd xd1 = ws.b();
            boolean flag2;
            boolean flag3;
            if (!xd1.d() && xd1.a(c))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2 && xd1.i)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (f != flag2)
            {
                f = flag2;
                flag = true;
            }
            if (g != flag3)
            {
                g = flag3;
                flag = flag1;
            }
            if (flag)
            {
                refreshDrawableState();
                if (g && (e.getCurrent() instanceof AnimationDrawable))
                {
                    AnimationDrawable animationdrawable = (AnimationDrawable)e.getCurrent();
                    if (!animationdrawable.isRunning())
                    {
                        animationdrawable.start();
                    }
                }
            }
            setEnabled(ws.a(c));
        }
    }

    public static void a(MediaRouteButton mediaroutebutton)
    {
        mediaroutebutton.a();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (e != null)
        {
            int ai[] = getDrawableState();
            e.setState(ai);
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        if (getBackground() != null)
        {
            dm.a(getBackground());
        }
        if (e != null)
        {
            dm.a(e);
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        d = true;
        if (!c.c())
        {
            a.a(c, b, 0);
        }
        a();
    }

    protected int[] onCreateDrawableState(int l)
    {
        int ai[] = super.onCreateDrawableState(l + 1);
        if (g)
        {
            mergeDrawableStates(ai, k);
        } else
        if (f)
        {
            mergeDrawableStates(ai, j);
            return ai;
        }
        return ai;
    }

    public void onDetachedFromWindow()
    {
        d = false;
        if (!c.c())
        {
            a.a(b);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (e != null)
        {
            int i2 = getPaddingLeft();
            int j2 = getWidth();
            int k2 = getPaddingRight();
            int j1 = getPaddingTop();
            int k1 = getHeight();
            int l1 = getPaddingBottom();
            int l = e.getIntrinsicWidth();
            int i1 = e.getIntrinsicHeight();
            i2 += (j2 - k2 - i2 - l) / 2;
            j1 = (k1 - l1 - j1 - i1) / 2 + j1;
            e.setBounds(i2, j1, i2 + l, j1 + i1);
            e.draw(canvas);
        }
    }

    protected void onMeasure(int l, int i1)
    {
        int j1;
        int k1;
        int l1;
        l1 = 0;
        k1 = android.view.View.MeasureSpec.getSize(l);
        j1 = android.view.View.MeasureSpec.getSize(i1);
        int j2 = android.view.View.MeasureSpec.getMode(l);
        int i2 = android.view.View.MeasureSpec.getMode(i1);
        i1 = h;
        int k2;
        if (e != null)
        {
            l = e.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight();
        } else
        {
            l = 0;
        }
        i1 = Math.max(i1, l);
        k2 = i;
        l = l1;
        if (e != null)
        {
            l = e.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        l1 = Math.max(k2, l);
        j2;
        JVM INSTR lookupswitch 2: default 132
    //                   -2147483648: 185
    //                   1073741824: 179;
           goto _L1 _L2 _L3
_L1:
        l = i1;
_L7:
        i2;
        JVM INSTR lookupswitch 2: default 164
    //                   -2147483648: 200
    //                   1073741824: 195;
           goto _L4 _L5 _L6
_L4:
        i1 = l1;
_L8:
        setMeasuredDimension(l, i1);
        return;
_L3:
        l = k1;
          goto _L7
_L2:
        l = Math.min(k1, i1);
          goto _L7
_L6:
        i1 = j1;
          goto _L8
_L5:
        i1 = Math.min(j1, l1);
          goto _L8
    }

    public boolean performClick()
    {
        Object obj2;
        boolean flag1;
        obj2 = null;
        flag1 = super.performClick();
        if (!flag1)
        {
            playSoundEffect(0);
        }
        if (d) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L7:
        Object obj;
        Activity activity;
        return flag || flag1;
_L2:
        obj = getContext();
_L5:
        if (!(obj instanceof ContextWrapper))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (!(obj instanceof Activity)) goto _L4; else goto _L3
_L3:
        activity = (Activity)obj;
_L6:
        obj = obj2;
        if (activity instanceof u)
        {
            obj = ((u)activity).a_();
        }
        if (obj == null)
        {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        break MISSING_BLOCK_LABEL_112;
_L4:
        obj = ((ContextWrapper)obj).getBaseContext();
          goto _L5
        activity = null;
          goto _L6
        Object obj1 = ws.b();
        Bundle bundle;
        se se1;
        wq wq1;
        if (((xd) (obj1)).d() || !((xd) (obj1)).a(c))
        {
label0:
            {
                if (((aa) (obj)).a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null)
                {
                    break label0;
                }
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                flag = false;
            }
        } else
        {
label1:
            {
                if (((aa) (obj)).a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null)
                {
                    break label1;
                }
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                flag = false;
            }
        }
          goto _L7
        se1 = sn.b();
        wq1 = c;
        if (wq1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        se1.F();
        if (!se1.Y.equals(wq1))
        {
            se1.Y = wq1;
            bundle = ((Fragment) (se1)).k;
            obj1 = bundle;
            if (bundle == null)
            {
                obj1 = new Bundle();
            }
            ((Bundle) (obj1)).putBundle("selector", wq1.a);
            se1.f(((Bundle) (obj1)));
            obj1 = (sa)((t) (se1)).b;
            if (obj1 != null)
            {
                ((sa) (obj1)).a(wq1);
            }
        }
        se1.a(((aa) (obj)), "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
_L8:
        flag = true;
          goto _L7
        sn.c().a(((aa) (obj)), "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
          goto _L8
    }

    public boolean performLongClick()
    {
        return super.performLongClick();
    }

    public void setVisibility(int l)
    {
        super.setVisibility(l);
        if (e != null)
        {
            Drawable drawable = e;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == e;
    }

}
