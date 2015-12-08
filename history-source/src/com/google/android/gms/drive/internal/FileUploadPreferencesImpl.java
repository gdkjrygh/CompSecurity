// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ab

public final class FileUploadPreferencesImpl
    implements SafeParcelable, FileUploadPreferences
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    final int CK;
    int QA;
    boolean QB;
    int Qz;

    FileUploadPreferencesImpl(int i, int j, int k, boolean flag)
    {
        CK = i;
        Qz = j;
        QA = k;
        QB = flag;
    }

    public static boolean by(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    public static boolean bz(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 256: 
        case 257: 
            return true;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getBatteryUsagePreference()
    {
        if (!bz(QA))
        {
            return 0;
        } else
        {
            return QA;
        }
    }

    public int getNetworkTypePreference()
    {
        if (!by(Qz))
        {
            return 0;
        } else
        {
            return Qz;
        }
    }

    public boolean isRoamingAllowed()
    {
        return QB;
    }

    public void setBatteryUsagePreference(int i)
    {
        if (!bz(i))
        {
            throw new IllegalArgumentException("Invalid battery usage preference value.");
        } else
        {
            QA = i;
            return;
        }
    }

    public void setNetworkTypePreference(int i)
    {
        if (!by(i))
        {
            throw new IllegalArgumentException("Invalid data connection preference value.");
        } else
        {
            Qz = i;
            return;
        }
    }

    public void setRoamingAllowed(boolean flag)
    {
        QB = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ab.a(this, parcel, i);
    }

}
