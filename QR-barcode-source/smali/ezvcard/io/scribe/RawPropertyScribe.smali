.class public Lezvcard/io/scribe/RawPropertyScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "RawPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/RawProperty;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "propertyName"    # Ljava/lang/String;

    .prologue
    .line 41
    const-class v0, Lezvcard/property/RawProperty;

    invoke-direct {p0, v0, p1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 42
    return-void
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/RawProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "property"    # Lezvcard/property/RawProperty;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 51
    invoke-virtual {p1}, Lezvcard/property/RawProperty;->getDataType()Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 39
    check-cast p1, Lezvcard/property/RawProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RawPropertyScribe;->_dataType(Lezvcard/property/RawProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 46
    const/4 v0, 0x0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/RawProperty;
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
            "Lezvcard/property/RawProperty;"
        }
    .end annotation

    .prologue
    .line 62
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Lezvcard/property/RawProperty;

    iget-object v1, p0, Lezvcard/io/scribe/RawPropertyScribe;->propertyName:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lezvcard/property/RawProperty;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .local v0, "property":Lezvcard/property/RawProperty;
    invoke-virtual {v0, p2}, Lezvcard/property/RawProperty;->setDataType(Lezvcard/VCardDataType;)V

    .line 64
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
    .line 39
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/RawPropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/RawProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/RawProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "property"    # Lezvcard/property/RawProperty;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 56
    invoke-virtual {p1}, Lezvcard/property/RawProperty;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 57
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    const-string v0, ""

    .end local v0    # "value":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 39
    check-cast p1, Lezvcard/property/RawProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/RawPropertyScribe;->_writeText(Lezvcard/property/RawProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
