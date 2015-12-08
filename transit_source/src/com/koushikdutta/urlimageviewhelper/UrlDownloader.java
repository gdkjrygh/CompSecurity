// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.Context;
import java.io.InputStream;

public interface UrlDownloader
{
    public static interface UrlDownloaderCallback
    {

        public abstract void onDownloadComplete(UrlDownloader urldownloader, InputStream inputstream, String s);
    }


    public abstract boolean allowCache();

    public abstract boolean canDownloadUrl(String s);

    public abstract void download(Context context, String s, String s1, UrlDownloaderCallback urldownloadercallback, Runnable runnable);
}
