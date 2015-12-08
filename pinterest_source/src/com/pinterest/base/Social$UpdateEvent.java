// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;


public class _connected
{

    private boolean _connected;
    private _network _network;

    public _connected getNetwork()
    {
        return _network;
    }

    public boolean isConnected()
    {
        return _connected;
    }

    public void setNetwork(_connected _pconnected)
    {
        _network = _pconnected;
    }

    public ( )
    {
        this(, true);
    }

    public <init>(<init> <init>1, boolean flag)
    {
        _network = <init>1;
        _connected = flag;
    }
}
