// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.states.c;

import com.fitbit.synclair.config.bean.DeviceScreenBean;
import com.fitbit.synclair.ui.states.SynclairScreenState;

public abstract class b
{

    private SynclairScreenState a;
    private String b;

    public b(SynclairScreenState synclairscreenstate, String s)
    {
        a = synclairscreenstate;
        b = s;
    }

    public abstract DeviceScreenBean a();

    public SynclairScreenState b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }
}
