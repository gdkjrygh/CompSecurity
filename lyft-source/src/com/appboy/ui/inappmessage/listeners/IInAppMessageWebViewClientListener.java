// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.os.Bundle;
import com.appboy.models.IInAppMessage;

public interface IInAppMessageWebViewClientListener
{

    public abstract void onCloseAction(IInAppMessage iinappmessage, String s, Bundle bundle);

    public abstract void onNewsfeedAction(IInAppMessage iinappmessage, String s, Bundle bundle);

    public abstract void onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle);
}
