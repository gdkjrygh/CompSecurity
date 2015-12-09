// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp;


// Referenced classes of package com.netflix.mediaclient.event.nrdp:
//            BaseNrdpEvent

public class InitEvent extends BaseNrdpEvent
{

    public static final String TYPE = "init";

    public InitEvent()
    {
        super("init");
    }
}
