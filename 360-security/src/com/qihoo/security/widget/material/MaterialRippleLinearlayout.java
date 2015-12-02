// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.material;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

// Referenced classes of package com.qihoo.security.widget.material:
//            b, a

public class MaterialRippleLinearlayout extends LinearLayout
    implements b
{

    private a a;

    public MaterialRippleLinearlayout(Context context)
    {
        this(context, null);
    }

    public MaterialRippleLinearlayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        a = new a();
        a.a(context, attributeset, 0, this);
    }

    public void a(Canvas canvas)
    {
        super.draw(canvas);
    }

    public void draw(Canvas canvas)
    {
        a.a(canvas);
    }

    public boolean isInEditMode()
    {
        return true;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a.a(i, j, k, l);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onTouchEvent(motionevent);
        return a.a(motionevent, flag, isEnabled());
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        a.a(onclicklistener);
    }
}
