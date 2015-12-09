// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.graphics.Canvas;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersListView, WrapperViewList

private class <init>
    implements <init>
{

    final StickyListHeadersListView this$0;

    public void onDispatchDrawOccurred(Canvas canvas)
    {
label0:
        {
            if (android.os.ewListLifeCycleListener < 8)
            {
                StickyListHeadersListView.access$900(StickyListHeadersListView.this, StickyListHeadersListView.access$800(StickyListHeadersListView.this).getFixedFirstVisibleItem());
            }
            if (StickyListHeadersListView.access$300(StickyListHeadersListView.this) != null)
            {
                if (!StickyListHeadersListView.access$1000(StickyListHeadersListView.this))
                {
                    break label0;
                }
                canvas.save();
                canvas.clipRect(0, StickyListHeadersListView.access$1100(StickyListHeadersListView.this), getRight(), getBottom());
                StickyListHeadersListView.access$1200(StickyListHeadersListView.this, canvas, StickyListHeadersListView.access$300(StickyListHeadersListView.this), 0L);
                canvas.restore();
            }
            return;
        }
        StickyListHeadersListView.access$1300(StickyListHeadersListView.this, canvas, StickyListHeadersListView.access$300(StickyListHeadersListView.this), 0L);
    }

    private ()
    {
        this$0 = StickyListHeadersListView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
