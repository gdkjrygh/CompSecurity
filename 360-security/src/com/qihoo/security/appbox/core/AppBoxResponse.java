// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import java.io.Serializable;
import java.util.ArrayList;

public class AppBoxResponse
    implements Serializable
{

    public static final int ERROR_CODE_20103 = 20103;
    public static final int ERROR_CODE_40101 = 40101;
    public static final int ERROR_CODE_40102 = 40102;
    public ArrayList appItems;
    public int end_state;
    public int errno;
    public ArrayList faceBookItems;
    public long lastRequestTime;
    public int total;
    public long updateTime;

    public AppBoxResponse()
    {
        errno = 0;
        end_state = 0;
        total = 0;
        updateTime = 0L;
        appItems = new ArrayList();
        faceBookItems = new ArrayList();
        lastRequestTime = 0L;
    }

    public String toString()
    {
        return (new StringBuilder()).append("errno = ").append(errno).append(" end_state = ").append(end_state).append(" total = ").append(total).append(" updateTime = ").append(updateTime).toString();
    }
}
