// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;

// Referenced classes of package com.squareup.picasso:
//            Utils, OkHttpDownloader, Downloader

private static class 
{

    static Downloader create(Context context)
    {
        return new OkHttpDownloader(context);
    }
}
