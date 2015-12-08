.class public Lcom/googlecode/flickrjandroid/Flickr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACCURACY_CITY:I = 0xb

.field public static final ACCURACY_COUNTRY:I = 0x3

.field public static final ACCURACY_REGION:I = 0x6

.field public static final ACCURACY_STREET:I = 0x10

.field public static final ACCURACY_WORLD:I = 0x1

.field public static final CONTENTTYPE_OTHER:Ljava/lang/String; = "3"

.field public static final CONTENTTYPE_PHOTO:Ljava/lang/String; = "1"

.field public static final CONTENTTYPE_SCREENSHOT:Ljava/lang/String; = "2"

.field public static final DEFAULT_API_HOST:Ljava/lang/String; = "api.flickr.com"

.field public static final PRIVACY_LEVEL_FAMILY:I = 0x3

.field public static final PRIVACY_LEVEL_FRIENDS:I = 0x2

.field public static final PRIVACY_LEVEL_FRIENDS_FAMILY:I = 0x4

.field public static final PRIVACY_LEVEL_NO_FILTER:I = 0x0

.field public static final PRIVACY_LEVEL_PRIVATE:I = 0x5

.field public static final PRIVACY_LEVEL_PUBLIC:I = 0x1

.field public static final SAFETYLEVEL_MODERATE:Ljava/lang/String; = "2"

.field public static final SAFETYLEVEL_RESTRICTED:Ljava/lang/String; = "3"

.field public static final SAFETYLEVEL_SAFE:Ljava/lang/String; = "1"

.field public static tracing:Z


# instance fields
.field private activityInterface:Lcom/googlecode/flickrjandroid/activity/ActivityInterface;

.field private apiKey:Ljava/lang/String;

.field private blogsInterface:Lcom/googlecode/flickrjandroid/blogs/BlogsInterface;

.field private collectionsInterface:Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;

.field private commentsInterface:Lcom/googlecode/flickrjandroid/photos/comments/CommentsInterface;

.field private commonsInterface:Lcom/googlecode/flickrjandroid/commons/CommonsInterface;

.field private contactsInterface:Lcom/googlecode/flickrjandroid/contacts/ContactsInterface;

.field private favoritesInterface:Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;

.field private galleriesInterface:Lcom/googlecode/flickrjandroid/galleries/GalleriesInterface;

.field private geoInterface:Lcom/googlecode/flickrjandroid/photos/geo/GeoInterface;

.field private groupsInterface:Lcom/googlecode/flickrjandroid/groups/GroupsInterface;

.field private interestingnessInterface:Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;

.field private licensesInterface:Lcom/googlecode/flickrjandroid/photos/licenses/LicensesInterface;

.field private machinetagsInterface:Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;

.field private membersInterface:Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;

.field private notesInterface:Lcom/googlecode/flickrjandroid/photos/notes/NotesInterface;

.field private oAuthInterface:Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

.field private pandaInterface:Lcom/googlecode/flickrjandroid/panda/PandaInterface;

.field private peopleInterface:Lcom/googlecode/flickrjandroid/people/PeopleInterface;

.field private photosInterface:Lcom/googlecode/flickrjandroid/photos/PhotosInterface;

.field private photosetsCommentsInterface:Lcom/googlecode/flickrjandroid/photosets/comments/PhotosetsCommentsInterface;

.field private photosetsInterface:Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;

.field private placesInterface:Lcom/googlecode/flickrjandroid/places/PlacesInterface;

.field private poolsInterface:Lcom/googlecode/flickrjandroid/groups/pools/PoolsInterface;

.field private prefsInterface:Lcom/googlecode/flickrjandroid/prefs/PrefsInterface;

.field private reflectionInterface:Lcom/googlecode/flickrjandroid/reflection/ReflectionInterface;

.field private sharedSecret:Ljava/lang/String;

.field private statsInterface:Lcom/googlecode/flickrjandroid/stats/StatsInterface;

.field private tagsInterface:Lcom/googlecode/flickrjandroid/tags/TagsInterface;

.field private testInterface:Lcom/googlecode/flickrjandroid/test/TestInterface;

.field private transformInterface:Lcom/googlecode/flickrjandroid/photos/transform/TransformInterface;

.field private transport:Lcom/googlecode/flickrjandroid/Transport;

.field private uploader:Lcom/googlecode/flickrjandroid/uploader/Uploader;

.field private urlsInterface:Lcom/googlecode/flickrjandroid/urls/UrlsInterface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x0

    sput-boolean v0, Lcom/googlecode/flickrjandroid/Flickr;->tracing:Z

    .line 211
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 219
    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/Flickr;->setApiKey(Ljava/lang/String;)V

    .line 221
    :try_start_0
    new-instance v0, Lcom/googlecode/flickrjandroid/REST;

    const-string v1, "api.flickr.com"

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/REST;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/Flickr;->setTransport(Lcom/googlecode/flickrjandroid/Transport;)V
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    return-void

    :catch_0
    move-exception v0

    .line 223
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljavax/xml/parsers/ParserConfigurationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 234
    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/Flickr;->setApiKey(Ljava/lang/String;)V

    .line 235
    invoke-virtual {p0, p2}, Lcom/googlecode/flickrjandroid/Flickr;->setTransport(Lcom/googlecode/flickrjandroid/Transport;)V

    .line 236
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 245
    invoke-direct {p0, p1}, Lcom/googlecode/flickrjandroid/Flickr;-><init>(Ljava/lang/String;)V

    .line 246
    invoke-virtual {p0, p2}, Lcom/googlecode/flickrjandroid/Flickr;->setSharedSecret(Ljava/lang/String;)V

    .line 247
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 257
    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/Flickr;->setApiKey(Ljava/lang/String;)V

    .line 258
    invoke-virtual {p0, p2}, Lcom/googlecode/flickrjandroid/Flickr;->setSharedSecret(Ljava/lang/String;)V

    .line 259
    invoke-virtual {p0, p3}, Lcom/googlecode/flickrjandroid/Flickr;->setTransport(Lcom/googlecode/flickrjandroid/Transport;)V

    .line 260
    return-void
.end method


# virtual methods
.method public getActivityInterface()Lcom/googlecode/flickrjandroid/activity/ActivityInterface;
    .locals 4

    .prologue
    .line 339
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->activityInterface:Lcom/googlecode/flickrjandroid/activity/ActivityInterface;

    if-nez v0, :cond_0

    .line 340
    new-instance v0, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/activity/ActivityInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->activityInterface:Lcom/googlecode/flickrjandroid/activity/ActivityInterface;

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->activityInterface:Lcom/googlecode/flickrjandroid/activity/ActivityInterface;

    return-object v0
.end method

.method public getApiKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized getBlogsInterface()Lcom/googlecode/flickrjandroid/blogs/BlogsInterface;
    .locals 4

    .prologue
    .line 346
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->blogsInterface:Lcom/googlecode/flickrjandroid/blogs/BlogsInterface;

    if-nez v0, :cond_0

    .line 347
    new-instance v0, Lcom/googlecode/flickrjandroid/blogs/BlogsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/blogs/BlogsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->blogsInterface:Lcom/googlecode/flickrjandroid/blogs/BlogsInterface;

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->blogsInterface:Lcom/googlecode/flickrjandroid/blogs/BlogsInterface;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 346
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getCollectionsInterface()Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;
    .locals 4

    .prologue
    .line 353
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->collectionsInterface:Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;

    if-nez v0, :cond_0

    .line 354
    new-instance v0, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->collectionsInterface:Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->collectionsInterface:Lcom/googlecode/flickrjandroid/collections/CollectionsInterface;

    return-object v0
.end method

.method public getCommentsInterface()Lcom/googlecode/flickrjandroid/photos/comments/CommentsInterface;
    .locals 4

    .prologue
    .line 360
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->commentsInterface:Lcom/googlecode/flickrjandroid/photos/comments/CommentsInterface;

    if-nez v0, :cond_0

    .line 361
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/comments/CommentsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photos/comments/CommentsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->commentsInterface:Lcom/googlecode/flickrjandroid/photos/comments/CommentsInterface;

    .line 363
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->commentsInterface:Lcom/googlecode/flickrjandroid/photos/comments/CommentsInterface;

    return-object v0
.end method

.method public getCommonsInterface()Lcom/googlecode/flickrjandroid/commons/CommonsInterface;
    .locals 4

    .prologue
    .line 367
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->commonsInterface:Lcom/googlecode/flickrjandroid/commons/CommonsInterface;

    if-nez v0, :cond_0

    .line 368
    new-instance v0, Lcom/googlecode/flickrjandroid/commons/CommonsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/commons/CommonsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->commonsInterface:Lcom/googlecode/flickrjandroid/commons/CommonsInterface;

    .line 370
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->commonsInterface:Lcom/googlecode/flickrjandroid/commons/CommonsInterface;

    return-object v0
.end method

.method public getContactsInterface()Lcom/googlecode/flickrjandroid/contacts/ContactsInterface;
    .locals 4

    .prologue
    .line 374
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->contactsInterface:Lcom/googlecode/flickrjandroid/contacts/ContactsInterface;

    if-nez v0, :cond_0

    .line 375
    new-instance v0, Lcom/googlecode/flickrjandroid/contacts/ContactsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/contacts/ContactsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->contactsInterface:Lcom/googlecode/flickrjandroid/contacts/ContactsInterface;

    .line 377
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->contactsInterface:Lcom/googlecode/flickrjandroid/contacts/ContactsInterface;

    return-object v0
.end method

.method public getFavoritesInterface()Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;
    .locals 4

    .prologue
    .line 381
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->favoritesInterface:Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;

    if-nez v0, :cond_0

    .line 382
    new-instance v0, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->favoritesInterface:Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;

    .line 384
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->favoritesInterface:Lcom/googlecode/flickrjandroid/favorites/FavoritesInterface;

    return-object v0
.end method

.method public getGalleriesInterface()Lcom/googlecode/flickrjandroid/galleries/GalleriesInterface;
    .locals 4

    .prologue
    .line 482
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->galleriesInterface:Lcom/googlecode/flickrjandroid/galleries/GalleriesInterface;

    if-nez v0, :cond_0

    .line 483
    new-instance v0, Lcom/googlecode/flickrjandroid/galleries/GalleriesInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/galleries/GalleriesInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->galleriesInterface:Lcom/googlecode/flickrjandroid/galleries/GalleriesInterface;

    .line 485
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->galleriesInterface:Lcom/googlecode/flickrjandroid/galleries/GalleriesInterface;

    return-object v0
.end method

.method public getGeoInterface()Lcom/googlecode/flickrjandroid/photos/geo/GeoInterface;
    .locals 4

    .prologue
    .line 388
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->geoInterface:Lcom/googlecode/flickrjandroid/photos/geo/GeoInterface;

    if-nez v0, :cond_0

    .line 389
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/geo/GeoInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photos/geo/GeoInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->geoInterface:Lcom/googlecode/flickrjandroid/photos/geo/GeoInterface;

    .line 391
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->geoInterface:Lcom/googlecode/flickrjandroid/photos/geo/GeoInterface;

    return-object v0
.end method

.method public getGroupsInterface()Lcom/googlecode/flickrjandroid/groups/GroupsInterface;
    .locals 4

    .prologue
    .line 395
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->groupsInterface:Lcom/googlecode/flickrjandroid/groups/GroupsInterface;

    if-nez v0, :cond_0

    .line 396
    new-instance v0, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/groups/GroupsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->groupsInterface:Lcom/googlecode/flickrjandroid/groups/GroupsInterface;

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->groupsInterface:Lcom/googlecode/flickrjandroid/groups/GroupsInterface;

    return-object v0
.end method

.method public declared-synchronized getInterestingnessInterface()Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;
    .locals 4

    .prologue
    .line 405
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->interestingnessInterface:Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;

    if-nez v0, :cond_0

    .line 406
    new-instance v0, Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->interestingnessInterface:Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;

    .line 408
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->interestingnessInterface:Lcom/googlecode/flickrjandroid/interestingness/InterestingnessInterface;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 405
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getLicensesInterface()Lcom/googlecode/flickrjandroid/photos/licenses/LicensesInterface;
    .locals 4

    .prologue
    .line 412
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->licensesInterface:Lcom/googlecode/flickrjandroid/photos/licenses/LicensesInterface;

    if-nez v0, :cond_0

    .line 413
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/licenses/LicensesInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photos/licenses/LicensesInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->licensesInterface:Lcom/googlecode/flickrjandroid/photos/licenses/LicensesInterface;

    .line 415
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->licensesInterface:Lcom/googlecode/flickrjandroid/photos/licenses/LicensesInterface;

    return-object v0
.end method

.method public getMachinetagsInterface()Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;
    .locals 4

    .prologue
    .line 419
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->machinetagsInterface:Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;

    if-nez v0, :cond_0

    .line 420
    new-instance v0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->machinetagsInterface:Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;

    .line 422
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->machinetagsInterface:Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;

    return-object v0
.end method

.method public getMembersInterface()Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;
    .locals 4

    .prologue
    .line 426
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->membersInterface:Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;

    if-nez v0, :cond_0

    .line 427
    new-instance v0, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->membersInterface:Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->membersInterface:Lcom/googlecode/flickrjandroid/groups/members/MembersInterface;

    return-object v0
.end method

.method public getNotesInterface()Lcom/googlecode/flickrjandroid/photos/notes/NotesInterface;
    .locals 4

    .prologue
    .line 433
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->notesInterface:Lcom/googlecode/flickrjandroid/photos/notes/NotesInterface;

    if-nez v0, :cond_0

    .line 434
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/notes/NotesInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photos/notes/NotesInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->notesInterface:Lcom/googlecode/flickrjandroid/photos/notes/NotesInterface;

    .line 436
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->notesInterface:Lcom/googlecode/flickrjandroid/photos/notes/NotesInterface;

    return-object v0
.end method

.method public getOAuthInterface()Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;
    .locals 4

    .prologue
    .line 326
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->oAuthInterface:Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

    if-nez v0, :cond_0

    .line 327
    new-instance v0, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    .line 328
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    .line 327
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->oAuthInterface:Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

    .line 330
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->oAuthInterface:Lcom/googlecode/flickrjandroid/oauth/OAuthInterface;

    return-object v0
.end method

.method public getPandaInterface()Lcom/googlecode/flickrjandroid/panda/PandaInterface;
    .locals 4

    .prologue
    .line 440
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->pandaInterface:Lcom/googlecode/flickrjandroid/panda/PandaInterface;

    if-nez v0, :cond_0

    .line 441
    new-instance v0, Lcom/googlecode/flickrjandroid/panda/PandaInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/panda/PandaInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->pandaInterface:Lcom/googlecode/flickrjandroid/panda/PandaInterface;

    .line 443
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->pandaInterface:Lcom/googlecode/flickrjandroid/panda/PandaInterface;

    return-object v0
.end method

.method public getPeopleInterface()Lcom/googlecode/flickrjandroid/people/PeopleInterface;
    .locals 4

    .prologue
    .line 454
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->peopleInterface:Lcom/googlecode/flickrjandroid/people/PeopleInterface;

    if-nez v0, :cond_0

    .line 455
    new-instance v0, Lcom/googlecode/flickrjandroid/people/PeopleInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/people/PeopleInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->peopleInterface:Lcom/googlecode/flickrjandroid/people/PeopleInterface;

    .line 457
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->peopleInterface:Lcom/googlecode/flickrjandroid/people/PeopleInterface;

    return-object v0
.end method

.method public getPhotosInterface()Lcom/googlecode/flickrjandroid/photos/PhotosInterface;
    .locals 4

    .prologue
    .line 461
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosInterface:Lcom/googlecode/flickrjandroid/photos/PhotosInterface;

    if-nez v0, :cond_0

    .line 462
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/PhotosInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photos/PhotosInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosInterface:Lcom/googlecode/flickrjandroid/photos/PhotosInterface;

    .line 464
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosInterface:Lcom/googlecode/flickrjandroid/photos/PhotosInterface;

    return-object v0
.end method

.method public getPhotosetsCommentsInterface()Lcom/googlecode/flickrjandroid/photosets/comments/PhotosetsCommentsInterface;
    .locals 4

    .prologue
    .line 468
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosetsCommentsInterface:Lcom/googlecode/flickrjandroid/photosets/comments/PhotosetsCommentsInterface;

    if-nez v0, :cond_0

    .line 469
    new-instance v0, Lcom/googlecode/flickrjandroid/photosets/comments/PhotosetsCommentsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photosets/comments/PhotosetsCommentsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosetsCommentsInterface:Lcom/googlecode/flickrjandroid/photosets/comments/PhotosetsCommentsInterface;

    .line 471
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosetsCommentsInterface:Lcom/googlecode/flickrjandroid/photosets/comments/PhotosetsCommentsInterface;

    return-object v0
.end method

.method public getPhotosetsInterface()Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;
    .locals 4

    .prologue
    .line 475
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosetsInterface:Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;

    if-nez v0, :cond_0

    .line 476
    new-instance v0, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosetsInterface:Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;

    .line 478
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->photosetsInterface:Lcom/googlecode/flickrjandroid/photosets/PhotosetsInterface;

    return-object v0
.end method

.method public getPlacesInterface()Lcom/googlecode/flickrjandroid/places/PlacesInterface;
    .locals 4

    .prologue
    .line 489
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->placesInterface:Lcom/googlecode/flickrjandroid/places/PlacesInterface;

    if-nez v0, :cond_0

    .line 490
    new-instance v0, Lcom/googlecode/flickrjandroid/places/PlacesInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/places/PlacesInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->placesInterface:Lcom/googlecode/flickrjandroid/places/PlacesInterface;

    .line 492
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->placesInterface:Lcom/googlecode/flickrjandroid/places/PlacesInterface;

    return-object v0
.end method

.method public getPoolsInterface()Lcom/googlecode/flickrjandroid/groups/pools/PoolsInterface;
    .locals 4

    .prologue
    .line 447
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->poolsInterface:Lcom/googlecode/flickrjandroid/groups/pools/PoolsInterface;

    if-nez v0, :cond_0

    .line 448
    new-instance v0, Lcom/googlecode/flickrjandroid/groups/pools/PoolsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/groups/pools/PoolsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->poolsInterface:Lcom/googlecode/flickrjandroid/groups/pools/PoolsInterface;

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->poolsInterface:Lcom/googlecode/flickrjandroid/groups/pools/PoolsInterface;

    return-object v0
.end method

.method public getPrefsInterface()Lcom/googlecode/flickrjandroid/prefs/PrefsInterface;
    .locals 4

    .prologue
    .line 496
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->prefsInterface:Lcom/googlecode/flickrjandroid/prefs/PrefsInterface;

    if-nez v0, :cond_0

    .line 497
    new-instance v0, Lcom/googlecode/flickrjandroid/prefs/PrefsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/prefs/PrefsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->prefsInterface:Lcom/googlecode/flickrjandroid/prefs/PrefsInterface;

    .line 499
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->prefsInterface:Lcom/googlecode/flickrjandroid/prefs/PrefsInterface;

    return-object v0
.end method

.method public getReflectionInterface()Lcom/googlecode/flickrjandroid/reflection/ReflectionInterface;
    .locals 4

    .prologue
    .line 503
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->reflectionInterface:Lcom/googlecode/flickrjandroid/reflection/ReflectionInterface;

    if-nez v0, :cond_0

    .line 504
    new-instance v0, Lcom/googlecode/flickrjandroid/reflection/ReflectionInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/reflection/ReflectionInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->reflectionInterface:Lcom/googlecode/flickrjandroid/reflection/ReflectionInterface;

    .line 506
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->reflectionInterface:Lcom/googlecode/flickrjandroid/reflection/ReflectionInterface;

    return-object v0
.end method

.method public getSharedSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getStatsInterface()Lcom/googlecode/flickrjandroid/stats/StatsInterface;
    .locals 4

    .prologue
    .line 510
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->statsInterface:Lcom/googlecode/flickrjandroid/stats/StatsInterface;

    if-nez v0, :cond_0

    .line 511
    new-instance v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/stats/StatsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->statsInterface:Lcom/googlecode/flickrjandroid/stats/StatsInterface;

    .line 513
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->statsInterface:Lcom/googlecode/flickrjandroid/stats/StatsInterface;

    return-object v0
.end method

.method public getTagsInterface()Lcom/googlecode/flickrjandroid/tags/TagsInterface;
    .locals 4

    .prologue
    .line 522
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->tagsInterface:Lcom/googlecode/flickrjandroid/tags/TagsInterface;

    if-nez v0, :cond_0

    .line 523
    new-instance v0, Lcom/googlecode/flickrjandroid/tags/TagsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/tags/TagsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->tagsInterface:Lcom/googlecode/flickrjandroid/tags/TagsInterface;

    .line 525
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->tagsInterface:Lcom/googlecode/flickrjandroid/tags/TagsInterface;

    return-object v0
.end method

.method public getTestInterface()Lcom/googlecode/flickrjandroid/test/TestInterface;
    .locals 4

    .prologue
    .line 529
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->testInterface:Lcom/googlecode/flickrjandroid/test/TestInterface;

    if-nez v0, :cond_0

    .line 530
    new-instance v0, Lcom/googlecode/flickrjandroid/test/TestInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/test/TestInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->testInterface:Lcom/googlecode/flickrjandroid/test/TestInterface;

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->testInterface:Lcom/googlecode/flickrjandroid/test/TestInterface;

    return-object v0
.end method

.method public getTransformInterface()Lcom/googlecode/flickrjandroid/photos/transform/TransformInterface;
    .locals 4

    .prologue
    .line 536
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->transformInterface:Lcom/googlecode/flickrjandroid/photos/transform/TransformInterface;

    if-nez v0, :cond_0

    .line 537
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/transform/TransformInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/photos/transform/TransformInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->transformInterface:Lcom/googlecode/flickrjandroid/photos/transform/TransformInterface;

    .line 539
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->transformInterface:Lcom/googlecode/flickrjandroid/photos/transform/TransformInterface;

    return-object v0
.end method

.method public getTransport()Lcom/googlecode/flickrjandroid/Transport;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    return-object v0
.end method

.method public getUploader()Lcom/googlecode/flickrjandroid/uploader/Uploader;
    .locals 3

    .prologue
    .line 543
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->uploader:Lcom/googlecode/flickrjandroid/uploader/Uploader;

    if-nez v0, :cond_0

    .line 544
    new-instance v0, Lcom/googlecode/flickrjandroid/uploader/Uploader;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/uploader/Uploader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->uploader:Lcom/googlecode/flickrjandroid/uploader/Uploader;

    .line 546
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->uploader:Lcom/googlecode/flickrjandroid/uploader/Uploader;

    return-object v0
.end method

.method public getUrlsInterface()Lcom/googlecode/flickrjandroid/urls/UrlsInterface;
    .locals 4

    .prologue
    .line 550
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->urlsInterface:Lcom/googlecode/flickrjandroid/urls/UrlsInterface;

    if-nez v0, :cond_0

    .line 551
    new-instance v0, Lcom/googlecode/flickrjandroid/urls/UrlsInterface;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/urls/UrlsInterface;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->urlsInterface:Lcom/googlecode/flickrjandroid/urls/UrlsInterface;

    .line 553
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Flickr;->urlsInterface:Lcom/googlecode/flickrjandroid/urls/UrlsInterface;

    return-object v0
.end method

.method public setApiKey(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 277
    if-nez p1, :cond_0

    .line 278
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "API key must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 280
    :cond_0
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/Flickr;->apiKey:Ljava/lang/String;

    .line 281
    return-void
.end method

.method public setSharedSecret(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 298
    if-nez p1, :cond_0

    .line 299
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Shared-Secret must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 301
    :cond_0
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/Flickr;->sharedSecret:Ljava/lang/String;

    .line 302
    return-void
.end method

.method public setTransport(Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 2

    .prologue
    .line 319
    if-nez p1, :cond_0

    .line 320
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Transport must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :cond_0
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/Flickr;->transport:Lcom/googlecode/flickrjandroid/Transport;

    .line 323
    return-void
.end method
