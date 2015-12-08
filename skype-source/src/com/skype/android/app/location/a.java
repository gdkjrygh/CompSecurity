// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class a extends FrameLayout
{

    List listeners;

    public a(Context context)
    {
        super(context);
        listeners = new ArrayList();
    }

    public final void addOnMapTouchListener(MapFragmentTouchable.OnMapTouchListener onmaptouchlistener)
    {
        listeners.add(onmaptouchlistener);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((MapFragmentTouchable.OnMapTouchListener)iterator.next()).onMapTouch(motionevent)) { }
        return super.dispatchTouchEvent(motionevent);
    }
}
