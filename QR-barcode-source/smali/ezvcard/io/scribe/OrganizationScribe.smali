.class public Lezvcard/io/scribe/OrganizationScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "OrganizationScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Organization;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 44
    const-class v0, Lezvcard/property/Organization;

    const-string v1, "ORG"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 45
    return-void
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

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Organization;
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
            "Lezvcard/property/Organization;"
        }
    .end annotation

    .prologue
    .line 88
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v2, Lezvcard/property/Organization;

    invoke-direct {v2}, Lezvcard/property/Organization;-><init>()V

    .line 90
    .local v2, "property":Lezvcard/property/Organization;
    const-string v3, "organization-name"

    invoke-virtual {p1, v3}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 91
    .local v0, "orgName":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 92
    invoke-virtual {v2, v0}, Lezvcard/property/Organization;->addValue(Ljava/lang/Object;)V

    .line 95
    :cond_0
    const-string v3, "organization-unit"

    invoke-virtual {p1, v3}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 96
    .local v1, "orgUnit":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 97
    invoke-virtual {v2, v1}, Lezvcard/property/Organization;->addValue(Ljava/lang/Object;)V

    .line 100
    :cond_1
    invoke-virtual {v2}, Lezvcard/property/Organization;->getValues()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 101
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lezvcard/property/Organization;->addValue(Ljava/lang/Object;)V

    .line 104
    :cond_2
    return-object v2
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/OrganizationScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Organization;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Organization;
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
            "Lezvcard/property/Organization;"
        }
    .end annotation

    .prologue
    .line 123
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/Organization;

    invoke-direct {v1}, Lezvcard/property/Organization;-><init>()V

    .line 125
    .local v1, "property":Lezvcard/property/Organization;
    invoke-static {p1}, Lezvcard/io/scribe/OrganizationScribe;->structured(Lezvcard/io/json/JCardValue;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    move-result-object v0

    .line 126
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    :goto_0
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 127
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Organization;->addValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 130
    :cond_0
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
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/OrganizationScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Organization;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Organization;
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
            "Lezvcard/property/Organization;"
        }
    .end annotation

    .prologue
    .line 59
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/Organization;

    invoke-direct {v1}, Lezvcard/property/Organization;-><init>()V

    .line 61
    .local v1, "property":Lezvcard/property/Organization;
    invoke-static {p1}, Lezvcard/io/scribe/OrganizationScribe;->semistructured(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;

    move-result-object v0

    .line 62
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;
    :goto_0
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 63
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->next()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Organization;->addValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 66
    :cond_0
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
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/OrganizationScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Organization;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Organization;
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
            "Lezvcard/property/Organization;"
        }
    .end annotation

    .prologue
    .line 76
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p1, v2}, Lezvcard/io/xml/XCardElement;->all(Lezvcard/VCardDataType;)Ljava/util/List;

    move-result-object v1

    .line 77
    .local v1, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 78
    new-instance v0, Lezvcard/property/Organization;

    invoke-direct {v0}, Lezvcard/property/Organization;-><init>()V

    .line 79
    .local v0, "property":Lezvcard/property/Organization;
    invoke-virtual {v0}, Lezvcard/property/Organization;->getValues()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 80
    return-object v0

    .line 83
    .end local v0    # "property":Lezvcard/property/Organization;
    :cond_0
    const/4 v2, 0x1

    new-array v2, v2, [Lezvcard/VCardDataType;

    const/4 v3, 0x0

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v2, v3

    invoke-static {v2}, Lezvcard/io/scribe/OrganizationScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v2

    throw v2
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/OrganizationScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Organization;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Organization;)Lezvcard/io/json/JCardValue;
    .locals 4
    .param p1, "property"    # Lezvcard/property/Organization;

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 109
    invoke-virtual {p1}, Lezvcard/property/Organization;->getValues()Ljava/util/List;

    move-result-object v0

    .line 110
    .local v0, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 111
    const-string v1, ""

    invoke-static {v1}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v1

    .line 118
    :goto_0
    return-object v1

    .line 114
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v3, :cond_1

    .line 115
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v1

    goto :goto_0

    .line 118
    :cond_1
    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-static {v1}, Lezvcard/io/json/JCardValue;->structured([Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v1

    goto :goto_0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/Organization;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/OrganizationScribe;->_writeJson(Lezvcard/property/Organization;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Organization;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Organization;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 54
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lezvcard/property/Organization;->getValues()Ljava/util/List;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lezvcard/io/scribe/OrganizationScribe;->structured([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/Organization;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/OrganizationScribe;->_writeText(Lezvcard/property/Organization;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Organization;Lezvcard/io/xml/XCardElement;)V
    .locals 2
    .param p1, "property"    # Lezvcard/property/Organization;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 71
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {v0}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lezvcard/property/Organization;->getValues()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;

    .line 72
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/Organization;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/OrganizationScribe;->_writeXml(Lezvcard/property/Organization;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
