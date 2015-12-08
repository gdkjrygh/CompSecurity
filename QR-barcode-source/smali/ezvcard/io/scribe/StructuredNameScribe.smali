.class public Lezvcard/io/scribe/StructuredNameScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "StructuredNameScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/StructuredName;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 44
    const-class v0, Lezvcard/property/StructuredName;

    const-string v1, "N"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 45
    return-void
.end method

.method private s(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 94
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 p1, 0x0

    .end local p1    # "value":Ljava/lang/String;
    :cond_1
    return-object p1
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

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/StructuredName;
    .locals 3
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/StructuredName;"
        }
    .end annotation

    .prologue
    .line 99
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Lezvcard/property/StructuredName;

    invoke-direct {v0}, Lezvcard/property/StructuredName;-><init>()V

    .line 101
    .local v0, "property":Lezvcard/property/StructuredName;
    const-string v1, "family-name"

    invoke-virtual {p1, v1}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lezvcard/io/scribe/StructuredNameScribe;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/StructuredName;->setFamily(Ljava/lang/String;)V

    .line 102
    const-string v1, "given-name"

    invoke-virtual {p1, v1}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lezvcard/io/scribe/StructuredNameScribe;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/StructuredName;->setGiven(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0}, Lezvcard/property/StructuredName;->getAdditional()Ljava/util/List;

    move-result-object v1

    const-string v2, "additional-name"

    invoke-virtual {p1, v2}, Lezvcard/io/html/HCardElement;->allValues(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 104
    invoke-virtual {v0}, Lezvcard/property/StructuredName;->getPrefixes()Ljava/util/List;

    move-result-object v1

    const-string v2, "honorific-prefix"

    invoke-virtual {p1, v2}, Lezvcard/io/html/HCardElement;->allValues(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 105
    invoke-virtual {v0}, Lezvcard/property/StructuredName;->getSuffixes()Ljava/util/List;

    move-result-object v1

    const-string v2, "honorific-suffix"

    invoke-virtual {p1, v2}, Lezvcard/io/html/HCardElement;->allValues(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 107
    return-object v0
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/StructuredNameScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/StructuredName;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/StructuredName;
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
            "Lezvcard/property/StructuredName;"
        }
    .end annotation

    .prologue
    .line 117
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/StructuredName;

    invoke-direct {v1}, Lezvcard/property/StructuredName;-><init>()V

    .line 118
    .local v1, "property":Lezvcard/property/StructuredName;
    invoke-static {p1}, Lezvcard/io/scribe/StructuredNameScribe;->structured(Lezvcard/io/json/JCardValue;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    move-result-object v0

    .line 120
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/StructuredName;->setFamily(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/StructuredName;->setGiven(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v1}, Lezvcard/property/StructuredName;->getAdditional()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextComponent()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 123
    invoke-virtual {v1}, Lezvcard/property/StructuredName;->getPrefixes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextComponent()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 124
    invoke-virtual {v1}, Lezvcard/property/StructuredName;->getSuffixes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextComponent()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 126
    return-object v1
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/StructuredNameScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/StructuredName;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/StructuredName;
    .locals 4
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
            "Lezvcard/property/StructuredName;"
        }
    .end annotation

    .prologue
    .line 59
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/StructuredName;

    invoke-direct {v1}, Lezvcard/property/StructuredName;-><init>()V

    .line 60
    .local v1, "property":Lezvcard/property/StructuredName;
    invoke-static {p1}, Lezvcard/io/scribe/StructuredNameScribe;->structured(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    move-result-object v0

    .line 62
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/StructuredName;->setFamily(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/StructuredName;->setGiven(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v1}, Lezvcard/property/StructuredName;->getAdditional()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextComponent()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 65
    invoke-virtual {v1}, Lezvcard/property/StructuredName;->getPrefixes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextComponent()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 66
    invoke-virtual {v1}, Lezvcard/property/StructuredName;->getSuffixes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextComponent()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 68
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
    .line 42
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/StructuredNameScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/StructuredName;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/StructuredName;
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
            "Lezvcard/property/StructuredName;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 82
    new-instance v0, Lezvcard/property/StructuredName;

    invoke-direct {v0}, Lezvcard/property/StructuredName;-><init>()V

    .line 84
    .local v0, "property":Lezvcard/property/StructuredName;
    new-array v1, v4, [Ljava/lang/String;

    const-string v2, "surname"

    aput-object v2, v1, v3

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lezvcard/io/scribe/StructuredNameScribe;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/StructuredName;->setFamily(Ljava/lang/String;)V

    .line 85
    new-array v1, v4, [Ljava/lang/String;

    const-string v2, "given"

    aput-object v2, v1, v3

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lezvcard/io/scribe/StructuredNameScribe;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/StructuredName;->setGiven(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v0}, Lezvcard/property/StructuredName;->getAdditional()Ljava/util/List;

    move-result-object v1

    const-string v2, "additional"

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->all(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 87
    invoke-virtual {v0}, Lezvcard/property/StructuredName;->getPrefixes()Ljava/util/List;

    move-result-object v1

    const-string v2, "prefix"

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->all(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 88
    invoke-virtual {v0}, Lezvcard/property/StructuredName;->getSuffixes()Ljava/util/List;

    move-result-object v1

    const-string v2, "suffix"

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->all(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 90
    return-object v0
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/StructuredNameScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/StructuredName;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/StructuredName;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/StructuredName;

    .prologue
    .line 112
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getFamily()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getGiven()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getAdditional()Ljava/util/List;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getPrefixes()Ljava/util/List;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getSuffixes()Ljava/util/List;

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
    check-cast p1, Lezvcard/property/StructuredName;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/StructuredNameScribe;->_writeJson(Lezvcard/property/StructuredName;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/StructuredName;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 3
    .param p1, "property"    # Lezvcard/property/StructuredName;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 54
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getFamily()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getGiven()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getAdditional()Ljava/util/List;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getPrefixes()Ljava/util/List;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getSuffixes()Ljava/util/List;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lezvcard/io/scribe/StructuredNameScribe;->structured([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/StructuredName;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/StructuredNameScribe;->_writeText(Lezvcard/property/StructuredName;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/StructuredName;Lezvcard/io/xml/XCardElement;)V
    .locals 2
    .param p1, "property"    # Lezvcard/property/StructuredName;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 73
    const-string v0, "surname"

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getFamily()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 74
    const-string v0, "given"

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getGiven()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 75
    const-string v0, "additional"

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getAdditional()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;

    .line 76
    const-string v0, "prefix"

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getPrefixes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;

    .line 77
    const-string v0, "suffix"

    invoke-virtual {p1}, Lezvcard/property/StructuredName;->getSuffixes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;

    .line 78
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/StructuredName;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/StructuredNameScribe;->_writeXml(Lezvcard/property/StructuredName;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
