// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.lang.ref.WeakReference;
import rx.Y;
import rx.a.b.a;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackRepository, TrackInfoPresenter, TrackProperty

public class TrackInfoFragment extends DialogFragment
    implements android.view.View.OnClickListener
{
    static class TrackInfoCommentClickListener
        implements TrackInfoPresenter.CommentClickListener
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

                final TrackInfoCommentClickListener this$0;
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
                    this$0 = TrackInfoCommentClickListener.this;
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



        public TrackInfoCommentClickListener(TrackInfoFragment trackinfofragment, EventBus eventbus, PropertySet propertyset)
        {
            class _cls1 extends Handler
            {

                final TrackInfoCommentClickListener this$0;

                public void handleMessage(Message message)
                {
                    eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.collapsePlayer());
                    eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("comments_open"));
                }

                _cls1()
                {
                    this$0 = TrackInfoCommentClickListener.this;
                    super();
                }
            }

            trackInfoFragmentRef = new WeakReference(trackinfofragment);
            eventBus = eventbus;
            track = propertyset;
        }
    }

    private class TrackSubscriber extends DefaultSubscriber
    {

        final TrackInfoFragment this$0;

        public void onError(Throwable throwable)
        {
            String _tmp = TrackInfoFragment.TAG;
            presenter.bindNoDescription(getView());
        }

        public void onNext(PropertySet propertyset)
        {
            View view = getView();
            presenter.bind(view, propertyset, new TrackInfoCommentClickListener(TrackInfoFragment.this, eventBus, propertyset));
            if (propertyset.contains(TrackProperty.DESCRIPTION))
            {
                presenter.bindDescription(view, propertyset);
                return;
            } else
            {
                presenter.showSpinner(view);
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        private TrackSubscriber()
        {
            this$0 = TrackInfoFragment.this;
            super();
        }

        TrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int COLLAPSE_DELAY_MILLIS = 300;
    private static final String EXTRA_URN = "Urn";
    private static final String TAG = com/soundcloud/android/tracks/TrackInfoFragment.getSimpleName();
    EventBus eventBus;
    ImageOperations imageOperations;
    private rx.b loadTrack;
    TrackInfoPresenter presenter;
    private Y subscription;
    TrackRepository trackRepository;

    public TrackInfoFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
        setRetainInstance(true);
    }

    public static TrackInfoFragment create(Urn urn)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("Urn", urn);
        urn = new TrackInfoFragment();
        urn.setArguments(bundle);
        return urn;
    }

    public void onClick(View view)
    {
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.PLAYER_INFO));
        setStyle(2, 0x7f0c02a4);
        loadTrack = trackRepository.fullTrackWithUpdate((Urn)getArguments().getParcelable("Urn")).observeOn(a.a()).cache();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return presenter.create(getActivity().getLayoutInflater(), viewgroup);
    }

    public void onDestroy()
    {
        subscription.unsubscribe();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        subscription = loadTrack.subscribe(new TrackSubscriber(null));
        view.setOnClickListener(this);
    }


}
