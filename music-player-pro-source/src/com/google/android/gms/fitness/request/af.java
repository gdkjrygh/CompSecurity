// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ag

public class af
    implements SafeParcelable
{
    public static class a
    {

        private Subscription Wo;
        private boolean Wp;

        static Subscription a(a a1)
        {
            return a1.Wo;
        }

        static boolean b(a a1)
        {
            return a1.Wp;
        }

        public a b(Subscription subscription)
        {
            Wo = subscription;
            return this;
        }

        public af kp()
        {
            boolean flag;
            if (Wo != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must call setSubscription()");
            return new af(this);
        }

        public a()
        {
            Wp = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ag();
    private final int CK;
    private final Subscription Wo;
    private final boolean Wp;

    af(int i, Subscription subscription, boolean flag)
    {
        CK = i;
        Wo = subscription;
        Wp = flag;
    }

    private af(a a1)
    {
        CK = 1;
        Wo = a.a(a1);
        Wp = a.b(a1);
    }


    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return CK;
    }

    public Subscription kn()
    {
        return Wo;
    }

    public boolean ko()
    {
        return Wp;
    }

    public String toString()
    {
        return jv.h(this).a("subscription", Wo).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ag.a(this, parcel, i);
    }

}
