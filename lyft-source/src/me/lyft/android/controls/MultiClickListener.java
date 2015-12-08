// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;

public abstract class MultiClickListener
    implements android.view.View.OnClickListener
{

    private long startTimer;
    private int tapCount;

    public MultiClickListener()
    {
        tapCount = 0;
        startTimer = 0L;
    }

    private void vibrate(View view)
    {
        ((Vibrator)view.getContext().getSystemService("vibrator")).vibrate(200L);
    }

    public void onClick(View view)
    {
        long l = System.currentTimeMillis();
        if (startTimer == 0L || l - startTimer > 250L)
        {
            tapCount = 1;
        } else
        {
            tapCount = tapCount + 1;
        }
        startTimer = l;
        if (tapCount == 5)
        {
            vibrate(view);
            onMultiClick();
        }
    }

    public abstract void onMultiClick();
}
