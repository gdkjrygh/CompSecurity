// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.google.android.apps.translate.widget:
//            Space, at, au

public class SizeListeningView extends Space
{

    public long a;
    private au b;

    public SizeListeningView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    static au a(SizeListeningView sizelisteningview)
    {
        return sizelisteningview.b;
    }

    public final boolean a()
    {
        if (System.currentTimeMillis() - a >= 1000L)
        {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            int i = getRootView().getHeight();
            if (i - (rect.bottom - rect.top) <= i / 3)
            {
                return false;
            }
        }
        return true;
    }

    protected void onAttachedToWindow()
    {
        a = System.currentTimeMillis();
        super.onAttachedToWindow();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        a = System.currentTimeMillis();
        super.onConfigurationChanged(configuration);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (b != null)
        {
            post(new at(this, i, j, k, l));
        }
    }

    public void setOnSizeChangeListener(au au)
    {
        b = au;
    }
}
