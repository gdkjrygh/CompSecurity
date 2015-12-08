// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            a, MediaLinkProfile

public class OnMediaDownloadedForSave extends a
{

    private String path;
    private MediaLinkProfile profile;

    public OnMediaDownloadedForSave(int i, String s, MediaLinkProfile medialinkprofile)
    {
        super(i);
        path = s;
        profile = medialinkprofile;
    }

    public volatile int getMediaDocumentId()
    {
        return super.getMediaDocumentId();
    }

    public String getPath()
    {
        return path;
    }

    public MediaLinkProfile getProfile()
    {
        return profile;
    }
}
