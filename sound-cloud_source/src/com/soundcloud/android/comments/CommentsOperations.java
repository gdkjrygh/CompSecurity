// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.legacy.model.CollectionHolder;
import com.soundcloud.android.api.legacy.model.PublicApiComment;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.R;
import rx.a.a;
import rx.b;
import rx.b.f;

class CommentsOperations
{
    public static class CommentHolder
    {

        final Map comment = new HashMap(2);

        public boolean equals(Object obj)
        {
            while (this == obj || (obj instanceof CommentHolder) && MoreObjects.equal(comment, ((CommentHolder)obj).comment)) 
            {
                return true;
            }
            return false;
        }

        public int hashCode()
        {
            return comment.hashCode();
        }

        public CommentHolder(String s, long l)
        {
            comment.put("body", s);
            comment.put("timestamp", String.valueOf(l));
        }
    }

    static class CommentsCollection extends CollectionHolder
    {

        CommentsCollection()
        {
        }

        CommentsCollection(List list, String s)
        {
            super(list, s);
        }
    }

    final class CommentsPager extends a
    {

        final CommentsOperations this$0;

        public final volatile Object call(Object obj)
        {
            return call((CommentsCollection)obj);
        }

        public final b call(CommentsCollection commentscollection)
        {
            if (commentscollection.getNextHref() != null)
            {
                return comments(commentscollection.getNextHref());
            } else
            {
                return a.finish();
            }
        }

        CommentsPager()
        {
            this$0 = CommentsOperations.this;
            super();
        }
    }


    static final int COMMENTS_PAGE_SIZE = 50;
    static final f TO_COMMENT_VIEW_MODEL = new _cls1();
    private final ApiClientRx apiClientRx;
    private final CommentsPager pager = new CommentsPager();
    private final R scheduler;

    public CommentsOperations(ApiClientRx apiclientrx, R r)
    {
        apiClientRx = apiclientrx;
        scheduler = r;
    }

    private b comments(String s)
    {
        s = ApiRequest.get(s).forPublicApi().build();
        return apiClientRx.mappedResponse(s, com/soundcloud/android/comments/CommentsOperations$CommentsCollection).subscribeOn(scheduler);
    }

    b addComment(Urn urn, String s, long l)
    {
        urn = ApiRequest.post(ApiEndpoints.TRACK_COMMENTS.path(new Object[] {
            Long.valueOf(urn.getNumericId())
        })).forPublicApi().withContent(new CommentHolder(s, l)).build();
        return apiClientRx.mappedResponse(urn, com/soundcloud/android/api/legacy/model/PublicApiComment).subscribeOn(scheduler);
    }

    b comments(Urn urn)
    {
        urn = ApiRequest.get(ApiEndpoints.TRACK_COMMENTS.path(new Object[] {
            Long.valueOf(urn.getNumericId())
        })).forPublicApi().addQueryParam("linked_partitioning", new Object[] {
            "1"
        }).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            Integer.valueOf(50)
        }).build();
        return apiClientRx.mappedResponse(urn, com/soundcloud/android/comments/CommentsOperations$CommentsCollection).subscribeOn(scheduler);
    }

    CommentsPager pager()
    {
        return pager;
    }



    private class _cls1
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((CommentsCollection)obj);
        }

        public final List call(CommentsCollection commentscollection)
        {
            ArrayList arraylist = new ArrayList(50);
            for (commentscollection = commentscollection.iterator(); commentscollection.hasNext(); arraylist.add(new Comment((PublicApiComment)commentscollection.next()))) { }
            return arraylist;
        }

        _cls1()
        {
        }
    }

}
