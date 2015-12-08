// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hn, ho

public class hm
{
    public static class a
        implements SafeParcelable
    {

        public static final hn CREATOR = new hn();
        final int BR;
        public final Account Cj;

        public int describeContents()
        {
            hn hn1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            hn hn1 = CREATOR;
            hn.a(this, parcel, i);
        }


        public a()
        {
            this(null);
        }

        a(int i, Account account)
        {
            BR = i;
            Cj = account;
        }

        public a(Account account)
        {
            this(1, account);
        }
    }

    public static class b
        implements Result, SafeParcelable
    {

        public static final ho CREATOR = new ho();
        final int BR;
        public Status Ck;
        public List Cl;

        public int describeContents()
        {
            ho ho1 = CREATOR;
            return 0;
        }

        public Status getStatus()
        {
            return Ck;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ho ho1 = CREATOR;
            ho.a(this, parcel, i);
        }


        public b()
        {
            BR = 1;
        }

        b(int i, Status status, List list)
        {
            BR = i;
            Ck = status;
            Cl = list;
        }
    }

}
