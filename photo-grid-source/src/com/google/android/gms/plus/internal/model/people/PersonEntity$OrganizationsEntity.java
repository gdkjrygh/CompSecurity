// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            h

public final class k extends FastSafeParcelableJsonResponse
{

    public static final h CREATOR = new h();
    private static final HashMap l;
    final Set a;
    final int b;
    String c;
    String d;
    String e;
    String f;
    String g;
    boolean h;
    String i;
    String j;
    int k;

    public final Map a()
    {
        return l;
    }

    protected final boolean a(com.google.android.gms.common.server.response.ity ity)
    {
        return a.contains(Integer.valueOf(ity.a()));
    }

    protected final Object b(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.ity())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.ity()).toString());

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
            return Boolean.valueOf(h);

        case 8: // '\b'
            return i;

        case 9: // '\t'
            return j;

        case 10: // '\n'
            return Integer.valueOf(k);
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
            if (!(obj instanceof k))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (k)obj;
            com.google.android.gms.common.server.response.ity ity;
label1:
            do
            {
                for (Iterator iterator = l.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.l)iterator.next();
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
        Iterator iterator = l.values().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.l)iterator.next();
            if (a(ity))
            {
                int j1 = ity.a();
                i1 = b(ity).hashCode() + (i1 + j1);
            }
        } while (true);
        return i1;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.plus.internal.model.people.h.a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        l = hashmap;
        hashmap.put("department", com.google.android.gms.common.server.response.ity.l("department", 2));
        l.put("description", com.google.android.gms.common.server.response.ity.l("description", 3));
        l.put("endDate", com.google.android.gms.common.server.response.ity.l("endDate", 4));
        l.put("location", com.google.android.gms.common.server.response.ity.l("location", 5));
        l.put("name", com.google.android.gms.common.server.response.ity.l("name", 6));
        l.put("primary", com.google.android.gms.common.server.response.ity.l("primary", 7));
        l.put("startDate", com.google.android.gms.common.server.response.ity.l("startDate", 8));
        l.put("title", com.google.android.gms.common.server.response.ity.l("title", 9));
        l.put("type", com.google.android.gms.common.server.response.ity.l("type", 10, (new StringToIntConverter()).a("work", 0).a("school", 1)));
    }

    public ()
    {
        b = 1;
        a = new HashSet();
    }

    a(Set set, int i1, String s, String s1, String s2, String s3, String s4, 
            boolean flag, String s5, String s6, int j1)
    {
        a = set;
        b = i1;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = flag;
        i = s5;
        j = s6;
        k = j1;
    }
}
