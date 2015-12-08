// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;


public interface RichPushMessageJavaScriptInterface
{

    public abstract String getDeviceModel();

    public abstract String getDeviceOrientation();

    public abstract String getMessageId();

    public abstract String getMessageSentDate();

    public abstract long getMessageSentDateMS();

    public abstract String getMessageTitle();

    public abstract String getUserId();

    public abstract int getViewHeight();

    public abstract int getViewWidth();

    public abstract boolean isMessageRead();

    public abstract void markMessageRead();

    public abstract void markMessageUnread();

    public abstract void navigateTo(String s);
}
