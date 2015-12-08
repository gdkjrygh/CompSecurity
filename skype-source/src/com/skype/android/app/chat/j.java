// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;

abstract class j extends android.support.v7.widget.RecyclerView.v
{

    private Contact contact;
    private ViewGroup heartContainer;
    private SymbolView heartIcon;
    private TextView heartMsgCount;
    private boolean isChained;
    private boolean isChatItemExpanded;
    private boolean isOutgoing;
    private boolean isSystemMessage;
    private TextView lovedByText;
    private TextView messageStatusText;
    private ViewGroup timestampContainer;
    private TextView timestampText;

    public j(View view)
    {
        super(view);
        timestampText = (TextView)view.findViewById(0x7f100287);
        messageStatusText = (TextView)view.findViewById(0x7f10028e);
        timestampContainer = (ViewGroup)view.findViewById(0x7f100285);
        isChained = false;
        heartIcon = (SymbolView)view.findViewById(0x7f10028b);
        heartMsgCount = (TextView)ViewUtil.a(view, 0x7f10028c);
        heartContainer = (ViewGroup)ViewUtil.a(view, 0x7f10028a);
        lovedByText = (TextView)view.findViewById(0x7f10028d);
    }

    public Contact getContact()
    {
        return contact;
    }

    public View getHeartContainer()
    {
        return heartContainer;
    }

    public SymbolView getHeartIcon()
    {
        return heartIcon;
    }

    public TextView getHeartMsgCount()
    {
        return heartMsgCount;
    }

    public TextView getLovedByText()
    {
        return lovedByText;
    }

    public TextView getMessageStatusView()
    {
        return messageStatusText;
    }

    public ViewGroup getTimestampContainer()
    {
        return timestampContainer;
    }

    public TextView getTimestampView()
    {
        return timestampText;
    }

    public boolean isChained()
    {
        return isChained;
    }

    public boolean isChatItemExpanded()
    {
        return isChatItemExpanded;
    }

    public boolean isOutgoing()
    {
        return isOutgoing;
    }

    public boolean isSystemMessage()
    {
        return isSystemMessage;
    }

    public void releaseResources()
    {
    }

    public void setChained(boolean flag)
    {
        isChained = flag;
    }

    public void setContact(Contact contact1)
    {
        contact = contact1;
    }

    public void setIsChatItemExpanded(boolean flag)
    {
        isChatItemExpanded = flag;
    }

    public void setIsOutgoing(boolean flag)
    {
        isOutgoing = flag;
    }

    public void setIsSystemMessage(boolean flag)
    {
        isSystemMessage = flag;
    }
}
