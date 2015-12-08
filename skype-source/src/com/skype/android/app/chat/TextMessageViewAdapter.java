// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.support.v7.util.a;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.skype.Conversation;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.FutureListener;
import com.skype.android.concurrent.ListenableCompletableFuture;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.push.ChatPushMessage;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.LoggingTelemetry;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.widget.TranslationClickableSpan;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.chat:
//            e, SyntheticTypes, MessageViewAdapterComponent, UrlPreviewSubtypeMemoryCache, 
//            ChatMessageUtils, UrlPreviewTextMessageViewHolder, TextMessageViewHolder, UrlMessageViewBinder, 
//            CombinedUrlViewHolder, SubtypeViewHolder, PushMessageHolder, MessageHolder, 
//            SkypeMessageHolder, j, GenericUrlViewBinder, GifUrlViewBinder, 
//            CombinedMessageViewBinder, SimpleMessageViewBinder, ChatFragmentProvider

public class TextMessageViewAdapter extends e
    implements UrlPreviewTextMessageViewHolder.OnUrlPreviewResultsListener
{

    private static String COMBINED_MESSAGE_BINDER_KEY = "COMBINED_MESSAGE_BINDER_KEY";
    private static String NORMAL_CLICK = "NORMAL_CLICK";
    private static String SIMPLE_MESSAGE_BINDER_KEY = "SIMPLE_MESSAGE_BINDER_KEY";
    private static final Logger log = Logger.getLogger("TextMessageViewAdapter");
    private static final int supportedMessageTypes[];
    private static final Map viewBinderRegistry = new HashMap() {

            
            {
                GenericUrlViewBinder genericurlviewbinder = new GenericUrlViewBinder();
                put(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.GENERIC, genericurlviewbinder);
                put(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.GIF, new GifUrlViewBinder());
                put(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.IMAGE, genericurlviewbinder);
                put(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.SHARING, genericurlviewbinder);
                put(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.TWEET, genericurlviewbinder);
                put(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.UNKNOWN, genericurlviewbinder);
                put(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.VIDEO, genericurlviewbinder);
                put(TextMessageViewAdapter.COMBINED_MESSAGE_BINDER_KEY, new CombinedMessageViewBinder());
                put(TextMessageViewAdapter.SIMPLE_MESSAGE_BINDER_KEY, new SimpleMessageViewBinder());
            }
    };
    AccessibilityUtil accessibilityUtil;
    Analytics analytics;
    EcsConfiguration configuration;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    private Map largeEmoticonMessagesMap;
    SkyLib lib;
    ObjectIdMap map;
    private MediaDocumentDownloadUtil mediaDocumentDownloadUtil;
    FormattedMessageCache spannedText;
    private final UrlPreviewSubtypeMemoryCache subtypeHolderCache = new UrlPreviewSubtypeMemoryCache();
    LoggingTelemetry telemetryLogger;
    Translator translator;
    UserPreferences userPreferences;

    public TextMessageViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil, Conversation conversation1)
    {
        super(activity);
        getComponent().inject(this);
        largeEmoticonMessagesMap = new HashMap();
        mediaDocumentDownloadUtil = mediadocumentdownloadutil;
        conversation = conversation1;
    }

    private void bindSimpleMessage(UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, MessageHolder messageholder, CharSequence charsequence)
    {
        boolean flag = true;
        Activity activity = getContext();
        boolean flag1 = isLargeEmoticonMessage(messageholder);
        boolean flag2 = accessibilityUtil.a();
        CharSequence charsequence1 = charsequence;
        if (flag1)
        {
            charsequence1 = ChatMessageUtils.getLargeEmoticonSpan(charsequence, userPreferences);
        }
        charsequence = setupViewTranslationLink(urlpreviewtextmessageviewholder, messageholder, charsequence1);
        urlpreviewtextmessageviewholder = (TextMessageViewHolder)urlpreviewtextmessageviewholder.getSubTypeHolder(activity);
        setText(urlpreviewtextmessageviewholder, charsequence);
        urlpreviewtextmessageviewholder = (new UrlMessageViewBinder.ViewBinderOptionsBuilder(activity, messageholder, this, urlpreviewtextmessageviewholder)).setEmbedded(true).setIsLargeEmoticonMessage(flag1).setIsUrl(ViewUtil.a(charsequence)).setIsInAccessibilityMode(flag2);
        if (configuration.isMessageStatusIndicatorEnabled())
        {
            flag = false;
        }
        urlpreviewtextmessageviewholder = urlpreviewtextmessageviewholder.showPendingStateAsTextStyle(flag).createViewBinderOptions();
        getViewBinder(SIMPLE_MESSAGE_BINDER_KEY).bindView(urlpreviewtextmessageviewholder);
    }

    private void bindSubviewType(SubtypeViewHolder subtypeviewholder, MessageHolder messageholder, final com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlPreviewResult, boolean flag)
    {
        messageholder = (new UrlMessageViewBinder.ViewBinderOptionsBuilder(getContext(), messageholder, this, subtypeviewholder)).setUrlPreviewResult(urlPreviewResult).setEmbedded(flag).setItemOnClickListener(new android.view.View.OnClickListener() {

            final TextMessageViewAdapter this$0;
            final com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult val$urlPreviewResult;

            public final void onClick(View view)
            {
                navigationUrl.goToUrl(getContext(), urlPreviewResult.getMediaDocument().getWebUrlProp(), false);
                reportUrlPreviewClicks(TextMessageViewAdapter.NORMAL_CLICK);
            }

            
            {
                this$0 = TextMessageViewAdapter.this;
                urlPreviewResult = urlpreviewresult;
                super();
            }
        }).createViewBinderOptions();
        getViewBinder(urlPreviewResult.getType()).bindView(messageholder);
        if (urlPreviewResult.getType() == com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.GIF && (urlPreviewResult.getUrlMedia().getMedia() instanceof Bitmap))
        {
            decodeGifMovie(subtypeviewholder, urlPreviewResult, messageholder);
        }
    }

    private void bindUrlView(UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, MessageHolder messageholder)
    {
        Activity activity = getContext();
        if (urlpreviewtextmessageviewholder.getMessageSubtype() == UrlPreviewTextMessageViewHolder.MessageSubType.COMBINED_MESSAGE)
        {
            urlpreviewtextmessageviewholder = (CombinedUrlViewHolder)urlpreviewtextmessageviewholder.getSubTypeHolder(activity);
            urlpreviewtextmessageviewholder.startVisitor(this, messageholder, accessibilityUtil, new CombinedUrlViewHolder.CombinedLayoutVisitor() {

                final TextMessageViewAdapter this$0;

                public final void visit(SubtypeViewHolder subtypeviewholder, com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult1, MessageHolder messageholder1)
                {
                    bindSubviewType(subtypeviewholder, messageholder1, urlpreviewresult1, true);
                }

            
            {
                this$0 = TextMessageViewAdapter.this;
                super();
            }
            });
            urlpreviewtextmessageviewholder = (new UrlMessageViewBinder.ViewBinderOptionsBuilder(activity, messageholder, this, urlpreviewtextmessageviewholder)).createViewBinderOptions();
            getViewBinder(COMBINED_MESSAGE_BINDER_KEY).bindView(urlpreviewtextmessageviewholder);
            return;
        } else
        {
            com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult = urlpreviewtextmessageviewholder.getFirstResult();
            bindSubviewType(urlpreviewtextmessageviewholder.getSubTypeHolder(activity), messageholder, urlpreviewresult, false);
            return;
        }
    }

    private void decodeGifMovie(SubtypeViewHolder subtypeviewholder, final com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlPreviewResult, final UrlMessageViewBinder.ViewBinderParams binderOptions)
    {
        ListenableCompletableFuture listenablecompletablefuture = mediaDocumentDownloadUtil.decodeMovieMedia(urlPreviewResult.getMediaDocument());
        subtypeviewholder.getUrlPreviewTextMessageViewHolder().setMovieDecodingFuture(listenablecompletablefuture);
        listenablecompletablefuture.addListener(new FutureListener() {

            final TextMessageViewAdapter this$0;
            final UrlMessageViewBinder.ViewBinderParams val$binderOptions;
            final com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult val$urlPreviewResult;

            public final void onError(Throwable throwable)
            {
                if (throwable instanceof CancellationException)
                {
                    return;
                } else
                {
                    TextMessageViewAdapter.log.log(Level.WARNING, (new StringBuilder("Unable to decode movie file for media document ")).append(urlPreviewResult.getMediaDocument().getWebUrlProp()).toString());
                    return;
                }
            }

            public final void onResult(Movie movie)
            {
                binderOptions.getUrlPreviewResult().getUrlMedia().setMedia(movie);
                TextMessageViewAdapter.getViewBinder(urlPreviewResult.getType()).bindView(binderOptions);
            }

            public final volatile void onResult(Object obj)
            {
                onResult((Movie)obj);
            }

            
            {
                this$0 = TextMessageViewAdapter.this;
                binderOptions = viewbinderparams;
                urlPreviewResult = urlpreviewresult;
                super();
            }
        });
    }

    private CharSequence getMessageText(MessageHolder messageholder)
    {
        if (messageholder instanceof PushMessageHolder)
        {
            messageholder = spannedText.a((ChatPushMessage)messageholder.getMessageObject());
        } else
        if (messageholder instanceof SkypeMessageHolder)
        {
            Message message = (Message)messageholder.getMessageObject();
            CharSequence charsequence = spannedText.a(message);
            messageholder = charsequence;
            if (message.getEditTimestampProp() > 0)
            {
                messageholder = charsequence;
                if (TextUtils.isEmpty(message.getBodyXmlProp()))
                {
                    return conversationUtil.a();
                }
            }
        } else
        {
            String s = null;
            if (messageholder != null)
            {
                s = messageholder.getClass().getCanonicalName();
            }
            messageholder = (new StringBuilder("Unexpected holder type: ")).append(s).toString();
            log.warning(messageholder);
            telemetryLogger.a(com.skype.android.telemetry.LoggingTelemetry.LogLevel.d, messageholder);
            return "";
        }
        return messageholder;
    }

    private static UrlMessageViewBinder getViewBinder(Object obj)
    {
        UrlMessageViewBinder urlmessageviewbinder = (UrlMessageViewBinder)viewBinderRegistry.get(obj);
        if (urlmessageviewbinder == null)
        {
            throw new IllegalStateException(String.format("No view binder registered for key %s", new Object[] {
                obj
            }));
        } else
        {
            return urlmessageviewbinder;
        }
    }

    private boolean isLargeEmoticonMessage(MessageHolder messageholder)
    {
        if (!ChatMessageUtils.shouldShowBigEmoticons(configuration, userPreferences))
        {
            return false;
        }
        Object obj = messageholder.getMessageId();
        obj = (Pair)largeEmoticonMessagesMap.get(obj);
        int i = (int)messageholder.getEditTimestamp();
        if (obj != null && ((Boolean)((Pair) (obj)).first).booleanValue() && ((Integer)((Pair) (obj)).second).intValue() >= i)
        {
            return true;
        } else
        {
            boolean flag = ChatMessageUtils.allSpansAreEmoticons(getMessageText(messageholder));
            largeEmoticonMessagesMap.put(messageholder.getMessageId(), Pair.create(Boolean.valueOf(flag), Integer.valueOf(i)));
            return flag;
        }
    }

    private void reportUrlPreviewClicks(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.N, s);
        analytics.a(AnalyticsEvent.cX, analyticsparametercontainer);
    }

    private void setText(TextMessageViewHolder textmessageviewholder, CharSequence charsequence)
    {
        textmessageviewholder = textmessageviewholder.textView;
        boolean flag = accessibilityUtil.a();
        accessibilityUtil.a(textmessageviewholder, charsequence, flag);
    }

    private CharSequence setupViewTranslationLink(UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, MessageHolder messageholder, CharSequence charsequence)
    {
        Object obj = charsequence;
        if (configuration.isTranslatorEnabled())
        {
            obj = charsequence;
            if (urlpreviewtextmessageviewholder.getMessageSubtype() == UrlPreviewTextMessageViewHolder.MessageSubType.SIMPLE_MESSAGE)
            {
                obj = conversationUtil.C(conversation);
                obj = TranslationClickableSpan.a(getContext(), spannedText, analytics, messageholder, charsequence, ((com.skype.android.util.ConversationUtil.TranslatorSetting) (obj)), translator, urlpreviewtextmessageviewholder);
            }
        }
        return ((CharSequence) (obj));
    }

    protected void bindContentView(j j1, MessageHolder messageholder)
    {
        UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder = (UrlPreviewTextMessageViewHolder)j1;
        CharSequence charsequence = getMessageText(messageholder);
        urlpreviewtextmessageviewholder.cancelPendingUrlFetchOperations();
        if (!accessibilityUtil.a() && configuration.isUrlPreviewEnabled() && !j1.isSystemMessage())
        {
            urlpreviewtextmessageviewholder.fetchUrlPreviews(messageholder, charsequence, mediaDocumentDownloadUtil);
        }
        if (urlpreviewtextmessageviewholder.shouldRenderSimpleView())
        {
            bindSimpleMessage(urlpreviewtextmessageviewholder, messageholder, charsequence);
        }
    }

    public volatile void bindViewHolder(j j1, MessageHolder messageholder, a a)
    {
        super.bindViewHolder(j1, messageholder, a);
    }

    protected j createMessageViewHolder(View view)
    {
        view = new UrlPreviewTextMessageViewHolder(view, subtypeHolderCache, analytics);
        view.setOnUrlPreviewResultsListener(this);
        return view;
    }

    public volatile j createMessageViewHolder(ViewGroup viewgroup, int i)
    {
        return super.createMessageViewHolder(viewgroup, i);
    }

    protected int getLayoutId(int i)
    {
        return 0;
    }

    public int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected View getView(ViewGroup viewgroup, int i, boolean flag)
    {
        return null;
    }

    public boolean isStandalone(MessageHolder messageholder)
    {
        if (messageholder.getMessageObject() instanceof Message)
        {
            return isLargeEmoticonMessage(messageholder);
        } else
        {
            return super.isStandalone(messageholder);
        }
    }

    public void onUrlResults(UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, MessageHolder messageholder)
    {
        if (urlpreviewtextmessageviewholder.getMessageSubtype() == UrlPreviewTextMessageViewHolder.MessageSubType.SIMPLE_MESSAGE)
        {
            bindSimpleMessage(urlpreviewtextmessageviewholder, messageholder, urlpreviewtextmessageviewholder.getOriginalText());
            return;
        } else
        {
            bindUrlView(urlpreviewtextmessageviewholder, messageholder);
            return;
        }
    }

    protected void setOnItemLongClickListener(final Message message, View view, final int position, boolean flag, boolean flag1)
    {
        if (view != null)
        {
            view.setOnLongClickListener(new android.view.View.OnLongClickListener() {

                final TextMessageViewAdapter this$0;
                final Message val$message;
                final int val$position;

                public final boolean onLongClick(View view1)
                {
                    if (message.getEditTimestampProp() <= 0 || !TextUtils.isEmpty(message.getBodyXmlProp()))
                    {
                        ((ChatFragmentProvider)getContext()).getChatFragment().onItemLongClick(message, position, true, null);
                    }
                    return true;
                }

            
            {
                this$0 = TextMessageViewAdapter.this;
                message = message1;
                position = i;
                super();
            }
            });
        }
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_TEXT.toInt(), com.skype.Message.TYPE.POSTED_SMS.toInt(), com.skype.Message.TYPE.MESSAGE_EXPANSION_START.toInt(), SyntheticTypes.PUSH.getType(), SyntheticTypes.TWITTER_URL_PREVIEW.getType(), SyntheticTypes.WEB_URL_PREVIEW.getType()
        });
    }







}
