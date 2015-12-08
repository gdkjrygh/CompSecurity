// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.view.View;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;

public interface RefreshableScreen
{

    public abstract MultiSwipeRefreshLayout getRefreshLayout();

    public abstract View[] getRefreshableViews();
}
