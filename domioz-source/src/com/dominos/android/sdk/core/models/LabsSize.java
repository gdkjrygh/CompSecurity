// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

public class LabsSize
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String Code;
    private String Description;
    private String Name;
    private String SortSeq;

    public LabsSize()
    {
        Code = "";
        Description = "";
        Name = "";
        SortSeq = "";
    }

    private LabsSize(Parcel parcel)
    {
        Code = "";
        Description = "";
        Name = "";
        SortSeq = "";
        setCode(parcel.readString());
        setDescription(parcel.readString());
        setName(parcel.readString());
        setSortSeq(parcel.readString());
    }

    LabsSize(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCode()
    {
        return Code;
    }

    public String getDescription()
    {
        return Description;
    }

    public String getName()
    {
        return Name;
    }

    public String getSortSeq()
    {
        return SortSeq;
    }

    public void setCode(String s)
    {
        Code = s;
    }

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setSortSeq(String s)
    {
        SortSeq = s;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getCode());
        parcel.writeString(getDescription());
        parcel.writeString(getName());
        parcel.writeString(getSortSeq());
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsSize createFromParcel(Parcel parcel)
        {
            return new LabsSize(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsSize[] newArray(int i)
        {
            return new LabsSize[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
