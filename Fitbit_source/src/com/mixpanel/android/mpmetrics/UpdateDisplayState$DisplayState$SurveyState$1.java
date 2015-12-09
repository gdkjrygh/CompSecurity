// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState

static final class 
    implements android.os.State.SurveyState._cls1
{

    public  a(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
        bundle.readFromParcel(parcel);
        return new nit>(bundle, null);
    }

    public nit>[] a(int i)
    {
        return new nit>[i];
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
