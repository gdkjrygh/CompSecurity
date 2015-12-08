// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState

final class _cls9
    implements android.os.pdateDisplayState._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState.getClassLoader());
        bundle.readFromParcel(parcel);
        return new UpdateDisplayState(bundle, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UpdateDisplayState[i];
    }

    _cls9()
    {
    }
}
