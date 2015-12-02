// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;


public class ACRAResponse
{

    private int mStatus;

    public ACRAResponse()
    {
    }

    public int getStatusCode()
    {
        return mStatus;
    }

    public void setStatusCode(int i)
    {
        mStatus = i;
    }
}
