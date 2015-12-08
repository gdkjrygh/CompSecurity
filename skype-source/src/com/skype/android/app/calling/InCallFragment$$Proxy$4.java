// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.app.app2app.translator.OnUITranscribedMessage;
import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

final class this._cls0 extends ProxyEventListener
{

    final edMessage this$0;

    public final void onEvent(OnUITranscribedMessage onuitranscribedmessage)
    {
        ((InCallFragment)tTarget()).onEvent(onuitranscribedmessage);
    }

    public final volatile void onEvent(Object obj)
    {
        onEvent((OnUITranscribedMessage)obj);
    }

    edMessage(Proxy proxy, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        this$0 = this._cls0.this;
        super(proxy, class1, lifecyclestate, eventthread);
    }
}
