// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class nnt
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new nnu();
    public final String a;
    public final Long b;
    private final int c;

    private nnt(String s, Long long1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            boolean flag;
            if (s != null || long1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "mediaKey or assetId should be non-null");
            if (s != null)
            {
                flag = flag1;
                if (long1 != null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        p.a(flag, "mediaKey or assetId should be null");
        a = s;
        b = long1;
        c = c.a(s, c.a(long1, 17));
    }

    public static nnt a(long l)
    {
        return new nnt(null, Long.valueOf(l));
    }

    public static nnt a(String s)
    {
        return new nnt((String)p.b(s, "mediaKey"), null);
    }

    public static nnt a(pxx pxx1)
    {
        Object obj = null;
        boolean flag1 = true;
        String s;
        boolean flag;
        if (pxx1.b == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "burst ids should be null");
        if (pxx1.c == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "soundtrack id should be null");
        if (pxx1.a == null)
        {
            s = null;
        } else
        {
            s = pxx1.a.c;
        }
        if (pxx1.d == null)
        {
            pxx1 = obj;
        } else
        {
            pxx1 = pxx1.d.a;
        }
        return new nnt(s, pxx1);
    }

    public static nnt a(byte abyte0[])
    {
        return a((pxx)qlw.a(new pxx(), abyte0));
    }

    public final pxx a()
    {
        pxx pxx1 = new pxx();
        if (b != null)
        {
            pxx1.d = new pxy();
            pxx1.d.a = b;
            return pxx1;
        } else
        {
            pxx1.a = new pya();
            pxx1.a.c = a;
            return pxx1;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof nnt)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (nnt)obj;
            if (c.c(a, ((nnt) (obj)).a) && c.c(b, ((nnt) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return c;
    }

    public final String toString()
    {
        return c.a("CloudMediaId", new Object[] {
            a, b
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByteArray(qlw.a(a()));
    }

}
