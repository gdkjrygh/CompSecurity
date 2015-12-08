// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil

public static class 
{

    private username avatar;
    private String description;
    private username favicon;
    private boolean isDownloadedFromNetwork;
    private MediaDocument mediaDocument;
    private String mimeType;
    private username thumbnail;
    private String title;
    private username type;
    private String userHandle;
    private String username;

    public  create()
    {
        return new (mediaDocument, favicon, thumbnail, avatar, username, userHandle, type, mimeType, title, description, isDownloadedFromNetwork, null);
    }

    public isDownloadedFromNetwork setAvatar(isDownloadedFromNetwork isdownloadedfromnetwork)
    {
        avatar = isdownloadedfromnetwork;
        return this;
    }

    public avatar setDescription(String s)
    {
        description = s;
        return this;
    }

    public description setFavicon(description description1)
    {
        favicon = description1;
        return this;
    }

    public favicon setIsDownloadedFromNetwork(boolean flag)
    {
        isDownloadedFromNetwork = flag;
        return this;
    }

    public isDownloadedFromNetwork setMediaDocument(MediaDocument mediadocument)
    {
        mediaDocument = mediadocument;
        return this;
    }

    public mediaDocument setMimeType(String s)
    {
        mimeType = s;
        return this;
    }

    public mimeType setThumbnail(mimeType mimetype)
    {
        thumbnail = mimetype;
        return this;
    }

    public thumbnail setTitle(String s)
    {
        title = s;
        return this;
    }

    public title setType(title title1)
    {
        type = title1;
        return this;
    }

    public type setUserHandle(String s)
    {
        userHandle = s;
        return this;
    }

    public userHandle setUsername(String s)
    {
        username = s;
        return this;
    }

    public ()
    {
    }
}
