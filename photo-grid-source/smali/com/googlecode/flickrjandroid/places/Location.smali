.class public Lcom/googlecode/flickrjandroid/places/Location;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private country:Lcom/googlecode/flickrjandroid/places/Place;

.field private county:Lcom/googlecode/flickrjandroid/places/Place;

.field private latitude:D

.field private locality:Lcom/googlecode/flickrjandroid/places/Place;

.field private longitude:D

.field private placeId:Ljava/lang/String;

.field private placeType:I

.field private placeUrl:Ljava/lang/String;

.field private region:Lcom/googlecode/flickrjandroid/places/Place;

.field private woeId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->woeId:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeId:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeUrl:Ljava/lang/String;

    .line 20
    iput-object v1, p0, Lcom/googlecode/flickrjandroid/places/Location;->locality:Lcom/googlecode/flickrjandroid/places/Place;

    .line 21
    iput-object v1, p0, Lcom/googlecode/flickrjandroid/places/Location;->county:Lcom/googlecode/flickrjandroid/places/Place;

    .line 22
    iput-object v1, p0, Lcom/googlecode/flickrjandroid/places/Location;->region:Lcom/googlecode/flickrjandroid/places/Place;

    .line 23
    iput-object v1, p0, Lcom/googlecode/flickrjandroid/places/Location;->country:Lcom/googlecode/flickrjandroid/places/Place;

    .line 24
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Location;->latitude:D

    .line 25
    iput-wide v2, p0, Lcom/googlecode/flickrjandroid/places/Location;->longitude:D

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeType:I

    .line 29
    return-void
.end method


# virtual methods
.method public getCountry()Lcom/googlecode/flickrjandroid/places/Place;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->country:Lcom/googlecode/flickrjandroid/places/Place;

    return-object v0
.end method

.method public getCounty()Lcom/googlecode/flickrjandroid/places/Place;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->county:Lcom/googlecode/flickrjandroid/places/Place;

    return-object v0
.end method

.method public getLatitude()D
    .locals 2

    .prologue
    .line 93
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->latitude:D

    return-wide v0
.end method

.method public getLocality()Lcom/googlecode/flickrjandroid/places/Place;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->locality:Lcom/googlecode/flickrjandroid/places/Place;

    return-object v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 107
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->longitude:D

    return-wide v0
.end method

.method public getPlaceId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeId:Ljava/lang/String;

    return-object v0
.end method

.method public getPlaceType()I
    .locals 1

    .prologue
    .line 121
    iget v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeType:I

    return v0
.end method

.method public getPlaceUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRegion()Lcom/googlecode/flickrjandroid/places/Place;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->region:Lcom/googlecode/flickrjandroid/places/Place;

    return-object v0
.end method

.method public getWoeId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/Location;->woeId:Ljava/lang/String;

    return-object v0
.end method

.method public setCountry(Lcom/googlecode/flickrjandroid/places/Place;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->country:Lcom/googlecode/flickrjandroid/places/Place;

    .line 77
    return-void
.end method

.method public setCounty(Lcom/googlecode/flickrjandroid/places/Place;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->county:Lcom/googlecode/flickrjandroid/places/Place;

    .line 61
    return-void
.end method

.method public setLatitude(D)V
    .locals 1

    .prologue
    .line 103
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->latitude:D

    .line 104
    return-void
.end method

.method public setLatitude(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 98
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/places/Location;->setLatitude(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setLocality(Lcom/googlecode/flickrjandroid/places/Place;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->locality:Lcom/googlecode/flickrjandroid/places/Place;

    .line 53
    return-void
.end method

.method public setLongitude(D)V
    .locals 1

    .prologue
    .line 117
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->longitude:D

    .line 118
    return-void
.end method

.method public setLongitude(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 112
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/places/Location;->setLongitude(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setPlaceId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeId:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public setPlaceType(I)V
    .locals 0

    .prologue
    .line 125
    iput p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeType:I

    .line 126
    return-void
.end method

.method public setPlaceUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->placeUrl:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setRegion(Lcom/googlecode/flickrjandroid/places/Place;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->region:Lcom/googlecode/flickrjandroid/places/Place;

    .line 69
    return-void
.end method

.method public setWoeId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/Location;->woeId:Ljava/lang/String;

    .line 90
    return-void
.end method
