// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            nv, jv

public final class nu
    implements SafeParcelable
{

    public static final nv CREATOR = new nv();
    final int CK;
    final List ahn;
    private final Set aho;
    private final String ahr;
    private final boolean ahs;
    final List aht;
    final List ahu;
    private final Set ahv;
    private final Set ahw;

    nu(int i, List list, String s, boolean flag, List list1, List list2)
    {
        CK = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        ahn = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        ahr = list;
        ahs = flag;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        aht = list;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        ahu = list;
        aho = g(ahn);
        ahv = g(aht);
        ahw = g(ahu);
    }

    private static Set g(List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(new HashSet(list));
        }
    }

    public int describeContents()
    {
        nv nv1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof nu))
            {
                return false;
            }
            obj = (nu)obj;
            if (!aho.equals(((nu) (obj)).aho) || ahs != ((nu) (obj)).ahs || !ahv.equals(((nu) (obj)).ahv) || !ahw.equals(((nu) (obj)).ahw))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            aho, Boolean.valueOf(ahs), ahv, ahw
        });
    }

    public String nu()
    {
        return ahr;
    }

    public boolean nv()
    {
        return ahs;
    }

    public String toString()
    {
        return jv.h(this).a("types", aho).a("placeIds", ahw).a("requireOpenNow", Boolean.valueOf(ahs)).a("requestedUserDataTypes", ahv).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nv nv1 = CREATOR;
        com.google.android.gms.internal.nv.a(this, parcel, i);
    }

}
