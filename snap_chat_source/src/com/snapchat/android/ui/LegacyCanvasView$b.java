// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jy;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.snapchat.android.util.SnapMediaUtils;
import java.util.ArrayList;

// Referenced classes of package com.snapchat.android.ui:
//            LegacyCanvasView

final class b
{

    public ArrayList a;
    Paint b;
    Matrix c;
    Canvas d;
    Bitmap e;
    boolean f;
    final LegacyCanvasView g;

    public final void a()
    {
        b();
        Object obj = SnapMediaUtils.a(g.getContext().getResources().getDisplayMetrics(), LegacyCanvasView.a(g), LegacyCanvasView.b(g), android.graphics._fld8888);
        obj = Jy.a().a(((android.graphics.ns) (obj)), true);
        if (obj != null)
        {
            e = ((Bitmap) (obj));
        } else
        {
            e = SnapMediaUtils.a(LegacyCanvasView.a(g), LegacyCanvasView.b(g), android.graphics._fld8888);
        }
        d = new Canvas(e);
    }

    public final void b()
    {
        d = null;
        Jy.a().a(e);
        e = null;
    }

    public (LegacyCanvasView legacycanvasview)
    {
        g = legacycanvasview;
        super();
        a = new ArrayList();
        b = new Paint();
        c = new Matrix();
        f = false;
        a();
        b.setAntiAlias(true);
        b.setFilterBitmap(false);
    }
}
