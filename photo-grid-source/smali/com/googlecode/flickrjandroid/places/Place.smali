.class public Lcom/googlecode/flickrjandroid/places/Place;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TYPE_CONTINENT:I = 0x1d

.field public static final TYPE_COUNTRY:I = 0xc

.field public static final TYPE_COUNTY:I = 0x9

.field public static final TYPE_LOCALITY:I = 0x7

.field public static final TYPE_NEIGHBOURHOOD:I = 0x16

.field public static final TYPE_REGION:I = 0x8

.field public static final TYPE_UNSET:I = 0x0

.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private latitude:D

.field private longitude:D

.field private name:Ljava/lang/String;

.field private photoCount:I

.field private placeId:Ljava/lang/String;

.field private placeType:I

.field private placeUrl:Ljava/lang/String;

.field private woeId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->name:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeId:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->woeId:Ljava/lang/String;

    .line 31
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Place;->latitude:D

    .line 32
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Place;->longitude:D

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeUrl:Ljava/lang/String;

    .line 37
    iput v1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeType:I

    .line 38
    iput v1, p0, Lcom/googlecode/flickrjandroid/places/Place;->photoCount:I

    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->name:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeId:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->woeId:Ljava/lang/String;

    .line 31
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Place;->latitude:D

    .line 32
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Place;->longitude:D

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeUrl:Ljava/lang/String;

    .line 37
    iput v1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeType:I

    .line 38
    iput v1, p0, Lcom/googlecode/flickrjandroid/places/Place;->photoCount:I

    .line 44
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/places/Place;->name:Ljava/lang/String;

    .line 45
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeId:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->name:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeId:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->woeId:Ljava/lang/String;

    .line 31
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Place;->latitude:D

    .line 32
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Place;->longitude:D

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeUrl:Ljava/lang/String;

    .line 37
    iput v1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeType:I

    .line 38
    iput v1, p0, Lcom/googlecode/flickrjandroid/places/Place;->photoCount:I

    .line 49
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/places/Place;->name:Ljava/lang/String;

    .line 50
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeId:Ljava/lang/String;

    .line 51
    iput p3, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeType:I

    .line 52
    return-void
.end method


# virtual methods
.method public getLatitude()D
    .locals 2

    .prologue
    .line 121
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 135
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->longitude:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotoCount()I
    .locals 1

    .prologue
    .line 149
    iget v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->photoCount:I

    return v0
.end method

.method public getPlaceId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeId:Ljava/lang/String;

    return-object v0
.end method

.method public getPlaceType()I
    .locals 1

    .prologue
    .line 80
    iget v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeType:I

    return v0
.end method

.method public getPlaceUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getWoeId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Place;->woeId:Ljava/lang/String;

    return-object v0
.end method

.method public setLatitude(D)V
    .locals 1

    .prologue
    .line 131
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->latitude:D

    .line 132
    return-void
.end method

.method public setLatitude(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 126
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setLatitude(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setLongitude(D)V
    .locals 1

    .prologue
    .line 145
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->longitude:D

    .line 146
    return-void
.end method

.method public setLongitude(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 140
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/places/Place;->setLongitude(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->name:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setPhotoCount(I)V
    .locals 0

    .prologue
    .line 159
    iput p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->photoCount:I

    .line 160
    return-void
.end method

.method public setPhotoCount(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 154
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/places/Place;->setPhotoCount(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setPlaceId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeId:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setPlaceType(I)V
    .locals 0

    .prologue
    .line 95
    iput p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeType:I

    .line 96
    return-void
.end method

.method public setPlaceType(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 100
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/places/Place;->setPlaceType(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setPlaceUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->placeUrl:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setWoeId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Place;->woeId:Ljava/lang/String;

    .line 118
    return-void
.end method
