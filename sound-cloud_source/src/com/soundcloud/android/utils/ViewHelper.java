// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.view.View;
import com.soundcloud.android.util.AnimUtils;

public class ViewHelper
{

    public ViewHelper()
    {
    }

    public void hideView(View view, int i, boolean flag)
    {
        AnimUtils.hideView(view, i, flag);
    }

    public void setCircularButtonOutline(View view, final int dimension)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            view.setOutlineProvider(new _cls1());
            view.setClipToOutline(true);
        }
    }

    public void showView(View view, boolean flag)
    {
        AnimUtils.showView(view, flag);
    }

    private class _cls1 extends ViewOutlineProvider
    {

        final ViewHelper this$0;
        final int val$dimension;

        public void getOutline(View view, Outline outline)
        {
            outline.setOval(0, 0, dimension, dimension);
        }

        _cls1()
        {
            this$0 = ViewHelper.this;
            dimension = i;
            super();
        }
    }

}
