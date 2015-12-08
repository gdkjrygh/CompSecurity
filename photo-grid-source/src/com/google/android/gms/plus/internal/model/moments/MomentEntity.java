// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            b, ItemScopeEntity

public final class MomentEntity extends FastSafeParcelableJsonResponse
{

    public static final b CREATOR = new b();
    private static final HashMap h;
    final Set a;
    final int b;
    String c;
    ItemScopeEntity d;
    String e;
    ItemScopeEntity f;
    String g;

    public MomentEntity()
    {
        b = 1;
        a = new HashSet();
    }

    MomentEntity(Set set, int i, String s, ItemScopeEntity itemscopeentity, String s1, ItemScopeEntity itemscopeentity1, String s2)
    {
        a = set;
        b = i;
        c = s;
        d = itemscopeentity;
        e = s1;
        f = itemscopeentity1;
        g = s2;
    }

    public final Map a()
    {
        return h;
    }

    protected final boolean a(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return a.contains(Integer.valueOf(field.g()));
    }

    protected final Object b(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.g())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.g()).toString());

        case 2: // '\002'
            return c;

        case 4: // '\004'
            return d;

        case 5: // '\005'
            return e;

        case 6: // '\006'
            return f;

        case 7: // '\007'
            return g;
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
            if (!(obj instanceof MomentEntity))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (MomentEntity)obj;
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
            do
            {
                for (Iterator iterator = h.values().iterator(); iterator.hasNext();)
                {
                    field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                    if (!a(field))
                    {
                        continue label1;
                    }
                    if (((MomentEntity) (obj)).a(field))
                    {
                        if (!b(field).equals(((MomentEntity) (obj)).b(field)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((MomentEntity) (obj)).a(field));
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        Iterator iterator = h.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (a(field))
            {
                int j = field.g();
                i = b(field).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.plus.internal.model.moments.b.a(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        h = hashmap;
        hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("id", 2));
        h.put("result", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("result", 4, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        h.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("startDate", 5));
        h.put("target", com.google.android.gms.common.server.response.FastJsonResponse.Field.a("target", 6, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        h.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.d("type", 7));
    }
}
