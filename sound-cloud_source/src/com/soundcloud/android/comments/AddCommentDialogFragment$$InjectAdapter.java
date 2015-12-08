// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.comments:
//            AddCommentDialogFragment, CommentsOperations

public final class  extends b
    implements a, Provider
{

    private b commentsOperations;
    private b eventBus;

    public final void attach(l l1)
    {
        commentsOperations = l1.a("com.soundcloud.android.comments.CommentsOperations", com/soundcloud/android/comments/AddCommentDialogFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/comments/AddCommentDialogFragment, getClass().getClassLoader());
    }

    public final AddCommentDialogFragment get()
    {
        AddCommentDialogFragment addcommentdialogfragment = new AddCommentDialogFragment();
        injectMembers(addcommentdialogfragment);
        return addcommentdialogfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(commentsOperations);
        set1.add(eventBus);
    }

    public final void injectMembers(AddCommentDialogFragment addcommentdialogfragment)
    {
        addcommentdialogfragment.commentsOperations = (CommentsOperations)commentsOperations.get();
        addcommentdialogfragment.eventBus = (EventBus)eventBus.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AddCommentDialogFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.comments.AddCommentDialogFragment", "members/com.soundcloud.android.comments.AddCommentDialogFragment", false, com/soundcloud/android/comments/AddCommentDialogFragment);
    }
}
