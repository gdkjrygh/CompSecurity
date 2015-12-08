// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.net.Uri;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.provider.Content;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            SearchSuggestions

public static class intentData
{

    public static final String KIND_PLAYLIST = "playlist";
    public static final String KIND_TRACK = "track";
    public static final String KIND_USER = "user";
    public static final Set SUPPORTED_KINDS;
    public List highlights;
    private String iconUri;
    public long id;
    private String intentData;
    public String kind;
    public String query;
    public int query_position;
    public String query_urn;
    public long score;

    private Uri contentProviderUri()
    {
        Urn urn = getUrn();
        if (urn.isTrack())
        {
            return Content.TRACK.forId(urn.getNumericId());
        }
        if (urn.isUser())
        {
            return Content.USER.forId(urn.getNumericId());
        }
        if (urn.isPlaylist())
        {
            return Content.PLAYLIST.forId(urn.getNumericId());
        } else
        {
            throw new IllegalStateException((new StringBuilder("Can't convert to content Uri: ")).append(urn).toString());
        }
    }

    static Uri getDataUri(Urn urn)
    {
        if (urn.isUser())
        {
            return Content.USER.forId(urn.getNumericId());
        }
        if (urn.isTrack() || urn.isPlaylist())
        {
            return Content.TRACK.forId(urn.getNumericId());
        } else
        {
            throw new IllegalStateException((new StringBuilder("Unknown urn type ")).append(urn).toString());
        }
    }

    static String kindFromUrn(Urn urn)
    {
        if (urn.isUser())
        {
            return "user";
        }
        if (urn.isTrack())
        {
            return "track";
        }
        if (urn.isPlaylist())
        {
            return "playlist";
        } else
        {
            throw new IllegalStateException((new StringBuilder("Unknown urn type ")).append(urn).toString());
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (getUrn)obj;
        if (id != ((id) (obj)).id)
        {
            break; /* Loop/switch isn't completed */
        }
        if (kind == null) goto _L4; else goto _L3
_L3:
        if (kind.equals(((kind) (obj)).kind)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((kind) (obj)).kind == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getIntentData()
    {
        if (intentData != null)
        {
            return intentData;
        } else
        {
            return contentProviderUri().toString();
        }
    }

    public Urn getUrn()
    {
        return new Urn((new StringBuilder("soundcloud:")).append(kind).append("s:").append(id).toString());
    }

    public int hashCode()
    {
        int i;
        if (kind != null)
        {
            i = kind.hashCode();
        } else
        {
            i = 0;
        }
        return i * 31 + (int)(id ^ id >>> 32);
    }

    public boolean isLocal()
    {
        return score == 0L;
    }

    public boolean isRemote()
    {
        return score != 0L;
    }

    public String toString()
    {
        return (new StringBuilder("Query{query='")).append(query).append('\'').append(", kind='").append(kind).append('\'').append(", id=").append(id).append(", score=").append(score).append(", iconUri=").append(iconUri).append('}').toString();
    }

    static 
    {
        HashSet hashset = new HashSet();
        SUPPORTED_KINDS = hashset;
        hashset.add("user");
        SUPPORTED_KINDS.add("track");
    }


/*
    static String access$002( , String s)
    {
        .intentData = s;
        return s;
    }

*/

    public intentData()
    {
    }
}
