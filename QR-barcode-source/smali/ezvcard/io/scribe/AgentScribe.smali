.class public Lezvcard/io/scribe/AgentScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "AgentScribe.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/scribe/AgentScribe$Injector;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Agent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 47
    const-class v0, Lezvcard/property/Agent;

    const-string v1, "AGENT"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 48
    return-void
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/Agent;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Agent;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 57
    invoke-virtual {p1}, Lezvcard/property/Agent;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 58
    sget-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-ne p2, v0, :cond_0

    sget-object v0, Lezvcard/VCardDataType;->URL:Lezvcard/VCardDataType;

    .line 60
    :goto_0
    return-object v0

    .line 58
    :cond_0
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    goto :goto_0

    .line 60
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 45
    check-cast p1, Lezvcard/property/Agent;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/AgentScribe;->_dataType(Lezvcard/property/Agent;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 52
    const/4 v0, 0x0

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Agent;
    .locals 5
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Agent;"
        }
    .end annotation

    .prologue
    .line 93
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/Agent;

    invoke-direct {v1}, Lezvcard/property/Agent;-><init>()V

    .line 95
    .local v1, "property":Lezvcard/property/Agent;
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->classNames()Ljava/util/Set;

    move-result-object v0

    .line 96
    .local v0, "classes":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const-string v3, "vcard"

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 97
    new-instance v3, Lezvcard/io/EmbeddedVCardException;

    new-instance v4, Lezvcard/io/scribe/AgentScribe$Injector;

    invoke-direct {v4, v1}, Lezvcard/io/scribe/AgentScribe$Injector;-><init>(Lezvcard/property/Agent;)V

    invoke-direct {v3, v4}, Lezvcard/io/EmbeddedVCardException;-><init>(Lezvcard/io/EmbeddedVCardException$InjectionCallback;)V

    throw v3

    .line 100
    :cond_0
    const-string v3, "href"

    invoke-virtual {p1, v3}, Lezvcard/io/html/HCardElement;->absUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 101
    .local v2, "url":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1

    .line 102
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v2

    .line 104
    :cond_1
    invoke-virtual {v1, v2}, Lezvcard/property/Agent;->setUrl(Ljava/lang/String;)V

    .line 106
    return-object v1
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 45
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/AgentScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Agent;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Agent;
    .locals 3
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Agent;"
        }
    .end annotation

    .prologue
    .line 81
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Lezvcard/property/Agent;

    invoke-direct {v0}, Lezvcard/property/Agent;-><init>()V

    .line 83
    .local v0, "property":Lezvcard/property/Agent;
    if-nez p2, :cond_0

    .line 84
    new-instance v1, Lezvcard/io/EmbeddedVCardException;

    new-instance v2, Lezvcard/io/scribe/AgentScribe$Injector;

    invoke-direct {v2, v0}, Lezvcard/io/scribe/AgentScribe$Injector;-><init>(Lezvcard/property/Agent;)V

    invoke-direct {v1, v2}, Lezvcard/io/EmbeddedVCardException;-><init>(Lezvcard/io/EmbeddedVCardException$InjectionCallback;)V

    throw v1

    .line 87
    :cond_0
    invoke-static {p1}, Lezvcard/io/scribe/AgentScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Agent;->setUrl(Ljava/lang/String;)V

    .line 88
    return-object v0
.end method

.method protected bridge synthetic _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/parameter/VCardParameters;
    .param p5, "x4"    # Ljava/util/List;

    .prologue
    .line 45
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/AgentScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Agent;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Agent;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 4
    .param p1, "property"    # Lezvcard/property/Agent;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 65
    invoke-virtual {p1}, Lezvcard/property/Agent;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 66
    .local v0, "url":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 67
    return-object v0

    .line 70
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Agent;->getVCard()Lezvcard/VCard;

    move-result-object v1

    .line 71
    .local v1, "vcard":Lezvcard/VCard;
    if-eqz v1, :cond_1

    .line 72
    new-instance v2, Lezvcard/io/EmbeddedVCardException;

    invoke-direct {v2, v1}, Lezvcard/io/EmbeddedVCardException;-><init>(Lezvcard/VCard;)V

    throw v2

    .line 76
    :cond_1
    new-instance v2, Lezvcard/io/SkipMeException;

    const-string v3, "Property has neither a URL nor an embedded vCard."

    invoke-direct {v2, v3}, Lezvcard/io/SkipMeException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 45
    check-cast p1, Lezvcard/property/Agent;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/AgentScribe;->_writeText(Lezvcard/property/Agent;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
