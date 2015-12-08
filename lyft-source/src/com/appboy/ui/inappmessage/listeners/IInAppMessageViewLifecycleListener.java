// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.MessageButton;
import com.appboy.ui.inappmessage.InAppMessageCloser;

public interface IInAppMessageViewLifecycleListener
{

    public abstract void afterClosed(IInAppMessage iinappmessage);

    public abstract void afterOpened(View view, IInAppMessage iinappmessage);

    public abstract void beforeClosed(View view, IInAppMessage iinappmessage);

    public abstract void beforeOpened(View view, IInAppMessage iinappmessage);

    public abstract void onButtonClicked(InAppMessageCloser inappmessagecloser, MessageButton messagebutton, IInAppMessageImmersive iinappmessageimmersive);

    public abstract void onClicked(InAppMessageCloser inappmessagecloser, View view, IInAppMessage iinappmessage);

    public abstract void onDismissed(View view, IInAppMessage iinappmessage);
}
