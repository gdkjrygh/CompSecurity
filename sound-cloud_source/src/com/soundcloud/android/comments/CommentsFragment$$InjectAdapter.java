// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.android.view.ListViewController;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentsFragment, CommentsOperations

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b listViewController;
    private b navigator;
    private b operations;
    private b supertype;

    public final void attach(l l1)
    {
        operations = l1.a("com.soundcloud.android.comments.CommentsOperations", com/soundcloud/android/comments/CommentsFragment, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.presentation.PagingListItemAdapter<com.soundcloud.android.comments.Comment>", com/soundcloud/android/comments/CommentsFragment, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/comments/CommentsFragment, getClass().getClassLoader());
        listViewController = l1.a("com.soundcloud.android.view.ListViewController", com/soundcloud/android/comments/CommentsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/comments/CommentsFragment, getClass().getClassLoader(), false);
    }

    public final CommentsFragment get()
    {
        CommentsFragment commentsfragment = new CommentsFragment();
        injectMembers(commentsfragment);
        return commentsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(operations);
        set1.add(adapter);
        set1.add(navigator);
        set1.add(listViewController);
        set1.add(supertype);
    }

    public final void injectMembers(CommentsFragment commentsfragment)
    {
        commentsfragment.operations = (CommentsOperations)operations.get();
        commentsfragment.adapter = (PagingListItemAdapter)adapter.get();
        commentsfragment.navigator = (Navigator)navigator.get();
        commentsfragment.listViewController = (ListViewController)listViewController.get();
        supertype.injectMembers(commentsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CommentsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.comments.CommentsFragment", "members/com.soundcloud.android.comments.CommentsFragment", false, com/soundcloud/android/comments/CommentsFragment);
    }
}
