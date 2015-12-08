.class public Lezvcard/io/scribe/TelephoneScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "TelephoneScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Telephone;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 46
    const-class v0, Lezvcard/property/Telephone;

    const-string v1, "TEL"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 47
    return-void
.end method

.method private parse(Ljava/lang/String;Lezvcard/VCardDataType;Ljava/util/List;)Lezvcard/property/Telephone;
    .locals 3
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Telephone;"
        }
    .end annotation

    .prologue
    .line 181
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    new-instance v1, Lezvcard/property/Telephone;

    invoke-static {p1}, Lezvcard/util/TelUri;->parse(Ljava/lang/String;)Lezvcard/util/TelUri;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/property/Telephone;-><init>(Lezvcard/util/TelUri;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    :goto_0
    return-object v1

    .line 182
    :catch_0
    move-exception v0

    .line 183
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    sget-object v1, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    if-ne p2, v1, :cond_0

    .line 184
    const-string v1, "Could not parse property value as a URI.  Assuming it\'s text."

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    :cond_0
    new-instance v1, Lezvcard/property/Telephone;

    invoke-direct {v1, p1}, Lezvcard/property/Telephone;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/Telephone;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Telephone;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 56
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p2, v0, :cond_1

    .line 57
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 58
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    .line 65
    :goto_0
    return-object v0

    .line 60
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getUri()Lezvcard/util/TelUri;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 61
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    goto :goto_0

    .line 65
    :cond_1
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    goto :goto_0
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Telephone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TelephoneScribe;->_dataType(Lezvcard/property/Telephone;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 51
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Telephone;
    .locals 7
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Telephone;"
        }
    .end annotation

    .prologue
    .line 142
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v6, "href"

    invoke-virtual {p1, v6}, Lezvcard/io/html/HCardElement;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 144
    .local v1, "href":Ljava/lang/String;
    :try_start_0
    new-instance v3, Lezvcard/property/Telephone;

    invoke-static {v1}, Lezvcard/util/TelUri;->parse(Ljava/lang/String;)Lezvcard/util/TelUri;

    move-result-object v6

    invoke-direct {v3, v6}, Lezvcard/property/Telephone;-><init>(Lezvcard/util/TelUri;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    .local v3, "property":Lezvcard/property/Telephone;
    :goto_0
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->types()Ljava/util/List;

    move-result-object v5

    .line 151
    .local v5, "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 152
    .local v4, "type":Ljava/lang/String;
    invoke-virtual {v3}, Lezvcard/property/Telephone;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v6

    invoke-virtual {v6, v4}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    goto :goto_1

    .line 145
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "property":Lezvcard/property/Telephone;
    .end local v4    # "type":Ljava/lang/String;
    .end local v5    # "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :catch_0
    move-exception v0

    .line 147
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v3, Lezvcard/property/Telephone;

    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lezvcard/property/Telephone;-><init>(Ljava/lang/String;)V

    .restart local v3    # "property":Lezvcard/property/Telephone;
    goto :goto_0

    .line 155
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    .restart local v2    # "i$":Ljava/util/Iterator;
    .restart local v5    # "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_0
    return-object v3
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 44
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TelephoneScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Telephone;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Telephone;
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
            "Lezvcard/property/Telephone;"
        }
    .end annotation

    .prologue
    .line 175
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v0

    .line 176
    .local v0, "valueStr":Ljava/lang/String;
    invoke-direct {p0, v0, p2, p4}, Lezvcard/io/scribe/TelephoneScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Ljava/util/List;)Lezvcard/property/Telephone;

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
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/TelephoneScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Telephone;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Telephone;
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
            "Lezvcard/property/Telephone;"
        }
    .end annotation

    .prologue
    .line 98
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/TelephoneScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 99
    invoke-direct {p0, p1, p2, p5}, Lezvcard/io/scribe/TelephoneScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Ljava/util/List;)Lezvcard/property/Telephone;

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
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/TelephoneScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Telephone;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Telephone;
    .locals 7
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
            "Lezvcard/property/Telephone;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 121
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v1

    .line 122
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 123
    new-instance v3, Lezvcard/property/Telephone;

    invoke-direct {v3, v1}, Lezvcard/property/Telephone;-><init>(Ljava/lang/String;)V

    .line 132
    :goto_0
    return-object v3

    .line 126
    :cond_0
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v2

    .line 127
    .local v2, "uri":Ljava/lang/String;
    if-eqz v2, :cond_1

    .line 129
    :try_start_0
    new-instance v3, Lezvcard/property/Telephone;

    invoke-static {v2}, Lezvcard/util/TelUri;->parse(Ljava/lang/String;)Lezvcard/util/TelUri;

    move-result-object v4

    invoke-direct {v3, v4}, Lezvcard/property/Telephone;-><init>(Lezvcard/util/TelUri;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 130
    :catch_0
    move-exception v0

    .line 131
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    const-string v3, "Could not parse property value as a URI.  Assuming it\'s text."

    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    new-instance v3, Lezvcard/property/Telephone;

    invoke-direct {v3, v2}, Lezvcard/property/Telephone;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 136
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :cond_1
    const/4 v3, 0x2

    new-array v3, v3, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    sget-object v4, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v4, v3, v6

    invoke-static {v3}, Lezvcard/io/scribe/TelephoneScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v3

    throw v3
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 44
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/TelephoneScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Telephone;

    move-result-object v0

    return-object v0
.end method

.method protected _prepareParameters(Lezvcard/property/Telephone;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 0
    .param p1, "property"    # Lezvcard/property/Telephone;
    .param p2, "copy"    # Lezvcard/parameter/VCardParameters;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 70
    invoke-static {p1, p2, p3, p4}, Lezvcard/io/scribe/TelephoneScribe;->handlePrefParam(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    .line 71
    return-void
.end method

.method protected bridge synthetic _prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/VCard;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Telephone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/TelephoneScribe;->_prepareParameters(Lezvcard/property/Telephone;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    return-void
.end method

.method protected _writeJson(Lezvcard/property/Telephone;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Telephone;

    .prologue
    .line 160
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getText()Ljava/lang/String;

    move-result-object v0

    .line 161
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 162
    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    .line 170
    :goto_0
    return-object v2

    .line 165
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getUri()Lezvcard/util/TelUri;

    move-result-object v1

    .line 166
    .local v1, "uri":Lezvcard/util/TelUri;
    if-eqz v1, :cond_1

    .line 167
    invoke-virtual {v1}, Lezvcard/util/TelUri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    goto :goto_0

    .line 170
    :cond_1
    const-string v2, ""

    invoke-static {v2}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    goto :goto_0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Telephone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/TelephoneScribe;->_writeJson(Lezvcard/property/Telephone;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Telephone;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 5
    .param p1, "property"    # Lezvcard/property/Telephone;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 75
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getText()Ljava/lang/String;

    move-result-object v1

    .line 76
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 77
    invoke-static {v1}, Lezvcard/io/scribe/TelephoneScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 93
    :goto_0
    return-object v3

    .line 80
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getUri()Lezvcard/util/TelUri;

    move-result-object v2

    .line 81
    .local v2, "uri":Lezvcard/util/TelUri;
    if-eqz v2, :cond_3

    .line 82
    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p2, v3, :cond_1

    .line 83
    invoke-virtual {v2}, Lezvcard/util/TelUri;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {v2}, Lezvcard/util/TelUri;->getExtension()Ljava/lang/String;

    move-result-object v0

    .line 87
    .local v0, "ext":Ljava/lang/String;
    if-nez v0, :cond_2

    .line 88
    invoke-virtual {v2}, Lezvcard/util/TelUri;->getNumber()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lezvcard/io/scribe/TelephoneScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 90
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lezvcard/util/TelUri;->getNumber()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lezvcard/io/scribe/TelephoneScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 93
    .end local v0    # "ext":Ljava/lang/String;
    :cond_3
    const-string v3, ""

    goto :goto_0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Telephone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TelephoneScribe;->_writeText(Lezvcard/property/Telephone;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Telephone;Lezvcard/io/xml/XCardElement;)V
    .locals 4
    .param p1, "property"    # Lezvcard/property/Telephone;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 104
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getText()Ljava/lang/String;

    move-result-object v0

    .line 105
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 106
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p2, v2, v0}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 117
    :goto_0
    return-void

    .line 110
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Telephone;->getUri()Lezvcard/util/TelUri;

    move-result-object v1

    .line 111
    .local v1, "uri":Lezvcard/util/TelUri;
    if-eqz v1, :cond_1

    .line 112
    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {v1}, Lezvcard/util/TelUri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_0

    .line 116
    :cond_1
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    const-string v3, ""

    invoke-virtual {p2, v2, v3}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_0
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 44
    check-cast p1, Lezvcard/property/Telephone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TelephoneScribe;->_writeXml(Lezvcard/property/Telephone;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
