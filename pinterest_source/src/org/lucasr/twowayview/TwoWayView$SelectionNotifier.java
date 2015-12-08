// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;


// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class <init>
    implements Runnable
{

    final TwoWayView this$0;

    public void run()
    {
        if (TwoWayView.access$500(TwoWayView.this))
        {
            if (TwoWayView.access$1400(TwoWayView.this) != null)
            {
                post(this);
            }
            return;
        } else
        {
            TwoWayView.access$2800(TwoWayView.this);
            TwoWayView.access$2900(TwoWayView.this);
            return;
        }
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
