.class public Lezvcard/io/scribe/GenderScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "GenderScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Gender;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 43
    const-class v0, Lezvcard/property/Gender;

    const-string v1, "GENDER"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 44
    return-void
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 48
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Gender;
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
            "Lezvcard/property/Gender;"
        }
    .end annotation

    .prologue
    .line 115
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/GenderScribe;->structured(Lezvcard/io/json/JCardValue;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    move-result-object v0

    .line 117
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    .line 118
    .local v2, "sex":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 119
    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    .line 121
    :cond_0
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v3

    .line 123
    .local v3, "text":Ljava/lang/String;
    new-instance v1, Lezvcard/property/Gender;

    invoke-direct {v1, v2}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    .line 124
    .local v1, "property":Lezvcard/property/Gender;
    invoke-virtual {v1, v3}, Lezvcard/property/Gender;->setText(Ljava/lang/String;)V

    .line 125
    return-object v1
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 41
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/GenderScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Gender;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Gender;
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
            "Lezvcard/property/Gender;"
        }
    .end annotation

    .prologue
    .line 67
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v4, 0x2

    invoke-static {p1, v4}, Lezvcard/io/scribe/GenderScribe;->semistructured(Ljava/lang/String;I)Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;

    move-result-object v0

    .line 69
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->next()Ljava/lang/String;

    move-result-object v2

    .line 70
    .local v2, "sex":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 71
    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    .line 73
    :cond_0
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->next()Ljava/lang/String;

    move-result-object v3

    .line 75
    .local v3, "text":Ljava/lang/String;
    new-instance v1, Lezvcard/property/Gender;

    invoke-direct {v1, v2}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    .line 76
    .local v1, "property":Lezvcard/property/Gender;
    invoke-virtual {v1, v3}, Lezvcard/property/Gender;->setText(Ljava/lang/String;)V

    .line 77
    return-object v1
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
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/GenderScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Gender;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Gender;
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
            "Lezvcard/property/Gender;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 92
    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "sex"

    aput-object v3, v2, v4

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->first([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 93
    .local v1, "sex":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 94
    new-instance v0, Lezvcard/property/Gender;

    invoke-direct {v0, v1}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    .line 95
    .local v0, "property":Lezvcard/property/Gender;
    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "identity"

    aput-object v3, v2, v4

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->first([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lezvcard/property/Gender;->setText(Ljava/lang/String;)V

    .line 96
    return-object v0

    .line 99
    .end local v0    # "property":Lezvcard/property/Gender;
    :cond_0
    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "sex"

    aput-object v3, v2, v4

    invoke-static {v2}, Lezvcard/io/scribe/GenderScribe;->missingXmlElements([Ljava/lang/String;)Lezvcard/io/CannotParseException;

    move-result-object v2

    throw v2
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 41
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/GenderScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Gender;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Gender;)Lezvcard/io/json/JCardValue;
    .locals 4
    .param p1, "property"    # Lezvcard/property/Gender;

    .prologue
    .line 104
    invoke-virtual {p1}, Lezvcard/property/Gender;->getGender()Ljava/lang/String;

    move-result-object v0

    .line 105
    .local v0, "gender":Ljava/lang/String;
    invoke-virtual {p1}, Lezvcard/property/Gender;->getText()Ljava/lang/String;

    move-result-object v1

    .line 107
    .local v1, "text":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 108
    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    .line 110
    :goto_0
    return-object v2

    :cond_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-static {v2}, Lezvcard/io/json/JCardValue;->structured([Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    goto :goto_0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 41
    check-cast p1, Lezvcard/property/Gender;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/GenderScribe;->_writeJson(Lezvcard/property/Gender;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Gender;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 5
    .param p1, "property"    # Lezvcard/property/Gender;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 53
    invoke-virtual {p1}, Lezvcard/property/Gender;->getGender()Ljava/lang/String;

    move-result-object v0

    .line 54
    .local v0, "gender":Ljava/lang/String;
    invoke-virtual {p1}, Lezvcard/property/Gender;->getText()Ljava/lang/String;

    move-result-object v1

    .line 56
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 57
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v3

    aput-object v1, v2, v4

    invoke-static {v2}, Lezvcard/io/scribe/GenderScribe;->structured([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 62
    :goto_0
    return-object v2

    .line 59
    :cond_0
    if-eqz v0, :cond_1

    .line 60
    new-array v2, v4, [Ljava/lang/Object;

    aput-object v0, v2, v3

    invoke-static {v2}, Lezvcard/io/scribe/GenderScribe;->structured([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 62
    :cond_1
    const-string v2, ""

    goto :goto_0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 41
    check-cast p1, Lezvcard/property/Gender;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/GenderScribe;->_writeText(Lezvcard/property/Gender;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Gender;Lezvcard/io/xml/XCardElement;)V
    .locals 3
    .param p1, "property"    # Lezvcard/property/Gender;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 82
    const-string v1, "sex"

    invoke-virtual {p1}, Lezvcard/property/Gender;->getGender()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 84
    invoke-virtual {p1}, Lezvcard/property/Gender;->getText()Ljava/lang/String;

    move-result-object v0

    .line 85
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 86
    const-string v1, "identity"

    invoke-virtual {p2, v1, v0}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 88
    :cond_0
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 41
    check-cast p1, Lezvcard/property/Gender;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/GenderScribe;->_writeXml(Lezvcard/property/Gender;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
