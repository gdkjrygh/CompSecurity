.class public Lezvcard/io/scribe/TimezoneScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "TimezoneScribe.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/scribe/TimezoneScribe$1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Timezone;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 47
    const-class v0, Lezvcard/property/Timezone;

    const-string v1, "TZ"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 48
    return-void
.end method

.method private offsetFromTimezone(Ljava/util/TimeZone;)Lezvcard/util/UtcOffset;
    .locals 10
    .param p1, "timezone"    # Ljava/util/TimeZone;

    .prologue
    const-wide/16 v8, 0x3e8

    const-wide/16 v6, 0x3c

    .line 231
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v4

    int-to-long v2, v4

    .line 232
    .local v2, "offsetMs":J
    div-long v4, v2, v8

    div-long/2addr v4, v6

    div-long/2addr v4, v6

    long-to-int v0, v4

    .line 233
    .local v0, "hours":I
    div-long v4, v2, v8

    div-long/2addr v4, v6

    rem-long/2addr v4, v6

    long-to-int v1, v4

    .line 234
    .local v1, "minutes":I
    if-gez v1, :cond_0

    .line 235
    mul-int/lit8 v1, v1, -0x1

    .line 237
    :cond_0
    new-instance v4, Lezvcard/util/UtcOffset;

    invoke-direct {v4, v0, v1}, Lezvcard/util/UtcOffset;-><init>(II)V

    return-object v4
.end method

.method private parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/Timezone;
    .locals 4
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/VCardVersion;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Timezone;"
        }
    .end annotation

    .prologue
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .line 203
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 204
    :cond_0
    new-instance v2, Lezvcard/property/Timezone;

    check-cast v1, Ljava/lang/String;

    invoke-direct {v2, v1}, Lezvcard/property/Timezone;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    .line 227
    :goto_0
    return-object v1

    .line 207
    :cond_1
    sget-object v2, Lezvcard/io/scribe/TimezoneScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p3}, Lezvcard/VCardVersion;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 227
    new-instance v2, Lezvcard/property/Timezone;

    check-cast v1, Ljava/lang/String;

    invoke-direct {v2, v1}, Lezvcard/property/Timezone;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    goto :goto_0

    .line 211
    :pswitch_0
    :try_start_0
    new-instance v1, Lezvcard/property/Timezone;

    invoke-static {p1}, Lezvcard/util/UtcOffset;->parse(Ljava/lang/String;)Lezvcard/util/UtcOffset;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 212
    :catch_0
    move-exception v0

    .line 213
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v1, Lezvcard/io/CannotParseException;

    const-string v2, "Unable to parse UTC offset."

    invoke-direct {v1, v2}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 218
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :pswitch_1
    :try_start_1
    new-instance v1, Lezvcard/property/Timezone;

    invoke-static {p1}, Lezvcard/util/UtcOffset;->parse(Ljava/lang/String;)Lezvcard/util/UtcOffset;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 219
    :catch_1
    move-exception v0

    .line 220
    .restart local v0    # "e":Ljava/lang/IllegalArgumentException;
    sget-object v1, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    if-ne p2, v1, :cond_2

    .line 221
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse UTC offset.  Treating as text: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    :cond_2
    new-instance v1, Lezvcard/property/Timezone;

    invoke-direct {v1, p1}, Lezvcard/property/Timezone;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 207
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private timezoneFromId(Ljava/lang/String;)Ljava/util/TimeZone;
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 241
    invoke-static {p1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    .line 242
    .local v0, "timezone":Ljava/util/TimeZone;
    const-string v1, "GMT"

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .end local v0    # "timezone":Ljava/util/TimeZone;
    :cond_0
    return-object v0
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/Timezone;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 4
    .param p1, "property"    # Lezvcard/property/Timezone;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 64
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getText()Ljava/lang/String;

    move-result-object v1

    .line 65
    .local v1, "text":Ljava/lang/String;
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getOffset()Lezvcard/util/UtcOffset;

    move-result-object v0

    .line 67
    .local v0, "offset":Lezvcard/util/UtcOffset;
    sget-object v2, Lezvcard/io/scribe/TimezoneScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 88
    :cond_0
    invoke-virtual {p0, p2}, Lezvcard/io/scribe/TimezoneScribe;->_defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v2

    :goto_0
    return-object v2

    .line 69
    :pswitch_0
    sget-object v2, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    goto :goto_0

    .line 71
    :pswitch_1
    if-eqz v0, :cond_1

    .line 72
    sget-object v2, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    goto :goto_0

    .line 74
    :cond_1
    if-eqz v1, :cond_0

    .line 75
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    goto :goto_0

    .line 79
    :pswitch_2
    if-eqz v1, :cond_2

    .line 80
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    goto :goto_0

    .line 82
    :cond_2
    if-eqz v0, :cond_0

    .line 83
    sget-object v2, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    goto :goto_0

    .line 67
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 45
    check-cast p1, Lezvcard/property/Timezone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TimezoneScribe;->_dataType(Lezvcard/property/Timezone;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 2
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 52
    sget-object v0, Lezvcard/io/scribe/TimezoneScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p1}, Lezvcard/VCardVersion;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 59
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 55
    :pswitch_0
    sget-object v0, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    goto :goto_0

    .line 57
    :pswitch_1
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    goto :goto_0

    .line 52
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Timezone;
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
            "Lezvcard/property/Timezone;"
        }
    .end annotation

    .prologue
    .line 178
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    invoke-direct {p0, v0, v1, v2, p2}, Lezvcard/io/scribe/TimezoneScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/Timezone;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 45
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TimezoneScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Timezone;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Timezone;
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
            ">;)",
            "Lezvcard/property/Timezone;"
        }
    .end annotation

    .prologue
    .line 198
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v0

    .line 199
    .local v0, "valueStr":Ljava/lang/String;
    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-direct {p0, v0, p2, v1, p4}, Lezvcard/io/scribe/TimezoneScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/Timezone;

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
    .line 45
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/TimezoneScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Timezone;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Timezone;
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
            ">;)",
            "Lezvcard/property/Timezone;"
        }
    .end annotation

    .prologue
    .line 136
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/TimezoneScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 137
    invoke-direct {p0, p1, p2, p3, p5}, Lezvcard/io/scribe/TimezoneScribe;->parse(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/Timezone;

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
    .line 45
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/TimezoneScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Timezone;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Timezone;
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
            "Lezvcard/property/Timezone;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 159
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v1

    .line 160
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 161
    new-instance v3, Lezvcard/property/Timezone;

    invoke-direct {v3, v1}, Lezvcard/property/Timezone;-><init>(Ljava/lang/String;)V

    .line 167
    :goto_0
    return-object v3

    .line 164
    :cond_0
    new-array v3, v6, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    invoke-virtual {p1, v3}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v2

    .line 165
    .local v2, "utcOffset":Ljava/lang/String;
    if-eqz v2, :cond_1

    .line 167
    :try_start_0
    new-instance v3, Lezvcard/property/Timezone;

    invoke-static {v2}, Lezvcard/util/UtcOffset;->parse(Ljava/lang/String;)Lezvcard/util/UtcOffset;

    move-result-object v4

    invoke-direct {v3, v4}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 168
    :catch_0
    move-exception v0

    .line 169
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v3, Lezvcard/io/CannotParseException;

    const-string v4, "Unable to parse UTC offset."

    invoke-direct {v3, v4}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 173
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :cond_1
    const/4 v3, 0x2

    new-array v3, v3, [Lezvcard/VCardDataType;

    sget-object v4, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v4, v3, v5

    sget-object v4, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    aput-object v4, v3, v6

    invoke-static {v3}, Lezvcard/io/scribe/TimezoneScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v3

    throw v3
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 45
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/TimezoneScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Timezone;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Timezone;)Lezvcard/io/json/JCardValue;
    .locals 3
    .param p1, "property"    # Lezvcard/property/Timezone;

    .prologue
    .line 183
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getText()Ljava/lang/String;

    move-result-object v1

    .line 184
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 185
    invoke-static {v1}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    .line 193
    :goto_0
    return-object v2

    .line 188
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getOffset()Lezvcard/util/UtcOffset;

    move-result-object v0

    .line 189
    .local v0, "offset":Lezvcard/util/UtcOffset;
    if-eqz v0, :cond_1

    .line 190
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v2

    goto :goto_0

    .line 193
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
    .line 45
    check-cast p1, Lezvcard/property/Timezone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/TimezoneScribe;->_writeJson(Lezvcard/property/Timezone;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Timezone;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 7
    .param p1, "property"    # Lezvcard/property/Timezone;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    const/4 v6, 0x0

    .line 93
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getText()Ljava/lang/String;

    move-result-object v1

    .line 94
    .local v1, "text":Ljava/lang/String;
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getOffset()Lezvcard/util/UtcOffset;

    move-result-object v0

    .line 96
    .local v0, "offset":Lezvcard/util/UtcOffset;
    sget-object v4, Lezvcard/io/scribe/TimezoneScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 131
    :cond_0
    const-string v4, ""

    :goto_0
    return-object v4

    .line 98
    :pswitch_0
    if-eqz v0, :cond_1

    .line 99
    invoke-virtual {v0, v6}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 102
    :cond_1
    if-eqz v1, :cond_0

    .line 104
    invoke-direct {p0, v1}, Lezvcard/io/scribe/TimezoneScribe;->timezoneFromId(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    .line 105
    .local v2, "timezone":Ljava/util/TimeZone;
    if-eqz v2, :cond_0

    .line 106
    invoke-direct {p0, v2}, Lezvcard/io/scribe/TimezoneScribe;->offsetFromTimezone(Ljava/util/TimeZone;)Lezvcard/util/UtcOffset;

    move-result-object v3

    .line 107
    .local v3, "tzOffset":Lezvcard/util/UtcOffset;
    invoke-virtual {v3, v6}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 112
    .end local v2    # "timezone":Ljava/util/TimeZone;
    .end local v3    # "tzOffset":Lezvcard/util/UtcOffset;
    :pswitch_1
    if-eqz v0, :cond_2

    .line 113
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 116
    :cond_2
    if-eqz v1, :cond_0

    .line 117
    invoke-static {v1}, Lezvcard/io/scribe/TimezoneScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 121
    :pswitch_2
    if-eqz v1, :cond_3

    .line 122
    invoke-static {v1}, Lezvcard/io/scribe/TimezoneScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 125
    :cond_3
    if-eqz v0, :cond_0

    .line 126
    invoke-virtual {v0, v6}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 96
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 45
    check-cast p1, Lezvcard/property/Timezone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TimezoneScribe;->_writeText(Lezvcard/property/Timezone;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Timezone;Lezvcard/io/xml/XCardElement;)V
    .locals 4
    .param p1, "property"    # Lezvcard/property/Timezone;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 142
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getText()Ljava/lang/String;

    move-result-object v1

    .line 143
    .local v1, "text":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 144
    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p2, v2, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 155
    :goto_0
    return-void

    .line 148
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/Timezone;->getOffset()Lezvcard/util/UtcOffset;

    move-result-object v0

    .line 149
    .local v0, "offset":Lezvcard/util/UtcOffset;
    if-eqz v0, :cond_1

    .line 150
    sget-object v2, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_0

    .line 154
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
    .line 45
    check-cast p1, Lezvcard/property/Timezone;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/TimezoneScribe;->_writeXml(Lezvcard/property/Timezone;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method
