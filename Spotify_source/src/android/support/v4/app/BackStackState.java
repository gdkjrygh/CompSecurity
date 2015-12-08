// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import ac;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import o;
import p;

// Referenced classes of package android.support.v4.app:
//            Fragment

public final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public final volatile Object[] newArray(int l)
        {
            return new BackStackState[l];
        }

    };
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

    public BackStackState(Parcel parcel)
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

    public BackStackState(o o1)
    {
        p p1 = o1.a;
        int l;
        int i1;
        for (l = 0; p1 != null; l = i1)
        {
            i1 = l;
            if (p1.i != null)
            {
                i1 = l + p1.i.size();
            }
            p1 = p1.a;
        }

        a = new int[l + o1.b * 7];
        if (!o1.e)
        {
            throw new IllegalStateException("Not on back stack");
        }
        p1 = o1.a;
        l = 0;
        while (p1 != null) 
        {
            int ai[] = a;
            int j1 = l + 1;
            ai[l] = p1.c;
            ai = a;
            int k1 = j1 + 1;
            if (p1.d != null)
            {
                l = p1.d.i;
            } else
            {
                l = -1;
            }
            ai[j1] = l;
            ai = a;
            l = k1 + 1;
            ai[k1] = p1.e;
            ai = a;
            j1 = l + 1;
            ai[l] = p1.f;
            ai = a;
            l = j1 + 1;
            ai[j1] = p1.g;
            ai = a;
            j1 = l + 1;
            ai[l] = p1.h;
            if (p1.i != null)
            {
                int l1 = p1.i.size();
                int ai1[] = a;
                l = j1 + 1;
                ai1[j1] = l1;
                for (j1 = 0; j1 < l1;)
                {
                    a[l] = ((Fragment)p1.i.get(j1)).i;
                    j1++;
                    l++;
                }

            } else
            {
                int ai2[] = a;
                l = j1 + 1;
                ai2[j1] = 0;
            }
            p1 = p1.a;
        }
        b = o1.c;
        c = o1.d;
        d = o1.f;
        e = o1.g;
        f = o1.h;
        g = o1.i;
        h = o1.j;
        i = o1.k;
        j = o1.l;
        k = o1.m;
    }

    public final o a(ac ac1)
    {
        o o1 = new o(ac1);
        p p1;
label0:
        for (int i1 = 0; i1 < a.length; o1.a(p1))
        {
            p1 = new p();
            int ai[] = a;
            int j1 = i1 + 1;
            p1.c = ai[i1];
            boolean flag = ac.a;
            ai = a;
            int l = j1 + 1;
            i1 = ai[j1];
            int k1;
            if (i1 >= 0)
            {
                p1.d = (Fragment)ac1.b.get(i1);
            } else
            {
                p1.d = null;
            }
            ai = a;
            i1 = l + 1;
            p1.e = ai[l];
            ai = a;
            l = i1 + 1;
            p1.f = ai[i1];
            ai = a;
            i1 = l + 1;
            p1.g = ai[l];
            ai = a;
            j1 = i1 + 1;
            p1.h = ai[i1];
            ai = a;
            l = j1 + 1;
            k1 = ai[j1];
            i1 = l;
            if (k1 <= 0)
            {
                continue;
            }
            p1.i = new ArrayList(k1);
            j1 = 0;
            do
            {
                i1 = l;
                if (j1 >= k1)
                {
                    continue label0;
                }
                boolean flag1 = ac.a;
                Fragment fragment = (Fragment)ac1.b.get(a[l]);
                p1.i.add(fragment);
                j1++;
                l++;
            } while (true);
        }

        o1.c = b;
        o1.d = c;
        o1.f = d;
        o1.g = e;
        o1.e = true;
        o1.h = f;
        o1.i = g;
        o1.j = h;
        o1.k = i;
        o1.l = j;
        o1.m = k;
        o1.a(1);
        return o1;
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
