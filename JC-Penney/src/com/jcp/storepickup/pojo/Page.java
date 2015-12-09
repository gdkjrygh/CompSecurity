// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.storepickup.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Page
    implements Parcelable
{

    private String number;
    private String selected;
    private String url;

    public Page()
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public String getNumber()
    {
        return number;
    }

    public String getSelected()
    {
        return selected;
    }

    public String getUrl()
    {
        return url;
    }

    public void setNumber(String s)
    {
        number = s;
    }

    public void setSelected(String s)
    {
        selected = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }
}
