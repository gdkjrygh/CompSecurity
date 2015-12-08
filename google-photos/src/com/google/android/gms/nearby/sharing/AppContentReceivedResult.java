// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lly;

public class AppContentReceivedResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lly();
    public final int a;
    public Uri b;
    public int c;

    private AppContentReceivedResult()
    {
        a = 1;
    }

    public AppContentReceivedResult(int i, Uri uri, int j)
    {
        a = i;
        b = uri;
        c = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AppContentReceivedResult))
            {
                return false;
            }
            obj = (AppContentReceivedResult)obj;
            if (!c.b(b, ((AppContentReceivedResult) (obj)).b) || !c.b(Integer.valueOf(c), Integer.valueOf(((AppContentReceivedResult) (obj)).c)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, Integer.valueOf(c)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lly.a(this, parcel, i);
    }

}
