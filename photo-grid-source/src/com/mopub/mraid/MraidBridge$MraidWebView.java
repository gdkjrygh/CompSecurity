// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import android.view.View;
import com.mopub.mobileads.BaseWebView;

public class c extends BaseWebView
{

    private OnVisibilityChangedListener b;
    private boolean c;

    final void a(OnVisibilityChangedListener onvisibilitychangedlistener)
    {
        b = onvisibilitychangedlistener;
    }

    public boolean isVisible()
    {
        return c;
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != c)
        {
            c = flag;
            class OnVisibilityChangedListener
            {

                public abstract void onVisibilityChanged(boolean flag1);
            }

            if (b != null)
            {
                b.onVisibilityChanged(c);
            }
        }
    }

    public OnVisibilityChangedListener(Context context)
    {
        super(context);
        boolean flag;
        if (getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
