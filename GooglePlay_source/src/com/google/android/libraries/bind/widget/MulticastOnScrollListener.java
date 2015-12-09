// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.widget.AbsListView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class MulticastOnScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    public final Set listeners = new HashSet();

    public MulticastOnScrollListener()
    {
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((android.widget.AbsListView.OnScrollListener)iterator.next()).onScroll(abslistview, i, j, k)) { }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((android.widget.AbsListView.OnScrollListener)iterator.next()).onScrollStateChanged(abslistview, i)) { }
    }
}
