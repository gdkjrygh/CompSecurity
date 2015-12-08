// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.async_tasks;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.aviary.android.feather.sdk.async_tasks:
//            AsyncImageManager

static class c
{

    public Bitmap a;
    public ImageView b;
    public final int c;

    public (Bitmap bitmap, ImageView imageview, int i)
    {
        b = imageview;
        a = bitmap;
        c = i;
    }
}
