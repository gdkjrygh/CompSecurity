// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            e, f

public final class GetRecentContextCall
{
    public static class Request
        implements SafeParcelable
    {

        public static final e CREATOR = new e();
        final int a;
        public final Account b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final String f;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            com.google.android.gms.appdatasearch.e.a(this, parcel, i);
        }


        public Request()
        {
            this((byte)0);
        }

        private Request(byte byte0)
        {
            this(1, null, false, false, false, null);
        }

        Request(int i, Account account, boolean flag, boolean flag1, boolean flag2, String s)
        {
            a = i;
            b = account;
            c = flag;
            d = flag1;
            e = flag2;
            f = s;
        }
    }

    public static class Response
        implements f, SafeParcelable
    {

        public static final com.google.android.gms.appdatasearch.f CREATOR = new com.google.android.gms.appdatasearch.f();
        public Status a;
        public List b;
        public String c[];
        final int d;

        public final Status a()
        {
            return a;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            f.a(this, parcel, i);
        }


        public Response()
        {
            d = 1;
        }

        Response(int i, Status status, List list, String as[])
        {
            d = i;
            a = status;
            b = list;
            c = as;
        }
    }

}
