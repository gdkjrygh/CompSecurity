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
//            e

public final class e extends FastSafeParcelableJsonResponse
{

    public static final e CREATOR = new e();
    private static final HashMap f;
    final Set a;
    final int b;
    int c;
    String d;
    int e;

    public final Map a()
    {
        return f;
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
            return Integer.valueOf(c);

        case 3: // '\003'
            return d;

        case 4: // '\004'
            return Integer.valueOf(e);
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
            if (!(obj instanceof e))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (e)obj;
            com.google.android.gms.common.server.response.ity ity;
label1:
            do
            {
                for (Iterator iterator = f.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.f)iterator.next();
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
        Iterator iterator = f.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.f)iterator.next();
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
        com.google.android.gms.plus.internal.model.people.e.a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        f = hashmap;
        hashmap.put("height", com.google.android.gms.common.server.response.ity.f("height", 2));
        f.put("url", com.google.android.gms.common.server.response.ity.f("url", 3));
        f.put("width", com.google.android.gms.common.server.response.ity.f("width", 4));
    }

    public a()
    {
        b = 1;
        a = new HashSet();
    }

    a(Set set, int i, int j, String s, int k)
    {
        a = set;
        b = i;
        c = j;
        d = s;
        e = k;
    }
}
