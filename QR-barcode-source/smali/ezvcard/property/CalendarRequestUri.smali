.class public Lezvcard/property/CalendarRequestUri;
.super Lezvcard/property/UriProperty;
.source "CalendarRequestUri.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "uri"    # Ljava/lang/String;

    .prologue
    .line 69
    invoke-direct {p0, p1}, Lezvcard/property/UriProperty;-><init>(Ljava/lang/String;)V

    .line 70
    return-void
.end method


# virtual methods
.method public _supportedVersions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lezvcard/VCardVersion;",
            ">;"
        }
    .end annotation

    .prologue
    .line 74
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public addPid(II)V
    .locals 0
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 106
    invoke-super {p0, p1, p2}, Lezvcard/property/UriProperty;->addPid(II)V

    .line 107
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lezvcard/property/CalendarRequestUri;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMediaType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lezvcard/property/CalendarRequestUri;->parameters:Lezvcard/parameter/VCardParameters;

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
    .line 101
    invoke-super {p0}, Lezvcard/property/UriProperty;->getPids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 116
    invoke-super {p0}, Lezvcard/property/UriProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lezvcard/property/CalendarRequestUri;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public removePids()V
    .locals 0

    .prologue
    .line 111
    invoke-super {p0}, Lezvcard/property/UriProperty;->removePids()V

    .line 112
    return-void
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 131
    iget-object v0, p0, Lezvcard/property/CalendarRequestUri;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 132
    return-void
.end method

.method public setMediaType(Ljava/lang/String;)V
    .locals 1
    .param p1, "mediaType"    # Ljava/lang/String;

    .prologue
    .line 96
    iget-object v0, p0, Lezvcard/property/CalendarRequestUri;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    .line 97
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 121
    invoke-super {p0, p1}, Lezvcard/property/UriProperty;->setPref(Ljava/lang/Integer;)V

    .line 122
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 155
    iget-object v0, p0, Lezvcard/property/CalendarRequestUri;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    .line 156
    return-void
.end method
