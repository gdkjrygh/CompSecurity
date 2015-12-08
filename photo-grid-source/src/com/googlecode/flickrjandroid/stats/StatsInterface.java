// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.stats;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.stats:
//            StatsUtils, AccountStats, DomainList, ReferrerList, 
//            Stats

public class StatsInterface
{

    public static final String METHOD_GET_COLLECTION_DOMAINS = "flickr.stats.getCollectionDomains";
    public static final String METHOD_GET_COLLECTION_REFERRERS = "flickr.stats.getCollectionReferrers";
    public static final String METHOD_GET_COLLECTION_STATS = "flickr.stats.getCollectionStats";
    public static final String METHOD_GET_CSV_FILES = "flickr.stats.getCSVFiles";
    public static final String METHOD_GET_PHOTOSET_DOMAINS = "flickr.stats.getPhotosetDomains";
    public static final String METHOD_GET_PHOTOSET_REFERRERS = "flickr.stats.getPhotosetReferrers";
    public static final String METHOD_GET_PHOTOSET_STATS = "flickr.stats.getPhotosetStats";
    public static final String METHOD_GET_PHOTOSTREAM_DOMAINS = "flickr.stats.getPhotostreamDomains";
    public static final String METHOD_GET_PHOTOSTREAM_REFERRERS = "flickr.stats.getPhotostreamReferrers";
    public static final String METHOD_GET_PHOTOSTREAM_STATS = "flickr.stats.getPhotostreamStats";
    public static final String METHOD_GET_PHOTO_DOMAINS = "flickr.stats.getPhotoDomains";
    public static final String METHOD_GET_PHOTO_REFERRERS = "flickr.stats.getPhotoReferrers";
    public static final String METHOD_GET_PHOTO_STATS = "flickr.stats.getPhotoStats";
    public static final String METHOD_GET_POPULAR_PHOTOS = "flickr.stats.getPopularPhotos";
    public static final String METHOD_GET_TOTAL_VIEWS = "flickr.stats.getTotalViews";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public StatsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public void getCSVFiles()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getCSVFiles"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        throw new UnsupportedOperationException();
    }

    public DomainList getCollectionDomains(String s, String s1, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getCollectionDomains"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("collection_id", s1));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createDomainList(s.getData().getJSONObject("domains"));
        }
    }

    public DomainList getCollectionDomains(Date date, String s, int i, int j)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getCollectionDomains(((String) (date)), s, i, j);
    }

    public ReferrerList getCollectionReferrers(String s, String s1, String s2, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getCollectionReferrers"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        arraylist.add(new Parameter("domain", s1));
        if (s2 != null)
        {
            arraylist.add(new Parameter("collection_id", s2));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createReferrerList(s.getData().getJSONObject("domain"));
        }
    }

    public ReferrerList getCollectionReferrers(Date date, String s, String s1, int i, int j)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getCollectionReferrers(((String) (date)), s, s1, i, j);
    }

    public Stats getCollectionStats(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getCollectionStats"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        arraylist.add(new Parameter("collection_id", s1));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createStats(s.getData());
        }
    }

    public Stats getCollectionStats(Date date, String s)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getCollectionStats(((String) (date)), s);
    }

    public DomainList getPhotoDomains(String s, String s1, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotoDomains"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("photo_id", s1));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createDomainList(s.getData().getJSONObject("domains"));
        }
    }

    public DomainList getPhotoDomains(Date date, String s, int i, int j)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotoDomains(((String) (date)), s, i, j);
    }

    public ReferrerList getPhotoReferrers(String s, String s1, String s2, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotoReferrers"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        arraylist.add(new Parameter("domain", s1));
        if (s2 != null)
        {
            arraylist.add(new Parameter("photo_id", s2));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createReferrerList(s.getData().getJSONObject("domain"));
        }
    }

    public ReferrerList getPhotoReferrers(Date date, String s, String s1, int i, int j)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotoReferrers(((String) (date)), s, s1, i, j);
    }

    public Stats getPhotoStats(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotoStats"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        arraylist.add(new Parameter("photo_id", s1));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createStats(s.getData());
        }
    }

    public Stats getPhotoStats(Date date, String s)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotoStats(((String) (date)), s);
    }

    public DomainList getPhotosetDomains(String s, String s1, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotosetDomains"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        if (s1 != null)
        {
            arraylist.add(new Parameter("photoset_id", s1));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createDomainList(s.getData().getJSONObject("domains"));
        }
    }

    public DomainList getPhotosetDomains(Date date, String s, int i, int j)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotosetDomains(((String) (date)), s, i, j);
    }

    public ReferrerList getPhotosetReferrers(String s, String s1, String s2, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotosetReferrers"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        arraylist.add(new Parameter("domain", s1));
        if (s2 != null)
        {
            arraylist.add(new Parameter("photoset_id", s2));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createReferrerList(s.getData().getJSONObject("domain"));
        }
    }

    public ReferrerList getPhotosetReferrers(Date date, String s, String s1, int i, int j)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotosetReferrers(((String) (date)), s, s1, i, j);
    }

    public Stats getPhotosetStats(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotosetStats"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        arraylist.add(new Parameter("photoset_id", s1));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createStats(s.getData());
        }
    }

    public Stats getPhotosetStats(Date date, String s)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotosetStats(((String) (date)), s);
    }

    public DomainList getPhotostreamDomains(String s, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotostreamDomains"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createDomainList(s.getData().getJSONObject("domains"));
        }
    }

    public DomainList getPhotostreamDomains(Date date, int i, int j)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotostreamDomains(((String) (date)), i, j);
    }

    public ReferrerList getPhotostreamReferrers(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotostreamReferrers"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        arraylist.add(new Parameter("domain", s1));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createReferrerList(s.getData().getJSONObject("domain"));
        }
    }

    public ReferrerList getPhotostreamReferrers(Date date, String s)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotostreamReferrers(((String) (date)), s);
    }

    public Stats getPhotostreamStats(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPhotostreamStats"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return StatsUtils.createStats(s.getData());
        }
    }

    public Stats getPhotostreamStats(Date date)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getPhotostreamStats(((String) (date)));
    }

    public PhotoList getPopularPhotos(Date date, SORT sort, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getPopularPhotos"));
        if (date != null)
        {
            arraylist.add(new Parameter("date", date.getTime() / 1000L));
        }
        if (sort != null)
        {
            arraylist.add(new Parameter("sort", sort.name().toLowerCase(Locale.US)));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", Integer.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", Integer.valueOf(j)));
        }
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(arraylist);
        date = transportAPI.postJSON(sharedSecret, arraylist);
        if (date.isError())
        {
            throw new FlickrException(date.getErrorCode(), date.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(date.getData());
        }
    }

    public AccountStats getTotalViews(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.stats.getTotalViews"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            s = s.getData().getJSONObject("stats");
            AccountStats accountstats = new AccountStats();
            accountstats.setTotalViews(s.getJSONObject("total").getInt("views"));
            accountstats.setPhotosViews(s.getJSONObject("photos").getInt("views"));
            accountstats.setPhotostreamViews(s.getJSONObject("photostream").getInt("views"));
            accountstats.setSetsViews(s.getJSONObject("sets").getInt("views"));
            accountstats.setCollectionsViews(s.getJSONObject("collections").getInt("views"));
            accountstats.setGalleriesViews(s.getJSONObject("galleries").getInt("views"));
            return accountstats;
        }
    }

    public AccountStats getTotalViews(Date date)
    {
        if (date != null)
        {
            date = String.valueOf(date.getTime() / 1000L);
        } else
        {
            date = null;
        }
        return getTotalViews(((String) (date)));
    }

    private class SORT extends Enum
    {

        public static final SORT COMMENTS;
        private static final SORT ENUM$VALUES[];
        public static final SORT FAVORITES;
        public static final SORT VIEWS;

        public static SORT valueOf(String s)
        {
            return (SORT)Enum.valueOf(com/googlecode/flickrjandroid/stats/StatsInterface$SORT, s);
        }

        public static SORT[] values()
        {
            SORT asort[] = ENUM$VALUES;
            int i = asort.length;
            SORT asort1[] = new SORT[i];
            System.arraycopy(asort, 0, asort1, 0, i);
            return asort1;
        }

        static 
        {
            VIEWS = new SORT("VIEWS", 0);
            COMMENTS = new SORT("COMMENTS", 1);
            FAVORITES = new SORT("FAVORITES", 2);
            ENUM$VALUES = (new SORT[] {
                VIEWS, COMMENTS, FAVORITES
            });
        }

        private SORT(String s, int i)
        {
            super(s, i);
        }
    }

}
