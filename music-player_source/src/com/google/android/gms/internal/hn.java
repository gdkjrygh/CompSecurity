// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            iz, gq, gr

public final class hn
    implements SafeParcelable
{

    public static final iz a = new iz();
    final int b;
    final List c;
    private final String d;
    private final boolean e;
    private final Set f;

    hn(int i, List list, String s, boolean flag)
    {
        b = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        c = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        d = list;
        e = flag;
        if (c.isEmpty())
        {
            f = Collections.emptySet();
            return;
        } else
        {
            f = Collections.unmodifiableSet(new HashSet(c));
            return;
        }
    }

    public final String a()
    {
        return d;
    }

    public final boolean b()
    {
        return e;
    }

    public final int describeContents()
    {
        iz iz1 = a;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hn))
            {
                return false;
            }
            obj = (hn)obj;
            if (!f.equals(((hn) (obj)).f) || d != ((hn) (obj)).d || e != ((hn) (obj)).e)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            f, d, Boolean.valueOf(e)
        });
    }

    public final String toString()
    {
        return gq.a(this).a("types", f).a("textQuery", d).a("isOpenNowRequired", Boolean.valueOf(e)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        iz iz1 = a;
        iz.a(this, parcel);
    }

}
