// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.view.ListViewController;
import com.soundcloud.android.view.ReactiveListComponent;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;
import rx.Y;
import rx.a.b.a;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentsOperations, Comment

public class CommentsFragment extends LightCycleSupportFragment
    implements ReactiveListComponent
{

    static final String EXTRA_TRACK_URN = "track_urn";
    PagingListItemAdapter adapter;
    private rx.c.b comments;
    ListViewController listViewController;
    Navigator navigator;
    CommentsOperations operations;
    private Y subscription;

    public CommentsFragment()
    {
        subscription = RxUtils.invalidSubscription();
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
        addLifeCycleComponents();
    }

    private void addLifeCycleComponents()
    {
        listViewController.setAdapter(adapter, operations.pager(), CommentsOperations.TO_COMMENT_VIEW_MODEL);
    }

    public static CommentsFragment create(Urn urn)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("track_urn", urn);
        urn = new CommentsFragment();
        urn.setArguments(bundle);
        return urn;
    }

    public rx.b buildObservable()
    {
        Urn urn = (Urn)getArguments().getParcelable("track_urn");
        comments = operations.pager().page(operations.comments(urn)).map(CommentsOperations.TO_COMMENT_VIEW_MODEL).observeOn(a.a()).replay(1);
        comments.subscribe(adapter);
        return comments;
    }

    public Y connectObservable(rx.b b1)
    {
        subscription = comments.a();
        return subscription;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        connectObservable(buildObservable());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03004d, viewgroup, false);
    }

    public void onDestroy()
    {
        subscription.unsubscribe();
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        navigator.openProfile(getActivity(), ((Comment)adapter.getItem(i)).getUserUrn());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        listViewController.connect(this, comments);
    }
}
