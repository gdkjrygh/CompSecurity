// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.engine:
//            AdPluginInfo

class 
    implements android.os.tor
{

    public AdPluginInfo a(Parcel parcel)
    {
        return new AdPluginInfo(parcel);
    }

    public AdPluginInfo[] a(int i)
    {
        return new AdPluginInfo[i];
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
