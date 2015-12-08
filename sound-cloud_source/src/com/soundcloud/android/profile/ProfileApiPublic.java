// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.legacy.model.SoundAssociationHolder;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.reflect.TypeToken;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileApi

public class ProfileApiPublic
    implements ProfileApi
{

    private static final f PLAYLISTS_TO_COLLECTION = new _cls3();
    private static final f SOUND_ASSOCIATIONS_TO_LIKES_COLLECTION = new _cls2();
    private static final f SOUND_ASSOCIATIONS_TO_POSTS_COLLECTION = new _cls1();
    private static final f USERS_TO_COLLECTION = new _cls4();
    private final ApiClientRx apiClientRx;
    private final TypeToken playlistHolderToken = new _cls5();
    private final TypeToken userHolderToken = new _cls6();

    public ProfileApiPublic(ApiClientRx apiclientrx)
    {
        apiClientRx = apiclientrx;
    }

    private b getLikesCollection(String s)
    {
        s = ApiRequest.get(s).forPublicApi().addQueryParam("linked_partitioning", new Object[] {
            "1"
        }).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            Integer.valueOf(30)
        }).build();
        return apiClientRx.mappedResponse(s, com/soundcloud/android/api/legacy/model/SoundAssociationHolder).map(SOUND_ASSOCIATIONS_TO_LIKES_COLLECTION);
    }

    private b getPlaylists(String s)
    {
        s = ApiRequest.get(s).forPublicApi().addQueryParam("linked_partitioning", new Object[] {
            "1"
        }).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            Integer.valueOf(30)
        }).build();
        return apiClientRx.mappedResponse(s, playlistHolderToken).map(PLAYLISTS_TO_COLLECTION);
    }

    private b getPostsCollection(String s)
    {
        s = ApiRequest.get(s).forPublicApi().addQueryParam("linked_partitioning", new Object[] {
            "1"
        }).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            Integer.valueOf(30)
        }).build();
        return apiClientRx.mappedResponse(s, com/soundcloud/android/api/legacy/model/SoundAssociationHolder).map(SOUND_ASSOCIATIONS_TO_POSTS_COLLECTION);
    }

    private b getUsers(String s)
    {
        s = ApiRequest.get(s).forPublicApi().addQueryParam("linked_partitioning", new Object[] {
            "1"
        }).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            Integer.valueOf(30)
        }).build();
        return apiClientRx.mappedResponse(s, userHolderToken).map(USERS_TO_COLLECTION);
    }

    public b userFollowers(Urn urn)
    {
        return getUsers(ApiEndpoints.LEGACY_USER_FOLLOWERS.path(new Object[] {
            Long.valueOf(urn.getNumericId())
        }));
    }

    public b userFollowers(String s)
    {
        return getUsers(s);
    }

    public b userFollowings(Urn urn)
    {
        return getUsers(ApiEndpoints.LEGACY_USER_FOLLOWINGS.path(new Object[] {
            Long.valueOf(urn.getNumericId())
        }));
    }

    public b userFollowings(String s)
    {
        return getUsers(s);
    }

    public b userLikes(Urn urn)
    {
        return getLikesCollection(ApiEndpoints.LEGACY_USER_LIKES.path(new Object[] {
            Long.valueOf(urn.getNumericId())
        }));
    }

    public b userLikes(String s)
    {
        return getLikesCollection(s);
    }

    public b userPlaylists(Urn urn)
    {
        return getPlaylists(ApiEndpoints.LEGACY_USER_PLAYLISTS.path(new Object[] {
            Long.valueOf(urn.getNumericId())
        }));
    }

    public b userPlaylists(String s)
    {
        return getPlaylists(s);
    }

    public b userPosts(Urn urn)
    {
        return getPostsCollection(ApiEndpoints.LEGACY_USER_SOUNDS.path(new Object[] {
            Long.valueOf(urn.getNumericId())
        }));
    }

    public b userPosts(String s)
    {
        return getPostsCollection(s);
    }


    private class _cls5 extends TypeToken
    {

        final ProfileApiPublic this$0;

        _cls5()
        {
            this$0 = ProfileApiPublic.this;
            super();
        }
    }


    private class _cls6 extends TypeToken
    {

        final ProfileApiPublic this$0;

        _cls6()
        {
            this$0 = ProfileApiPublic.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final ModelCollection call(SoundAssociationHolder soundassociationholder)
        {
            ArrayList arraylist = new ArrayList(soundassociationholder.size());
            for (Iterator iterator = soundassociationholder.iterator(); iterator.hasNext();)
            {
                Object obj = (SoundAssociation)iterator.next();
                Object obj1 = ((SoundAssociation) (obj)).getPlayable();
                if (obj1 instanceof PublicApiTrack)
                {
                    obj1 = ((PublicApiTrack)obj1).toApiMobileTrack();
                    if (((SoundAssociation) (obj)).isRepost())
                    {
                        obj = new ApiTrackRepost(((com.soundcloud.android.api.model.ApiTrack) (obj1)), ((SoundAssociation) (obj)).created_at);
                    } else
                    {
                        obj = new ApiTrackPost(((com.soundcloud.android.api.model.ApiTrack) (obj1)));
                    }
                    arraylist.add(obj);
                } else
                {
                    obj1 = ((PublicApiPlaylist)obj1).toApiMobilePlaylist();
                    if (((SoundAssociation) (obj)).isRepost())
                    {
                        obj = new ApiPlaylistRepost(((com.soundcloud.android.api.model.ApiPlaylist) (obj1)), ((SoundAssociation) (obj)).created_at);
                    } else
                    {
                        obj = new ApiPlaylistPost(((com.soundcloud.android.api.model.ApiPlaylist) (obj1)));
                    }
                    arraylist.add(obj);
                }
            }

            return new ModelCollection(arraylist, soundassociationholder.getNextHref());
        }

        public final volatile Object call(Object obj)
        {
            return call((SoundAssociationHolder)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final ModelCollection call(SoundAssociationHolder soundassociationholder)
        {
            ArrayList arraylist = new ArrayList(soundassociationholder.size());
            for (Iterator iterator = soundassociationholder.iterator(); iterator.hasNext();)
            {
                SoundAssociation soundassociation = (SoundAssociation)iterator.next();
                com.soundcloud.android.api.legacy.model.Playable playable = soundassociation.getPlayable();
                if (playable instanceof PublicApiTrack)
                {
                    arraylist.add(new ApiTrackLike(((PublicApiTrack)playable).toApiMobileTrack(), soundassociation.created_at));
                } else
                {
                    arraylist.add(new ApiPlaylistLike(((PublicApiPlaylist)playable).toApiMobilePlaylist(), soundassociation.created_at));
                }
            }

            return new ModelCollection(arraylist, soundassociationholder.getNextHref());
        }

        public final volatile Object call(Object obj)
        {
            return call((SoundAssociationHolder)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements f
    {

        public final ModelCollection call(CollectionHolder collectionholder)
        {
            ArrayList arraylist = new ArrayList(collectionholder.size());
            for (Iterator iterator = collectionholder.iterator(); iterator.hasNext(); arraylist.add(((PublicApiPlaylist)iterator.next()).toApiMobilePlaylist())) { }
            return new ModelCollection(arraylist, collectionholder.getNextHref());
        }

        public final volatile Object call(Object obj)
        {
            return call((CollectionHolder)obj);
        }

        _cls3()
        {
        }
    }


    private class _cls4
        implements f
    {

        public final ModelCollection call(CollectionHolder collectionholder)
        {
            ArrayList arraylist = new ArrayList(collectionholder.size());
            for (Iterator iterator = collectionholder.iterator(); iterator.hasNext(); arraylist.add(((PublicApiUser)iterator.next()).toApiMobileUser())) { }
            return new ModelCollection(arraylist, collectionholder.getNextHref());
        }

        public final volatile Object call(Object obj)
        {
            return call((CollectionHolder)obj);
        }

        _cls4()
        {
        }
    }

}
