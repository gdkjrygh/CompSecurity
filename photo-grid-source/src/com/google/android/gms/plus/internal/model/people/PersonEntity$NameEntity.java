// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            g

public final class h extends FastSafeParcelableJsonResponse
{

    public static final g CREATOR = new g();
    private static final HashMap i;
    final Set a;
    final int b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;

    public final Map a()
    {
        return i;
    }

    protected final boolean a(com.google.android.gms.common.server.response.ity ity)
    {
        return a.contains(Integer.valueOf(ity.()));
    }

    protected final Object b(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.()).toString());

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;

        case 4: // '\004'
            return e;

        case 5: // '\005'
            return f;

        case 6: // '\006'
            return g;

        case 7: // '\007'
            return h;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof h))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (h)obj;
            com.google.android.gms.common.server.response.ity ity;
label1:
            do
            {
                for (Iterator iterator = i.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.i)iterator.next();
                    if (!a(ity))
                    {
                        continue label1;
                    }
                    if (((a) (obj)).a(ity))
                    {
                        if (!b(ity).equals(((b) (obj)).b(ity)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((b) (obj)).a(ity));
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        Iterator iterator = i.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.i)iterator.next();
            if (a(ity))
            {
                int k = ity.();
                j = b(ity).hashCode() + (j + k);
            }
        } while (true);
        return j;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.plus.internal.model.people.g.a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        i = hashmap;
        hashmap.put("familyName", com.google.android.gms.common.server.response.("familyName", 2));
        i.put("formatted", com.google.android.gms.common.server.response.("formatted", 3));
        i.put("givenName", com.google.android.gms.common.server.response.("givenName", 4));
        i.put("honorificPrefix", com.google.android.gms.common.server.response.("honorificPrefix", 5));
        i.put("honorificSuffix", com.google.android.gms.common.server.response.("honorificSuffix", 6));
        i.put("middleName", com.google.android.gms.common.server.response.("middleName", 7));
    }

    public se()
    {
        b = 1;
        a = new HashSet();
    }

    a(Set set, int j, String s, String s1, String s2, String s3, String s4, 
            String s5)
    {
        a = set;
        b = j;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
    }
}
