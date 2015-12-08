// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import java.util.List;

public interface MessageNotificationRenderer
{

    public abstract void clearAllMessages();

    public abstract void clearMessage(int i);

    public abstract void displayMessages(List list);
}
