// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.material;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.widget.material:
//            b, a

public class MaterialRippleTextView extends LocaleTextView
    implements b
{

    private a a;

    public MaterialRippleTextView(Context context)
    {
        this(context, null, 0);
    }

    public MaterialRippleTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MaterialRippleTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
        a = new a();
        a.a(context, attributeset, i, this);
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
        return false;
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
