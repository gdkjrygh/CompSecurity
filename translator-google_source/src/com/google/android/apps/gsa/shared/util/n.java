// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            VoiceCorrectionSpan

final class n
    implements android.os.Parcelable.Creator
{

    n()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new VoiceCorrectionSpan(parcel.createStringArray());
    }

    public final Object[] newArray(int i)
    {
        return new VoiceCorrectionSpan[i];
    }
}
