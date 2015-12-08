// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Subscription;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ag

public class af
    implements SafeParcelable
{
    public static class a
    {

        private Subscription US;
        private boolean UT;

        static Subscription a(a a1)
        {
            return a1.US;
        }

        static boolean b(a a1)
        {
            return a1.UT;
        }

        public a b(Subscription subscription)
        {
            US = subscription;
            return this;
        }

        public af jF()
        {
            boolean flag;
            if (US != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must call setSubscription()");
            return new af(this);
        }

        public a()
        {
            UT = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ag();
    private final int BR;
    private final Subscription US;
    private final boolean UT;

    af(int i, Subscription subscription, boolean flag)
    {
        BR = i;
        US = subscription;
        UT = flag;
    }

    private af(a a1)
    {
        BR = 1;
        US = a.a(a1);
        UT = a.b(a1);
    }


    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return BR;
    }

    public Subscription jD()
    {
        return US;
    }

    public boolean jE()
    {
        return UT;
    }

    public String toString()
    {
        return n.h(this).a("subscription", US).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ag.a(this, parcel, i);
    }

}
