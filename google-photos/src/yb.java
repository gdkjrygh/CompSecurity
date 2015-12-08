// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

final class yb extends adg
    implements android.view.View.OnLongClickListener
{

    ry a;
    private final int b[] = {
        0x10100d4
    };
    private TextView c;
    private ImageView d;
    private View e;
    private xx f;

    public yb(xx xx1, Context context, ry ry1, boolean flag)
    {
        f = xx1;
        super(context, null, b.k);
        a = ry1;
        xx1 = yj.a(context, null, b, b.k, 0);
        if (xx1.d(0))
        {
            setBackgroundDrawable(xx1.a(0));
        }
        ((yj) (xx1)).a.recycle();
        if (flag)
        {
            b(0x800013);
        }
        a();
    }

    public final void a()
    {
        Object obj = a;
        Object obj1 = ((ry) (obj)).d();
        if (obj1 != null)
        {
            obj = ((View) (obj1)).getParent();
            if (obj != this)
            {
                if (obj != null)
                {
                    ((ViewGroup)obj).removeView(((View) (obj1)));
                }
                addView(((View) (obj1)));
            }
            e = ((View) (obj1));
            if (c != null)
            {
                c.setVisibility(8);
            }
            if (d != null)
            {
                d.setVisibility(8);
                d.setImageDrawable(null);
            }
            return;
        }
        if (e != null)
        {
            removeView(e);
            e = null;
        }
        android.graphics.drawable.Drawable drawable = ((ry) (obj)).b();
        obj1 = ((ry) (obj)).c();
        boolean flag;
        if (drawable != null)
        {
            if (d == null)
            {
                ImageView imageview = new ImageView(getContext());
                adh adh2 = new adh(-2, -2);
                adh2.h = 16;
                imageview.setLayoutParams(adh2);
                addView(imageview, 0);
                d = imageview;
            }
            d.setImageDrawable(drawable);
            d.setVisibility(0);
        } else
        if (d != null)
        {
            d.setVisibility(8);
            d.setImageDrawable(null);
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (c == null)
            {
                acf acf1 = new acf(getContext(), null, b.l);
                acf1.setEllipsize(android.text.TextUtils.TruncateAt.END);
                adh adh1 = new adh(-2, -2);
                adh1.h = 16;
                acf1.setLayoutParams(adh1);
                addView(acf1);
                c = acf1;
            }
            c.setText(((CharSequence) (obj1)));
            c.setVisibility(0);
        } else
        if (c != null)
        {
            c.setVisibility(8);
            c.setText(null);
        }
        if (d != null)
        {
            d.setContentDescription(((ry) (obj)).f());
        }
        if (!flag && !TextUtils.isEmpty(((ry) (obj)).f()))
        {
            setOnLongClickListener(this);
            return;
        } else
        {
            setOnLongClickListener(null);
            setLongClickable(false);
            return;
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(ry.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            accessibilitynodeinfo.setClassName(ry.getName());
        }
    }

    public final boolean onLongClick(View view)
    {
        view = new int[2];
        getLocationOnScreen(view);
        Object obj = getContext();
        int i = getWidth();
        int j = getHeight();
        int k = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(((Context) (obj)), a.f(), 0);
        ((Toast) (obj)).setGravity(49, (view[0] + i / 2) - k / 2, j);
        ((Toast) (obj)).show();
        return true;
    }

    public final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (f.c > 0 && getMeasuredWidth() > f.c)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(f.c, 0x40000000), j);
        }
    }

    public final void setSelected(boolean flag)
    {
        boolean flag1;
        if (isSelected() != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        super.setSelected(flag);
        if (flag1 && flag)
        {
            sendAccessibilityEvent(4);
        }
    }
}
