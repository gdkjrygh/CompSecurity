// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.presentation.PagingListItemAdapter;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentsModule, CommentRenderer

public static final class setLibrary extends t
    implements Provider
{

    private final CommentsModule module;
    private b renderer;

    public final void attach(l l1)
    {
        renderer = l1.a("com.soundcloud.android.comments.CommentRenderer", com/soundcloud/android/comments/CommentsModule, getClass().getClassLoader());
    }

    public final PagingListItemAdapter get()
    {
        return module.provideCommentsAdapter((CommentRenderer)renderer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(renderer);
    }

    public i(CommentsModule commentsmodule)
    {
        super("com.soundcloud.android.presentation.PagingListItemAdapter<com.soundcloud.android.comments.Comment>", false, "com.soundcloud.android.comments.CommentsModule", "provideCommentsAdapter");
        module = commentsmodule;
        setLibrary(false);
    }
}
