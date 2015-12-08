// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.view.MotionEvent;

// Referenced classes of package com.tinder.views:
//            SwipeDetector

public static interface 
{

    public abstract void onTouchMove(MotionEvent motionevent, float f, float f1, float f2, float f3, float f4, float f5);

    public abstract void onTouchUp(MotionEvent motionevent, float f, float f1, float f2, float f3, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4);
}
