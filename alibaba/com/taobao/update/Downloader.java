// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.update;


public interface Downloader
{
    public static interface OnDownloaderListener
    {

        public static final int ERROR_NOT_ENOUGH_SPACE = -2;
        public static final String ERROR_NOT_ENOUGH_SPACE_STR = "\u7CFB\u7EDF\u7A7A\u95F4\u4E0D\u8DB3";

        public abstract void onDownloadError(int i, String s);

        public abstract void onDownloadFinsh(String s);

        public abstract void onDownloadProgress(int i);
    }


    public abstract void cancelDownload();

    public abstract void download(String s, String s1, long l);

    public abstract void setListener(OnDownloaderListener ondownloaderlistener);
}
