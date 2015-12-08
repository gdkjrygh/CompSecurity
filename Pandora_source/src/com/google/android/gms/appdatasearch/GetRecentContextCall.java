// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzf, zzg

public class GetRecentContextCall
{
    public static class Request
        implements SafeParcelable
    {

        public static final zzf CREATOR = new zzf();
        public final Account zzJn;
        public final boolean zzJo;
        public final boolean zzJp;
        public final boolean zzJq;
        final int zzzH;

        public int describeContents()
        {
            zzf zzf1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzf zzf1 = CREATOR;
            zzf.zza(this, parcel, i);
        }


        public Request()
        {
            this(null, false, false, false);
        }

        Request(int i, Account account, boolean flag, boolean flag1, boolean flag2)
        {
            zzzH = i;
            zzJn = account;
            zzJo = flag;
            zzJp = flag1;
            zzJq = flag2;
        }

        public Request(Account account, boolean flag, boolean flag1, boolean flag2)
        {
            this(1, account, flag, flag1, flag2);
        }
    }

    public static class Response
        implements Result, SafeParcelable
    {

        public static final zzg CREATOR = new zzg();
        public Status zzJr;
        public List zzJs;
        public String zzJt[];
        final int zzzH;

        public int describeContents()
        {
            zzg zzg1 = CREATOR;
            return 0;
        }

        public Status getStatus()
        {
            return zzJr;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzg zzg1 = CREATOR;
            zzg.zza(this, parcel, i);
        }


        public Response()
        {
            zzzH = 1;
        }

        Response(int i, Status status, List list, String as[])
        {
            zzzH = i;
            zzJr = status;
            zzJs = list;
            zzJt = as;
        }
    }

}
