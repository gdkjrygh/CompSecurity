// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;

// Referenced classes of package android.support.v4.app:
//            BackStackState

final class g
    implements android.os.Parcelable.Creator
{

    g()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new BackStackState(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new BackStackState[i];
    }
}
