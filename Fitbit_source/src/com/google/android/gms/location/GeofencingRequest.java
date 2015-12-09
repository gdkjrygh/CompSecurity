// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.nn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            n, g

public class GeofencingRequest
    implements SafeParcelable
{
    public static final class a
    {

        private final List a = new ArrayList();
        private int b;

        public static int b(int i)
        {
            return i & 7;
        }

        public a a(int i)
        {
            b = b(i);
            return this;
        }

        public a a(g g1)
        {
            am.a(g1, "geofence can't be null.");
            am.b(g1 instanceof nn, "Geofence must be created using Geofence.Builder.");
            a.add((nn)g1);
            return this;
        }

        public a a(List list)
        {
            if (list != null && !list.isEmpty())
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    g g1 = (g)list.next();
                    if (g1 != null)
                    {
                        a(g1);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest a()
        {
            boolean flag;
            if (!a.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.b(flag, "No geofence has been added to this request.");
            return new GeofencingRequest(a, b, null);
        }

        public a()
        {
            b = 5;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new n();
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    private final int d;
    private final List e;
    private final int f;

    GeofencingRequest(int i, List list, int j)
    {
        d = i;
        e = list;
        f = j;
    }

    private GeofencingRequest(List list, int i)
    {
        this(1, list, i);
    }

    GeofencingRequest(List list, int i, _cls1 _pcls1)
    {
        this(list, i);
    }

    public int a()
    {
        return d;
    }

    public List b()
    {
        return e;
    }

    public List c()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(e);
        return arraylist;
    }

    public int d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
