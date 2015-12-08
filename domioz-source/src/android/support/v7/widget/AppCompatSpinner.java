// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.a.b;
import android.support.v7.internal.widget.aw;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.az;
import android.util.AttributeSet;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import java.lang.reflect.Field;

public class AppCompatSpinner extends Spinner
{

    private static final int a[] = {
        0x10100d4, 0x1010176
    };
    private aw b;
    private aw c;
    private ax d;

    public AppCompatSpinner(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.F);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!ax.a) goto _L2; else goto _L1
_L1:
        context = az.a(getContext(), attributeset, a, i);
        if (context.f(0))
        {
            attributeset = context.c().b(context.f(0, -1));
            if (attributeset != null)
            {
                a(attributeset);
            }
        }
        if (!context.f(1)) goto _L4; else goto _L3
_L3:
        attributeset = context.a(1);
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L6; else goto _L5
_L5:
        setPopupBackgroundDrawable(attributeset);
_L4:
        d = context.c();
        context.b();
_L2:
        return;
_L6:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            try
            {
                Object obj = android/widget/Spinner.getDeclaredField("mPopup");
                ((Field) (obj)).setAccessible(true);
                obj = ((Field) (obj)).get(this);
                if (obj instanceof ListPopupWindow)
                {
                    ((ListPopupWindow)obj).setBackgroundDrawable(attributeset);
                }
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                attributeset.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                attributeset.printStackTrace();
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
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

}
