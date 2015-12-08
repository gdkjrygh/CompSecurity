// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

public interface afb
{

    public abstract boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);

    public abstract void onRequestDisallowInterceptTouchEvent(boolean flag);

    public abstract void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);
}
