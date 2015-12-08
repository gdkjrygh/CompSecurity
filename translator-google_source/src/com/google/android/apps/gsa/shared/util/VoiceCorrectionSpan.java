// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.p;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            n

public final class VoiceCorrectionSpan
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    private final String a[];
    private final String b;

    public VoiceCorrectionSpan(String as[])
    {
        this(as, "");
    }

    private VoiceCorrectionSpan(String as[], String s)
    {
        a = (String[])p.a(as);
        b = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof VoiceCorrectionSpan)
        {
            obj = (VoiceCorrectionSpan)obj;
            return Arrays.equals(a, ((VoiceCorrectionSpan) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }

    public final String toString()
    {
        String s = String.valueOf(Arrays.toString(a));
        return (new StringBuilder(String.valueOf(s).length() + 21)).append("VoiceCorrectionSpan[").append(s).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringArray(a);
    }

}
