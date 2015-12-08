// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            a, MediaLinkProfile

public class OnMediaDownloadCriticalError extends a
{

    private final MediaLinkProfile profile;

    public OnMediaDownloadCriticalError(int i, MediaLinkProfile medialinkprofile)
    {
        super(i);
        profile = medialinkprofile;
    }

    public volatile int getMediaDocumentId()
    {
        return super.getMediaDocumentId();
    }

    public MediaLinkProfile getProfile()
    {
        return profile;
    }
}
