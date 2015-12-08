// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.concurrent.FutureListener;
import com.skype.android.concurrent.ListenableCompletableFuture;
import com.skype.android.widget.SymbolView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.skype.android.app.chat:
//            f, TextMessageViewHolder, SubtypeViewHolder, GifUrlViewHolder, 
//            GenericUrlViewHolder, CombinedUrlViewHolder, UrlPreviewSubtypeViewHolderCache, MessageHolder, 
//            ChatMessageUtils

public class UrlPreviewTextMessageViewHolder extends f
{
    public static final class MessageSubType extends Enum
    {

        private static final MessageSubType $VALUES[];
        public static final MessageSubType COMBINED_MESSAGE;
        public static final MessageSubType GENERIC_URL;
        public static final MessageSubType GENERIC_URL_EMBEDDED;
        public static final MessageSubType GIF_URL;
        public static final MessageSubType GIF_URL_EMBEDDED;
        public static final MessageSubType SIMPLE_MESSAGE;
        public static final MessageSubType TWITTER_MESSAGE;
        public static final MessageSubType TWITTER_MESSAGE_EMBEDDED;
        private final boolean embedded;

        public static MessageSubType valueOf(String s)
        {
            return (MessageSubType)Enum.valueOf(com/skype/android/app/chat/UrlPreviewTextMessageViewHolder$MessageSubType, s);
        }

        public static MessageSubType[] values()
        {
            return (MessageSubType[])$VALUES.clone();
        }

        public final boolean isEmbedded()
        {
            return embedded;
        }

        static 
        {
            SIMPLE_MESSAGE = new MessageSubType("SIMPLE_MESSAGE", 0, false);
            TWITTER_MESSAGE = new MessageSubType("TWITTER_MESSAGE", 1, false);
            GENERIC_URL = new MessageSubType("GENERIC_URL", 2, false);
            GIF_URL = new MessageSubType("GIF_URL", 3, false);
            GIF_URL_EMBEDDED = new MessageSubType("GIF_URL_EMBEDDED", 4, true);
            TWITTER_MESSAGE_EMBEDDED = new MessageSubType("TWITTER_MESSAGE_EMBEDDED", 5, true);
            GENERIC_URL_EMBEDDED = new MessageSubType("GENERIC_URL_EMBEDDED", 6, true);
            COMBINED_MESSAGE = new MessageSubType("COMBINED_MESSAGE", 7, false);
            $VALUES = (new MessageSubType[] {
                SIMPLE_MESSAGE, TWITTER_MESSAGE, GENERIC_URL, GIF_URL, GIF_URL_EMBEDDED, TWITTER_MESSAGE_EMBEDDED, GENERIC_URL_EMBEDDED, COMBINED_MESSAGE
            });
        }

        private MessageSubType(String s, int i, boolean flag)
        {
            super(s, i);
            embedded = flag;
        }
    }

    public static interface OnUrlPreviewResultsListener
    {

        public abstract void onUrlResults(UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, MessageHolder messageholder);
    }


    private static final String SCREEN_NAME = "chat_screen";
    private Analytics analytics;
    private MessageHolder messaHolder;
    private MessageSubType messageSubType;
    private ListenableCompletableFuture movieDecodingFuture;
    private OnUrlPreviewResultsListener onUrlPreviewResultsListener;
    private CharSequence originalText;
    private MessageSubType requestedMessageSubType;
    private SubtypeViewHolder subtypeViewHolder;
    private SparseArray urlFutures;
    private UrlPreviewSubtypeViewHolderCache urlPreviewSubtypeViewHolderCache;
    private SparseArray urlResults;
    private SparseArray urlTexts;

    public UrlPreviewTextMessageViewHolder(View view, UrlPreviewSubtypeViewHolderCache urlpreviewsubtypeviewholdercache, Analytics analytics1)
    {
        super(view);
        urlFutures = new SparseArray();
        urlTexts = new SparseArray();
        urlResults = new SparseArray();
        urlPreviewSubtypeViewHolderCache = urlpreviewsubtypeviewholdercache;
        analytics = analytics1;
    }

    private SubtypeViewHolder createViewHolder(MessageSubType messagesubtype, Context context)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[];
            static final int $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[];

            static 
            {
                $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType = new int[MessageSubType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[MessageSubType.GIF_URL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[MessageSubType.GIF_URL_EMBEDDED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[MessageSubType.TWITTER_MESSAGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[MessageSubType.TWITTER_MESSAGE_EMBEDDED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[MessageSubType.GENERIC_URL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[MessageSubType.GENERIC_URL_EMBEDDED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$UrlPreviewTextMessageViewHolder$MessageSubType[MessageSubType.COMBINED_MESSAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType = new int[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.TWEET.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.GIF.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.GENERIC.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.IMAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.SHARING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.VIDEO.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.UNKNOWN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.android.app.chat.UrlPreviewTextMessageViewHolder.MessageSubType[messagesubtype.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 80
    //                   2 80
    //                   3 95
    //                   4 95
    //                   5 95
    //                   6 95
    //                   7 110;
           goto _L1 _L2 _L2 _L3 _L3 _L3 _L3 _L4
_L1:
        messagesubtype = new TextMessageViewHolder();
_L6:
        messagesubtype.inflateSubview(LayoutInflater.from(context), getInlineContent(), false);
        messagesubtype.setUrlPreviewTextMessageViewHolder(this);
        return messagesubtype;
_L2:
        messagesubtype = new GifUrlViewHolder(messagesubtype.isEmbedded());
        continue; /* Loop/switch isn't completed */
_L3:
        messagesubtype = new GenericUrlViewHolder(messagesubtype.isEmbedded());
        continue; /* Loop/switch isn't completed */
_L4:
        messagesubtype = new CombinedUrlViewHolder();
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void doRecycle(MessageSubType messagesubtype, SubtypeViewHolder subtypeviewholder)
    {
        getInlineContent().removeAllViews();
        if (subtypeviewholder != null)
        {
            subtypeviewholder.doRecycle();
            recycleToCache(messagesubtype, subtypeviewholder);
        }
    }

    private boolean hasEnoughMetadataForDisplay(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
    {
        return urlpreviewresult != null && (!TextUtils.isEmpty(urlpreviewresult.getTitle()) || !TextUtils.isEmpty(urlpreviewresult.getDescription()) || urlpreviewresult.getUrlMedia().getMedia() != null);
    }

    private boolean hasEnoughMetadataForDisplayInCombinedLayout(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
    {
        return urlpreviewresult != null && urlpreviewresult.getUrlMedia().getMedia() != null;
    }

    private boolean hasUrlPreviewsToDisplayInCombinedLayout()
    {
        SparseArray sparsearray = urlResults;
        for (int i = 0; i < sparsearray.size(); i++)
        {
            if (hasEnoughMetadataForDisplayInCombinedLayout((com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult)((Pair)sparsearray.valueAt(i)).second))
            {
                return true;
            }
        }

        return false;
    }

    private void registerFutureListeners(final MessageHolder messageHolder)
    {
        int i = urlFutures.size();
        final AtomicInteger futuresToProcess = new AtomicInteger(i);
        for (final int index = 0; index < i; index++)
        {
            final com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture urlPreviewFuture = (com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture)urlFutures.get(index);
            urlPreviewFuture.addListener(new FutureListener() {

                final UrlPreviewTextMessageViewHolder this$0;
                final AtomicInteger val$futuresToProcess;
                final int val$index;
                final MessageHolder val$messageHolder;
                final com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture val$urlPreviewFuture;

                public final void onError(Throwable throwable)
                {
                    if (!(throwable.getCause() instanceof CancellationException))
                    {
                        urlFutures.remove(index);
                        urlResults.put(index, new Pair(urlTexts.get(index), null));
                        if (futuresToProcess.decrementAndGet() == 0)
                        {
                            if (hasUrlPreviewsToDisplayInCombinedLayout() && !ChatMessageUtils.isSingleUrlSpanMessage(originalText))
                            {
                                requestedMessageSubType = MessageSubType.COMBINED_MESSAGE;
                            }
                            onUrlPreviewResultsListener.onUrlResults(UrlPreviewTextMessageViewHolder.this, messageHolder);
                            return;
                        }
                    }
                }

                public final void onResult(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
                {
                    if (urlpreviewresult.isDownloadedFromNetwork())
                    {
                        urlPreviewFuture.reportEvents(AnalyticsEvent.cV, "chat_screen", urlpreviewresult.getType().toString(), urlpreviewresult.getTitle(), urlpreviewresult.getFavicon().getStatus().toString(), urlpreviewresult.getUrlMedia().getStatus().toString(), analytics);
                    } else
                    {
                        urlPreviewFuture.incrementUiCacheDownload();
                    }
                    urlFutures.remove(index);
                    urlResults.put(index, new Pair(urlTexts.get(index), urlpreviewresult));
                    if (futuresToProcess.decrementAndGet() != 0) goto _L2; else goto _L1
_L1:
                    if (!ChatMessageUtils.isSingleUrlSpanMessage(originalText) || !hasEnoughMetadataForDisplay(getFirstResult())) goto _L4; else goto _L3
_L3:
                    requestedMessageSubType = previewTypeToMessageSubtype(urlpreviewresult.getType(), false);
_L6:
                    onUrlPreviewResultsListener.onUrlResults(UrlPreviewTextMessageViewHolder.this, messageHolder);
_L2:
                    return;
_L4:
                    if (hasUrlPreviewsToDisplayInCombinedLayout())
                    {
                        requestedMessageSubType = MessageSubType.COMBINED_MESSAGE;
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                }

                public final volatile void onResult(Object obj)
                {
                    onResult((com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult)obj);
                }

            
            {
                this$0 = UrlPreviewTextMessageViewHolder.this;
                urlPreviewFuture = telemetryurlpreviewfuture;
                index = i;
                futuresToProcess = atomicinteger;
                messageHolder = messageholder;
                super();
            }
            });
        }

    }

    public void cancelPendingUrlFetchOperations()
    {
        for (int i = 0; i < urlFutures.size(); i++)
        {
            com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture telemetryurlpreviewfuture = (com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture)urlFutures.get(i);
            if (telemetryurlpreviewfuture != null)
            {
                telemetryurlpreviewfuture.cancel(true);
            }
        }

        urlTexts.clear();
        urlFutures.clear();
        urlResults.clear();
        requestedMessageSubType = MessageSubType.SIMPLE_MESSAGE;
        if (movieDecodingFuture != null && !movieDecodingFuture.isDone())
        {
            movieDecodingFuture.cancel(true);
            movieDecodingFuture = null;
        }
    }

    public void fetchUrlPreviews(MessageHolder messageholder, CharSequence charsequence, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        originalText = charsequence;
        cancelPendingUrlFetchOperations();
        messaHolder = messageholder;
        if (charsequence instanceof Spanned)
        {
            charsequence = (Spanned)charsequence;
            URLSpan aurlspan[] = (URLSpan[])charsequence.getSpans(0, charsequence.length(), android/text/style/URLSpan);
            urlTexts = new SparseArray(aurlspan.length);
            urlFutures = new SparseArray(aurlspan.length);
            urlResults = new SparseArray(aurlspan.length);
            for (int i = 0; i < aurlspan.length; i++)
            {
                Object obj = aurlspan[i];
                String s = ((URLSpan) (obj)).getURL();
                urlTexts.put(i, charsequence.subSequence(charsequence.getSpanStart(obj), charsequence.getSpanEnd(obj)));
                obj = mediadocumentdownloadutil.getMediaUrlPreviewAsync(s);
                urlFutures.put(i, obj);
            }

            registerFutureListeners(messageholder);
        }
    }

    public volatile Contact getContact()
    {
        return super.getContact();
    }

    public com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult getFirstResult()
    {
        if (urlResults.size() > 0)
        {
            return (com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult)((Pair)urlResults.get(0)).second;
        } else
        {
            return null;
        }
    }

    public volatile View getHeartContainer()
    {
        return super.getHeartContainer();
    }

    public volatile SymbolView getHeartIcon()
    {
        return super.getHeartIcon();
    }

    public volatile TextView getHeartMsgCount()
    {
        return super.getHeartMsgCount();
    }

    public volatile ViewGroup getInlineContent()
    {
        return super.getInlineContent();
    }

    public volatile TextView getLovedByText()
    {
        return super.getLovedByText();
    }

    public MessageHolder getMessaHolder()
    {
        return messaHolder;
    }

    public volatile TextView getMessageStatusView()
    {
        return super.getMessageStatusView();
    }

    public MessageSubType getMessageSubtype()
    {
        return requestedMessageSubType;
    }

    public CharSequence getOriginalText()
    {
        return originalText;
    }

    public SubtypeViewHolder getSubTypeHolder(Context context)
    {
        if (messageSubType == requestedMessageSubType)
        {
            return subtypeViewHolder;
        }
        if (messageSubType != null)
        {
            doRecycle(messageSubType, subtypeViewHolder);
        }
        subtypeViewHolder = getSubtypeViewHolder(context, requestedMessageSubType);
        getInlineContent().addView(subtypeViewHolder.getSubView());
        messageSubType = requestedMessageSubType;
        return subtypeViewHolder;
    }

    SubtypeViewHolder getSubtypeViewHolder(Context context, MessageSubType messagesubtype)
    {
        SubtypeViewHolder subtypeviewholder = urlPreviewSubtypeViewHolderCache.getRecycled(messagesubtype);
        if (subtypeviewholder != null)
        {
            subtypeviewholder.setUrlPreviewTextMessageViewHolder(this);
            return subtypeviewholder;
        } else
        {
            return createViewHolder(messagesubtype, context);
        }
    }

    public volatile ViewGroup getTimestampContainer()
    {
        return super.getTimestampContainer();
    }

    public volatile TextView getTimestampView()
    {
        return super.getTimestampView();
    }

    protected SparseArray getUrlResults()
    {
        return urlResults;
    }

    public volatile boolean isChained()
    {
        return super.isChained();
    }

    public volatile boolean isChatItemExpanded()
    {
        return super.isChatItemExpanded();
    }

    public volatile boolean isOutgoing()
    {
        return super.isOutgoing();
    }

    public volatile boolean isSystemMessage()
    {
        return super.isSystemMessage();
    }

    MessageSubType previewTypeToMessageSubtype(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType urlpreviewtype, boolean flag)
    {
        switch (_cls2..SwitchMap.com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType[urlpreviewtype.ordinal()])
        {
        default:
            if (flag)
            {
                return MessageSubType.GENERIC_URL_EMBEDDED;
            } else
            {
                return MessageSubType.GENERIC_URL;
            }

        case 1: // '\001'
            if (flag)
            {
                return MessageSubType.TWITTER_MESSAGE_EMBEDDED;
            } else
            {
                return MessageSubType.TWITTER_MESSAGE;
            }

        case 2: // '\002'
            break;
        }
        if (flag)
        {
            return MessageSubType.GIF_URL_EMBEDDED;
        } else
        {
            return MessageSubType.GIF_URL;
        }
    }

    protected void recycleToCache(MessageSubType messagesubtype, SubtypeViewHolder subtypeviewholder)
    {
        urlPreviewSubtypeViewHolderCache.putRecycled(messagesubtype, subtypeviewholder);
    }

    public void releaseResources()
    {
        super.releaseResources();
        if (subtypeViewHolder != null)
        {
            subtypeViewHolder.recycle();
        }
    }

    public volatile void setChained(boolean flag)
    {
        super.setChained(flag);
    }

    public volatile void setContact(Contact contact)
    {
        super.setContact(contact);
    }

    public volatile void setIsChatItemExpanded(boolean flag)
    {
        super.setIsChatItemExpanded(flag);
    }

    public volatile void setIsOutgoing(boolean flag)
    {
        super.setIsOutgoing(flag);
    }

    public volatile void setIsSystemMessage(boolean flag)
    {
        super.setIsSystemMessage(flag);
    }

    public void setMovieDecodingFuture(ListenableCompletableFuture listenablecompletablefuture)
    {
        movieDecodingFuture = listenablecompletablefuture;
    }

    public void setOnUrlPreviewResultsListener(OnUrlPreviewResultsListener onurlpreviewresultslistener)
    {
        onUrlPreviewResultsListener = onurlpreviewresultslistener;
    }

    public boolean shouldRenderSimpleView()
    {
        return requestedMessageSubType == MessageSubType.SIMPLE_MESSAGE;
    }








/*
    static MessageSubType access$602(UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, MessageSubType messagesubtype)
    {
        urlpreviewtextmessageviewholder.requestedMessageSubType = messagesubtype;
        return messagesubtype;
    }

*/


}
