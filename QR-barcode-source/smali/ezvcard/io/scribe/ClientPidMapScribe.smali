.class public Lezvcard/io/scribe/ClientPidMapScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "ClientPidMapScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/ClientPidMap;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 44
    const-class v0, Lezvcard/property/ClientPidMap;

    const-string v1, "CLIENTPIDMAP"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 45
    return-void
.end method

.method private parse(Ljava/lang/String;Ljava/lang/String;)Lezvcard/property/ClientPidMap;
    .locals 3
    .param p1, "pid"    # Ljava/lang/String;
    .param p2, "uri"    # Ljava/lang/String;

    .prologue
    .line 110
    :try_start_0
    new-instance v1, Lezvcard/property/ClientPidMap;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Lezvcard/property/ClientPidMap;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 111
    :catch_0
    move-exception v0

    .line 112
    .local v0, "e":Ljava/lang/NumberFormatException;
    new-instance v1, Lezvcard/io/CannotParseException;

    const-string v2, "Unable to parse PID component."

    invoke-direct {v1, v2}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 49
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/ClientPidMap;
    .locals 4
    .param p1, "value"    # Lezvcard/io/json/JCardValue;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/json/JCardValue;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/ClientPidMap;"
        }
    .end annotation

    .prologue
    .line 102
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/ClientPidMapScribe;->structured(Lezvcard/io/json/JCardValue;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    move-result-object v0

    .line 103
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v1

    .line 104
    .local v1, "pid":Ljava/lang/String;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    .line 105
    .local v2, "uri":Ljava/lang/String;
    invoke-direct {p0, v1, v2}, Lezvcard/io/scribe/ClientPidMapScribe;->parse(Ljava/lang/String;Ljava/lang/String;)Lezvcard/property/ClientPidMap;

    move-result-object v3

    return-object v3
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/ClientPidMapScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/ClientPidMap;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/ClientPidMap;
    .locals 5
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
            "Lezvcard/property/ClientPidMap;"
        }
    .end annotation

    .prologue
    .line 59
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v3, 0x2

    invoke-static {p1, v3}, Lezvcard/io/scribe/ClientPidMapScribe;->semistructured(Ljava/lang/String;I)Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;

    move-result-object v0

    .line 60
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->next()Ljava/lang/String;

    move-result-object v1

    .line 61
    .local v1, "pid":Ljava/lang/String;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->next()Ljava/lang/String;

    move-result-object v2

    .line 62
    .local v2, "uri":Ljava/lang/String;
    if-eqz v1, :cond_0

    if-nez v2, :cond_1

    .line 63
    :cond_0
    new-instance v3, Lezvcard/io/CannotParseException;

    const-string v4, "Incorrect data format.  Value must contain a PID and a URI, separated by a semi-colon."

    invoke-direct {v3, v4}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 66
    :cond_1
    invoke-direct {p0, v1, v2}, Lezvcard/io/scribe/ClientPidMapScribe;->parse(Ljava/lang/String;Ljava/lang/String;)Lezvcard/property/ClientPidMap;

    move-result-object v3

    return-object v3
.end method

.method protected bridge synthetic _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/parameter/VCardParameters;
    .param p5, "x4"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/ClientPidMapScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/ClientPidMap;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/ClientPidMap;
    .locals 6
    .param p1, "element"    # Lezvcard/io/xml/XCardElement;
    .param p2, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/xml/XCardElement;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/ClientPidMap;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 79
    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "sourceid"

    aput-object v3, v2, v4

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->first([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    .local v0, "sourceid":Ljava/lang/String;
    new-array v2, v5, [Lezvcard/VCardDataType;

    sget-object v3, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v3, v2, v4

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v1

    .line 82
    .local v1, "uri":Ljava/lang/String;
    if-nez v1, :cond_0

    if-nez v0, :cond_0

    .line 83
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    sget-object v3, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {v3}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    const-string v3, "sourceid"

    aput-object v3, v2, v5

    invoke-static {v2}, Lezvcard/io/scribe/ClientPidMapScribe;->missingXmlElements([Ljava/lang/String;)Lezvcard/io/CannotParseException;

    move-result-object v2

    throw v2

    .line 85
    :cond_0
    if-nez v1, :cond_1

    .line 86
    new-array v2, v5, [Lezvcard/VCardDataType;

    sget-object v3, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v3, v2, v4

    invoke-static {v2}, Lezvcard/io/scribe/ClientPidMapScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v2

    throw v2

    .line 88
    :cond_1
    if-nez v0, :cond_2

    .line 89
    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "sourceid"

    aput-object v3, v2, v4

    invoke-static {v2}, Lezvcard/io/scribe/ClientPidMapScribe;->missingXmlElements([Ljava/lang/String;)Lezvcard/io/CannotParseException;

    move-result-object v2

    throw v2

    .line 92
    :cond_2
    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/ClientPidMapScribe;->parse(Ljava/lang/String;Ljava/lang/String;)Lezvcard/property/ClientPidMap;

    move-result-object v2

    return-object v2
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/ClientPidMapScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/ClientPidMap;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/ClientPidMap;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/ClientPidMap;

    .prologue
    .line 97
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lezvcard/property/ClientPidMap;->getPid()Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lezvcard/property/ClientPidMap;->getUri()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lezvcard/io/json/JCardValue;->structured([Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/ClientPidMap;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/ClientPidMapScribe;->_writeJson(Lezvcard/property/ClientPidMap;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/ClientPidMap;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 3
    .param p1, "property"    # Lezvcard/property/ClientPidMap;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 54
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lezvcard/property/ClientPidMap;->getPid()Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lezvcard/property/ClientPidMap;->getUri()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lezvcard/io/scribe/ClientPidMapScribe;->structured([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/ClientPidMap;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/ClientPidMapScribe;->_writeText(Lezvcard/property/ClientPidMap;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/ClientPidMap;Lezvcard/io/xml/XCardElement;)V
    .locals 3
    .param p1, "property"    # Lezvcard/property/ClientPidMap;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 71
    invoke-virtual {p1}, Lezvcard/property/ClientPidMap;->getPid()Ljava/lang/Integer;

    move-result-object v0

    .line 72
    .local v0, "pid":Ljava/lang/Integer;
    const-string v2, "sourceid"

    if-nez v0, :cond_0

    const-string v1, ""

    :goto_0
    invoke-virtual {p2, v2, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 74
    sget-object v1, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p1}, Lezvcard/property/ClientPidMap;->getUri()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 75
    return-void

    .line 72
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/ClientPidMap;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/ClientPidMapScribe;->_writeXml(Lezvcard/property/ClientPidMap;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
