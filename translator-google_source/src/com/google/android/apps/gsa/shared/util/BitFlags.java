// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.gsa.shared.util:
//            a

public class BitFlags
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final Class a;
    private final String b;
    private long c;
    private LongSparseArray d;

    public BitFlags()
    {
        this(null, 0L);
    }

    public BitFlags(long l)
    {
        this(null, l);
    }

    public BitFlags(Class class1, long l)
    {
        this(class1, "FLAG_", l);
    }

    private BitFlags(Class class1, String s, long l)
    {
        c = l;
        a = class1;
        b = s;
    }

    private LongSparseArray a(Class class1)
    {
        LongSparseArray longsparsearray = new LongSparseArray();
        if (class1 != null)
        {
            class1 = class1.getDeclaredFields();
            int j = class1.length;
            int i = 0;
            while (i < j) 
            {
                Field field = class1[i];
                field.setAccessible(true);
                String s = field.getName();
                if (s.startsWith(b) && Modifier.isStatic(field.getModifiers()))
                {
                    try
                    {
                        longsparsearray.append(field.getLong(null), s);
                    }
                    catch (Exception exception) { }
                }
                i++;
            }
        }
        return longsparsearray;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof BitFlags)
        {
            obj = (BitFlags)obj;
            flag = flag1;
            if (c == ((BitFlags) (obj)).c)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(c)
        });
    }

    public String toString()
    {
        long l = c;
        if (d == null)
        {
            d = a(a);
        }
        Object obj = new ArrayList();
        for (int i = 0; i < d.size(); i++)
        {
            long l1 = d.keyAt(i);
            if ((l & l1) == l1)
            {
                ((List) (obj)).add(((String)d.get(l1)).substring(b.length()).toLowerCase(Locale.US));
            }
        }

        if (!((List) (obj)).isEmpty())
        {
            obj = obj.toString();
        } else
        {
            obj = String.valueOf(Long.toHexString(l));
            obj = (new StringBuilder(String.valueOf(obj).length() + 2)).append("[").append(((String) (obj))).append("]").toString();
        }
        obj = String.valueOf(obj);
        if (((String) (obj)).length() != 0)
        {
            return "BitFlags".concat(((String) (obj)));
        } else
        {
            return new String("BitFlags");
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(c);
        String s;
        if (a == null)
        {
            s = null;
        } else
        {
            s = a.getName();
        }
        parcel.writeString(s);
    }

}
