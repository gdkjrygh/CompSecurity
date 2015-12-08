// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;


// Referenced classes of package com.google.android.play.onboard:
//            OnboardBaseFragment

final class val.runnable
    implements Runnable
{

    final OnboardBaseFragment this$0;
    final Runnable val$runnable;

    public final void run()
    {
        if (isAdded())
        {
            val$runnable.run();
        }
    }

    ()
    {
        this$0 = final_onboardbasefragment;
        val$runnable = Runnable.this;
        super();
    }
}
