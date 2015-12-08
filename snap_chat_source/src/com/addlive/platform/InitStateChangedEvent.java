// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.platform;


// Referenced classes of package com.addlive.platform:
//            InitState

public class InitStateChangedEvent
{

    private int errCode;
    private String errMessage;
    private InitState state;

    public InitStateChangedEvent(int i, String s, InitState initstate)
    {
        errCode = i;
        errMessage = s;
        state = initstate;
    }

    public int getErrCode()
    {
        return errCode;
    }

    public String getErrMessage()
    {
        return errMessage;
    }

    public InitState getState()
    {
        return state;
    }
}
