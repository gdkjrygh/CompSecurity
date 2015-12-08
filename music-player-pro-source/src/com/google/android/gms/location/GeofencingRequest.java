// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.nn;
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

        private final List ago = new ArrayList();
        private int agp;

        public static int ew(int i)
        {
            return i & 7;
        }

        public Builder addGeofence(Geofence geofence)
        {
            jx.b(geofence, "geofence can't be null.");
            jx.b(geofence instanceof nn, "Geofence must be created using Geofence.Builder.");
            ago.add((nn)geofence);
            return this;
        }

        public Builder addGeofences(List list)
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

        public GeofencingRequest build()
        {
            boolean flag;
            if (!ago.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "No geofence has been added to this request.");
            return new GeofencingRequest(ago, agp);
        }

        public Builder setInitialTrigger(int i)
        {
            agp = ew(i);
            return this;
        }

        public Builder()
        {
            agp = 5;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final int CK;
    private final List ago;
    private final int agp;

    GeofencingRequest(int i, List list, int j)
    {
        CK = i;
        ago = list;
        agp = j;
    }

    private GeofencingRequest(List list, int i)
    {
        this(1, list, i);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getGeofences()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(ago);
        return arraylist;
    }

    public int getInitialTrigger()
    {
        return agp;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public List ng()
    {
        return ago;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
