.class public Lezvcard/property/Telephone;
.super Lezvcard/property/VCardProperty;
.source "Telephone.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# instance fields
.field private text:Ljava/lang/String;

.field private uri:Lezvcard/util/TelUri;


# direct methods
.method public constructor <init>(Lezvcard/util/TelUri;)V
    .locals 0
    .param p1, "uri"    # Lezvcard/util/TelUri;

    .prologue
    .line 86
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 87
    invoke-virtual {p0, p1}, Lezvcard/property/Telephone;->setUri(Lezvcard/util/TelUri;)V

    .line 88
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 78
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 79
    invoke-virtual {p0, p1}, Lezvcard/property/Telephone;->setText(Ljava/lang/String;)V

    .line 80
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
    .line 196
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v2, p0, Lezvcard/property/Telephone;->uri:Lezvcard/util/TelUri;

    if-nez v2, :cond_0

    iget-object v2, p0, Lezvcard/property/Telephone;->text:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 197
    const-string v2, "Property has neither a URI nor a text value associated with it."

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    :cond_0
    iget-object v2, p0, Lezvcard/property/Telephone;->uri:Lezvcard/util/TelUri;

    if-eqz v2, :cond_2

    sget-object v2, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-eq p2, v2, :cond_1

    sget-object v2, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    if-ne p2, v2, :cond_2

    .line 201
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\"tel\" URIs are not supported by vCard version "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".  The URI will be converted to a string.  Some data may be lost."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    :cond_2
    invoke-virtual {p0}, Lezvcard/property/Telephone;->getTypes()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/parameter/TelephoneType;

    .line 205
    .local v1, "type":Lezvcard/parameter/TelephoneType;
    sget-object v2, Lezvcard/parameter/TelephoneType;->PREF:Lezvcard/parameter/TelephoneType;

    if-eq v1, v2, :cond_3

    .line 210
    invoke-virtual {v1, p2}, Lezvcard/parameter/TelephoneType;->isSupported(Lezvcard/VCardVersion;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Type value \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lezvcard/parameter/TelephoneType;->getValue()Ljava/lang/String;

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

    .line 214
    .end local v1    # "type":Lezvcard/parameter/TelephoneType;
    :cond_4
    return-void
.end method

.method public addPid(II)V
    .locals 0
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 166
    invoke-super {p0, p1, p2}, Lezvcard/property/VCardProperty;->addPid(II)V

    .line 167
    return-void
.end method

.method public addType(Lezvcard/parameter/TelephoneType;)V
    .locals 2
    .param p1, "type"    # Lezvcard/parameter/TelephoneType;

    .prologue
    .line 148
    iget-object v0, p0, Lezvcard/property/Telephone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/parameter/TelephoneType;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    .line 149
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lezvcard/property/Telephone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

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
    .line 161
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 176
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lezvcard/property/Telephone;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getTypes()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lezvcard/parameter/TelephoneType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 135
    iget-object v4, p0, Lezvcard/property/Telephone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v4}, Lezvcard/parameter/VCardParameters;->getTypes()Ljava/util/Set;

    move-result-object v3

    .line 136
    .local v3, "values":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 137
    .local v1, "types":Ljava/util/Set;, "Ljava/util/Set<Lezvcard/parameter/TelephoneType;>;"
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

    .line 138
    .local v2, "value":Ljava/lang/String;
    invoke-static {v2}, Lezvcard/parameter/TelephoneType;->get(Ljava/lang/String;)Lezvcard/parameter/TelephoneType;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 140
    .end local v2    # "value":Ljava/lang/String;
    :cond_0
    return-object v1
.end method

.method public getUri()Lezvcard/util/TelUri;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lezvcard/property/Telephone;->uri:Lezvcard/util/TelUri;

    return-object v0
.end method

.method public removePids()V
    .locals 0

    .prologue
    .line 171
    invoke-super {p0}, Lezvcard/property/VCardProperty;->removePids()V

    .line 172
    return-void
.end method

.method public removeType(Lezvcard/parameter/TelephoneType;)V
    .locals 2
    .param p1, "type"    # Lezvcard/parameter/TelephoneType;

    .prologue
    .line 156
    iget-object v0, p0, Lezvcard/property/Telephone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/parameter/TelephoneType;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->removeType(Ljava/lang/String;)V

    .line 157
    return-void
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 191
    iget-object v0, p0, Lezvcard/property/Telephone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 192
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 181
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setPref(Ljava/lang/Integer;)V

    .line 182
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 103
    iput-object p1, p0, Lezvcard/property/Telephone;->text:Ljava/lang/String;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/property/Telephone;->uri:Lezvcard/util/TelUri;

    .line 105
    return-void
.end method

.method public setUri(Lezvcard/util/TelUri;)V
    .locals 1
    .param p1, "uri"    # Lezvcard/util/TelUri;

    .prologue
    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/property/Telephone;->text:Ljava/lang/String;

    .line 127
    iput-object p1, p0, Lezvcard/property/Telephone;->uri:Lezvcard/util/TelUri;

    .line 128
    return-void
.end method
