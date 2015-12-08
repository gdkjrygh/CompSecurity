.class public Lezvcard/property/Impp;
.super Lezvcard/property/VCardProperty;
.source "Impp.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# static fields
.field private static final AIM:Ljava/lang/String; = "aim"

.field private static final ICQ:Ljava/lang/String; = "icq"

.field private static final IRC:Ljava/lang/String; = "irc"

.field private static final MSN:Ljava/lang/String; = "msnim"

.field private static final SIP:Ljava/lang/String; = "sip"

.field private static final SKYPE:Ljava/lang/String; = "skype"

.field private static final XMPP:Ljava/lang/String; = "xmpp"

.field private static final YAHOO:Ljava/lang/String; = "ymsgr"


# instance fields
.field private uri:Ljava/net/URI;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "uri"    # Ljava/lang/String;

    .prologue
    .line 91
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 92
    invoke-virtual {p0, p1}, Lezvcard/property/Impp;->setUri(Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "protocol"    # Ljava/lang/String;
    .param p2, "handle"    # Ljava/lang/String;

    .prologue
    .line 110
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 111
    invoke-virtual {p0, p1, p2}, Lezvcard/property/Impp;->setUri(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    return-void
.end method

.method public constructor <init>(Ljava/net/URI;)V
    .locals 0
    .param p1, "uri"    # Ljava/net/URI;

    .prologue
    .line 100
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 101
    invoke-virtual {p0, p1}, Lezvcard/property/Impp;->setUri(Ljava/net/URI;)V

    .line 102
    return-void
.end method

.method public static aim(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 125
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "aim"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static icq(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 177
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "icq"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static irc(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 194
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "irc"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private isProtocol(Ljava/lang/String;)Z
    .locals 1
    .param p1, "protocol"    # Ljava/lang/String;

    .prologue
    .line 261
    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static msn(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 160
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "msnim"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static sip(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 212
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "sip"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static skype(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 230
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "skype"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static xmpp(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 248
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "xmpp"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static yahoo(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 2
    .param p0, "handle"    # Ljava/lang/String;

    .prologue
    .line 143
    new-instance v0, Lezvcard/property/Impp;

    const-string v1, "ymsgr"

    invoke-direct {v0, v1, p0}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public _supportedVersions()Ljava/util/Set;
    .locals 2
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
    .line 116
    sget-object v0, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

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
    .line 414
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    if-nez v0, :cond_0

    .line 415
    const-string v0, "Property value is null."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 417
    :cond_0
    return-void
.end method

.method public addPid(II)V
    .locals 0
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 384
    invoke-super {p0, p1, p2}, Lezvcard/property/VCardProperty;->addPid(II)V

    .line 385
    return-void
.end method

.method public addType(Lezvcard/parameter/ImppType;)V
    .locals 2
    .param p1, "type"    # Lezvcard/parameter/ImppType;

    .prologue
    .line 344
    iget-object v0, p0, Lezvcard/property/Impp;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/parameter/ImppType;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    .line 345
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 404
    iget-object v0, p0, Lezvcard/property/Impp;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHandle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 320
    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    if-nez v0, :cond_0

    .line 321
    const/4 v0, 0x0

    .line 323
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getMediaType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lezvcard/property/Impp;->parameters:Lezvcard/parameter/VCardParameters;

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
    .line 379
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 394
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 1

    .prologue
    .line 308
    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    if-nez v0, :cond_0

    .line 309
    const/4 v0, 0x0

    .line 311
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTypes()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lezvcard/parameter/ImppType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 331
    iget-object v4, p0, Lezvcard/property/Impp;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v4}, Lezvcard/parameter/VCardParameters;->getTypes()Ljava/util/Set;

    move-result-object v3

    .line 332
    .local v3, "values":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 333
    .local v1, "types":Ljava/util/Set;, "Ljava/util/Set<Lezvcard/parameter/ImppType;>;"
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

    .line 334
    .local v2, "value":Ljava/lang/String;
    invoke-static {v2}, Lezvcard/parameter/ImppType;->get(Ljava/lang/String;)Lezvcard/parameter/ImppType;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 336
    .end local v2    # "value":Ljava/lang/String;
    :cond_0
    return-object v1
.end method

.method public getUri()Ljava/net/URI;
    .locals 1

    .prologue
    .line 269
    iget-object v0, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    return-object v0
.end method

.method public isAim()Z
    .locals 1

    .prologue
    .line 134
    const-string v0, "aim"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isIcq()Z
    .locals 1

    .prologue
    .line 185
    const-string v0, "icq"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isIrc()Z
    .locals 1

    .prologue
    .line 202
    const-string v0, "irc"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isMsn()Z
    .locals 1

    .prologue
    .line 168
    const-string v0, "msnim"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isSip()Z
    .locals 1

    .prologue
    .line 221
    const-string v0, "sip"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isSkype()Z
    .locals 1

    .prologue
    .line 238
    const-string v0, "skype"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isXmpp()Z
    .locals 1

    .prologue
    .line 257
    const-string v0, "xmpp"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isYahoo()Z
    .locals 1

    .prologue
    .line 151
    const-string v0, "ymsgr"

    invoke-direct {p0, v0}, Lezvcard/property/Impp;->isProtocol(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public removePids()V
    .locals 0

    .prologue
    .line 389
    invoke-super {p0}, Lezvcard/property/VCardProperty;->removePids()V

    .line 390
    return-void
.end method

.method public removeType(Lezvcard/parameter/ImppType;)V
    .locals 2
    .param p1, "type"    # Lezvcard/parameter/ImppType;

    .prologue
    .line 352
    iget-object v0, p0, Lezvcard/property/Impp;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {p1}, Lezvcard/parameter/ImppType;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->removeType(Ljava/lang/String;)V

    .line 353
    return-void
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 409
    iget-object v0, p0, Lezvcard/property/Impp;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 410
    return-void
.end method

.method public setMediaType(Ljava/lang/String;)V
    .locals 1
    .param p1, "mediaType"    # Ljava/lang/String;

    .prologue
    .line 374
    iget-object v0, p0, Lezvcard/property/Impp;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    .line 375
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 399
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setPref(Ljava/lang/Integer;)V

    .line 400
    return-void
.end method

.method public setUri(Ljava/lang/String;)V
    .locals 1
    .param p1, "uri"    # Ljava/lang/String;

    .prologue
    .line 278
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lezvcard/property/Impp;->setUri(Ljava/net/URI;)V

    .line 279
    return-void

    .line 278
    :cond_0
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    goto :goto_0
.end method

.method public setUri(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "protocol"    # Ljava/lang/String;
    .param p2, "handle"    # Ljava/lang/String;

    .prologue
    .line 296
    :try_start_0
    new-instance v1, Ljava/net/URI;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    return-void

    .line 297
    :catch_0
    move-exception v0

    .line 298
    .local v0, "e":Ljava/net/URISyntaxException;
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public setUri(Ljava/net/URI;)V
    .locals 0
    .param p1, "uri"    # Ljava/net/URI;

    .prologue
    .line 286
    iput-object p1, p0, Lezvcard/property/Impp;->uri:Ljava/net/URI;

    .line 287
    return-void
.end method
