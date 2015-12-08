// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import com.googlecode.flickrjandroid.activity.ActivityInterface;
import com.googlecode.flickrjandroid.blogs.BlogsInterface;
import com.googlecode.flickrjandroid.collections.CollectionsInterface;
import com.googlecode.flickrjandroid.commons.CommonsInterface;
import com.googlecode.flickrjandroid.contacts.ContactsInterface;
import com.googlecode.flickrjandroid.favorites.FavoritesInterface;
import com.googlecode.flickrjandroid.galleries.GalleriesInterface;
import com.googlecode.flickrjandroid.groups.GroupsInterface;
import com.googlecode.flickrjandroid.groups.members.MembersInterface;
import com.googlecode.flickrjandroid.groups.pools.PoolsInterface;
import com.googlecode.flickrjandroid.interestingness.InterestingnessInterface;
import com.googlecode.flickrjandroid.machinetags.MachinetagsInterface;
import com.googlecode.flickrjandroid.oauth.OAuthInterface;
import com.googlecode.flickrjandroid.panda.PandaInterface;
import com.googlecode.flickrjandroid.people.PeopleInterface;
import com.googlecode.flickrjandroid.photos.PhotosInterface;
import com.googlecode.flickrjandroid.photos.comments.CommentsInterface;
import com.googlecode.flickrjandroid.photos.geo.GeoInterface;
import com.googlecode.flickrjandroid.photos.licenses.LicensesInterface;
import com.googlecode.flickrjandroid.photos.notes.NotesInterface;
import com.googlecode.flickrjandroid.photos.transform.TransformInterface;
import com.googlecode.flickrjandroid.photosets.PhotosetsInterface;
import com.googlecode.flickrjandroid.photosets.comments.PhotosetsCommentsInterface;
import com.googlecode.flickrjandroid.places.PlacesInterface;
import com.googlecode.flickrjandroid.prefs.PrefsInterface;
import com.googlecode.flickrjandroid.reflection.ReflectionInterface;
import com.googlecode.flickrjandroid.stats.StatsInterface;
import com.googlecode.flickrjandroid.tags.TagsInterface;
import com.googlecode.flickrjandroid.test.TestInterface;
import com.googlecode.flickrjandroid.uploader.Uploader;
import com.googlecode.flickrjandroid.urls.UrlsInterface;
import javax.xml.parsers.ParserConfigurationException;

// Referenced classes of package com.googlecode.flickrjandroid:
//            REST, Transport

public class Flickr
{

    public static final int ACCURACY_CITY = 11;
    public static final int ACCURACY_COUNTRY = 3;
    public static final int ACCURACY_REGION = 6;
    public static final int ACCURACY_STREET = 16;
    public static final int ACCURACY_WORLD = 1;
    public static final String CONTENTTYPE_OTHER = "3";
    public static final String CONTENTTYPE_PHOTO = "1";
    public static final String CONTENTTYPE_SCREENSHOT = "2";
    public static final String DEFAULT_API_HOST = "api.flickr.com";
    public static final int PRIVACY_LEVEL_FAMILY = 3;
    public static final int PRIVACY_LEVEL_FRIENDS = 2;
    public static final int PRIVACY_LEVEL_FRIENDS_FAMILY = 4;
    public static final int PRIVACY_LEVEL_NO_FILTER = 0;
    public static final int PRIVACY_LEVEL_PRIVATE = 5;
    public static final int PRIVACY_LEVEL_PUBLIC = 1;
    public static final String SAFETYLEVEL_MODERATE = "2";
    public static final String SAFETYLEVEL_RESTRICTED = "3";
    public static final String SAFETYLEVEL_SAFE = "1";
    public static boolean tracing = false;
    private ActivityInterface activityInterface;
    private String apiKey;
    private BlogsInterface blogsInterface;
    private CollectionsInterface collectionsInterface;
    private CommentsInterface commentsInterface;
    private CommonsInterface commonsInterface;
    private ContactsInterface contactsInterface;
    private FavoritesInterface favoritesInterface;
    private GalleriesInterface galleriesInterface;
    private GeoInterface geoInterface;
    private GroupsInterface groupsInterface;
    private InterestingnessInterface interestingnessInterface;
    private LicensesInterface licensesInterface;
    private MachinetagsInterface machinetagsInterface;
    private MembersInterface membersInterface;
    private NotesInterface notesInterface;
    private OAuthInterface oAuthInterface;
    private PandaInterface pandaInterface;
    private PeopleInterface peopleInterface;
    private PhotosInterface photosInterface;
    private PhotosetsCommentsInterface photosetsCommentsInterface;
    private PhotosetsInterface photosetsInterface;
    private PlacesInterface placesInterface;
    private PoolsInterface poolsInterface;
    private PrefsInterface prefsInterface;
    private ReflectionInterface reflectionInterface;
    private String sharedSecret;
    private StatsInterface statsInterface;
    private TagsInterface tagsInterface;
    private TestInterface testInterface;
    private TransformInterface transformInterface;
    private Transport transport;
    private Uploader uploader;
    private UrlsInterface urlsInterface;

    public Flickr(String s)
    {
        setApiKey(s);
        try
        {
            setTransport(new REST("api.flickr.com"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage(), s);
        }
    }

    public Flickr(String s, Transport transport1)
    {
        setApiKey(s);
        setTransport(transport1);
    }

    public Flickr(String s, String s1)
    {
        this(s);
        setSharedSecret(s1);
    }

    public Flickr(String s, String s1, Transport transport1)
    {
        setApiKey(s);
        setSharedSecret(s1);
        setTransport(transport1);
    }

    public ActivityInterface getActivityInterface()
    {
        if (activityInterface == null)
        {
            activityInterface = new ActivityInterface(apiKey, sharedSecret, transport);
        }
        return activityInterface;
    }

    public String getApiKey()
    {
        return apiKey;
    }

    public BlogsInterface getBlogsInterface()
    {
        this;
        JVM INSTR monitorenter ;
        BlogsInterface blogsinterface;
        if (blogsInterface == null)
        {
            blogsInterface = new BlogsInterface(apiKey, sharedSecret, transport);
        }
        blogsinterface = blogsInterface;
        this;
        JVM INSTR monitorexit ;
        return blogsinterface;
        Exception exception;
        exception;
        throw exception;
    }

    public CollectionsInterface getCollectionsInterface()
    {
        if (collectionsInterface == null)
        {
            collectionsInterface = new CollectionsInterface(apiKey, sharedSecret, transport);
        }
        return collectionsInterface;
    }

    public CommentsInterface getCommentsInterface()
    {
        if (commentsInterface == null)
        {
            commentsInterface = new CommentsInterface(apiKey, sharedSecret, transport);
        }
        return commentsInterface;
    }

    public CommonsInterface getCommonsInterface()
    {
        if (commonsInterface == null)
        {
            commonsInterface = new CommonsInterface(apiKey, sharedSecret, transport);
        }
        return commonsInterface;
    }

    public ContactsInterface getContactsInterface()
    {
        if (contactsInterface == null)
        {
            contactsInterface = new ContactsInterface(apiKey, sharedSecret, transport);
        }
        return contactsInterface;
    }

    public FavoritesInterface getFavoritesInterface()
    {
        if (favoritesInterface == null)
        {
            favoritesInterface = new FavoritesInterface(apiKey, sharedSecret, transport);
        }
        return favoritesInterface;
    }

    public GalleriesInterface getGalleriesInterface()
    {
        if (galleriesInterface == null)
        {
            galleriesInterface = new GalleriesInterface(apiKey, sharedSecret, transport);
        }
        return galleriesInterface;
    }

    public GeoInterface getGeoInterface()
    {
        if (geoInterface == null)
        {
            geoInterface = new GeoInterface(apiKey, sharedSecret, transport);
        }
        return geoInterface;
    }

    public GroupsInterface getGroupsInterface()
    {
        if (groupsInterface == null)
        {
            groupsInterface = new GroupsInterface(apiKey, sharedSecret, transport);
        }
        return groupsInterface;
    }

    public InterestingnessInterface getInterestingnessInterface()
    {
        this;
        JVM INSTR monitorenter ;
        InterestingnessInterface interestingnessinterface;
        if (interestingnessInterface == null)
        {
            interestingnessInterface = new InterestingnessInterface(apiKey, sharedSecret, transport);
        }
        interestingnessinterface = interestingnessInterface;
        this;
        JVM INSTR monitorexit ;
        return interestingnessinterface;
        Exception exception;
        exception;
        throw exception;
    }

    public LicensesInterface getLicensesInterface()
    {
        if (licensesInterface == null)
        {
            licensesInterface = new LicensesInterface(apiKey, sharedSecret, transport);
        }
        return licensesInterface;
    }

    public MachinetagsInterface getMachinetagsInterface()
    {
        if (machinetagsInterface == null)
        {
            machinetagsInterface = new MachinetagsInterface(apiKey, sharedSecret, transport);
        }
        return machinetagsInterface;
    }

    public MembersInterface getMembersInterface()
    {
        if (membersInterface == null)
        {
            membersInterface = new MembersInterface(apiKey, sharedSecret, transport);
        }
        return membersInterface;
    }

    public NotesInterface getNotesInterface()
    {
        if (notesInterface == null)
        {
            notesInterface = new NotesInterface(apiKey, sharedSecret, transport);
        }
        return notesInterface;
    }

    public OAuthInterface getOAuthInterface()
    {
        if (oAuthInterface == null)
        {
            oAuthInterface = new OAuthInterface(apiKey, sharedSecret, transport);
        }
        return oAuthInterface;
    }

    public PandaInterface getPandaInterface()
    {
        if (pandaInterface == null)
        {
            pandaInterface = new PandaInterface(apiKey, sharedSecret, transport);
        }
        return pandaInterface;
    }

    public PeopleInterface getPeopleInterface()
    {
        if (peopleInterface == null)
        {
            peopleInterface = new PeopleInterface(apiKey, sharedSecret, transport);
        }
        return peopleInterface;
    }

    public PhotosInterface getPhotosInterface()
    {
        if (photosInterface == null)
        {
            photosInterface = new PhotosInterface(apiKey, sharedSecret, transport);
        }
        return photosInterface;
    }

    public PhotosetsCommentsInterface getPhotosetsCommentsInterface()
    {
        if (photosetsCommentsInterface == null)
        {
            photosetsCommentsInterface = new PhotosetsCommentsInterface(apiKey, sharedSecret, transport);
        }
        return photosetsCommentsInterface;
    }

    public PhotosetsInterface getPhotosetsInterface()
    {
        if (photosetsInterface == null)
        {
            photosetsInterface = new PhotosetsInterface(apiKey, sharedSecret, transport);
        }
        return photosetsInterface;
    }

    public PlacesInterface getPlacesInterface()
    {
        if (placesInterface == null)
        {
            placesInterface = new PlacesInterface(apiKey, sharedSecret, transport);
        }
        return placesInterface;
    }

    public PoolsInterface getPoolsInterface()
    {
        if (poolsInterface == null)
        {
            poolsInterface = new PoolsInterface(apiKey, sharedSecret, transport);
        }
        return poolsInterface;
    }

    public PrefsInterface getPrefsInterface()
    {
        if (prefsInterface == null)
        {
            prefsInterface = new PrefsInterface(apiKey, sharedSecret, transport);
        }
        return prefsInterface;
    }

    public ReflectionInterface getReflectionInterface()
    {
        if (reflectionInterface == null)
        {
            reflectionInterface = new ReflectionInterface(apiKey, sharedSecret, transport);
        }
        return reflectionInterface;
    }

    public String getSharedSecret()
    {
        return sharedSecret;
    }

    public StatsInterface getStatsInterface()
    {
        if (statsInterface == null)
        {
            statsInterface = new StatsInterface(apiKey, sharedSecret, transport);
        }
        return statsInterface;
    }

    public TagsInterface getTagsInterface()
    {
        if (tagsInterface == null)
        {
            tagsInterface = new TagsInterface(apiKey, sharedSecret, transport);
        }
        return tagsInterface;
    }

    public TestInterface getTestInterface()
    {
        if (testInterface == null)
        {
            testInterface = new TestInterface(apiKey, sharedSecret, transport);
        }
        return testInterface;
    }

    public TransformInterface getTransformInterface()
    {
        if (transformInterface == null)
        {
            transformInterface = new TransformInterface(apiKey, sharedSecret, transport);
        }
        return transformInterface;
    }

    public Transport getTransport()
    {
        return transport;
    }

    public Uploader getUploader()
    {
        if (uploader == null)
        {
            uploader = new Uploader(apiKey, sharedSecret);
        }
        return uploader;
    }

    public UrlsInterface getUrlsInterface()
    {
        if (urlsInterface == null)
        {
            urlsInterface = new UrlsInterface(apiKey, sharedSecret, transport);
        }
        return urlsInterface;
    }

    public void setApiKey(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("API key must not be null");
        } else
        {
            apiKey = s;
            return;
        }
    }

    public void setSharedSecret(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Shared-Secret must not be null");
        } else
        {
            sharedSecret = s;
            return;
        }
    }

    public void setTransport(Transport transport1)
    {
        if (transport1 == null)
        {
            throw new IllegalArgumentException("Transport must not be null");
        } else
        {
            transport = transport1;
            return;
        }
    }

}
