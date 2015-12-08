// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bt, fz, bs

public final class bu
    implements bt
{

    private final bs a;
    private final HashSet b = new HashSet();

    public bu(bs bs1)
    {
        a = bs1;
    }

    public final void a()
    {
        java.util.AbstractMap.SimpleEntry simpleentry;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a.b((String)simpleentry.getKey(), (fz)simpleentry.getValue()))
        {
            simpleentry = (java.util.AbstractMap.SimpleEntry)iterator.next();
            zzb.v((new StringBuilder("Unregistering eventhandler: ")).append(((fz)simpleentry.getValue()).toString()).toString());
        }

        b.clear();
    }

    public final void a(String s, fz fz1)
    {
        a.a(s, fz1);
        b.add(new java.util.AbstractMap.SimpleEntry(s, fz1));
    }

    public final void a(String s, String s1)
    {
        a.a(s, s1);
    }

    public final void a(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public final void b(String s, fz fz1)
    {
        a.b(s, fz1);
        b.remove(new java.util.AbstractMap.SimpleEntry(s, fz1));
    }

    public final void b(String s, JSONObject jsonobject)
    {
        a.b(s, jsonobject);
    }
}
