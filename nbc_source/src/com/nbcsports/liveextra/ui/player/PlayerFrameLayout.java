// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerFrameLayout extends FrameLayout
{
    public static interface OnSizeChangeListener
    {

        public abstract void onSizeChanged(long l, long l1);
    }


    private final List sizeChangeEventListeners;

    public PlayerFrameLayout(Context context)
    {
        this(context, null);
    }

    public PlayerFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayerFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        sizeChangeEventListeners = new ArrayList();
    }

    private void dispatchOnSizeChangeEvent(long l, long l1)
    {
        for (Iterator iterator = sizeChangeEventListeners.iterator(); iterator.hasNext(); ((OnSizeChangeListener)iterator.next()).onSizeChanged(l, l1)) { }
    }

    public void addOnSizeChangeListener(OnSizeChangeListener onsizechangelistener)
    {
        sizeChangeEventListeners.add(onsizechangelistener);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        dispatchOnSizeChangeEvent(i, j);
    }

    public void removeOnSizeChangeEventListener(OnSizeChangeListener onsizechangelistener)
    {
        sizeChangeEventListeners.remove(onsizechangelistener);
    }
}
