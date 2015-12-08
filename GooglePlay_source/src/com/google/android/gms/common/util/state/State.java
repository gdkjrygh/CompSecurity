// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.state;

import android.os.Message;

// Referenced classes of package com.google.android.gms.common.util.state:
//            IState

public class State
    implements IState
{

    public State()
    {
    }

    public void enter()
    {
    }

    public void exit()
    {
    }

    public String getName()
    {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf('$') + 1);
    }

    public boolean processMessage(Message message)
    {
        return false;
    }
}
