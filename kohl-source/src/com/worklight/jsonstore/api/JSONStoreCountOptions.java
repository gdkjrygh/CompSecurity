// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;


public class JSONStoreCountOptions
{

    private boolean includeDeleted;

    public JSONStoreCountOptions()
    {
        includeDeleted = false;
    }

    public void includeDeletedDocuments(boolean flag)
    {
        includeDeleted = flag;
    }

    public boolean shouldIncludeDeletedDocuments()
    {
        return includeDeleted;
    }
}
