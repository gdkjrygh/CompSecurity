// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Movie;
import com.skype.MediaDocument;
import com.skype.android.concurrent.FutureListener;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.chat:
//            TextMessageViewAdapter, UrlMessageViewBinder

final class l.UrlPreviewResult
    implements FutureListener
{

    final TextMessageViewAdapter this$0;
    final BinderParams val$binderOptions;
    final com.skype.android.app.media..UrlPreviewResult val$urlPreviewResult;

    public final void onError(Throwable throwable)
    {
        if (throwable instanceof CancellationException)
        {
            return;
        } else
        {
            TextMessageViewAdapter.access$600().log(Level.WARNING, (new StringBuilder("Unable to decode movie file for media document ")).append(val$urlPreviewResult.getMediaDocument().getWebUrlProp()).toString());
            return;
        }
    }

    public final void onResult(Movie movie)
    {
        val$binderOptions.getUrlPreviewResult().getUrlMedia().setMedia(movie);
        TextMessageViewAdapter.access$500(val$urlPreviewResult.getType()).bindView(val$binderOptions);
    }

    public final volatile void onResult(Object obj)
    {
        onResult((Movie)obj);
    }

    l.UrlPreviewResult()
    {
        this$0 = final_textmessageviewadapter;
        val$binderOptions = binderparams;
        val$urlPreviewResult = com.skype.android.app.media..UrlPreviewResult.this;
        super();
    }
}
