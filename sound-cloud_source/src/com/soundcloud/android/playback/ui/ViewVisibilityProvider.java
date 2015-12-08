// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;

public interface ViewVisibilityProvider
{

    public static final ViewVisibilityProvider EMPTY = new _cls1();

    public abstract boolean isCurrentlyVisible(View view);


    private class _cls1
        implements ViewVisibilityProvider
    {

        public final boolean isCurrentlyVisible(View view)
        {
            return false;
        }

        _cls1()
        {
        }
    }

}
