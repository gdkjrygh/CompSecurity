// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bo;
import android.support.v7.a.b;
import android.support.v7.internal.widget.ai;
import android.support.v7.internal.widget.al;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package android.support.v7.widget:
//            m, u

public class AppCompatEditText extends EditText
    implements bo
{

    private al a;
    private m b;
    private u c;

    public AppCompatEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.editTextStyle);
    }

    private AppCompatEditText(Context context, AttributeSet attributeset, int i)
    {
        super(ai.a(context), attributeset, i);
        a = al.a(getContext());
        b = new m(this, a);
        b.a(attributeset, i);
        c = new u(this);
        c.a(attributeset, i);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (b != null)
        {
            b.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (b != null)
        {
            return b.a();
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (b != null)
        {
            return b.b();
        } else
        {
            return null;
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (b != null)
        {
            b.b(null);
        }
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
        if (b != null)
        {
            b.a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (b != null)
        {
            b.a(colorstatelist);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (b != null)
        {
            b.a(mode);
        }
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
