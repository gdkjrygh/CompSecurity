// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.DialogInterface;
import rx.Y;

// Referenced classes of package com.soundcloud.android.stations:
//            StartStationPresenter

class this._cls0
    implements android.content.Listener
{

    final StartStationPresenter this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        StartStationPresenter.access$200(StartStationPresenter.this).unsubscribe();
    }

    ()
    {
        this$0 = StartStationPresenter.this;
        super();
    }
}
