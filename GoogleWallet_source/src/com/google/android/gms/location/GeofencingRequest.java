// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.ph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            a, Geofence

public class GeofencingRequest
    implements SafeParcelable
{
    public static final class Builder
    {

        private final List atx = new ArrayList();
        private int aty;

        private Builder addGeofence(Geofence geofence)
        {
            kn.b(geofence, "geofence can't be null.");
            kn.b(geofence instanceof ph, "Geofence must be created using Geofence.Builder.");
            atx.add((ph)geofence);
            return this;
        }

        private static int hr(int i)
        {
            return i & 7;
        }

        public final Builder addGeofences(List list)
        {
            if (list != null && !list.isEmpty())
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    Geofence geofence = (Geofence)list.next();
                    if (geofence != null)
                    {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public final GeofencingRequest build()
        {
            boolean flag;
            if (!atx.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kn.b(flag, "No geofence has been added to this request.");
            return new GeofencingRequest(atx, aty);
        }

        public final Builder setInitialTrigger(int i)
        {
            aty = hr(i);
            return this;
        }

        public Builder()
        {
            aty = 5;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final List atx;
    private final int aty;
    private final int mVersionCode;

    GeofencingRequest(int i, List list, int j)
    {
        mVersionCode = i;
        atx = list;
        aty = j;
    }

    private GeofencingRequest(List list, int i)
    {
        this(1, list, i);
    }


    public int describeContents()
    {
        return 0;
    }

    public final int getInitialTrigger()
    {
        return aty;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final List oZ()
    {
        return atx;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
