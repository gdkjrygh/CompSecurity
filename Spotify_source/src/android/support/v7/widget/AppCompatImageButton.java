// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import kh;
import wa;
import zl;
import zn;

public class AppCompatImageButton extends ImageButton
    implements kh
{

    private zl a;
    private zn b;

    public AppCompatImageButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010114);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = wa.a(context);
        a = new zl(this, context);
        a.a(attributeset, i);
        b = new zn(this, context);
        b.a(attributeset, i);
    }

    public final void a(ColorStateList colorstatelist)
    {
        if (a != null)
        {
            a.a(colorstatelist);
        }
    }

    public final void a(android.graphics.PorterDuff.Mode mode)
    {
        if (a != null)
        {
            a.a(mode);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (a != null)
        {
            a.a();
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (a != null)
        {
            a.b(null);
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (a != null)
        {
            a.a(i);
        }
    }

    public void setImageResource(int i)
    {
        b.a(i);
    }
}
