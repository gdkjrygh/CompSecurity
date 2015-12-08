// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            MediaLinkSaveError

public class OnMediaSaveToGalleryErrorEvent
{

    MediaLinkSaveError mediaLinkSaveError;
    int messageId;
    int sdCardMissingId;
    int titleId;

    public OnMediaSaveToGalleryErrorEvent(MediaLinkSaveError medialinksaveerror, int i, int j, int k)
    {
        mediaLinkSaveError = medialinksaveerror;
        titleId = i;
        messageId = j;
        sdCardMissingId = k;
    }

    public MediaLinkSaveError getMediaLinkSaveError()
    {
        return mediaLinkSaveError;
    }

    public int getMessageId()
    {
        return messageId;
    }

    public int getSdCardMissingId()
    {
        return sdCardMissingId;
    }

    public int getTitleId()
    {
        return titleId;
    }
}
