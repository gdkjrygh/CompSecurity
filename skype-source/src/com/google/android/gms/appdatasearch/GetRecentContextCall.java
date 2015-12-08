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
import com.google.android.gms.internal.hv;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.hy;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            f, g, a

public final class GetRecentContextCall
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
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
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

        public final Request.a a()
        {
            c = true;
            return this;
        }

        public final Request.a a(String s)
        {
            e = s;
            return this;
        }

        public final Request b()
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

        public int describeContents()
        {
            return 0;
        }

        public Status getStatus()
        {
            return a;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
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

    public static final class a extends com.google.android.gms.common.api.k.a
    {

        private final Request b;

        protected final g a(Status status)
        {
            Response response = new Response();
            response.a = status;
            return response;
        }

        protected final void a(com.google.android.gms.common.api.a.b b1)
            throws RemoteException
        {
            ((hv)((hy)b1).n()).a(b, new hx(this, this) {

                final a a;

                public final void a(Response response)
                {
                    b.a(response);
                }

            
            {
                a = a1;
                super(b);
            }
            });
        }

        public a(Request request, c c)
        {
            super(com.google.android.gms.appdatasearch.a.a, c);
            b = request;
        }
    }

}
