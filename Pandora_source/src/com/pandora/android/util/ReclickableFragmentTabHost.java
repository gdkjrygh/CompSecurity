// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.support.v4.app.FragmentTabHost;
import android.util.AttributeSet;

public class ReclickableFragmentTabHost extends FragmentTabHost
{

    public ReclickableFragmentTabHost(Context context)
    {
        super(context);
    }

    public ReclickableFragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onTouchModeChanged(boolean flag)
    {
    }
}
