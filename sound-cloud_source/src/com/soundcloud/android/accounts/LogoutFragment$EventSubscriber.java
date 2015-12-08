// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.app.Activity;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.accounts:
//            LogoutFragment, AccountOperations

private final class <init> extends DefaultSubscriber
{

    final LogoutFragment this$0;

    public final void onNext(CurrentUserChangedEvent currentuserchangedevent)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (currentuserchangedevent.getKind() == 1 && fragmentactivity != null && !fragmentactivity.isFinishing())
        {
            accountOperations.triggerLoginFlow(fragmentactivity);
            fragmentactivity.finish();
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((CurrentUserChangedEvent)obj);
    }

    private ()
    {
        this$0 = LogoutFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
