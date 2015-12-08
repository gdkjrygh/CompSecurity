// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil, MediaLinkProfile

final class tMediaLinkResult
    implements Runnable
{

    final MediaDocumentDownloadUtil this$0;
    final tMediaLinkResult val$cachedFavIconResult;
    final tMediaLinkResult val$cachedImageResult;
    final tMediaLinkResult val$cachedThumbnailResult;
    final MediaDocument val$mediaDocument;
    final tMediaLinkResult val$urlPreviewFuture;

    public final void run()
    {
        if (val$cachedFavIconResult == null)
        {
            tMediaLinkResult tmedialinkresult = new <init>(MediaDocumentDownloadUtil.this, val$mediaDocument, val$urlPreviewFuture);
            val$urlPreviewFuture.registerObserver(MediaLinkProfile.FAVICON_PROFILE, tmedialinkresult);
            val$urlPreviewFuture.fetchMediaProfile(MediaLinkProfile.FAVICON_PROFILE);
        } else
        {
            val$urlPreviewFuture.setProfileResult(MediaLinkProfile.FAVICON_PROFILE, val$cachedFavIconResult);
        }
        if (val$cachedThumbnailResult == null)
        {
            Object obj = new <init>(MediaDocumentDownloadUtil.this, val$mediaDocument, val$urlPreviewFuture);
            val$urlPreviewFuture.registerObserver(MediaLinkProfile.THUMBNAIL_PROFILE, ((ROFILE) (obj)));
            obj = lPreviewType.fromString(val$mediaDocument.getTypeProp(), val$mediaDocument.getMimeTypeProp());
            val$urlPreviewFuture.fetchMediaProfile(MediaLinkProfile.THUMBNAIL_PROFILE, ((lPreviewType) (obj)));
        } else
        {
            val$urlPreviewFuture.setProfileResult(MediaLinkProfile.THUMBNAIL_PROFILE, val$cachedThumbnailResult);
        }
        if (val$cachedImageResult == null)
        {
            lPreviewType lpreviewtype = new <init>(MediaDocumentDownloadUtil.this, val$mediaDocument, val$urlPreviewFuture);
            val$urlPreviewFuture.registerObserver(MediaLinkProfile.IMG_PROFILE, lpreviewtype);
            val$urlPreviewFuture.fetchMediaProfile(MediaLinkProfile.IMG_PROFILE);
            return;
        } else
        {
            val$urlPreviewFuture.setProfileResult(MediaLinkProfile.IMG_PROFILE, val$cachedImageResult);
            return;
        }
    }

    tMediaLinkResult()
    {
        this$0 = final_mediadocumentdownloadutil;
        val$cachedFavIconResult = tmedialinkresult;
        val$mediaDocument = mediadocument;
        val$urlPreviewFuture = tmedialinkresult1;
        val$cachedThumbnailResult = tmedialinkresult2;
        val$cachedImageResult = tMediaLinkResult.this;
        super();
    }
}
