// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperations

public class ImagePauseOnScrollListener extends android.support.v7.widget.RecyclerView.OnScrollListener
{

    private final ImageOperations imageOperations;

    public ImagePauseOnScrollListener(ImageOperations imageoperations)
    {
        imageOperations = imageoperations;
    }

    public void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        switch (i)
        {
        case 1: // '\001'
        default:
            return;

        case 0: // '\0'
            imageOperations.resume();
            return;

        case 2: // '\002'
            imageOperations.pause();
            break;
        }
    }
}
