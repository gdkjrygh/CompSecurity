// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatViewMonitor
{
    public static interface OnChatScrollListener
    {

        public abstract void onScrollStarted(RecyclerView recyclerview);

        public abstract void onScrollStopped(RecyclerView recyclerview);
    }


    private List chatScrollListeners;
    private int previousScrollState;

    public ChatViewMonitor(RecyclerView recyclerview)
    {
        previousScrollState = 0;
        chatScrollListeners = new ArrayList();
        recyclerview.addOnScrollListener(new android.support.v7.widget.RecyclerView.m() {

            final ChatViewMonitor this$0;

            public final void onScrollStateChanged(RecyclerView recyclerview1, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    if (previousScrollState != 0)
                    {
                        for (Iterator iterator = chatScrollListeners.iterator(); iterator.hasNext(); ((OnChatScrollListener)iterator.next()).onScrollStopped(recyclerview1)) { }
                    }
                    previousScrollState = i;
                    return;

                case 1: // '\001'
                case 2: // '\002'
                    break;
                }
                if (previousScrollState == 0)
                {
                    for (Iterator iterator1 = chatScrollListeners.iterator(); iterator1.hasNext(); ((OnChatScrollListener)iterator1.next()).onScrollStarted(recyclerview1)) { }
                }
                previousScrollState = i;
            }

            
            {
                this$0 = ChatViewMonitor.this;
                super();
            }
        });
    }

    public void addOnChatScrollListener(OnChatScrollListener onchatscrolllistener)
    {
        chatScrollListeners.add(onchatscrolllistener);
    }

    public void removeOnChatScrollListener(OnChatScrollListener onchatscrolllistener)
    {
        chatScrollListeners.remove(onchatscrolllistener);
    }



/*
    static int access$002(ChatViewMonitor chatviewmonitor, int i)
    {
        chatviewmonitor.previousScrollState = i;
        return i;
    }

*/

}
