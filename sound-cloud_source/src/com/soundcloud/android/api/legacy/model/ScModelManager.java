// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.UriUtils;
import com.soundcloud.java.primitives.Ints;
import java.lang.reflect.Constructor;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            ModelCache, ScModel, PublicApiPlaylist, PublicApiTrack, 
//            PublicApiUser, PublicApiResource

public class ScModelManager
{

    private static final int DEFAULT_CACHE_CAPACITY = 100;
    private static final int LOW_MEM_DEVICE_THRESHOLD = 0x3200000;
    private static final int LOW_MEM_REFERENCE = 0x1000000;
    private final ModelCache playlistCache;
    private final ContentResolver resolver;
    private final ModelCache trackCache;
    private final ModelCache userCache;

    public ScModelManager(Context context)
    {
        int i = 100;
        super();
        long l = Runtime.getRuntime().maxMemory();
        int j;
        int k;
        if (l < 0x3200000L)
        {
            j = Ints.saturatedCast((l * 10L) / 0x1000000L);
            i = Ints.saturatedCast((l * 10L) / 0x1000000L);
            k = Ints.saturatedCast((l * 10L) / 0x1000000L);
        } else
        {
            j = 100;
            k = 100;
        }
        trackCache = new ModelCache(j);
        userCache = new ModelCache(i);
        playlistCache = new ModelCache(k);
        resolver = context.getContentResolver();
    }

    private ModelCache getCacheFromUri(Uri uri)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.storage.provider.Content[Content.match(uri).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return trackCache;

        case 2: // '\002'
            return userCache;

        case 3: // '\003'
            return playlistCache;
        }
    }

    private ScModel getModel(Uri uri, ModelCache modelcache)
    {
        ScModel scmodel;
        Object obj1;
        Content content;
        if (modelcache != null)
        {
            scmodel = modelcache.get(Long.valueOf(UriUtils.getLastSegmentAsLong(uri)));
        } else
        {
            scmodel = null;
        }
        content = Content.match(uri);
        obj1 = scmodel;
        if (scmodel == null)
        {
            obj1 = resolver.query(uri, null, null, null, null);
            Object obj = scmodel;
            if (obj1 != null)
            {
                if (((Cursor) (obj1)).moveToFirst())
                {
                    try
                    {
                        scmodel = (ScModel)content.modelType.getConstructor(new Class[] {
                            android/database/Cursor
                        }).newInstance(new Object[] {
                            obj1
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (ModelCache modelcache)
                    {
                        throw new AssertionError((new StringBuilder("Could not find constructor for resource. Uri: ")).append(uri).toString());
                    }
                    uri = scmodel;
                } else
                {
                    uri = scmodel;
                }
                ((Cursor) (obj1)).close();
                obj = uri;
            }
            obj1 = obj;
            if (modelcache != null)
            {
                obj1 = obj;
                if (obj != null)
                {
                    modelcache.put(((ScModel) (obj)));
                    obj1 = obj;
                }
            }
        }
        return ((ScModel) (obj1));
    }

    public PublicApiPlaylist cache(PublicApiPlaylist publicapiplaylist)
    {
        return cache(publicapiplaylist, PublicApiResource.CacheUpdateMode.NONE);
    }

    public PublicApiPlaylist cache(PublicApiPlaylist publicapiplaylist, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        if (publicapiplaylist == null)
        {
            return null;
        }
        if (publicapiplaylist.user != null)
        {
            publicapiplaylist.user = cache(publicapiplaylist.user, cacheupdatemode);
        }
        for (int i = 0; i < publicapiplaylist.tracks.size(); i++)
        {
            publicapiplaylist.tracks.set(i, cache((PublicApiTrack)publicapiplaylist.tracks.get(i), cacheupdatemode));
        }

        if (playlistCache.containsKey(Long.valueOf(publicapiplaylist.getId())))
        {
            if (cacheupdatemode.shouldUpdate())
            {
                return ((PublicApiPlaylist)playlistCache.get(Long.valueOf(publicapiplaylist.getId()))).updateFrom(publicapiplaylist, cacheupdatemode);
            } else
            {
                return (PublicApiPlaylist)playlistCache.get(Long.valueOf(publicapiplaylist.getId()));
            }
        } else
        {
            playlistCache.put(publicapiplaylist);
            return publicapiplaylist;
        }
    }

    public PublicApiResource cache(PublicApiResource publicapiresource)
    {
        return cache(publicapiresource, PublicApiResource.CacheUpdateMode.NONE);
    }

    public PublicApiResource cache(PublicApiResource publicapiresource, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        Object obj;
        if (publicapiresource instanceof PublicApiTrack)
        {
            obj = cache((PublicApiTrack)publicapiresource, cacheupdatemode);
        } else
        {
            if (publicapiresource instanceof PublicApiPlaylist)
            {
                return cache((PublicApiPlaylist)publicapiresource, cacheupdatemode);
            }
            obj = publicapiresource;
            if (publicapiresource instanceof PublicApiUser)
            {
                return cache((PublicApiUser)publicapiresource, cacheupdatemode);
            }
        }
        return ((PublicApiResource) (obj));
    }

    public PublicApiResource cache(PublicApiUser publicapiuser)
    {
        return cache(publicapiuser, PublicApiResource.CacheUpdateMode.NONE);
    }

    public PublicApiTrack cache(PublicApiTrack publicapitrack)
    {
        return cache(publicapitrack, PublicApiResource.CacheUpdateMode.NONE);
    }

    public PublicApiTrack cache(PublicApiTrack publicapitrack, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        if (publicapitrack == null)
        {
            return null;
        }
        if (publicapitrack.user != null)
        {
            publicapitrack.user = cache(publicapitrack.user, cacheupdatemode);
        }
        if (trackCache.containsKey(Long.valueOf(publicapitrack.getId())))
        {
            if (cacheupdatemode.shouldUpdate())
            {
                return ((PublicApiTrack)trackCache.get(Long.valueOf(publicapitrack.getId()))).updateFrom(publicapitrack, cacheupdatemode);
            } else
            {
                return (PublicApiTrack)trackCache.get(Long.valueOf(publicapitrack.getId()));
            }
        } else
        {
            trackCache.put(publicapitrack);
            return publicapitrack;
        }
    }

    public PublicApiUser cache(PublicApiUser publicapiuser, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        if (publicapiuser == null)
        {
            return null;
        }
        if (userCache.containsKey(Long.valueOf(publicapiuser.getId())))
        {
            if (cacheupdatemode.shouldUpdate())
            {
                return ((PublicApiUser)userCache.get(Long.valueOf(publicapiuser.getId()))).updateFrom(publicapiuser, cacheupdatemode);
            } else
            {
                return (PublicApiUser)userCache.get(Long.valueOf(publicapiuser.getId()));
            }
        } else
        {
            userCache.put(publicapiuser);
            return publicapiuser;
        }
    }

    public void clear()
    {
        trackCache.clear();
        userCache.clear();
    }

    public PublicApiPlaylist getCachedPlaylistFromCursor(Cursor cursor, String s)
    {
        long l = cursor.getLong(cursor.getColumnIndex(s));
        PublicApiPlaylist publicapiplaylist = (PublicApiPlaylist)playlistCache.get(Long.valueOf(l));
        s = publicapiplaylist;
        if (publicapiplaylist == null)
        {
            s = new PublicApiPlaylist(cursor);
            playlistCache.put(s);
        }
        return s;
    }

    public PublicApiTrack getCachedTrackFromCursor(Cursor cursor, String s)
    {
        long l = cursor.getLong(cursor.getColumnIndex(s));
        PublicApiTrack publicapitrack = (PublicApiTrack)trackCache.get(Long.valueOf(l));
        s = publicapitrack;
        if (publicapitrack == null)
        {
            s = new PublicApiTrack(cursor);
            trackCache.put(s);
        }
        return s;
    }

    public PublicApiUser getCachedUser(long l)
    {
        return (PublicApiUser)userCache.get(Long.valueOf(l));
    }

    public PublicApiUser getCachedUserFromActivityCursor(Cursor cursor)
    {
        long l = cursor.getLong(cursor.getColumnIndex("user_id"));
        PublicApiUser publicapiuser1 = (PublicApiUser)userCache.get(Long.valueOf(l));
        PublicApiUser publicapiuser = publicapiuser1;
        if (publicapiuser1 == null)
        {
            publicapiuser = PublicApiUser.fromActivityView(cursor);
            userCache.put(publicapiuser);
        }
        return publicapiuser;
    }

    public PublicApiUser getCachedUserFromCursor(Cursor cursor, String s)
    {
        long l = cursor.getLong(cursor.getColumnIndex(s));
        PublicApiUser publicapiuser = (PublicApiUser)userCache.get(Long.valueOf(l));
        s = publicapiuser;
        if (publicapiuser == null)
        {
            s = new PublicApiUser(cursor);
            userCache.put(s);
        }
        return s;
    }

    public PublicApiUser getCachedUserFromSoundViewCursor(Cursor cursor)
    {
        long l = cursor.getLong(cursor.getColumnIndex("sound_user_id"));
        PublicApiUser publicapiuser1 = (PublicApiUser)userCache.get(Long.valueOf(l));
        PublicApiUser publicapiuser = publicapiuser1;
        if (publicapiuser1 == null)
        {
            publicapiuser = PublicApiUser.fromSoundView(cursor);
            userCache.put(publicapiuser);
        }
        return publicapiuser;
    }

    public ScModel getModel(Uri uri)
    {
        return getModel(uri, getCacheFromUri(uri));
    }

    public PublicApiTrack getTrack(long l)
    {
        PublicApiTrack publicapitrack;
        if (l < 0L)
        {
            publicapitrack = null;
        } else
        {
            PublicApiTrack publicapitrack1 = (PublicApiTrack)trackCache.get(Long.valueOf(l));
            publicapitrack = publicapitrack1;
            if (publicapitrack1 == null)
            {
                PublicApiTrack publicapitrack2 = (PublicApiTrack)getModel(Content.TRACK.forId(l), null);
                publicapitrack = publicapitrack2;
                if (publicapitrack2 != null)
                {
                    trackCache.put(publicapitrack2);
                    return publicapitrack2;
                }
            }
        }
        return publicapitrack;
    }

    public PublicApiUser getUser(long l)
    {
        PublicApiUser publicapiuser;
        if (l < 0L)
        {
            publicapiuser = null;
        } else
        {
            PublicApiUser publicapiuser1 = (PublicApiUser)userCache.get(Long.valueOf(l));
            publicapiuser = publicapiuser1;
            if (publicapiuser1 == null)
            {
                PublicApiUser publicapiuser2 = (PublicApiUser)getModel(Content.USER.forId(l));
                publicapiuser = publicapiuser2;
                if (publicapiuser2 != null)
                {
                    userCache.put(publicapiuser2);
                    return publicapiuser2;
                }
            }
        }
        return publicapiuser;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

        static 
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.PLAYLIST.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
