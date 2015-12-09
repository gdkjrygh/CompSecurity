// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.amazon.motiongestures.GestureEvent;
import com.amazon.motiongestures.GestureListener;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

class a
    implements GestureListener
{

    final AbsDrawerActivity a;

    public void onGestureEvent(GestureEvent gestureevent)
    {
        switch (gestureevent.direction)
        {
        default:
            return;

        case 2: // '\002'
            a.l();
            return;

        case 1: // '\001'
            a.k();
            return;
        }
    }

    (AbsDrawerActivity absdraweractivity)
    {
        a = absdraweractivity;
        super();
    }
}
