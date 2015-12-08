// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.whatsnew;

import android.os.Parcel;

// Referenced classes of package com.fitbit.onboarding.whatsnew:
//            PanelContent

static final class 
    implements android.os.tor
{

    public PanelContent a(Parcel parcel)
    {
        return new PanelContent(parcel, null);
    }

    public PanelContent[] a(int i)
    {
        return new PanelContent[i];
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
