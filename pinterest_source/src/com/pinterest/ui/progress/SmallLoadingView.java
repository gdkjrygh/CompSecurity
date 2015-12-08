// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.pinterest.ui.progress:
//            SmallLoadingDrawable

public class SmallLoadingView extends View
{

    private boolean _loading;
    private SmallLoadingDrawable _progress;

    public SmallLoadingView(Context context)
    {
        this(context, null);
    }

    public SmallLoadingView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SmallLoadingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _loading = true;
        _progress = new SmallLoadingDrawable();
    }

    protected void onDraw(Canvas canvas)
    {
        if (_loading && getVisibility() == 0)
        {
            _progress.drawScaled(this, canvas, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    public void setLoading(boolean flag)
    {
        _loading = flag;
        invalidate();
    }
}
