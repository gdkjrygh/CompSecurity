// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;
import android.support.v7.media.f;
import android.support.v7.media.g;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import p.a.a;

// Referenced classes of package android.support.v7.app:
//            s, r, o, q

public class MediaRouteButton extends View
{
    private final class a extends android.support.v7.media.g.a
    {

        final MediaRouteButton a;

        public void a(g g1, android.support.v7.media.g.e e1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        public void a(g g1, android.support.v7.media.g.f f1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        public void b(g g1, android.support.v7.media.g.e e1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        public void b(g g1, android.support.v7.media.g.f f1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        public void c(g g1, android.support.v7.media.g.e e1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        public void c(g g1, android.support.v7.media.g.f f1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        public void d(g g1, android.support.v7.media.g.f f1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        public void e(g g1, android.support.v7.media.g.f f1)
        {
            android.support.v7.app.MediaRouteButton.a(a);
        }

        private a()
        {
            a = MediaRouteButton.this;
            super();
        }

    }


    private static final int l[] = {
        0x10100a0
    };
    private static final int m[] = {
        0x101009f
    };
    private final g a;
    private final a b;
    private f c;
    private r d;
    private boolean e;
    private Drawable f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;

    public MediaRouteButton(Context context)
    {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.mediarouter.R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeset, int i1)
    {
        super(android.support.v7.app.s.a(context, false), attributeset, i1);
        c = f.a;
        d = android.support.v7.app.r.a();
        context = getContext();
        a = android.support.v7.media.g.a(context);
        b = new a();
        context = context.obtainStyledAttributes(attributeset, android.support.v7.mediarouter.R.styleable.MediaRouteButton, i1, 0);
        setRemoteIndicatorDrawable(context.getDrawable(2));
        j = context.getDimensionPixelSize(0, 0);
        k = context.getDimensionPixelSize(1, 0);
        context.recycle();
        setClickable(true);
        setLongClickable(true);
    }

    static void a(MediaRouteButton mediaroutebutton)
    {
        mediaroutebutton.b();
    }

    private void b()
    {
        boolean flag = false;
        if (e)
        {
            android.support.v7.media.g.f f1 = a.c();
            boolean flag1;
            boolean flag2;
            if (!f1.g() && f1.a(c))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && f1.e())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (g != flag1)
            {
                g = flag1;
                flag = true;
            }
            if (i != flag2)
            {
                i = flag2;
                flag = true;
            }
            if (flag)
            {
                refreshDrawableState();
            }
            setEnabled(a.a(c, 1));
        }
    }

    private Activity getActivity()
    {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext())
        {
            if (context instanceof Activity)
            {
                return (Activity)context;
            }
        }

        return null;
    }

    private h getFragmentManager()
    {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity)
        {
            return ((FragmentActivity)activity).f();
        } else
        {
            return null;
        }
    }

    private void setRemoteIndicatorDrawable(Drawable drawable)
    {
        if (f != null)
        {
            f.setCallback(null);
            unscheduleDrawable(f);
        }
        f = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
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
        refreshDrawableState();
    }

    public boolean a()
    {
        if (!e)
        {
            return false;
        }
        h h1 = getFragmentManager();
        if (h1 == null)
        {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        android.support.v7.media.g.f f1 = a.c();
        if (f1.g() || !f1.a(c))
        {
            if (h1.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null)
            {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            o o1 = d.b();
            o1.a(c);
            o1.show(h1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
        } else
        {
            if (h1.a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null)
            {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            d.c().show(h1, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
        }
        return true;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (f != null)
        {
            int ai[] = getDrawableState();
            f.setState(ai);
            invalidate();
        }
    }

    public r getDialogFactory()
    {
        return d;
    }

    public f getRouteSelector()
    {
        return c;
    }

    public void jumpDrawablesToCurrentState()
    {
        if (getBackground() != null)
        {
            p.a.a.a(getBackground());
        }
        if (f != null)
        {
            p.a.a.a(f);
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        e = true;
        if (!c.b())
        {
            a.a(c, b);
        }
        b();
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (i)
        {
            mergeDrawableStates(ai, m);
        } else
        if (g)
        {
            mergeDrawableStates(ai, l);
            return ai;
        }
        return ai;
    }

    public void onDetachedFromWindow()
    {
        e = false;
        if (!c.b())
        {
            a.a(b);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (f != null)
        {
            int j2 = getPaddingLeft();
            int k2 = getWidth();
            int l2 = getPaddingRight();
            int k1 = getPaddingTop();
            int l1 = getHeight();
            int i2 = getPaddingBottom();
            int i1 = f.getIntrinsicWidth();
            int j1 = f.getIntrinsicHeight();
            j2 += (k2 - l2 - j2 - i1) / 2;
            k1 = (l1 - i2 - k1 - j1) / 2 + k1;
            f.setBounds(j2, k1, j2 + i1, k1 + j1);
            f.draw(canvas);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int k2;
        i2 = 0;
        l1 = android.view.View.MeasureSpec.getSize(i1);
        k1 = android.view.View.MeasureSpec.getSize(j1);
        int j2 = android.view.View.MeasureSpec.getMode(i1);
        j1 = android.view.View.MeasureSpec.getMode(j1);
        k2 = j;
        int l2;
        if (f != null)
        {
            i1 = f.getIntrinsicWidth();
        } else
        {
            i1 = 0;
        }
        k2 = Math.max(k2, i1);
        l2 = k;
        i1 = i2;
        if (f != null)
        {
            i1 = f.getIntrinsicHeight();
        }
        i2 = Math.max(l2, i1);
        j2;
        JVM INSTR lookupswitch 2: default 116
    //                   -2147483648: 187
    //                   1073741824: 181;
           goto _L1 _L2 _L3
_L1:
        i1 = k2 + getPaddingLeft() + getPaddingRight();
_L7:
        j1;
        JVM INSTR lookupswitch 2: default 156
    //                   -2147483648: 213
    //                   1073741824: 208;
           goto _L4 _L5 _L6
_L4:
        j1 = getPaddingTop() + i2 + getPaddingBottom();
_L8:
        setMeasuredDimension(i1, j1);
        return;
_L3:
        i1 = l1;
          goto _L7
_L2:
        i1 = Math.min(l1, k2 + getPaddingLeft() + getPaddingRight());
          goto _L7
_L6:
        j1 = k1;
          goto _L8
_L5:
        j1 = Math.min(k1, getPaddingTop() + i2 + getPaddingBottom());
          goto _L8
    }

    public boolean performClick()
    {
        boolean flag = false;
        boolean flag1 = super.performClick();
        if (!flag1)
        {
            playSoundEffect(0);
        }
        if (a() || flag1)
        {
            flag = true;
        }
        return flag;
    }

    public boolean performLongClick()
    {
        if (super.performLongClick())
        {
            return true;
        }
        if (!h)
        {
            return false;
        }
        Object obj = getContentDescription();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(ai);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int i1 = getWidth();
        int j1 = getHeight();
        int k1 = ai[1];
        int l1 = j1 / 2;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(context, ((CharSequence) (obj)), 0);
        if (k1 + l1 < rect.height())
        {
            ((Toast) (obj)).setGravity(0x800035, i2 - ai[0] - i1 / 2, j1);
        } else
        {
            ((Toast) (obj)).setGravity(81, 0, j1);
        }
        ((Toast) (obj)).show();
        performHapticFeedback(0);
        return true;
    }

    void setCheatSheetEnabled(boolean flag)
    {
        h = flag;
    }

    public void setDialogFactory(r r1)
    {
        if (r1 == null)
        {
            throw new IllegalArgumentException("factory must not be null");
        } else
        {
            d = r1;
            return;
        }
    }

    public void setRouteSelector(f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!c.equals(f1))
        {
            if (e)
            {
                if (!c.b())
                {
                    a.a(b);
                }
                if (!f1.b())
                {
                    a.a(f1, b);
                }
            }
            c = f1;
            b();
        }
    }

    public void setVisibility(int i1)
    {
        super.setVisibility(i1);
        if (f != null)
        {
            Drawable drawable = f;
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
        return super.verifyDrawable(drawable) || drawable == f;
    }

}
