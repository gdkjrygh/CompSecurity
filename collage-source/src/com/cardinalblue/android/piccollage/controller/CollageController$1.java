// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

class a
    implements Callable
{

    final AbstractCollage a;
    final CollageController b;

    public Void a()
        throws Exception
    {
        CollageController.a(b).a(a.s());
        k k1;
        for (Iterator iterator = a.t().iterator(); iterator.hasNext(); CollageController.a(b, k1, false))
        {
            k1 = (k)iterator.next();
        }

        String s = a.l();
        if (!TextUtils.isEmpty(s))
        {
            com.cardinalblue.android.piccollage.a.b.b(s);
        }
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (CollageController collagecontroller, AbstractCollage abstractcollage)
    {
        b = collagecontroller;
        a = abstractcollage;
        super();
    }
}
