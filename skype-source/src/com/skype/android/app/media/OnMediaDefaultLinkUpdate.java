// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;

public class OnMediaDefaultLinkUpdate
{

    private final MediaDocument mediaDocument;
    private final String profile;
    private final int sizeDownloaded;
    private final com.skype.MediaDocument.MEDIA_STATUS status;
    private final int totalSize;

    public OnMediaDefaultLinkUpdate(MediaDocument mediadocument, String s, com.skype.MediaDocument.MEDIA_STATUS media_status)
    {
        this(mediadocument, s, media_status, -1, 1000);
    }

    public OnMediaDefaultLinkUpdate(MediaDocument mediadocument, String s, com.skype.MediaDocument.MEDIA_STATUS media_status, int i, int j)
    {
        mediaDocument = mediadocument;
        profile = s;
        status = media_status;
        sizeDownloaded = i;
        totalSize = j;
    }

    public MediaDocument getMediaDocument()
    {
        return mediaDocument;
    }

    public String getProfile()
    {
        return profile;
    }

    public int getSizeDownloaded()
    {
        return sizeDownloaded;
    }

    public com.skype.MediaDocument.MEDIA_STATUS getStatus()
    {
        return status;
    }

    public int getTotalSize()
    {
        return totalSize;
    }
}
