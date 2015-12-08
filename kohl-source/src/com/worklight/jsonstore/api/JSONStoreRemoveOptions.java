// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;


public class JSONStoreRemoveOptions
{

    private boolean markDirty;

    public JSONStoreRemoveOptions()
    {
        markDirty = false;
    }

    public boolean isMarkDirty()
    {
        return markDirty;
    }

    public void setMarkDirty(boolean flag)
    {
        markDirty = flag;
    }
}
