// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            LocalContentCreator

public class LocalContent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LocalContentCreator();
    String contentUri;
    int type;
    final int versionCode;

    private LocalContent()
    {
        versionCode = 1;
    }

    LocalContent(int i, int j, String s)
    {
        versionCode = i;
        type = j;
        contentUri = s;
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
            if (!Objects.equal(Integer.valueOf(type), Integer.valueOf(((LocalContent) (obj)).type)) || !Objects.equal(contentUri, ((LocalContent) (obj)).contentUri))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(type), contentUri
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("LocalContent[contentUri=")).append(contentUri).append(", type=");
        String s;
        if (type == 1)
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
        LocalContentCreator.writeToParcel$462a4253(this, parcel);
    }

}
