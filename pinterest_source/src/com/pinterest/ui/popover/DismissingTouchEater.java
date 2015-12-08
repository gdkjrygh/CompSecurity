// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.popover;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class DismissingTouchEater extends View
{

    public DismissingTouchEater(Context context)
    {
        this(context, null);
    }

    public DismissingTouchEater(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DismissingTouchEater(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void init(AttributeSet attributeset)
    {
        setOnClickListener(new _cls1());
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final DismissingTouchEater this$0;
        final boolean val$finishOnTouchOutside;

        public void onClick(View view)
        {
            if (finishOnTouchOutside)
            {
                ((Activity)view.getContext()).onBackPressed();
            }
        }

        _cls1()
        {
            this$0 = DismissingTouchEater.this;
            finishOnTouchOutside = flag;
            super();
        }
    }

}
