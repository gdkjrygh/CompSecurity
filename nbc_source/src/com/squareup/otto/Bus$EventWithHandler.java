// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;


// Referenced classes of package com.squareup.otto:
//            Bus, EventHandler

static class handler
{

    final Object event;
    final EventHandler handler;

    public (Object obj, EventHandler eventhandler)
    {
        event = obj;
        handler = eventhandler;
    }
}
