// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import java.util.List;

// Referenced classes of package com.pinterest.base:
//            Social

public class _permissions
{

    public boolean _forExtraRequest;
    private boolean _forSignup;
    private _permissions _network;
    private List _permissions;

    public _permissions getNetwork()
    {
        return _network;
    }

    public List getPermissions()
    {
        return _permissions;
    }

    public boolean isForSignup()
    {
        return _forSignup;
    }

    public void setForSignup(boolean flag)
    {
        _forSignup = flag;
    }

    public void setNetwork(_forSignup _pforsignup)
    {
        _network = _pforsignup;
    }

    public void setPermissions(List list)
    {
        _permissions = list;
    }

    public ( )
    {
        this(, false);
    }

    public <init>(<init> <init>1, List list)
    {
        _forExtraRequest = false;
        _network = <init>1;
        _permissions = list;
    }

    public _permissions(_permissions _ppermissions, boolean flag)
    {
        _forExtraRequest = false;
        _network = _ppermissions;
        _forSignup = flag;
        _permissions = Social.FB_READ_PERMISSIONS;
    }
}
