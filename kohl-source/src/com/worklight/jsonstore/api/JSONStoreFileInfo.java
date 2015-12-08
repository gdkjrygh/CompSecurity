// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;


public class JSONStoreFileInfo
{

    private boolean encrypted;
    private long fileSize;
    private String username;

    JSONStoreFileInfo(String s, long l, boolean flag)
    {
        username = s;
        fileSize = l;
        encrypted = flag;
    }

    public long getFileSizeBytes()
    {
        return fileSize;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean isEncrypted()
    {
        return encrypted;
    }
}
