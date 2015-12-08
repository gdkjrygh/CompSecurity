.class public Lezvcard/io/scribe/XmlScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "XmlScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Xml;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 53
    const-class v0, Lezvcard/property/Xml;

    const-string v1, "XML"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method private valueToString(Lorg/w3c/dom/Document;)Ljava/lang/String;
    .locals 3
    .param p1, "document"    # Lorg/w3c/dom/Document;

    .prologue
    .line 125
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 126
    .local v0, "props":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "omit-xml-declaration"

    const-string v2, "yes"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    invoke-static {p1, v0}, Lezvcard/util/XmlUtils;->toString(Lorg/w3c/dom/Node;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 58
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 51
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/XmlScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Xml;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Xml;
    .locals 5
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
            "Lezvcard/property/Xml;"
        }
    .end annotation

    .prologue
    .line 117
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v1

    .line 118
    .local v1, "xml":Ljava/lang/String;
    if-nez v1, :cond_0

    new-instance v3, Lezvcard/property/Xml;

    const/4 v2, 0x0

    check-cast v2, Lorg/w3c/dom/Document;

    invoke-direct {v3, v2}, Lezvcard/property/Xml;-><init>(Lorg/w3c/dom/Document;)V

    move-object v2, v3

    :goto_0
    return-object v2

    :cond_0
    new-instance v2, Lezvcard/property/Xml;

    invoke-direct {v2, v1}, Lezvcard/property/Xml;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 119
    .end local v1    # "xml":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 120
    .local v0, "e":Lorg/xml/sax/SAXException;
    new-instance v2, Lezvcard/io/CannotParseException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot parse value as XML: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method protected bridge synthetic _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/parameter/VCardParameters;
    .param p5, "x4"    # Ljava/util/List;

    .prologue
    .line 51
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/XmlScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Xml;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Xml;
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
            "Lezvcard/property/Xml;"
        }
    .end annotation

    .prologue
    .line 74
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/XmlScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 76
    :try_start_0
    new-instance v1, Lezvcard/property/Xml;

    invoke-direct {v1, p1}, Lezvcard/property/Xml;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 77
    :catch_0
    move-exception v0

    .line 78
    .local v0, "e":Lorg/xml/sax/SAXException;
    new-instance v1, Lezvcard/io/CannotParseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot parse value as XML: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 51
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/XmlScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Xml;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Xml;
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
            "Lezvcard/property/Xml;"
        }
    .end annotation

    .prologue
    .line 90
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v3, Lezvcard/property/Xml;

    invoke-virtual {p1}, Lezvcard/io/xml/XCardElement;->element()Lorg/w3c/dom/Element;

    move-result-object v4

    invoke-direct {v3, v4}, Lezvcard/property/Xml;-><init>(Lorg/w3c/dom/Element;)V

    .line 93
    .local v3, "xml":Lezvcard/property/Xml;
    invoke-virtual {v3}, Lezvcard/property/Xml;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/w3c/dom/Document;

    invoke-static {v4}, Lezvcard/util/XmlUtils;->getRootElement(Lorg/w3c/dom/Document;)Lorg/w3c/dom/Element;

    move-result-object v2

    .line 94
    .local v2, "root":Lorg/w3c/dom/Element;
    invoke-interface {v2}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v4

    invoke-static {v4}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 95
    .local v0, "child":Lorg/w3c/dom/Element;
    const-string v4, "parameters"

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {v4}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 96
    invoke-interface {v2, v0}, Lorg/w3c/dom/Element;->removeChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    goto :goto_0

    .line 100
    .end local v0    # "child":Lorg/w3c/dom/Element;
    :cond_1
    return-object v3
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 51
    check-cast p1, Lezvcard/property/Xml;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/XmlScribe;->_writeJson(Lezvcard/property/Xml;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Xml;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Xml;

    .prologue
    .line 105
    const/4 v1, 0x0

    .line 106
    .local v1, "xml":Ljava/lang/String;
    invoke-virtual {p1}, Lezvcard/property/Xml;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Document;

    .line 107
    .local v0, "value":Lorg/w3c/dom/Document;
    if-eqz v0, :cond_0

    .line 108
    invoke-direct {p0, v0}, Lezvcard/io/scribe/XmlScribe;->valueToString(Lorg/w3c/dom/Document;)Ljava/lang/String;

    move-result-object v1

    .line 111
    :cond_0
    invoke-static {v1}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    return-object v2
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 51
    check-cast p1, Lezvcard/property/Xml;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/XmlScribe;->_writeText(Lezvcard/property/Xml;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Xml;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Xml;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 63
    invoke-virtual {p1}, Lezvcard/property/Xml;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Document;

    .line 64
    .local v0, "value":Lorg/w3c/dom/Document;
    if-nez v0, :cond_0

    .line 65
    const-string v2, ""

    .line 69
    :goto_0
    return-object v2

    .line 68
    :cond_0
    invoke-direct {p0, v0}, Lezvcard/io/scribe/XmlScribe;->valueToString(Lorg/w3c/dom/Document;)Ljava/lang/String;

    move-result-object v1

    .line 69
    .local v1, "xml":Ljava/lang/String;
    invoke-static {v1}, Lezvcard/io/scribe/XmlScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 51
    check-cast p1, Lezvcard/property/Xml;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/XmlScribe;->_writeXml(Lezvcard/property/Xml;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method

.method protected _writeXml(Lezvcard/property/Xml;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "property"    # Lezvcard/property/Xml;
    .param p2, "element"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 85
    invoke-super {p0, p1, p2}, Lezvcard/io/scribe/VCardPropertyScribe;->_writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V

    .line 86
    return-void
.end method
