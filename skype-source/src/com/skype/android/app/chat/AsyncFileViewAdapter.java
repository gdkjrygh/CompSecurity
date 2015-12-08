// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.util.g;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.PROPKEY;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaDocumentFileProvider;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.app.transfer.InstalledAppVerifier;
import com.skype.android.app.transfer.TransferType;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.config.FileUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.Bubblable;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.io.File;

// Referenced classes of package com.skype.android.app.chat:
//            AsyncMediaViewAdapter, MessageHolderUtil, OfficeNotInstalledActivity, j

public class AsyncFileViewAdapter extends AsyncMediaViewAdapter
{
    private final class a extends AsyncMediaViewAdapter.AsyncMediaViewHolder
    {

        TextView actionText;
        TextView filename;
        RelativeLayout mediaInfoLayout;
        TextView subText;
        final AsyncFileViewAdapter this$0;

        final void initializeViews()
        {
            mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
            mediaThumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f100225);
            thumbnail = (ImageView)ViewUtil.a(mediaThumbnailLayout, 0x7f100226);
            progress = (CircularProgressBar)ViewUtil.a(itemView, 0x7f100229);
            action = (SymbolView)ViewUtil.a(itemView, 0x7f100228);
            centerSymbol = (SymbolView)ViewUtil.a(mediaThumbnailLayout, 0x7f100227);
            mediaInfoLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10026f);
            actionProgressLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10026e);
            filename = (TextView)ViewUtil.a(itemView, 0x7f100270);
            subText = (TextView)ViewUtil.a(itemView, 0x7f100271);
            actionText = (TextView)ViewUtil.a(itemView, 0x7f100272);
            Activity activity = getContext();
            progress.setProgressBackgroundColor(activity.getResources().getColor(0x7f0f0133));
            progress.setProgressColor(activity.getResources().getColor(0x7f0f013a));
            progress.setProgressWidth(activity.getResources().getDimensionPixelSize(0x7f0c0173));
        }

        public a(View view)
        {
            this$0 = AsyncFileViewAdapter.this;
            super(AsyncFileViewAdapter.this, view);
        }
    }

    private static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b CANCELED;
        public static final b DOWNLOADING;
        public static final b DOWNLOAD_COMPLETED;
        public static final b DOWNLOAD_NOT_STARTED;
        public static final b ERROR;
        public static final b EXPIRED;
        public static final b NO_NETWORK;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/chat/AsyncFileViewAdapter$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            DOWNLOAD_NOT_STARTED = new b("DOWNLOAD_NOT_STARTED", 0);
            DOWNLOADING = new b("DOWNLOADING", 1);
            DOWNLOAD_COMPLETED = new b("DOWNLOAD_COMPLETED", 2);
            NO_NETWORK = new b("NO_NETWORK", 3);
            EXPIRED = new b("EXPIRED", 4);
            CANCELED = new b("CANCELED", 5);
            ERROR = new b("ERROR", 6);
            $VALUES = (new b[] {
                DOWNLOAD_NOT_STARTED, DOWNLOADING, DOWNLOAD_COMPLETED, NO_NETWORK, EXPIRED, CANCELED, ERROR
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class c extends Enum
    {

        private static final c $VALUES[];
        public static final c EXPIRED;
        public static final c MALWARE_DETECTED;
        public static final c NO_NETWORK;
        public static final c QUEUED;
        public static final c SCANNING_MALWARE;
        public static final c UPLOADING;
        public static final c UPLOAD_COMPLETED;
        public static final c UPLOAD_FAILED_GENERIC;
        public static final c UPLOAD_FAILED_TOO_BIG;

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/skype/android/app/chat/AsyncFileViewAdapter$c, s);
        }

        public static c[] values()
        {
            return (c[])$VALUES.clone();
        }

        static 
        {
            QUEUED = new c("QUEUED", 0);
            UPLOADING = new c("UPLOADING", 1);
            SCANNING_MALWARE = new c("SCANNING_MALWARE", 2);
            UPLOAD_COMPLETED = new c("UPLOAD_COMPLETED", 3);
            MALWARE_DETECTED = new c("MALWARE_DETECTED", 4);
            EXPIRED = new c("EXPIRED", 5);
            UPLOAD_FAILED_TOO_BIG = new c("UPLOAD_FAILED_TOO_BIG", 6);
            UPLOAD_FAILED_GENERIC = new c("UPLOAD_FAILED_GENERIC", 7);
            NO_NETWORK = new c("NO_NETWORK", 8);
            $VALUES = (new c[] {
                QUEUED, UPLOADING, SCANNING_MALWARE, UPLOAD_COMPLETED, MALWARE_DETECTED, EXPIRED, UPLOAD_FAILED_TOO_BIG, UPLOAD_FAILED_GENERIC, NO_NETWORK
            });
        }

        private c(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int supportedMessageTypes[];
    private android.view.View.OnClickListener learnMoreClick;
    private int mediaDocToOpen;

    public AsyncFileViewAdapter(Activity activity, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        super(activity, mediadocumentdownloadutil);
        learnMoreClick = new android.view.View.OnClickListener() {

            final AsyncFileViewAdapter this$0;

            public final void onClick(View view)
            {
                view = getContext().getResources().getQuantityString(0x7f0b0016, ecsConfiguration.getAsyncFileExpirationPeriod(), new Object[] {
                    Integer.valueOf(ecsConfiguration.getAsyncFileExpirationPeriod())
                });
                view = getContext().getString(0x7f080472, new Object[] {
                    view
                });
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
                builder.setMessage(view);
                builder.setNegativeButton(0x7f0802f6, null);
                builder.create().show();
            }

            
            {
                this$0 = AsyncFileViewAdapter.this;
                super();
            }
        };
    }

    private void configureViewHolder(a a1, String s, int i, int j, String s1, com.skype.android.widget.SymbolElement.SymbolCode symbolcode, int k, 
            int l, int i1, int j1, String s2, android.view.View.OnClickListener onclicklistener)
    {
        a1.filename.setText(s);
        a1.mediaThumbnailLayout.getBackground().setLevel(i);
        a1.progress.setVisibility(j);
        a1.subText.setText(s1);
        a1.action.setSymbolCode(symbolcode);
        a1.action.setTextColor(getContext().getResources().getColor(k));
        a1.action.getBackground().setLevel(l);
        a1.action.setTextSize(getContext().getResources().getDimension(i1));
        a1.actionText.setVisibility(j1);
        a1.actionText.setText(s2);
        a1.actionText.setOnClickListener(onclicklistener);
    }

    private int getDownloadProgress(b b1, int i, int j)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[];
            static final int $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[];

            static 
            {
                $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS = new int[b.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[b.DOWNLOAD_NOT_STARTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[b.DOWNLOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[b.DOWNLOAD_COMPLETED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[b.NO_NETWORK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[b.ERROR.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[b.EXPIRED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[b.CANCELED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS = new int[c.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.QUEUED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.UPLOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.SCANNING_MALWARE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.UPLOAD_COMPLETED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.UPLOAD_FAILED_TOO_BIG.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.MALWARE_DETECTED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.UPLOAD_FAILED_GENERIC.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[c.NO_NETWORK.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.skype.android.app.chat.AsyncFileViewAdapter.RECEIVER_STATUS[b1.ordinal()])
        {
        default:
            return 0;

        case 2: // '\002'
            return (int)(((double)i * 75D) / (double)j) + 5;

        case 3: // '\003'
            return 100;
        }
    }

    private long getFileSize(MediaDocument mediadocument)
    {
        if (mediadocument != null)
        {
            mediadocument = mediadocument.getMetadataIntValue("FileSize");
            if (mediadocument != null && ((com.skype.MediaDocument.GetMetadataIntValue_Result) (mediadocument)).m_return)
            {
                return (new Long(((com.skype.MediaDocument.GetMetadataIntValue_Result) (mediadocument)).m_value)).longValue();
            }
        }
        return 0L;
    }

    private String getFileSizeText(long l)
    {
        g g1 = TransferUtil.queryFileSize(l);
        return getContext().getString(((Integer)g1.a).intValue(), new Object[] {
            g1.b
        });
    }

    private String getFilename(MediaDocument mediadocument)
    {
        if (mediadocument != null)
        {
            return mediadocument.getStrProperty(PROPKEY.MEDIADOCUMENT_ORIGINAL_NAME);
        } else
        {
            return "";
        }
    }

    private com.skype.MediaDocument.GetMediaLink_Result getMediaLinkResult(MediaDocument mediadocument, String s, com.skype.MediaDocument.MEDIA_GET_POLICY media_get_policy)
    {
        if (media_get_policy != null)
        {
            return mediadocument.getMediaLink(s, media_get_policy);
        } else
        {
            media_get_policy = FileUtil.getDownloadsDirectory();
            media_get_policy = (new StringBuilder()).append(media_get_policy.getPath()).append(File.separator).append(FileUtil.consolidateFileName(getFilename(mediadocument), media_get_policy)).toString();
            com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = new com.skype.MediaDocument.GetMediaLink_Result();
            getmedialink_result.m_return = mediadocument.downloadToFile(s, media_get_policy);
            getmedialink_result.m_path = media_get_policy;
            return getmedialink_result;
        }
    }

    private com.skype.MediaDocument.GetMediaLink_Result getMediaToOpen(MediaDocument mediadocument, boolean flag)
    {
        com.skype.MediaDocument.GetMediaLink_Result getmedialink_result1;
label0:
        {
            com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = null;
            if (flag)
            {
                getmedialink_result = getMediaLinkResult(mediadocument, (new StringBuilder("?")).append(MediaLinkProfile.ORIGINAL.toString()).toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY);
            }
            if (getmedialink_result != null)
            {
                getmedialink_result1 = getmedialink_result;
                if (!TextUtils.isEmpty(getmedialink_result.m_path))
                {
                    break label0;
                }
            }
            getmedialink_result1 = getMediaLinkResult(mediadocument, MediaLinkProfile.ORIGINAL.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY);
        }
        return getmedialink_result1;
    }

    private b getReceiverStatus(MediaDocument mediadocument, com.skype.MediaDocument.GetMediaLink_Result getmedialink_result)
    {
        mediadocument = mediadocument.getStatusProp();
        getmedialink_result = getmedialink_result.m_return;
        if (!networkUtil.a())
        {
            return b.NO_NETWORK;
        }
        if (getmedialink_result == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            return b.DOWNLOAD_COMPLETED;
        }
        if (getmedialink_result == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING)
        {
            return b.DOWNLOADING;
        }
        if (getmedialink_result == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE || getmedialink_result == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_AVAILABLE_ONLINE || getmedialink_result == null)
        {
            return b.DOWNLOAD_NOT_STARTED;
        }
        if (mediadocument == com.skype.MediaDocument.STATUS.EXPIRED)
        {
            return b.EXPIRED;
        } else
        {
            return b.ERROR;
        }
    }

    private c getSenderStatus(MediaDocument mediadocument, Message message)
    {
        com.skype.MediaDocument.STATUS status = mediadocument.getStatusProp();
        com.skype.MediaDocument.UPLOAD_STATUS upload_status = XmmUtil.getMediaDocumentUploadStatus(lib, mediadocument);
        com.skype.Message.SENDING_STATUS sending_status = com.skype.Message.SENDING_STATUS.SENDING_STATUS_UNKNOWN;
        Message message1 = message;
        if (message == null)
        {
            message1 = XmmUtil.getMessageForMediaDocument(map, mediadocument);
        }
        message = sending_status;
        if (message1 != null)
        {
            message = message1.getSendingStatusProp();
        }
        if (isFileTooBig(mediadocument))
        {
            return c.UPLOAD_FAILED_TOO_BIG;
        }
        if (upload_status == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_QUEUED)
        {
            return c.QUEUED;
        }
        if (upload_status == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_IN_PROGRESS)
        {
            return c.UPLOADING;
        }
        if (upload_status == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_COMPLETED && message == com.skype.Message.SENDING_STATUS.SENDING)
        {
            return c.SCANNING_MALWARE;
        }
        if (upload_status == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_COMPLETED && status == com.skype.MediaDocument.STATUS.AVAILABLE || status == com.skype.MediaDocument.STATUS.AVAILABLE && message == com.skype.Message.SENDING_STATUS.SENT)
        {
            return c.UPLOAD_COMPLETED;
        }
        if (upload_status == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_FAILED || status == com.skype.MediaDocument.STATUS.FAILED || status == com.skype.MediaDocument.STATUS.DELETED)
        {
            return c.UPLOAD_FAILED_GENERIC;
        }
        if (status == com.skype.MediaDocument.STATUS.MALWARE)
        {
            return c.MALWARE_DETECTED;
        }
        if (status == com.skype.MediaDocument.STATUS.EXPIRED)
        {
            return c.EXPIRED;
        } else
        {
            return c.UPLOAD_FAILED_GENERIC;
        }
    }

    private int getTransferBackgroundLevel(String s)
    {
        s = TransferType.getDocType(s);
        return getContext().getResources().getInteger(s.getBackgroundLevelResId());
    }

    private com.skype.android.widget.SymbolElement.SymbolCode getTransferSymbolCode(String s)
    {
        return TransferType.getDocType(s).getSymbolCode();
    }

    private int getUploadProgress(c c1, int i, int j)
    {
        switch (_cls2..SwitchMap.com.skype.android.app.chat.AsyncFileViewAdapter.SENDER_STATUS[c1.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 5;

        case 2: // '\002'
            return (int)(((double)i * 70D) / (double)j) + 5;

        case 3: // '\003'
            return 85;

        case 4: // '\004'
            return 100;
        }
    }

    private void handleDownloadStatus(b b1, a a1, MediaDocument mediadocument)
    {
        String s;
        android.view.View.OnClickListener onclicklistener;
        String s1;
        String s2;
        int i;
        byte byte0;
        int j;
        int k;
        int l;
        byte byte1;
        if (a1 == null)
        {
            return;
        }
        s2 = getFilename(mediadocument);
        j = getTransferBackgroundLevel(s2);
        byte1 = 4;
        k = 0x7f0f0135;
        s1 = getFileSizeText(getFileSize(mediadocument));
        mediadocument = getTransferSymbolCode(s2);
        l = 0;
        s = null;
        i = 0x7f0c016c;
        byte0 = 8;
        onclicklistener = null;
        _cls2..SwitchMap.com.skype.android.app.chat.AsyncFileViewAdapter.RECEIVER_STATUS[b1.ordinal()];
        JVM INSTR tableswitch 1 7: default 116
    //                   1 145
    //                   2 158
    //                   3 185
    //                   4 196
    //                   5 231
    //                   6 262
    //                   7 314;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        b1 = s1;
_L10:
        configureViewHolder(a1, s2, j, byte1, b1, mediadocument, k, l, i, byte0, s, onclicklistener);
        return;
_L2:
        mediadocument = com.skype.android.widget.SymbolElement.SymbolCode.cd;
        l = 1;
        b1 = s1;
        continue; /* Loop/switch isn't completed */
_L3:
        byte1 = 0;
        l = 1;
        s = getContext().getString(0x7f080120);
        byte0 = 0;
        b1 = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f0c016b;
        b1 = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        byte1 = 0;
        b1 = getContext().getString(0x7f080392);
        l = 1;
        byte0 = 0;
        s = getContext().getString(0x7f080120);
        continue; /* Loop/switch isn't completed */
_L6:
        j = 1;
        b1 = getContext().getString(0x7f08038d);
        mediadocument = com.skype.android.widget.SymbolElement.SymbolCode.dw;
        k = 0x7f0f013a;
        i = 0x7f0c016b;
        continue; /* Loop/switch isn't completed */
_L7:
        j = 1;
        b1 = getContext().getString(0x7f08038e);
        mediadocument = com.skype.android.widget.SymbolElement.SymbolCode.dw;
        k = 0x7f0f013a;
        i = 0x7f0c016b;
        byte0 = 0;
        s = getContext().getString(0x7f080350);
        onclicklistener = learnMoreClick;
        continue; /* Loop/switch isn't completed */
_L8:
        j = 1;
        b1 = getContext().getString(0x7f080386);
        mediadocument = com.skype.android.widget.SymbolElement.SymbolCode.dw;
        k = 0x7f0f013a;
        i = 0x7f0c016b;
        byte0 = 0;
        s = getContext().getString(0x7f080390);
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void handleUploadStatus(c c1, a a1, MediaDocument mediadocument)
    {
        com.skype.android.widget.SymbolElement.SymbolCode symbolcode;
        Object obj;
        String s;
        byte byte0;
        int i;
        int j;
        int k;
        int l;
        byte byte1;
        if (a1 == null)
        {
            return;
        }
        s = getFilename(mediadocument);
        j = getTransferBackgroundLevel(s);
        byte1 = 4;
        k = 0x7f0f0135;
        mediadocument = getFileSizeText(getFileSize(mediadocument));
        symbolcode = getTransferSymbolCode(s);
        l = 0;
        obj = null;
        i = 0x7f0c016c;
        byte0 = 8;
        _cls2..SwitchMap.com.skype.android.app.chat.AsyncFileViewAdapter.SENDER_STATUS[c1.ordinal()];
        JVM INSTR tableswitch 1 8: default 116
    //                   1 144
    //                   2 144
    //                   3 164
    //                   4 198
    //                   5 209
    //                   6 291
    //                   7 337
    //                   8 383;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        c1 = obj;
_L10:
        configureViewHolder(a1, s, j, byte1, mediadocument, symbolcode, k, l, i, byte0, c1, null);
        return;
_L2:
        l = 1;
        byte0 = 0;
        c1 = getContext().getString(0x7f080120);
        continue; /* Loop/switch isn't completed */
_L3:
        byte1 = 0;
        mediadocument = getContext().getString(0x7f080397);
        l = 1;
        byte0 = 0;
        c1 = getContext().getString(0x7f080120);
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f0c016b;
        c1 = obj;
        continue; /* Loop/switch isn't completed */
_L5:
        j = 1;
        c1 = getContext().getString(0x7f0803d3, new Object[] {
            Integer.valueOf(ecsConfiguration.getAsyncFileSizeStorageLimit())
        });
        mediadocument = getContext().getString(0x7f080396, new Object[] {
            c1
        });
        symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.dr;
        k = 0x7f0f013a;
        i = 0x7f0c016b;
        byte0 = 0;
        c1 = getContext().getString(0x7f080177);
        continue; /* Loop/switch isn't completed */
_L6:
        j = 1;
        mediadocument = getContext().getString(0x7f080394);
        symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.dr;
        k = 0x7f0f013a;
        i = 0x7f0c016b;
        byte0 = 0;
        c1 = getContext().getString(0x7f080177);
        continue; /* Loop/switch isn't completed */
_L7:
        j = 1;
        mediadocument = getContext().getString(0x7f080393);
        symbolcode = com.skype.android.widget.SymbolElement.SymbolCode.dr;
        k = 0x7f0f013a;
        i = 0x7f0c016b;
        byte0 = 0;
        c1 = getContext().getString(0x7f080390);
        continue; /* Loop/switch isn't completed */
_L8:
        mediadocument = getContext().getString(0x7f080395);
        l = 1;
        a1.actionText.setVisibility(0);
        byte0 = 0;
        c1 = getContext().getString(0x7f080120);
        if (true) goto _L10; else goto _L9
_L9:
    }

    private boolean isFileTooBig(MediaDocument mediadocument)
    {
        return getFileSize(mediadocument) > (long)ecsConfiguration.getAsyncFileSizeStorageLimit();
    }

    private void openMediaDocument(com.skype.MediaDocument.GetMediaLink_Result getmedialink_result, String s)
    {
        if ((new File(getmedialink_result.m_path)).exists())
        {
            if (getmedialink_result.m_path.contains(Environment.getExternalStorageDirectory().getPath()))
            {
                getmedialink_result = Uri.fromFile(new File(getmedialink_result.m_path));
            } else
            {
                getmedialink_result = MediaDocumentFileProvider.getUriForFile(getContext(), new File(getmedialink_result.m_path));
            }
            openFile(s, getmedialink_result);
        }
    }

    private boolean shouldAutoDownload(MediaDocument mediadocument)
    {
        return getFileSize(mediadocument) <= (long)ecsConfiguration.getAsyncFileAutoDownloadSizeLimit();
    }

    protected void alignContentView(MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, Bubblable bubblable, boolean flag, boolean flag1)
    {
        super.alignContentView(mediamessageviewholder, bubblable, flag, flag1);
        Object obj = (a)mediamessageviewholder;
        mediamessageviewholder = (android.widget.RelativeLayout.LayoutParams)((a) (obj)).actionProgressLayout.getLayoutParams();
        bubblable = (android.widget.RelativeLayout.LayoutParams)((a) (obj)).mediaInfoLayout.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)((a) (obj)).filename.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)((a) (obj)).subText.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams2 = (android.widget.RelativeLayout.LayoutParams)((a) (obj)).actionText.getLayoutParams();
        int j = getContext().getResources().getDimensionPixelSize(0x7f0c0238);
        int i = getContext().getResources().getDimensionPixelSize(0x7f0c015c);
        obj = ((a) (obj)).subText;
        int k;
        if (flag)
        {
            k = 5;
        } else
        {
            k = 3;
        }
        ((TextView) (obj)).setGravity(k);
        if (flag)
        {
            k = 0x7f100225;
        } else
        {
            k = 0;
        }
        bubblable.addRule(0, k);
        if (flag)
        {
            k = 0;
        } else
        {
            k = 0x7f100225;
        }
        bubblable.addRule(1, k);
        if (flag)
        {
            k = 0;
        } else
        {
            k = j;
        }
        if (!flag)
        {
            j = 0;
        }
        bubblable.setMargins(k, 0, j, 0);
        if (flag)
        {
            j = 0;
        } else
        {
            j = i;
        }
        if (!flag)
        {
            i = 0;
        }
        mediamessageviewholder.setMargins(j, 0, i, 0);
        if (flag)
        {
            i = -1;
        } else
        {
            i = 0;
        }
        layoutparams.addRule(11, i);
        if (flag)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        layoutparams.addRule(9, i);
        if (flag)
        {
            i = -1;
        } else
        {
            i = 0;
        }
        layoutparams1.addRule(11, i);
        if (flag)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        layoutparams1.addRule(9, i);
        if (flag)
        {
            i = -1;
        } else
        {
            i = 0;
        }
        layoutparams2.addRule(11, i);
        if (flag)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        layoutparams2.addRule(9, i);
    }

    protected j createMessageViewHolder(View view)
    {
        return new a(view);
    }

    protected void enableClickOnThumbnail(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder, boolean flag)
    {
        if (flag)
        {
            super.enableClickOnThumbnail(message, mediadocument, mediamessageviewholder, flag);
            return;
        } else
        {
            AsyncMediaViewAdapter.AsyncMediaViewHolder asyncmediaviewholder = (AsyncMediaViewAdapter.AsyncMediaViewHolder)mediamessageviewholder;
            android.view.ViewGroup viewgroup = asyncmediaviewholder.getInlineContent();
            viewgroup.setClickable(false);
            viewgroup.setLongClickable(false);
            setNavigationListener(asyncmediaviewholder.mediaThumbnailLayout, message, mediadocument);
            setOnItemLongClickListener(message, asyncmediaviewholder.mediaThumbnailLayout, mediamessageviewholder.getLayoutPosition());
            return;
        }
    }

    protected int getLayoutId(int i)
    {
        return 0x7f030037;
    }

    protected MediaLinkProfile getMediaLinkProfile()
    {
        return MediaLinkProfile.ORIGINAL;
    }

    public int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected void onMediaItemClick(MediaDocument mediadocument, Message message)
    {
        message = getMediaToOpen(mediadocument, messageHolderUtil.isOutgoingMessage(message));
        if (!TextUtils.isEmpty(((com.skype.MediaDocument.GetMediaLink_Result) (message)).m_path) && ((com.skype.MediaDocument.GetMediaLink_Result) (message)).m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            openMediaDocument(message, getFilename(mediadocument));
            return;
        } else
        {
            message = (a)getHolderForMediaDocument(mediadocument);
            handleDownloadStatus(getReceiverStatus(mediadocument, getMediaLinkResult(mediadocument, MediaLinkProfile.ORIGINAL.toString(), null)), message, mediadocument);
            mediaDocToOpen = mediadocument.getObjectID();
            return;
        }
    }

    public void openFile(String s, Uri uri)
    {
        SkypeTelemetryEvent skypetelemetryevent;
        Intent intent;
        TransferType transfertype;
        intent = new Intent("android.intent.action.VIEW");
        skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.f);
        transfertype = TransferType.getDocType(s);
        if (transfertype.getAppinfo() != null && !TextUtils.isEmpty(transfertype.getAppinfo().appPackage)) goto _L2; else goto _L1
_L1:
        if (uri == null)
        {
            try
            {
                throw new RuntimeException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = new android.app.AlertDialog.Builder(getContext());
            }
            s.setTitle(0x7f0803d4);
            s.setMessage(0x7f0803d4);
            s.setNegativeButton(0x7f0802f6, null);
            s.create().show();
            return;
        }
        s = s.substring(s.lastIndexOf(".") + 1, s.length());
        intent.setDataAndType(uri, MimeTypeMap.getSingleton().getMimeTypeFromExtension(s));
        intent.addFlags(0x10000000);
        getContext().startActivity(intent);
_L3:
        analytics.a(skypetelemetryevent);
        return;
_L2:
label0:
        {
            if (!InstalledAppVerifier.customPackageExists(getContext(), transfertype.getAppinfo().appPackage))
            {
                break label0;
            }
            s = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append(transfertype.getAppinfo().appProtocol).append("ofe|u|").append(uri.getPath()).toString()));
            s.addFlags(0x10000000);
            getContext().startActivity(s);
        }
          goto _L3
        uri = new Intent(getContext(), com/skype/android/app/chat/OfficeNotInstalledActivity);
        uri.putExtra("path", s);
        uri.addFlags(0x10000000);
        getContext().startActivityForResult(uri, 1);
        skypetelemetryevent.put(LogAttributeName.c, Boolean.valueOf(true));
          goto _L3
    }

    protected void openMediaDocumentAfterDownload(MediaDocument mediadocument, boolean flag)
    {
        if (mediadocument.getObjectID() == mediaDocToOpen)
        {
            mediaDocToOpen = 0;
            openMediaDocument(getMediaToOpen(mediadocument, flag), getFilename(mediadocument));
        }
    }

    protected void setMediaProgressOnBind(AsyncMediaViewAdapter.AsyncMediaViewHolder asyncmediaviewholder, MediaDocument mediadocument, Message message)
    {
        if (asyncmediaviewholder.isOutgoing())
        {
            handleUploadStatus(getSenderStatus(mediadocument, message), (a)asyncmediaviewholder, mediadocument);
        } else
        {
            message = getReceiverStatus(mediadocument, getMediaLinkResult(mediadocument, MediaLinkProfile.ORIGINAL.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY));
            handleDownloadStatus(message, (a)asyncmediaviewholder, mediadocument);
            if (message == b.DOWNLOAD_NOT_STARTED && shouldAutoDownload(mediadocument))
            {
                getMediaLinkResult(mediadocument, MediaLinkProfile.ORIGINAL.toString(), null);
                return;
            }
        }
    }

    protected void setProgressForMedia(MediaDocument mediadocument, int i, int j)
    {
        a a1 = (a)getHolderForMediaDocument(mediadocument);
        if (a1 != null)
        {
            updateHolderRecyclability(a1, false);
            if (a1.isOutgoing())
            {
                c c1 = getSenderStatus(mediadocument, null);
                handleUploadStatus(c1, a1, mediadocument);
                int k = getUploadProgress(c1, i, j);
                a1.progress.setProgress(k);
            } else
            {
                b b1 = getReceiverStatus(mediadocument, getMediaLinkResult(mediadocument, MediaLinkProfile.ORIGINAL.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY));
                handleDownloadStatus(b1, a1, mediadocument);
                int l = getDownloadProgress(b1, i, j);
                a1.progress.setProgress(l);
            }
            if (i == j)
            {
                updateHolderRecyclability(a1, true);
                openMediaDocumentAfterDownload(mediadocument, a1.isOutgoing());
            }
        }
    }

    protected void setThumbnailBitmap(Bitmap bitmap, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
    }

    protected void updateThumbnail(Message message, MediaDocument mediadocument, MediaMessageViewAdapter.MediaMessageViewHolder mediamessageviewholder)
    {
        mediamessageviewholder.thumbnail.setVisibility(8);
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_FILE_MESSAGE.toInt()
        });
    }
}
