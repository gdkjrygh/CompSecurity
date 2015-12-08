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
//            FieldMappingDictionary, d

public static class a
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    final int a;
    final String b;
    final ArrayList c;

    private static ArrayList a(Map map)
    {
        if (map == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(new apPair(s, (apPair)map.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    final HashMap a()
    {
        HashMap hashmap = new HashMap();
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            apPair appair = (apPair)c.get(i);
            hashmap.put(appair.b, appair.c);
        }

        return hashmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel);
    }


    apPair(int i, String s, ArrayList arraylist)
    {
        a = i;
        b = s;
        c = arraylist;
    }

    c(String s, Map map)
    {
        a = 1;
        b = s;
        c = a(map);
    }
}
