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
//            j

public final class e extends FastSafeParcelableJsonResponse
{

    public static final j CREATOR = new j();
    private static final HashMap f;
    final Set a;
    final int b;
    String c;
    int d;
    String e;
    private final int g;

    public static int d()
    {
        return 4;
    }

    public final Map a()
    {
        return f;
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

        case 5: // '\005'
            return c;

        case 6: // '\006'
            return Integer.valueOf(d);

        case 4: // '\004'
            return e;
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
                int k = ity.();
                i = b(ity).hashCode() + (i + k);
            }
        } while (true);
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        f = hashmap;
        hashmap.put("label", com.google.android.gms.common.server.response.("label", 5));
        f.put("type", com.google.android.gms.common.server.response.("type", 6, (new StringToIntConverter()).a("home", 0).a("work", 1).a("blog", 2).a("profile", 3).a("other", 4).a("otherProfile", 5).a("contributor", 6).a("website", 7)));
        f.put("value", com.google.android.gms.common.server.response.("value", 4));
    }

    public se()
    {
        g = 4;
        b = 1;
        a = new HashSet();
    }

    a(Set set, int i, String s, int k, String s1)
    {
        g = 4;
        a = set;
        b = i;
        c = s;
        d = k;
        e = s1;
    }
}
