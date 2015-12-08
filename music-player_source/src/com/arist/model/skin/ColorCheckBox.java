// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

// Referenced classes of package com.arist.model.skin:
//            m, b

public class ColorCheckBox extends ImageView
    implements m
{

    boolean a;
    int b;
    private android.widget.CompoundButton.OnCheckedChangeListener c;

    public ColorCheckBox(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        setImageResource(a());
    }

    private int a()
    {
        if (!isEnabled())
        {
            setColorFilter(null);
            return 0x7f0200e5;
        }
        if (a)
        {
            setColorFilter(new LightingColorFilter(b, 1));
            return 0x7f0200e4;
        } else
        {
            setColorFilter(null);
            return 0x7f0200e6;
        }
    }

    public final void a(int i)
    {
        b = i;
    }

    public final void a(android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
    {
        c = oncheckedchangelistener;
    }

    public final void a(boolean flag)
    {
        if (a != flag)
        {
            a = flag;
            setImageResource(a());
        }
    }

    protected void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (isEnabled() && motionevent.getAction() == 1)
        {
            boolean flag;
            if (a)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            a = flag;
            setImageResource(a());
            if (c != null)
            {
                c.onCheckedChanged(null, a);
                return true;
            }
        }
        return true;
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        setImageResource(a());
    }
}
