// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Link
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String href;

    public Link()
    {
    }

    public Link(Parcel parcel)
    {
        href = parcel.readString();
    }

    public Link(String s)
    {
        href = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Link))
            {
                return false;
            }
            obj = (Link)obj;
            if (href == null ? ((Link) (obj)).href != null : !href.equals(((Link) (obj)).href))
            {
                return false;
            }
        }
        return true;
    }

    public String getHref()
    {
        return href;
    }

    public int hashCode()
    {
        if (href != null)
        {
            return href.hashCode();
        } else
        {
            return 0;
        }
    }

    public void setHref(String s)
    {
        href = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(href);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Link createFromParcel(Parcel parcel)
        {
            return new Link(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Link[] newArray(int i)
        {
            return new Link[i];
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
