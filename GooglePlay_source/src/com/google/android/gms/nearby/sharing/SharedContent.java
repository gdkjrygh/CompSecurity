// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            SharedContentCreator, LocalContent, ViewableItem

public class SharedContent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SharedContentCreator();
    LocalContent localContents[];
    String uri;
    final int versionCode;
    ViewableItem viewableItems[];

    private SharedContent()
    {
        versionCode = 2;
    }

    SharedContent(int i, String s, ViewableItem aviewableitem[], LocalContent alocalcontent[])
    {
        versionCode = i;
        uri = s;
        viewableItems = aviewableitem;
        localContents = alocalcontent;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof SharedContent))
            {
                return false;
            }
            obj = (SharedContent)obj;
            if (!Objects.equal(viewableItems, ((SharedContent) (obj)).viewableItems) || !Objects.equal(localContents, ((SharedContent) (obj)).localContents) || !Objects.equal(uri, ((SharedContent) (obj)).uri))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            viewableItems, localContents, uri
        });
    }

    public String toString()
    {
        return (new StringBuilder("SharedContent[viewableItems=")).append(Arrays.toString(viewableItems)).append(", localContents=").append(Arrays.toString(localContents)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SharedContentCreator.writeToParcel(this, parcel, i);
    }

}
