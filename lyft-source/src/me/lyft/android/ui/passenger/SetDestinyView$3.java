// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.domain.location.Location;

// Referenced classes of package me.lyft.android.ui.passenger:
//            SetDestinyView

class this._cls0
    implements android.view.ner
{

    final SetDestinyView this$0;

    public void onClick(View view)
    {
        if (destinySession.getLocation().isNull())
        {
            openPlaceSearch();
            return;
        } else
        {
            SetDestinyView.access$100(SetDestinyView.this);
            return;
        }
    }

    on()
    {
        this$0 = SetDestinyView.this;
        super();
    }
}
