// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.c;
import android.support.v7.b.b;
import android.support.v7.widget.aa;
import android.support.v7.widget.ab;
import android.support.v7.widget.z;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package android.support.v7.internal.widget:
//            am, ab

class af extends aa
    implements android.view.View.OnLongClickListener
{

    final android.support.v7.internal.widget.ab a;
    private final int b[] = {
        0x10100d4
    };
    private c c;
    private TextView d;
    private ImageView e;
    private View f;

    public af(android.support.v7.internal.widget.ab ab1, Context context, c c1, boolean flag)
    {
        a = ab1;
        super(context, null, b.actionBarTabStyle);
        c = c1;
        ab1 = am.a(context, null, b, b.actionBarTabStyle, 0);
        if (ab1.d(0))
        {
            setBackgroundDrawable(ab1.a(0));
        }
        ab1.b();
        if (flag)
        {
            setGravity(0x800013);
        }
        a();
    }

    public void a()
    {
        Object obj = c;
        Object obj1 = ((c) (obj)).c();
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
            f = ((View) (obj1));
            if (d != null)
            {
                d.setVisibility(8);
            }
            if (e != null)
            {
                e.setVisibility(8);
                e.setImageDrawable(null);
            }
            return;
        }
        if (f != null)
        {
            removeView(f);
            f = null;
        }
        android.graphics.drawable.Drawable drawable = ((c) (obj)).a();
        obj1 = ((c) (obj)).b();
        boolean flag;
        if (drawable != null)
        {
            if (e == null)
            {
                ImageView imageview = new ImageView(getContext());
                ab ab2 = new ab(-2, -2);
                ab2.h = 16;
                imageview.setLayoutParams(ab2);
                addView(imageview, 0);
                e = imageview;
            }
            e.setImageDrawable(drawable);
            e.setVisibility(0);
        } else
        if (e != null)
        {
            e.setVisibility(8);
            e.setImageDrawable(null);
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
            if (d == null)
            {
                z z1 = new z(getContext(), null, b.actionBarTabTextStyle);
                z1.setEllipsize(android.text.TextUtils.TruncateAt.END);
                ab ab1 = new ab(-2, -2);
                ab1.h = 16;
                z1.setLayoutParams(ab1);
                addView(z1);
                d = z1;
            }
            d.setText(((CharSequence) (obj1)));
            d.setVisibility(0);
        } else
        if (d != null)
        {
            d.setVisibility(8);
            d.setText(null);
        }
        if (e != null)
        {
            e.setContentDescription(((c) (obj)).e());
        }
        if (!flag && !TextUtils.isEmpty(((c) (obj)).e()))
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

    public void a(c c1)
    {
        c = c1;
        a();
    }

    public c b()
    {
        return c;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/a/c.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            accessibilitynodeinfo.setClassName(android/support/v7/a/c.getName());
        }
    }

    public boolean onLongClick(View view)
    {
        view = new int[2];
        getLocationOnScreen(view);
        Object obj = getContext();
        int i = getWidth();
        int j = getHeight();
        int k = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(((Context) (obj)), c.e(), 0);
        ((Toast) (obj)).setGravity(49, (view[0] + i / 2) - k / 2, j);
        ((Toast) (obj)).show();
        return true;
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (a.b > 0 && getMeasuredWidth() > a.b)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a.b, 0x40000000), j);
        }
    }

    public void setSelected(boolean flag)
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
