// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            k

public final class GestureRequest
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    private static final List a = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), 
        Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18), Integer.valueOf(19)
    }));
    private static final List b = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(1)
    }));
    private static final List c = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(12), Integer.valueOf(14), Integer.valueOf(16), Integer.valueOf(18), Integer.valueOf(19)
    }));
    private static final List d = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9), Integer.valueOf(11), Integer.valueOf(13), Integer.valueOf(15), Integer.valueOf(17)
    }));
    private final int e;
    private final List f;

    GestureRequest(int i, List list)
    {
        e = i;
        f = list;
    }

    public final int a()
    {
        return e;
    }

    public final List b()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel);
    }

}
