// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import Q;
import T;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

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

    public BackStackState(Q q)
    {
        Q.a a1 = q.a;
        int l;
        int i1;
        for (l = 0; a1 != null; l = i1)
        {
            i1 = l;
            if (a1.i != null)
            {
                i1 = l + a1.i.size();
            }
            a1 = a1.a;
        }

        a = new int[l + q.b * 7];
        if (!q.e)
        {
            throw new IllegalStateException("Not on back stack");
        }
        a1 = q.a;
        l = 0;
        while (a1 != null) 
        {
            int ai[] = a;
            int j1 = l + 1;
            ai[l] = a1.c;
            ai = a;
            int k1 = j1 + 1;
            if (a1.d != null)
            {
                l = a1.d.mIndex;
            } else
            {
                l = -1;
            }
            ai[j1] = l;
            ai = a;
            l = k1 + 1;
            ai[k1] = a1.e;
            ai = a;
            j1 = l + 1;
            ai[l] = a1.f;
            ai = a;
            l = j1 + 1;
            ai[j1] = a1.g;
            ai = a;
            j1 = l + 1;
            ai[l] = a1.h;
            if (a1.i != null)
            {
                int l1 = a1.i.size();
                int ai1[] = a;
                l = j1 + 1;
                ai1[j1] = l1;
                for (j1 = 0; j1 < l1;)
                {
                    a[l] = ((Fragment)a1.i.get(j1)).mIndex;
                    j1++;
                    l++;
                }

            } else
            {
                int ai2[] = a;
                l = j1 + 1;
                ai2[j1] = 0;
            }
            a1 = a1.a;
        }
        b = q.c;
        c = q.d;
        d = q.f;
        e = q.g;
        f = q.h;
        g = q.i;
        h = q.j;
        i = q.k;
        j = q.l;
        k = q.m;
    }

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

    public final Q a(T t)
    {
        Q q = new Q(t);
        Q.a a1;
label0:
        for (int i1 = 0; i1 < a.length; q.a(a1))
        {
            a1 = new Q.a();
            int ai[] = a;
            int j1 = i1 + 1;
            a1.c = ai[i1];
            ai = a;
            int l = j1 + 1;
            i1 = ai[j1];
            int k1;
            if (i1 >= 0)
            {
                a1.d = (Fragment)t.a.get(i1);
            } else
            {
                a1.d = null;
            }
            ai = a;
            i1 = l + 1;
            a1.e = ai[l];
            ai = a;
            l = i1 + 1;
            a1.f = ai[i1];
            ai = a;
            i1 = l + 1;
            a1.g = ai[l];
            ai = a;
            j1 = i1 + 1;
            a1.h = ai[i1];
            ai = a;
            l = j1 + 1;
            k1 = ai[j1];
            i1 = l;
            if (k1 <= 0)
            {
                continue;
            }
            a1.i = new ArrayList(k1);
            j1 = 0;
            do
            {
                i1 = l;
                if (j1 >= k1)
                {
                    continue label0;
                }
                Fragment fragment = (Fragment)t.a.get(a[l]);
                a1.i.add(fragment);
                j1++;
                l++;
            } while (true);
        }

        q.c = b;
        q.d = c;
        q.f = d;
        q.g = e;
        q.e = true;
        q.h = f;
        q.i = g;
        q.j = h;
        q.k = i;
        q.l = j;
        q.m = k;
        q.a(1);
        return q;
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
