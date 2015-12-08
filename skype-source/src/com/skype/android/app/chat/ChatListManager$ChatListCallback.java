// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.ObjectInterface;

// Referenced classes of package com.skype.android.app.chat:
//            ChatListManager

public static interface A
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
