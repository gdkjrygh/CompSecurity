// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.OAuth2Token;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterBaseImpl, AsyncTwitter, TwitterFactory, DispatcherFactory, 
//            TwitterMethod, Dispatcher, TwitterException, Twitter, 
//            Paging, TwitterListener, GeoLocation, OEmbedRequest, 
//            GeoQuery, Query, StatusUpdate

class AsyncTwitterImpl extends TwitterBaseImpl
    implements AsyncTwitter
{
    abstract class AsyncTask
        implements Runnable
    {

        final List listeners;
        final TwitterMethod method;
        final AsyncTwitterImpl this$0;

        abstract void invoke(List list)
            throws TwitterException;

        public void run()
        {
            invoke(listeners);
_L1:
            return;
            TwitterException twitterexception;
            twitterexception;
            if (listeners != null)
            {
                Iterator iterator = listeners.iterator();
                while (iterator.hasNext()) 
                {
                    TwitterListener twitterlistener = (TwitterListener)iterator.next();
                    try
                    {
                        twitterlistener.onException(twitterexception, method);
                    }
                    catch (Exception exception) { }
                }
            }
              goto _L1
        }

        AsyncTask(TwitterMethod twittermethod, List list)
        {
            this$0 = AsyncTwitterImpl.this;
            super();
            method = twittermethod;
            listeners = list;
        }
    }


    private static transient Dispatcher dispatcher;
    private static final long serialVersionUID = 0x5a1823fd96bbb6bbL;
    private final List listeners = new ArrayList();
    private final Twitter twitter;

    AsyncTwitterImpl(Configuration configuration, Authorization authorization)
    {
        super(configuration, authorization);
        twitter = (new TwitterFactory(configuration)).getInstance(authorization);
    }

    private Dispatcher getDispatcher()
    {
        if (dispatcher != null) goto _L2; else goto _L1
_L1:
        twitter4j/AsyncTwitterImpl;
        JVM INSTR monitorenter ;
        if (dispatcher == null)
        {
            dispatcher = (new DispatcherFactory(conf)).getInstance();
        }
        twitter4j/AsyncTwitterImpl;
        JVM INSTR monitorexit ;
_L2:
        return dispatcher;
        Exception exception;
        exception;
        twitter4j/AsyncTwitterImpl;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void addListener(TwitterListener twitterlistener)
    {
        listeners.add(twitterlistener);
    }

    public void createBlock(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createBlock(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdBlock(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void createBlock(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createBlock(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdBlock(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void createFavorite(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$id;

            public void invoke(List list)
                throws TwitterException
            {
                Status status = twitter.createFavorite(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdFavorite(status);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void createFriendship(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createFriendship(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdFriendship(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void createFriendship(long l, boolean flag)
    {
        getDispatcher().invokeLater(new AsyncTask(l, flag) {

            final AsyncTwitterImpl this$0;
            final boolean val$follow;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createFriendship(userId, follow);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdFriendship(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                follow = flag;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createFriendship(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createFriendship(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdFriendship(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void createFriendship(String s, boolean flag)
    {
        getDispatcher().invokeLater(new AsyncTask(s, flag) {

            final AsyncTwitterImpl this$0;
            final boolean val$follow;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createFriendship(screenName, follow);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdFriendship(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                follow = flag;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createMute(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createMute(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdMute(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void createMute(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.createMute(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdMute(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void createSavedSearch(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$query;

            public void invoke(List list)
                throws TwitterException
            {
                SavedSearch savedsearch = twitter.createSavedSearch(query);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdSavedSearch(savedsearch);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                query = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void createUserList(String s, boolean flag, String s1)
    {
        getDispatcher().invokeLater(new AsyncTask(flag, s1) {

            final AsyncTwitterImpl this$0;
            final String val$description;
            final boolean val$isPublicList;
            final String val$listName;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserList(listName, isPublicList, description);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listName = s;
                isPublicList = flag;
                description = s1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createUserListMember(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$listId;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListMember(listId, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdUserListMember(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createUserListMember(long l, String s, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l1) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListMember(ownerId, slug, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdUserListMember(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createUserListMembers(long l, String s, long al[])
    {
        getDispatcher().invokeLater(new AsyncTask(s, al) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;
            final long val$userIds[];

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListMembers(ownerId, slug, userIds);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdUserListMembers(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                userIds = al;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createUserListMembers(long l, String s, String as[])
    {
        getDispatcher().invokeLater(new AsyncTask(s, as) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$screenNames[];
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListMembers(ownerId, slug, screenNames);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdUserListMembers(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                screenNames = as;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createUserListMembers(long l, long al[])
    {
        getDispatcher().invokeLater(new AsyncTask(l, al) {

            final AsyncTwitterImpl this$0;
            final long val$listId;
            final long val$userIds[];

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListMembers(listId, userIds);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdUserListMembers(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                userIds = al;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createUserListMembers(long l, String as[])
    {
        getDispatcher().invokeLater(new AsyncTask(l, as) {

            final AsyncTwitterImpl this$0;
            final long val$listId;
            final String val$screenNames[];

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListMembers(listId, screenNames);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.createdUserListMembers(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                screenNames = as;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void createUserListSubscription(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$listId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListSubscription(listId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.subscribedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void createUserListSubscription(long l, String s)
    {
        getDispatcher().invokeLater(new AsyncTask(l, s) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.createUserListSubscription(ownerId, slug);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.subscribedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void destroyBlock(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.destroyBlock(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedBlock(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyBlock(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.destroyBlock(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedBlock(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyDirectMessage(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$id;

            public void invoke(List list)
                throws TwitterException
            {
                DirectMessage directmessage = twitter.destroyDirectMessage(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedDirectMessage(directmessage);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyFavorite(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$id;

            public void invoke(List list)
                throws TwitterException
            {
                Status status = twitter.destroyFavorite(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedFavorite(status);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyFriendship(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.destroyFriendship(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedFriendship(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyFriendship(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.destroyFriendship(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedFriendship(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyMute(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.destroyMute(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedMute(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyMute(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.destroyMute(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedMute(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroySavedSearch(int i)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, i) {

            final AsyncTwitterImpl this$0;
            final int val$id;

            public void invoke(List list)
                throws TwitterException
            {
                SavedSearch savedsearch = twitter.destroySavedSearch(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedSavedSearch(savedsearch);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = i;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyStatus(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$statusId;

            public void invoke(List list)
                throws TwitterException
            {
                Status status = twitter.destroyStatus(statusId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedStatus(status);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                statusId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyUserList(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$listId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.destroyUserList(listId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyUserList(long l, String s)
    {
        getDispatcher().invokeLater(new AsyncTask(l, s) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.destroyUserList(ownerId, slug);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void destroyUserListMember(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$listId;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.destroyUserListMember(listId, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedUserListMember(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void destroyUserListMember(long l, String s, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l1) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.destroyUserListMember(ownerId, slug, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.destroyedUserListMember(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void destroyUserListSubscription(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$listId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.destroyUserListSubscription(listId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.unsubscribedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void destroyUserListSubscription(long l, String s)
    {
        getDispatcher().invokeLater(new AsyncTask(l, s) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.destroyUserListSubscription(ownerId, slug);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.unsubscribedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                super(final_twittermethod, final_list);
            }
        });
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (AsyncTwitterImpl)obj;
            if (listeners == null ? ((AsyncTwitterImpl) (obj)).listeners != null : !listeners.equals(((AsyncTwitterImpl) (obj)).listeners))
            {
                return false;
            }
            if (twitter == null ? ((AsyncTwitterImpl) (obj)).twitter != null : !twitter.equals(((AsyncTwitterImpl) (obj)).twitter))
            {
                return false;
            }
        }
        return true;
    }

    public void getAPIConfiguration()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.CONFIGURATION, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                TwitterAPIConfiguration twitterapiconfiguration = twitter.getAPIConfiguration();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotAPIConfiguration(twitterapiconfiguration);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getAccountSettings()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.ACCOUNT_SETTINGS, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                AccountSettings accountsettings = twitter.getAccountSettings();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotAccountSettings(accountsettings);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getAvailableTrends()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.AVAILABLE_TRENDS, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getAvailableTrends();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotAvailableTrends(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getBlocksIDs()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.BLOCK_LIST_IDS, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getBlocksIDs();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotBlockIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getBlocksIDs(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getBlocksIDs(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotBlockIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getBlocksList()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.BLOCK_LIST, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getBlocksList();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotBlocksList(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getBlocksList(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getBlocksList(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotBlocksList(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getClosestTrends(GeoLocation geolocation)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, geolocation) {

            final AsyncTwitterImpl this$0;
            final GeoLocation val$location;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getClosestTrends(location);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotClosestTrends(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                location = geolocation;
                super(final_twittermethod, list);
            }
        });
    }

    public void getContributees(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getContributors(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotContributees(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getContributees(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getContributors(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotContributees(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getContributors(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getContributors(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotContributors(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getContributors(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getContributors(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotContributors(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getDirectMessages()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.DIRECT_MESSAGES, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getDirectMessages();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotDirectMessages(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getDirectMessages(Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getDirectMessages(paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotDirectMessages(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                paging = paging1;
                super(final_twittermethod, list);
            }
        });
    }

    public void getFavorites()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.FAVORITES, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getFavorites();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFavorites(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getFavorites(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getFavorites(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFavorites(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getFavorites(long l, Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(l, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getFavorites(userId, paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFavorites(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                paging = paging1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFavorites(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getFavorites(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFavorites(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getFavorites(String s, Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(s, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getFavorites(screenName, paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFavorites(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                paging = paging1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFavorites(Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getFavorites(paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFavorites(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                paging = paging1;
                super(final_twittermethod, list);
            }
        });
    }

    public void getFollowersIDs(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getFollowersIDs(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFollowersIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getFollowersIDs(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getFollowersIDs(userId, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFollowersIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFollowersIDs(String s, long l)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getFollowersIDs(screenName, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFollowersIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                cursor = l;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFollowersList(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getFollowersList(userId, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFollowersList(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFollowersList(String s, long l)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getFollowersList(screenName, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFollowersList(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                cursor = l;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFriendsIDs(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getFriendsIDs(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFriendsIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getFriendsIDs(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getFriendsIDs(userId, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFriendsIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFriendsIDs(String s, long l)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getFriendsIDs(screenName, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFriendsIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                cursor = l;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFriendsList(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getFriendsList(userId, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFriendsList(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getFriendsList(String s, long l)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getFriendsList(screenName, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotFriendsList(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                cursor = l;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getGeoDetails(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$id;

            public void invoke(List list)
                throws TwitterException
            {
                Place place = twitter.getGeoDetails(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotGeoDetails(place);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getHomeTimeline()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.HOME_TIMELINE, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getHomeTimeline();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotHomeTimeline(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getHomeTimeline(Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getHomeTimeline(paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotHomeTimeline(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                paging = paging1;
                super(final_twittermethod, list);
            }
        });
    }

    public void getIncomingFriendships(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getIncomingFriendships(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotIncomingFriendships(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getLanguages()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.LANGUAGES, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getLanguages();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotLanguages(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getMemberSuggestions(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$categorySlug;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getMemberSuggestions(categorySlug);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotMemberSuggestions(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                categorySlug = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getMentions()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.MENTIONS_TIMELINE, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getMentionsTimeline();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotMentions(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getMentions(Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getMentionsTimeline(paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotMentions(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                paging = paging1;
                super(final_twittermethod, list);
            }
        });
    }

    public void getMutesIDs(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getMutesIDs(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotMuteIDs(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getMutesList(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getMutesList(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotMutesList(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public OAuth2Token getOAuth2Token()
        throws TwitterException
    {
        this;
        JVM INSTR monitorenter ;
        OAuth2Token oauth2token = twitter.getOAuth2Token();
        this;
        JVM INSTR monitorexit ;
        return oauth2token;
        Exception exception;
        exception;
        throw exception;
    }

    public void getOAuth2TokenAsync()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.OAUTH_ACCESS_TOKEN, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                OAuth2Token oauth2token = twitter.getOAuth2Token();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuth2Token(oauth2token);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public AccessToken getOAuthAccessToken()
        throws TwitterException
    {
        return twitter.getOAuthAccessToken();
    }

    public AccessToken getOAuthAccessToken(String s)
        throws TwitterException
    {
        return twitter.getOAuthAccessToken(s);
    }

    public AccessToken getOAuthAccessToken(String s, String s1)
        throws TwitterException
    {
        return twitter.getOAuthAccessToken(s, s1);
    }

    public AccessToken getOAuthAccessToken(RequestToken requesttoken)
        throws TwitterException
    {
        return twitter.getOAuthAccessToken(requesttoken);
    }

    public AccessToken getOAuthAccessToken(RequestToken requesttoken, String s)
        throws TwitterException
    {
        return twitter.getOAuthAccessToken(requesttoken, s);
    }

    public void getOAuthAccessTokenAsync()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.OAUTH_ACCESS_TOKEN, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                AccessToken accesstoken = twitter.getOAuthAccessToken();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthAccessToken(accesstoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getOAuthAccessTokenAsync(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$oauthVerifier;

            public void invoke(List list)
                throws TwitterException
            {
                AccessToken accesstoken = twitter.getOAuthAccessToken(oauthVerifier);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthAccessToken(accesstoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                oauthVerifier = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getOAuthAccessTokenAsync(String s, String s1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, s1) {

            final AsyncTwitterImpl this$0;
            final String val$password;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                AccessToken accesstoken = twitter.getOAuthAccessToken(screenName, password);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthAccessToken(accesstoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                password = s1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getOAuthAccessTokenAsync(RequestToken requesttoken)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, requesttoken) {

            final AsyncTwitterImpl this$0;
            final RequestToken val$requestToken;

            public void invoke(List list)
                throws TwitterException
            {
                AccessToken accesstoken = twitter.getOAuthAccessToken(requestToken);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthAccessToken(accesstoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                requestToken = requesttoken;
                super(final_twittermethod, list);
            }
        });
    }

    public void getOAuthAccessTokenAsync(RequestToken requesttoken, String s)
    {
        getDispatcher().invokeLater(new AsyncTask(requesttoken, s) {

            final AsyncTwitterImpl this$0;
            final String val$oauthVerifier;
            final RequestToken val$requestToken;

            public void invoke(List list)
                throws TwitterException
            {
                AccessToken accesstoken = twitter.getOAuthAccessToken(requestToken, oauthVerifier);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthAccessToken(accesstoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                requestToken = requesttoken;
                oauthVerifier = s;
                super(final_twittermethod, final_list);
            }
        });
    }

    public RequestToken getOAuthRequestToken()
        throws TwitterException
    {
        return twitter.getOAuthRequestToken();
    }

    public RequestToken getOAuthRequestToken(String s)
        throws TwitterException
    {
        return twitter.getOAuthRequestToken(s);
    }

    public void getOAuthRequestTokenAsync()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.OAUTH_REQUEST_TOKEN, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                RequestToken requesttoken = twitter.getOAuthRequestToken();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthRequestToken(requesttoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getOAuthRequestTokenAsync(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$callbackURL;

            public void invoke(List list)
                throws TwitterException
            {
                RequestToken requesttoken = twitter.getOAuthRequestToken(callbackURL);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthRequestToken(requesttoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                callbackURL = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getOAuthRequestTokenAsync(String s, String s1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, s1) {

            final AsyncTwitterImpl this$0;
            final String val$callbackURL;
            final String val$xAuthAccessType;

            public void invoke(List list)
                throws TwitterException
            {
                RequestToken requesttoken = twitter.getOAuthRequestToken(callbackURL, xAuthAccessType);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOAuthRequestToken(requesttoken);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                callbackURL = s;
                xAuthAccessType = s1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getOEmbed(OEmbedRequest oembedrequest)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, oembedrequest) {

            final AsyncTwitterImpl this$0;
            final OEmbedRequest val$req;

            public void invoke(List list)
                throws TwitterException
            {
                OEmbed oembed = twitter.getOEmbed(req);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOEmbed(oembed);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                req = oembedrequest;
                super(final_twittermethod, list);
            }
        });
    }

    public void getOutgoingFriendships(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                IDs ids = twitter.getOutgoingFriendships(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotOutgoingFriendships(ids);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getPlaceTrends(int i)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, i) {

            final AsyncTwitterImpl this$0;
            final int val$woeid;

            public void invoke(List list)
                throws TwitterException
            {
                Trends trends = twitter.getPlaceTrends(woeid);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotPlaceTrends(trends);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                woeid = i;
                super(final_twittermethod, list);
            }
        });
    }

    public void getPrivacyPolicy()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.PRIVACY_POLICY, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                String s = twitter.getPrivacyPolicy();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotPrivacyPolicy(s);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getRateLimitStatus()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.RATE_LIMIT_STATUS, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                java.util.Map map = twitter.getRateLimitStatus();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotRateLimitStatus(map);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public transient void getRateLimitStatus(String as[])
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, as) {

            final AsyncTwitterImpl this$0;
            final String val$resources[];

            public void invoke(List list)
                throws TwitterException
            {
                java.util.Map map = twitter.getRateLimitStatus(resources);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotRateLimitStatus(map);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                resources = as;
                super(final_twittermethod, list);
            }
        });
    }

    public void getRetweets(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$statusId;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getRetweets(statusId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotRetweets(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                statusId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getRetweetsOfMe()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.RETWEETS_OF_ME, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getRetweetsOfMe();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotRetweetsOfMe(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getRetweetsOfMe(Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getRetweetsOfMe(paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotRetweetsOfMe(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                paging = paging1;
                super(final_twittermethod, list);
            }
        });
    }

    public void getSavedSearches()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.SAVED_SEARCHES, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getSavedSearches();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotSavedSearches(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getSentDirectMessages()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.SENT_DIRECT_MESSAGES, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getSentDirectMessages();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotSentDirectMessages(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getSentDirectMessages(Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getSentDirectMessages(paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotSentDirectMessages(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                paging = paging1;
                super(final_twittermethod, list);
            }
        });
    }

    public void getSimilarPlaces(GeoLocation geolocation, String s, String s1, String s2)
    {
        getDispatcher().invokeLater(new AsyncTask(s1, s2) {

            final AsyncTwitterImpl this$0;
            final String val$containedWithin;
            final GeoLocation val$location;
            final String val$name;
            final String val$streetAddress;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getSimilarPlaces(location, name, containedWithin, streetAddress);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotSimilarPlaces(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                location = geolocation;
                name = s;
                containedWithin = s1;
                streetAddress = s2;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getSuggestedUserCategories()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.SUGGESTED_USER_CATEGORIES, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getSuggestedUserCategories();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotSuggestedUserCategories(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getTermsOfService()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.TERMS_OF_SERVICE, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                String s = twitter.getTermsOfService();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotTermsOfService(s);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getUserListMembers(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$listId;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListMembers(listId, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListMembers(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListMembers(long l, String s, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$ownerId;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListMembers(ownerId, slug, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListMembers(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListMemberships(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListMemberships(cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListMemberships(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                cursor = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getUserListMemberships(long l, long l1)
    {
        getUserListMemberships(l, l1, false);
    }

    public void getUserListMemberships(long l, long l1, boolean flag)
    {
        getDispatcher().invokeLater(new AsyncTask(l1, flag) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final boolean val$filterToOwnedLists;
            final long val$listMemberId;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListMemberships(listMemberId, cursor, filterToOwnedLists);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListMemberships(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listMemberId = l;
                cursor = l1;
                filterToOwnedLists = flag;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListMemberships(String s, long l)
    {
        getUserListMemberships(s, l, false);
    }

    public void getUserListMemberships(String s, long l, boolean flag)
    {
        getDispatcher().invokeLater(new AsyncTask(l, flag) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final boolean val$filterToOwnedLists;
            final String val$listMemberScreenName;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListMemberships(listMemberScreenName, cursor, filterToOwnedLists);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListMemberships(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listMemberScreenName = s;
                cursor = l;
                filterToOwnedLists = flag;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListStatuses(long l, String s, Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(s, paging) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final Paging val$paging;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserListStatuses(ownerId, slug, paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListStatuses(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                paging = paging1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListStatuses(long l, Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(l, paging) {

            final AsyncTwitterImpl this$0;
            final long val$listId;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserListStatuses(listId, paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListStatuses(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                paging = paging1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListSubscribers(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$listId;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListSubscribers(listId, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListSubscribers(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListSubscribers(long l, String s, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l1) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final long val$ownerId;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListSubscribers(ownerId, slug, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListSubscribers(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                cursor = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserListSubscriptions(String s, long l)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l) {

            final AsyncTwitterImpl this$0;
            final long val$cursor;
            final String val$listOwnerScreenName;

            public void invoke(List list)
                throws TwitterException
            {
                PagableResponseList pagableresponselist = twitter.getUserListSubscriptions(listOwnerScreenName, cursor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserListSubscriptions(pagableresponselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listOwnerScreenName = s;
                cursor = l;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserLists(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$listOwnerUserId;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserLists(listOwnerUserId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserLists(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listOwnerUserId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void getUserLists(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$listOwnerScreenName;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserLists(listOwnerScreenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserLists(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listOwnerScreenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getUserSuggestions(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$categorySlug;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserSuggestions(categorySlug);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserSuggestions(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                categorySlug = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void getUserTimeline()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.USER_TIMELINE, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserTimeline();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserTimeline(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void getUserTimeline(long l)
    {
        getUserTimeline(l, new Paging());
    }

    public void getUserTimeline(long l, Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(l, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserTimeline(userId, paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserTimeline(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                paging = paging1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserTimeline(String s)
    {
        getUserTimeline(s, new Paging());
    }

    public void getUserTimeline(String s, Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(s, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserTimeline(screenName, paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserTimeline(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                paging = paging1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void getUserTimeline(Paging paging)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, paging) {

            final AsyncTwitterImpl this$0;
            final Paging val$paging;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.getUserTimeline(paging);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserTimeline(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                paging = paging1;
                super(final_twittermethod, list);
            }
        });
    }

    public int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (twitter != null)
        {
            i = twitter.hashCode();
        } else
        {
            i = 0;
        }
        if (listeners != null)
        {
            j = listeners.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public void invalidateOAuth2Token()
        throws TwitterException
    {
        this;
        JVM INSTR monitorenter ;
        twitter.invalidateOAuth2Token();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void lookup(long al[])
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, al) {

            final AsyncTwitterImpl this$0;
            final long val$ids[];

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.lookup(ids);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.lookedup(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ids = al;
                super(final_twittermethod, list);
            }
        });
    }

    public void lookupFriendships(long al[])
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, al) {

            final AsyncTwitterImpl this$0;
            final long val$ids[];

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.lookupFriendships(ids);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.lookedUpFriendships(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ids = al;
                super(final_twittermethod, list);
            }
        });
    }

    public void lookupFriendships(String as[])
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, as) {

            final AsyncTwitterImpl this$0;
            final String val$screenNames[];

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.lookupFriendships(screenNames);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.lookedUpFriendships(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenNames = as;
                super(final_twittermethod, list);
            }
        });
    }

    public void lookupUsers(long al[])
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, al) {

            final AsyncTwitterImpl this$0;
            final long val$ids[];

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.lookupUsers(ids);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.lookedupUsers(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ids = al;
                super(final_twittermethod, list);
            }
        });
    }

    public void lookupUsers(String as[])
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, as) {

            final AsyncTwitterImpl this$0;
            final String val$screenNames[];

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.lookupUsers(screenNames);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.lookedupUsers(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenNames = as;
                super(final_twittermethod, list);
            }
        });
    }

    public void removeProfileBanner()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.REMOVE_PROFILE_BANNER, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                twitter.removeProfileBanner();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.removedProfileBanner();
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

    public void reportSpam(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.reportSpam(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.reportedSpam(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void reportSpam(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.reportSpam(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.reportedSpam(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void retweetStatus(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$statusId;

            public void invoke(List list)
                throws TwitterException
            {
                Status status = twitter.retweetStatus(statusId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.retweetedStatus(status);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                statusId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void reverseGeoCode(GeoQuery geoquery)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, geoquery) {

            final AsyncTwitterImpl this$0;
            final GeoQuery val$query;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.reverseGeoCode(query);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotReverseGeoCode(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                query = geoquery;
                super(final_twittermethod, list);
            }
        });
    }

    public void search(Query query)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, query) {

            final AsyncTwitterImpl this$0;
            final Query val$query;

            public void invoke(List list)
                throws TwitterException
            {
                QueryResult queryresult = twitter.search(query);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.searched(queryresult);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                query = query1;
                super(final_twittermethod, list);
            }
        });
    }

    public void searchPlaces(GeoQuery geoquery)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, geoquery) {

            final AsyncTwitterImpl this$0;
            final GeoQuery val$query;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.searchPlaces(query);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.searchedPlaces(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                query = geoquery;
                super(final_twittermethod, list);
            }
        });
    }

    public void searchUsers(String s, int i)
    {
        getDispatcher().invokeLater(new AsyncTask(s, i) {

            final AsyncTwitterImpl this$0;
            final int val$page;
            final String val$query;

            public void invoke(List list)
                throws TwitterException
            {
                ResponseList responselist = twitter.searchUsers(query, page);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.searchedUser(responselist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                query = s;
                page = i;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void sendDirectMessage(long l, String s)
    {
        getDispatcher().invokeLater(new AsyncTask(l, s) {

            final AsyncTwitterImpl this$0;
            final String val$text;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                DirectMessage directmessage = twitter.sendDirectMessage(userId, text);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.sentDirectMessage(directmessage);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                text = s;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void sendDirectMessage(String s, String s1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, s1) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;
            final String val$text;

            public void invoke(List list)
                throws TwitterException
            {
                DirectMessage directmessage = twitter.sendDirectMessage(screenName, text);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.sentDirectMessage(directmessage);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                text = s1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void setOAuth2Token(OAuth2Token oauth2token)
    {
        twitter.setOAuth2Token(oauth2token);
    }

    public void setOAuthAccessToken(AccessToken accesstoken)
    {
        twitter.setOAuthAccessToken(accesstoken);
    }

    public void setOAuthConsumer(String s, String s1)
    {
        twitter.setOAuthConsumer(s, s1);
    }

    public void showDirectMessage(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$id;

            public void invoke(List list)
                throws TwitterException
            {
                DirectMessage directmessage = twitter.showDirectMessage(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotDirectMessage(directmessage);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void showFriendship(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$sourceId;
            final long val$targetId;

            public void invoke(List list)
                throws TwitterException
            {
                Relationship relationship = twitter.showFriendship(sourceId, targetId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotShowFriendship(relationship);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                sourceId = l;
                targetId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void showFriendship(String s, String s1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, s1) {

            final AsyncTwitterImpl this$0;
            final String val$sourceScreenName;
            final String val$targetScreenName;

            public void invoke(List list)
                throws TwitterException
            {
                Relationship relationship = twitter.showFriendship(sourceScreenName, targetScreenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotShowFriendship(relationship);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                sourceScreenName = s;
                targetScreenName = s1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void showSavedSearch(int i)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, i) {

            final AsyncTwitterImpl this$0;
            final int val$id;

            public void invoke(List list)
                throws TwitterException
            {
                SavedSearch savedsearch = twitter.showSavedSearch(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotSavedSearch(savedsearch);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = i;
                super(final_twittermethod, list);
            }
        });
    }

    public void showStatus(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$id;

            public void invoke(List list)
                throws TwitterException
            {
                Status status = twitter.showStatus(id);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotShowStatus(status);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                id = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void showUser(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.showUser(userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserDetail(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void showUser(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.showUser(screenName);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotUserDetail(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void showUserList(long l)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, l) {

            final AsyncTwitterImpl this$0;
            final long val$listId;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.showUserList(listId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotShowUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                super(final_twittermethod, list);
            }
        });
    }

    public void showUserList(long l, String s)
    {
        getDispatcher().invokeLater(new AsyncTask(l, s) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.showUserList(ownerId, slug);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.gotShowUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void showUserListMembership(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$listId;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.showUserListMembership(listId, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.checkedUserListMembership(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void showUserListMembership(long l, String s, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l1) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.showUserListMembership(ownerId, slug, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.checkedUserListMembership(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void showUserListSubscription(long l, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(l, l1) {

            final AsyncTwitterImpl this$0;
            final long val$listId;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.showUserListSubscription(listId, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.checkedUserListSubscription(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void showUserListSubscription(long l, String s, long l1)
    {
        getDispatcher().invokeLater(new AsyncTask(s, l1) {

            final AsyncTwitterImpl this$0;
            final long val$ownerId;
            final String val$slug;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.showUserListSubscription(ownerId, slug, userId);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.checkedUserListSubscription(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                userId = l1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void shutdown()
    {
        twitter4j/AsyncTwitterImpl;
        JVM INSTR monitorenter ;
        if (dispatcher != null)
        {
            dispatcher.shutdown();
            dispatcher = null;
        }
        twitter4j/AsyncTwitterImpl;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        twitter4j/AsyncTwitterImpl;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AsyncTwitterImpl{twitter=").append(twitter).append(", listeners=").append(listeners).append('}').toString();
    }

    public void updateAccountSettings(Integer integer, Boolean boolean1, String s, String s1, String s2, String s3)
    {
        getDispatcher().invokeLater(new AsyncTask(s2, s3) {

            final AsyncTwitterImpl this$0;
            final String val$end_sleepTime;
            final String val$lang;
            final Boolean val$sleep_timeEnabled;
            final String val$start_sleepTime;
            final String val$time_zone;
            final Integer val$trend_locationWoeid;

            public void invoke(List list)
                throws TwitterException
            {
                AccountSettings accountsettings = twitter.updateAccountSettings(trend_locationWoeid, sleep_timeEnabled, start_sleepTime, end_sleepTime, time_zone, lang);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedAccountSettings(accountsettings);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                trend_locationWoeid = integer;
                sleep_timeEnabled = boolean1;
                start_sleepTime = s;
                end_sleepTime = s1;
                time_zone = s2;
                lang = s3;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateFriendship(long l, boolean flag, boolean flag1)
    {
        getDispatcher().invokeLater(new AsyncTask(flag, flag1) {

            final AsyncTwitterImpl this$0;
            final boolean val$enableDeviceNotification;
            final boolean val$retweet;
            final long val$userId;

            public void invoke(List list)
                throws TwitterException
            {
                Relationship relationship = twitter.updateFriendship(userId, enableDeviceNotification, retweet);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedFriendship(relationship);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                userId = l;
                enableDeviceNotification = flag;
                retweet = flag1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateFriendship(String s, boolean flag, boolean flag1)
    {
        getDispatcher().invokeLater(new AsyncTask(flag, flag1) {

            final AsyncTwitterImpl this$0;
            final boolean val$enableDeviceNotification;
            final boolean val$retweet;
            final String val$screenName;

            public void invoke(List list)
                throws TwitterException
            {
                Relationship relationship = twitter.updateFriendship(screenName, enableDeviceNotification, retweet);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedFriendship(relationship);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                screenName = s;
                enableDeviceNotification = flag;
                retweet = flag1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateProfile(String s, String s1, String s2, String s3)
    {
        getDispatcher().invokeLater(new AsyncTask(s2, s3) {

            final AsyncTwitterImpl this$0;
            final String val$description;
            final String val$location;
            final String val$name;
            final String val$url;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.updateProfile(name, url, location, description);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfile(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                name = s;
                url = s1;
                location = s2;
                description = s3;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateProfileBackgroundImage(File file, boolean flag)
    {
        getDispatcher().invokeLater(new AsyncTask(file, flag) {

            final AsyncTwitterImpl this$0;
            final File val$image;
            final boolean val$tile;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.updateProfileBackgroundImage(image, tile);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfileBackgroundImage(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                image = file;
                tile = flag;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateProfileBackgroundImage(InputStream inputstream, boolean flag)
    {
        getDispatcher().invokeLater(new AsyncTask(inputstream, flag) {

            final AsyncTwitterImpl this$0;
            final InputStream val$image;
            final boolean val$tile;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.updateProfileBackgroundImage(image, tile);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfileBackgroundImage(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                image = inputstream;
                tile = flag;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateProfileBanner(File file)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, file) {

            final AsyncTwitterImpl this$0;
            final File val$image;

            public void invoke(List list)
                throws TwitterException
            {
                twitter.updateProfileBanner(image);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfileBanner();
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                image = file;
                super(final_twittermethod, list);
            }
        });
    }

    public void updateProfileBanner(InputStream inputstream)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, inputstream) {

            final AsyncTwitterImpl this$0;
            final InputStream val$image;

            public void invoke(List list)
                throws TwitterException
            {
                twitter.updateProfileBanner(image);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfileBanner();
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                image = inputstream;
                super(final_twittermethod, list);
            }
        });
    }

    public void updateProfileColors(String s, String s1, String s2, String s3, String s4)
    {
        getDispatcher().invokeLater(new AsyncTask(s3, s4) {

            final AsyncTwitterImpl this$0;
            final String val$profileBackgroundColor;
            final String val$profileLinkColor;
            final String val$profileSidebarBorderColor;
            final String val$profileSidebarFillColor;
            final String val$profileTextColor;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.updateProfileColors(profileBackgroundColor, profileTextColor, profileLinkColor, profileSidebarFillColor, profileSidebarBorderColor);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfileColors(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                profileBackgroundColor = s;
                profileTextColor = s1;
                profileLinkColor = s2;
                profileSidebarFillColor = s3;
                profileSidebarBorderColor = s4;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateProfileImage(File file)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, file) {

            final AsyncTwitterImpl this$0;
            final File val$image;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.updateProfileImage(image);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfileImage(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                image = file;
                super(final_twittermethod, list);
            }
        });
    }

    public void updateProfileImage(InputStream inputstream)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, inputstream) {

            final AsyncTwitterImpl this$0;
            final InputStream val$image;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.updateProfileImage(image);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedProfileImage(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                image = inputstream;
                super(final_twittermethod, list);
            }
        });
    }

    public void updateStatus(String s)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, s) {

            final AsyncTwitterImpl this$0;
            final String val$statusText;

            public void invoke(List list)
                throws TwitterException
            {
                Status status = twitter.updateStatus(statusText);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedStatus(status);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                statusText = s;
                super(final_twittermethod, list);
            }
        });
    }

    public void updateStatus(StatusUpdate statusupdate)
    {
        getDispatcher().invokeLater(new AsyncTask(listeners, statusupdate) {

            final AsyncTwitterImpl this$0;
            final StatusUpdate val$latestStatus;

            public void invoke(List list)
                throws TwitterException
            {
                Status status = twitter.updateStatus(latestStatus);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedStatus(status);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                latestStatus = statusupdate;
                super(final_twittermethod, list);
            }
        });
    }

    public void updateUserList(long l, String s, String s1, boolean flag, String s2)
    {
        getDispatcher().invokeLater(new AsyncTask(flag, s2) {

            final AsyncTwitterImpl this$0;
            final boolean val$isPublicList;
            final String val$newDescription;
            final String val$newListName;
            final long val$ownerId;
            final String val$slug;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.updateUserList(ownerId, slug, newListName, isPublicList, newDescription);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                ownerId = l;
                slug = s;
                newListName = s1;
                isPublicList = flag;
                newDescription = s2;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void updateUserList(long l, String s, boolean flag, String s1)
    {
        getDispatcher().invokeLater(new AsyncTask(flag, s1) {

            final AsyncTwitterImpl this$0;
            final boolean val$isPublicList;
            final long val$listId;
            final String val$newDescription;
            final String val$newListName;

            public void invoke(List list)
                throws TwitterException
            {
                UserList userlist = twitter.updateUserList(listId, newListName, isPublicList, newDescription);
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.updatedUserList(userlist);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                listId = l;
                newListName = s;
                isPublicList = flag;
                newDescription = s1;
                super(final_twittermethod, final_list);
            }
        });
    }

    public void verifyCredentials()
    {
        getDispatcher().invokeLater(new AsyncTask(TwitterMethod.VERIFY_CREDENTIALS, listeners) {

            final AsyncTwitterImpl this$0;

            public void invoke(List list)
                throws TwitterException
            {
                User user = twitter.verifyCredentials();
                for (list = list.iterator(); list.hasNext();)
                {
                    TwitterListener twitterlistener = (TwitterListener)list.next();
                    try
                    {
                        twitterlistener.verifiedCredentials(user);
                    }
                    catch (Exception exception) { }
                }

            }

            
            {
                this$0 = AsyncTwitterImpl.this;
                super(twittermethod, list);
            }
        });
    }

}
