// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.UndoManager;
import com.cardinalblue.android.piccollage.activities.undo.ScrapUpdateOp;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements i
{

    final boolean a;
    final PhotoProtoActivity b;

    public Void a(j j1)
        throws Exception
    {
        k k1 = (k)j1.e();
        com.cardinalblue.android.piccollage.model.gson.BaseScrapModel basescrapmodel = k1.D();
        if (a)
        {
            k1.c(-1);
            PhotoProtoActivity.q(b).a();
        }
        if (!PhotoProtoActivity.e(b).d((k)j1.e()))
        {
            return null;
        } else
        {
            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(b).a("bring to front a scrap");
            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(b).a(new ScrapUpdateOp(basescrapmodel, k1.D()));
            com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(b).d();
            PhotoProtoActivity.l(b);
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PhotoProtoActivity photoprotoactivity, boolean flag)
    {
        b = photoprotoactivity;
        a = flag;
        super();
    }
}
