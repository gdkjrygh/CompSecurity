// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ag, ch, af

public class ah
    implements ag
{

    private final af a;
    private final HashSet b = new HashSet();

    public ah(af af1)
    {
        a = af1;
    }

    public void a()
    {
        java.util.AbstractMap.SimpleEntry simpleentry;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a.b((String)simpleentry.getKey(), (ch)simpleentry.getValue()))
        {
            simpleentry = (java.util.AbstractMap.SimpleEntry)iterator.next();
            zzb.v((new StringBuilder()).append("Unregistering eventhandler: ").append(((ch)simpleentry.getValue()).toString()).toString());
        }

        b.clear();
    }

    public void a(String s, ch ch1)
    {
        a.a(s, ch1);
        b.add(new java.util.AbstractMap.SimpleEntry(s, ch1));
    }

    public void a(String s, String s1)
    {
        a.a(s, s1);
    }

    public void a(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public void b(String s, ch ch1)
    {
        a.b(s, ch1);
        b.remove(new java.util.AbstractMap.SimpleEntry(s, ch1));
    }

    public void b(String s, JSONObject jsonobject)
    {
        a.b(s, jsonobject);
    }
}
