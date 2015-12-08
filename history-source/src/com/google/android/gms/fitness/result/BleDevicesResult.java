// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;
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
    private final int CK;
    private final Status Eb;
    private final List Wq;

    BleDevicesResult(int i, List list, Status status)
    {
        CK = i;
        Wq = Collections.unmodifiableList(list);
        Eb = status;
    }

    public BleDevicesResult(List list, Status status)
    {
        CK = 3;
        Wq = Collections.unmodifiableList(list);
        Eb = status;
    }

    public static BleDevicesResult C(Status status)
    {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    private boolean b(BleDevicesResult bledevicesresult)
    {
        return Eb.equals(bledevicesresult.Eb) && jv.equal(Wq, bledevicesresult.Wq);
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
        return Wq;
    }

    public List getClaimedBleDevices(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = Wq.iterator();
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
        return Eb;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Eb, Wq
        });
    }

    public String toString()
    {
        return jv.h(this).a("status", Eb).a("bleDevices", Wq).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
