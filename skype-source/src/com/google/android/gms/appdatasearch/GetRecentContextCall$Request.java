// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GetRecentContextCall, f

public static class <init>
    implements SafeParcelable
{
    public static final class a
    {

        private Account a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;

        public final a a()
        {
            c = true;
            return this;
        }

        public final a a(String s)
        {
            e = s;
            return this;
        }

        public final GetRecentContextCall.Request b()
        {
            return new GetRecentContextCall.Request(a, b, c, d, e);
        }

        public a()
        {
        }
    }


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


    public a()
    {
        this(null, false, false, false, null);
    }

    <init>(int i, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        a = i;
        b = account;
        c = flag;
        d = flag1;
        e = flag2;
        f = s;
    }

    public f(Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        this(1, account, flag, flag1, flag2, s);
    }
}
