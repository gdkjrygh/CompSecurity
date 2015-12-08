// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;


public class WearConversationMessageItem
{

    private String author;
    private final CharSequence messageText;

    public WearConversationMessageItem(CharSequence charsequence)
    {
        messageText = charsequence;
    }

    public String getAuthor()
    {
        return author;
    }

    public CharSequence getMessageText()
    {
        return messageText;
    }

    public void setAuthor(String s)
    {
        author = s;
    }
}
