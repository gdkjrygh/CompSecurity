// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            EventParamsCreator

public class EventParams
    implements SafeParcelable, Iterable
{

    public static final EventParamsCreator CREATOR = new EventParamsCreator();
    final Bundle bundle;
    public final int versionCode;

    EventParams(int i, Bundle bundle1)
    {
        versionCode = i;
        bundle = bundle1;
    }

    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            Iterator mBundleIterator;
            final EventParams this$0;

            public final boolean hasNext()
            {
                return mBundleIterator.hasNext();
            }

            public final volatile Object next()
            {
                return (String)mBundleIterator.next();
            }

            public final void remove()
            {
                throw new UnsupportedOperationException("Remove not supported");
            }

            
            {
                this$0 = EventParams.this;
                super();
                mBundleIterator = bundle.keySet().iterator();
            }
        };
    }

    public String toString()
    {
        return bundle.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        EventParamsCreator.writeToParcel$789d8329(this, parcel);
    }


}
