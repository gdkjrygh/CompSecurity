// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            e

public class ListSubscriptionsResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final int BR;
    private final Status CM;
    private final List UY;

    ListSubscriptionsResult(int i, List list, Status status)
    {
        BR = i;
        UY = list;
        CM = status;
    }

    public ListSubscriptionsResult(List list, Status status)
    {
        BR = 3;
        UY = Collections.unmodifiableList(list);
        CM = (Status)o.b(status, "status");
    }

    public static ListSubscriptionsResult G(Status status)
    {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    private boolean b(ListSubscriptionsResult listsubscriptionsresult)
    {
        return CM.equals(listsubscriptionsresult.CM) && n.equal(UY, listsubscriptionsresult.UY);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof ListSubscriptionsResult) && b((ListSubscriptionsResult)obj);
    }

    public Status getStatus()
    {
        return CM;
    }

    public List getSubscriptions()
    {
        return UY;
    }

    public List getSubscriptions(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = UY.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Subscription subscription = (Subscription)iterator.next();
            if (datatype.equals(subscription.iY()))
            {
                arraylist.add(subscription);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            CM, UY
        });
    }

    public String toString()
    {
        return n.h(this).a("status", CM).a("subscriptions", UY).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
