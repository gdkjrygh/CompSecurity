// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;

// Referenced classes of package com.pandora.radio.data:
//            SearchDescriptor

static final class 
    implements android.os.escriptor._cls1
{

    public SearchDescriptor a(Parcel parcel)
    {
        return new SearchDescriptor(parcel);
    }

    public SearchDescriptor[] a(int i)
    {
        return new SearchDescriptor[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
