// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.ContentValues;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.h;
import com.cardinalblue.android.piccollage.view.k;
import com.cardinalblue.android.piccollage.view.n;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

class b
    implements Callable
{

    final String a;
    final ContentValues b;
    final CollageController c;

    public k a()
        throws Exception
    {
        if (a.equals("images"))
        {
            g g1 = h.a(CollageController.a(c).getContext(), b);
            g1.b(false);
            return g1;
        }
        if (a.equals("texts"))
        {
            return new n(CollageController.a(c).getContext(), b);
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (CollageController collagecontroller, String s, ContentValues contentvalues)
    {
        c = collagecontroller;
        a = s;
        b = contentvalues;
        super();
    }
}
