// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.states.c;

import com.fitbit.synclair.config.bean.DeviceScreenBean;
import com.fitbit.synclair.ui.states.SynclairScreenState;

// Referenced classes of package com.fitbit.synclair.ui.states.c:
//            b

public class a extends b
{

    private DeviceScreenBean a;

    public a(SynclairScreenState synclairscreenstate, DeviceScreenBean devicescreenbean, String s)
    {
        super(synclairscreenstate, s);
        a = devicescreenbean;
    }

    public DeviceScreenBean a()
    {
        return a;
    }
}
