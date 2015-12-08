// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.scrollview;

import android.view.View;
import com.pinterest.ui.actions.ScrollableListener;

public abstract class I
    implements ScrollableListener
{

    public void onLayout()
    {
    }

    public void onMeasure()
    {
    }

    public abstract void onScroll(View view, int i, int j, int k, int l);

    public I()
    {
    }
}
