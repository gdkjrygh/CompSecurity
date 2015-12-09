// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.view.View;
import com.cardinalblue.android.piccollage.UndoManager;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.undo.RemoveScrapOp;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.view.b.c;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a extends c
{

    final PhotoProtoActivity a;

    public void a()
    {
        super.a();
        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a).a("remove scrap");
        com.cardinalblue.android.piccollage.model.gson.BaseScrapModel basescrapmodel = f.D();
        f.b(basescrapmodel);
        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a).a(new RemoveScrapOp(basescrapmodel));
        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a).d();
        PhotoProtoActivity.l(a);
        PhotoProtoActivity.e(a).a(f);
        b.ak();
    }

    I(PhotoProtoActivity photoprotoactivity, k k1, View view, float f, float f1, float f2, float f3)
    {
        a = photoprotoactivity;
        super(k1, view, f, f1, f2, f3);
    }
}
