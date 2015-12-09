// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FieldMappingDictionaryCreator, FieldMappingDictionaryEntryCreator, FieldMapPairCreator

public class FieldMappingDictionary
    implements SafeParcelable
{
    public static class Entry
        implements SafeParcelable
    {

        public static final FieldMappingDictionaryEntryCreator CREATOR = new FieldMappingDictionaryEntryCreator();
        final String className;
        final ArrayList fieldMapping;
        final int versionCode;

        private static ArrayList convertToArrayList(Map map)
        {
            if (map != null) goto _L2; else goto _L1
_L1:
            Object obj = null;
_L4:
            return ((ArrayList) (obj));
_L2:
            ArrayList arraylist = new ArrayList();
            Iterator iterator = map.keySet().iterator();
            do
            {
                obj = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                obj = (String)iterator.next();
                arraylist.add(new FieldMapPair(((String) (obj)), (FastJsonResponse.Field)map.get(obj)));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public int describeContents()
        {
            return 0;
        }

        final HashMap deserializeFieldMapping()
        {
            HashMap hashmap = new HashMap();
            int j = fieldMapping.size();
            for (int i = 0; i < j; i++)
            {
                FieldMapPair fieldmappair = (FieldMapPair)fieldMapping.get(i);
                hashmap.put(fieldmappair.key, fieldmappair.value);
            }

            return hashmap;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            FieldMappingDictionaryEntryCreator.writeToParcel$3d42fe6(this, parcel);
        }


        Entry(int i, String s, ArrayList arraylist)
        {
            versionCode = i;
            className = s;
            fieldMapping = arraylist;
        }

        Entry(String s, Map map)
        {
            versionCode = 1;
            className = s;
            fieldMapping = convertToArrayList(map);
        }
    }

    public static class FieldMapPair
        implements SafeParcelable
    {

        public static final FieldMapPairCreator CREATOR = new FieldMapPairCreator();
        final String key;
        final FastJsonResponse.Field value;
        final int versionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            FieldMapPairCreator.writeToParcel(this, parcel, i);
        }


        FieldMapPair(int i, String s, FastJsonResponse.Field field)
        {
            versionCode = i;
            key = s;
            value = field;
        }

        FieldMapPair(String s, FastJsonResponse.Field field)
        {
            versionCode = 1;
            key = s;
            value = field;
        }
    }


    public static final FieldMappingDictionaryCreator CREATOR = new FieldMappingDictionaryCreator();
    final HashMap mDictionary;
    final String mRootClassName;
    private final ArrayList mSerializedDictionary = null;
    final int mVersionCode;

    FieldMappingDictionary(int i, ArrayList arraylist, String s)
    {
        mVersionCode = i;
        mDictionary = deserialize(arraylist);
        mRootClassName = (String)Preconditions.checkNotNull(s);
        linkFields();
    }

    private static HashMap deserialize(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Entry entry = (Entry)arraylist.get(i);
            hashmap.put(entry.className, entry.deserializeFieldMapping());
        }

        return hashmap;
    }

    private void linkFields()
    {
        for (Iterator iterator = mDictionary.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (Map)mDictionary.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((FastJsonResponse.Field)((Map) (obj)).get((String)iterator1.next())).mDictionary = this;
            }
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public final Map getFieldMapping(String s)
    {
        return (Map)mDictionary.get(s);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = mDictionary.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            stringbuilder.append(((String) (obj))).append(":\n");
            obj = (Map)mDictionary.get(obj);
            Iterator iterator1 = ((Map) (obj)).keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                stringbuilder.append("  ").append(s).append(": ");
                stringbuilder.append(((Map) (obj)).get(s));
            }
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FieldMappingDictionaryCreator.writeToParcel$51a5452c(this, parcel);
    }

}
