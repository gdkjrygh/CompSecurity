// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model.stream;

import com.soundcloud.java.optional.Optional;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.model.stream:
//            ApiPromotedTrack, ApiPromotedPlaylist, ApiStreamTrackPost, ApiStreamTrackRepost, 
//            ApiStreamPlaylistPost, ApiStreamPlaylistRepost

public class ApiStreamItem
{

    private static final long PROMOTED_CREATION_DATE = 0x7fffffffffffffffL;
    private ApiStreamPlaylistPost apiPlaylistPost;
    private ApiStreamPlaylistRepost apiPlaylistRepost;
    private ApiPromotedPlaylist apiPromotedPlaylist;
    private ApiPromotedTrack apiPromotedTrack;
    private ApiStreamTrackPost apiTrackPost;
    private ApiStreamTrackRepost apiTrackRepost;

    public ApiStreamItem(ApiPromotedPlaylist apipromotedplaylist)
    {
        apiPromotedPlaylist = apipromotedplaylist;
    }

    public ApiStreamItem(ApiPromotedTrack apipromotedtrack)
    {
        apiPromotedTrack = apipromotedtrack;
    }

    public ApiStreamItem(ApiPromotedTrack apipromotedtrack, ApiPromotedPlaylist apipromotedplaylist, ApiStreamTrackPost apistreamtrackpost, ApiStreamTrackRepost apistreamtrackrepost, ApiStreamPlaylistPost apistreamplaylistpost, ApiStreamPlaylistRepost apistreamplaylistrepost)
    {
        apiPromotedTrack = apipromotedtrack;
        apiPromotedPlaylist = apipromotedplaylist;
        apiTrackPost = apistreamtrackpost;
        apiTrackRepost = apistreamtrackrepost;
        apiPlaylistPost = apistreamplaylistpost;
        apiPlaylistRepost = apistreamplaylistrepost;
    }

    public ApiStreamItem(ApiStreamPlaylistPost apistreamplaylistpost)
    {
        apiPlaylistPost = apistreamplaylistpost;
    }

    public ApiStreamItem(ApiStreamPlaylistRepost apistreamplaylistrepost)
    {
        apiPlaylistRepost = apistreamplaylistrepost;
    }

    public ApiStreamItem(ApiStreamTrackPost apistreamtrackpost)
    {
        apiTrackPost = apistreamtrackpost;
    }

    public ApiStreamItem(ApiStreamTrackRepost apistreamtrackrepost)
    {
        apiTrackRepost = apistreamtrackrepost;
    }

    public Optional getAdUrn()
    {
        if (apiPromotedTrack != null)
        {
            return Optional.of(apiPromotedTrack.getAdUrn());
        }
        if (apiPromotedPlaylist != null)
        {
            return Optional.of(apiPromotedPlaylist.getAdUrn());
        } else
        {
            return Optional.absent();
        }
    }

    public long getCreatedAtTime()
    {
        if (apiTrackPost != null)
        {
            return apiTrackPost.getCreatedAtTime();
        }
        if (apiTrackRepost != null)
        {
            return apiTrackRepost.getCreatedAtTime();
        }
        if (apiPlaylistPost != null)
        {
            return apiPlaylistPost.getCreatedAtTime();
        }
        if (apiPlaylistRepost != null)
        {
            return apiPlaylistRepost.getCreatedAtTime();
        }
        if (apiPromotedTrack != null || apiPromotedPlaylist != null)
        {
            return 0x7fffffffffffffffL;
        } else
        {
            throw new IllegalArgumentException("Unknown stream item type when fetching creation date");
        }
    }

    public Optional getPlaylist()
    {
        if (apiPlaylistPost != null)
        {
            return Optional.of(apiPlaylistPost.getApiPlaylist());
        }
        if (apiPlaylistRepost != null)
        {
            return Optional.of(apiPlaylistRepost.getApiPlaylist());
        }
        if (apiPromotedPlaylist != null)
        {
            return Optional.of(apiPromotedPlaylist.getApiPlaylist());
        } else
        {
            return Optional.absent();
        }
    }

    public Optional getPromoter()
    {
        if (apiPromotedTrack != null)
        {
            return Optional.fromNullable(apiPromotedTrack.getPromoter());
        }
        if (apiPromotedPlaylist != null)
        {
            return Optional.fromNullable(apiPromotedPlaylist.getPromoter());
        } else
        {
            return Optional.absent();
        }
    }

    public Optional getReposter()
    {
        if (apiTrackRepost != null)
        {
            return Optional.of(apiTrackRepost.getReposter());
        }
        if (apiPlaylistRepost != null)
        {
            return Optional.of(apiPlaylistRepost.getReposter());
        } else
        {
            return Optional.absent();
        }
    }

    public Optional getTrack()
    {
        if (apiTrackPost != null)
        {
            return Optional.of(apiTrackPost.getApiTrack());
        }
        if (apiTrackRepost != null)
        {
            return Optional.of(apiTrackRepost.getApiTrack());
        }
        if (apiPromotedTrack != null)
        {
            return Optional.of(apiPromotedTrack.getApiTrack());
        } else
        {
            return Optional.absent();
        }
    }

    public List getTrackingItemClickedUrls()
    {
        if (apiPromotedTrack != null)
        {
            return apiPromotedTrack.getTrackingTrackClickedUrls();
        }
        if (apiPromotedPlaylist != null)
        {
            return apiPromotedPlaylist.getTrackingPlaylistClickedUrls();
        } else
        {
            return Collections.emptyList();
        }
    }

    public List getTrackingItemImpressionUrls()
    {
        if (apiPromotedTrack != null)
        {
            return apiPromotedTrack.getTrackingTrackImpressionUrls();
        }
        if (apiPromotedPlaylist != null)
        {
            return apiPromotedPlaylist.getTrackingPlaylistImpressionUrls();
        } else
        {
            return Collections.emptyList();
        }
    }

    public List getTrackingProfileClickedUrls()
    {
        if (apiPromotedTrack != null)
        {
            return apiPromotedTrack.getTrackingProfileClickedUrls();
        }
        if (apiPromotedPlaylist != null)
        {
            return apiPromotedPlaylist.getTrackingProfileClickedUrls();
        } else
        {
            return Collections.emptyList();
        }
    }

    public List getTrackingPromoterClickedUrls()
    {
        if (apiPromotedTrack != null)
        {
            return apiPromotedTrack.getTrackingPromoterClickedUrls();
        }
        if (apiPromotedPlaylist != null)
        {
            return apiPromotedPlaylist.getTrackingPromoterClickedUrls();
        } else
        {
            return Collections.emptyList();
        }
    }

    public List getTrackingTrackPlayedUrls()
    {
        if (apiPromotedTrack != null)
        {
            return apiPromotedTrack.getTrackingTrackPlayedUrls();
        }
        if (apiPromotedPlaylist != null)
        {
            return apiPromotedPlaylist.getTrackingTrackPlayedUrls();
        } else
        {
            return Collections.emptyList();
        }
    }

    public boolean isPromotedStreamItem()
    {
        return apiPromotedTrack != null || apiPromotedPlaylist != null;
    }
}
