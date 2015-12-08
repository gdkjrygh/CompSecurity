// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.MessageAnnotation;
import com.skype.SkyLib;
import com.skype.android.app.location.LocationUtil;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MojiPlaybackStateHolder;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.skype.android.app.chat:
//            ChatTimeStampAnimator, h, TextMessageViewAdapter, b, 
//            k, l, m, CallNotificationViewAdapter, 
//            a, d, PhotoMessageViewAdapter, AsyncVideoMessageViewAdapter, 
//            AsyncFileViewAdapter, MojiMediaMessageViewAdapter, g, MessageViewAdapter, 
//            XmmMessageViewAdapter, j, AnnotationUtil, MessageHolder, 
//            MessageHolderUtil, SkypeMessageHolder, SynthAuthReqMessageHolder, SyntheticTypes, 
//            c, ChatViewMonitor

public class MessageAdapter extends android.support.v7.widget.RecyclerView.a
    implements android.os.Handler.Callback
{

    public static final int WHAT_REFRESH = 1;
    public static final int WHAT_START_PLAYBACK = 2;
    public static final int WHAT_STOP_PLAYBACK = 3;
    private Account account;
    private AnnotationUtil annotationUtil;
    private final ChatTimeStampAnimator chatTimeStampAnimator = new ChatTimeStampAnimator();
    private boolean checkedForCurrentMessages;
    private Activity context;
    private Conversation conversation;
    private int currentExpandedPosition;
    private EcsConfiguration ecsConfiguration;
    private Handler handler;
    private HashMap identityMap;
    private SkyLib lib;
    private MediaDocumentDownloadUtil mediaDocumentDownloadUtil;
    private h messageHolderItems;
    private MessageHolderUtil messageHolderUtil;
    private List messageStatusIndicatorSupports;
    private Map messageTypeToAdapterMap;
    private int newestMessageTimestamp;
    private int positionOfLastMessageFromMe;
    private TextMessageViewAdapter textMessageViewAdapter;

    public MessageAdapter(Activity activity, SkyLib skylib, Account account1, UserPreferences userpreferences, MediaDocumentDownloadUtil mediadocumentdownloadutil, MojiPlaybackStateHolder mojiplaybackstateholder, ChatViewMonitor chatviewmonitor, 
            MessageHolderUtil messageholderutil, EcsConfiguration ecsconfiguration, LocationUtil locationutil, AnnotationUtil annotationutil, Conversation conversation1)
    {
        currentExpandedPosition = -1;
        newestMessageTimestamp = -1;
        positionOfLastMessageFromMe = -1;
        lib = skylib;
        account = account1;
        mediaDocumentDownloadUtil = mediadocumentdownloadutil;
        handler = new Handler(this);
        context = activity;
        conversation = conversation1;
        messageHolderItems = new h();
        messageHolderUtil = messageholderutil;
        skylib = new ArrayList();
        textMessageViewAdapter = new TextMessageViewAdapter(activity, mediadocumentdownloadutil, conversation1);
        ecsConfiguration = ecsconfiguration;
        annotationUtil = annotationutil;
        skylib.add(textMessageViewAdapter);
        skylib.add(new b(activity));
        skylib.add(new k(activity, handler));
        skylib.add(new l(activity));
        skylib.add(new m(activity, handler));
        skylib.add(new CallNotificationViewAdapter(activity));
        skylib.add(new a(activity));
        skylib.add(new d(activity));
        skylib.add(new PhotoMessageViewAdapter(activity, mediadocumentdownloadutil));
        skylib.add(new AsyncVideoMessageViewAdapter(activity, mediadocumentdownloadutil));
        skylib.add(new AsyncFileViewAdapter(activity, mediadocumentdownloadutil));
        skylib.add(new MojiMediaMessageViewAdapter(activity, mediadocumentdownloadutil, mojiplaybackstateholder));
        if (isLocationSharingEnabled(locationutil, ecsconfiguration))
        {
            skylib.add(new g(activity));
        }
        messageTypeToAdapterMap = new HashMap();
        for (activity = skylib.iterator(); activity.hasNext();)
        {
            skylib = (MessageViewAdapter)activity.next();
            account1 = skylib.getSupportedMessageTypes();
            int i1 = account1.length;
            int i = 0;
            while (i < i1) 
            {
                int j1 = account1[i];
                if (messageTypeToAdapterMap.containsKey(Integer.valueOf(j1)))
                {
                    throw new IllegalStateException((new StringBuilder("Message type '")).append(j1).append("' supported in '").append(((MessageViewAdapter)messageTypeToAdapterMap.get(Integer.valueOf(j1))).getClass()).append("' and '").append(skylib.getClass()).append("'").toString());
                }
                messageTypeToAdapterMap.put(Integer.valueOf(j1), skylib);
                i++;
            }
        }

        addXmmFallback(messageTypeToAdapterMap);
        identityMap = new HashMap();
        messageStatusIndicatorSupports = new ArrayList();
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_TEXT.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_SMS.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_CONTACTS.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_FILE_MESSAGE.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_VIDEO.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_GENERIC_MEDIA_FALLBACK.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_LOCATION.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_VOICE_MESSAGE.toInt()));
        messageStatusIndicatorSupports.add(Integer.valueOf(com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.toInt()));
    }

    private void addXmmFallback(Map map)
    {
        XmmMessageViewAdapter xmmmessageviewadapter = new XmmMessageViewAdapter(context, mediaDocumentDownloadUtil);
        int ai[] = xmmmessageviewadapter.getSupportedMessageTypes();
        int i1 = ai.length;
        for (int i = 0; i < i1; i++)
        {
            int j1 = ai[i];
            if (!map.containsKey(Integer.valueOf(j1)))
            {
                map.put(Integer.valueOf(j1), xmmmessageviewadapter);
            }
        }

    }

    private void bindLovedByTextView(j j1, MessageHolder messageholder)
    {
        if (j1.isChatItemExpanded())
        {
            setTextToLovedByTextView(j1, messageholder);
        } else
        if (j1.getLovedByText() != null)
        {
            j1.getLovedByText().setVisibility(8);
            return;
        }
    }

    private void bindStatusIndicatorView(TextView textview, com.skype.Message.SENDING_STATUS sending_status)
    {
        Object obj;
        HashMap hashmap;
        obj = null;
        hashmap = new HashMap();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Message$SENDING_STATUS[];

            static 
            {
                $SwitchMap$com$skype$Message$SENDING_STATUS = new int[com.skype.Message.SENDING_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.Message.SENDING_STATUS.SENDING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.Message.SENDING_STATUS.SENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.Message.SENDING_STATUS[sending_status.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 51
    //                   2 99;
           goto _L1 _L2 _L3
_L1:
        sending_status = obj;
_L5:
        textview.setCompoundDrawablesWithIntrinsicBounds(null, null, sending_status, null);
        return;
_L2:
        textview.setText(context.getResources().getString(0x7f08043e));
        hashmap.put(com.skype.android.widget.SymbolElement.SymbolCode.eB, Integer.valueOf(0x7f0f00bc));
        sending_status = ViewUtil.a(context.getApplication(), hashmap);
        continue; /* Loop/switch isn't completed */
_L3:
        textview.setText(context.getResources().getString(0x7f08043f));
        hashmap.put(com.skype.android.widget.SymbolElement.SymbolCode.eB, Integer.valueOf(0x7f0f00bc));
        hashmap.put(com.skype.android.widget.SymbolElement.SymbolCode.bZ, Integer.valueOf(0x7f0f00bc));
        sending_status = ViewUtil.a(context.getApplication(), hashmap);
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Contact contactForIdentity(String s)
    {
        Contact contact = (Contact)identityMap.get(s);
        Object obj = contact;
        if (contact == null)
        {
            obj = new ContactImpl();
            lib.getContact(s, ((Contact) (obj)));
            identityMap.put(s, obj);
        }
        return ((Contact) (obj));
    }

    private String getLovedByName(Message message, boolean flag)
    {
        String s = "";
        if (!flag) goto _L2; else goto _L1
_L1:
        message = context.getResources().getString(0x7f08034c);
_L4:
        return message;
_L2:
        int i = 0;
        do
        {
            Object obj;
label0:
            {
                obj = message.getAnnotations(com.skype.MessageAnnotation.TYPE.EMOTICON);
                MessageAnnotation messageannotation = annotationUtil.getAnnotationObj(((com.skype.Message.GetAnnotations_Result) (obj)), i);
                String s1 = messageannotation.getAuthorProp();
                obj = s;
                if (messageannotation.getKeyProp().contentEquals("heart"))
                {
                    ContactImpl contactimpl = new ContactImpl();
                    obj = s;
                    if (lib.getContact(s1, contactimpl))
                    {
                        obj = contactimpl.getFirstnameProp();
                    }
                }
                if (s1.equals(account.getSkypenameProp()))
                {
                    break label0;
                }
                message = s1;
                if (!TextUtils.isEmpty(((String) (obj)).trim()))
                {
                    return ((String) (obj));
                }
            }
            if (true)
            {
                continue;
            }
            i++;
            s = ((String) (obj));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean hasAuthorText(j j1, int i)
    {
        return !j1.isOutgoing() && getItem(i).isConference();
    }

    private boolean isHeader(MessageHolder messageholder, int i, MessageViewAdapter messageviewadapter)
    {
        MessageHolder messageholder1;
        if (i > 0)
        {
            messageholder1 = getItem(i - 1);
            MessageViewAdapter messageviewadapter1 = (MessageViewAdapter)messageTypeToAdapterMap.get(Integer.valueOf(getItemViewType(i - 1)));
            Object obj = messageviewadapter1;
            if (messageviewadapter1 == null)
            {
                obj = textMessageViewAdapter;
            }
            boolean flag1 = messageholder.getAuthorIdentity().equals(messageholder1.getAuthorIdentity());
            if (messageviewadapter.isStandalone(messageholder) || ((MessageViewAdapter) (obj)).isStandalone(messageholder1) || !flag1)
            {
                return true;
            }
        } else
        {
            return true;
        }
        long l2 = messageholder1.getTimestamp();
        long l4 = messageholder.getTimestamp();
        if (!TimeUtil.a(l2, l4))
        {
            return true;
        }
        messageviewadapter = messageholder1.getAuthorIdentity();
        String s = messageholder.getAuthorIdentity();
        int i1 = i;
        messageholder = messageviewadapter;
        do
        {
            if (!messageholder.equals(s) || i1 - 1 < 0)
            {
                break;
            }
            int j1 = i1 - 1;
            i1 = j1;
            if (j1 > 1)
            {
                messageholder = getItem(j1 - 1).getAuthorIdentity();
                i1 = j1;
            }
        } while (true);
        l2 = getItem(i1).getTimestamp();
        int l1 = i1 + 1;
        int k1 = i1;
        i1 = l1;
        while (i1 < i) 
        {
            l2 = getItem(k1).getTimestamp();
            long l3 = getItem(i1).getTimestamp();
            boolean flag;
            if (!TimeUtil.a(l2, l3))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                k1 = i1;
                l2 = l3;
            }
            i1++;
        }
        return !TimeUtil.a(l2, l4);
    }

    private boolean isHeartedByMe(Message message)
    {
        message = message.getOwnAnnotations(com.skype.MessageAnnotation.TYPE.EMOTICON);
        return annotationUtil.getOwnAnnotationIndex(message, "heart") >= 0;
    }

    private boolean isLocationSharingEnabled(LocationUtil locationutil, EcsConfiguration ecsconfiguration)
    {
        return locationutil.isLocationSharingEnabled(context, ecsconfiguration);
    }

    private boolean isMessageStatusIndicatorSupported(int i)
    {
        return messageStatusIndicatorSupports.contains(Integer.valueOf(i));
    }

    private void setMessageStateIndicator(j j1, MessageHolder messageholder, boolean flag)
    {
        Message message;
        if (j1.getMessageStatusView() != null)
        {
            if ((message = messageHolderUtil.getMessageObject(messageholder)) != null)
            {
                if (flag && isMessageStatusIndicatorSupported(messageholder.getTypeOrdinal()) && !TextUtils.isEmpty(message.getBodyXmlProp()))
                {
                    bindStatusIndicatorView(j1.getMessageStatusView(), message.getSendingStatusProp());
                    j1.getMessageStatusView().setVisibility(0);
                    return;
                } else
                {
                    j1.getMessageStatusView().setVisibility(8);
                    return;
                }
            }
        }
    }

    public int add(MessageHolder messageholder)
    {
        return add(messageholder, true);
    }

    public int add(MessageHolder messageholder, boolean flag)
    {
        return messageHolderItems.add(messageholder, flag);
    }

    public boolean contains(Message message)
    {
        return messageHolderItems.contains(message);
    }

    public void dispatchLastSortedListEvent()
    {
        messageHolderItems.dispatchLastEvent();
    }

    public Message findMessageById(int i)
    {
        return messageHolderItems.getMessageById(i);
    }

    public int getCurrentExpandedPosition()
    {
        return currentExpandedPosition;
    }

    public String getFormattedLovedByText(Message message, int i, boolean flag)
    {
        message = getLovedByName(message, flag);
        if (i == 1)
        {
            if (flag)
            {
                i = 0x7f080560;
            } else
            {
                i = 0x7f080561;
            }
            return context.getResources().getString(i, new Object[] {
                message
            });
        }
        Resources resources;
        int i1;
        if (flag)
        {
            i1 = 0x7f0b0008;
        } else
        {
            i1 = 0x7f0b0007;
        }
        resources = context.getResources();
        i--;
        return resources.getQuantityString(i1, i, new Object[] {
            message, Integer.valueOf(i)
        });
    }

    public MessageHolder getItem(int i)
    {
        return messageHolderItems.get(i);
    }

    public int getItemCount()
    {
        return messageHolderItems.size();
    }

    public int getItemViewType(int i)
    {
        return getItem(i).getTypeOrdinal();
    }

    public int getMessagePosition(int i)
    {
        MessageHolder messageholder = messageHolderItems.getMessageHolderById(i);
        if (messageholder == null)
        {
            return -1;
        } else
        {
            return messageHolderItems.getIndexOf(messageholder);
        }
    }

    public MessageViewAdapter getMessageViewAdapter(com.skype.Message.TYPE type)
    {
        return (MessageViewAdapter)messageTypeToAdapterMap.get(Integer.valueOf(type.toInt()));
    }

    public MessageViewAdapter getMojiMediaMessageViewAdapter(com.skype.Message.TYPE type)
    {
        return (MessageViewAdapter)messageTypeToAdapterMap.get(Integer.valueOf(type.toInt()));
    }

    public int getNewestMessageTimestamp()
    {
        return newestMessageTimestamp;
    }

    public int getPositionOfLastMessageFromMe()
    {
        if (positionOfLastMessageFromMe != -1 || checkedForCurrentMessages) goto _L2; else goto _L1
_L1:
        int i = messageHolderItems.size() - 1;
_L8:
        if (i < 0) goto _L4; else goto _L3
_L3:
        MessageHolder messageholder = messageHolderItems.get(i);
        if (!messageholder.getAuthorIdentity().equals(account.getSkypenameProp()) || !isMessageStatusIndicatorSupported(messageholder.getTypeOrdinal())) goto _L6; else goto _L5
_L5:
        positionOfLastMessageFromMe = i;
_L4:
        checkedForCurrentMessages = true;
_L2:
        return positionOfLastMessageFromMe;
_L6:
        i--;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean handleMessage(android.os.Message message)
    {
        if (message.what == 1)
        {
            notifyDataSetChanged();
        } else
        {
            if (message.what == 2)
            {
                context.setVolumeControlStream(0);
                return true;
            }
            if (message.what == 3)
            {
                context.setVolumeControlStream(2);
                return true;
            }
        }
        return true;
    }

    public void handleShowHideLovedByText(j j1, j j2, int i)
    {
        if (getCurrentExpandedPosition() == i)
        {
            if (j1.getLovedByText() != null)
            {
                j1.getLovedByText().setVisibility(8);
            }
        } else
        {
            if (j1.getLovedByText() != null)
            {
                setTextToLovedByTextView(j1, getItem(i));
            }
            if (j2 != null && j2.getLovedByText() != null)
            {
                j2.getLovedByText().setVisibility(8);
                return;
            }
        }
    }

    public void handleShowHideTimestamp(j j1, j j2, int i, int i1)
    {
        if (getCurrentExpandedPosition() == i1)
        {
            chatTimeStampAnimator.toggleTimestampView(j1, false, hasAuthorText(j1, i1));
            setCurrentExpandedPosition(-1);
            return;
        }
        chatTimeStampAnimator.toggleTimestampView(j1, true, hasAuthorText(j1, i1));
        if (j2 != null)
        {
            chatTimeStampAnimator.toggleTimestampView(j2, false, hasAuthorText(j2, i));
        }
        if (i != -1)
        {
            notifyItemChanged(i);
        }
        setCurrentExpandedPosition(i1);
    }

    public boolean hasNewerMessages(long l1)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                Object obj;
label1:
                {
                    boolean flag = flag1;
                    if (i < getItemCount())
                    {
                        obj = getItem(i);
                        if (!(obj instanceof SkypeMessageHolder))
                        {
                            break label1;
                        }
                        obj = (Message)((MessageHolder) (obj)).getMessageObject();
                        long l2 = ((Message) (obj)).getTimestampProp();
                        if (!com.skype.Message.TYPE.REQUESTED_AUTH.equals(((Message) (obj)).getTypeProp()) || (l2 & 0xffffffffL) < l1)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                if (obj instanceof SynthAuthReqMessageHolder)
                {
                    return true;
                }
            }
            i++;
        } while (true);
    }

    public boolean hasSynthAuthRequest()
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < getItemCount())
                {
                    if (!(getItem(i) instanceof SynthAuthReqMessageHolder))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public void hideLoadMoreHeaderIfShown()
    {
        while (isEmpty() || getItemViewType(0) != SyntheticTypes.HEADER.getType()) 
        {
            return;
        }
        remove(0);
    }

    public boolean isEmpty()
    {
        return messageHolderItems.size() == 0;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        onBindViewHolder((j)v, i);
    }

    public void onBindViewHolder(j j1, int i)
    {
        boolean flag1 = true;
        int i1 = getItemViewType(i);
        Object obj1 = (MessageViewAdapter)messageTypeToAdapterMap.get(Integer.valueOf(i1));
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = textMessageViewAdapter;
        }
        obj1 = getItem(i);
        boolean flag = isHeader(((MessageHolder) (obj1)), i, ((MessageViewAdapter) (obj)));
        Contact contact = contactForIdentity(((MessageHolder) (obj1)).getAuthorIdentity());
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1.setChained(flag);
        j1.setContact(contact);
        j1.setIsOutgoing(messageHolderUtil.isOutgoing(((MessageHolder) (obj1))));
        j1.setIsSystemMessage(MessageHolderUtil.isSystemMessage(((MessageHolder) (obj1))));
        if (currentExpandedPosition == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1.setIsChatItemExpanded(flag);
        if (ecsConfiguration.isMessageStatusIndicatorEnabled())
        {
            if (getPositionOfLastMessageFromMe() == i)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            setMessageStateIndicator(j1, ((MessageHolder) (obj1)), flag);
        }
        ((MessageViewAdapter) (obj)).bindViewHolder(j1, ((MessageHolder) (obj1)), messageHolderItems.getMessages());
        if (ecsConfiguration.isHeartMarkedEnabled())
        {
            bindLovedByTextView(j1, ((MessageHolder) (obj1)));
        }
    }

    public volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public j onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        MessageViewAdapter messageviewadapter = (MessageViewAdapter)messageTypeToAdapterMap.get(Integer.valueOf(i));
        if (messageviewadapter != null)
        {
            return messageviewadapter.createMessageViewHolder(viewgroup, i);
        } else
        {
            return textMessageViewAdapter.createMessageViewHolder(viewgroup, i);
        }
    }

    public volatile void onViewRecycled(android.support.v7.widget.RecyclerView.v v)
    {
        onViewRecycled((j)v);
    }

    public void onViewRecycled(j j1)
    {
        super.onViewRecycled(j1);
        j1.releaseResources();
    }

    public void remove(int i)
    {
        remove(i, true);
    }

    public void remove(int i, boolean flag)
    {
        if (i >= currentExpandedPosition) goto _L2; else goto _L1
_L1:
        updateExpandPosition(-1);
_L4:
        messageHolderItems.remove(i, flag);
        notifyItemRemoved(i);
        return;
_L2:
        if (i == currentExpandedPosition)
        {
            setCurrentExpandedPosition(-1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void removeSyntheticMessages()
    {
        messageHolderItems.removeSyntheticMessages();
    }

    public void setCurrentExpandedPosition(int i)
    {
        currentExpandedPosition = i;
    }

    public void setNewestMessageTimestamp(int i)
    {
        newestMessageTimestamp = i;
    }

    public void setPositionOfLastMessageFromMe(int i)
    {
        positionOfLastMessageFromMe = i;
    }

    public void setTextToLovedByTextView(j j1, MessageHolder messageholder)
    {
        j1 = j1.getLovedByText();
        if (j1 != null)
        {
            if ((messageholder = messageHolderUtil.getMessageObject(messageholder)) != null)
            {
                int i = annotationUtil.getAnnotationCount(messageholder, com.skype.MessageAnnotation.TYPE.EMOTICON, "heart");
                if (i > 0)
                {
                    j1.setText(getFormattedLovedByText(messageholder, i, isHeartedByMe(messageholder)));
                    if (i == 1)
                    {
                        j1.setTextColor(context.getResources().getColor(0x7f0f00bc));
                    } else
                    {
                        j1.setTextColor(context.getResources().getColor(0x7f0f00d3));
                    }
                    j1.setVisibility(0);
                    return;
                } else
                {
                    j1.setText("");
                    j1.setVisibility(8);
                    return;
                }
            }
        }
    }

    public void showLoadMoreHeader()
    {
        if (getItemViewType(0) != SyntheticTypes.HEADER.getType())
        {
            c c1 = new c(context, account);
            add(c1);
            if (messageHolderItems.getIndexOf(c1) <= currentExpandedPosition)
            {
                updateExpandPosition(1);
            }
            notifyDataSetChanged();
        }
    }

    public void updateExpandPosition(int i)
    {
        if (currentExpandedPosition != -1)
        {
            currentExpandedPosition = currentExpandedPosition + i;
        }
    }

    public void updateLastMessageFromMePosition(int i)
    {
        if (positionOfLastMessageFromMe != -1)
        {
            positionOfLastMessageFromMe = positionOfLastMessageFromMe + i;
        }
        checkedForCurrentMessages = false;
    }
}
