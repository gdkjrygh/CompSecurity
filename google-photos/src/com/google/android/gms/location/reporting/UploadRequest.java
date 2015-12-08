// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.util.Log;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lie;
import lif;

public class UploadRequest
    implements SafeParcelable
{

    public static final lif CREATOR = new lif();
    public final int a;
    public final Account b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;

    public UploadRequest(int i, Account account, String s, long l, long l1, 
            long l2, String s1)
    {
        a = i;
        b = account;
        c = s;
        d = l;
        e = l1;
        f = l2;
        g = s1;
    }

    public UploadRequest(lie lie1)
    {
        a = 1;
        b = lie1.a;
        c = lie1.b;
        d = lie1.c;
        e = lie1.d;
        f = lie1.e;
        g = null;
    }

    public static lie a(Account account, String s, long l)
    {
        return new lie(account, s, l);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UploadRequest))
            {
                return false;
            }
            obj = (UploadRequest)obj;
            if (!b.equals(((UploadRequest) (obj)).b) || !c.equals(((UploadRequest) (obj)).c) || !c.b(Long.valueOf(d), Long.valueOf(((UploadRequest) (obj)).d)) || e != ((UploadRequest) (obj)).e || f != ((UploadRequest) (obj)).f || !c.b(g, ((UploadRequest) (obj)).g))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, Long.valueOf(d), Long.valueOf(e), Long.valueOf(f), g
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("UploadRequest{mVersionCode=")).append(a).append(", mAccount=");
        Object obj = b;
        if (obj == null)
        {
            obj = "null";
        } else
        if (Log.isLoggable("GCoreUlr", 2))
        {
            obj = ((Account) (obj)).name;
        } else
        {
            obj = (new StringBuilder("account#")).append(((Account) (obj)).name.hashCode() % 20).append("#").toString();
        }
        return stringbuilder.append(((String) (obj))).append(", mReason='").append(c).append('\'').append(", mDurationMillis=").append(d).append(", mMovingLatencyMillis=").append(e).append(", mStationaryLatencyMillis=").append(f).append(", mAppSpecificKey='").append(g).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lif.a(this, parcel, i);
    }

}
