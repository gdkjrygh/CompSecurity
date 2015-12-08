// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import llz;

public class LocalContent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new llz();
    public final int a;
    public int b;
    public String c;

    private LocalContent()
    {
        a = 1;
    }

    public LocalContent(int i, int j, String s)
    {
        a = i;
        b = j;
        c = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof LocalContent))
            {
                return false;
            }
            obj = (LocalContent)obj;
            if (!c.b(Integer.valueOf(b), Integer.valueOf(((LocalContent) (obj)).b)) || !c.b(c, ((LocalContent) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), c
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("LocalContent[contentUri=")).append(c).append(", type=");
        String s;
        if (b == 1)
        {
            s = "PUBLIC_CONTENT";
        } else
        {
            s = "APP_CONTENT";
        }
        return stringbuilder.append(s).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        llz.a(this, parcel);
    }

}
