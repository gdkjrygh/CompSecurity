// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;


// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastCircleFragment, SeekCircle

private class <init>
    implements <init>
{

    final MinuteCastCircleFragment this$0;

    public void onProgressChanged(SeekCircle seekcircle, int i, boolean flag)
    {
        if (flag || i == 0)
        {
            setSelectedMinute(i);
        }
    }

    public void onStartTrackingTouch(SeekCircle seekcircle)
    {
    }

    public void onStopTrackingTouch(SeekCircle seekcircle)
    {
    }

    private ()
    {
        this$0 = MinuteCastCircleFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
