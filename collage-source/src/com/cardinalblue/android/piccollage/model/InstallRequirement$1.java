// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            InstallRequirement

static final class 
    implements android.os.age.model.InstallRequirement._cls1
{

    public InstallRequirement a(Parcel parcel)
    {
        return new InstallRequirement(parcel, null);
    }

    public InstallRequirement[] a(int i)
    {
        return new InstallRequirement[i];
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
