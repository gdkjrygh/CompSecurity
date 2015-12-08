// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FieldMappingDictionary, FieldMappingDictionaryEntryCreator

public static class convertToArrayList
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
            arraylist.add(new apPair(((String) (obj)), (apPair)map.get(obj)));
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
            apPair appair = (apPair)fieldMapping.get(i);
            hashmap.put(appair.key, appair.value);
        }

        return hashmap;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FieldMappingDictionaryEntryCreator.writeToParcel$3d42fe6(this, parcel);
    }


    eator(int i, String s, ArrayList arraylist)
    {
        versionCode = i;
        className = s;
        fieldMapping = arraylist;
    }

    fieldMapping(String s, Map map)
    {
        versionCode = 1;
        className = s;
        fieldMapping = convertToArrayList(map);
    }
}
