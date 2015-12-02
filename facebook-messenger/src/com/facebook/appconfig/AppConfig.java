// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.bundle.ImmutableBundle;
import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package com.facebook.appconfig:
//            a

public class AppConfig
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private static final Class a = com/facebook/appconfig/AppConfig;
    private final ImmutableBundle b;
    private final long c;

    public AppConfig(Parcel parcel)
    {
        b = (ImmutableBundle)parcel.readParcelable(com/facebook/common/bundle/ImmutableBundle.getClassLoader());
        c = parcel.readLong();
    }

    public AppConfig(JsonNode jsonnode, long l)
    {
        b = ImmutableBundle.a(jsonnode);
        c = l;
    }

    public ImmutableBundle a()
    {
        return b;
    }

    public long b()
    {
        return c;
    }

    public JsonNode c()
    {
        return b.a();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(b, i);
        parcel.writeLong(c);
    }

}
