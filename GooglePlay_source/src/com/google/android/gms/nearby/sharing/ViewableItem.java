// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            ViewableItemCreator

public class ViewableItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ViewableItemCreator();
    String uris[];
    final int versionCode;

    private ViewableItem()
    {
        versionCode = 1;
    }

    ViewableItem(int i, String as[])
    {
        versionCode = i;
        uris = as;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ViewableItem))
        {
            return false;
        } else
        {
            obj = (ViewableItem)obj;
            return Objects.equal(uris, ((ViewableItem) (obj)).uris);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            uris
        });
    }

    public String toString()
    {
        return (new StringBuilder("ViewableItem[uris=")).append(Arrays.toString(uris)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ViewableItemCreator.writeToParcel$474834d1(this, parcel);
    }

}
