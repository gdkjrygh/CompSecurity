// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import me.lyft.android.common.Strings;

public class FlashButton extends Button
{

    private static final int STATE_AUTO_FLASH[] = {
        0x7f01004f
    };
    private static final int STATE_FLASH_OFF[] = {
        0x7f010051
    };
    private static final int STATE_FLASH_ON[] = {
        0x7f010050
    };
    private String flashMode;

    public FlashButton(Context context)
    {
        super(context);
    }

    public FlashButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FlashButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public String getFlashMode()
    {
        if (Strings.isNullOrEmpty(flashMode))
        {
            return "auto";
        } else
        {
            return flashMode;
        }
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 2);
        if (getFlashMode().equals("auto"))
        {
            mergeDrawableStates(ai, STATE_AUTO_FLASH);
        } else
        {
            if (getFlashMode().equals("on"))
            {
                mergeDrawableStates(ai, STATE_FLASH_ON);
                return ai;
            }
            if (getFlashMode().equals("off"))
            {
                mergeDrawableStates(ai, STATE_FLASH_OFF);
                return ai;
            }
        }
        return ai;
    }

    public void setFlashMode(String s)
    {
        flashMode = s;
        refreshDrawableState();
    }

}
