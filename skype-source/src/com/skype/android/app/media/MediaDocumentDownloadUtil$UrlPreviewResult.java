// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil

public static class t
{
    public static class Builder
    {

        private MediaDocumentDownloadUtil.GetMediaLinkResult avatar;
        private String description;
        private MediaDocumentDownloadUtil.GetMediaLinkResult favicon;
        private boolean isDownloadedFromNetwork;
        private MediaDocument mediaDocument;
        private String mimeType;
        private MediaDocumentDownloadUtil.GetMediaLinkResult thumbnail;
        private String title;
        private MediaDocumentDownloadUtil.UrlPreviewType type;
        private String userHandle;
        private String username;

        public MediaDocumentDownloadUtil.UrlPreviewResult create()
        {
            return new MediaDocumentDownloadUtil.UrlPreviewResult(mediaDocument, favicon, thumbnail, avatar, username, userHandle, type, mimeType, title, description, isDownloadedFromNetwork, null);
        }

        public Builder setAvatar(MediaDocumentDownloadUtil.GetMediaLinkResult getmedialinkresult)
        {
            avatar = getmedialinkresult;
            return this;
        }

        public Builder setDescription(String s)
        {
            description = s;
            return this;
        }

        public Builder setFavicon(MediaDocumentDownloadUtil.GetMediaLinkResult getmedialinkresult)
        {
            favicon = getmedialinkresult;
            return this;
        }

        public Builder setIsDownloadedFromNetwork(boolean flag)
        {
            isDownloadedFromNetwork = flag;
            return this;
        }

        public Builder setMediaDocument(MediaDocument mediadocument)
        {
            mediaDocument = mediadocument;
            return this;
        }

        public Builder setMimeType(String s)
        {
            mimeType = s;
            return this;
        }

        public Builder setThumbnail(MediaDocumentDownloadUtil.GetMediaLinkResult getmedialinkresult)
        {
            thumbnail = getmedialinkresult;
            return this;
        }

        public Builder setTitle(String s)
        {
            title = s;
            return this;
        }

        public Builder setType(MediaDocumentDownloadUtil.UrlPreviewType urlpreviewtype)
        {
            type = urlpreviewtype;
            return this;
        }

        public Builder setUserHandle(String s)
        {
            userHandle = s;
            return this;
        }

        public Builder setUsername(String s)
        {
            username = s;
            return this;
        }

        public Builder()
        {
        }
    }


    private t avatar;
    private String description;
    private t favicon;
    private boolean isDownloadedFromNetwork;
    private MediaDocument mediaDocument;
    private String mimeType;
    private String title;
    private t type;
    private t urlMedia;
    private String userHandle;
    private String username;

    public t getAvatar()
    {
        return avatar;
    }

    public String getDescription()
    {
        return description;
    }

    public t getFavicon()
    {
        return favicon;
    }

    public MediaDocument getMediaDocument()
    {
        return mediaDocument;
    }

    public String getMimeType()
    {
        return mimeType;
    }

    public String getTitle()
    {
        return title;
    }

    public title getType()
    {
        return type;
    }

    public t getUrlMedia()
    {
        return urlMedia;
    }

    public String getUserHandle()
    {
        return userHandle;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean isDownloadedFromNetwork()
    {
        return isDownloadedFromNetwork;
    }

    private t(MediaDocument mediadocument, t t, t t1, t t2, String s, String s1, t t3, 
            String s2, String s3, String s4, boolean flag)
    {
        mediaDocument = mediadocument;
        favicon = t;
        urlMedia = t1;
        type = t3;
        mimeType = s2;
        title = s3;
        description = s4;
        avatar = t2;
        username = s;
        userHandle = s1;
        isDownloadedFromNetwork = flag;
    }

    t(MediaDocument mediadocument, t t, t t1, t t2, String s, String s1, t t3, 
            String s2, String s3, String s4, boolean flag, t t4)
    {
        this(mediadocument, t, t1, t2, s, s1, t3, s2, s3, s4, flag);
    }
}
