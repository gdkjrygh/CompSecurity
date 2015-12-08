// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
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
    private final int CK;
    private final Status Eb;
    private final List Wu;

    ListSubscriptionsResult(int i, List list, Status status)
    {
        CK = i;
        Wu = list;
        Eb = status;
    }

    public ListSubscriptionsResult(List list, Status status)
    {
        CK = 3;
        Wu = Collections.unmodifiableList(list);
        Eb = (Status)jx.b(status, "status");
    }

    public static ListSubscriptionsResult F(Status status)
    {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    private boolean b(ListSubscriptionsResult listsubscriptionsresult)
    {
        return Eb.equals(listsubscriptionsresult.Eb) && jv.equal(Wu, listsubscriptionsresult.Wu);
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
        return Eb;
    }

    public List getSubscriptions()
    {
        return Wu;
    }

    public List getSubscriptions(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = Wu.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Subscription subscription = (Subscription)iterator.next();
            if (datatype.equals(subscription.jJ()))
            {
                arraylist.add(subscription);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Eb, Wu
        });
    }

    public String toString()
    {
        return jv.h(this).a("status", Eb).a("subscriptions", Wu).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
