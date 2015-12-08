// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.view.ListViewController;
import com.soundcloud.android.view.ReactiveListComponent;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import rx.X;
import rx.Y;
import rx.a.b.a;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreTracksOperations, ExploreTracksCategoryActivity, ExploreGenresAdapter, ExploreGenre, 
//            GenreSection

public class ExploreGenresFragment extends LightCycleSupportFragment
    implements ReactiveListComponent
{
    private final class GenreSectionSubscriber extends X
    {

        final ExploreGenresFragment this$0;

        public final void onCompleted()
        {
            adapter.onCompleted();
        }

        public final void onError(Throwable throwable)
        {
            adapter.onError(throwable);
        }

        public final void onNext(GenreSection genresection)
        {
            adapter.onNext(genresection.getItems());
            adapter.demarcateSection(genresection);
        }

        public final volatile void onNext(Object obj)
        {
            onNext((GenreSection)obj);
        }

        private GenreSectionSubscriber()
        {
            this$0 = ExploreGenresFragment.this;
            super();
        }

        GenreSectionSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final f GENRES_TO_SECTIONS = new _cls1();
    ExploreGenresAdapter adapter;
    private Y connectionSubscription;
    EventBus eventBus;
    ExploreTracksOperations exploreOperations;
    ListViewController listViewController;
    private rx.c.b observable;

    public ExploreGenresFragment()
    {
        connectionSubscription = RxUtils.invalidSubscription();
        SoundCloudApplication.getObjectGraph().a(this);
        listViewController.setAdapter(adapter);
    }

    public volatile rx.b buildObservable()
    {
        return buildObservable();
    }

    public rx.c.b buildObservable()
    {
        rx.c.b b1 = exploreOperations.getCategories().flatMap(GENRES_TO_SECTIONS).observeOn(a.a()).replay();
        b1.subscribe(new GenreSectionSubscriber(null));
        return b1;
    }

    public volatile Y connectObservable(rx.b b1)
    {
        return connectObservable((rx.c.b)b1);
    }

    public Y connectObservable(rx.c.b b1)
    {
        observable = b1;
        connectionSubscription = b1.a();
        return connectionSubscription;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        connectObservable(buildObservable());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030055, viewgroup, false);
    }

    public void onDestroy()
    {
        connectionSubscription.unsubscribe();
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Intent intent = new Intent(getActivity(), com/soundcloud/android/explore/ExploreTracksCategoryActivity);
        int j = ((ListView)adapterview).getHeaderViewsCount();
        adapterview = (ExploreGenre)adapter.getItem(i - j);
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create((String)view.getTag(), adapterview));
        intent.putExtra("genre", adapterview);
        intent.putExtra("screen_tag", view.getTag().toString());
        startActivity(intent);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        listViewController.connect(this, observable);
    }


    private class _cls1
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((ExploreGenresSections)obj);
        }

        public final rx.b call(ExploreGenresSections exploregenressections)
        {
            return rx.b.from(Arrays.asList(new GenreSection[] {
                new GenreSection(1, 0x7f070133, exploregenressections.getMusic()), new GenreSection(0, 0x7f070132, exploregenressections.getAudio())
            }));
        }

        _cls1()
        {
        }
    }

}
