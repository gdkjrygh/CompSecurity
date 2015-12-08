// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.loadable;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.fitbit.ui.loadable:
//            LoadablePicassoImageView, e, b

public class CircleLoadablePicassoImageView extends LoadablePicassoImageView
{

    public CircleLoadablePicassoImageView(Context context)
    {
        super(context);
    }

    public CircleLoadablePicassoImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CircleLoadablePicassoImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void a()
    {
        a = new e(getContext(), this);
        a.d = false;
        b = new e(getContext(), this);
    }

    public void a(float f, int i)
    {
        ((e)a).a(getContext(), f, i);
        ((e)b).a(getContext(), f, i);
    }
}
