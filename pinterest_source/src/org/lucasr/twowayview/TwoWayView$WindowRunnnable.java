// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;


// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class <init>
{

    private int mOriginalAttachCount;
    final TwoWayView this$0;

    public void rememberWindowAttachCount()
    {
        mOriginalAttachCount = TwoWayView.access$3000(TwoWayView.this);
    }

    public boolean sameWindow()
    {
        return hasWindowFocus() && TwoWayView.access$3100(TwoWayView.this) == mOriginalAttachCount;
    }

    private ()
    {
        this$0 = TwoWayView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
