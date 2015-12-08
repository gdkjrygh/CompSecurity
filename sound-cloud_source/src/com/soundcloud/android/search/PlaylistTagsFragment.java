// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.EmptyViewController;
import com.soundcloud.android.view.ListenableScrollView;
import com.soundcloud.android.view.ReactiveComponent;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.util.List;
import rx.Y;
import rx.a.b.a;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations, PlaylistTagsPresenter

public class PlaylistTagsFragment extends LightCycleSupportFragment
    implements com.soundcloud.android.view.ListenableScrollView.OnScrollListener, ReactiveComponent
{
    public static interface PlaylistTagsFragmentListener
        extends PlaylistTagsPresenter.Listener
    {

        public abstract void onTagsScrolled();
    }

    private final class RecentsSubscriber extends DefaultSubscriber
    {

        final PlaylistTagsFragment this$0;

        public final volatile void onNext(Object obj)
        {
            onNext((List)obj);
        }

        public final void onNext(List list)
        {
            if (!list.isEmpty())
            {
                presenter.displayRecentTags(getView(), list);
            }
        }

        private RecentsSubscriber()
        {
            this$0 = PlaylistTagsFragment.this;
            super();
        }

        RecentsSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class TagsSubscriber extends DefaultSubscriber
    {

        final PlaylistTagsFragment this$0;

        public final volatile void onNext(Object obj)
        {
            onNext((List)obj);
        }

        public final void onNext(List list)
        {
            presenter.displayPopularTags(getView(), list);
        }

        private TagsSubscriber()
        {
            this$0 = PlaylistTagsFragment.this;
            super();
        }

        TagsSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private rx.c.b allTagsObservable;
    private Y connectionSubscription;
    EmptyViewController emptyViewController;
    EventBus eventBus;
    PlaylistDiscoveryOperations operations;
    PlaylistTagsPresenter presenter;
    private rx.b recentTagsObservable;
    private rx.h.b viewSubscriptions;

    public PlaylistTagsFragment()
    {
        connectionSubscription = RxUtils.invalidSubscription();
        SoundCloudApplication.getObjectGraph().a(this);
        setRetainInstance(true);
    }

    private rx.c.b buildAllTagsObservable()
    {
        return operations.popularPlaylistTags().observeOn(a.a()).replay();
    }

    public volatile rx.b buildObservable()
    {
        return buildObservable();
    }

    public rx.c.b buildObservable()
    {
        rx.c.b b1 = buildAllTagsObservable();
        viewSubscriptions.a(b1.subscribe(new TagsSubscriber(null)));
        return b1;
    }

    public volatile Y connectObservable(rx.b b1)
    {
        return connectObservable((rx.c.b)b1);
    }

    public Y connectObservable(rx.c.b b1)
    {
        allTagsObservable = b1;
        connectionSubscription = allTagsObservable.a();
        return connectionSubscription;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Preconditions.checkArgument(activity instanceof PlaylistTagsFragmentListener, (new StringBuilder("Host activity must be a ")).append(com/soundcloud/android/search/PlaylistTagsFragment$PlaylistTagsFragmentListener).toString());
        presenter.setListener((PlaylistTagsPresenter.Listener)activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        recentTagsObservable = operations.recentPlaylistTags().observeOn(a.a());
        connectObservable(buildAllTagsObservable());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03009e, viewgroup, false);
    }

    public void onDestroy()
    {
        connectionSubscription.unsubscribe();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        viewSubscriptions.unsubscribe();
        super.onDestroyView();
    }

    public void onDetach()
    {
        presenter.setListener(null);
        super.onDetach();
    }

    public void onScroll(int i, int j)
    {
        ((PlaylistTagsFragmentListener)getActivity()).onTagsScrolled();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        emptyViewController.connect(allTagsObservable);
        view.setBackgroundColor(view.getResources().getColor(0x7f0e00a3));
        ((ListenableScrollView)view.findViewById(0x7f0f0208)).setOnScrollListener(this);
        viewSubscriptions = new rx.h.b();
        viewSubscriptions.a(allTagsObservable.subscribe(new TagsSubscriber(null)));
        viewSubscriptions.a(recentTagsObservable.subscribe(new RecentsSubscriber(null)));
    }
}
