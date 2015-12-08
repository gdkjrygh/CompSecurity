// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import com.google.android.apps.photos.list.PhotoTileView;
import com.google.android.apps.photos.stories.StoryLayout;

final class inq
    implements irf
{

    private inl a;

    inq(inl inl1)
    {
        a = inl1;
        super();
    }

    public final void a()
    {
        Object obj = (itf)a.O_().c().a("whitebox");
        ((itf) (obj)).a(a, 9);
        PhotoTileView phototileview = (PhotoTileView)inl.h(a).a(inl.u(a).d, itd);
        int ai[] = new int[2];
        phototileview.getLocationOnScreen(ai);
        obj.a = new Rect(ai[0], ai[1], ai[0] + phototileview.getWidth(), ai[1] + phototileview.getHeight());
        ((itf) (obj)).a(((am) (obj)).R);
        ((itf) (obj)).a(false);
        if (((itf) (obj)).b)
        {
            ((itf) (obj)).u();
        }
        obj = (String)phototileview.getTag(s.bQ);
        obj = inl.v(a).a(((String) (obj)));
        if (obj == null)
        {
            obj = new ogv(pxa.u, new ogw[] {
                ogw.a(0)
            });
        } else
        {
            obj = b.a(inl.w(a), pxa.u, ((ekp) (obj)));
        }
        b.a(phototileview, ((msm) (obj)));
    }
}
