// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.material;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.qihoo.security.widget.CheckBoxPreference;

// Referenced classes of package com.qihoo.security.widget.material:
//            b, a

public class MaterialRippleCheckBox extends CheckBoxPreference
    implements b
{

    private a b;

    public MaterialRippleCheckBox(Context context)
    {
        this(context, null);
    }

    public MaterialRippleCheckBox(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = null;
        b = new a();
        b.a(context, attributeset, 0, this);
    }

    public void a(Canvas canvas)
    {
        super.draw(canvas);
    }

    public void draw(Canvas canvas)
    {
        b.a(canvas);
    }

    public boolean isInEditMode()
    {
        return false;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        b.a(i, j, k, l);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onTouchEvent(motionevent);
        return b.a(motionevent, flag, isEnabled());
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        b.a(onclicklistener);
    }
}
