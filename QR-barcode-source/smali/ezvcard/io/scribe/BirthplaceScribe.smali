.class public Lezvcard/io/scribe/BirthplaceScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "BirthplaceScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Birthplace;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 43
    const-class v0, Lezvcard/property/Birthplace;

    const-string v1, "BIRTHPLACE"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 44
    return-void
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/Birthplace;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Birthplace;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 53
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    .line 59
    :goto_0
    return-object v0

    .line 56
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getUri()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 57
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0, p2}, Lezvcard/io/scribe/BirthplaceScribe;->_defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    goto :goto_0
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 41
    check-cast p1, Lezvcard/property/Birthplace;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/BirthplaceScribe;->_dataType(Lezvcard/property/Birthplace;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 48
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Birthplace;
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
            "Lezvcard/property/Birthplace;"
        }
    .end annotation

    .prologue
    .line 149
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Lezvcard/property/Birthplace;

    invoke-direct {v0}, Lezvcard/property/Birthplace;-><init>()V

    .line 150
    .local v0, "property":Lezvcard/property/Birthplace;
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v1

    .line 152
    .local v1, "valueStr":Ljava/lang/String;
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    if-ne p2, v2, :cond_0

    .line 153
    invoke-virtual {v0, v1}, Lezvcard/property/Birthplace;->setText(Ljava/lang/String;)V

    .line 162
    :goto_0
    return-object v0

    .line 156
    :cond_0
    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    if-ne p2, v2, :cond_1

    .line 157
    invoke-virtual {v0, v1}, Lezvcard/property/Birthplace;->setUri(Ljava/lang/String;)V

    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {v0, v1}, Lezvcard/property/Birthplace;->setText(Ljava/lang/String;)V

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
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/BirthplaceScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Birthplace;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Birthplace;
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
            "Lezvcard/property/Birthplace;"
        }
    .end annotation

    .prologue
    .line 79
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Lezvcard/property/Birthplace;

    invoke-direct {v0}, Lezvcard/property/Birthplace;-><init>()V

    .line 80
    .local v0, "property":Lezvcard/property/Birthplace;
    invoke-static {p1}, Lezvcard/io/scribe/BirthplaceScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 82
    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    if-ne p2, v1, :cond_0

    .line 83
    invoke-virtual {v0, p1}, Lezvcard/property/Birthplace;->setText(Ljava/lang/String;)V

    .line 93
    :goto_0
    return-object v0

    .line 87
    :cond_0
    sget-object v1, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    if-ne p2, v1, :cond_1

    .line 88
    invoke-virtual {v0, p1}, Lezvcard/property/Birthplace;->setUri(Ljava/lang/String;)V

    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v0, p1}, Lezvcard/property/Birthplace;->setText(Ljava/lang/String;)V

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
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/BirthplaceScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Birthplace;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Birthplace;
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
            "Lezvcard/property/Birthplace;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 115
    new-instance v0, Lezvcard/property/Birthplace;

    invoke-direct {v0}, Lezvcard/property/Birthplace;-><init>()V

    .line 117
    .local v0, "property":Lezvcard/property/Birthplace;
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v1

    .line 118
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 119
    invoke-virtual {v0, v1}, Lezvcard/property/Birthplace;->setText(Ljava/lang/String;)V

    .line 126
    :goto_0
    return-object v0

    .line 123
    :cond_0
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v2

    .line 124
    .local v2, "uri":Ljava/lang/String;
    if-eqz v2, :cond_1

    .line 125
    invoke-virtual {v0, v2}, Lezvcard/property/Birthplace;->setUri(Ljava/lang/String;)V

    goto :goto_0

    .line 129
    :cond_1
    const/4 v3, 0x2

    new-array v3, v3, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    sget-object v4, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v4, v3, v6

    invoke-static {v3}, Lezvcard/io/scribe/BirthplaceScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

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
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/BirthplaceScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Birthplace;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Birthplace;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Birthplace;

    .prologue
    .line 134
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getText()Ljava/lang/String;

    move-result-object v0

    .line 135
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 136
    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    .line 144
    :goto_0
    return-object v2

    .line 139
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getUri()Ljava/lang/String;

    move-result-object v1

    .line 140
    .local v1, "uri":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 141
    invoke-static {v1}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    goto :goto_0

    .line 144
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
    check-cast p1, Lezvcard/property/Birthplace;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/BirthplaceScribe;->_writeJson(Lezvcard/property/Birthplace;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Birthplace;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 2
    .param p1, "property"    # Lezvcard/property/Birthplace;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 64
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getText()Ljava/lang/String;

    move-result-object v0

    .line 65
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 66
    invoke-static {v0}, Lezvcard/io/scribe/BirthplaceScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 74
    :goto_0
    return-object v1

    .line 69
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getUri()Ljava/lang/String;

    move-result-object v0

    .line 70
    if-eqz v0, :cond_1

    move-object v1, v0

    .line 71
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
    check-cast p1, Lezvcard/property/Birthplace;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/BirthplaceScribe;->_writeText(Lezvcard/property/Birthplace;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Birthplace;Lezvcard/io/xml/XCardElement;)V
    .locals 4
    .param p1, "property"    # Lezvcard/property/Birthplace;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 98
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getText()Ljava/lang/String;

    move-result-object v0

    .line 99
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 100
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p2, v2, v0}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 111
    :goto_0
    return-void

    .line 104
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Birthplace;->getUri()Ljava/lang/String;

    move-result-object v1

    .line 105
    .local v1, "uri":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 106
    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p2, v2, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_0

    .line 110
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
    .line 41
    check-cast p1, Lezvcard/property/Birthplace;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/BirthplaceScribe;->_writeXml(Lezvcard/property/Birthplace;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
