// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.event;

import com.pinterest.base.Events;
import java.util.Set;

public class InviteSendEvent extends Events
{

    private boolean _completed;
    private Set _inviteList;

    public InviteSendEvent(boolean flag, Set set)
    {
        setCompleted(flag);
        _inviteList = set;
    }

    public Set getInviteList()
    {
        return _inviteList;
    }

    public boolean isCompleted()
    {
        return _completed;
    }

    public void setCompleted(boolean flag)
    {
        _completed = flag;
    }
}
