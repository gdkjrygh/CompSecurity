// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;


// Referenced classes of package com.pinterest.ui.megaphone:
//            MegaphoneEvent

public class BoardMegaphoneEvent extends MegaphoneEvent
{

    private EventType _type;

    public BoardMegaphoneEvent(EventType eventtype)
    {
        _type = eventtype;
    }

    public EventType getType()
    {
        return _type;
    }
}
