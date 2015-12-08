.class public abstract Lezvcard/io/scribe/SimplePropertyScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "SimplePropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/property/VCardProperty;",
        ">",
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<TT;>;"
    }
.end annotation


# instance fields
.field protected final dataType:Lezvcard/VCardDataType;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Lezvcard/VCardDataType;)V
    .locals 0
    .param p2, "propertyName"    # Ljava/lang/String;
    .param p3, "dataType"    # Lezvcard/VCardDataType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            ")V"
        }
    .end annotation

    .prologue
    .line 48
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0, p1, p2}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 49
    iput-object p3, p0, Lezvcard/io/scribe/SimplePropertyScribe;->dataType:Lezvcard/VCardDataType;

    .line 50
    return-void
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 54
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    iget-object v0, p0, Lezvcard/io/scribe/SimplePropertyScribe;->dataType:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 2
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 86
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v0

    .line 87
    .local v0, "value":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lezvcard/io/scribe/SimplePropertyScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;

    move-result-object v1

    return-object v1
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
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
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 102
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v0

    .line 103
    .local v0, "valueStr":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lezvcard/io/scribe/SimplePropertyScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;

    move-result-object v1

    return-object v1
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
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
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 65
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/SimplePropertyScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/SimplePropertyScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;

    move-result-object v0

    return-object v0
.end method

.method protected abstract _parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
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
            ">;)TT;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 76
    new-array v1, v4, [Lezvcard/VCardDataType;

    iget-object v2, p0, Lezvcard/io/scribe/SimplePropertyScribe;->dataType:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v0

    .line 77
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {p0, v0}, Lezvcard/io/scribe/SimplePropertyScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;

    move-result-object v1

    return-object v1

    .line 81
    :cond_0
    new-array v1, v4, [Lezvcard/VCardDataType;

    iget-object v2, p0, Lezvcard/io/scribe/SimplePropertyScribe;->dataType:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    invoke-static {v1}, Lezvcard/io/scribe/VCardPropertyScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v1

    throw v1
.end method

.method protected _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lezvcard/io/json/JCardValue;"
        }
    .end annotation

    .prologue
    .line 92
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/SimplePropertyScribe;->_writeValue(Lezvcard/property/VCardProperty;)Ljava/lang/String;

    move-result-object v0

    .line 93
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 94
    const-string v0, ""

    .line 97
    :cond_0
    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v1

    return-object v1
.end method

.method protected _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 2
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/VCardVersion;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 59
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/SimplePropertyScribe;->_writeValue(Lezvcard/property/VCardProperty;)Ljava/lang/String;

    move-result-object v0

    .line 60
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    const-string v1, ""

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lezvcard/io/scribe/SimplePropertyScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method protected abstract _writeValue(Lezvcard/property/VCardProperty;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method protected _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 2
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/io/xml/XCardElement;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    .local p0, "this":Lezvcard/io/scribe/SimplePropertyScribe;, "Lezvcard/io/scribe/SimplePropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/VCardProperty;, "TT;"
    iget-object v0, p0, Lezvcard/io/scribe/SimplePropertyScribe;->dataType:Lezvcard/VCardDataType;

    invoke-virtual {p0, p1}, Lezvcard/io/scribe/SimplePropertyScribe;->_writeValue(Lezvcard/property/VCardProperty;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 72
    return-void
.end method
