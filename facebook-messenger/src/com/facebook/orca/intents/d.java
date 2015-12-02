// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.intents:
//            IntentHandlerService

class d
    implements h
{

    final int a;
    final IntentHandlerService b;

    d(IntentHandlerService intenthandlerservice, int i)
    {
        b = intenthandlerservice;
        a = i;
        super();
    }

    public void a(Boolean boolean1)
    {
        b.stopSelf(a);
    }

    public volatile void a(Object obj)
    {
        a((Boolean)obj);
    }

    public void a(Throwable throwable)
    {
        b.stopSelf(a);
    }
}
