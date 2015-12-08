// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            StringToIntConverterCreator, StringToIntConverterEntryCreator

public final class StringToIntConverter
    implements SafeParcelable, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{
    public static final class Entry
        implements SafeParcelable
    {

        public static final StringToIntConverterEntryCreator CREATOR = new StringToIntConverterEntryCreator();
        final int intValue;
        final String stringValue;
        final int versionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            StringToIntConverterEntryCreator.writeToParcel$5bed86f6(this, parcel);
        }


        Entry(int i, String s, int j)
        {
            versionCode = i;
            stringValue = s;
            intValue = j;
        }

        Entry(String s, int i)
        {
            versionCode = 1;
            stringValue = s;
            intValue = i;
        }
    }


    public static final StringToIntConverterCreator CREATOR = new StringToIntConverterCreator();
    private final HashMap mIntToStringMap;
    private final ArrayList mSerializedMap;
    final HashMap mStringToIntMap;
    final int mVersionCode;

    public StringToIntConverter()
    {
        mVersionCode = 1;
        mStringToIntMap = new HashMap();
        mIntToStringMap = new HashMap();
        mSerializedMap = null;
    }

    StringToIntConverter(int i, ArrayList arraylist)
    {
        mVersionCode = i;
        mStringToIntMap = new HashMap();
        mIntToStringMap = new HashMap();
        mSerializedMap = null;
        deserialize(arraylist);
    }

    private void deserialize(ArrayList arraylist)
    {
        Entry entry;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); add(entry.stringValue, entry.intValue))
        {
            entry = (Entry)arraylist.next();
        }

    }

    public final StringToIntConverter add(String s, int i)
    {
        mStringToIntMap.put(s, Integer.valueOf(i));
        mIntToStringMap.put(Integer.valueOf(i), s);
        return this;
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        Integer integer = (Integer)mStringToIntMap.get(obj);
        obj = integer;
        if (integer == null)
        {
            obj = (Integer)mStringToIntMap.get("gms_unknown");
        }
        return obj;
    }

    public final volatile Object convertBack(Object obj)
    {
        obj = (Integer)obj;
        String s = (String)mIntToStringMap.get(obj);
        obj = s;
        if (s == null)
        {
            obj = s;
            if (mStringToIntMap.containsKey("gms_unknown"))
            {
                obj = "gms_unknown";
            }
        }
        return obj;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getTypeOut()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        StringToIntConverterCreator.writeToParcel$dc69de4(this, parcel);
    }

}
