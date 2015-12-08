// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import com.tinder.managers.ManagerApp;

public class Session
{

    public String appVersion;
    public long openDateTime;

    public Session(long l, String s)
    {
        openDateTime = l;
        appVersion = s;
    }

    public static Session create()
    {
        return new Session(System.currentTimeMillis(), ManagerApp.d);
    }
}
