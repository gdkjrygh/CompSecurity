// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import java.lang.ref.WeakReference;
import rx.b;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackInfoFragment

static class track
    implements track
{

    private final Handler collapseDelayHandler = new _cls1();
    private final EventBus eventBus;
    private final PropertySet track;
    private final WeakReference trackInfoFragmentRef;

    private void collapsePlayerOnDelay(Context context)
    {
        subscribeToCollapsedEvent(context);
        collapseDelayHandler.sendEmptyMessageDelayed(0, 300L);
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("comments_open"));
    }

    private DefaultSubscriber goToCommentsPage(final Context context)
    {
        class _cls2 extends DefaultSubscriber
        {

            final TrackInfoFragment.TrackInfoCommentClickListener this$0;
            final Context val$context;

            public void onNext(PlayerUIEvent playeruievent)
            {
                context.startActivity((new Intent(context, com/soundcloud/android/comments/TrackCommentsActivity)).putExtra("extra", track));
            }

            public volatile void onNext(Object obj)
            {
                onNext((PlayerUIEvent)obj);
            }

            _cls2()
            {
                this$0 = TrackInfoFragment.TrackInfoCommentClickListener.this;
                context = context1;
                super();
            }
        }

        return new _cls2();
    }

    private void subscribeToCollapsedEvent(Context context)
    {
        eventBus.queue(EventQueue.PLAYER_UI).first(PlayerUIEvent.PLAYER_IS_COLLAPSED).subscribe(goToCommentsPage(context));
    }

    public void onCommentsClicked()
    {
        TrackInfoFragment trackinfofragment = (TrackInfoFragment)trackInfoFragmentRef.get();
        if (trackinfofragment != null && !trackinfofragment.isDetached())
        {
            collapsePlayerOnDelay(trackinfofragment.getActivity());
            trackinfofragment.dismiss();
        }
    }



    public _cls1.this._cls0(TrackInfoFragment trackinfofragment, EventBus eventbus, PropertySet propertyset)
    {
        class _cls1 extends Handler
        {

            final TrackInfoFragment.TrackInfoCommentClickListener this$0;

            public void handleMessage(Message message)
            {
                eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.collapsePlayer());
                eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("comments_open"));
            }

            _cls1()
            {
                this$0 = TrackInfoFragment.TrackInfoCommentClickListener.this;
                super();
            }
        }

        trackInfoFragmentRef = new WeakReference(trackinfofragment);
        eventBus = eventbus;
        track = propertyset;
    }
}
