// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lkh;
import lld;

public class Strategy
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lld();
    private static Strategy h;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public Strategy(int i, int j, int k, int l, boolean flag, int i1, int j1)
    {
        a = i;
        b = j;
        if (j == 0)
        {
            g = j1;
            break MISSING_BLOCK_LABEL_24;
        } else
        {
            switch (j)
            {
            default:
                g = 3;
                break;

            case 2: // '\002'
                g = 1;
                break;

            case 3: // '\003'
                g = 2;
                break;
            }
            continue;
        }
        do
        {
            d = l;
            e = flag;
            if (flag)
            {
                f = 2;
                c = 0x7fffffff;
                return;
            }
            if (i1 == 0)
            {
                f = 1;
                c = k;
                return;
            }
            f = i1;
            c = k;
            break;
        } while (true);
        return;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Strategy))
            {
                return false;
            }
            obj = (Strategy)obj;
            if (a != ((Strategy) (obj)).a || g != ((Strategy) (obj)).g || c != ((Strategy) (obj)).c || d != ((Strategy) (obj)).d || f != ((Strategy) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (((a * 31 + g) * 31 + c) * 31 + d) * 31 + f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lld.a(this, parcel);
    }

    static 
    {
        (new lkh()).a();
        lkh lkh1 = new lkh();
        lkh1.b = 2;
        b.a(true, "ttlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[] {
            Integer.valueOf(0x7fffffff), Integer.valueOf(0x15180)
        });
        lkh1.a = 0x7fffffff;
        h = lkh1.a();
    }
}
