// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.chat.AnnotationUtil;
import com.skype.android.app.chat.ChatMessageUtils;
import com.skype.android.app.contacts.ImageItemViewHolder;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.FutureListener;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.res.ChatText;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.SymbolDrawable;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ServerClock;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeSeparator;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.SkypeAvatarView;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.TranslationClickableSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.recents:
//            EditModeListener, Recent, RecentItem

public class RecentAdapter extends DataAdapter
    implements android.os.Handler.Callback, EditModeListener, com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider
{
    public class RecentItemViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final int itemLayoutId;
        final RecentAdapter this$0;

        protected int getItemId(Object obj)
        {
            return ((Recent)obj).getConversationObjectId();
        }

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(itemLayoutId, viewgroup, false);
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected RecentItemViewHolder onCreateViewHolder(View view)
        {
            return new RecentItemViewHolder(context, view, imageCache, contactUtil, groupAvatarUtil, defaultAvatars, map, lib);
        }

        public RecentItemViewAdapter(int i)
        {
            this$0 = RecentAdapter.this;
            super();
            itemLayoutId = i;
        }
    }

    public class RecentItemViewHolder extends ImageItemViewHolder
    {

        public ImageButton editModeFavouriteCheckbox;
        public SkypeAvatarView iconImage;
        public SymbolView imageSelectedOverlay;
        public boolean isLastMessageFromSelf;
        public Message lastMessage;
        public TextView lastMessageTextView;
        private final ObjectIdMap map;
        public Future messageFuture;
        public SymbolView notificationsOffIcon;
        public LinearLayout recentItemSymbolsLayout;
        public TextView recentPillButton;
        final RecentAdapter this$0;
        public TextView timestampView;
        public TextView title;
        public com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture urlPreviewTask;

        private void bindEditModeLayout(boolean flag, Conversation conversation)
        {
label0:
            {
                boolean flag1 = false;
                itemView.setSelected(flag);
                iconImage.setPresenceVisible(false);
                if (imageSelectedOverlay != null)
                {
                    Object obj = imageSelectedOverlay;
                    int i;
                    if (flag)
                    {
                        i = 0;
                    } else
                    {
                        i = 8;
                    }
                    ((SymbolView) (obj)).setVisibility(i);
                }
                if (recentPillButton != null)
                {
                    recentPillButton.setVisibility(8);
                }
                if (timestampView != null)
                {
                    timestampView.setVisibility(8);
                }
                if (iconImage != null)
                {
                    if (itemView.isSelected())
                    {
                        iconImage.a().setBorderColor(context.getResources().getColor(0x7f0f011d));
                    } else
                    {
                        iconImage.a().setBorderColor(context.getResources().getColor(0x7f0f0135));
                    }
                }
                if (notificationsOffIcon != null)
                {
                    if (conversationUtil.e(conversation.getObjectID()) || !conversationUtil.f(conversation.getObjectID()))
                    {
                        if (ConversationUtil.w(conversation))
                        {
                            notificationsOffIcon.setVisibility(0);
                        } else
                        {
                            notificationsOffIcon.setVisibility(8);
                        }
                    } else
                    {
                        notificationsOffIcon.setVisibility(8);
                    }
                }
                if (editModeFavouriteCheckbox != null)
                {
                    if (conversationUtil.f(conversation.getObjectID()) || !ConversationUtil.d(conversation))
                    {
                        break label0;
                    }
                    editModeFavouriteCheckbox.setVisibility(0);
                    obj = editModeFavouriteCheckbox;
                    flag = flag1;
                    if (conversation.getPinnedOrderProp() > 0)
                    {
                        flag = true;
                    }
                    ((ImageButton) (obj)).setSelected(flag);
                }
                return;
            }
            editModeFavouriteCheckbox.setVisibility(8);
        }

        private void bindHeartSymbol(TextView textview, boolean flag)
        {
            Object obj = textview.getTag(0x7f100011);
            Drawable adrawable[] = textview.getCompoundDrawables();
            if (flag)
            {
                if (obj instanceof Drawable)
                {
                    obj = (Drawable)obj;
                } else
                {
                    obj = new HashMap();
                    ((HashMap) (obj)).put(com.skype.android.widget.SymbolElement.SymbolCode.et, Integer.valueOf(0x7f0f00d3));
                    ((HashMap) (obj)).put(com.skype.android.widget.SymbolElement.SymbolCode.cw, Integer.valueOf(0x7f0f0135));
                    obj = ViewUtil.a(context.getApplication(), 0x7f0c01c4, ((HashMap) (obj)), SymbolDrawable.a);
                    textview.setTag(0x7f100011, obj);
                }
            } else
            {
                if (obj instanceof Drawable)
                {
                    textview.setTag(0x7f100011, null);
                }
                obj = null;
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(((Drawable) (obj)), adrawable[1], adrawable[2], adrawable[3]);
        }

        private void bindMessage(Recent recent, boolean flag, boolean flag1, int i, boolean flag2)
        {
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            String s;
            Object obj7;
            int j;
            boolean flag3;
            obj7 = null;
            obj3 = null;
            obj2 = "";
            s = "";
            obj1 = "";
            obj = "";
            j = 0;
            flag3 = false;
            lastMessageTextView.setBackgroundColor(0);
            if (!flag1) goto _L2; else goto _L1
_L1:
            if (!ConversationUtil.b(recent.getLiveStatus())) goto _L4; else goto _L3
_L3:
            obj2 = context.getString(0x7f08046f);
_L30:
            Object obj4;
            Object obj6;
            obj1 = context.getString(0x7f080470);
            obj = obj1;
            obj3 = com.skype.android.widget.SymbolElement.SymbolCode.u;
            obj6 = s;
            obj4 = obj2;
            i = ((flag3) ? 1 : 0);
_L13:
            if (i == 0)
            {
                lastMessageTextView.setText(((CharSequence) (obj4)));
                if (ChatMessageUtils.isSingleUrlSpanMessage(((CharSequence) (obj4))) && configuration.isUrlPreviewEnabled())
                {
                    replaceMessageUrlPreviewTypeAsync(((CharSequence) (obj4)), this, context.getResources());
                }
                static final class _cls3
                {

                    static final int $SwitchMap$com$skype$Message$TYPE[];
                    static final int $SwitchMap$com$skype$SkyLib$LEAVE_REASON[];
                    static final int $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[];

                    static 
                    {
                        $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType = new int[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.values().length];
                        try
                        {
                            $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.VIDEO.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror35) { }
                        try
                        {
                            $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.GIF.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror34) { }
                        try
                        {
                            $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.IMAGE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror33) { }
                        try
                        {
                            $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.SHARING.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror32) { }
                        try
                        {
                            $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.GENERIC.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror31) { }
                        try
                        {
                            $SwitchMap$com$skype$android$app$media$MediaDocumentDownloadUtil$UrlPreviewType[com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType.TWEET.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror30) { }
                        $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.SET_METADATA.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror29) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_EMOTE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror28) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_SMS.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror27) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_TEXT.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror26) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_CONTACTS.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror25) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.SPAWNED_CONFERENCE.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror24) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.HAS_BIRTHDAY.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror23) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.RETIRED.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror22) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ADDED_CONSUMERS.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror21) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.RETIRED_OTHERS.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror20) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.LEGACY_MEMBER_UPGRADED.ordinal()] = 11;
                        }
                        catch (NoSuchFieldError nosuchfielderror19) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ADDED_LEGACY_CONSUMERS.ordinal()] = 12;
                        }
                        catch (NoSuchFieldError nosuchfielderror18) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.REQUESTED_AUTH.ordinal()] = 13;
                        }
                        catch (NoSuchFieldError nosuchfielderror17) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.GRANTED_AUTH.ordinal()] = 14;
                        }
                        catch (NoSuchFieldError nosuchfielderror16) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VOICE_MESSAGE.ordinal()] = 15;
                        }
                        catch (NoSuchFieldError nosuchfielderror15) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.STARTED_LIVESESSION.ordinal()] = 16;
                        }
                        catch (NoSuchFieldError nosuchfielderror14) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.ENDED_LIVESESSION.ordinal()] = 17;
                        }
                        catch (NoSuchFieldError nosuchfielderror13) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VOICE_AUTORESPONSE.ordinal()] = 18;
                        }
                        catch (NoSuchFieldError nosuchfielderror12) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO.ordinal()] = 19;
                        }
                        catch (NoSuchFieldError nosuchfielderror11) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE.ordinal()] = 20;
                        }
                        catch (NoSuchFieldError nosuchfielderror10) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_LOCATION.ordinal()] = 21;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILES.ordinal()] = 22;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.BLOCKED.ordinal()] = 23;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILE_MESSAGE.ordinal()] = 24;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 25;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 26;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        $SwitchMap$com$skype$SkyLib$LEAVE_REASON = new int[com.skype.SkyLib.LEAVE_REASON.values().length];
                        try
                        {
                            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_BUSY.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LEAVE_REASON_NONE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.SkyLib.LEAVE_REASON.LIVE_MANUAL.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                Object obj5;
                long l;
                if (!TextUtils.isEmpty(((CharSequence) (obj6))))
                {
                    lastMessageTextView.setContentDescription(((CharSequence) (obj6)));
                } else
                {
                    lastMessageTextView.setContentDescription(((CharSequence) (obj4)));
                }
            }
            obj2 = null;
            i = 0x7f0c0238;
            if (obj3 != null)
            {
                obj2 = lastMessageTextView.getCompoundDrawables()[0];
                i = 0x7f0c0239;
                if (obj2 != null && (obj2 instanceof SymbolDrawable))
                {
                    ((SymbolDrawable)obj2).setSymbolCode(((com.skype.android.widget.SymbolElement.SymbolCode) (obj3)));
                } else
                {
                    obj2 = new SymbolDrawable(((com.skype.android.widget.SymbolElement.SymbolCode) (obj3)), typeFaceFactory, SymbolDrawable.b);
                    obj3 = (SymbolDrawable)obj2;
                    TextView textview = lastMessageTextView;
                    ((SymbolDrawable) (obj3)).a(textview.getTextSize() * 1.75F);
                    ((SymbolDrawable) (obj3)).a(textview.getCurrentTextColor());
                    ((SymbolDrawable) (obj3)).a();
                }
            }
            obj3 = (android.view.ViewGroup.MarginLayoutParams)lastMessageTextView.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) (obj3)).setMargins(context.getResources().getDimensionPixelSize(i), ((android.view.ViewGroup.MarginLayoutParams) (obj3)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (obj3)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (obj3)).bottomMargin);
            if (useCompoundDrawables())
            {
                lastMessageTextView.setCompoundDrawablesWithIntrinsicBounds(((Drawable) (obj2)), null, null, null);
            } else
            {
                lastMessageTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            }
            if (timestampView != null)
            {
                timestampView.setText(((CharSequence) (obj1)));
                timestampView.setContentDescription(((CharSequence) (obj)));
                bindHeartSymbol(timestampView, flag2);
            }
            if (recentPillButton == null || !configuration.isUnreadMessageCountOrangePillEnabled()) goto _L6; else goto _L5
_L5:
            if (recent.getUnreadCount() <= 0) goto _L8; else goto _L7
_L7:
            recentPillButton.setVisibility(0);
            recentPillButton.setText(Integer.toString(recent.getUnreadCount()));
_L6:
            return;
_L4:
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_465;
            }
            try
            {
                i = recent.getConversationObjectId();
                obj = conversationUtil.a(i);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                timeAnomalyTelemetry.a(((TimeAnomalyException) (obj)), recent.getLiveStatus(), "RecentAdapter#bindMessage#ifLiveOrOnHold");
                continue; /* Loop/switch isn't completed */
            }
            if (obj == null) goto _L10; else goto _L9
_L9:
            l = ((Participant) (obj)).getLiveStartTimestampProp();
_L11:
            obj = TimeUtil.b(serverClock.a(), l);
            obj2 = obj;
            continue; /* Loop/switch isn't completed */
_L10:
            l = recent.getTimestamp();
              goto _L11
            l = recent.getTimestamp();
              goto _L11
_L2:
            obj4 = null;
            obj5 = obj4;
            if (lastMessage != null)
            {
                obj5 = obj4;
                if (i > 0)
                {
                    obj5 = lastMessage.getTypeProp();
                }
            }
            i = ((flag3) ? 1 : 0);
            obj4 = obj2;
            obj6 = s;
            if (obj5 == null) goto _L13; else goto _L12
_L12:
            if (lastMessage.getEditTimestampProp() > 0 && TextUtils.isEmpty(lastMessage.getBodyXmlProp()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _cls3..SwitchMap.com.skype.Message.TYPE[((com.skype.Message.TYPE) (obj5)).ordinal()];
            JVM INSTR tableswitch 1 26: default 708
        //                       1 716
        //                       2 716
        //                       3 716
        //                       4 716
        //                       5 716
        //                       6 716
        //                       7 716
        //                       8 716
        //                       9 716
        //                       10 716
        //                       11 716
        //                       12 716
        //                       13 856
        //                       14 892
        //                       15 923
        //                       16 976
        //                       17 976
        //                       18 1249
        //                       19 1314
        //                       20 1314
        //                       21 1355
        //                       22 1396
        //                       23 1427
        //                       24 1545
        //                       25 1576
        //                       26 1576;
               goto _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L16 _L17 _L18 _L19 _L19 _L20 _L21 _L21 _L22 _L23 _L24 _L25 _L26 _L26
_L26:
            break MISSING_BLOCK_LABEL_1576;
_L14:
            if (XmmUtil.isXmmMessageType(((com.skype.Message.TYPE) (obj5))))
            {
                break MISSING_BLOCK_LABEL_1576;
            }
_L15:
            if (flag)
            {
                i = 0;
                obj = conversationUtil.a();
                obj2 = s;
                obj1 = obj7;
            } else
            {
                i = 1;
                getLastMessageBodyAsync();
                obj1 = obj7;
                obj = obj2;
                obj2 = s;
            }
_L27:
            j = lastMessage.getTimestampProp();
            l = serverClock.a();
            s = timeUtil.a(l, j, false);
            obj3 = timeUtil.a(l, j, true);
            obj5 = obj3;
            obj3 = obj1;
            obj4 = obj;
            obj6 = obj2;
            obj = obj5;
            obj1 = s;
              goto _L13
_L16:
            obj = conversationUtil.a(lastMessage, isLastMessageFromSelf);
            obj1 = com.skype.android.widget.SymbolElement.SymbolCode.an;
            i = j;
            obj2 = s;
              goto _L27
_L17:
            obj = context.getString(0x7f080419);
            obj1 = com.skype.android.widget.SymbolElement.SymbolCode.ao;
            i = j;
            obj2 = s;
              goto _L27
_L18:
            obj = context;
            if (isLastMessageFromSelf)
            {
                i = 0x7f080454;
            } else
            {
                i = 0x7f080453;
            }
            obj = ((Activity) (obj)).getString(i);
            obj1 = obj7;
            i = j;
            obj2 = s;
              goto _L27
_L19:
            if (obj5 == com.skype.Message.TYPE.ENDED_LIVESESSION)
            {
                i = lastMessage.getOtherLiveMessage();
                if (i != 0)
                {
                    lastMessage = (Message)map.a(i, com/skype/Message);
                }
            }
            obj4 = context.getString(0x7f08036b, new Object[] {
                spanCache.a(lastMessage, true)
            });
            obj3 = context.getString(0x7f08036b, new Object[] {
                spanCache.a(lastMessage, false)
            });
            obj = obj4;
            obj2 = obj3;
            switch (_cls3..SwitchMap.com.skype.SkyLib.LEAVE_REASON[lastMessage.getLeaveReasonProp().ordinal()])
            {
            default:
                obj1 = com.skype.android.widget.SymbolElement.SymbolCode.K;
                i = j;
                obj = obj4;
                obj2 = obj3;
                break;

            case 1: // '\001'
            case 2: // '\002'
                obj1 = com.skype.android.widget.SymbolElement.SymbolCode.u;
                i = j;
                obj = obj4;
                obj2 = obj3;
                break;

            case 3: // '\003'
                obj = obj4;
                obj2 = obj3;
                if (!isLastMessageFromSelf)
                {
                    obj = context.getString(0x7f08037f);
                    obj2 = obj;
                }
                // fall through

            case 4: // '\004'
                if (isLastMessageFromSelf)
                {
                    obj1 = com.skype.android.widget.SymbolElement.SymbolCode.u;
                } else
                {
                    obj1 = com.skype.android.widget.SymbolElement.SymbolCode.G;
                }
                i = j;
                break;
            }
            if (true) goto _L27; else goto _L28
_L28:
_L20:
            if (AccountUtil.a(lastMessage, account))
            {
                obj = context.getString(0x7f080454);
            } else
            {
                obj = context.getString(0x7f080453);
            }
            obj1 = obj7;
            i = j;
            obj2 = s;
              goto _L27
_L21:
            obj = conversationUtil.c(AccountUtil.a(lastMessage, account));
            obj1 = obj7;
            i = j;
            obj2 = s;
              goto _L27
_L22:
            obj = conversationUtil.e(AccountUtil.a(lastMessage, account));
            obj1 = obj7;
            i = j;
            obj2 = s;
              goto _L27
_L23:
            obj = transferUtil.getMessageNotification(lastMessage);
            obj1 = obj7;
            i = j;
            obj2 = s;
              goto _L27
_L24:
            obj1 = obj7;
            i = j;
            obj = obj2;
            obj2 = s;
            if (isLastMessageFromSelf)
            {
                obj = contactForConversation(recent.getIdentity());
                if (obj == null || ((Contact) (obj)).isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0)
                {
                    obj = context.getString(0x7f0803ab);
                } else
                {
                    obj = context.getString(0x7f0803b6);
                }
                obj1 = obj7;
                i = j;
                obj2 = s;
            }
              goto _L27
_L25:
            obj = conversationUtil.d(isLastMessageFromSelf);
            obj1 = obj7;
            i = j;
            obj2 = s;
              goto _L27
            obj = conversationUtil.a(isLastMessageFromSelf, flag, ((com.skype.Message.TYPE) (obj5)));
            obj2 = conversationUtil.a(isLastMessageFromSelf, flag, ((com.skype.Message.TYPE) (obj5)), ((CharSequence) (obj)));
            obj1 = obj7;
            i = j;
              goto _L27
            obj3;
            timeAnomalyTelemetry.a(((TimeAnomalyException) (obj3)), obj5, "RecentAdapter#bindMessage");
            obj5 = timeUtil.a(j, false);
            s = timeUtil.a(j, true);
            obj3 = obj1;
            obj4 = obj;
            obj6 = obj2;
            obj = s;
            obj1 = obj5;
              goto _L13
_L8:
            recentPillButton.setVisibility(4);
            return;
            if (true) goto _L30; else goto _L29
_L29:
        }

        private void bindRecentListItemLayout(Recent recent, Conversation conversation)
        {
label0:
            {
                itemView.setSelected(false);
                if (imageSelectedOverlay != null)
                {
                    imageSelectedOverlay.setVisibility(8);
                }
                if (iconImage != null)
                {
                    iconImage.a().setBorderColor(context.getResources().getColor(0x7f0f0135));
                }
                if (editModeFavouriteCheckbox != null)
                {
                    editModeFavouriteCheckbox.setVisibility(8);
                }
                if (timestampView != null)
                {
                    timestampView.setVisibility(0);
                }
                if (recentPillButton != null && configuration.isUnreadMessageCountOrangePillEnabled())
                {
                    if (recent.getUnreadCount() > 0)
                    {
                        recentPillButton.setVisibility(0);
                        recentPillButton.setText(Integer.toString(recent.getUnreadCount()));
                    } else
                    {
                        recentPillButton.setVisibility(8);
                    }
                }
                if (notificationsOffIcon != null && !layoutExperience.isMultipane())
                {
                    if (!ConversationUtil.w(conversation))
                    {
                        break label0;
                    }
                    notificationsOffIcon.setVisibility(0);
                }
                return;
            }
            notificationsOffIcon.setVisibility(8);
        }

        private void bindTitle(Recent recent, boolean flag, boolean flag1)
        {
            Object obj1 = (CharSequence)conversationTitles.get(recent.getConversationObjectId());
            Object obj = obj1;
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj1 = recent.getDisplayName();
                obj = obj1;
                if (!recent.isDialog())
                {
                    obj = obj1;
                    if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                    {
                        String s = ((CharSequence) (obj1)).toString();
                        contactUtil.getClass();
                        obj = obj1;
                        if (s.contains("guest:"))
                        {
                            obj = getCustomTitle(((CharSequence) (obj1)));
                        }
                    }
                }
            }
            title.setText(((CharSequence) (obj)));
            title.setTag(recent);
            obj1 = obj;
            if (recent.getUnreadCount() > 0)
            {
                obj1 = (new StringBuilder()).append(context.getString(0x7f0800ea)).append(obj).toString();
            }
            title.setContentDescription(((CharSequence) (obj1)));
            obj = typeFaceFactory.getDefault(title.getTextSize());
            int i;
            if (useClickableTitleColor)
            {
                i = 0x7f0f00f9;
            } else
            if (recent.getUnreadCount() > 0 || flag1)
            {
                if (configuration.isRecentsUnreadMessageColorChangeEnabled())
                {
                    i = 0x7f0f00fe;
                    obj = typeFaceFactory.getBold(title.getTextSize());
                } else
                {
                    i = 0x7f0f011c;
                }
            } else
            {
                i = 0x7f0f00fe;
            }
            obj1 = context.getResources();
            title.setTextColor(((Resources) (obj1)).getColor(i));
            title.setTypeface(((android.graphics.Typeface) (obj)));
            obj1 = com.skype.Contact.TYPE.UNRECOGNIZED;
            obj = obj1;
            if (!flag)
            {
                recent = contactForConversation(recent.getIdentity());
                obj = obj1;
                if (recent != null)
                {
                    obj = recent.getTypeProp();
                }
            }
            contactUtil.a(title, ((com.skype.Contact.TYPE) (obj)));
        }

        private Message getMessageFromMap(int i)
        {
            Message message;
            try
            {
                message = (Message)map.a(i, com/skype/Message);
            }
            catch (ObjectInterfaceNotFoundException objectinterfacenotfoundexception)
            {
                return null;
            }
            return message;
        }

        public void getLastMessageBodyAsync()
        {
            lastMessageTextView.setText("");
            lastMessageTextView.setContentDescription("");
            messageFuture = spanCache.a(lastMessage, this, textCallback);
        }

        public void onClick(View view)
        {
            if (view != editModeFavouriteCheckbox) goto _L2; else goto _L1
_L1:
            boolean flag1;
            view = (Conversation)map.a(((RecentItem)getItem(getAdapterPosition() - 1)).getConversationObjectId(), com/skype/Conversation);
            flag1 = false;
            if (view == null) goto _L4; else goto _L3
_L3:
            boolean flag;
            if (view.getPinnedOrderProp() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (view.getTypeProp() != com.skype.Conversation.TYPE.CONFERENCE && view.getTypeProp() != com.skype.Conversation.TYPE.LEGACY_VOICE_CONFERENCE) goto _L6; else goto _L5
_L5:
            flag1 = false;
_L11:
            if (!flag || !flag1) goto _L8; else goto _L7
_L7:
            conversationUtil.b(view);
            editModeFavouriteCheckbox.setSelected(false);
_L4:
            return;
_L6:
            if (view.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
            {
                flag1 = conversationUtil.r(view).isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES);
            }
            continue; /* Loop/switch isn't completed */
_L8:
            if (flag || !flag1) goto _L4; else goto _L9
_L9:
            conversationUtil.a(view);
            editModeFavouriteCheckbox.setSelected(true);
            return;
_L2:
            super.onClick(view);
            return;
            if (true) goto _L11; else goto _L10
_L10:
        }

        protected void onSetData(Object obj)
        {
            onViewRecycled();
            if (obj == null)
            {
                title.setText("");
                lastMessageTextView.setText("");
                iconImage.setImageDrawable(context.getResources().getDrawable(0x7f020236));
                return;
            }
            obj = (Recent)obj;
            Object obj1;
            SparseBooleanArray sparsebooleanarray;
            int i;
            int j;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (!((Recent) (obj)).isDialog())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag3 = ConversationUtil.c(((Recent) (obj)).getLiveStatus());
            i = ((Recent) (obj)).getLastMessageObjectId();
            if (i > 0)
            {
                try
                {
                    lastMessage = null;
                    lastMessage = (Message)map.a(i, com/skype/Message);
                    isLastMessageFromSelf = isOutgoingMessage(lastMessage);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    analytics.a(new SkypeTelemetryEvent(LogEvent.e));
                }
            }
            obj1 = (Conversation)map.a(((Recent) (obj)).getConversationObjectId(), com/skype/Conversation);
            if (showImages)
            {
                bindImage(((Conversation) (obj1)));
            } else
            {
                iconImage.setVisibility(8);
            }
            flag2 = false;
            j = conversationUtil.c(((Recent) (obj)).getConversationObjectId());
            flag1 = flag2;
            if (j != -1)
            {
                Message message = getMessageFromMap(j);
                flag1 = flag2;
                if (message != null)
                {
                    flag1 = flag2;
                    if (isOutgoingMessage(message))
                    {
                        flag1 = annotationUtil.isAnnotatedByOthers(message, com.skype.MessageAnnotation.TYPE.EMOTICON, "heart");
                    }
                }
            }
            bindTitle(((Recent) (obj)), flag, flag3);
            bindMessage(((Recent) (obj)), flag, flag3, i, flag1);
            sparsebooleanarray = getCheckedState(0);
            if (inEditMode)
            {
                bindEditModeLayout(sparsebooleanarray.get(((Recent) (obj)).getConversationObjectId()), ((Conversation) (obj1)));
                return;
            } else
            {
                bindRecentListItemLayout(((Recent) (obj)), ((Conversation) (obj1)));
                return;
            }
        }

        public void onViewRecycled()
        {
            super.onViewRecycled();
            if (urlPreviewTask != null)
            {
                urlPreviewTask.cancel(true);
                urlPreviewTask = null;
            }
            if (messageFuture != null)
            {
                messageFuture.cancel(true);
                messageFuture = null;
            }
            lastMessage = null;
        }

        public RecentItemViewHolder(Activity activity, View view, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, 
                ObjectIdMap objectidmap, SkyLib skylib)
        {
            this$0 = RecentAdapter.this;
            super(activity, view, (SkypeAvatarView)ViewUtil.a(view, 0x7f1004e1), imagecache, contactutil, groupavatarutil, defaultavatars, skylib);
            isLastMessageFromSelf = false;
            iconImage = (SkypeAvatarView)ViewUtil.a(view, 0x7f1004e1);
            title = (TextView)ViewUtil.a(view, 0x7f1004e3);
            lastMessageTextView = (TextView)ViewUtil.a(view, 0x7f1004e4);
            timestampView = (TextView)ViewUtil.a(view, 0x7f1004e2);
            recentPillButton = (TextView)ViewUtil.a(view, 0x7f1004ef);
            iconImage.a().setBorderClickedColor(context.getResources().getColor(0x7f0f011d));
            map = objectidmap;
            new SpannedAnimationDrawableCallback(lastMessageTextView);
            if (enableTimeSeparators)
            {
                RecentAdapter.alignWithTimeSeparators(view);
            }
            notificationsOffIcon = (SymbolView)ViewUtil.a(view, 0x7f1004ed);
            imageSelectedOverlay = (SymbolView)ViewUtil.a(view, 0x7f1004ea);
            editModeFavouriteCheckbox = (ImageButton)ViewUtil.a(view, 0x7f1004ee);
            recentItemSymbolsLayout = (LinearLayout)ViewUtil.a(view, 0x7f1004ec);
            iconImage.a().setBorderClickedColor(context.getResources().getColor(0x7f0f011d));
            if (editModeFavouriteCheckbox != null)
            {
                editModeFavouriteCheckbox.setOnClickListener(this);
            }
            if (customCheckboxResId != -1 && editModeFavouriteCheckbox != null)
            {
                editModeFavouriteCheckbox.setImageResource(customCheckboxResId);
            }
        }
    }

    public static class SeparatorViewAdapter extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        protected int getItemId(Object obj)
        {
            return (int)((TimeSeparator)obj).b();
        }

        protected View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03011a, viewgroup, false);
        }

        protected volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

        protected SeparatorViewHolder onCreateViewHolder(View view)
        {
            return new SeparatorViewHolder(view);
        }

        public SeparatorViewAdapter()
        {
        }
    }

    public static class SeparatorViewHolder extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        final TextView view;

        protected void onSetData(Object obj)
        {
            obj = ((TimeSeparator)obj).a();
            view.setText(((CharSequence) (obj)));
            view.setContentDescription(itemView.getContext().getString(0x7f0800b9, new Object[] {
                obj
            }));
            view.setFocusable(false);
        }

        public SeparatorViewHolder(View view1)
        {
            super(view1);
            view = (TextView)view1;
        }
    }


    private static final String SCREEN_NAME = "recent_screen";
    public static final int VIEW_TYPE_CALL_RECENT = 2;
    public static final int VIEW_TYPE_RECENT = 0;
    static final int VIEW_TYPE_SEPARATOR = 1;
    private static final int WHAT_UPDATE_INBOX = 1;
    private static final int WHAT_UPDATE_INBOX_JUST_NOW = 2;
    Account account;
    Analytics analytics;
    AnnotationUtil annotationUtil;
    ChatText chatText;
    EcsConfiguration configuration;
    ContactUtil contactUtil;
    private HashMap contacts;
    private Activity context;
    private SparseArray conversationTitles;
    ConversationUtil conversationUtil;
    private int customCheckboxResId;
    DefaultAvatars defaultAvatars;
    private boolean enableTimeSeparators;
    GroupAvatarUtil groupAvatarUtil;
    private Map groupInfoMap;
    private Handler handler;
    ImageCache imageCache;
    private boolean inEditMode;
    LayoutExperience layoutExperience;
    SkyLib lib;
    ObjectIdMap map;
    private int maxCount;
    MediaDocumentDownloadUtil mediaDocumentDownloadUtil;
    private List recents;
    ServerClock serverClock;
    private boolean showImages;
    private boolean showUnreadConversationOnly;
    FormattedMessageCache spanCache;
    private AsyncCallback textCallback;
    TimeAnomalyTelemetry timeAnomalyTelemetry;
    TimeUtil timeUtil;
    TransferUtil transferUtil;
    SegoeTypeFaceFactory typeFaceFactory;
    private UpdateScheduler updateScheduler;
    private boolean useClickableTitleColor;

    public RecentAdapter(final Activity context)
    {
        customCheckboxResId = -1;
        this.context = context;
        maxCount = 0x7fffffff;
        showImages = true;
        recents = new ArrayList();
        handler = new Handler(this);
        contacts = new HashMap();
        conversationTitles = new SparseArray();
        updateScheduler = new UpdateScheduler(handler);
        typeFaceFactory = SegoeTypeFaceFactory.getInstance(context.getApplication());
        textCallback = new UiCallback(context, new AsyncCallback() {

            final RecentAdapter this$0;
            final Activity val$context;

            public final void done(AsyncResult asyncresult)
            {
                if (!asyncresult.d())
                {
                    CharSequence charsequence = (CharSequence)asyncresult.a();
                    TranslationClickableSpan.a(charsequence);
                    RecentItemViewHolder recentitemviewholder = (RecentItemViewHolder)asyncresult.b();
                    asyncresult = context.getResources();
                    recentitemviewholder.lastMessageTextView.setText(charsequence);
                    if (ChatMessageUtils.isSingleUrlSpanMessage(charsequence) && configuration.isUrlPreviewEnabled())
                    {
                        replaceMessageUrlPreviewTypeAsync(charsequence, recentitemviewholder, asyncresult);
                    }
                    asyncresult = charsequence;
                    Object obj = asyncresult;
                    if (recentitemviewholder.lastMessageTextView.getTag() != null)
                    {
                        Conversation conversation = (Conversation)recentitemviewholder.lastMessageTextView.getTag();
                        conversationTitles.put(conversation.getObjectID(), charsequence);
                        obj = asyncresult;
                        if (conversation.getUnconsumedNormalMessagesProp() > 0)
                        {
                            obj = (new StringBuilder()).append(RecentAdapter.this.context.getString(0x7f0800ea)).append(charsequence).toString();
                        }
                    }
                    recentitemviewholder.lastMessageTextView.setContentDescription(((CharSequence) (obj)));
                }
            }

            
            {
                this$0 = RecentAdapter.this;
                context = activity;
                super();
            }
        });
        setItemViewAdapter(0, new RecentItemViewAdapter(getItemLayoutId()));
        setItemViewAdapter(1, new SeparatorViewAdapter());
    }

    private void addSeparators()
    {
        TreeMap treemap = new TreeMap();
        TreeMap treemap1 = new TreeMap();
        for (int i = 0; i < getCount(); i++)
        {
            Recent recent = (Recent)getItem(i);
            TimeSeparator timeseparator1 = timeUtil.e(recent.getTimestamp());
            List list = (List)treemap1.get(timeseparator1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                treemap1.put(timeseparator1, obj);
            }
            ((List) (obj)).add(recent);
        }

        clear();
        int j = 0;
        setNotifyOnChange(false);
        for (Iterator iterator = treemap1.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)iterator.next();
            TimeSeparator timeseparator = (TimeSeparator)((java.util.Map.Entry) (obj1)).getKey();
            add(timeseparator);
            for (obj1 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator(); ((Iterator) (obj1)).hasNext(); add((Recent)((Iterator) (obj1)).next())) { }
            treemap.put(timeseparator, new com.skype.android.widget.SeparatedColumnsAdapter.ListItemsGroupsProvider.GroupInfo(((List)treemap1.get(timeseparator)).size(), j));
            j++;
        }

        setNotifyOnChange(true);
        notifyDataSetChanged();
        groupInfoMap = treemap;
    }

    private static void alignWithTimeSeparators(View view)
    {
        Resources resources = view.getContext().getResources();
        view.setPadding(resources.getDimensionPixelSize(0x7f0c00c7), view.getPaddingTop(), resources.getDimensionPixelSize(0x7f0c00c7), view.getPaddingBottom());
    }

    private Contact contactForConversation(String s)
    {
label0:
        {
            Contact contact = (Contact)contacts.get(s);
            Object obj = contact;
            if (contact == null)
            {
                obj = new ContactImpl();
                if (!lib.getContact(s, ((Contact) (obj))))
                {
                    break label0;
                }
                contacts.put(s, obj);
            }
            return ((Contact) (obj));
        }
        return null;
    }

    private CharSequence getCustomTitle(CharSequence charsequence)
    {
        String as[] = charsequence.toString().split(",");
        boolean flag = as[0].startsWith("\u019F");
        if (flag)
        {
            charsequence = as[0].substring(1);
        } else
        {
            charsequence = as[0];
        }
        as[0] = charsequence;
        for (int i = 0; i < as.length; i++)
        {
            as[i] = as[i].trim();
            if (!ContactUtil.e(as[i]))
            {
                continue;
            }
            charsequence = new ContactImpl();
            if (!lib.getContact(as[i], charsequence))
            {
                continue;
            }
            String s = charsequence.getDisplaynameProp();
            if (TextUtils.isEmpty(s))
            {
                continue;
            }
            if (ContactUtil.e(s))
            {
                charsequence.refreshProfile();
            }
            as[i] = s;
        }

        if (flag)
        {
            charsequence = (new StringBuilder("\u019F ")).append(as[0]).toString();
        } else
        {
            charsequence = as[0];
        }
        as[0] = charsequence;
        return TextUtils.join(", ", as);
    }

    private boolean isOutgoingMessage(Message message)
    {
        return message.getAuthorProp().equalsIgnoreCase(account.getSkypenameProp());
    }

    private void refreshContent()
    {
        setNotifyOnChange(false);
        clear();
        Iterator iterator = recents.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Recent recent = (Recent)iterator.next();
            if (!showUnreadConversationOnly || recent.getUnreadCount() > 0)
            {
                add(recent);
            }
        } while (true);
        if (enableTimeSeparators)
        {
            addSeparators();
        }
        setNotifyOnChange(true);
        notifyDataSetChanged();
    }

    private void replaceMessageUrlPreviewTypeAsync(final CharSequence mediaPreviewFuture, final RecentItemViewHolder holder, final Resources resources)
    {
        mediaPreviewFuture = mediaDocumentDownloadUtil.getMediaUrlPreviewAsync(ChatMessageUtils.getSpanUrl(mediaPreviewFuture));
        holder.urlPreviewTask = mediaPreviewFuture;
        mediaPreviewFuture.addListener(new FutureListener() {

            final RecentAdapter this$0;
            final RecentItemViewHolder val$holder;
            final com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture val$mediaPreviewFuture;
            final Resources val$resources;

            public final void onError(Throwable throwable)
            {
            }

            public final void onResult(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
            {
                holder.urlPreviewTask = null;
                updateUrlPreviewText(holder, resources, urlpreviewresult);
                reportUrlPreviewTelemetryEvents(urlpreviewresult, mediaPreviewFuture);
            }

            public final volatile void onResult(Object obj)
            {
                onResult((com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult)obj);
            }

            
            {
                this$0 = RecentAdapter.this;
                holder = recentitemviewholder;
                resources = resources1;
                mediaPreviewFuture = telemetryurlpreviewfuture;
                super();
            }
        });
    }

    private void reportUrlPreviewTelemetryEvents(com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult, com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture telemetryurlpreviewfuture)
    {
        if (urlpreviewresult.isDownloadedFromNetwork())
        {
            telemetryurlpreviewfuture.reportEvents(AnalyticsEvent.cV, "recent_screen", urlpreviewresult.getType().toString(), urlpreviewresult.getTitle(), urlpreviewresult.getFavicon().getStatus().toString(), urlpreviewresult.getUrlMedia().getStatus().toString(), analytics);
            return;
        } else
        {
            telemetryurlpreviewfuture.incrementUiCacheDownload();
            return;
        }
    }

    private void sortRecents()
    {
        Collections.sort(recents, Recent.TIME_COMPARATOR);
        refreshContent();
        handler.removeMessages(2);
        handler.sendEmptyMessageDelayed(2, TimeUtil.b);
    }

    private void sortRecentsDelayed()
    {
        updateScheduler.a(1);
    }

    private void updateUrlPreviewText(RecentItemViewHolder recentitemviewholder, Resources resources, com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewResult urlpreviewresult)
    {
        switch (_cls3..SwitchMap.com.skype.android.app.media.MediaDocumentDownloadUtil.UrlPreviewType[urlpreviewresult.getType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            urlpreviewresult = recentitemviewholder.lastMessageTextView;
            if (recentitemviewholder.isLastMessageFromSelf)
            {
                recentitemviewholder = resources.getString(0x7f08034c);
            } else
            {
                recentitemviewholder = recentitemviewholder.lastMessage.getAuthorDisplaynameProp();
            }
            urlpreviewresult.setText(resources.getString(0x7f08031d, new Object[] {
                recentitemviewholder
            }));
            return;

        case 2: // '\002'
            urlpreviewresult = recentitemviewholder.lastMessageTextView;
            if (recentitemviewholder.isLastMessageFromSelf)
            {
                recentitemviewholder = resources.getString(0x7f08034c);
            } else
            {
                recentitemviewholder = recentitemviewholder.lastMessage.getAuthorDisplaynameProp();
            }
            urlpreviewresult.setText(resources.getString(0x7f08031a, new Object[] {
                recentitemviewholder
            }));
            return;

        case 3: // '\003'
            urlpreviewresult = recentitemviewholder.lastMessageTextView;
            if (recentitemviewholder.isLastMessageFromSelf)
            {
                recentitemviewholder = resources.getString(0x7f08034c);
            } else
            {
                recentitemviewholder = recentitemviewholder.lastMessage.getAuthorDisplaynameProp();
            }
            urlpreviewresult.setText(resources.getString(0x7f08031e, new Object[] {
                recentitemviewholder
            }));
            return;

        case 4: // '\004'
        case 5: // '\005'
            urlpreviewresult = recentitemviewholder.lastMessageTextView;
            if (recentitemviewholder.isLastMessageFromSelf)
            {
                recentitemviewholder = resources.getString(0x7f08034c);
            } else
            {
                recentitemviewholder = recentitemviewholder.lastMessage.getAuthorDisplaynameProp();
            }
            urlpreviewresult.setText(resources.getString(0x7f08031b, new Object[] {
                recentitemviewholder
            }));
            return;

        case 6: // '\006'
            urlpreviewresult = recentitemviewholder.lastMessageTextView;
            break;
        }
        if (recentitemviewholder.isLastMessageFromSelf)
        {
            recentitemviewholder = resources.getString(0x7f08034c);
        } else
        {
            recentitemviewholder = recentitemviewholder.lastMessage.getAuthorDisplaynameProp();
        }
        urlpreviewresult.setText(resources.getString(0x7f08031c, new Object[] {
            recentitemviewholder
        }));
    }

    public void cancelInboxSortingUpdater()
    {
        handler.removeMessages(2);
    }

    public android.support.v7.widget.RecyclerView.a getAdapter()
    {
        return this;
    }

    public Map getGroupInfoMap()
    {
        return groupInfoMap;
    }

    public int getItemCount()
    {
        int j = super.getItemCount();
        int i = j;
        if (j > maxCount)
        {
            i = maxCount;
        }
        return i;
    }

    protected int getItemLayoutId()
    {
        return 0x7f0300f1;
    }

    public int getItemViewType(int i)
    {
        Object obj = getItem(i);
        i = 0;
        if (obj instanceof TimeSeparator)
        {
            i = 1;
        }
        return i;
    }

    public boolean handleMessage(android.os.Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            sortRecents();
            break;
        }
        return true;
    }

    public void onEditModeChanged(boolean flag)
    {
        inEditMode = flag;
        notifyDataSetChanged();
    }

    public int recentPositionForConversation(int i)
    {
        for (int j = 0; j < recents.size(); j++)
        {
            if (i == ((Recent)recents.get(j)).getConversationObjectId())
            {
                return j;
            }
        }

        return -1;
    }

    public void setCustomCheckboxResource(int i)
    {
        customCheckboxResId = i;
    }

    public void setFilterUnreadConversationOnly(boolean flag)
    {
        showUnreadConversationOnly = flag;
        refreshContent();
    }

    public void setMaxCount(int i)
    {
        maxCount = i;
    }

    public void setShowImages(boolean flag)
    {
        showImages = flag;
    }

    public void setTimeSeparatorsEnabled(boolean flag)
    {
        enableTimeSeparators = flag;
    }

    public void startInboxSortingUpdater()
    {
        handler.removeMessages(2);
        handler.sendEmptyMessageDelayed(2, TimeUtil.b);
    }

    public void update(List list)
    {
        recents.clear();
        if (list == null)
        {
            refreshContent();
            return;
        }
        Recent recent;
        for (list = list.iterator(); list.hasNext(); recents.add(recent))
        {
            recent = (Recent)list.next();
        }

        refreshContent();
        sortRecentsDelayed();
    }

    public void updateExisting(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Recent recent = (Recent)list.next();
            int i = recentPositionForConversation(recent.getConversationObjectId());
            if (i != -1)
            {
                recents.remove(i);
            } else
            {
                i = 0;
            }
            if (recent.isInboxConversation())
            {
                recents.add(i, recent);
            }
        } while (true);
        sortRecentsDelayed();
    }

    public void useClickableTitleColors(boolean flag)
    {
        useClickableTitleColor = flag;
    }

    protected boolean useCompoundDrawables()
    {
        return true;
    }















}
