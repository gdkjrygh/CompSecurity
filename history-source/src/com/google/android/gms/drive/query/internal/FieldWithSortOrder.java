// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            c

public class FieldWithSortOrder
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    final int CK;
    final String QY;
    final boolean Sk;

    FieldWithSortOrder(int i, String s, boolean flag)
    {
        CK = i;
        QY = s;
        Sk = flag;
    }

    public FieldWithSortOrder(String s, boolean flag)
    {
        this(1, s, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        String s1 = QY;
        String s;
        if (Sk)
        {
            s = "ASC";
        } else
        {
            s = "DESC";
        }
        return String.format(locale, "FieldWithSortOrder[%s %s]", new Object[] {
            s1, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
