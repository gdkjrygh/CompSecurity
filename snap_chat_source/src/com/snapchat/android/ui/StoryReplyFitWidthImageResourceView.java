// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.ui:
//            ChatMediaImageResourceView

public class StoryReplyFitWidthImageResourceView extends ChatMediaImageResourceView
{

    private static int g;
    private static int h;
    private View i;

    public StoryReplyFitWidthImageResourceView(Context context)
    {
        super(context);
        g();
    }

    public StoryReplyFitWidthImageResourceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g();
    }

    public StoryReplyFitWidthImageResourceView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        g();
    }

    private void g()
    {
        if (getResources() != null)
        {
            g = (int)getResources().getDimension(0x7f0a0065);
            h = (int)getResources().getDimension(0x7f0a0136);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        i = a.findViewById(0x7f0d017f);
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(j), (h + i.getHeight()) - g);
    }
}
