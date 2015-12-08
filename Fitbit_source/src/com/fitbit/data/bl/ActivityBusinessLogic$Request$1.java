// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.os.Parcel;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic

static final class 
    implements android.os.quest._cls1
{

    public  a(Parcel parcel)
    {
        int i = parcel.readInt();
        int j = parcel.readInt();
        boolean flag = parcel.createBooleanArray()[0];
        Date date = new Date(parcel.readLong());
        return new nit>((nit>)parcel.readParcelable(getClass().getClassLoader()), date, j, i, flag);
    }

    public nit>[] a(int i)
    {
        return new nit>[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
