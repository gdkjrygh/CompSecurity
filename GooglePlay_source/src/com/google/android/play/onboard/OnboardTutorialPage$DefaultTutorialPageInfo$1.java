// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;


// Referenced classes of package com.google.android.play.onboard:
//            OnboardTutorialPage, OnboardHostControl

final class val.hostControl
    implements Runnable
{

    final val.hostControl this$0;
    final OnboardHostControl val$hostControl;

    public final void run()
    {
        val$hostControl.goToNextPage();
    }

    ()
    {
        this$0 = final_;
        val$hostControl = OnboardHostControl.this;
        super();
    }
}
