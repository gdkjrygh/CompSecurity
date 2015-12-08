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
//            hm, hn

public class hl
{
    public static class a
        implements SafeParcelable
    {

        public static final hm CREATOR = new hm();
        final int CK;
        public final Account Dc;

        public int describeContents()
        {
            hm hm1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            hm hm1 = CREATOR;
            hm.a(this, parcel, i);
        }


        public a()
        {
            this(null);
        }

        a(int i, Account account)
        {
            CK = i;
            Dc = account;
        }

        public a(Account account)
        {
            this(1, account);
        }
    }

    public static class b
        implements Result, SafeParcelable
    {

        public static final hn CREATOR = new hn();
        final int CK;
        public Status Dd;
        public List De;

        public int describeContents()
        {
            hn hn1 = CREATOR;
            return 0;
        }

        public Status getStatus()
        {
            return Dd;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            hn hn1 = CREATOR;
            hn.a(this, parcel, i);
        }


        public b()
        {
            CK = 1;
        }

        b(int i, Status status, List list)
        {
            CK = i;
            Dd = status;
            De = list;
        }
    }

}
