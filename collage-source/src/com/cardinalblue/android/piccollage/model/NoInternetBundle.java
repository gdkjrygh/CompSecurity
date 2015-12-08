// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            StickerBundle, n, InstallRequirement

public class NoInternetBundle extends StickerBundle
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public NoInternetBundle a(Parcel parcel)
        {
            return new NoInternetBundle(parcel);
        }

        public NoInternetBundle[] a(int l)
        {
            return new NoInternetBundle[l];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int l)
        {
            return a(l);
        }

    };

    public NoInternetBundle()
    {
    }

    public NoInternetBundle(Parcel parcel)
    {
    }

    public String a()
    {
        return "";
    }

    public String b()
    {
        return "";
    }

    public String c()
    {
        return "";
    }

    public float d()
    {
        return -1F;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return "";
    }

    public String f()
    {
        return "no_internet_bundle";
    }

    public boolean g()
    {
        return false;
    }

    public n h()
    {
        return null;
    }

    public boolean i()
    {
        return false;
    }

    public List j()
    {
        return m();
    }

    public InstallRequirement k()
    {
        return null;
    }

    public ArrayList m()
    {
        return null;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
    }

}
