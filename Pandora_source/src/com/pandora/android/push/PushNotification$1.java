// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.push;

import android.os.Parcel;

// Referenced classes of package com.pandora.android.push:
//            PushNotification

static final class 
    implements android.os.otification._cls1
{

    public PushNotification a(Parcel parcel)
    {
        return new PushNotification(parcel);
    }

    public PushNotification[] a(int i)
    {
        return new PushNotification[i];
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
