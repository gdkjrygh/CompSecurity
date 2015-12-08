.class public abstract Lezvcard/io/scribe/BinaryPropertyScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "BinaryPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/scribe/BinaryPropertyScribe$1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/property/BinaryProperty",
        "<TU;>;U:",
        "Lezvcard/parameter/MediaTypeParameter;",
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
    .line 52
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0, p1, p2}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method private parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/BinaryProperty;
    .locals 5
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p4, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/parameter/VCardParameters;",
            "Lezvcard/VCardVersion;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 267
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0, p3, p4}, Lezvcard/io/scribe/BinaryPropertyScribe;->parseContentType(Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;)Lezvcard/parameter/MediaTypeParameter;

    move-result-object v0

    .line 269
    .local v0, "contentType":Lezvcard/parameter/MediaTypeParameter;, "TU;"
    sget-object v3, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p4}, Lezvcard/VCardVersion;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 296
    :cond_0
    :goto_0
    invoke-virtual {p0, p1, p4, p5, v0}, Lezvcard/io/scribe/BinaryPropertyScribe;->cannotUnmarshalValue(Ljava/lang/String;Lezvcard/VCardVersion;Ljava/util/List;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;

    move-result-object v3

    :goto_1
    return-object v3

    .line 273
    :pswitch_0
    sget-object v3, Lezvcard/VCardDataType;->URL:Lezvcard/VCardDataType;

    if-eq p2, v3, :cond_1

    sget-object v3, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    if-ne p2, v3, :cond_2

    .line 274
    :cond_1
    invoke-virtual {p0, p1, v0}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;

    move-result-object v3

    goto :goto_1

    .line 278
    :cond_2
    invoke-virtual {p3}, Lezvcard/parameter/VCardParameters;->getEncoding()Lezvcard/parameter/Encoding;

    move-result-object v1

    .line 279
    .local v1, "encodingSubType":Lezvcard/parameter/Encoding;
    sget-object v3, Lezvcard/parameter/Encoding;->BASE64:Lezvcard/parameter/Encoding;

    if-eq v1, v3, :cond_3

    sget-object v3, Lezvcard/parameter/Encoding;->B:Lezvcard/parameter/Encoding;

    if-ne v1, v3, :cond_0

    .line 280
    :cond_3
    invoke-static {p1}, Lezvcard/util/org/apache/commons/codec/binary/Base64;->decodeBase64(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance([BLezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;

    move-result-object v3

    goto :goto_1

    .line 287
    .end local v1    # "encodingSubType":Lezvcard/parameter/Encoding;
    :pswitch_1
    :try_start_0
    new-instance v2, Lezvcard/util/DataUri;

    invoke-direct {v2, p1}, Lezvcard/util/DataUri;-><init>(Ljava/lang/String;)V

    .line 288
    .local v2, "uri":Lezvcard/util/DataUri;
    invoke-virtual {v2}, Lezvcard/util/DataUri;->getContentType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lezvcard/io/scribe/BinaryPropertyScribe;->_buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;

    move-result-object v0

    .line 289
    invoke-virtual {v2}, Lezvcard/util/DataUri;->getData()[B

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance([BLezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_1

    .line 290
    .end local v2    # "uri":Lezvcard/util/DataUri;
    :catch_0
    move-exception v3

    goto :goto_0

    .line 269
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private write(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 6
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
    .line 300
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p1, "property":Lezvcard/property/BinaryProperty;, "TT;"
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getUrl()Ljava/lang/String;

    move-result-object v3

    .line 301
    .local v3, "url":Ljava/lang/String;
    if-eqz v3, :cond_0

    .line 318
    .end local v3    # "url":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 305
    .restart local v3    # "url":Ljava/lang/String;
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getData()[B

    move-result-object v1

    .line 306
    .local v1, "data":[B
    if-eqz v1, :cond_1

    .line 307
    sget-object v4, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 318
    :cond_1
    const-string v3, ""

    goto :goto_0

    .line 310
    :pswitch_0
    new-instance v3, Ljava/lang/String;

    .end local v3    # "url":Ljava/lang/String;
    invoke-static {v1}, Lezvcard/util/org/apache/commons/codec/binary/Base64;->encodeBase64([B)[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    goto :goto_0

    .line 312
    .restart local v3    # "url":Ljava/lang/String;
    :pswitch_1
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getContentType()Lezvcard/parameter/MediaTypeParameter;

    move-result-object v0

    .line 313
    .local v0, "contentType":Lezvcard/parameter/MediaTypeParameter;, "TU;"
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeParameter;->getMediaType()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    :cond_2
    const-string v2, "application/octet-stream"

    .line 314
    .local v2, "mediaType":Ljava/lang/String;
    :goto_1
    new-instance v4, Lezvcard/util/DataUri;

    invoke-direct {v4, v2, v1}, Lezvcard/util/DataUri;-><init>(Ljava/lang/String;[B)V

    invoke-virtual {v4}, Lezvcard/util/DataUri;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 313
    .end local v2    # "mediaType":Ljava/lang/String;
    :cond_3
    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeParameter;->getMediaType()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 307
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method protected abstract _buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TU;"
        }
    .end annotation
.end method

.method protected abstract _buildTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TU;"
        }
    .end annotation
.end method

.method protected _dataType(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 2
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/VCardVersion;",
            ")",
            "Lezvcard/VCardDataType;"
        }
    .end annotation

    .prologue
    .line 69
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p1, "property":Lezvcard/property/BinaryProperty;, "TT;"
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    sget-object v0, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 79
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getData()[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 80
    sget-object v0, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    .line 89
    :cond_1
    invoke-virtual {p0, p2}, Lezvcard/io/scribe/BinaryPropertyScribe;->_defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    :goto_0
    return-object v0

    .line 72
    :pswitch_0
    sget-object v0, Lezvcard/VCardDataType;->URL:Lezvcard/VCardDataType;

    goto :goto_0

    .line 75
    :pswitch_1
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    goto :goto_0

    .line 83
    :pswitch_2
    const/4 v0, 0x0

    goto :goto_0

    .line 85
    :pswitch_3
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    goto :goto_0

    .line 70
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 80
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    check-cast p1, Lezvcard/property/BinaryProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/BinaryPropertyScribe;->_dataType(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 3
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    const/4 v0, 0x0

    .line 57
    sget-object v1, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p1}, Lezvcard/VCardVersion;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 64
    :goto_0
    :pswitch_0
    return-object v0

    .line 62
    :pswitch_1
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    goto :goto_0

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected abstract _newInstance(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TU;)TT;"
        }
    .end annotation
.end method

.method protected abstract _newInstance([BLezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BTU;)TT;"
        }
    .end annotation
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/BinaryProperty;
    .locals 9
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
    .line 165
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->tagName()Ljava/lang/String;

    move-result-object v2

    .line 166
    .local v2, "elementName":Ljava/lang/String;
    const-string v6, "object"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 167
    new-instance v6, Lezvcard/io/CannotParseException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Cannot parse <"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "> tag (<object> tag expected)."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 170
    :cond_0
    const-string v6, "data"

    invoke-virtual {p1, v6}, Lezvcard/io/html/HCardElement;->absUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 171
    .local v0, "data":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_1

    .line 172
    new-instance v6, Lezvcard/io/CannotParseException;

    const-string v7, "<object> tag does not have a \"data\" attribute."

    invoke-direct {v6, v7}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 176
    :cond_1
    :try_start_0
    new-instance v5, Lezvcard/util/DataUri;

    invoke-direct {v5, v0}, Lezvcard/util/DataUri;-><init>(Ljava/lang/String;)V

    .line 177
    .local v5, "uri":Lezvcard/util/DataUri;
    invoke-virtual {v5}, Lezvcard/util/DataUri;->getContentType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lezvcard/io/scribe/BinaryPropertyScribe;->_buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;

    move-result-object v3

    .line 179
    .local v3, "mediaType":Lezvcard/parameter/MediaTypeParameter;, "TU;"
    invoke-virtual {v5}, Lezvcard/util/DataUri;->getData()[B

    move-result-object v6

    invoke-virtual {p0, v6, v3}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance([BLezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 188
    .end local v5    # "uri":Lezvcard/util/DataUri;
    :goto_0
    return-object v6

    .line 180
    .end local v3    # "mediaType":Lezvcard/parameter/MediaTypeParameter;, "TU;"
    :catch_0
    move-exception v1

    .line 182
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    const/4 v3, 0x0

    .line 183
    .restart local v3    # "mediaType":Lezvcard/parameter/MediaTypeParameter;, "TU;"
    const-string v6, "type"

    invoke-virtual {p1, v6}, Lezvcard/io/html/HCardElement;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 184
    .local v4, "type":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_2

    .line 185
    invoke-virtual {p0, v4}, Lezvcard/io/scribe/BinaryPropertyScribe;->_buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;

    move-result-object v3

    .line 188
    :cond_2
    invoke-virtual {p0, v0, v3}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;

    move-result-object v6

    goto :goto_0
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/BinaryPropertyScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/BinaryProperty;
    .locals 6
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
    .line 199
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v1

    .line 200
    .local v1, "valueStr":Ljava/lang/String;
    sget-object v4, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lezvcard/io/scribe/BinaryPropertyScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/BinaryPropertyScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/BinaryProperty;
    .locals 6
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
    .line 144
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/BinaryPropertyScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p3

    move-object v5, p5

    .line 145
    invoke-direct/range {v0 .. v5}, Lezvcard/io/scribe/BinaryPropertyScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/BinaryProperty;

    move-result-object v0

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
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/BinaryPropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/BinaryProperty;
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
            ">;)TT;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 155
    new-array v0, v4, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v2, v0, v3

    invoke-virtual {p1, v0}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v1

    .line 156
    .local v1, "value":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 157
    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p1}, Lezvcard/io/xml/XCardElement;->version()Lezvcard/VCardVersion;

    move-result-object v4

    move-object v0, p0

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lezvcard/io/scribe/BinaryPropertyScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    return-object v0

    .line 160
    :cond_0
    new-array v0, v4, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v2, v0, v3

    invoke-static {v0}, Lezvcard/io/scribe/BinaryPropertyScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v0

    throw v0
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/BinaryPropertyScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _prepareParameters(Lezvcard/property/BinaryProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 4
    .param p2, "copy"    # Lezvcard/parameter/VCardParameters;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/parameter/VCardParameters;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p1, "property":Lezvcard/property/BinaryProperty;, "TT;"
    const/4 v3, 0x0

    .line 94
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getContentType()Lezvcard/parameter/MediaTypeParameter;

    move-result-object v0

    .line 95
    .local v0, "contentType":Lezvcard/parameter/MediaTypeParameter;
    if-nez v0, :cond_0

    .line 96
    new-instance v0, Lezvcard/parameter/MediaTypeParameter;

    .end local v0    # "contentType":Lezvcard/parameter/MediaTypeParameter;
    invoke-direct {v0, v3, v3, v3}, Lezvcard/parameter/MediaTypeParameter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .restart local v0    # "contentType":Lezvcard/parameter/MediaTypeParameter;
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 100
    invoke-virtual {p2, v3}, Lezvcard/parameter/VCardParameters;->setEncoding(Lezvcard/parameter/Encoding;)V

    .line 102
    sget-object v1, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p3}, Lezvcard/VCardVersion;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 117
    :cond_1
    invoke-virtual {p1}, Lezvcard/property/BinaryProperty;->getData()[B

    move-result-object v1

    if-eqz v1, :cond_2

    .line 118
    invoke-virtual {p2, v3}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    .line 120
    sget-object v1, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p3}, Lezvcard/VCardVersion;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    .line 135
    :cond_2
    :goto_0
    return-void

    .line 104
    :pswitch_0
    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeParameter;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p2, v3}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    goto :goto_0

    .line 108
    :pswitch_1
    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeParameter;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    .line 109
    invoke-virtual {p2, v3}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    goto :goto_0

    .line 112
    :pswitch_2
    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeParameter;->getMediaType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    goto :goto_0

    .line 122
    :pswitch_3
    sget-object v1, Lezvcard/parameter/Encoding;->BASE64:Lezvcard/parameter/Encoding;

    invoke-virtual {p2, v1}, Lezvcard/parameter/VCardParameters;->setEncoding(Lezvcard/parameter/Encoding;)V

    .line 123
    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeParameter;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    goto :goto_0

    .line 126
    :pswitch_4
    sget-object v1, Lezvcard/parameter/Encoding;->B:Lezvcard/parameter/Encoding;

    invoke-virtual {p2, v1}, Lezvcard/parameter/VCardParameters;->setEncoding(Lezvcard/parameter/Encoding;)V

    .line 127
    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeParameter;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    goto :goto_0

    .line 130
    :pswitch_5
    invoke-virtual {p2, v3}, Lezvcard/parameter/VCardParameters;->setEncoding(Lezvcard/parameter/Encoding;)V

    goto :goto_0

    .line 102
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 120
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method protected bridge synthetic _prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/VCard;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    check-cast p1, Lezvcard/property/BinaryProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/BinaryPropertyScribe;->_prepareParameters(Lezvcard/property/BinaryProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    return-void
.end method

.method protected _writeJson(Lezvcard/property/BinaryProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lezvcard/io/json/JCardValue;"
        }
    .end annotation

    .prologue
    .line 194
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p1, "property":Lezvcard/property/BinaryProperty;, "TT;"
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-direct {p0, p1, v0}, Lezvcard/io/scribe/BinaryPropertyScribe;->write(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    check-cast p1, Lezvcard/property/BinaryProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/BinaryPropertyScribe;->_writeJson(Lezvcard/property/BinaryProperty;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
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
    .line 139
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p1, "property":Lezvcard/property/BinaryProperty;, "TT;"
    invoke-direct {p0, p1, p2}, Lezvcard/io/scribe/BinaryPropertyScribe;->write(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    check-cast p1, Lezvcard/property/BinaryProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/BinaryPropertyScribe;->_writeText(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/BinaryProperty;Lezvcard/io/xml/XCardElement;)V
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
    .line 150
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p1, "property":Lezvcard/property/BinaryProperty;, "TT;"
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p2}, Lezvcard/io/xml/XCardElement;->version()Lezvcard/VCardVersion;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lezvcard/io/scribe/BinaryPropertyScribe;->write(Lezvcard/property/BinaryProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 151
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 50
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    check-cast p1, Lezvcard/property/BinaryProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/BinaryPropertyScribe;->_writeXml(Lezvcard/property/BinaryProperty;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method

.method protected cannotUnmarshalValue(Ljava/lang/String;Lezvcard/VCardVersion;Ljava/util/List;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;
    .locals 2
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardVersion;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;TU;)TT;"
        }
    .end annotation

    .prologue
    .line 212
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .local p4, "contentType":Lezvcard/parameter/MediaTypeParameter;, "TU;"
    sget-object v0, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 222
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 215
    :pswitch_0
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    invoke-virtual {p0, p1, p4}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    goto :goto_0

    .line 218
    :cond_0
    invoke-static {p1}, Lezvcard/util/org/apache/commons/codec/binary/Base64;->decodeBase64(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, v0, p4}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance([BLezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    goto :goto_0

    .line 220
    :pswitch_1
    invoke-virtual {p0, p1, p4}, Lezvcard/io/scribe/BinaryPropertyScribe;->_newInstance(Ljava/lang/String;Lezvcard/parameter/MediaTypeParameter;)Lezvcard/property/BinaryProperty;

    move-result-object v0

    goto :goto_0

    .line 212
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected parseContentType(Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;)Lezvcard/parameter/MediaTypeParameter;
    .locals 4
    .param p1, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/parameter/VCardParameters;",
            "Lezvcard/VCardVersion;",
            ")TU;"
        }
    .end annotation

    .prologue
    .line 246
    .local p0, "this":Lezvcard/io/scribe/BinaryPropertyScribe;, "Lezvcard/io/scribe/BinaryPropertyScribe<TT;TU;>;"
    sget-object v2, Lezvcard/io/scribe/BinaryPropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 263
    :cond_0
    const/4 v2, 0x0

    :goto_0
    return-object v2

    .line 250
    :pswitch_0
    invoke-virtual {p1}, Lezvcard/parameter/VCardParameters;->getType()Ljava/lang/String;

    move-result-object v1

    .line 251
    .local v1, "type":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 252
    invoke-virtual {p0, v1}, Lezvcard/io/scribe/BinaryPropertyScribe;->_buildTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;

    move-result-object v2

    goto :goto_0

    .line 257
    .end local v1    # "type":Ljava/lang/String;
    :pswitch_1
    invoke-virtual {p1}, Lezvcard/parameter/VCardParameters;->getMediaType()Ljava/lang/String;

    move-result-object v0

    .line 258
    .local v0, "mediaType":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 259
    invoke-virtual {p0, v0}, Lezvcard/io/scribe/BinaryPropertyScribe;->_buildMediaTypeObj(Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;

    move-result-object v2

    goto :goto_0

    .line 246
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
