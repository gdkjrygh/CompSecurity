// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview.caching;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public interface HeaderProvider
{

    public abstract View getHeader(RecyclerView recyclerview, int i);

    public abstract void invalidate();
}
