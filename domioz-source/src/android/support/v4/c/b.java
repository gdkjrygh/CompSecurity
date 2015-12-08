// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import android.os.Parcel;

// Referenced classes of package android.support.v4.c:
//            c

final class b
    implements android.os.Parcelable.Creator
{

    final c a;

    public b(c c1)
    {
        a = c1;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a.a(parcel, null);
    }

    public final Object[] newArray(int i)
    {
        return a.a(i);
    }
}
