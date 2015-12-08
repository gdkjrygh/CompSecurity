// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList;
import com.cardinalblue.android.piccollage.view.a.y;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements i
{

    final af a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.c() || j1.d())
        {
            f.a(j1.f());
            k.a(a.getActivity(), 0x7f07013c, 0);
            return null;
        } else
        {
            a.a.a((PhotoboxTemplateList)j1.e());
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    emplateList(af af1)
    {
        a = af1;
        super();
    }
}
