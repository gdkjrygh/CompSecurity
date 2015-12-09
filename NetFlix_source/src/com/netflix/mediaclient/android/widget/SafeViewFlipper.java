// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewFlipper;
import com.netflix.mediaclient.Log;

public class SafeViewFlipper extends ViewFlipper
{

    private static final String TAG = "nf-ui";

    public SafeViewFlipper(Context context)
    {
        super(context);
    }

    public SafeViewFlipper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.d("nf-ui", "SafeViewFlipper ignoring IllegalArgumentException");
        }
        stopFlipping();
    }
}
