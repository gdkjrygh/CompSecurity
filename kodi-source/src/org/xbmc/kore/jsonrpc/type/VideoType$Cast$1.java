// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import android.os.Parcel;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

static final class 
    implements android.os.r
{

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public createFromParcel createFromParcel(Parcel parcel)
    {
        return new nit>(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    public newArray[] newArray(int i)
    {
        return new newArray[i];
    }

    ()
    {
    }
}
