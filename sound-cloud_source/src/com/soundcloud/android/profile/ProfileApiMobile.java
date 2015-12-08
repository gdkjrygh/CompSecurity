// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.reflect.TypeToken;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileApi

public class ProfileApiMobile
    implements ProfileApi
{

    private static final f LIKE_HOLDER_TO_LIKES_COLLECTION = new _cls4();
    private static final f POST_HOLDER_TO_POST_COLLECTION = new _cls3();
    private final ApiClientRx apiClientRx;
    private final TypeToken apiLikeHolderToken = new _cls2();
    private final TypeToken apiPostHolderToken = new _cls1();

    public ProfileApiMobile(ApiClientRx apiclientrx)
    {
        apiClientRx = apiclientrx;
    }

    private b getLikesCollection(String s)
    {
        s = ApiRequest.get(s).forPrivateApi(1).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            Integer.valueOf(30)
        }).build();
        return apiClientRx.mappedResponse(s, apiLikeHolderToken).map(LIKE_HOLDER_TO_LIKES_COLLECTION);
    }

    private b getPostsCollection(String s)
    {
        s = ApiRequest.get(s).forPrivateApi(1).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            Integer.valueOf(30)
        }).build();
        return apiClientRx.mappedResponse(s, apiPostHolderToken).map(POST_HOLDER_TO_POST_COLLECTION);
    }

    public b userFollowers(Urn urn)
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public b userFollowers(String s)
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public b userFollowings(Urn urn)
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public b userFollowings(String s)
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public b userLikes(Urn urn)
    {
        return getLikesCollection(ApiEndpoints.USER_LIKES.path(new Object[] {
            urn
        }));
    }

    public b userLikes(String s)
    {
        return getLikesCollection(s);
    }

    public b userPlaylists(Urn urn)
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public b userPlaylists(String s)
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public b userPosts(Urn urn)
    {
        return getPostsCollection(ApiEndpoints.USER_POSTS.path(new Object[] {
            urn
        }));
    }

    public b userPosts(String s)
    {
        return getPostsCollection(s);
    }


    private class _cls1 extends TypeToken
    {

        final ProfileApiMobile this$0;

        _cls1()
        {
            this$0 = ProfileApiMobile.this;
            super();
        }
    }


    private class _cls2 extends TypeToken
    {

        final ProfileApiMobile this$0;

        _cls2()
        {
            this$0 = ProfileApiMobile.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        public final ModelCollection call(ModelCollection modelcollection)
        {
            Object obj = modelcollection.getCollection();
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Optional optional = ((ApiPostHolder)((Iterator) (obj)).next()).getPost();
                if (optional.isPresent())
                {
                    arraylist.add(optional.get());
                }
            } while (true);
            return new ModelCollection(arraylist, modelcollection.getLinks());
        }

        public final volatile Object call(Object obj)
        {
            return call((ModelCollection)obj);
        }

        _cls3()
        {
        }
    }


    private class _cls4
        implements f
    {

        public final ModelCollection call(ModelCollection modelcollection)
        {
            Object obj = modelcollection.getCollection();
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Optional optional = ((ApiLikeHolder)((Iterator) (obj)).next()).getLike();
                if (optional.isPresent())
                {
                    arraylist.add(optional.get());
                }
            } while (true);
            return new ModelCollection(arraylist, modelcollection.getLinks());
        }

        public final volatile Object call(Object obj)
        {
            return call((ModelCollection)obj);
        }

        _cls4()
        {
        }
    }

}
