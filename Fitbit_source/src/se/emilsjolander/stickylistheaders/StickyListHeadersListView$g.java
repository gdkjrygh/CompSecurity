// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.graphics.Canvas;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersListView, j

private class <init>
    implements <init>
{

    final StickyListHeadersListView a;

    public void a(Canvas canvas)
    {
label0:
        {
            if (android.os.kyListHeadersListView < 8)
            {
                StickyListHeadersListView.a(a, StickyListHeadersListView.g(a).a());
            }
            if (StickyListHeadersListView.a(a) != null)
            {
                if (!StickyListHeadersListView.h(a))
                {
                    break label0;
                }
                canvas.save();
                canvas.clipRect(0, StickyListHeadersListView.i(a), a.getRight(), a.getBottom());
                StickyListHeadersListView.a(a, canvas, StickyListHeadersListView.a(a), 0L);
                canvas.restore();
            }
            return;
        }
        StickyListHeadersListView.b(a, canvas, StickyListHeadersListView.a(a), 0L);
    }

    private (StickyListHeadersListView stickylistheaderslistview)
    {
        a = stickylistheaderslistview;
        super();
    }

    a(StickyListHeadersListView stickylistheaderslistview, a a1)
    {
        this(stickylistheaderslistview);
    }
}
