// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            a

public class BleDevicesResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int BR;
    private final Status CM;
    private final List UU;

    BleDevicesResult(int i, List list, Status status)
    {
        BR = i;
        UU = Collections.unmodifiableList(list);
        CM = status;
    }

    public BleDevicesResult(List list, Status status)
    {
        BR = 3;
        UU = Collections.unmodifiableList(list);
        CM = status;
    }

    public static BleDevicesResult D(Status status)
    {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    private boolean b(BleDevicesResult bledevicesresult)
    {
        return CM.equals(bledevicesresult.CM) && n.equal(UU, bledevicesresult.UU);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof BleDevicesResult) && b((BleDevicesResult)obj);
    }

    public List getClaimedBleDevices()
    {
        return UU;
    }

    public List getClaimedBleDevices(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = UU.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BleDevice bledevice = (BleDevice)iterator.next();
            if (bledevice.getDataTypes().contains(datatype))
            {
                arraylist.add(bledevice);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    public Status getStatus()
    {
        return CM;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            CM, UU
        });
    }

    public String toString()
    {
        return n.h(this).a("status", CM).a("bleDevices", UU).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
