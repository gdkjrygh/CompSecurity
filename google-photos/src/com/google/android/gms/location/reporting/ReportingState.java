// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.util.Log;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lid;

public class ReportingState
    implements SafeParcelable
{

    public static final lid CREATOR = new lid();
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final Integer h;

    public ReportingState(int i, int j, int k, boolean flag, boolean flag1, int l, int i1, 
            Integer integer)
    {
        a = i;
        b = j;
        c = k;
        d = flag;
        e = flag1;
        f = l;
        g = i1;
        h = integer;
    }

    public final boolean a()
    {
        return c.b(b) && c.b(c);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ReportingState)
        {
            if (b == ((ReportingState) (obj = (ReportingState)obj)).b && c == ((ReportingState) (obj)).c && d == ((ReportingState) (obj)).d && e == ((ReportingState) (obj)).e && f == ((ReportingState) (obj)).f && g == ((ReportingState) (obj)).g && c.b(h, ((ReportingState) (obj)).h))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), Boolean.valueOf(d), Boolean.valueOf(e), Integer.valueOf(f), Integer.valueOf(g), h
        });
    }

    public String toString()
    {
        Object obj;
        if (h != null)
        {
            obj = h;
            if (obj == null)
            {
                obj = "(null)";
            } else
            if (Log.isLoggable("GCoreUlr", 2))
            {
                obj = String.valueOf(obj);
            } else
            {
                obj = (new StringBuilder("tag#")).append(((Integer) (obj)).intValue() % 20).toString();
            }
        } else
        {
            obj = "(hidden-from-unauthorized-caller)";
        }
        return (new StringBuilder("ReportingState{mReportingEnabled=")).append(b).append(", mHistoryEnabled=").append(c).append(", mAllowed=").append(d).append(", mActive=").append(e).append(", mExpectedOptInResult=").append(f).append(", mExpectedOptInResultAssumingLocationEnabled=").append(g).append(", mVersionCode=").append(a).append(", mDeviceTag=").append(((String) (obj))).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lid.a(this, parcel);
    }

}
