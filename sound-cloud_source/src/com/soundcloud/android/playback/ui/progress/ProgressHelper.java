// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ProgressAnimator

public abstract class ProgressHelper
{

    private final int endPosition;
    private final int startPosition;

    protected ProgressHelper(int i, int j)
    {
        startPosition = i;
        endPosition = j;
    }

    public abstract ProgressAnimator createAnimator(View view, float f);

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ProgressHelper)obj;
            if (endPosition != ((ProgressHelper) (obj)).endPosition || startPosition != ((ProgressHelper) (obj)).startPosition)
            {
                return false;
            }
        }
        return true;
    }

    public int getEndPosition()
    {
        return endPosition;
    }

    public float getProgressFromPosition(int i)
    {
        return ((float)i - (float)startPosition) / (float)(endPosition - startPosition);
    }

    protected float getValueFromProportion(float f)
    {
        return (float)startPosition + (float)(endPosition - startPosition) * f;
    }

    public int hashCode()
    {
        return startPosition * 31 + endPosition;
    }

    public abstract void setValue(View view, float f);

    public void setValueFromProportion(View view, float f)
    {
        setValue(view, getValueFromProportion(f));
    }
}
