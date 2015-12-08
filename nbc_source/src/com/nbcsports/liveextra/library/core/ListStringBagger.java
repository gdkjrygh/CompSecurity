// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.os.Parcel;
import com.hannesdorfmann.parcelableplease.ParcelBagger;
import java.util.ArrayList;
import java.util.List;

public class ListStringBagger
    implements ParcelBagger
{

    public ListStringBagger()
    {
    }

    public volatile Object read(Parcel parcel)
    {
        return read(parcel);
    }

    public List read(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readStringList(arraylist);
        return arraylist;
    }

    public volatile void write(Object obj, Parcel parcel, int i)
    {
        write((List)obj, parcel, i);
    }

    public void write(List list, Parcel parcel, int i)
    {
        parcel.writeStringList(list);
    }
}
