.class public Lezvcard/io/scribe/AddressScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "AddressScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Address;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 45
    const-class v0, Lezvcard/property/Address;

    const-string v1, "ADR"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 46
    return-void
.end method

.method private sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "element"    # Lezvcard/io/xml/XCardElement;
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 120
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 121
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .end local v0    # "value":Ljava/lang/String;
    :cond_1
    return-object v0
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 50
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Address;
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
            "Lezvcard/property/Address;"
        }
    .end annotation

    .prologue
    .line 126
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/Address;

    invoke-direct {v1}, Lezvcard/property/Address;-><init>()V

    .line 127
    .local v1, "property":Lezvcard/property/Address;
    const-string v4, "post-office-box"

    invoke-virtual {p1, v4}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lezvcard/property/Address;->setPoBox(Ljava/lang/String;)V

    .line 128
    const-string v4, "extended-address"

    invoke-virtual {p1, v4}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lezvcard/property/Address;->setExtendedAddress(Ljava/lang/String;)V

    .line 129
    const-string v4, "street-address"

    invoke-virtual {p1, v4}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lezvcard/property/Address;->setStreetAddress(Ljava/lang/String;)V

    .line 130
    const-string v4, "locality"

    invoke-virtual {p1, v4}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lezvcard/property/Address;->setLocality(Ljava/lang/String;)V

    .line 131
    const-string v4, "region"

    invoke-virtual {p1, v4}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lezvcard/property/Address;->setRegion(Ljava/lang/String;)V

    .line 132
    const-string v4, "postal-code"

    invoke-virtual {p1, v4}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lezvcard/property/Address;->setPostalCode(Ljava/lang/String;)V

    .line 133
    const-string v4, "country-name"

    invoke-virtual {p1, v4}, Lezvcard/io/html/HCardElement;->firstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lezvcard/property/Address;->setCountry(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->types()Ljava/util/List;

    move-result-object v3

    .line 136
    .local v3, "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 137
    .local v2, "type":Ljava/lang/String;
    invoke-virtual {v1}, Lezvcard/property/Address;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v4

    invoke-virtual {v4, v2}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    goto :goto_0

    .line 140
    .end local v2    # "type":Ljava/lang/String;
    :cond_0
    return-object v1
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 43
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/AddressScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Address;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Address;
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
            "Lezvcard/property/Address;"
        }
    .end annotation

    .prologue
    .line 160
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/Address;

    invoke-direct {v1}, Lezvcard/property/Address;-><init>()V

    .line 161
    .local v1, "property":Lezvcard/property/Address;
    invoke-static {p1}, Lezvcard/io/scribe/AddressScribe;->structured(Lezvcard/io/json/JCardValue;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    move-result-object v0

    .line 163
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setPoBox(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setExtendedAddress(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setStreetAddress(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setLocality(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setRegion(Ljava/lang/String;)V

    .line 168
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setPostalCode(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setCountry(Ljava/lang/String;)V

    .line 171
    return-object v1
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 43
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/AddressScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Address;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Address;
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
            "Lezvcard/property/Address;"
        }
    .end annotation

    .prologue
    .line 81
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/Address;

    invoke-direct {v1}, Lezvcard/property/Address;-><init>()V

    .line 82
    .local v1, "property":Lezvcard/property/Address;
    invoke-static {p1}, Lezvcard/io/scribe/AddressScribe;->structured(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;

    move-result-object v0

    .line 84
    .local v0, "it":Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setPoBox(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setExtendedAddress(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setStreetAddress(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setLocality(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setRegion(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setPostalCode(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lezvcard/property/Address;->setCountry(Ljava/lang/String;)V

    .line 92
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
    .line 43
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/AddressScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Address;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Address;
    .locals 2
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
            "Lezvcard/property/Address;"
        }
    .end annotation

    .prologue
    .line 108
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Lezvcard/property/Address;

    invoke-direct {v0}, Lezvcard/property/Address;-><init>()V

    .line 109
    .local v0, "property":Lezvcard/property/Address;
    const-string v1, "pobox"

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/AddressScribe;->sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Address;->setPoBox(Ljava/lang/String;)V

    .line 110
    const-string v1, "ext"

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/AddressScribe;->sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Address;->setExtendedAddress(Ljava/lang/String;)V

    .line 111
    const-string v1, "street"

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/AddressScribe;->sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Address;->setStreetAddress(Ljava/lang/String;)V

    .line 112
    const-string v1, "locality"

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/AddressScribe;->sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Address;->setLocality(Ljava/lang/String;)V

    .line 113
    const-string v1, "region"

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/AddressScribe;->sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Address;->setRegion(Ljava/lang/String;)V

    .line 114
    const-string v1, "code"

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/AddressScribe;->sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Address;->setPostalCode(Ljava/lang/String;)V

    .line 115
    const-string v1, "country"

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/AddressScribe;->sanitizeXml(Lezvcard/io/xml/XCardElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Address;->setCountry(Ljava/lang/String;)V

    .line 116
    return-object v0
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 43
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/AddressScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Address;

    move-result-object v0

    return-object v0
.end method

.method protected _prepareParameters(Lezvcard/property/Address;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 1
    .param p1, "property"    # Lezvcard/property/Address;
    .param p2, "copy"    # Lezvcard/parameter/VCardParameters;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 55
    invoke-static {p1, p2, p3, p4}, Lezvcard/io/scribe/AddressScribe;->handlePrefParam(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    .line 57
    sget-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-eq p3, v0, :cond_0

    sget-object v0, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    if-ne p3, v0, :cond_1

    .line 60
    :cond_0
    const-string v0, "LABEL"

    invoke-virtual {p2, v0}, Lezvcard/parameter/VCardParameters;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    :cond_1
    return-void
.end method

.method protected bridge synthetic _prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/VCard;

    .prologue
    .line 43
    check-cast p1, Lezvcard/property/Address;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/AddressScribe;->_prepareParameters(Lezvcard/property/Address;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    return-void
.end method

.method protected _writeJson(Lezvcard/property/Address;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Address;

    .prologue
    .line 146
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lezvcard/property/Address;->getPoBox()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lezvcard/property/Address;->getExtendedAddress()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1}, Lezvcard/property/Address;->getStreetAddress()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1}, Lezvcard/property/Address;->getLocality()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-virtual {p1}, Lezvcard/property/Address;->getRegion()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    invoke-virtual {p1}, Lezvcard/property/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    invoke-virtual {p1}, Lezvcard/property/Address;->getCountry()Ljava/lang/String;

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
    .line 43
    check-cast p1, Lezvcard/property/Address;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/AddressScribe;->_writeJson(Lezvcard/property/Address;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Address;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Address;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 67
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lezvcard/property/Address;->getPoBox()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p1}, Lezvcard/property/Address;->getExtendedAddress()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-virtual {p1}, Lezvcard/property/Address;->getStreetAddress()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-virtual {p1}, Lezvcard/property/Address;->getLocality()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    invoke-virtual {p1}, Lezvcard/property/Address;->getRegion()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    invoke-virtual {p1}, Lezvcard/property/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    invoke-virtual {p1}, Lezvcard/property/Address;->getCountry()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lezvcard/io/scribe/AddressScribe;->structured([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 43
    check-cast p1, Lezvcard/property/Address;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/AddressScribe;->_writeText(Lezvcard/property/Address;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Address;Lezvcard/io/xml/XCardElement;)V
    .locals 2
    .param p1, "property"    # Lezvcard/property/Address;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 97
    const-string v0, "pobox"

    invoke-virtual {p1}, Lezvcard/property/Address;->getPoBox()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 98
    const-string v0, "ext"

    invoke-virtual {p1}, Lezvcard/property/Address;->getExtendedAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 99
    const-string v0, "street"

    invoke-virtual {p1}, Lezvcard/property/Address;->getStreetAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 100
    const-string v0, "locality"

    invoke-virtual {p1}, Lezvcard/property/Address;->getLocality()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 101
    const-string v0, "region"

    invoke-virtual {p1}, Lezvcard/property/Address;->getRegion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 102
    const-string v0, "code"

    invoke-virtual {p1}, Lezvcard/property/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 103
    const-string v0, "country"

    invoke-virtual {p1}, Lezvcard/property/Address;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 104
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 43
    check-cast p1, Lezvcard/property/Address;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/AddressScribe;->_writeXml(Lezvcard/property/Address;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
