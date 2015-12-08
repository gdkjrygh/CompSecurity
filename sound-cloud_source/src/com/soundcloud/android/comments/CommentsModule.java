// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.presentation.PagingListItemAdapter;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentRenderer

public class CommentsModule
{

    public CommentsModule()
    {
    }

    PagingListItemAdapter provideCommentsAdapter(CommentRenderer commentrenderer)
    {
        return new PagingListItemAdapter(commentrenderer);
    }
}
