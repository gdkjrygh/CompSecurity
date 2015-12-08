// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.view.View;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;

final class Event
    implements android.view.r
{

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131689803: 
            Events.post(new com.pinterest.base.ctEvent(com.pinterest.base.S, true));
            return;

        case 2131689804: 
            Events.post(new com.pinterest.base.nnectEvent(com.pinterest.base.S));
            return;

        case 2131689805: 
            Experiments.aa();
            break;
        }
    }

    Event()
    {
    }
}
