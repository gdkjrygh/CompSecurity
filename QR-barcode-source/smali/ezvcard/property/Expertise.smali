.class public Lezvcard/property/Expertise;
.super Lezvcard/property/TextProperty;
.source "Expertise.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "skill"    # Ljava/lang/String;

    .prologue
    .line 70
    invoke-direct {p0, p1}, Lezvcard/property/TextProperty;-><init>(Ljava/lang/String;)V

    .line 71
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
    .line 75
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lezvcard/property/Expertise;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIndex()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 99
    invoke-super {p0}, Lezvcard/property/TextProperty;->getIndex()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 127
    invoke-super {p0}, Lezvcard/property/TextProperty;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLevel()Lezvcard/parameter/ExpertiseLevel;
    .locals 2

    .prologue
    .line 84
    iget-object v1, p0, Lezvcard/property/Expertise;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v1}, Lezvcard/parameter/VCardParameters;->getLevel()Ljava/lang/String;

    move-result-object v0

    .line 85
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lezvcard/parameter/ExpertiseLevel;->get(Ljava/lang/String;)Lezvcard/parameter/ExpertiseLevel;

    move-result-object v1

    goto :goto_0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 137
    invoke-super {p0}, Lezvcard/property/TextProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lezvcard/property/Expertise;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 152
    iget-object v0, p0, Lezvcard/property/Expertise;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 153
    return-void
.end method

.method public setIndex(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "index"    # Ljava/lang/Integer;

    .prologue
    .line 104
    invoke-super {p0, p1}, Lezvcard/property/TextProperty;->setIndex(Ljava/lang/Integer;)V

    .line 105
    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    .line 132
    invoke-super {p0, p1}, Lezvcard/property/TextProperty;->setLanguage(Ljava/lang/String;)V

    .line 133
    return-void
.end method

.method public setLevel(Lezvcard/parameter/ExpertiseLevel;)V
    .locals 2
    .param p1, "level"    # Lezvcard/parameter/ExpertiseLevel;

    .prologue
    .line 94
    iget-object v0, p0, Lezvcard/property/Expertise;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/parameter/ExpertiseLevel;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->setLevel(Ljava/lang/String;)V

    .line 95
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 142
    invoke-super {p0, p1}, Lezvcard/property/TextProperty;->setPref(Ljava/lang/Integer;)V

    .line 143
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 122
    iget-object v0, p0, Lezvcard/property/Expertise;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    .line 123
    return-void
.end method
