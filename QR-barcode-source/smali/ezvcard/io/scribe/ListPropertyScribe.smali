.class public abstract Lezvcard/io/scribe/ListPropertyScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "ListPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/property/TextListProperty;",
        ">",
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0
    .param p2, "propertyName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 44
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0, p1, p2}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 45
    return-void
.end method

.method private parse(Ljava/util/List;)Lezvcard/property/TextListProperty;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 95
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p1, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lezvcard/io/scribe/ListPropertyScribe;->_newInstance()Lezvcard/property/TextListProperty;

    move-result-object v0

    .line 96
    .local v0, "property":Lezvcard/property/TextListProperty;, "TT;"
    invoke-virtual {v0}, Lezvcard/property/TextListProperty;->getValues()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 97
    return-object v0
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 49
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected abstract _newInstance()Lezvcard/property/TextListProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/TextListProperty;
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
    .line 90
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asMulti()Ljava/util/List;

    move-result-object v0

    .line 91
    .local v0, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, v0}, Lezvcard/io/scribe/ListPropertyScribe;->parse(Ljava/util/List;)Lezvcard/property/TextListProperty;

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
    .line 42
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/ListPropertyScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/TextListProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/TextListProperty;
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
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 59
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/ListPropertyScribe;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 60
    .local v0, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, v0}, Lezvcard/io/scribe/ListPropertyScribe;->parse(Ljava/util/List;)Lezvcard/property/TextListProperty;

    move-result-object v1

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
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/ListPropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/TextListProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/TextListProperty;
    .locals 4
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
    .line 70
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->all(Lezvcard/VCardDataType;)Ljava/util/List;

    move-result-object v0

    .line 71
    .local v0, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 72
    invoke-direct {p0, v0}, Lezvcard/io/scribe/ListPropertyScribe;->parse(Ljava/util/List;)Lezvcard/property/TextListProperty;

    move-result-object v1

    return-object v1

    .line 75
    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [Lezvcard/VCardDataType;

    const/4 v2, 0x0

    sget-object v3, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v3, v1, v2

    invoke-static {v1}, Lezvcard/io/scribe/ListPropertyScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v1

    throw v1
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 42
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/ListPropertyScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/TextListProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/TextListProperty;)Lezvcard/io/json/JCardValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lezvcard/io/json/JCardValue;"
        }
    .end annotation

    .prologue
    .line 80
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/TextListProperty;, "TT;"
    invoke-virtual {p1}, Lezvcard/property/TextListProperty;->getValues()Ljava/util/List;

    move-result-object v0

    .line 81
    .local v0, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 82
    const-string v1, ""

    invoke-static {v1}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v1

    .line 85
    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lezvcard/io/json/JCardValue;->multi(Ljava/util/List;)Lezvcard/io/json/JCardValue;

    move-result-object v1

    goto :goto_0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 42
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/TextListProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/ListPropertyScribe;->_writeJson(Lezvcard/property/TextListProperty;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/TextListProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
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
    .line 54
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/TextListProperty;, "TT;"
    invoke-virtual {p1}, Lezvcard/property/TextListProperty;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lezvcard/io/scribe/ListPropertyScribe;->list(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 42
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/TextListProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/ListPropertyScribe;->_writeText(Lezvcard/property/TextListProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/TextListProperty;Lezvcard/io/xml/XCardElement;)V
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
    .line 65
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/TextListProperty;, "TT;"
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {v0}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lezvcard/property/TextListProperty;->getValues()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;

    .line 66
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 42
    .local p0, "this":Lezvcard/io/scribe/ListPropertyScribe;, "Lezvcard/io/scribe/ListPropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/TextListProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/ListPropertyScribe;->_writeXml(Lezvcard/property/TextListProperty;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
