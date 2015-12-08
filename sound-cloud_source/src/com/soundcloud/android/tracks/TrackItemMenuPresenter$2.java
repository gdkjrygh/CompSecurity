// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.DialogInterface;
import rx.Y;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemMenuPresenter

class this._cls0
    implements android.content.istener
{

    final TrackItemMenuPresenter this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        TrackItemMenuPresenter.access$200(TrackItemMenuPresenter.this).unsubscribe();
    }

    ()
    {
        this$0 = TrackItemMenuPresenter.this;
        super();
    }
}
