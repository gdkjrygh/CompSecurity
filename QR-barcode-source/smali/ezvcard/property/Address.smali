.class public Lezvcard/property/Address;
.super Lezvcard/property/VCardProperty;
.source "Address.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# instance fields
.field private country:Ljava/lang/String;

.field private extendedAddress:Ljava/lang/String;

.field private locality:Ljava/lang/String;

.field private poBox:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private region:Ljava/lang/String;

.field private streetAddress:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    return-void
.end method


# virtual methods
.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 4
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
    .line 350
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lezvcard/property/Address;->getTypes()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/parameter/AddressType;

    .line 351
    .local v1, "type":Lezvcard/parameter/AddressType;
    sget-object v2, Lezvcard/parameter/AddressType;->PREF:Lezvcard/parameter/AddressType;

    if-eq v1, v2, :cond_0

    .line 356
    invoke-virtual {v1, p2}, Lezvcard/parameter/AddressType;->isSupported(Lezvcard/VCardVersion;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 357
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Type value \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lezvcard/parameter/AddressType;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" is not supported in version "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 360
    .end local v1    # "type":Lezvcard/parameter/AddressType;
    :cond_1
    return-void
.end method

.method public addPid(II)V
    .locals 0
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 297
    invoke-super {p0, p1, p2}, Lezvcard/property/VCardProperty;->addPid(II)V

    .line 298
    return-void
.end method

.method public addType(Lezvcard/parameter/AddressType;)V
    .locals 2
    .param p1, "type"    # Lezvcard/parameter/AddressType;

    .prologue
    .line 225
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/parameter/AddressType;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    .line 226
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lezvcard/property/Address;->country:Ljava/lang/String;

    return-object v0
.end method

.method public getExtendedAddress()Ljava/lang/String;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lezvcard/property/Address;->extendedAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getGeo()[D
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getGeo()[D

    move-result-object v0

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getLabel()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 238
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocality()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lezvcard/property/Address;->locality:Ljava/lang/String;

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
    .line 292
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPoBox()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lezvcard/property/Address;->poBox:Ljava/lang/String;

    return-object v0
.end method

.method public getPostalCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lezvcard/property/Address;->postalCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 307
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getRegion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lezvcard/property/Address;->region:Ljava/lang/String;

    return-object v0
.end method

.method public getStreetAddress()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lezvcard/property/Address;->streetAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getTimezone()Ljava/lang/String;
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getTimezone()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTypes()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lezvcard/parameter/AddressType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 212
    iget-object v4, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v4}, Lezvcard/parameter/VCardParameters;->getTypes()Ljava/util/Set;

    move-result-object v3

    .line 213
    .local v3, "values":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 214
    .local v1, "types":Ljava/util/Set;, "Ljava/util/Set<Lezvcard/parameter/AddressType;>;"
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 215
    .local v2, "value":Ljava/lang/String;
    invoke-static {v2}, Lezvcard/parameter/AddressType;->get(Ljava/lang/String;)Lezvcard/parameter/AddressType;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 217
    .end local v2    # "value":Ljava/lang/String;
    :cond_0
    return-object v1
.end method

.method public removePids()V
    .locals 0

    .prologue
    .line 302
    invoke-super {p0}, Lezvcard/property/VCardProperty;->removePids()V

    .line 303
    return-void
.end method

.method public removeType(Lezvcard/parameter/AddressType;)V
    .locals 2
    .param p1, "type"    # Lezvcard/parameter/AddressType;

    .prologue
    .line 233
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/parameter/AddressType;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->removeType(Ljava/lang/String;)V

    .line 234
    return-void
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 322
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 323
    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0
    .param p1, "country"    # Ljava/lang/String;

    .prologue
    .line 204
    iput-object p1, p0, Lezvcard/property/Address;->country:Ljava/lang/String;

    .line 205
    return-void
.end method

.method public setExtendedAddress(Ljava/lang/String;)V
    .locals 0
    .param p1, "extendedAddress"    # Ljava/lang/String;

    .prologue
    .line 123
    iput-object p1, p0, Lezvcard/property/Address;->extendedAddress:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public setGeo(DD)V
    .locals 1
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 287
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1, p2, p3, p4}, Lezvcard/parameter/VCardParameters;->setGeo(DD)V

    .line 288
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 1
    .param p1, "label"    # Ljava/lang/String;

    .prologue
    .line 259
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setLabel(Ljava/lang/String;)V

    .line 260
    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    .line 243
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setLanguage(Ljava/lang/String;)V

    .line 244
    return-void
.end method

.method public setLocality(Ljava/lang/String;)V
    .locals 0
    .param p1, "locality"    # Ljava/lang/String;

    .prologue
    .line 156
    iput-object p1, p0, Lezvcard/property/Address;->locality:Ljava/lang/String;

    .line 157
    return-void
.end method

.method public setPoBox(Ljava/lang/String;)V
    .locals 0
    .param p1, "poBox"    # Ljava/lang/String;

    .prologue
    .line 106
    iput-object p1, p0, Lezvcard/property/Address;->poBox:Ljava/lang/String;

    .line 107
    return-void
.end method

.method public setPostalCode(Ljava/lang/String;)V
    .locals 0
    .param p1, "postalCode"    # Ljava/lang/String;

    .prologue
    .line 188
    iput-object p1, p0, Lezvcard/property/Address;->postalCode:Ljava/lang/String;

    .line 189
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 312
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setPref(Ljava/lang/Integer;)V

    .line 313
    return-void
.end method

.method public setRegion(Ljava/lang/String;)V
    .locals 0
    .param p1, "region"    # Ljava/lang/String;

    .prologue
    .line 172
    iput-object p1, p0, Lezvcard/property/Address;->region:Ljava/lang/String;

    .line 173
    return-void
.end method

.method public setStreetAddress(Ljava/lang/String;)V
    .locals 0
    .param p1, "streetAddress"    # Ljava/lang/String;

    .prologue
    .line 140
    iput-object p1, p0, Lezvcard/property/Address;->streetAddress:Ljava/lang/String;

    .line 141
    return-void
.end method

.method public setTimezone(Ljava/lang/String;)V
    .locals 1
    .param p1, "timezone"    # Ljava/lang/String;

    .prologue
    .line 345
    iget-object v0, p0, Lezvcard/property/Address;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setTimezone(Ljava/lang/String;)V

    .line 346
    return-void
.end method
