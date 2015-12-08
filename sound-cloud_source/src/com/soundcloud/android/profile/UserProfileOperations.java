// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.android.search.LoadPlaylistLikedStatuses;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.users.UserRepository;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;
import rx.R;
import rx.b;
import rx.b.f;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileApi, WriteMixedRecordsCommand

class UserProfileOperations
{

    private static final g MERGE_REPOSTER = new _cls3();
    private static final f TO_PAGED_REMOTE_COLLECTION = new _cls1();
    private final LoadPlaylistLikedStatuses loadPlaylistLikedStatuses;
    private final f mergePlayableInfo = new _cls2();
    private final ProfileApi profileApi;
    private final R scheduler;
    private final UserRepository userRepository;
    private final WriteMixedRecordsCommand writeMixedRecordsCommand;

    UserProfileOperations(ProfileApi profileapi, R r, LoadPlaylistLikedStatuses loadplaylistlikedstatuses, UserRepository userrepository, WriteMixedRecordsCommand writemixedrecordscommand)
    {
        profileApi = profileapi;
        scheduler = r;
        loadPlaylistLikedStatuses = loadplaylistlikedstatuses;
        userRepository = userrepository;
        writeMixedRecordsCommand = writemixedrecordscommand;
    }

    private PropertySet createPostForPlayback(PlayableItem playableitem)
    {
        PropertySet propertyset = PropertySet.from(new PropertyBinding[] {
            TrackProperty.URN.bind(playableitem.getEntityUrn())
        });
        if (playableitem.isRepost())
        {
            propertyset.put(PostProperty.REPOSTER_URN, playableitem.getReposterUrn());
        }
        return propertyset;
    }

    private com.soundcloud.rx.Pager.PagingFunction pagingFunction(final Command nextPage)
    {
        return new _cls13();
    }

    public com.soundcloud.rx.Pager.PagingFunction followersPagingFunction()
    {
        return pagingFunction(new _cls12());
    }

    public com.soundcloud.rx.Pager.PagingFunction followingsPagingFunction()
    {
        return pagingFunction(new _cls11());
    }

    public b getLocalAndSyncedProfileUser(Urn urn)
    {
        return userRepository.localAndSyncedUserInfo(urn).map(new _cls5());
    }

    public b getLocalProfileUser(Urn urn)
    {
        return userRepository.localUserInfo(urn).map(new _cls4());
    }

    public b getSyncedProfileUser(Urn urn)
    {
        return userRepository.syncedUserInfo(urn).map(new _cls6());
    }

    public com.soundcloud.rx.Pager.PagingFunction likesPagingFunction()
    {
        return pagingFunction(new _cls9());
    }

    public b pagedFollowers(Urn urn)
    {
        return profileApi.userFollowers(urn).doOnNext(writeMixedRecordsCommand.toAction()).map(TO_PAGED_REMOTE_COLLECTION).subscribeOn(scheduler);
    }

    public b pagedFollowings(Urn urn)
    {
        return profileApi.userFollowings(urn).doOnNext(writeMixedRecordsCommand.toAction()).map(TO_PAGED_REMOTE_COLLECTION).subscribeOn(scheduler);
    }

    public b pagedLikes(Urn urn)
    {
        return profileApi.userLikes(urn).doOnNext(writeMixedRecordsCommand.toAction()).map(TO_PAGED_REMOTE_COLLECTION).map(mergePlayableInfo).subscribeOn(scheduler);
    }

    public b pagedPlaylists(Urn urn)
    {
        return profileApi.userPlaylists(urn).doOnNext(writeMixedRecordsCommand.toAction()).map(TO_PAGED_REMOTE_COLLECTION).map(mergePlayableInfo).subscribeOn(scheduler);
    }

    public b pagedPostItems(Urn urn)
    {
        return profileApi.userPosts(urn).doOnNext(writeMixedRecordsCommand.toAction()).map(TO_PAGED_REMOTE_COLLECTION).map(mergePlayableInfo).zipWith(userRepository.userInfo(urn), MERGE_REPOSTER).subscribeOn(scheduler);
    }

    public com.soundcloud.rx.Pager.PagingFunction playlistsPagingFunction()
    {
        return pagingFunction(new _cls10());
    }

    public b postsForPlayback(final List playableItems)
    {
        return b.create(new _cls8());
    }

    public com.soundcloud.rx.Pager.PagingFunction postsPagingFunction(final Urn user)
    {
        return pagingFunction(new _cls7());
    }











    private class _cls2
        implements f
    {

        final UserProfileOperations this$0;

        public PagedRemoteCollection call(PagedRemoteCollection pagedremotecollection)
        {
            Map map = loadPlaylistLikedStatuses.call(pagedremotecollection);
            Iterator iterator = pagedremotecollection.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PropertySet propertyset = (PropertySet)iterator.next();
                Urn urn = (Urn)propertyset.getOrElse(PlaylistProperty.URN, Urn.NOT_SET);
                if (map.containsKey(urn))
                {
                    propertyset.update((PropertySet)map.get(urn));
                }
            } while (true);
            return pagedremotecollection;
        }

        public volatile Object call(Object obj)
        {
            return call((PagedRemoteCollection)obj);
        }

        _cls2()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls13
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final UserProfileOperations this$0;
        final Command val$nextPage;

        public volatile Object call(Object obj)
        {
            return call((PagedRemoteCollection)obj);
        }

        public b call(PagedRemoteCollection pagedremotecollection)
        {
            pagedremotecollection = pagedremotecollection.nextPageLink();
            if (pagedremotecollection.isPresent())
            {
                return ((b)nextPage.call(pagedremotecollection.get())).subscribeOn(scheduler);
            } else
            {
                return Pager.finish();
            }
        }

        _cls13()
        {
            this$0 = UserProfileOperations.this;
            nextPage = command;
            super();
        }
    }


    private class _cls12 extends Command
    {

        final UserProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        public b call(String s)
        {
            return profileApi.userFollowers(s).doOnNext(writeMixedRecordsCommand.toAction()).map(UserProfileOperations.TO_PAGED_REMOTE_COLLECTION).subscribeOn(scheduler);
        }

        _cls12()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls11 extends Command
    {

        final UserProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        public b call(String s)
        {
            return profileApi.userFollowings(s).doOnNext(writeMixedRecordsCommand.toAction()).map(UserProfileOperations.TO_PAGED_REMOTE_COLLECTION).subscribeOn(scheduler);
        }

        _cls11()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final UserProfileOperations this$0;

        public ProfileUser call(PropertySet propertyset)
        {
            return new ProfileUser(propertyset);
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls5()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final UserProfileOperations this$0;

        public ProfileUser call(PropertySet propertyset)
        {
            return new ProfileUser(propertyset);
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls4()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls6
        implements f
    {

        final UserProfileOperations this$0;

        public ProfileUser call(PropertySet propertyset)
        {
            return new ProfileUser(propertyset);
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls6()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls9 extends Command
    {

        final UserProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        public b call(String s)
        {
            return profileApi.userLikes(s).doOnNext(writeMixedRecordsCommand.toAction()).map(UserProfileOperations.TO_PAGED_REMOTE_COLLECTION).map(mergePlayableInfo).subscribeOn(scheduler);
        }

        _cls9()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls10 extends Command
    {

        final UserProfileOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        public b call(String s)
        {
            return profileApi.userPlaylists(s).doOnNext(writeMixedRecordsCommand.toAction()).map(UserProfileOperations.TO_PAGED_REMOTE_COLLECTION).map(mergePlayableInfo).subscribeOn(scheduler);
        }

        _cls10()
        {
            this$0 = UserProfileOperations.this;
            super();
        }
    }


    private class _cls8
        implements rx.b.f
    {

        final UserProfileOperations this$0;
        final List val$playableItems;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = playableItems.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PlayableItem playableitem = (PlayableItem)iterator.next();
                if (playableitem.getEntityUrn().isTrack())
                {
                    arraylist.add(createPostForPlayback(playableitem));
                }
            } while (true);
            x.onNext(arraylist);
            x.onCompleted();
        }

        _cls8()
        {
            this$0 = UserProfileOperations.this;
            playableItems = list;
            super();
        }
    }


    private class _cls7 extends Command
    {

        final UserProfileOperations this$0;
        final Urn val$user;

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        public b call(String s)
        {
            return profileApi.userPosts(s).doOnNext(writeMixedRecordsCommand.toAction()).map(UserProfileOperations.TO_PAGED_REMOTE_COLLECTION).map(mergePlayableInfo).zipWith(userRepository.userInfo(user), UserProfileOperations.MERGE_REPOSTER).subscribeOn(scheduler);
        }

        _cls7()
        {
            this$0 = UserProfileOperations.this;
            user = urn;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final PagedRemoteCollection call(ModelCollection modelcollection)
        {
            return new PagedRemoteCollection(modelcollection);
        }

        public final volatile Object call(Object obj)
        {
            return call((ModelCollection)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls3
        implements g
    {

        public final PagedRemoteCollection call(PagedRemoteCollection pagedremotecollection, PropertySet propertyset)
        {
            Iterator iterator = pagedremotecollection.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PropertySet propertyset1 = (PropertySet)iterator.next();
                if (((Boolean)propertyset1.getOrElse(PostProperty.IS_REPOST, Boolean.valueOf(false))).booleanValue())
                {
                    propertyset1.put(PostProperty.REPOSTER, propertyset.get(UserProperty.USERNAME));
                    propertyset1.put(PostProperty.REPOSTER_URN, propertyset.get(UserProperty.URN));
                }
            } while (true);
            return pagedremotecollection;
        }

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((PagedRemoteCollection)obj, (PropertySet)obj1);
        }

        _cls3()
        {
        }
    }

}
