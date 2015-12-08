.class public Lcom/googlecode/flickrjandroid/photos/Photo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final DATE_FORMATS:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEFAULT_ORIGINAL_IMAGE_SUFFIX:Ljava/lang/String; = "_o.jpg"

.field private static final LARGE_1600_IMAGE_SUFFIX:Ljava/lang/String; = "_h.jpg"

.field private static final LARGE_2048_IMAGE_SUFFIX:Ljava/lang/String; = "_k.jpg"

.field private static final LARGE_IMAGE_SUFFIX:Ljava/lang/String; = "_b.jpg"

.field private static final LARGE_SQUARE_IMAGE_SUFFIX:Ljava/lang/String; = "_q.jpg"

.field private static final MEDIUM_640_IMAGE_SUFFIX:Ljava/lang/String; = "_z.jpg"

.field private static final MEDIUM_800_IMAGE_SUFFIX:Ljava/lang/String; = "_c.jpg"

.field private static final MEDIUM_IMAGE_SUFFIX:Ljava/lang/String; = ".jpg"

.field private static final SMALL_320_IMAGE_SUFFIX:Ljava/lang/String; = "_n.jpg"

.field private static final SMALL_IMAGE_SUFFIX:Ljava/lang/String; = "_m.jpg"

.field private static final SMALL_SQUARE_IMAGE_SUFFIX:Ljava/lang/String; = "_s.jpg"

.field private static final THUMBNAIL_IMAGE_SUFFIX:Ljava/lang/String; = "_t.jpg"

.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private comments:I

.field private dateAdded:Ljava/util/Date;

.field private datePosted:Ljava/util/Date;

.field private dateTaken:Ljava/util/Date;

.field private description:Ljava/lang/String;

.field private editability:Lcom/googlecode/flickrjandroid/photos/Editability;

.field private familyFlag:Z

.field private farm:Ljava/lang/String;

.field private favorite:Z

.field private favorites:I

.field private friendFlag:Z

.field private geoData:Lcom/googlecode/flickrjandroid/photos/GeoData;

.field private iconFarm:Ljava/lang/String;

.field private iconServer:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private large1600Size:Lcom/googlecode/flickrjandroid/photos/Size;

.field private large2048Size:Lcom/googlecode/flickrjandroid/photos/Size;

.field private largeSize:Lcom/googlecode/flickrjandroid/photos/Size;

.field private largeSquareSize:Lcom/googlecode/flickrjandroid/photos/Size;

.field private lastUpdate:Ljava/util/Date;

.field private license:Ljava/lang/String;

.field private media:Ljava/lang/String;

.field private mediaStatus:Ljava/lang/String;

.field private medium640Size:Lcom/googlecode/flickrjandroid/photos/Size;

.field private medium800Size:Lcom/googlecode/flickrjandroid/photos/Size;

.field private mediumSize:Lcom/googlecode/flickrjandroid/photos/Size;

.field private notes:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/Note;",
            ">;"
        }
    .end annotation
.end field

.field private originalFormat:Ljava/lang/String;

.field private originalHeight:I

.field private originalSecret:Ljava/lang/String;

.field private originalSize:Lcom/googlecode/flickrjandroid/photos/Size;

.field private originalWidth:I

.field private owner:Lcom/googlecode/flickrjandroid/people/User;

.field private pathAlias:Ljava/lang/String;

.field private permissions:Lcom/googlecode/flickrjandroid/photos/Permissions;

.field private placeId:Ljava/lang/String;

.field private primary:Z

.field private publicFlag:Z

.field private rotation:I

.field private secret:Ljava/lang/String;

.field private server:Ljava/lang/String;

.field private small320Size:Lcom/googlecode/flickrjandroid/photos/Size;

.field private smallSize:Lcom/googlecode/flickrjandroid/photos/Size;

.field private squareSize:Lcom/googlecode/flickrjandroid/photos/Size;

.field private tags:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation
.end field

.field private takenGranularity:Ljava/lang/String;

.field private thumbnailSize:Lcom/googlecode/flickrjandroid/photos/Size;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private urls:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/PhotoUrl;",
            ">;"
        }
    .end annotation
.end field

.field private views:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/a;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/photos/a;-><init>()V

    sput-object v0, Lcom/googlecode/flickrjandroid/photos/Photo;->DATE_FORMATS:Ljava/lang/ThreadLocal;

    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->comments:I

    .line 87
    iput v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->views:I

    .line 88
    iput v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->favorites:I

    .line 107
    return-void
.end method

.method private _getBaseImageUrl()Ljava/lang/StringBuffer;
    .locals 2

    .prologue
    .line 705
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 706
    const-string v1, "https://farm"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 707
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getFarm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 708
    const-string v1, ".static.flickr.com/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 709
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getServer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 710
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 711
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 712
    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 713
    return-object v0
.end method

.method private _getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 678
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 679
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 680
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 681
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method private getBaseImageUrl()Ljava/lang/StringBuffer;
    .locals 2

    .prologue
    .line 685
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 686
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->_getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 687
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getSecret()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 688
    return-object v0
.end method

.method private getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 657
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v0

    .line 658
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 659
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->_getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method private getOriginalBaseImageUrl()Ljava/lang/StringBuffer;
    .locals 3

    .prologue
    .line 692
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 693
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->_getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 694
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalSecret()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    if-le v1, v2, :cond_0

    .line 695
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalSecret()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 701
    return-object v0

    .line 697
    :cond_0
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    .line 698
    const-string v1, "0"

    .line 699
    const-string v2, "OriginalUrl not available because of missing originalsecret."

    .line 697
    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method private getOriginalImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 672
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v0

    .line 673
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 674
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->_getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 870
    if-ne p0, p1, :cond_1

    .line 892
    :cond_0
    :goto_0
    return v0

    .line 872
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 873
    goto :goto_0

    .line 874
    :cond_2
    instance-of v2, p1, Lcom/googlecode/flickrjandroid/photos/Photo;

    if-nez v2, :cond_3

    move v0, v1

    .line 875
    goto :goto_0

    .line 876
    :cond_3
    check-cast p1, Lcom/googlecode/flickrjandroid/photos/Photo;

    .line 877
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 878
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    if-eqz v2, :cond_5

    move v0, v1

    .line 879
    goto :goto_0

    .line 880
    :cond_4
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 881
    goto :goto_0

    .line 882
    :cond_5
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    if-nez v2, :cond_6

    .line 883
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    if-eqz v2, :cond_7

    move v0, v1

    .line 884
    goto :goto_0

    .line 885
    :cond_6
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    move v0, v1

    .line 886
    goto :goto_0

    .line 887
    :cond_7
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    if-nez v2, :cond_8

    .line 888
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    .line 889
    goto :goto_0

    .line 890
    :cond_8
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 891
    goto :goto_0
.end method

.method public getComments()I
    .locals 1

    .prologue
    .line 308
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->comments:I

    return v0
.end method

.method public getDateAdded()Ljava/util/Date;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->dateAdded:Ljava/util/Date;

    return-object v0
.end method

.method public getDatePosted()Ljava/util/Date;
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->datePosted:Ljava/util/Date;

    return-object v0
.end method

.method public getDateTaken()Ljava/util/Date;
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->dateTaken:Ljava/util/Date;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEditability()Lcom/googlecode/flickrjandroid/photos/Editability;
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->editability:Lcom/googlecode/flickrjandroid/photos/Editability;

    return-object v0
.end method

.method public getFarm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->farm:Ljava/lang/String;

    return-object v0
.end method

.method public getFavorites()I
    .locals 1

    .prologue
    .line 389
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->favorites:I

    return v0
.end method

.method public getGeoData()Lcom/googlecode/flickrjandroid/photos/GeoData;
    .locals 1

    .prologue
    .line 448
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->geoData:Lcom/googlecode/flickrjandroid/photos/GeoData;

    return-object v0
.end method

.method public getIconFarm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 432
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->iconFarm:Ljava/lang/String;

    return-object v0
.end method

.method public getIconServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 424
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->iconServer:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLarge1600Url()Ljava/lang/String;
    .locals 2

    .prologue
    .line 630
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->large1600Size:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 631
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_h.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 633
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->large1600Size:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getLarge2048Url()Ljava/lang/String;
    .locals 2

    .prologue
    .line 638
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->large2048Size:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 639
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_k.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 641
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->large2048Size:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getLargeAsStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 618
    const-string v0, "_b.jpg"

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getLargeSize()Lcom/googlecode/flickrjandroid/photos/Size;
    .locals 1

    .prologue
    .line 827
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSize:Lcom/googlecode/flickrjandroid/photos/Size;

    return-object v0
.end method

.method public getLargeSquareSize()Lcom/googlecode/flickrjandroid/photos/Size;
    .locals 1

    .prologue
    .line 831
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSquareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    return-object v0
.end method

.method public getLargeSquareUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 525
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSquareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 526
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_q.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 528
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSquareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getLargeUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 622
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSize:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 623
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_b.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 625
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSize:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getLastUpdate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->lastUpdate:Ljava/util/Date;

    return-object v0
.end method

.method public getLicense()Ljava/lang/String;
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->license:Ljava/lang/String;

    return-object v0
.end method

.method public getMedia()Ljava/lang/String;
    .locals 1

    .prologue
    .line 729
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->media:Ljava/lang/String;

    return-object v0
.end method

.method public getMediaStatus()Ljava/lang/String;
    .locals 1

    .prologue
    .line 737
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->mediaStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getMedium640Url()Ljava/lang/String;
    .locals 2

    .prologue
    .line 596
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->medium640Size:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 597
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_z.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 599
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->medium640Size:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getMedium800Url()Ljava/lang/String;
    .locals 2

    .prologue
    .line 604
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->medium800Size:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 605
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_c.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 607
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->medium800Size:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getMediumAsStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 584
    const-string v0, ".jpg"

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getMediumSize()Lcom/googlecode/flickrjandroid/photos/Size;
    .locals 1

    .prologue
    .line 823
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->mediumSize:Lcom/googlecode/flickrjandroid/photos/Size;

    return-object v0
.end method

.method public getMediumUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 588
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->mediumSize:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 589
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 591
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->mediumSize:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getNotes()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/Note;",
            ">;"
        }
    .end annotation

    .prologue
    .line 320
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->notes:Ljava/util/Collection;

    return-object v0
.end method

.method public getOriginalAsStream()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 484
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalFormat:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 485
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "_o."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalFormat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 487
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "_o.jpg"

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0
.end method

.method public getOriginalFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 460
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalFormat:Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalHeight()I
    .locals 1

    .prologue
    .line 759
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalHeight:I

    return v0
.end method

.method public getOriginalSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 468
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalSize()Lcom/googlecode/flickrjandroid/photos/Size;
    .locals 1

    .prologue
    .line 835
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalSize:Lcom/googlecode/flickrjandroid/photos/Size;

    return-object v0
.end method

.method public getOriginalUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 496
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalSize:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_1

    .line 497
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalFormat:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 498
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_o."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalFormat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 502
    :goto_0
    return-object v0

    .line 500
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_o.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 502
    :cond_1
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalSize:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getOriginalWidth()I
    .locals 1

    .prologue
    .line 745
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalWidth:I

    return v0
.end method

.method public getOwner()Lcom/googlecode/flickrjandroid/people/User;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->owner:Lcom/googlecode/flickrjandroid/people/User;

    return-object v0
.end method

.method public getPathAlias()Ljava/lang/String;
    .locals 1

    .prologue
    .line 842
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->pathAlias:Ljava/lang/String;

    return-object v0
.end method

.method public getPermissions()Lcom/googlecode/flickrjandroid/photos/Permissions;
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->permissions:Lcom/googlecode/flickrjandroid/photos/Permissions;

    return-object v0
.end method

.method public getPlaceId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 721
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->placeId:Ljava/lang/String;

    return-object v0
.end method

.method public getRotation()I
    .locals 1

    .prologue
    .line 420
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->rotation:I

    return v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->secret:Ljava/lang/String;

    return-object v0
.end method

.method public getServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->server:Ljava/lang/String;

    return-object v0
.end method

.method public getSmall320Url()Ljava/lang/String;
    .locals 2

    .prologue
    .line 570
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->small320Size:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 571
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_n.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 573
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->small320Size:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getSmallAsInputStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 558
    const-string v0, "_m.jpg"

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getSmallSize()Lcom/googlecode/flickrjandroid/photos/Size;
    .locals 1

    .prologue
    .line 815
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->smallSize:Lcom/googlecode/flickrjandroid/photos/Size;

    return-object v0
.end method

.method public getSmallSquareAsInputStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 513
    const-string v0, "_s.jpg"

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getSmallSquareUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 517
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->squareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 518
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_s.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 520
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->squareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getSmallUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 562
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->smallSize:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 563
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_m.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 565
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->smallSize:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getSquareSize()Lcom/googlecode/flickrjandroid/photos/Size;
    .locals 1

    .prologue
    .line 811
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->squareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    return-object v0
.end method

.method public getTags()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 328
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->tags:Ljava/util/Collection;

    return-object v0
.end method

.method public getTakenGranularity()Ljava/lang/String;
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->takenGranularity:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbnailAsInputStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 539
    const-string v0, "_t.jpg"

    invoke-direct {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getImageAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getThumbnailSize()Lcom/googlecode/flickrjandroid/photos/Size;
    .locals 1

    .prologue
    .line 819
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->thumbnailSize:Lcom/googlecode/flickrjandroid/photos/Size;

    return-object v0
.end method

.method public getThumbnailUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 543
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->thumbnailSize:Lcom/googlecode/flickrjandroid/photos/Size;

    if-nez v0, :cond_0

    .line 544
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/photos/Photo;->getBaseImageUrl()Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_t.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 546
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->thumbnailSize:Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getSource()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 440
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getUrls()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/PhotoUrl;",
            ">;"
        }
    .end annotation

    .prologue
    .line 340
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->urls:Ljava/util/Collection;

    return-object v0
.end method

.method public getViews()I
    .locals 1

    .prologue
    .line 382
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->views:I

    return v0
.end method

.method public hasGeoData()Z
    .locals 1

    .prologue
    .line 456
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->geoData:Lcom/googlecode/flickrjandroid/photos/GeoData;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 859
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 860
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    .line 861
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    if-nez v2, :cond_2

    :goto_2
    add-int/2addr v0, v1

    .line 862
    return v0

    .line 859
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    .line 860
    :cond_1
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_1

    .line 861
    :cond_2
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_2
.end method

.method public isFamilyFlag()Z
    .locals 1

    .prologue
    .line 210
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->familyFlag:Z

    return v0
.end method

.method public isFavorite()Z
    .locals 1

    .prologue
    .line 150
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->favorite:Z

    return v0
.end method

.method public isFriendFlag()Z
    .locals 1

    .prologue
    .line 202
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->friendFlag:Z

    return v0
.end method

.method public isPrimary()Z
    .locals 1

    .prologue
    .line 166
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->primary:Z

    return v0
.end method

.method public isPublicFlag()Z
    .locals 1

    .prologue
    .line 194
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->publicFlag:Z

    return v0
.end method

.method public setComments(I)V
    .locals 0

    .prologue
    .line 312
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->comments:I

    .line 313
    return-void
.end method

.method public setComments(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 316
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setComments(I)V

    .line 317
    :cond_0
    return-void
.end method

.method public setDateAdded(J)V
    .locals 1

    .prologue
    .line 226
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDateAdded(Ljava/util/Date;)V

    .line 227
    return-void
.end method

.method public setDateAdded(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 230
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    :cond_0
    :goto_0
    return-void

    .line 231
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDateAdded(J)V

    goto :goto_0
.end method

.method public setDateAdded(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->dateAdded:Ljava/util/Date;

    .line 223
    return-void
.end method

.method public setDatePosted(J)V
    .locals 1

    .prologue
    .line 243
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDatePosted(Ljava/util/Date;)V

    .line 244
    return-void
.end method

.method public setDatePosted(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 247
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    :cond_0
    :goto_0
    return-void

    .line 248
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDatePosted(J)V

    goto :goto_0
.end method

.method public setDatePosted(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->datePosted:Ljava/util/Date;

    .line 240
    return-void
.end method

.method public setDateTaken(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 260
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    :cond_0
    :goto_0
    return-void

    .line 262
    :cond_1
    :try_start_0
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Photo;->DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDateTaken(Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 265
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/text/ParseException;->printStackTrace()V

    goto :goto_0
.end method

.method public setDateTaken(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 256
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->dateTaken:Ljava/util/Date;

    .line 257
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->description:Ljava/lang/String;

    .line 191
    return-void
.end method

.method public setEditability(Lcom/googlecode/flickrjandroid/photos/Editability;)V
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->editability:Lcom/googlecode/flickrjandroid/photos/Editability;

    .line 305
    return-void
.end method

.method public setFamilyFlag(Z)V
    .locals 0

    .prologue
    .line 214
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->familyFlag:Z

    .line 215
    return-void
.end method

.method public setFarm(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->farm:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public setFavorite(Z)V
    .locals 0

    .prologue
    .line 154
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->favorite:Z

    .line 155
    return-void
.end method

.method public setFavorites(I)V
    .locals 0

    .prologue
    .line 396
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->favorites:I

    .line 397
    return-void
.end method

.method public setFriendFlag(Z)V
    .locals 0

    .prologue
    .line 206
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->friendFlag:Z

    .line 207
    return-void
.end method

.method public setGeoData(Lcom/googlecode/flickrjandroid/photos/GeoData;)V
    .locals 0

    .prologue
    .line 452
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->geoData:Lcom/googlecode/flickrjandroid/photos/GeoData;

    .line 453
    return-void
.end method

.method public setIconFarm(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 436
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->iconFarm:Ljava/lang/String;

    .line 437
    return-void
.end method

.method public setIconServer(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 428
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->iconServer:Ljava/lang/String;

    .line 429
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->id:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public setLastUpdate(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 278
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    :cond_0
    :goto_0
    return-void

    .line 279
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 280
    new-instance v2, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v2}, Lcom/googlecode/flickrjandroid/photos/Photo;->setLastUpdate(Ljava/util/Date;)V

    goto :goto_0
.end method

.method public setLastUpdate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->lastUpdate:Ljava/util/Date;

    .line 275
    return-void
.end method

.method public setLicense(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->license:Ljava/lang/String;

    .line 163
    return-void
.end method

.method public setMedia(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 733
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->media:Ljava/lang/String;

    .line 734
    return-void
.end method

.method public setMediaStatus(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 741
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->mediaStatus:Ljava/lang/String;

    .line 742
    return-void
.end method

.method public setNotes(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/Note;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 324
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->notes:Ljava/util/Collection;

    .line 325
    return-void
.end method

.method public setOriginalFormat(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 464
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalFormat:Ljava/lang/String;

    .line 465
    return-void
.end method

.method public setOriginalHeight(I)V
    .locals 0

    .prologue
    .line 769
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalHeight:I

    .line 770
    return-void
.end method

.method public setOriginalHeight(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 764
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOriginalHeight(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 766
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setOriginalSecret(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 472
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalSecret:Ljava/lang/String;

    .line 473
    return-void
.end method

.method public setOriginalWidth(I)V
    .locals 0

    .prologue
    .line 755
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalWidth:I

    .line 756
    return-void
.end method

.method public setOriginalWidth(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 750
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOriginalWidth(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 752
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setOwner(Lcom/googlecode/flickrjandroid/people/User;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->owner:Lcom/googlecode/flickrjandroid/people/User;

    .line 123
    return-void
.end method

.method public setPathAlias(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 849
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->pathAlias:Ljava/lang/String;

    .line 850
    return-void
.end method

.method public setPermissions(Lcom/googlecode/flickrjandroid/photos/Permissions;)V
    .locals 0

    .prologue
    .line 296
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->permissions:Lcom/googlecode/flickrjandroid/photos/Permissions;

    .line 297
    return-void
.end method

.method public setPlaceId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 725
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->placeId:Ljava/lang/String;

    .line 726
    return-void
.end method

.method public setPrimary(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 174
    const-string v0, "1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setPrimary(Z)V

    .line 175
    return-void
.end method

.method public setPrimary(Z)V
    .locals 0

    .prologue
    .line 170
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->primary:Z

    .line 171
    return-void
.end method

.method public setPublicFlag(Z)V
    .locals 0

    .prologue
    .line 198
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->publicFlag:Z

    .line 199
    return-void
.end method

.method public setRotation(I)V
    .locals 0

    .prologue
    .line 416
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->rotation:I

    .line 417
    return-void
.end method

.method public setRotation(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 406
    if-eqz p1, :cond_0

    .line 408
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setRotation(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 413
    :cond_0
    :goto_0
    return-void

    .line 410
    :catch_0
    move-exception v0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setRotation(I)V

    goto :goto_0
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->secret:Ljava/lang/String;

    .line 131
    return-void
.end method

.method public setServer(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->server:Ljava/lang/String;

    .line 147
    return-void
.end method

.method public setSizes(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/Size;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 779
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 780
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 808
    return-void

    .line 781
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/photos/Size;

    .line 782
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 783
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->squareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 784
    :cond_2
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/4 v3, 0x6

    if-ne v2, v3, :cond_3

    .line 785
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSquareSize:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 786
    :cond_3
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    if-nez v2, :cond_4

    .line 787
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->thumbnailSize:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 788
    :cond_4
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    .line 789
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->smallSize:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 790
    :cond_5
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_6

    .line 791
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->small320Size:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 792
    :cond_6
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_7

    .line 793
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->mediumSize:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 794
    :cond_7
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/16 v3, 0xb

    if-ne v2, v3, :cond_8

    .line 795
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->medium640Size:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 796
    :cond_8
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_9

    .line 797
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->medium800Size:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 798
    :cond_9
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_a

    .line 799
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->largeSize:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 800
    :cond_a
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_b

    .line 801
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->large1600Size:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 802
    :cond_b
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/16 v3, 0xe

    if-ne v2, v3, :cond_c

    .line 803
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->large2048Size:Lcom/googlecode/flickrjandroid/photos/Size;

    goto :goto_0

    .line 804
    :cond_c
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/photos/Size;->getLabel()I

    move-result v2

    const/4 v3, 0x5

    if-ne v2, v3, :cond_0

    .line 805
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->originalSize:Lcom/googlecode/flickrjandroid/photos/Size;

    goto/16 :goto_0
.end method

.method public setTags(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 332
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->tags:Ljava/util/Collection;

    .line 333
    return-void
.end method

.method public setTakenGranularity(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 288
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->takenGranularity:Ljava/lang/String;

    .line 289
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->title:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 444
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->url:Ljava/lang/String;

    .line 445
    return-void
.end method

.method public setUrls(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/PhotoUrl;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 348
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->urls:Ljava/util/Collection;

    .line 349
    return-void
.end method

.method public setViews(I)V
    .locals 0

    .prologue
    .line 373
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Photo;->views:I

    .line 374
    return-void
.end method

.method public setViews(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 359
    if-eqz p1, :cond_0

    .line 361
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setViews(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 366
    :cond_0
    :goto_0
    return-void

    .line 363
    :catch_0
    move-exception v0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setViews(I)V

    goto :goto_0
.end method
