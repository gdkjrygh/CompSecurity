// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.event;

import com.pinterest.base.Events;
import java.util.HashSet;
import java.util.Set;

public class InviteFriendEvent extends Events
{

    private Set _inviteList;
    private String _message;
    private int _noOfInviteSent;

    public InviteFriendEvent(String s)
    {
        _inviteList = new HashSet();
        _inviteList.add(s);
    }

    public InviteFriendEvent(Set set)
    {
        setInviteList(set);
    }

    public Set getInviteList()
    {
        return _inviteList;
    }

    public String getMessage()
    {
        return _message;
    }

    public int getNoOfInviteSent()
    {
        return _noOfInviteSent;
    }

    public void setInviteList(Set set)
    {
        _inviteList = set;
    }

    public void setMessage(String s)
    {
        _message = s;
    }

    public void setNoOfInviteSent(int i)
    {
        _noOfInviteSent = i;
    }
}
