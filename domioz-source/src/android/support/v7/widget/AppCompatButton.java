// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.b.a;
import android.support.v7.internal.widget.at;
import android.support.v7.internal.widget.aw;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.az;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class AppCompatButton extends Button
{

    private static final int a[] = {
        0x10100d4
    };
    private aw b;
    private aw c;
    private ax d;

    public AppCompatButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.q);
    }

    public AppCompatButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (ax.a)
        {
            az az1 = az.a(getContext(), attributeset, a, i);
            if (az1.f(0))
            {
                ColorStateList colorstatelist = az1.c().b(az1.f(0, -1));
                if (colorstatelist != null)
                {
                    a(colorstatelist);
                }
            }
            d = az1.c();
            az1.b();
        }
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, l.N, i, 0);
        int j = typedarray.getResourceId(l.O, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, l.aY);
            if (typedarray1.hasValue(l.ba))
            {
                setAllCaps(typedarray1.getBoolean(l.ba, false));
            }
            typedarray1.recycle();
        }
        attributeset = context.obtainStyledAttributes(attributeset, l.N, i, 0);
        if (attributeset.hasValue(l.P))
        {
            setAllCaps(attributeset.getBoolean(l.P, false));
        }
        attributeset.recycle();
        attributeset = getTextColors();
        if (attributeset != null && !attributeset.isStateful())
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                i = at.c(context, 0x1010038);
            } else
            {
                i = at.a(context, 0x1010038);
            }
            setTextColor(at.a(attributeset.getDefaultColor(), i));
        }
    }

    private void a()
    {
        if (getBackground() != null)
        {
            if (c != null)
            {
                ax.a(this, c);
            } else
            if (b != null)
            {
                ax.a(this, b);
                return;
            }
        }
    }

    private void a(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (b == null)
            {
                b = new aw();
            }
            b.a = colorstatelist;
            b.d = true;
        } else
        {
            b = null;
        }
        a();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        a();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/widget/Button.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/Button.getName());
    }

    public void setAllCaps(boolean flag)
    {
        a a1;
        if (flag)
        {
            a1 = new a(getContext());
        } else
        {
            a1 = null;
        }
        setTransformationMethod(a1);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        a(null);
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        ColorStateList colorstatelist;
        if (d != null)
        {
            colorstatelist = d.b(i);
        } else
        {
            colorstatelist = null;
        }
        a(colorstatelist);
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        context = context.obtainStyledAttributes(i, l.aY);
        if (context.hasValue(l.ba))
        {
            setAllCaps(context.getBoolean(l.ba, false));
        }
        context.recycle();
    }

}
