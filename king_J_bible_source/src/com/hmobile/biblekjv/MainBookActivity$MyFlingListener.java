// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.MotionEvent;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class init> extends android.view.stener
{

    final MainBookActivity this$0;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (motionevent == null || motionevent1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (Math.abs(motionevent.getY() - motionevent1.getY()) > 250F)
        {
            return false;
        }
        if (motionevent.getX() - motionevent1.getX() <= 120F || Math.abs(f) <= 200F)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        MainBookActivity.access$25(MainBookActivity.this);
        return false;
        try
        {
            if (motionevent1.getX() - motionevent.getX() > 120F && Math.abs(f) > 200F)
            {
                MainBookActivity.access$26(MainBookActivity.this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return false;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    ()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
