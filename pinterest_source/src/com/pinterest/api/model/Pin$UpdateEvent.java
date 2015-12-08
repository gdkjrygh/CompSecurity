// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


// Referenced classes of package com.pinterest.api.model:
//            Pin

public class _deleted
{

    protected boolean _deleted;
    protected Pin _pin;

    public Pin getPin()
    {
        return _pin;
    }

    public void setDeleted(boolean flag)
    {
        _deleted = flag;
    }

    public void setPin(Pin pin)
    {
        _pin = pin;
    }

    public boolean wasDeleted()
    {
        return _deleted;
    }

    public (Pin pin)
    {
        this(pin, false);
    }

    public <init>(Pin pin, boolean flag)
    {
        if (pin == null)
        {
            pin = new Pin();
        }
        _pin = pin;
        _deleted = flag;
    }
}
