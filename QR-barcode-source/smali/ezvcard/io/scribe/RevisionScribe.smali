.class public Lezvcard/io/scribe/RevisionScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "RevisionScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Revision;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 46
    const-class v0, Lezvcard/property/Revision;

    const-string v1, "REV"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 47
    return-void
.end method

.method private parse(Ljava/lang/String;)Lezvcard/property/Revision;
    .locals 3
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 116
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 117
    :cond_0
    new-instance v1, Lezvcard/property/Revision;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lezvcard/property/Revision;-><init>(Ljava/util/Date;)V

    .line 121
    :goto_0
    return-object v1

    :cond_1
    :try_start_0
    new-instance v1, Lezvcard/property/Revision;

    invoke-static {p1}, Lezvcard/io/scribe/RevisionScribe;->date(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/property/Revision;-><init>(Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 122
    :catch_0
    move-exception v0

    .line 123
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v1, Lezvcard/io/CannotParseException;

    const-string v2, "Could not parse timestamp."

    invoke-direct {v1, v2}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private write(Lezvcard/property/Revision;Z)Ljava/lang/String;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Revision;
    .param p2, "extended"    # Z

    .prologue
    const/4 v2, 0x1

    .line 107
    invoke-virtual {p1}, Lezvcard/property/Revision;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    .line 108
    .local v0, "timestamp":Ljava/util/Date;
    if-nez v0, :cond_0

    .line 109
    const-string v1, ""

    .line 112
    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lezvcard/io/scribe/RevisionScribe;->date(Ljava/util/Date;)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v1

    invoke-virtual {v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->time(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v1

    invoke-virtual {v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->utc(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v1

    invoke-virtual {v1, p2}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v1

    invoke-virtual {v1}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->write()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 51
    sget-object v0, Lezvcard/VCardDataType;->TIMESTAMP:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Revision;
    .locals 4
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Revision;"
        }
    .end annotation

    .prologue
    .line 81
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .line 82
    .local v1, "value":Ljava/lang/String;
    const-string v2, "time"

    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->tagName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 83
    const-string v2, "datetime"

    invoke-virtual {p1, v2}, Lezvcard/io/html/HCardElement;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    .local v0, "datetime":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 85
    move-object v1, v0

    .line 88
    .end local v0    # "datetime":Ljava/lang/String;
    :cond_0
    if-nez v1, :cond_1

    .line 89
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v1

    .line 92
    :cond_1
    invoke-direct {p0, v1}, Lezvcard/io/scribe/RevisionScribe;->parse(Ljava/lang/String;)Lezvcard/property/Revision;

    move-result-object v2

    return-object v2
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 44
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RevisionScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Revision;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Revision;
    .locals 2
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
            "Lezvcard/property/Revision;"
        }
    .end annotation

    .prologue
    .line 102
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v0

    .line 103
    .local v0, "valueStr":Ljava/lang/String;
    invoke-direct {p0, v0}, Lezvcard/io/scribe/RevisionScribe;->parse(Ljava/lang/String;)Lezvcard/property/Revision;

    move-result-object v1

    return-object v1
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 44
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/RevisionScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Revision;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Revision;
    .locals 1
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
            "Lezvcard/property/Revision;"
        }
    .end annotation

    .prologue
    .line 61
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, p1}, Lezvcard/io/scribe/RevisionScribe;->parse(Ljava/lang/String;)Lezvcard/property/Revision;

    move-result-object v0

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
    .line 44
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/RevisionScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Revision;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Revision;
    .locals 5
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
            "Lezvcard/property/Revision;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 71
    new-array v1, v4, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->TIMESTAMP:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v0

    .line 72
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 73
    invoke-direct {p0, v0}, Lezvcard/io/scribe/RevisionScribe;->parse(Ljava/lang/String;)Lezvcard/property/Revision;

    move-result-object v1

    return-object v1

    .line 76
    :cond_0
    new-array v1, v4, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->TIMESTAMP:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    invoke-static {v1}, Lezvcard/io/scribe/RevisionScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v1

    throw v1
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 44
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/RevisionScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Revision;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Revision;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Revision;

    .prologue
    .line 97
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lezvcard/io/scribe/RevisionScribe;->write(Lezvcard/property/Revision;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Revision;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/RevisionScribe;->_writeJson(Lezvcard/property/Revision;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Revision;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Revision;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/scribe/RevisionScribe;->write(Lezvcard/property/Revision;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Revision;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RevisionScribe;->_writeText(Lezvcard/property/Revision;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Revision;Lezvcard/io/xml/XCardElement;)V
    .locals 2
    .param p1, "property"    # Lezvcard/property/Revision;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 66
    sget-object v0, Lezvcard/VCardDataType;->TIMESTAMP:Lezvcard/VCardDataType;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/RevisionScribe;->write(Lezvcard/property/Revision;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 67
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Revision;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RevisionScribe;->_writeXml(Lezvcard/property/Revision;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
