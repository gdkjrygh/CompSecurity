// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.animation.Animation;
import com.appboy.models.IInAppMessage;

public interface IInAppMessageAnimationFactory
{

    public abstract Animation getClosingAnimation(IInAppMessage iinappmessage);

    public abstract Animation getOpeningAnimation(IInAppMessage iinappmessage);
}
