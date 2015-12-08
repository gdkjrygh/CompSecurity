// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


public interface MessageHolder
{

    public abstract String getAuthorDisplayName();

    public abstract String getAuthorIdentity();

    public abstract String getConversationDisplayName();

    public abstract String getConversationIdentity();

    public abstract long getEditTimestamp();

    public abstract CharSequence getFormattableContent();

    public abstract String getMessageId();

    public abstract Object getMessageObject();

    public abstract String getTextContent();

    public abstract long getTimestamp();

    public abstract int getTypeOrdinal();

    public abstract boolean isConference();

    public abstract boolean isConsumed();

    public abstract boolean isDeleted();
}
