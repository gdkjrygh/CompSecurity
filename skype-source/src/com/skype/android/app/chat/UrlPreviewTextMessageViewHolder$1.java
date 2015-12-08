// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.util.Pair;
import android.util.SparseArray;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.concurrent.FutureListener;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.skype.android.app.chat:
//            UrlPreviewTextMessageViewHolder, ChatMessageUtils, MessageHolder

final class val.messageHolder
    implements FutureListener
{

    final UrlPreviewTextMessageViewHolder this$0;
    final AtomicInteger val$futuresToProcess;
    final int val$index;
    final MessageHolder val$messageHolder;
    final com.skype.android.app.media.yUrlPreviewFuture val$urlPreviewFuture;

    public final void onError(Throwable throwable)
    {
        if (!(throwable.getCause() instanceof CancellationException))
        {
            UrlPreviewTextMessageViewHolder.access$100(UrlPreviewTextMessageViewHolder.this).remove(val$index);
            UrlPreviewTextMessageViewHolder.access$300(UrlPreviewTextMessageViewHolder.this).put(val$index, new Pair(UrlPreviewTextMessageViewHolder.access$200(UrlPreviewTextMessageViewHolder.this).get(val$index), null));
            if (val$futuresToProcess.decrementAndGet() == 0)
            {
                if (UrlPreviewTextMessageViewHolder.access$700(UrlPreviewTextMessageViewHolder.this) && !ChatMessageUtils.isSingleUrlSpanMessage(UrlPreviewTextMessageViewHolder.access$400(UrlPreviewTextMessageViewHolder.this)))
                {
                    UrlPreviewTextMessageViewHolder.access$602(UrlPreviewTextMessageViewHolder.this, ssageSubType.COMBINED_MESSAGE);
                }
                UrlPreviewTextMessageViewHolder.access$800(UrlPreviewTextMessageViewHolder.this).onUrlResults(UrlPreviewTextMessageViewHolder.this, val$messageHolder);
                return;
            }
        }
    }

    public final void onResult(com.skype.android.app.media.ewResult ewresult)
    {
        if (ewresult.isDownloadedFromNetwork())
        {
            val$urlPreviewFuture.reportEvents(AnalyticsEvent.cV, "chat_screen", ewresult.getType().toString(), ewresult.getTitle(), ewresult.getFavicon().getStatus().g(), ewresult.getUrlMedia().getStatus().g(), UrlPreviewTextMessageViewHolder.access$000(UrlPreviewTextMessageViewHolder.this));
        } else
        {
            val$urlPreviewFuture.incrementUiCacheDownload();
        }
        UrlPreviewTextMessageViewHolder.access$100(UrlPreviewTextMessageViewHolder.this).remove(val$index);
        UrlPreviewTextMessageViewHolder.access$300(UrlPreviewTextMessageViewHolder.this).put(val$index, new Pair(UrlPreviewTextMessageViewHolder.access$200(UrlPreviewTextMessageViewHolder.this).get(val$index), ewresult));
        if (val$futuresToProcess.decrementAndGet() != 0) goto _L2; else goto _L1
_L1:
        if (!ChatMessageUtils.isSingleUrlSpanMessage(UrlPreviewTextMessageViewHolder.access$400(UrlPreviewTextMessageViewHolder.this)) || !UrlPreviewTextMessageViewHolder.access$500(UrlPreviewTextMessageViewHolder.this, getFirstResult())) goto _L4; else goto _L3
_L3:
        UrlPreviewTextMessageViewHolder.access$602(UrlPreviewTextMessageViewHolder.this, previewTypeToMessageSubtype(ewresult.getType(), false));
_L6:
        UrlPreviewTextMessageViewHolder.access$800(UrlPreviewTextMessageViewHolder.this).onUrlResults(UrlPreviewTextMessageViewHolder.this, val$messageHolder);
_L2:
        return;
_L4:
        if (UrlPreviewTextMessageViewHolder.access$700(UrlPreviewTextMessageViewHolder.this))
        {
            UrlPreviewTextMessageViewHolder.access$602(UrlPreviewTextMessageViewHolder.this, ssageSubType.COMBINED_MESSAGE);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final volatile void onResult(Object obj)
    {
        onResult((com.skype.android.app.media.ewResult)obj);
    }

    ryUrlPreviewFuture()
    {
        this$0 = final_urlpreviewtextmessageviewholder;
        val$urlPreviewFuture = yurlpreviewfuture;
        val$index = i;
        val$futuresToProcess = atomicinteger;
        val$messageHolder = MessageHolder.this;
        super();
    }
}
