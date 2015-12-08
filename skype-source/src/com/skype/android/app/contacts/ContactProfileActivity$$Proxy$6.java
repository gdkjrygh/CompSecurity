// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileActivity

final class this._cls0 extends ProxyEventListener
{

    final onEvent this$0;

    public final void onEvent(com.skype.android.gen.hange hange)
    {
        ((ContactProfileActivity)tTarget()).onEvent(hange);
    }

    public final volatile void onEvent(Object obj)
    {
        onEvent((com.skype.android.gen.hange)obj);
    }

    (Proxy proxy, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        this$0 = this._cls0.this;
        super(proxy, class1, lifecyclestate, eventthread);
    }
}
