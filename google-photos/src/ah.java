// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

final class ah
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ai();
    private int a[];
    private int b;
    private int c;
    private String d;
    private int e;
    private int f;
    private CharSequence g;
    private int h;
    private CharSequence i;
    private ArrayList j;
    private ArrayList k;

    public ah(ab ab1)
    {
        af af1 = ab1.a;
        int l;
        int i1;
        for (l = 0; af1 != null; l = i1)
        {
            i1 = l;
            if (af1.i != null)
            {
                i1 = l + af1.i.size();
            }
            af1 = af1.a;
        }

        a = new int[l + ab1.b * 7];
        if (!ab1.e)
        {
            throw new IllegalStateException("Not on back stack");
        }
        af1 = ab1.a;
        l = 0;
        while (af1 != null) 
        {
            int ai1[] = a;
            int j1 = l + 1;
            ai1[l] = af1.c;
            ai1 = a;
            int k1 = j1 + 1;
            if (af1.d != null)
            {
                l = af1.d.o;
            } else
            {
                l = -1;
            }
            ai1[j1] = l;
            ai1 = a;
            l = k1 + 1;
            ai1[k1] = af1.e;
            ai1 = a;
            j1 = l + 1;
            ai1[l] = af1.f;
            ai1 = a;
            l = j1 + 1;
            ai1[j1] = af1.g;
            ai1 = a;
            j1 = l + 1;
            ai1[l] = af1.h;
            if (af1.i != null)
            {
                int l1 = af1.i.size();
                int ai2[] = a;
                l = j1 + 1;
                ai2[j1] = l1;
                for (j1 = 0; j1 < l1;)
                {
                    a[l] = ((am)af1.i.get(j1)).o;
                    j1++;
                    l++;
                }

            } else
            {
                int ai3[] = a;
                l = j1 + 1;
                ai3[j1] = 0;
            }
            af1 = af1.a;
        }
        b = ab1.c;
        c = ab1.d;
        d = ab1.f;
        e = ab1.g;
        f = ab1.h;
        g = ab1.i;
        h = ab1.j;
        i = ab1.k;
        j = ab1.l;
        k = ab1.m;
    }

    public ah(Parcel parcel)
    {
        a = parcel.createIntArray();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readInt();
        f = parcel.readInt();
        g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        h = parcel.readInt();
        i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        j = parcel.createStringArrayList();
        k = parcel.createStringArrayList();
    }

    public final ab a(bb bb1)
    {
        ab ab1 = new ab(bb1);
        af af1;
label0:
        for (int i1 = 0; i1 < a.length; ab1.a(af1))
        {
            af1 = new af();
            int ai1[] = a;
            int j1 = i1 + 1;
            af1.c = ai1[i1];
            boolean flag = bb.a;
            ai1 = a;
            int l = j1 + 1;
            i1 = ai1[j1];
            int k1;
            if (i1 >= 0)
            {
                af1.d = (am)bb1.b.get(i1);
            } else
            {
                af1.d = null;
            }
            ai1 = a;
            i1 = l + 1;
            af1.e = ai1[l];
            ai1 = a;
            l = i1 + 1;
            af1.f = ai1[i1];
            ai1 = a;
            i1 = l + 1;
            af1.g = ai1[l];
            ai1 = a;
            j1 = i1 + 1;
            af1.h = ai1[i1];
            ai1 = a;
            l = j1 + 1;
            k1 = ai1[j1];
            i1 = l;
            if (k1 <= 0)
            {
                continue;
            }
            af1.i = new ArrayList(k1);
            j1 = 0;
            do
            {
                i1 = l;
                if (j1 >= k1)
                {
                    continue label0;
                }
                boolean flag1 = bb.a;
                am am1 = (am)bb1.b.get(a[l]);
                af1.i.add(am1);
                j1++;
                l++;
            } while (true);
        }

        ab1.c = b;
        ab1.d = c;
        ab1.f = d;
        ab1.g = e;
        ab1.e = true;
        ab1.h = f;
        ab1.i = g;
        ab1.j = h;
        ab1.k = i;
        ab1.l = j;
        ab1.m = k;
        ab1.b(1);
        return ab1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeIntArray(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
        TextUtils.writeToParcel(g, parcel, 0);
        parcel.writeInt(h);
        TextUtils.writeToParcel(i, parcel, 0);
        parcel.writeStringList(j);
        parcel.writeStringList(k);
    }

}
