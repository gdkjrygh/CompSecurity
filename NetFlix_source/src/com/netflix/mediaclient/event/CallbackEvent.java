// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event;


// Referenced classes of package com.netflix.mediaclient.event:
//            UIEvent

public interface CallbackEvent
    extends UIEvent
{

    public abstract int getCallerId();

    public abstract boolean isFailed();
}
