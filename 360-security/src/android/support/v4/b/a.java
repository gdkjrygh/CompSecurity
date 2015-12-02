// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import android.os.Parcel;

// Referenced classes of package android.support.v4.b:
//            d, b

public class android.support.v4.b.a
{
    static class a
        implements android.os.Parcelable.Creator
    {

        final b a;

        public Object createFromParcel(Parcel parcel)
        {
            return a.a(parcel, null);
        }

        public Object[] newArray(int i)
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
            d.a(b);
        }
        return new a(b);
    }
}
