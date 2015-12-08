// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fe;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.ui:
//            ChatMediaImageResourceView

public class ChatMediaFitWidthImageResourceView extends ChatMediaImageResourceView
{

    private static int g;
    private static int h;
    private static int i;
    private static int j;

    public ChatMediaFitWidthImageResourceView(Context context)
    {
        super(context);
        g();
    }

    public ChatMediaFitWidthImageResourceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g();
    }

    public ChatMediaFitWidthImageResourceView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        g();
    }

    private void a(int k)
    {
        ((ViewGroup)a.getParent()).getLayoutParams().width = (i << 1) + k;
    }

    private void g()
    {
        if (getResources() != null)
        {
            g = (int)getResources().getDimension(0x7f0a0008);
            h = (int)getResources().getDimension(0x7f0a005c);
            i = (int)getResources().getDimension(0x7f0a0065);
            j = (int)getResources().getDimension(0x7f0a0040);
        }
    }

    protected void onMeasure(int k, int l)
    {
        super.onMeasure(k, l);
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        k = (int)((double)displaymetrics.heightPixels / 2D);
        l = g;
        int i1 = h;
        int j1 = i;
        l = Math.max(j, k - l - i1 - j1);
        if (c != null && c.c() == SnapchatResource.ResourceStatus.LOADED)
        {
            Drawable drawable = getDrawable();
            if (drawable != null)
            {
                k = drawable.getIntrinsicHeight();
                if (k > 0)
                {
                    k = (drawable.getIntrinsicWidth() * l) / k;
                    setMeasuredDimension(k, l);
                    a(k);
                }
                return;
            }
        }
        if (d != 0 && e != 0)
        {
            k = (int)(((float)l * (float)d) / (float)e);
        } else
        {
            k = (int)(((float)l * (float)displaymetrics.widthPixels) / (float)displaymetrics.heightPixels);
        }
        setMeasuredDimension(k, l);
        a(k);
    }
}
