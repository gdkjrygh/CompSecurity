// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            a, MediaLinkProfile

abstract class b extends a
{

    private final String path;
    private final MediaLinkProfile profile;
    private final com.skype.MediaDocument.MEDIA_STATUS status;

    public b(int i, com.skype.MediaDocument.MEDIA_STATUS media_status, String s, MediaLinkProfile medialinkprofile)
    {
        super(i);
        status = media_status;
        path = s;
        profile = medialinkprofile;
    }

    public String getPath()
    {
        return path;
    }

    public MediaLinkProfile getProfile()
    {
        return profile;
    }

    public com.skype.MediaDocument.MEDIA_STATUS getStatus()
    {
        return status;
    }
}
