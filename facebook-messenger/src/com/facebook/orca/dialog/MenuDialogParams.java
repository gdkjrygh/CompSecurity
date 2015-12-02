// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.dialog:
//            i, MenuDialogItem, j

public class MenuDialogParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final int a;
    private final String b;
    private final es c;
    private final Parcelable d;

    private MenuDialogParams(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = es.a(parcel.readArrayList(com/facebook/orca/dialog/MenuDialogItem.getClassLoader()));
        d = parcel.readBundle().getParcelable("extra_data");
    }

    MenuDialogParams(Parcel parcel, i k)
    {
        this(parcel);
    }

    public MenuDialogParams(j j1)
    {
        boolean flag2 = true;
        super();
        a = j1.a();
        b = j1.b();
        c = es.a(j1.c());
        d = j1.d();
        boolean flag;
        boolean flag1;
        if (a == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag ^ flag1);
        if (c.isEmpty())
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public es c()
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

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeList(c);
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_data", d);
        parcel.writeBundle(bundle);
    }

}
