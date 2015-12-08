// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.appboy.models.IInAppMessage;

public interface IInAppMessageViewFactory
{

    public abstract View createInAppMessageView(Activity activity, IInAppMessage iinappmessage);
}
