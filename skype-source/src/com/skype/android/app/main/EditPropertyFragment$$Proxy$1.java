// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.app.main:
//            EditPropertyFragment

final class this._cls0 extends ProxyEventListener
{

    final sage this$0;

    public final void onEvent(com.skype.android.gen.edMessage edmessage)
    {
        ((EditPropertyFragment)tTarget()).onEvent(edmessage);
    }

    public final volatile void onEvent(Object obj)
    {
        onEvent((com.skype.android.gen.edMessage)obj);
    }

    sage(Proxy proxy, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        this$0 = this._cls0.this;
        super(proxy, class1, lifecyclestate, eventthread);
    }
}
