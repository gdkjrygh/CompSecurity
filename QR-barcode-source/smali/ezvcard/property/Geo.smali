.class public Lezvcard/property/Geo;
.super Lezvcard/property/VCardProperty;
.source "Geo.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# instance fields
.field private uri:Lezvcard/util/GeoUri;


# direct methods
.method public constructor <init>(Lezvcard/util/GeoUri;)V
    .locals 0
    .param p1, "uri"    # Lezvcard/util/GeoUri;

    .prologue
    .line 102
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 103
    iput-object p1, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    .line 104
    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 1
    .param p1, "latitude"    # Ljava/lang/Double;
    .param p2, "longitude"    # Ljava/lang/Double;

    .prologue
    .line 95
    new-instance v0, Lezvcard/util/GeoUri$Builder;

    invoke-direct {v0, p1, p2}, Lezvcard/util/GeoUri$Builder;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    invoke-virtual {v0}, Lezvcard/util/GeoUri$Builder;->build()Lezvcard/util/GeoUri;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/property/Geo;-><init>(Lezvcard/util/GeoUri;)V

    .line 96
    return-void
.end method


# virtual methods
.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 1
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .line 255
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lezvcard/property/Geo;->getLatitude()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_0

    .line 256
    const-string v0, "Latitude is missing."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 258
    :cond_0
    invoke-virtual {p0}, Lezvcard/property/Geo;->getLongitude()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_1

    .line 259
    const-string v0, "Longitude is missing."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    :cond_1
    return-void
.end method

.method public addPid(II)V
    .locals 0
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 225
    invoke-super {p0, p1, p2}, Lezvcard/property/VCardProperty;->addPid(II)V

    .line 226
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lezvcard/property/Geo;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGeoUri()Lezvcard/util/GeoUri;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    return-object v0
.end method

.method public getLatitude()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    invoke-virtual {v0}, Lezvcard/util/GeoUri;->getCoordA()Ljava/lang/Double;

    move-result-object v0

    goto :goto_0
.end method

.method public getLongitude()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    invoke-virtual {v0}, Lezvcard/util/GeoUri;->getCoordB()Ljava/lang/Double;

    move-result-object v0

    goto :goto_0
.end method

.method public getMediaType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lezvcard/property/Geo;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getMediaType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPids()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 220
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 235
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lezvcard/property/Geo;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public removePids()V
    .locals 0

    .prologue
    .line 230
    invoke-super {p0}, Lezvcard/property/VCardProperty;->removePids()V

    .line 231
    return-void
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 250
    iget-object v0, p0, Lezvcard/property/Geo;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 251
    return-void
.end method

.method public setGeoUri(Lezvcard/util/GeoUri;)V
    .locals 0
    .param p1, "uri"    # Lezvcard/util/GeoUri;

    .prologue
    .line 169
    iput-object p1, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    .line 170
    return-void
.end method

.method public setLatitude(Ljava/lang/Double;)V
    .locals 2
    .param p1, "latitude"    # Ljava/lang/Double;

    .prologue
    .line 119
    iget-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Lezvcard/util/GeoUri$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lezvcard/util/GeoUri$Builder;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    invoke-virtual {v0}, Lezvcard/util/GeoUri$Builder;->build()Lezvcard/util/GeoUri;

    move-result-object v0

    iput-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    .line 124
    :goto_0
    return-void

    .line 122
    :cond_0
    new-instance v0, Lezvcard/util/GeoUri$Builder;

    iget-object v1, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    invoke-direct {v0, v1}, Lezvcard/util/GeoUri$Builder;-><init>(Lezvcard/util/GeoUri;)V

    invoke-virtual {v0, p1}, Lezvcard/util/GeoUri$Builder;->coordA(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/util/GeoUri$Builder;->build()Lezvcard/util/GeoUri;

    move-result-object v0

    iput-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    goto :goto_0
.end method

.method public setLongitude(Ljava/lang/Double;)V
    .locals 2
    .param p1, "longitude"    # Ljava/lang/Double;

    .prologue
    .line 139
    iget-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    if-nez v0, :cond_0

    .line 140
    new-instance v0, Lezvcard/util/GeoUri$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lezvcard/util/GeoUri$Builder;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    invoke-virtual {v0}, Lezvcard/util/GeoUri$Builder;->build()Lezvcard/util/GeoUri;

    move-result-object v0

    iput-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    .line 144
    :goto_0
    return-void

    .line 142
    :cond_0
    new-instance v0, Lezvcard/util/GeoUri$Builder;

    iget-object v1, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    invoke-direct {v0, v1}, Lezvcard/util/GeoUri$Builder;-><init>(Lezvcard/util/GeoUri;)V

    invoke-virtual {v0, p1}, Lezvcard/util/GeoUri$Builder;->coordB(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/util/GeoUri$Builder;->build()Lezvcard/util/GeoUri;

    move-result-object v0

    iput-object v0, p0, Lezvcard/property/Geo;->uri:Lezvcard/util/GeoUri;

    goto :goto_0
.end method

.method public setMediaType(Ljava/lang/String;)V
    .locals 1
    .param p1, "mediaType"    # Ljava/lang/String;

    .prologue
    .line 215
    iget-object v0, p0, Lezvcard/property/Geo;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    .line 216
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 240
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setPref(Ljava/lang/Integer;)V

    .line 241
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 193
    iget-object v0, p0, Lezvcard/property/Geo;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    .line 194
    return-void
.end method
