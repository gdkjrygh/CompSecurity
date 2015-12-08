// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;

import android.widget.AbsListView;
import com.nostra13.universalimageloader.core.ImageLoader;

public class PauseOnScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private final android.widget.AbsListView.OnScrollListener externalListener;
    private ImageLoader imageLoader;
    private final boolean pauseOnFling;
    private final boolean pauseOnScroll;

    public PauseOnScrollListener(ImageLoader imageloader, boolean flag, boolean flag1)
    {
        this(imageloader, flag, flag1, null);
    }

    public PauseOnScrollListener(ImageLoader imageloader, boolean flag, boolean flag1, android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        imageLoader = imageloader;
        pauseOnScroll = flag;
        pauseOnFling = flag1;
        externalListener = onscrolllistener;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (externalListener != null)
        {
            externalListener.onScroll(abslistview, i, j, k);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 47
    //                   1 57
    //                   2 74;
           goto _L1 _L2 _L3 _L4
_L1:
        if (externalListener != null)
        {
            externalListener.onScrollStateChanged(abslistview, i);
        }
        return;
_L2:
        imageLoader.resume();
        continue; /* Loop/switch isn't completed */
_L3:
        if (pauseOnScroll)
        {
            imageLoader.pause();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (pauseOnFling)
        {
            imageLoader.pause();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
