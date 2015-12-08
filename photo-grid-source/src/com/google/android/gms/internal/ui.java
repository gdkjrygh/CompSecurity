// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package com.google.android.gms.internal:
//            uu, uj, ut, to

public final class ui
    implements uu
{

    private final uj a;

    public ui(uj uj1)
    {
        a = uj1;
    }

    public final to a(to to)
    {
        a.b.add(to);
        return to;
    }

    public final void a()
    {
        for (Iterator iterator = a.d.values().iterator(); iterator.hasNext(); ((c)iterator.next()).disconnect()) { }
        a.f = Collections.emptySet();
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(ConnectionResult connectionresult, a a1, int i)
    {
    }

    public final void b()
    {
        ut ut1;
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ut1.f())
        {
            ut1 = (ut)iterator.next();
            ut1.a(null);
        }

        a.b.clear();
        a.e.clear();
        a.d();
    }

    public final void c()
    {
        a.e();
    }

    public final String d()
    {
        return "DISCONNECTED";
    }
}
