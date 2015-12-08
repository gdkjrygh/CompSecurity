// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.android.push.ChatPushMessage;
import com.skype.android.push.PushEventType;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAdapter, SkypeMessageHolder, SyntheticTypes, MessageHolder, 
//            ChatTypingIndicatorItemDecoration, ChatLinearLayoutManager, ChatStickyAvatarsItemDecoration, ChatTimedividerItemDecoration, 
//            PushMessageHolder

public class ChatListManager
    implements ChatLinearLayoutManager.OnLayoutChildrenListener
{
    public static interface ChatListCallback
    {

        public abstract void onConsumedHorizonChanged(int i);

        public abstract void onHeartClick(int i);

        public abstract void onHideMessageArea();

        public abstract void onItemClick(int i);

        public abstract void onItemLongClick(ObjectInterface objectinterface, int i, boolean flag, String s);

        public abstract void onLoadMoreMessages(int i);

        public abstract void onOtherLovedThisClick(int i);

        public abstract void onReloadMoreMessages(long l);
    }


    private MessageAdapter adapter;
    private ChatTypingIndicatorItemDecoration chatTypingIndicatorItemDecoration;
    private ContactUtil contactUtil;
    private Context context;
    private ConversationUtil conversationUtil;
    private int downX;
    private int downY;
    private Message lastHeartedMessage;
    private SkyLib lib;
    private RecyclerView listView;
    private ChatListCallback listener;
    private boolean loadedFromMessageRequest;
    private boolean loadedFromScroll;
    private int longPressTimeout;
    private boolean noMoreMessagesToLoad;
    private int scrollPosition;
    private TimeAnomalyTelemetry timeAnomalyTelemetry;
    private TimeUtil timeUtil;
    private ChatTimedividerItemDecoration timedividerItemDecoration;
    private int touchSlop;

    public ChatListManager(Context context1, ConversationUtil conversationutil, ContactUtil contactutil, TimeUtil timeutil, SkyLib skylib, TimeAnomalyTelemetry timeanomalytelemetry)
    {
        downX = -1;
        downY = -1;
        scrollPosition = -1;
        context = context1;
        conversationUtil = conversationutil;
        contactUtil = contactutil;
        timeUtil = timeutil;
        lib = skylib;
        timeAnomalyTelemetry = timeanomalytelemetry;
        touchSlop = ViewConfiguration.get(context1).getScaledTouchSlop();
        longPressTimeout = ViewConfiguration.getLongPressTimeout();
    }

    private int fillAdapterAndGetScrollPosition(Conversation conversation, List list)
    {
        int j = 0;
        for (int i = 0; i < list.size();)
        {
            Object obj = (Message)list.get(i);
            int k = j;
            if (!adapter.contains(((Message) (obj))))
            {
                obj = new SkypeMessageHolder(conversation, ((Message) (obj)), conversationUtil);
                adapter.add(((MessageHolder) (obj)), false);
                k = j;
                if (!((SkypeMessageHolder) (obj)).isConsumed())
                {
                    k = j + 1;
                }
            }
            i++;
            j = k;
        }

        return j;
    }

    private int getScrollPositionOffset(int i)
    {
        if (i > 0)
        {
            scrollPosition = adapter.getItemCount() - i;
            return context.getResources().getDimensionPixelSize(0x7f0c0184);
        } else
        {
            scrollPosition = adapter.getItemCount() - 1;
            return 0;
        }
    }

    private void loadMoreMessages()
    {
        int j;
label0:
        {
            if (!adapter.isEmpty())
            {
                adapter.showLoadMoreHeader();
                listView.getLayoutManager().smoothScrollToPosition(listView, null, 0);
                j = 0;
                for (int i = 1; i < adapter.getItemCount() && j == 0; i++)
                {
                    MessageHolder messageholder = adapter.getItem(i);
                    if (!SyntheticTypes.isSynthetic(messageholder))
                    {
                        j = (int)messageholder.getTimestamp();
                    }
                }

                if (j != 0)
                {
                    break label0;
                }
                adapter.hideLoadMoreHeaderIfShown();
            }
            return;
        }
        listener.onLoadMoreMessages(j);
    }

    private void scrollToPosition(int i)
    {
        if (scrollPosition < 0)
        {
            return;
        } else
        {
            ((LinearLayoutManager)listView.getLayoutManager()).scrollToPositionWithOffset(scrollPosition, i);
            scrollPosition = -1;
            return;
        }
    }

    private void updateConsumptionStatusIfChanged(int i)
    {
        MessageHolder messageholder = adapter.getItem(i);
        if (!SyntheticTypes.isSynthetic(messageholder.getTypeOrdinal()))
        {
            listener.onConsumedHorizonChanged((int)messageholder.getTimestamp());
        }
    }

    void addParticipantTypingIndicator(Participant participant)
    {
        chatTypingIndicatorItemDecoration.addParticipantTypingIndicator(participant);
    }

    public int computeScrollPosition()
    {
        int i;
        if (scrollPosition > 0)
        {
            i = scrollPosition;
        } else
        {
            int j = adapter.getItemCount() - 1;
            ChatLinearLayoutManager chatlinearlayoutmanager = (ChatLinearLayoutManager)listView.getLayoutManager();
            i = j;
            if (chatlinearlayoutmanager.findLastVisibleMessage() != j)
            {
                return chatlinearlayoutmanager.findFirstVisibleMessage();
            }
        }
        return i;
    }

    public void configureListView(RecyclerView recyclerview, MessageAdapter messageadapter)
    {
        listView = recyclerview;
        listView.setHasFixedSize(true);
        recyclerview = new ChatLinearLayoutManager(context);
        recyclerview.setStackFromEnd(true);
        recyclerview.setOnLayoutChildrenListener(this);
        listView.setLayoutManager(recyclerview);
        listView.setItemAnimator(null);
        adapter = messageadapter;
        listView.setAdapter(adapter);
        listView.addItemDecoration(new ChatStickyAvatarsItemDecoration(listView, contactUtil));
        timedividerItemDecoration = new ChatTimedividerItemDecoration(listView, timeUtil, lib, timeAnomalyTelemetry);
        listView.addItemDecoration(timedividerItemDecoration);
        chatTypingIndicatorItemDecoration = new ChatTypingIndicatorItemDecoration(listView, conversationUtil, contactUtil);
        listView.addItemDecoration(chatTypingIndicatorItemDecoration);
        listView.addOnScrollListener(new android.support.v7.widget.RecyclerView.m() {

            final ChatListManager this$0;

            public final void onScrollStateChanged(RecyclerView recyclerview1, int i)
            {
                super.onScrollStateChanged(recyclerview1, i);
                i;
                JVM INSTR tableswitch 0 0: default 24
            //                           0 25;
                   goto _L1 _L2
_L1:
                return;
_L2:
                if (((LinearLayoutManager)recyclerview1.getLayoutManager()).findFirstVisibleItemPosition() == 0 && !noMoreMessagesToLoad && !loadedFromScroll)
                {
                    loadedFromScroll = true;
                    loadMoreMessages();
                    return;
                }
                i = ((ChatLinearLayoutManager)recyclerview1.getLayoutManager()).findLastVisibleMessage();
                if (i != -1 && i < adapter.getItemCount())
                {
                    updateConsumptionStatusIfChanged(i);
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = ChatListManager.this;
                super();
            }
        });
        listView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final ChatListManager this$0;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 28
            //                           0 30
            //                           1 58;
                   goto _L1 _L2 _L3
_L1:
                return false;
_L2:
                downX = (int)motionevent.getX();
                downY = (int)motionevent.getY();
                return false;
_L3:
                if (motionevent.getEventTime() - motionevent.getDownTime() < (long)longPressTimeout)
                {
                    int i = (int)motionevent.getX();
                    int j = downX;
                    int k = (int)motionevent.getY();
                    int l = downY;
                    if (Math.abs(i - j) <= touchSlop && Math.abs(k - l) <= touchSlop)
                    {
                        listener.onHideMessageArea();
                    }
                    downX = -1;
                    downY = -1;
                    return false;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                this$0 = ChatListManager.this;
                super();
            }
        });
    }

    public void displayMessageList(Conversation conversation, List list)
    {
        int i;
        boolean flag;
        int j;
        int k;
        adapter.hideLoadMoreHeaderIfShown();
        i = adapter.getItemCount();
        j = fillAdapterAndGetScrollPosition(conversation, list);
        adapter.dispatchLastSortedListEvent();
        adapter.notifyDataSetChanged();
        k = adapter.getItemCount() - i;
        boolean flag1;
        if (k == 0 && loadedFromScroll)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        noMoreMessagesToLoad = flag1;
        flag = false;
        i = 0;
        if (!loadedFromScroll) goto _L2; else goto _L1
_L1:
        conversation = listView.getLayoutManager().findViewByPosition(2);
        if (conversation != null)
        {
            scrollPosition = k + 1;
            i = conversation.getTop();
        } else
        {
            scrollPosition = -1;
        }
        adapter.updateExpandPosition(k);
        adapter.updateLastMessageFromMePosition(k);
        loadedFromScroll = false;
_L4:
        scrollToPosition(i);
        return;
_L2:
        if (loadedFromMessageRequest)
        {
            adapter.updateExpandPosition(k);
            adapter.updateLastMessageFromMePosition(k);
            i = getScrollPositionOffset(j);
            loadedFromMessageRequest = false;
        } else
        {
            i = ((flag) ? 1 : 0);
            if (scrollPosition < 0)
            {
                i = getScrollPositionOffset(j);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void handleAccessbilityForInCallChat(Conversation conversation)
    {
        RecyclerView recyclerview = listView;
        byte byte0;
        if (ConversationUtil.t(conversation))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        recyclerview.setVisibility(byte0);
    }

    public void onChatPaused()
    {
        setScrollPosition(computeScrollPosition());
    }

    public void onChatResumed()
    {
        timedividerItemDecoration.clearCache();
    }

    public void onLayoutChildrenCompleted(ChatLinearLayoutManager chatlinearlayoutmanager)
    {
        int i = chatlinearlayoutmanager.findLastVisibleMessage();
        if (i != -1)
        {
            updateConsumptionStatusIfChanged(i);
        }
    }

    public void onNewSkypeMessage(SkypeMessageHolder skypemessageholder, boolean flag)
    {
        while (skypemessageholder == null || adapter.isEmpty() || !flag && skypemessageholder.getTypeOrdinal() != com.skype.Message.TYPE.ENDED_LIVESESSION.toInt() && skypemessageholder.getTypeOrdinal() != com.skype.Message.TYPE.STARTED_LIVESESSION.toInt() && ((ChatLinearLayoutManager)listView.getLayoutManager()).findLastVisibleItemPosition() != adapter.getItemCount() - 2) 
        {
            return;
        }
        setScrollPosition(adapter.getItemCount() - 1);
        chatTypingIndicatorItemDecoration.onNewMessage();
    }

    void removeParticipantTypingIndicator(Participant participant)
    {
        chatTypingIndicatorItemDecoration.removeParticipantTypingIndicator(participant);
    }

    public void requestFocus()
    {
        listView.requestFocus();
    }

    public void scrollToLastHeartedMessage()
    {
label0:
        {
            if (lastHeartedMessage != null)
            {
                if (adapter.getMessagePosition(lastHeartedMessage.getObjectID()) != -1)
                {
                    break label0;
                }
                if (!adapter.isEmpty())
                {
                    loadedFromMessageRequest = true;
                    adapter.showLoadMoreHeader();
                    listener.onReloadMoreMessages((long)lastHeartedMessage.getTimestampProp() & 0xffffffffL);
                }
            }
            return;
        }
        scrollToMessage(lastHeartedMessage.getObjectID());
    }

    public void scrollToMessage(int i)
    {
        i = adapter.getMessagePosition(i);
        if (i != -1)
        {
            scrollPosition = i;
            scrollToPosition(context.getResources().getDimensionPixelSize(0x7f0c0184));
        }
    }

    public void scrollToPosition()
    {
        scrollToPosition(0);
    }

    public void setChatListCallback(ChatListCallback chatlistcallback)
    {
        listener = chatlistcallback;
    }

    public void setLastHeartedMessage(Message message)
    {
        lastHeartedMessage = message;
    }

    public void setScrollPosition(int i)
    {
        scrollPosition = i;
    }

    public boolean showHeartInAppNotification(Message message)
    {
        int i = ((ChatLinearLayoutManager)listView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        return adapter.getMessagePosition(message.getObjectID()) < i;
    }

    public void updateAdapter(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            ChatPushMessage chatpushmessage = (ChatPushMessage)list.get(i);
            if (chatpushmessage.getEventType() != PushEventType.MEDIA_MESSAGE_SHARING && chatpushmessage.getEventType() != PushEventType.VIDEO_SHARING && !chatpushmessage.isConsumed())
            {
                adapter.add(new PushMessageHolder(chatpushmessage), false);
                chatpushmessage.setConsumed(true);
            }
        }

        adapter.dispatchLastSortedListEvent();
        adapter.notifyDataSetChanged();
    }




/*
    static boolean access$102(ChatListManager chatlistmanager, boolean flag)
    {
        chatlistmanager.loadedFromScroll = flag;
        return flag;
    }

*/






/*
    static int access$502(ChatListManager chatlistmanager, int i)
    {
        chatlistmanager.downX = i;
        return i;
    }

*/



/*
    static int access$602(ChatListManager chatlistmanager, int i)
    {
        chatlistmanager.downY = i;
        return i;
    }

*/



}
