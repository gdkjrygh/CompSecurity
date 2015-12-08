// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Movie;
import com.skype.MediaDocument;
import com.skype.android.concurrent.ListenableCompletableFuture;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil, MediaLinkProfile, UrlPreviewMediaAgent

final class 
    implements Runnable
{

    final MediaDocumentDownloadUtil this$0;
    final ListenableCompletableFuture val$future;
    final MediaDocument val$mediaDocument;

    public final void run()
    {
        String s = val$mediaDocument.getMediaLink(MediaLinkProfile.THUMBNAIL_PROFILE.toString()).m_path;
        Movie movie = null;
        if (s != null)
        {
            movie = Movie.decodeFile(s);
        }
        MediaDocumentDownloadUtil.access$300(MediaDocumentDownloadUtil.this).postMovieDecodingResultEvent(val$future, movie, s);
    }

    ()
    {
        this$0 = final_mediadocumentdownloadutil;
        val$mediaDocument = mediadocument;
        val$future = ListenableCompletableFuture.this;
        super();
    }
}
