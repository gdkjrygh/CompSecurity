// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;

public class OnMediaUploadProgress
{

    private final MediaDocument mediaDocument;
    private final String profile;
    private final int sizeUploaded;
    private final com.skype.MediaDocument.MEDIA_STATUS status;
    private final int totalSize;

    public OnMediaUploadProgress(MediaDocument mediadocument, String s, com.skype.MediaDocument.MEDIA_STATUS media_status, int i, int j)
    {
        mediaDocument = mediadocument;
        profile = s;
        status = media_status;
        sizeUploaded = i;
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

    public int getSizeUploaded()
    {
        return sizeUploaded;
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
