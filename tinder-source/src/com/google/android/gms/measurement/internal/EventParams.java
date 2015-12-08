// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            p

public class EventParams
    implements SafeParcelable, Iterable
{

    public static final p CREATOR = new p();
    public final int a;
    final Bundle b;

    EventParams(int i, Bundle bundle)
    {
        a = i;
        b = bundle;
    }

    EventParams(Bundle bundle)
    {
        u.a(bundle);
        b = bundle;
        a = 1;
    }

    static Bundle a(EventParams eventparams)
    {
        return eventparams.b;
    }

    public final Bundle a()
    {
        return new Bundle(b);
    }

    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            Iterator a;
            final EventParams b;

            public final boolean hasNext()
            {
                return a.hasNext();
            }

            public final volatile Object next()
            {
                return (String)a.next();
            }

            public final void remove()
            {
                throw new UnsupportedOperationException("Remove not supported");
            }

            
            {
                b = EventParams.this;
                super();
                a = EventParams.a(b).keySet().iterator();
            }
        };
    }

    public String toString()
    {
        return b.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel);
    }

}
