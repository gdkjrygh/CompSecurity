// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.nuance.b.a:
//            p

public final class o
{

    private List a;

    public o()
    {
        a = new ArrayList();
    }

    final JSONArray a()
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); jsonarray.put(((p)iterator.next()).a())) { }
        return jsonarray;
    }
}
