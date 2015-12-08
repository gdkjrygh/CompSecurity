// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.Arrays;

public final class cql extends coi
{

    public static final android.os.Parcelable.Creator CREATOR = new cqm();
    public final long f;
    public final boolean g;
    public final long h[];
    public final int i[];
    public final int j;
    private volatile int k;

    public cql()
    {
        this(-1L, -1, -1, -1, false, -1L);
    }

    public cql(long l, int i1, int j1, int k1, boolean flag, long l1)
    {
        this(l, i1, j1, k1, false, l1, new long[0], new int[0], 0);
    }

    public cql(long l, int i1, int j1, int k1, boolean flag, long l1, long al[], int ai[], int i2)
    {
        super(l, i1, j1, k1, coj.a);
        g = flag;
        f = l1;
        h = al;
        i = ai;
        j = i2;
    }

    public cql(Parcel parcel)
    {
        super(parcel);
        f = parcel.readLong();
        boolean flag;
        if (parcel.readByte() == 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        g = flag;
        h = parcel.createLongArray();
        i = parcel.createIntArray();
        j = parcel.readInt();
        k = parcel.readInt();
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof cql))
            {
                return false;
            }
            obj = (cql)obj;
            if (a != ((cql) (obj)).a || b != ((cql) (obj)).b || c != ((cql) (obj)).c || d != ((cql) (obj)).d || g != ((cql) (obj)).g || f != ((cql) (obj)).f || !Arrays.equals(h, ((cql) (obj)).h) || !Arrays.equals(i, ((cql) (obj)).i) || j != ((cql) (obj)).j)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (k != 0) goto _L2; else goto _L1
_L1:
        long al[];
        int ai[];
        int i1;
        int k1;
        int l1;
        int i2;
        long l2;
        long l3;
        boolean flag;
        k1 = a;
        l2 = b;
        l1 = c;
        i2 = d;
        flag = g;
        l3 = f;
        al = h;
        ai = i;
        i1 = j + 527;
        if (ai != null) goto _L4; else goto _L3
_L3:
        int l = i1 * 31 + 0;
_L8:
        if (al != null) goto _L6; else goto _L5
_L5:
        int j1 = 0 + l * 31;
_L11:
        k = b.a(l2, (b.a(flag, b.a(l3, j1)) * 31 + i2) * 31 + l1) * 31 + k1;
_L2:
        return k;
_L4:
        int j2;
        j1 = 0;
        j2 = ai.length;
_L9:
        l = i1;
        if (j1 >= j2) goto _L8; else goto _L7
_L7:
        i1 = i1 * 31 + ai[j1];
        j1++;
          goto _L9
          goto _L8
_L6:
        j2 = al.length;
        i1 = 0;
_L12:
        j1 = l;
        if (i1 >= j2) goto _L11; else goto _L10
_L10:
        l = b.a(al[i1], l);
        i1++;
          goto _L12
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        super.writeToParcel(parcel, l);
        parcel.writeLong(f);
        if (g)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeByte((byte)l);
        parcel.writeLongArray(h);
        parcel.writeIntArray(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
    }

}
