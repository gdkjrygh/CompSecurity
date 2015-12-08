// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.states.d;

import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.synclair.ui.SynclairFragment;
import com.fitbit.synclair.ui.states.SynclairScreenState;

public abstract class b
{

    protected com.fitbit.synclair.ui.states.c.b b;

    public b(com.fitbit.synclair.ui.states.c.b b1)
    {
        b = b1;
    }

    public abstract SynclairFragment a();

    public SynclairScreenState a(SynclairActivity synclairactivity, Object obj)
    {
        return null;
    }

    public com.fitbit.synclair.ui.states.c.b b()
    {
        return b;
    }
}
