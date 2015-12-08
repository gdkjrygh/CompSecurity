// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.v;
import android.support.v7.internal.widget.m;
import android.support.v7.internal.widget.o;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package android.support.v7.widget:
//            b, d

public class AppCompatEditText extends EditText
    implements v
{

    private o a;
    private b b;
    private d c;

    public AppCompatEditText(Context context)
    {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.a.a.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeset, int i)
    {
        super(m.a(context), attributeset, i);
        a = o.a(getContext());
        b = new b(this, a);
        b.a(attributeset, i);
        c = new d(this);
        c.a(attributeset, i);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (b != null)
        {
            b.b();
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (b != null)
        {
            b.a();
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
