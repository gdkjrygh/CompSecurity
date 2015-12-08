// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.comments.TrackCommentsActivity;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

class val.context extends DefaultSubscriber
{

    final onNext this$0;
    final Context val$context;

    public void onNext(PlayerUIEvent playeruievent)
    {
        val$context.startActivity((new Intent(val$context, com/soundcloud/android/comments/TrackCommentsActivity)).putExtra("extra", cess._mth300(this._cls0.this)));
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlayerUIEvent)obj);
    }

    ()
    {
        this$0 = final_;
        val$context = Context.this;
        super();
    }
}
