// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.libraries.bind.util.Util;

// Referenced classes of package com.google.android.libraries.bind.data:
//            DataProperty

public final class Data
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new Data(parcel.readSparseArray(null));
        }

        public final volatile Object[] newArray(int i)
        {
            return new Data[i];
        }

    };
    boolean frozen;
    SparseArray values;

    public Data()
    {
        this((byte)0);
    }

    private Data(byte byte0)
    {
        values = new SparseArray(8);
    }

    public Data(SparseArray sparsearray)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            values = sparsearray.clone();
            return;
        } else
        {
            values = new SparseArray(sparsearray.size());
            putAll(sparsearray);
            return;
        }
    }

    public static String keyName(int i)
    {
        return Util.getResourceName(i);
    }

    private void putAll(SparseArray sparsearray)
    {
        for (int i = 0; i < sparsearray.size(); i++)
        {
            values.put(sparsearray.keyAt(i), sparsearray.valueAt(i));
        }

    }

    public final boolean containsKey(int i)
    {
        return values.get(i) != null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Data))
        {
            return false;
        } else
        {
            return values.equals(((Data)obj).values);
        }
    }

    public final Object get(int i)
    {
        Object obj1 = values.get(i);
        Object obj = obj1;
        if (obj1 instanceof DataProperty)
        {
            obj = ((DataProperty)obj1).apply$34b94061();
        }
        return obj;
    }

    public final Integer getAsInteger(int i)
    {
        Object obj = get(i);
        if (obj != null)
        {
            return Integer.valueOf(((Number)obj).intValue());
        } else
        {
            return null;
        }
    }

    public final String getAsString(int i)
    {
        Object obj = get(i);
        if (obj != null)
        {
            return obj.toString();
        } else
        {
            return null;
        }
    }

    public final int hashCode()
    {
        return values.hashCode();
    }

    public final void put(int i, Object obj)
    {
        if (frozen)
        {
            throw new IllegalStateException("Data is locked");
        } else
        {
            values.put(i, obj);
            return;
        }
    }

    public final String toString()
    {
        if (values.size() == 0)
        {
            return "Data is empty";
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < values.size(); i++)
        {
            int j = values.keyAt(i);
            Object obj = values.valueAt(i);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" ");
            }
            stringbuilder.append((new StringBuilder()).append(Util.getResourceName(j)).append("=").append(obj).toString());
        }

        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSparseArray(values);
    }

}
