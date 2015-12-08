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
//            f

public final class c extends FastSafeParcelableJsonResponse
{

    public static final f CREATOR = new f();
    private static final HashMap d;
    final Set a;
    final int b;
    String c;

    public final Map a()
    {
        return d;
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
            if (!(obj instanceof c))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (c)obj;
            com.google.android.gms.common.server.response.ity ity;
label1:
            do
            {
                for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.d)iterator.next();
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
        Iterator iterator = d.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.d)iterator.next();
            if (a(ity))
            {
                int j = ity.a();
                i = b(ity).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        d = hashmap;
        hashmap.put("url", com.google.android.gms.common.server.response.ity.d("url", 2));
    }

    public e()
    {
        b = 1;
        a = new HashSet();
    }

    a(Set set, int i, String s)
    {
        a = set;
        b = i;
        c = s;
    }
}
