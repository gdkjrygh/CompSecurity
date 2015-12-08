.class public abstract Lezvcard/io/scribe/DateOrTimePropertyScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "DateOrTimePropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/scribe/DateOrTimePropertyScribe$1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/property/DateOrTimeProperty;",
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
    .line 48
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0, p1, p2}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 49
    return-void
.end method

.method private parse(Ljava/lang/String;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;
    .locals 5
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
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 217
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    const-string v3, "T"

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 218
    .local v2, "hasTime":Z
    invoke-static {p1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->date(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {p0, v3, v2}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->newInstance(Ljava/util/Date;Z)Lezvcard/property/DateOrTimeProperty;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 228
    .end local v2    # "hasTime":Z
    :goto_0
    return-object v3

    .line 219
    :catch_0
    move-exception v0

    .line 220
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-eq p2, v3, :cond_0

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    if-ne p2, v3, :cond_1

    .line 221
    :cond_0
    new-instance v3, Lezvcard/io/CannotParseException;

    const-string v4, "Date string could not be parsed."

    invoke-direct {v3, v4}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 225
    :cond_1
    :try_start_1
    new-instance v3, Lezvcard/util/PartialDate;

    invoke-direct {v3, p1}, Lezvcard/util/PartialDate;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->newInstance(Lezvcard/util/PartialDate;)Lezvcard/property/DateOrTimeProperty;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    goto :goto_0

    .line 226
    :catch_1
    move-exception v1

    .line 227
    .local v1, "e2":Ljava/lang/IllegalArgumentException;
    const-string v3, "Date string could not be parsed.  Treating it as a text value."

    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->newInstance(Ljava/lang/String;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v3

    goto :goto_0
.end method


# virtual methods
.method protected _dataType(Lezvcard/property/DateOrTimeProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 3
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
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/DateOrTimeProperty;, "TT;"
    const/4 v0, 0x0

    .line 65
    sget-object v1, Lezvcard/io/scribe/DateOrTimePropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p2}, Lezvcard/VCardVersion;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 78
    :goto_0
    :pswitch_0
    return-object v0

    .line 70
    :pswitch_1
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getDate()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getPartialDate()Lezvcard/util/PartialDate;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 74
    :cond_1
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->hasTime()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lezvcard/VCardDataType;->DATE_TIME:Lezvcard/VCardDataType;

    goto :goto_0

    :cond_2
    sget-object v0, Lezvcard/VCardDataType;->DATE:Lezvcard/VCardDataType;

    goto :goto_0

    .line 76
    :cond_3
    sget-object v0, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    goto :goto_0

    .line 65
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected bridge synthetic _dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/DateOrTimeProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_dataType(Lezvcard/property/DateOrTimeProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v0

    return-object v0
.end method

.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 3
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    const/4 v0, 0x0

    .line 53
    sget-object v1, Lezvcard/io/scribe/DateOrTimePropertyScribe$1;->$SwitchMap$ezvcard$VCardVersion:[I

    invoke-virtual {p1}, Lezvcard/VCardVersion;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 60
    :goto_0
    :pswitch_0
    return-object v0

    .line 58
    :pswitch_1
    sget-object v0, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    goto :goto_0

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;
    .locals 4
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
    .line 169
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .line 170
    .local v1, "value":Ljava/lang/String;
    const-string v2, "time"

    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->tagName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 171
    const-string v2, "datetime"

    invoke-virtual {p1, v2}, Lezvcard/io/html/HCardElement;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 172
    .local v0, "datetime":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 173
    move-object v1, v0

    .line 176
    .end local v0    # "datetime":Ljava/lang/String;
    :cond_0
    if-nez v1, :cond_1

    .line 177
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v1

    .line 179
    :cond_1
    sget-object v2, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    invoke-direct {p0, v1, v2, p2}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->parse(Ljava/lang/String;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v2

    return-object v2
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;
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
    .line 207
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v0

    .line 208
    .local v0, "valueStr":Ljava/lang/String;
    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    if-ne p2, v1, :cond_0

    .line 209
    invoke-virtual {p0, v0}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->newInstance(Ljava/lang/String;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v1

    .line 212
    :goto_0
    return-object v1

    :cond_0
    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-direct {p0, v0, v1, p4}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->parse(Ljava/lang/String;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v1

    goto :goto_0
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;
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
    .line 105
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 106
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p3, v0, :cond_0

    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    if-ne p2, v0, :cond_0

    .line 107
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->newInstance(Ljava/lang/String;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v0

    .line 110
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p3, p5}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->parse(Ljava/lang/String;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v0

    goto :goto_0
.end method

.method protected bridge synthetic _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/parameter/VCardParameters;
    .param p5, "x4"    # Ljava/util/List;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;
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
            ">;)TT;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 154
    new-array v1, v6, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->DATE:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    sget-object v2, Lezvcard/VCardDataType;->DATE_TIME:Lezvcard/VCardDataType;

    aput-object v2, v1, v4

    sget-object v2, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    aput-object v2, v1, v5

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v0

    .line 155
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 156
    invoke-virtual {p1}, Lezvcard/io/xml/XCardElement;->version()Lezvcard/VCardVersion;

    move-result-object v1

    invoke-direct {p0, v0, v1, p3}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->parse(Ljava/lang/String;Lezvcard/VCardVersion;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v1

    .line 161
    :goto_0
    return-object v1

    .line 159
    :cond_0
    new-array v1, v4, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v0

    .line 160
    if-eqz v0, :cond_1

    .line 161
    invoke-virtual {p0, v0}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->newInstance(Ljava/lang/String;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v1

    goto :goto_0

    .line 164
    :cond_1
    const/4 v1, 0x4

    new-array v1, v1, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->DATE:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    sget-object v2, Lezvcard/VCardDataType;->DATE_TIME:Lezvcard/VCardDataType;

    aput-object v2, v1, v4

    sget-object v2, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    aput-object v2, v1, v5

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    aput-object v2, v1, v6

    invoke-static {v1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v1

    throw v1
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/DateOrTimeProperty;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/DateOrTimeProperty;)Lezvcard/io/json/JCardValue;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lezvcard/io/json/JCardValue;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/DateOrTimeProperty;, "TT;"
    const/4 v6, 0x1

    .line 184
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getDate()Ljava/util/Date;

    move-result-object v0

    .line 185
    .local v0, "date":Ljava/util/Date;
    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->hasTime()Z

    move-result v1

    .line 187
    .local v1, "hasTime":Z
    invoke-static {v0}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->date(Ljava/util/Date;)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v5

    invoke-virtual {v5, v1}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->time(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v5

    invoke-virtual {v5, v6}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->utc(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v5

    invoke-virtual {v5}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->write()Ljava/lang/String;

    move-result-object v4

    .line 188
    .local v4, "value":Ljava/lang/String;
    invoke-static {v4}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v5

    .line 202
    .end local v1    # "hasTime":Z
    .end local v4    # "value":Ljava/lang/String;
    :goto_0
    return-object v5

    .line 191
    :cond_0
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getPartialDate()Lezvcard/util/PartialDate;

    move-result-object v2

    .line 192
    .local v2, "partialDate":Lezvcard/util/PartialDate;
    if-eqz v2, :cond_1

    .line 193
    invoke-virtual {v2, v6}, Lezvcard/util/PartialDate;->toDateAndOrTime(Z)Ljava/lang/String;

    move-result-object v4

    .line 194
    .restart local v4    # "value":Ljava/lang/String;
    invoke-static {v4}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v5

    goto :goto_0

    .line 197
    .end local v4    # "value":Ljava/lang/String;
    :cond_1
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getText()Ljava/lang/String;

    move-result-object v3

    .line 198
    .local v3, "text":Ljava/lang/String;
    if-eqz v3, :cond_2

    .line 199
    invoke-static {v3}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v5

    goto :goto_0

    .line 202
    :cond_2
    const-string v5, ""

    invoke-static {v5}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v5

    goto :goto_0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/DateOrTimeProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_writeJson(Lezvcard/property/DateOrTimeProperty;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/DateOrTimeProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
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
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/DateOrTimeProperty;, "TT;"
    const/4 v5, 0x0

    .line 83
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getDate()Ljava/util/Date;

    move-result-object v0

    .line 84
    .local v0, "date":Ljava/util/Date;
    if-eqz v0, :cond_0

    .line 85
    invoke-static {v0}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->date(Ljava/util/Date;)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v3

    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->hasTime()Z

    move-result v4

    invoke-virtual {v3, v4}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->time(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v3

    invoke-virtual {v3, v5}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v3

    invoke-virtual {v3, v5}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->utc(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v3

    invoke-virtual {v3}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->write()Ljava/lang/String;

    move-result-object v3

    .line 100
    :goto_0
    return-object v3

    .line 88
    :cond_0
    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p2, v3, :cond_2

    .line 89
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getText()Ljava/lang/String;

    move-result-object v2

    .line 90
    .local v2, "text":Ljava/lang/String;
    if-eqz v2, :cond_1

    .line 91
    invoke-static {v2}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getPartialDate()Lezvcard/util/PartialDate;

    move-result-object v1

    .line 95
    .local v1, "partialDate":Lezvcard/util/PartialDate;
    if-eqz v1, :cond_2

    .line 96
    invoke-virtual {v1, v5}, Lezvcard/util/PartialDate;->toDateAndOrTime(Z)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 100
    .end local v1    # "partialDate":Lezvcard/util/PartialDate;
    .end local v2    # "text":Ljava/lang/String;
    :cond_2
    const-string v3, ""

    goto :goto_0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/DateOrTimeProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_writeText(Lezvcard/property/DateOrTimeProperty;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/DateOrTimeProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 8
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lezvcard/io/xml/XCardElement;",
            ")V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/DateOrTimeProperty;, "TT;"
    const/4 v7, 0x0

    .line 115
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getDate()Ljava/util/Date;

    move-result-object v1

    .line 116
    .local v1, "date":Ljava/util/Date;
    if-eqz v1, :cond_1

    .line 117
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->hasTime()Z

    move-result v2

    .line 118
    .local v2, "hasTime":Z
    invoke-static {v1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->date(Ljava/util/Date;)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v6

    invoke-virtual {v6, v2}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->time(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v6

    invoke-virtual {v6, v7}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v6

    invoke-virtual {v6, v7}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->utc(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;

    move-result-object v6

    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->write()Ljava/lang/String;

    move-result-object v5

    .line 120
    .local v5, "value":Ljava/lang/String;
    if-eqz v2, :cond_0

    sget-object v0, Lezvcard/VCardDataType;->DATE_TIME:Lezvcard/VCardDataType;

    .line 122
    .local v0, "dataType":Lezvcard/VCardDataType;
    :goto_0
    invoke-virtual {p2, v0, v5}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 150
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    .end local v2    # "hasTime":Z
    .end local v5    # "value":Ljava/lang/String;
    :goto_1
    return-void

    .line 120
    .restart local v2    # "hasTime":Z
    .restart local v5    # "value":Ljava/lang/String;
    :cond_0
    sget-object v0, Lezvcard/VCardDataType;->DATE:Lezvcard/VCardDataType;

    goto :goto_0

    .line 126
    .end local v2    # "hasTime":Z
    .end local v5    # "value":Ljava/lang/String;
    :cond_1
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getPartialDate()Lezvcard/util/PartialDate;

    move-result-object v3

    .line 127
    .local v3, "partialDate":Lezvcard/util/PartialDate;
    if-eqz v3, :cond_5

    .line 129
    invoke-virtual {v3}, Lezvcard/util/PartialDate;->hasTimeComponent()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v3}, Lezvcard/util/PartialDate;->hasDateComponent()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 130
    sget-object v0, Lezvcard/VCardDataType;->DATE_TIME:Lezvcard/VCardDataType;

    .line 139
    .restart local v0    # "dataType":Lezvcard/VCardDataType;
    :goto_2
    invoke-virtual {v3, v7}, Lezvcard/util/PartialDate;->toDateAndOrTime(Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v0, v6}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_1

    .line 131
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    :cond_2
    invoke-virtual {v3}, Lezvcard/util/PartialDate;->hasTimeComponent()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 132
    sget-object v0, Lezvcard/VCardDataType;->TIME:Lezvcard/VCardDataType;

    .restart local v0    # "dataType":Lezvcard/VCardDataType;
    goto :goto_2

    .line 133
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    :cond_3
    invoke-virtual {v3}, Lezvcard/util/PartialDate;->hasDateComponent()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 134
    sget-object v0, Lezvcard/VCardDataType;->DATE:Lezvcard/VCardDataType;

    .restart local v0    # "dataType":Lezvcard/VCardDataType;
    goto :goto_2

    .line 136
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    :cond_4
    sget-object v0, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    .restart local v0    # "dataType":Lezvcard/VCardDataType;
    goto :goto_2

    .line 143
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    :cond_5
    invoke-virtual {p1}, Lezvcard/property/DateOrTimeProperty;->getText()Ljava/lang/String;

    move-result-object v4

    .line 144
    .local v4, "text":Ljava/lang/String;
    if-eqz v4, :cond_6

    .line 145
    sget-object v6, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p2, v6, v4}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_1

    .line 149
    :cond_6
    sget-object v6, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    const-string v7, ""

    invoke-virtual {p2, v6, v7}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    goto :goto_1
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/DateOrTimePropertyScribe;, "Lezvcard/io/scribe/DateOrTimePropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/DateOrTimeProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/DateOrTimePropertyScribe;->_writeXml(Lezvcard/property/DateOrTimeProperty;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method

.method protected abstract newInstance(Lezvcard/util/PartialDate;)Lezvcard/property/DateOrTimeProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/util/PartialDate;",
            ")TT;"
        }
    .end annotation
.end method

.method protected abstract newInstance(Ljava/lang/String;)Lezvcard/property/DateOrTimeProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method protected abstract newInstance(Ljava/util/Date;Z)Lezvcard/property/DateOrTimeProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Z)TT;"
        }
    .end annotation
.end method
