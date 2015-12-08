// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.if;
import com.google.android.gms.internal.ih;
import com.google.android.gms.internal.ii;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            f, g, a

public class GetRecentContextCall
{
    public static class Request
        implements SafeParcelable
    {

        public static final f CREATOR = new f();
        final int a;
        public final Account b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final String f;

        public int describeContents()
        {
            f f1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            f f1 = CREATOR;
            com.google.android.gms.appdatasearch.f.a(this, parcel, i);
        }


        public Request()
        {
            this(null, false, false, false, null);
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

        public Request(Account account, boolean flag, boolean flag1, boolean flag2, String s)
        {
            this(1, account, flag, flag1, flag2, s);
        }
    }

    public static final class Request.a
    {

        private Account a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;

        public Request.a a(String s)
        {
            e = s;
            return this;
        }

        public Request.a a(boolean flag)
        {
            c = flag;
            return this;
        }

        public Request a()
        {
            return new Request(a, b, c, d, e);
        }

        public Request.a()
        {
        }
    }

    public static class Response
        implements g, SafeParcelable
    {

        public static final com.google.android.gms.appdatasearch.g CREATOR = new com.google.android.gms.appdatasearch.g();
        public Status a;
        public List b;
        public String c[];
        final int d;

        public Status a()
        {
            return a;
        }

        public int describeContents()
        {
            com.google.android.gms.appdatasearch.g g1 = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            com.google.android.gms.appdatasearch.g g1 = CREATOR;
            g.a(this, parcel, i);
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

    public static class a extends com.google.android.gms.common.api.k.a
    {

        private final Request b;

        protected Response a(Status status)
        {
            Response response = new Response();
            response.a = status;
            return response;
        }

        protected volatile void a(com.google.android.gms.common.api.a.c c)
            throws RemoteException
        {
            a((ii)c);
        }

        protected void a(ii ii1)
            throws RemoteException
        {
            ii1.a().a(b, new ih(this, this) {

                final a a;

                public void a(Response response)
                {
                    b.a(response);
                }

            
            {
                a = a1;
                super(b);
            }
            });
        }

        protected g b(Status status)
        {
            return a(status);
        }

        public a(Request request, c c)
        {
            super(com.google.android.gms.appdatasearch.a.a, c);
            b = request;
        }
    }

}
