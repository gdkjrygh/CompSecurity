// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

// Referenced classes of package com.tinder.views:
//            CustomEditText

public class PermissiveEditText extends CustomEditText
{

    protected boolean mIsEditable;
    private boolean mShouldTouchesBePassedOn;

    public PermissiveEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean isEditable()
    {
        return mIsEditable;
    }

    public boolean onAllowedTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mShouldTouchesBePassedOn)
        {
            return false;
        }
        if (mIsEditable)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return onAllowedTouchEvent(motionevent);
        }
    }

    public void setIsEditable(boolean flag)
    {
        mIsEditable = flag;
    }

    public void setShouldTouchesBePassedOn(boolean flag)
    {
        mShouldTouchesBePassedOn = flag;
    }

    public boolean shouldTouchesBePassedOn()
    {
        return mShouldTouchesBePassedOn;
    }
}
