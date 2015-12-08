// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ProfileCameraMaskView extends View
{

    public Bitmap a;
    private final Paint b;

    public ProfileCameraMaskView(Context context)
    {
        super(context);
        b = new Paint(1);
    }

    public ProfileCameraMaskView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Paint(1);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null)
        {
            canvas.save();
            canvas.drawBitmap(a, 0.0F, 0.0F, b);
            canvas.restore();
        }
    }

    static 
    {
        com/snapchat/android/ui/ProfileCameraMaskView.getSimpleName();
    }
}
