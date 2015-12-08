// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import android.os.Parcel;

public class ListSummary
{

    private int length;

    protected ListSummary(int i)
    {
        length = i;
    }

    protected ListSummary(Parcel parcel)
    {
        length = parcel.readInt();
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int i)
    {
        length = i;
    }

    protected void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(length);
    }
}
