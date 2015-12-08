// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class mtn
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mto();
    static final String a[] = new String[0];
    int b;
    Map c;

    mtn(Parcel parcel)
    {
        b = parcel.readInt();
        int j = parcel.readInt();
        c = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            String s = parcel.readString();
            int k = parcel.readInt();
            c.put(s, Integer.valueOf(k));
        }

    }

    public mtn(mty mty1)
    {
        b.u();
        int i = mty1.g + 1;
        mty1.g = i;
        if (i == 0)
        {
            mty1.g = mty1.g + 1;
        }
        b = mty1.g;
        c = new HashMap();
    }

    final void a(String s)
    {
        Integer integer;
label0:
        {
            integer = (Integer)c.get(s);
            if (integer != null)
            {
                if (integer.intValue() != 1)
                {
                    break label0;
                }
                c.remove(s);
            }
            return;
        }
        c.put(s, Integer.valueOf(integer.intValue() - 1));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(b);
        parcel.writeInt(c.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); parcel.writeInt(((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            parcel.writeString((String)entry.getKey());
        }

    }

}
