// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.people.User;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

// Referenced classes of package com.googlecode.flickrjandroid.photos:
//            a, Size, Editability, GeoData, 
//            Permissions

public class Photo
    implements Serializable
{

    private static final ThreadLocal DATE_FORMATS = new a();
    private static final String DEFAULT_ORIGINAL_IMAGE_SUFFIX = "_o.jpg";
    private static final String LARGE_1600_IMAGE_SUFFIX = "_h.jpg";
    private static final String LARGE_2048_IMAGE_SUFFIX = "_k.jpg";
    private static final String LARGE_IMAGE_SUFFIX = "_b.jpg";
    private static final String LARGE_SQUARE_IMAGE_SUFFIX = "_q.jpg";
    private static final String MEDIUM_640_IMAGE_SUFFIX = "_z.jpg";
    private static final String MEDIUM_800_IMAGE_SUFFIX = "_c.jpg";
    private static final String MEDIUM_IMAGE_SUFFIX = ".jpg";
    private static final String SMALL_320_IMAGE_SUFFIX = "_n.jpg";
    private static final String SMALL_IMAGE_SUFFIX = "_m.jpg";
    private static final String SMALL_SQUARE_IMAGE_SUFFIX = "_s.jpg";
    private static final String THUMBNAIL_IMAGE_SUFFIX = "_t.jpg";
    public static final long serialVersionUID = 12L;
    private int comments;
    private Date dateAdded;
    private Date datePosted;
    private Date dateTaken;
    private String description;
    private Editability editability;
    private boolean familyFlag;
    private String farm;
    private boolean favorite;
    private int favorites;
    private boolean friendFlag;
    private GeoData geoData;
    private String iconFarm;
    private String iconServer;
    private String id;
    private Size large1600Size;
    private Size large2048Size;
    private Size largeSize;
    private Size largeSquareSize;
    private Date lastUpdate;
    private String license;
    private String media;
    private String mediaStatus;
    private Size medium640Size;
    private Size medium800Size;
    private Size mediumSize;
    private Collection notes;
    private String originalFormat;
    private int originalHeight;
    private String originalSecret;
    private Size originalSize;
    private int originalWidth;
    private User owner;
    private String pathAlias;
    private Permissions permissions;
    private String placeId;
    private boolean primary;
    private boolean publicFlag;
    private int rotation;
    private String secret;
    private String server;
    private Size small320Size;
    private Size smallSize;
    private Size squareSize;
    private Collection tags;
    private String takenGranularity;
    private Size thumbnailSize;
    private String title;
    private String url;
    private Collection urls;
    private int views;

    public Photo()
    {
        comments = -1;
        views = -1;
        favorites = -1;
    }

    private StringBuffer _getBaseImageUrl()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("https://farm");
        stringbuffer.append(getFarm());
        stringbuffer.append(".static.flickr.com/");
        stringbuffer.append(getServer());
        stringbuffer.append("/");
        stringbuffer.append(getId());
        stringbuffer.append("_");
        return stringbuffer;
    }

    private InputStream _getImageAsStream(String s)
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.connect();
        return s.getInputStream();
    }

    private StringBuffer getBaseImageUrl()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(_getBaseImageUrl());
        stringbuffer.append(getSecret());
        return stringbuffer;
    }

    private InputStream getImageAsStream(String s)
    {
        StringBuffer stringbuffer = getBaseImageUrl();
        stringbuffer.append(s);
        return _getImageAsStream(stringbuffer.toString());
    }

    private StringBuffer getOriginalBaseImageUrl()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(_getBaseImageUrl());
        if (getOriginalSecret().length() > 8)
        {
            stringbuffer.append(getOriginalSecret());
            return stringbuffer;
        } else
        {
            throw new FlickrException("0", "OriginalUrl not available because of missing originalsecret.");
        }
    }

    private InputStream getOriginalImageAsStream(String s)
    {
        StringBuffer stringbuffer = getOriginalBaseImageUrl();
        stringbuffer.append(s);
        return _getImageAsStream(stringbuffer.toString());
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof Photo))
        {
            return false;
        }
        obj = (Photo)obj;
        if (id == null)
        {
            if (((Photo) (obj)).id != null)
            {
                return false;
            }
        } else
        if (!id.equals(((Photo) (obj)).id))
        {
            return false;
        }
        if (title == null)
        {
            if (((Photo) (obj)).title != null)
            {
                return false;
            }
        } else
        if (!title.equals(((Photo) (obj)).title))
        {
            return false;
        }
        if (url != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Photo) (obj)).url == null) goto _L1; else goto _L3
_L3:
        return false;
        if (url.equals(((Photo) (obj)).url)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getComments()
    {
        return comments;
    }

    public Date getDateAdded()
    {
        return dateAdded;
    }

    public Date getDatePosted()
    {
        return datePosted;
    }

    public Date getDateTaken()
    {
        return dateTaken;
    }

    public String getDescription()
    {
        return description;
    }

    public Editability getEditability()
    {
        return editability;
    }

    public String getFarm()
    {
        return farm;
    }

    public int getFavorites()
    {
        return favorites;
    }

    public GeoData getGeoData()
    {
        return geoData;
    }

    public String getIconFarm()
    {
        return iconFarm;
    }

    public String getIconServer()
    {
        return iconServer;
    }

    public String getId()
    {
        return id;
    }

    public String getLarge1600Url()
    {
        if (large1600Size == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_h.jpg").toString();
        } else
        {
            return large1600Size.getSource();
        }
    }

    public String getLarge2048Url()
    {
        if (large2048Size == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_k.jpg").toString();
        } else
        {
            return large2048Size.getSource();
        }
    }

    public InputStream getLargeAsStream()
    {
        return getImageAsStream("_b.jpg");
    }

    public Size getLargeSize()
    {
        return largeSize;
    }

    public Size getLargeSquareSize()
    {
        return largeSquareSize;
    }

    public String getLargeSquareUrl()
    {
        if (largeSquareSize == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_q.jpg").toString();
        } else
        {
            return largeSquareSize.getSource();
        }
    }

    public String getLargeUrl()
    {
        if (largeSize == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_b.jpg").toString();
        } else
        {
            return largeSize.getSource();
        }
    }

    public Date getLastUpdate()
    {
        return lastUpdate;
    }

    public String getLicense()
    {
        return license;
    }

    public String getMedia()
    {
        return media;
    }

    public String getMediaStatus()
    {
        return mediaStatus;
    }

    public String getMedium640Url()
    {
        if (medium640Size == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_z.jpg").toString();
        } else
        {
            return medium640Size.getSource();
        }
    }

    public String getMedium800Url()
    {
        if (medium800Size == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_c.jpg").toString();
        } else
        {
            return medium800Size.getSource();
        }
    }

    public InputStream getMediumAsStream()
    {
        return getImageAsStream(".jpg");
    }

    public Size getMediumSize()
    {
        return mediumSize;
    }

    public String getMediumUrl()
    {
        if (mediumSize == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append(".jpg").toString();
        } else
        {
            return mediumSize.getSource();
        }
    }

    public Collection getNotes()
    {
        return notes;
    }

    public InputStream getOriginalAsStream()
    {
        if (originalFormat != null)
        {
            return getOriginalImageAsStream((new StringBuilder("_o.")).append(originalFormat).toString());
        } else
        {
            return getOriginalImageAsStream("_o.jpg");
        }
    }

    public String getOriginalFormat()
    {
        return originalFormat;
    }

    public int getOriginalHeight()
    {
        return originalHeight;
    }

    public String getOriginalSecret()
    {
        return originalSecret;
    }

    public Size getOriginalSize()
    {
        return originalSize;
    }

    public String getOriginalUrl()
    {
        if (originalSize == null)
        {
            if (originalFormat != null)
            {
                return (new StringBuilder()).append(getOriginalBaseImageUrl()).append("_o.").append(originalFormat).toString();
            } else
            {
                return (new StringBuilder()).append(getOriginalBaseImageUrl()).append("_o.jpg").toString();
            }
        } else
        {
            return originalSize.getSource();
        }
    }

    public int getOriginalWidth()
    {
        return originalWidth;
    }

    public User getOwner()
    {
        return owner;
    }

    public String getPathAlias()
    {
        return pathAlias;
    }

    public Permissions getPermissions()
    {
        return permissions;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public int getRotation()
    {
        return rotation;
    }

    public String getSecret()
    {
        return secret;
    }

    public String getServer()
    {
        return server;
    }

    public String getSmall320Url()
    {
        if (small320Size == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_n.jpg").toString();
        } else
        {
            return small320Size.getSource();
        }
    }

    public InputStream getSmallAsInputStream()
    {
        return getImageAsStream("_m.jpg");
    }

    public Size getSmallSize()
    {
        return smallSize;
    }

    public InputStream getSmallSquareAsInputStream()
    {
        return getImageAsStream("_s.jpg");
    }

    public String getSmallSquareUrl()
    {
        if (squareSize == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_s.jpg").toString();
        } else
        {
            return squareSize.getSource();
        }
    }

    public String getSmallUrl()
    {
        if (smallSize == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_m.jpg").toString();
        } else
        {
            return smallSize.getSource();
        }
    }

    public Size getSquareSize()
    {
        return squareSize;
    }

    public Collection getTags()
    {
        return tags;
    }

    public String getTakenGranularity()
    {
        return takenGranularity;
    }

    public InputStream getThumbnailAsInputStream()
    {
        return getImageAsStream("_t.jpg");
    }

    public Size getThumbnailSize()
    {
        return thumbnailSize;
    }

    public String getThumbnailUrl()
    {
        if (thumbnailSize == null)
        {
            return (new StringBuilder()).append(getBaseImageUrl()).append("_t.jpg").toString();
        } else
        {
            return thumbnailSize.getSource();
        }
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl()
    {
        return url;
    }

    public Collection getUrls()
    {
        return urls;
    }

    public int getViews()
    {
        return views;
    }

    public boolean hasGeoData()
    {
        return geoData != null;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        if (title == null)
        {
            j = 0;
        } else
        {
            j = title.hashCode();
        }
        if (url != null)
        {
            k = url.hashCode();
        }
        return (j + (i + 31) * 31) * 31 + k;
    }

    public boolean isFamilyFlag()
    {
        return familyFlag;
    }

    public boolean isFavorite()
    {
        return favorite;
    }

    public boolean isFriendFlag()
    {
        return friendFlag;
    }

    public boolean isPrimary()
    {
        return primary;
    }

    public boolean isPublicFlag()
    {
        return publicFlag;
    }

    public void setComments(int i)
    {
        comments = i;
    }

    public void setComments(String s)
    {
        if (s != null)
        {
            setComments(Integer.parseInt(s));
        }
    }

    public void setDateAdded(long l)
    {
        setDateAdded(new Date(l));
    }

    public void setDateAdded(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setDateAdded(Long.parseLong(s) * 1000L);
            return;
        }
    }

    public void setDateAdded(Date date)
    {
        dateAdded = date;
    }

    public void setDatePosted(long l)
    {
        setDatePosted(new Date(l));
    }

    public void setDatePosted(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setDatePosted(Long.parseLong(s) * 1000L);
            return;
        }
    }

    public void setDatePosted(Date date)
    {
        datePosted = date;
    }

    public void setDateTaken(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        }
        try
        {
            setDateTaken(((DateFormat)DATE_FORMATS.get()).parse(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void setDateTaken(Date date)
    {
        dateTaken = date;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEditability(Editability editability1)
    {
        editability = editability1;
    }

    public void setFamilyFlag(boolean flag)
    {
        familyFlag = flag;
    }

    public void setFarm(String s)
    {
        farm = s;
    }

    public void setFavorite(boolean flag)
    {
        favorite = flag;
    }

    public void setFavorites(int i)
    {
        favorites = i;
    }

    public void setFriendFlag(boolean flag)
    {
        friendFlag = flag;
    }

    public void setGeoData(GeoData geodata)
    {
        geoData = geodata;
    }

    public void setIconFarm(String s)
    {
        iconFarm = s;
    }

    public void setIconServer(String s)
    {
        iconServer = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLastUpdate(String s)
    {
        if (s == null || "".equals(s))
        {
            return;
        } else
        {
            setLastUpdate(new Date(Long.parseLong(s) * 1000L));
            return;
        }
    }

    public void setLastUpdate(Date date)
    {
        lastUpdate = date;
    }

    public void setLicense(String s)
    {
        license = s;
    }

    public void setMedia(String s)
    {
        media = s;
    }

    public void setMediaStatus(String s)
    {
        mediaStatus = s;
    }

    public void setNotes(Collection collection)
    {
        notes = collection;
    }

    public void setOriginalFormat(String s)
    {
        originalFormat = s;
    }

    public void setOriginalHeight(int i)
    {
        originalHeight = i;
    }

    public void setOriginalHeight(String s)
    {
        try
        {
            setOriginalHeight(Integer.parseInt(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setOriginalSecret(String s)
    {
        originalSecret = s;
    }

    public void setOriginalWidth(int i)
    {
        originalWidth = i;
    }

    public void setOriginalWidth(String s)
    {
        try
        {
            setOriginalWidth(Integer.parseInt(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setOwner(User user)
    {
        owner = user;
    }

    public void setPathAlias(String s)
    {
        pathAlias = s;
    }

    public void setPermissions(Permissions permissions1)
    {
        permissions = permissions1;
    }

    public void setPlaceId(String s)
    {
        placeId = s;
    }

    public void setPrimary(String s)
    {
        setPrimary("1".equals(s));
    }

    public void setPrimary(boolean flag)
    {
        primary = flag;
    }

    public void setPublicFlag(boolean flag)
    {
        publicFlag = flag;
    }

    public void setRotation(int i)
    {
        rotation = i;
    }

    public void setRotation(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setRotation(Integer.parseInt(s));
        return;
        s;
        setRotation(-1);
        return;
    }

    public void setSecret(String s)
    {
        secret = s;
    }

    public void setServer(String s)
    {
        server = s;
    }

    public void setSizes(Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return;
            }
            Size size = (Size)collection.next();
            if (size.getLabel() == 1)
            {
                squareSize = size;
            } else
            if (size.getLabel() == 6)
            {
                largeSquareSize = size;
            } else
            if (size.getLabel() == 0)
            {
                thumbnailSize = size;
            } else
            if (size.getLabel() == 2)
            {
                smallSize = size;
            } else
            if (size.getLabel() == 10)
            {
                small320Size = size;
            } else
            if (size.getLabel() == 3)
            {
                mediumSize = size;
            } else
            if (size.getLabel() == 11)
            {
                medium640Size = size;
            } else
            if (size.getLabel() == 12)
            {
                medium800Size = size;
            } else
            if (size.getLabel() == 4)
            {
                largeSize = size;
            } else
            if (size.getLabel() == 13)
            {
                large1600Size = size;
            } else
            if (size.getLabel() == 14)
            {
                large2048Size = size;
            } else
            if (size.getLabel() == 5)
            {
                originalSize = size;
            }
        } while (true);
    }

    public void setTags(Collection collection)
    {
        tags = collection;
    }

    public void setTakenGranularity(String s)
    {
        takenGranularity = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setUrls(Collection collection)
    {
        urls = collection;
    }

    public void setViews(int i)
    {
        views = i;
    }

    public void setViews(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setViews(Integer.parseInt(s));
        return;
        s;
        setViews(-1);
        return;
    }

}
