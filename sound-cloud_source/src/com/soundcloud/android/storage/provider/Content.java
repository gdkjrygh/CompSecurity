// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.content.UriMatcher;
import android.net.Uri;
import android.util.SparseArray;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiComment;
import com.soundcloud.android.api.legacy.model.PublicApiPlaylist;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.SoundAssociation;
import com.soundcloud.android.api.legacy.model.UserAssociation;
import com.soundcloud.android.api.legacy.model.activities.Activity;
import com.soundcloud.android.storage.Table;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public final class Content extends Enum
{

    private static final Content $VALUES[];
    public static final EnumSet ACTIVITIES;
    public static final Content COLLECTION;
    public static final Content COLLECTIONS;
    public static final Content COMMENT;
    public static final Content COMMENTS;
    public static final Content ME;
    public static final Content ME_ACTIVITIES;
    public static final Content ME_ALL_ACTIVITIES;
    public static final Content ME_COMMENTS;
    public static final Content ME_FOLLOWING;
    public static final Content ME_FOLLOWINGS;
    public static final Content ME_LIKE;
    public static final Content ME_LIKES;
    public static final Content ME_PLAYLIST;
    public static final Content ME_PLAYLISTS;
    public static final Content ME_PLAYLIST_LIKE;
    public static final Content ME_PLAYLIST_REPOST;
    public static final Content ME_REPOSTS;
    public static final Content ME_SOUNDS;
    public static final Content ME_SOUND_STREAM;
    public static final Content ME_TRACK_LIKE;
    public static final Content ME_TRACK_REPOST;
    public static final Content ME_USERID;
    public static final Content PLAYLIST;
    public static final Content PLAYLISTS;
    public static final Content PLAYLIST_ALL_TRACKS;
    public static final Content PLAYLIST_LIKERS;
    public static final Content PLAYLIST_LOOKUP;
    public static final Content PLAYLIST_REPOSTERS;
    public static final Content PLAYLIST_TRACKS;
    public static final Content SEARCH;
    public static final Content SEARCH_ITEM;
    public static final Content SOUNDS;
    public static final Content SUGGESTED_USERS;
    public static final int SYNCABLE_CEILING = 190;
    public static final Content TRACK;
    public static final Content TRACKS;
    public static final Content TRACK_ARTWORK;
    public static final Content TRACK_LIKERS;
    public static final Content TRACK_LOOKUP;
    public static final Content TRACK_METADATA;
    public static final Content TRACK_PERMISSIONS;
    public static final Content TRACK_REPOSTERS;
    public static final Content TRACK_SECRET_TOKEN;
    public static final Content UNKNOWN;
    public static final Content USER;
    public static final Content USERS;
    public static final Content USER_ASSOCIATIONS;
    public static final Content USER_COMMENTS;
    public static final Content USER_FOLLOWERS;
    public static final Content USER_FOLLOWINGS;
    public static final Content USER_GROUPS;
    public static final Content USER_LIKES;
    public static final Content USER_LOOKUP;
    public static final Content USER_PLAYLISTS;
    public static final Content USER_REPOSTS;
    public static final Content USER_SOUNDS;
    private static final SparseArray sMap;
    private static final UriMatcher sMatcher;
    public final int collectionType;
    public final int id;
    public final Class modelType;
    public final String remoteUri;
    public final Table table;
    public final Uri uri;
    public final String uriPath;

    private Content(String s, int i, String s1, String s2, int j, Class class1, int k, 
            Table table1)
    {
        super(s, i);
        uriPath = s1;
        uri = Uri.parse((new StringBuilder("content://com.soundcloud.android.provider.ScContentProvider/")).append(uriPath).toString());
        id = j;
        modelType = class1;
        collectionType = k;
        remoteUri = s2;
        table = table1;
    }

    public static Content get(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return UNKNOWN;
        }
        return s;
    }

    public static Content match(Uri uri1)
    {
        if (uri1 == null)
        {
            return null;
        }
        int i = sMatcher.match(uri1);
        if (i != -1)
        {
            return (Content)sMap.get(i);
        } else
        {
            return UNKNOWN;
        }
    }

    public static Content match(String s)
    {
        return match(Uri.parse((new StringBuilder("content://com.soundcloud.android.provider.ScContentProvider/")).append(s).toString()));
    }

    public static Content valueOf(String s)
    {
        return (Content)Enum.valueOf(com/soundcloud/android/storage/provider/Content, s);
    }

    public static Content[] values()
    {
        return (Content[])$VALUES.clone();
    }

    public final android.net.Uri.Builder buildUpon()
    {
        return uri.buildUpon();
    }

    public final Uri forId(long l)
    {
        String s = uri.toString();
        if (s.contains("#"))
        {
            return Uri.parse(s.replace("#", String.valueOf(l)));
        }
        if (s.contains("*"))
        {
            return Uri.parse(s.replace("*", String.valueOf(l)));
        } else
        {
            return buildUpon().appendEncodedPath(String.valueOf(l)).build();
        }
    }

    public final Uri forQuery(String s)
    {
        if (uri.toString().contains("*"))
        {
            return Uri.parse(uri.toString().replace("*", Uri.encode(String.valueOf(s))));
        } else
        {
            return buildUpon().appendEncodedPath(String.valueOf(s)).build();
        }
    }

    public final Class getModelType()
    {
        return modelType;
    }

    public final boolean hasRequest()
    {
        return remoteUri != null;
    }

    public final boolean isActivitiesItem()
    {
        return table == Table.Activities || table == Table.ActivityView;
    }

    public final boolean isSyncable()
    {
        return id < 190 && id > 0;
    }

    public final boolean isUserBased()
    {
        return com/soundcloud/android/api/legacy/model/PublicApiUser.equals(modelType) || com/soundcloud/android/api/legacy/model/UserAssociation.equals(modelType);
    }

    public final Request request()
    {
        return request(null);
    }

    public final Request request(Uri uri1)
    {
        if (remoteUri == null) goto _L2; else goto _L1
_L1:
        String s;
        int i;
        s = null;
        if (uri1 != null)
        {
            s = uri1.getQuery();
        }
        Object obj = (new StringBuilder()).append(remoteUri);
        if (s != null)
        {
            s = (new StringBuilder("?")).append(s).toString();
        } else
        {
            s = "";
        }
        s = ((StringBuilder) (obj)).append(s).toString();
        if (!remoteUri.contains("%d")) goto _L4; else goto _L3
_L3:
        if (uri1 == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        uri1 = uri1.getPathSegments().iterator();
_L5:
        if (!uri1.hasNext())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        obj = (String)uri1.next();
        i = Integer.parseInt(((String) (obj)));
_L6:
        return Request.to(s, new Object[] {
            Integer.valueOf(i)
        });
_L4:
        return Request.to(s, new Object[0]);
_L2:
        throw new IllegalArgumentException((new StringBuilder("no remote uri defined for content")).append(this).toString());
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L5
        i = 0;
          goto _L6
    }

    public final String toString()
    {
        return (new StringBuilder("Content.")).append(name()).toString();
    }

    static 
    {
        ME = new Content("ME", 0, "me", "/me", 100, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        ME_COMMENTS = new Content("ME_COMMENTS", 1, "me/comments", null, 102, com/soundcloud/android/api/legacy/model/PublicApiComment, -1, Table.Comments);
        ME_FOLLOWINGS = new Content("ME_FOLLOWINGS", 2, "me/followings", "/me/followings", 103, com/soundcloud/android/api/legacy/model/UserAssociation, 2, Table.UserAssociations);
        ME_FOLLOWING = new Content("ME_FOLLOWING", 3, "me/followings/#", null, 104, com/soundcloud/android/api/legacy/model/UserAssociation, -1, null);
        ME_LIKES = new Content("ME_LIKES", 4, "me/likes", "/e1/users/%d/likes", 107, com/soundcloud/android/api/legacy/model/SoundAssociation, 1, Table.Likes);
        ME_LIKE = new Content("ME_LIKE", 5, "me/likes/#", null, 108, com/soundcloud/android/api/legacy/model/PublicApiTrack, 1, null);
        ME_REPOSTS = new Content("ME_REPOSTS", 6, "me/reposts", null, 109, null, 7, Table.CollectionItems);
        ME_PLAYLISTS = new Content("ME_PLAYLISTS", 7, "me/playlists", "/me/playlists", 110, com/soundcloud/android/api/legacy/model/PublicApiPlaylist, 8, Table.Posts);
        ME_USERID = new Content("ME_USERID", 8, "me/userid", null, 111, null, -1, null);
        ME_PLAYLIST = new Content("ME_PLAYLIST", 9, "me/playlists/*", null, 112, com/soundcloud/android/api/legacy/model/PublicApiPlaylist, 8, Table.Posts);
        ME_TRACK_REPOST = new Content("ME_TRACK_REPOST", 10, "me/reposts/tracks/#", "/e1/me/track_reposts/%d", 120, com/soundcloud/android/api/legacy/model/PublicApiTrack, -1, null);
        ME_TRACK_LIKE = new Content("ME_TRACK_LIKE", 11, "me/likes/tracks/#", "/e1/me/track_likes/%d", 121, com/soundcloud/android/api/legacy/model/PublicApiTrack, -1, null);
        ME_PLAYLIST_REPOST = new Content("ME_PLAYLIST_REPOST", 12, "me/reposts/playlists/#", "/e1/me/playlist_reposts/%d", 122, com/soundcloud/android/api/legacy/model/PublicApiPlaylist, -1, null);
        ME_PLAYLIST_LIKE = new Content("ME_PLAYLIST_LIKE", 13, "me/likes/playlists/#", "/e1/me/playlist_likes/%d", 123, com/soundcloud/android/api/legacy/model/PublicApiPlaylist, -1, null);
        ME_SOUNDS = new Content("ME_SOUNDS", 14, "me/sounds", "/e1/me/sounds/mini", 132, com/soundcloud/android/api/legacy/model/SoundAssociation, -1, Table.Posts);
        ME_SOUND_STREAM = new Content("ME_SOUND_STREAM", 15, "me/stream", "/e1/me/stream", 140, com/soundcloud/android/api/legacy/model/activities/Activity, -1, Table.Activities);
        ME_ACTIVITIES = new Content("ME_ACTIVITIES", 16, "me/activities/all/own", "/e1/me/activities", 142, com/soundcloud/android/api/legacy/model/activities/Activity, -1, Table.Activities);
        ME_ALL_ACTIVITIES = new Content("ME_ALL_ACTIVITIES", 17, "me/activities", null, 150, com/soundcloud/android/api/legacy/model/activities/Activity, -1, Table.Activities);
        SUGGESTED_USERS = new Content("SUGGESTED_USERS", 18, "users/suggested", "/users/suggested", 190, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, null);
        SOUNDS = new Content("SOUNDS", 19, "sounds", null, 200, com/soundcloud/android/api/legacy/model/Playable, -1, Table.Sounds);
        TRACKS = new Content("TRACKS", 20, "tracks", "/tracks", 201, com/soundcloud/android/api/legacy/model/PublicApiTrack, 0, Table.Sounds);
        TRACK = new Content("TRACK", 21, "tracks/#", "/tracks/%d", 202, com/soundcloud/android/api/legacy/model/PublicApiTrack, -1, Table.Sounds);
        TRACK_ARTWORK = new Content("TRACK_ARTWORK", 22, "tracks/#/artwork", null, 203, null, -1, Table.Sounds);
        TRACK_PERMISSIONS = new Content("TRACK_PERMISSIONS", 23, "tracks/#/permissions", null, 205, null, -1, null);
        TRACK_SECRET_TOKEN = new Content("TRACK_SECRET_TOKEN", 24, "tracks/#/secret-token", null, 206, null, -1, null);
        TRACK_LIKERS = new Content("TRACK_LIKERS", 25, "tracks/#/favoriters", "/tracks/%d/favoriters", 207, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        TRACK_REPOSTERS = new Content("TRACK_REPOSTERS", 26, "tracks/#/reposters", "/e1/tracks/%d/reposters", 208, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        TRACK_LOOKUP = new Content("TRACK_LOOKUP", 27, "tracks/q/*", "/tracks", 250, com/soundcloud/android/api/legacy/model/PublicApiTrack, -1, Table.Sounds);
        USERS = new Content("USERS", 28, "users", "/users", 301, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        USER = new Content("USER", 29, "users/#", "/users/%d", 302, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        USER_SOUNDS = new Content("USER_SOUNDS", 30, "users/#/sounds", "/e1/users/%d/sounds", 311, com/soundcloud/android/api/legacy/model/SoundAssociation, -1, Table.Likes);
        USER_LIKES = new Content("USER_LIKES", 31, "users/#/likes", "/e1/users/%d/likes", 304, com/soundcloud/android/api/legacy/model/PublicApiTrack, 1, null);
        USER_FOLLOWERS = new Content("USER_FOLLOWERS", 32, "users/#/followers", "/users/%d/followers", 305, com/soundcloud/android/api/legacy/model/PublicApiUser, 3, null);
        USER_FOLLOWINGS = new Content("USER_FOLLOWINGS", 33, "users/#/followings", "/users/%d/followings", 306, com/soundcloud/android/api/legacy/model/PublicApiUser, 2, null);
        USER_COMMENTS = new Content("USER_COMMENTS", 34, "users/#/comments", null, 307, com/soundcloud/android/api/legacy/model/PublicApiComment, -1, null);
        USER_GROUPS = new Content("USER_GROUPS", 35, "users/#/groups", null, 308, null, -1, null);
        USER_PLAYLISTS = new Content("USER_PLAYLISTS", 36, "users/#/playlists", "/users/%d/playlists", 309, null, -1, null);
        USER_REPOSTS = new Content("USER_REPOSTS", 37, "users/#/reposts", "/e1/users/%d/reposts", 310, com/soundcloud/android/api/legacy/model/Playable, 7, null);
        USER_LOOKUP = new Content("USER_LOOKUP", 38, "users/q/*", "/users", 350, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        COMMENTS = new Content("COMMENTS", 39, "comments", null, 400, com/soundcloud/android/api/legacy/model/PublicApiComment, -1, Table.Comments);
        COMMENT = new Content("COMMENT", 40, "comments/#", null, 401, com/soundcloud/android/api/legacy/model/PublicApiComment, -1, Table.Comments);
        PLAYLISTS = new Content("PLAYLISTS", 41, "playlists", "/playlists", 501, com/soundcloud/android/api/legacy/model/PublicApiPlaylist, 8, Table.Sounds);
        PLAYLIST_ALL_TRACKS = new Content("PLAYLIST_ALL_TRACKS", 42, "playlists/tracks", null, 502, com/soundcloud/android/api/legacy/model/PublicApiTrack, -1, Table.PlaylistTracks);
        PLAYLIST = new Content("PLAYLIST", 43, "playlists/*", "/playlists/%d", 503, com/soundcloud/android/api/legacy/model/PublicApiPlaylist, 8, Table.Sounds);
        PLAYLIST_TRACKS = new Content("PLAYLIST_TRACKS", 44, "playlists/*/tracks", "/playlists/%d/tracks", 532, com/soundcloud/android/api/legacy/model/PublicApiTrack, -1, Table.PlaylistTracks);
        PLAYLIST_LIKERS = new Content("PLAYLIST_LIKERS", 45, "playlists/*/likers", "/e1/playlists/%d/likers", 533, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        PLAYLIST_REPOSTERS = new Content("PLAYLIST_REPOSTERS", 46, "playlists/*/reposters", "/e1/playlists/%d/reposters", 534, com/soundcloud/android/api/legacy/model/PublicApiUser, -1, Table.Users);
        PLAYLIST_LOOKUP = new Content("PLAYLIST_LOOKUP", 47, "playlists/q/*", "/playlists", 535, com/soundcloud/android/api/legacy/model/PublicApiPlaylist, -1, Table.Sounds);
        COLLECTIONS = new Content("COLLECTIONS", 48, "collections", null, 1000, null, -1, Table.Collections);
        COLLECTION = new Content("COLLECTION", 49, "collections/#", null, 1001, null, -1, Table.Collections);
        USER_ASSOCIATIONS = new Content("USER_ASSOCIATIONS", 50, "user_associations", null, 1010, null, -1, Table.UserAssociations);
        TRACK_METADATA = new Content("TRACK_METADATA", 51, "track_metadata", null, 1302, null, -1, Table.TrackMetadata);
        SEARCH = new Content("SEARCH", 52, "search", null, 1500, com/soundcloud/android/api/legacy/model/PublicApiResource, -1, null);
        SEARCH_ITEM = new Content("SEARCH_ITEM", 53, "search/*", null, 1501, com/soundcloud/android/api/legacy/model/PublicApiResource, -1, null);
        UNKNOWN = new Content("UNKNOWN", 54, null, null, -1, null, -1, null);
        $VALUES = (new Content[] {
            ME, ME_COMMENTS, ME_FOLLOWINGS, ME_FOLLOWING, ME_LIKES, ME_LIKE, ME_REPOSTS, ME_PLAYLISTS, ME_USERID, ME_PLAYLIST, 
            ME_TRACK_REPOST, ME_TRACK_LIKE, ME_PLAYLIST_REPOST, ME_PLAYLIST_LIKE, ME_SOUNDS, ME_SOUND_STREAM, ME_ACTIVITIES, ME_ALL_ACTIVITIES, SUGGESTED_USERS, SOUNDS, 
            TRACKS, TRACK, TRACK_ARTWORK, TRACK_PERMISSIONS, TRACK_SECRET_TOKEN, TRACK_LIKERS, TRACK_REPOSTERS, TRACK_LOOKUP, USERS, USER, 
            USER_SOUNDS, USER_LIKES, USER_FOLLOWERS, USER_FOLLOWINGS, USER_COMMENTS, USER_GROUPS, USER_PLAYLISTS, USER_REPOSTS, USER_LOOKUP, COMMENTS, 
            COMMENT, PLAYLISTS, PLAYLIST_ALL_TRACKS, PLAYLIST, PLAYLIST_TRACKS, PLAYLIST_LIKERS, PLAYLIST_REPOSTERS, PLAYLIST_LOOKUP, COLLECTIONS, COLLECTION, 
            USER_ASSOCIATIONS, TRACK_METADATA, SEARCH, SEARCH_ITEM, UNKNOWN
        });
        sMatcher = new UriMatcher(-1);
        sMap = new SparseArray();
        ACTIVITIES = EnumSet.of(ME_ACTIVITIES, ME_SOUND_STREAM);
        Content acontent[] = values();
        int j = acontent.length;
        for (int i = 0; i < j; i++)
        {
            Content content = acontent[i];
            if (content.id >= 0 && content.uri != null)
            {
                sMatcher.addURI("com.soundcloud.android.provider.ScContentProvider", content.uriPath, content.id);
                sMap.put(content.id, content);
            }
        }

    }
}
