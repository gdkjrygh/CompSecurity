// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events;

import java.util.List;

// Referenced classes of package com.digby.mm.android.library.events:
//            IEvent

public interface IEventResponse
{

    public abstract IEvent getEvent();

    public abstract List getMessages();
}
