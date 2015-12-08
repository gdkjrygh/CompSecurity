// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            b, MediaLinkProfile

public class OnMediaDocumentLinkStatusChange extends b
{

    public OnMediaDocumentLinkStatusChange(int i, com.skype.MediaDocument.MEDIA_STATUS media_status, String s, MediaLinkProfile medialinkprofile)
    {
        super(i, media_status, s, medialinkprofile);
    }

    public volatile int getMediaDocumentId()
    {
        return super.getMediaDocumentId();
    }

    public volatile String getPath()
    {
        return super.getPath();
    }

    public volatile MediaLinkProfile getProfile()
    {
        return super.getProfile();
    }

    public volatile com.skype.MediaDocument.MEDIA_STATUS getStatus()
    {
        return super.getStatus();
    }
}
