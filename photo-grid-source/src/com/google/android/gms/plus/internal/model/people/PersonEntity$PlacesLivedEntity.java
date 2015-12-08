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
//            i

public final class d extends FastSafeParcelableJsonResponse
{

    public static final i CREATOR = new i();
    private static final HashMap e;
    final Set a;
    final int b;
    boolean c;
    String d;

    public final Map a()
    {
        return e;
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
            return Boolean.valueOf(c);

        case 3: // '\003'
            return d;
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
            if (!(obj instanceof d))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (d)obj;
            com.google.android.gms.common.server.response.ity ity;
label1:
            do
            {
                for (Iterator iterator = e.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.e)iterator.next();
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
        Iterator iterator = e.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.e)iterator.next();
            if (a(ity))
            {
                int k = ity.a();
                j = b(ity).hashCode() + (j + k);
            }
        } while (true);
        return j;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        e = hashmap;
        hashmap.put("primary", com.google.android.gms.common.server.response.ity.e("primary", 2));
        e.put("value", com.google.android.gms.common.server.response.ity.e("value", 3));
    }

    public ()
    {
        b = 1;
        a = new HashSet();
    }

    a(Set set, int j, boolean flag, String s)
    {
        a = set;
        b = j;
        c = flag;
        d = s;
    }
}
