// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.crashlytics.android.d;

public class SafeImageView extends ImageView
{

    private Throwable a;

    public SafeImageView(Context context)
    {
        super(context);
    }

    public SafeImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SafeImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onDraw(Canvas canvas)
    {
        try
        {
            super.onDraw(canvas);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        if (canvas.getCause() == null && canvas.getMessage() != null && canvas.getMessage().startsWith("Canvas: trying to use a recycled bitmap"))
        {
            canvas.initCause(a);
            d.a(canvas);
            return;
        } else
        {
            throw canvas;
        }
    }

    public void setGlideCallStack(Throwable throwable)
    {
        a = throwable;
    }
}
