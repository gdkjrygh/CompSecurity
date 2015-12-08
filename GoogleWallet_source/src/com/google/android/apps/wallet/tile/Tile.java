// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tile;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.android.swipedismiss.SwipeDismissTouchListener;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public abstract class Tile
    implements com.google.android.swipedismiss.SwipeDismissTouchListener.DismissCallbacks
{
    public static interface TileDismissedListener
    {

        public abstract void onTileDismissed(Tile tile);
    }


    protected final Activity context;
    private final List dismissListeners = Lists.newArrayList();
    protected boolean mActive;
    protected SwipeDismissTouchListener touchListener;
    private View view;

    public Tile(Activity activity)
    {
        context = (Activity)Preconditions.checkNotNull(activity);
    }

    private void configureSwipeDismissTouchListener(View view1)
    {
        if (!view1.hasOnClickListeners())
        {
            view1.setOnClickListener(null);
        }
        touchListener = new SwipeDismissTouchListener(view1, view1, this);
        view1.setOnTouchListener(touchListener);
    }

    public final void addTileDismissedListener(TileDismissedListener tiledismissedlistener)
    {
        dismissListeners.add(tiledismissedlistener);
    }

    public boolean canDismiss(Object obj)
    {
        return true;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (Tile)obj;
            return getEqualityId().equals(((Tile) (obj)).getEqualityId());
        }
    }

    public String getAnchor()
    {
        return "";
    }

    protected String getEqualityId()
    {
        return getClass().getName();
    }

    public String getServerId()
    {
        return getClass().getName();
    }

    public final View getView()
    {
        return (View)Preconditions.checkNotNull(view, "View is currently null.");
    }

    public int hashCode()
    {
        return getEqualityId().hashCode();
    }

    protected void onActivate()
    {
        mActive = true;
    }

    protected abstract View onCreateView(ViewGroup viewgroup);

    protected void onDeactivate()
    {
        mActive = false;
    }

    public void onDismiss(View view1, Object obj)
    {
        ThreadPreconditions.checkOnUiThread();
        view1.setOnTouchListener(null);
        for (view1 = dismissListeners.iterator(); view1.hasNext(); ((TileDismissedListener)view1.next()).onTileDismissed(this)) { }
    }

    public final void setView(View view1)
    {
        view = (View)Preconditions.checkNotNull(view1);
        configureSwipeDismissTouchListener(view1);
    }

    public abstract boolean shouldShow();
}
