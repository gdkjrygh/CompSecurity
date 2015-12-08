// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder, SubtypeViewHolder, TextMessageViewAdapter

public interface UrlMessageViewBinder
{
    public static class ViewBinderOptionsBuilder
    {

        private Context context;
        private View customView;
        private boolean embedded;
        private boolean isInAccessibilityMode;
        private boolean isLargeEmoticonMessage;
        private boolean isUrl;
        private android.view.View.OnClickListener itemOnClickListener;
        private MessageHolder messageHolder;
        private boolean showPendingStateAsTextStyle;
        private SubtypeViewHolder subtypeViewHolder;
        private TextMessageViewAdapter textMessageViewAdapter;
        private com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlPreviewResult;

        public ViewBinderParams createViewBinderOptions()
        {
            ViewBinderParams viewbinderparams = new ViewBinderParams();
            viewbinderparams.embedded = embedded;
            viewbinderparams.subtypeViewHolder = subtypeViewHolder;
            viewbinderparams.messageHolder = messageHolder;
            viewbinderparams.urlPreviewResult = urlPreviewResult;
            viewbinderparams.isLargeEmoticonMessage = isLargeEmoticonMessage;
            viewbinderparams.context = context;
            viewbinderparams.textMessageViewAdapter = textMessageViewAdapter;
            viewbinderparams.isUrl = isUrl;
            viewbinderparams.isInAccessibilityMode = isInAccessibilityMode;
            viewbinderparams.itemOnClickListener = itemOnClickListener;
            viewbinderparams.customView = customView;
            viewbinderparams.showPendingStateAsTextStyle = showPendingStateAsTextStyle;
            return viewbinderparams;
        }

        public ViewBinderOptionsBuilder setCustomView(View view)
        {
            customView = view;
            return this;
        }

        public ViewBinderOptionsBuilder setEmbedded(boolean flag)
        {
            embedded = flag;
            return this;
        }

        public ViewBinderOptionsBuilder setIsInAccessibilityMode(boolean flag)
        {
            isInAccessibilityMode = flag;
            return this;
        }

        public ViewBinderOptionsBuilder setIsLargeEmoticonMessage(boolean flag)
        {
            isLargeEmoticonMessage = flag;
            return this;
        }

        public ViewBinderOptionsBuilder setIsUrl(boolean flag)
        {
            isUrl = flag;
            return this;
        }

        public ViewBinderOptionsBuilder setItemOnClickListener(android.view.View.OnClickListener onclicklistener)
        {
            itemOnClickListener = onclicklistener;
            return this;
        }

        public ViewBinderOptionsBuilder setUrlPreviewResult(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
        {
            urlPreviewResult = urlpreviewresult;
            return this;
        }

        public ViewBinderOptionsBuilder showPendingStateAsTextStyle(boolean flag)
        {
            showPendingStateAsTextStyle = flag;
            return this;
        }

        public ViewBinderOptionsBuilder(Context context1, MessageHolder messageholder, TextMessageViewAdapter textmessageviewadapter, SubtypeViewHolder subtypeviewholder)
        {
            context = context1;
            messageHolder = messageholder;
            textMessageViewAdapter = textmessageviewadapter;
            subtypeViewHolder = subtypeviewholder;
        }
    }

    public static class ViewBinderParams
    {

        private Context context;
        public View customView;
        private boolean embedded;
        private boolean isInAccessibilityMode;
        private boolean isLargeEmoticonMessage;
        private boolean isUrl;
        private android.view.View.OnClickListener itemOnClickListener;
        private MessageHolder messageHolder;
        private boolean showPendingStateAsTextStyle;
        private SubtypeViewHolder subtypeViewHolder;
        private TextMessageViewAdapter textMessageViewAdapter;
        private com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlPreviewResult;

        public Context getContext()
        {
            return context;
        }

        public Object getCustomView()
        {
            return customView;
        }

        public android.view.View.OnClickListener getItemOnClickListener()
        {
            return itemOnClickListener;
        }

        public MessageHolder getMessageHolder()
        {
            return messageHolder;
        }

        public SubtypeViewHolder getSubtypeViewHolder()
        {
            return subtypeViewHolder;
        }

        public TextMessageViewAdapter getTextMessageViewAdapter()
        {
            return textMessageViewAdapter;
        }

        public com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult getUrlPreviewResult()
        {
            return urlPreviewResult;
        }

        public boolean isEmbedded()
        {
            return embedded;
        }

        public boolean isInAccessibilityMode()
        {
            return isInAccessibilityMode;
        }

        public boolean isLargeEmoticonMessage()
        {
            return isLargeEmoticonMessage;
        }

        public boolean isUrl()
        {
            return isUrl;
        }

        public boolean showPendingStateAsTextStyle()
        {
            return showPendingStateAsTextStyle;
        }


/*
        static android.view.View.OnClickListener access$1002(ViewBinderParams viewbinderparams, android.view.View.OnClickListener onclicklistener)
        {
            viewbinderparams.itemOnClickListener = onclicklistener;
            return onclicklistener;
        }

*/


/*
        static boolean access$102(ViewBinderParams viewbinderparams, boolean flag)
        {
            viewbinderparams.embedded = flag;
            return flag;
        }

*/


/*
        static boolean access$1102(ViewBinderParams viewbinderparams, boolean flag)
        {
            viewbinderparams.showPendingStateAsTextStyle = flag;
            return flag;
        }

*/


/*
        static SubtypeViewHolder access$202(ViewBinderParams viewbinderparams, SubtypeViewHolder subtypeviewholder)
        {
            viewbinderparams.subtypeViewHolder = subtypeviewholder;
            return subtypeviewholder;
        }

*/


/*
        static MessageHolder access$302(ViewBinderParams viewbinderparams, MessageHolder messageholder)
        {
            viewbinderparams.messageHolder = messageholder;
            return messageholder;
        }

*/


/*
        static com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult access$402(ViewBinderParams viewbinderparams, com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
        {
            viewbinderparams.urlPreviewResult = urlpreviewresult;
            return urlpreviewresult;
        }

*/


/*
        static boolean access$502(ViewBinderParams viewbinderparams, boolean flag)
        {
            viewbinderparams.isLargeEmoticonMessage = flag;
            return flag;
        }

*/


/*
        static Context access$602(ViewBinderParams viewbinderparams, Context context1)
        {
            viewbinderparams.context = context1;
            return context1;
        }

*/


/*
        static TextMessageViewAdapter access$702(ViewBinderParams viewbinderparams, TextMessageViewAdapter textmessageviewadapter)
        {
            viewbinderparams.textMessageViewAdapter = textmessageviewadapter;
            return textmessageviewadapter;
        }

*/


/*
        static boolean access$802(ViewBinderParams viewbinderparams, boolean flag)
        {
            viewbinderparams.isUrl = flag;
            return flag;
        }

*/


/*
        static boolean access$902(ViewBinderParams viewbinderparams, boolean flag)
        {
            viewbinderparams.isInAccessibilityMode = flag;
            return flag;
        }

*/

        private ViewBinderParams()
        {
        }

    }


    public abstract void bindView(ViewBinderParams viewbinderparams);
}
