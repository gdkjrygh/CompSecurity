// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.k.c;
import com.google.android.m4b.maps.o.p;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.q:
//            k

public final class j
    implements c
{

    public static final k CREATOR = new k();
    static final List a = Collections.emptyList();
    final int b;
    p c;
    boolean d;
    boolean e;
    boolean f;
    List g;
    final String h;

    j(int i, p p1, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        b = i;
        c = p1;
        d = flag;
        e = flag1;
        f = flag2;
        g = list;
        h = s;
    }

    public static j a(p p1)
    {
        return new j(1, p1, false, true, true, a, null);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof j)
        {
            if (v.a(c, ((j) (obj = (j)obj)).c) && d == ((j) (obj)).d && e == ((j) (obj)).e && f == ((j) (obj)).f && v.a(g, ((j) (obj)).g))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(c.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(d);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(e);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(f);
        stringbuilder.append(" clients=");
        stringbuilder.append(g);
        if (h != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(h);
        }
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
