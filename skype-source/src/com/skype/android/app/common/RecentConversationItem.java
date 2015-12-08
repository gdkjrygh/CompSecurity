// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;


public class RecentConversationItem
{

    private int conversationObjectId;
    private String displayName;
    private String identity;
    private int lastMessageObjectId;
    private CharSequence lastMessageText;
    private int unreadCount;

    public RecentConversationItem(int i, String s, String s1, int j, int k)
    {
        conversationObjectId = i;
        identity = s;
        displayName = s1;
        lastMessageObjectId = j;
        unreadCount = k;
    }

    public int getConversationObjectId()
    {
        return conversationObjectId;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getIdentity()
    {
        return identity;
    }

    public int getLastMessageObjectId()
    {
        return lastMessageObjectId;
    }

    public CharSequence getLastMessageText()
    {
        return lastMessageText;
    }

    public int getUnreadCount()
    {
        return unreadCount;
    }

    public void setLastMessageText(CharSequence charsequence)
    {
        lastMessageText = charsequence;
    }
}
