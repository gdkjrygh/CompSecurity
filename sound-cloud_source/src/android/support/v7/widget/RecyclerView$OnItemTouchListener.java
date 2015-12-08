// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.MotionEvent;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static interface 
{

    public abstract boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);

    public abstract void onRequestDisallowInterceptTouchEvent(boolean flag);

    public abstract void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);
}
