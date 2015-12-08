// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class TouchInterceptableListView extends ListView
{

    private List a;

    public TouchInterceptableListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        new Object() {

        };
    }

    public TouchInterceptableListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
        new _cls1();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.contains(Integer.valueOf(motionevent.getAction()));
        return super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a.contains(Integer.valueOf(motionevent.getAction()));
        return super.onTouchEvent(motionevent);
    }
}
