// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//            c, b

public final class android.support.v4.os.a
{
    static final class a
        implements android.os.Parcelable.Creator
    {

        final b a;

        public final Object createFromParcel(Parcel parcel)
        {
            return a.a(parcel, null);
        }

        public final Object[] newArray(int i)
        {
            return a.a(i);
        }

        public a(b b1)
        {
            a = b1;
        }
    }


    public static android.os.Parcelable.Creator a(b b)
    {
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return new c(b);
        } else
        {
            return new a(b);
        }
    }
}
