// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import android.webkit.MimeTypeMap;

public class StoredFile
{

    private String apptentiveUri;
    private String id;
    private String localFilePath;
    private String mimeType;
    private String originalUri;

    public StoredFile()
    {
    }

    public String getApptentiveUri()
    {
        return apptentiveUri;
    }

    public String getFileName()
    {
        return String.format("file.%s", new Object[] {
            MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType)
        });
    }

    public String getId()
    {
        return id;
    }

    public String getLocalFilePath()
    {
        return localFilePath;
    }

    public String getMimeType()
    {
        return mimeType;
    }

    public String getOriginalUri()
    {
        return originalUri;
    }

    public void setApptentiveUri(String s)
    {
        apptentiveUri = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLocalFilePath(String s)
    {
        localFilePath = s;
    }

    public void setMimeType(String s)
    {
        mimeType = s;
    }

    public void setOriginalUri(String s)
    {
        originalUri = s;
    }
}
