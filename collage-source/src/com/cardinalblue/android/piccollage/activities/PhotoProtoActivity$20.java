// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.UndoManager;
import com.cardinalblue.android.piccollage.activities.undo.ScrapUpdateOp;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.b.b;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class b extends b
{

    final BaseScrapModel a;
    final g b;
    final PhotoProtoActivity c;

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        f.c(-1);
        PhotoProtoActivity.e(c).d(f);
        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c).a("apply clipped path");
        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c).a(new ScrapUpdateOp(a, b.y()));
        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c).d();
        PhotoProtoActivity.l(c);
        super.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    (PhotoProtoActivity photoprotoactivity, k k1, PhotoProtoView photoprotoview, BaseScrapModel basescrapmodel, g g1)
    {
        c = photoprotoactivity;
        a = basescrapmodel;
        b = g1;
        super(k1, photoprotoview);
    }
}
