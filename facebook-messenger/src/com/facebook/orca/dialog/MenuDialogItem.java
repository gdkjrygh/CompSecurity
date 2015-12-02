// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.dialog:
//            f

public class MenuDialogItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final int a;
    private final int b;
    private final String c;
    private final Parcelable d;

    public MenuDialogItem(int i, int j, Parcelable parcelable)
    {
        this(i, j, null, parcelable);
    }

    private MenuDialogItem(int i, int j, String s, Parcelable parcelable)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (j == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s != null)
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1 ^ flag);
        a = i;
        b = j;
        c = s;
        d = parcelable;
    }

    private MenuDialogItem(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readString();
        d = parcel.readParcelable(ClassLoader.getSystemClassLoader());
    }

    MenuDialogItem(Parcel parcel, f f1)
    {
        this(parcel);
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public CharSequence c()
    {
        return c;
    }

    public Parcelable d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeParcelable(d, 0);
    }

}
