// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.widget.FrameLayout;
import com.kik.g.r;
import kik.a.d.a.a;
import kik.a.e.g;
import kik.android.gifs.a.f;

// Referenced classes of package kik.android.widget:
//            bo, GifWidget

final class bp extends r
{

    final bo a;

    bp(bo bo1)
    {
        a = bo1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        kik.android.widget.GifWidget.a(a.a, kik.android.widget.bo.a(a), bo.b(a), bo.c(a).a());
        kik.android.widget.GifWidget.a(a.a).a(((a) (obj)));
        a.a._previewView.setVisibility(4);
        kik.android.widget.bo.a(a, null);
    }
}
