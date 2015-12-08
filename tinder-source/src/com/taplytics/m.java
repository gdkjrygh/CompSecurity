// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.ArrayList;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            el, gs, j, bf

final class m
    implements el
{

    final bf a;
    final ArrayList b;
    final j c;

    m(j j1, bf bf1, ArrayList arraylist)
    {
        c = j1;
        a = bf1;
        b = arraylist;
        super();
    }

    public final void a(Exception exception)
    {
        gs.b("Flushing Event Queue", exception);
        j.a(c).addAll(b);
        j.a(c, a);
    }

    public final void a(JSONObject jsonobject)
    {
        if (gs.b())
        {
            gs.a("Flushed Event Queue!");
        }
        if (a != null)
        {
            a.a();
        }
    }
}
