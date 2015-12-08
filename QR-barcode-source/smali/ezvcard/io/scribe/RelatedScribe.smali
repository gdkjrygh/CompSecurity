.class public Lezvcard/io/scribe/RelatedScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "RelatedScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Related;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 43
    const-class v0, Lezvcard/property/Related;

    const-string v1, "RELATED"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 44
    return-void
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/Related;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Related;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 53
    invoke-virtual {p1}, Lezvcard/property/Related;->getUri()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    .line 59
    :goto_0
    return-object v0

    .line 56
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Related;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 57
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    goto :goto_0

    .line 59
    :cond_1
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    goto :goto_0
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 41
    check-cast p1, Lezvcard/property/Related;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RelatedScribe;->_dataType(Lezvcard/property/Related;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 48
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Related;
    .locals 3
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
            "Lezvcard/property/Related;"
        }
    .end annotation

    .prologue
    .line 143
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v1

    .line 145
    .local v1, "valueStr":Ljava/lang/String;
    new-instance v0, Lezvcard/property/Related;

    invoke-direct {v0}, Lezvcard/property/Related;-><init>()V

    .line 146
    .local v0, "property":Lezvcard/property/Related;
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    if-ne p2, v2, :cond_0

    .line 147
    invoke-virtual {v0, v1}, Lezvcard/property/Related;->setText(Ljava/lang/String;)V

    .line 151
    :goto_0
    return-object v0

    .line 149
    :cond_0
    invoke-virtual {v0, v1}, Lezvcard/property/Related;->setUri(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 41
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/RelatedScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Related;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Related;
    .locals 2
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
            "Lezvcard/property/Related;"
        }
    .end annotation

    .prologue
    .line 79
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/RelatedScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 81
    new-instance v0, Lezvcard/property/Related;

    invoke-direct {v0}, Lezvcard/property/Related;-><init>()V

    .line 82
    .local v0, "property":Lezvcard/property/Related;
    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    if-ne p2, v1, :cond_0

    .line 83
    invoke-virtual {v0, p1}, Lezvcard/property/Related;->setText(Ljava/lang/String;)V

    .line 87
    :goto_0
    return-object v0

    .line 85
    :cond_0
    invoke-virtual {v0, p1}, Lezvcard/property/Related;->setUri(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/parameter/VCardParameters;
    .param p5, "x4"    # Ljava/util/List;

    .prologue
    .line 41
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/RelatedScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Related;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Related;
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
            "Lezvcard/property/Related;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 109
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v2

    .line 110
    .local v2, "uri":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 111
    new-instance v0, Lezvcard/property/Related;

    invoke-direct {v0}, Lezvcard/property/Related;-><init>()V

    .line 112
    .local v0, "property":Lezvcard/property/Related;
    invoke-virtual {v0, v2}, Lezvcard/property/Related;->setUri(Ljava/lang/String;)V

    .line 120
    :goto_0
    return-object v0

    .line 116
    .end local v0    # "property":Lezvcard/property/Related;
    :cond_0
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v1

    .line 117
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 118
    new-instance v0, Lezvcard/property/Related;

    invoke-direct {v0}, Lezvcard/property/Related;-><init>()V

    .line 119
    .restart local v0    # "property":Lezvcard/property/Related;
    invoke-virtual {v0, v1}, Lezvcard/property/Related;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 123
    .end local v0    # "property":Lezvcard/property/Related;
    :cond_1
    const/4 v3, 0x2

    new-array v3, v3, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v6

    invoke-static {v3}, Lezvcard/io/scribe/RelatedScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v3

    throw v3
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 41
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/RelatedScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Related;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Related;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Related;

    .prologue
    .line 128
    invoke-virtual {p1}, Lezvcard/property/Related;->getUri()Ljava/lang/String;

    move-result-object v1

    .line 129
    .local v1, "uri":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 130
    invoke-static {v1}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    .line 138
    :goto_0
    return-object v2

    .line 133
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Related;->getText()Ljava/lang/String;

    move-result-object v0

    .line 134
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 135
    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    goto :goto_0

    .line 138
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
    .line 41
    check-cast p1, Lezvcard/property/Related;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/RelatedScribe;->_writeJson(Lezvcard/property/Related;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Related;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 2
    .param p1, "property"    # Lezvcard/property/Related;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 64
    invoke-virtual {p1}, Lezvcard/property/Related;->getUri()Ljava/lang/String;

    move-result-object v1

    .line 65
    .local v1, "uri":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 74
    .end local v1    # "uri":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 69
    .restart local v1    # "uri":Ljava/lang/String;
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Related;->getText()Ljava/lang/String;

    move-result-object v0

    .line 70
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 71
    invoke-static {v0}, Lezvcard/io/scribe/RelatedScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 74
    :cond_1
    const-string v1, ""

    goto :goto_0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 41
    check-cast p1, Lezvcard/property/Related;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RelatedScribe;->_writeText(Lezvcard/property/Related;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Related;Lezvcard/io/xml/XCardElement;)V
    .locals 4
    .param p1, "property"    # Lezvcard/property/Related;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 92
    invoke-virtual {p1}, Lezvcard/property/Related;->getUri()Ljava/lang/String;

    move-result-object v1

    .line 93
    .local v1, "uri":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 94
    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p2, v2, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 105
    :goto_0
    return-void

    .line 98
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Related;->getText()Ljava/lang/String;

    move-result-object v0

    .line 99
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 100
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p2, v2, v0}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_0

    .line 104
    :cond_1
    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    const-string v3, ""

    invoke-virtual {p2, v2, v3}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_0
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 41
    check-cast p1, Lezvcard/property/Related;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RelatedScribe;->_writeXml(Lezvcard/property/Related;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
