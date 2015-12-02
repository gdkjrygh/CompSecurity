// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tagging.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.tagging.model:
//            TagProfile

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public TagProfile a(Parcel parcel)
    {
        return new TagProfile(parcel);
    }

    public TagProfile[] a(int i)
    {
        return new TagProfile[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
