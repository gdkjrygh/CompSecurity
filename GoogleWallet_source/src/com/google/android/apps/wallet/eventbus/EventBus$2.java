// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;


// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            EventBus, HandlerRegistration, RegistrationCallback

final class stration
    implements Runnable
{

    final EventBus this$0;
    final RegistrationCallback val$callback;
    final HandlerRegistration val$handlerRegistration;

    public final void run()
    {
        val$callback.handleRegistration(val$handlerRegistration.getEventId());
    }

    stration()
    {
        this$0 = final_eventbus;
        val$callback = registrationcallback;
        val$handlerRegistration = HandlerRegistration.this;
        super();
    }
}
