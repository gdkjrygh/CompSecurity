// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import kh;
import wa;
import zl;
import zs;

public class AppCompatButton extends Button
    implements kh
{

    private final wa a;
    private final zl b;
    private final zs c;

    public AppCompatButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010138);
    }

    public AppCompatButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = wa.a(getContext());
        b = new zl(this, a);
        b.a(attributeset, i);
        c = zs.a(this);
        c.a(attributeset, i);
        c.a();
    }

    public final void a(ColorStateList colorstatelist)
    {
        b.a(colorstatelist);
    }

    public final void a(android.graphics.PorterDuff.Mode mode)
    {
        b.a(mode);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        b.a();
        if (c != null)
        {
            c.a();
        }
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

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        b.b(null);
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        b.a(i);
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (c != null)
        {
            c.a(context, i);
        }
    }
}
