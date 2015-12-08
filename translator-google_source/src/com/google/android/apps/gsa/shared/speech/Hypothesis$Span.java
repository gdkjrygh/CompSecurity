// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.speech;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.h;
import com.google.common.base.k;
import com.google.common.base.l;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.LinkedList;

// Referenced classes of package com.google.android.apps.gsa.shared.speech:
//            c

public class e
    implements Parcelable
{

    public static final android.os.or CREATOR = new c();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public ImmutableList e;

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof e)
        {
            obj = (e)obj;
            flag = flag1;
            if (a == ((a) (obj)).a)
            {
                flag = flag1;
                if (b == ((b) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((c) (obj)).c)
                    {
                        flag = flag1;
                        if (d == ((d) (obj)).d)
                        {
                            flag = flag1;
                            if (k.a(e, ((e) (obj)).e))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), e
        });
    }

    public String toString()
    {
        return (new l(h.a(getClass()))).a("mUtf16Start", a).a("mUtf16End", b).a("mUtf8Start", c).a("mUtf8Length", d).a("mAlternates", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeStringList(e);
    }


    public (Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        LinkedList linkedlist = new LinkedList();
        parcel.readStringList(linkedlist);
        e = ImmutableList.copyOf(linkedlist);
    }
}
