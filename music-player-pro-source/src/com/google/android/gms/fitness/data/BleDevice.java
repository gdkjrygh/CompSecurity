// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.ls;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            c

public class BleDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int CK;
    private final String TW;
    private final List TX;
    private final List TY;
    private final String mName;

    BleDevice(int i, String s, String s1, List list, List list1)
    {
        CK = i;
        TW = s;
        mName = s1;
        TX = Collections.unmodifiableList(list);
        TY = Collections.unmodifiableList(list1);
    }

    private boolean a(BleDevice bledevice)
    {
        return mName.equals(bledevice.mName) && TW.equals(bledevice.TW) && ls.a(bledevice.TX, TX) && ls.a(TY, bledevice.TY);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof BleDevice) && a((BleDevice)obj);
    }

    public String getAddress()
    {
        return TW;
    }

    public List getDataTypes()
    {
        return TY;
    }

    public String getName()
    {
        return mName;
    }

    public List getSupportedProfiles()
    {
        return TX;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            mName, TW, TX, TY
        });
    }

    public String toString()
    {
        return jv.h(this).a("name", mName).a("address", TW).a("dataTypes", TY).a("supportedProfiles", TX).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
