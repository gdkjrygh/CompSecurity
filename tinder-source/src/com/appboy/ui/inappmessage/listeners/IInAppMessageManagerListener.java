// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;
import com.appboy.ui.inappmessage.InAppMessageCloser;
import com.appboy.ui.inappmessage.InAppMessageOperation;

public interface IInAppMessageManagerListener
{

    public abstract InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iinappmessage);

    public abstract boolean onInAppMessageButtonClicked(MessageButton messagebutton, InAppMessageCloser inappmessagecloser);

    public abstract boolean onInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser);

    public abstract void onInAppMessageDismissed(IInAppMessage iinappmessage);

    public abstract boolean onInAppMessageReceived(IInAppMessage iinappmessage);
}
