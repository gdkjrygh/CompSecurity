.class public Lezvcard/property/Timezone;
.super Lezvcard/property/VCardProperty;
.source "Timezone.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# instance fields
.field private offset:Lezvcard/util/UtcOffset;

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lezvcard/util/UtcOffset;)V
    .locals 1
    .param p1, "offset"    # Lezvcard/util/UtcOffset;

    .prologue
    .line 143
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;Ljava/lang/String;)V

    .line 144
    return-void
.end method

.method public constructor <init>(Lezvcard/util/UtcOffset;Ljava/lang/String;)V
    .locals 0
    .param p1, "offset"    # Lezvcard/util/UtcOffset;
    .param p2, "text"    # Ljava/lang/String;

    .prologue
    .line 167
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 168
    invoke-virtual {p0, p1}, Lezvcard/property/Timezone;->setOffset(Lezvcard/util/UtcOffset;)V

    .line 169
    invoke-virtual {p0, p2}, Lezvcard/property/Timezone;->setText(Ljava/lang/String;)V

    .line 170
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3
    .param p1, "hourOffset"    # Ljava/lang/Integer;
    .param p2, "minuteOffset"    # Ljava/lang/Integer;

    .prologue
    .line 135
    new-instance v0, Lezvcard/util/UtcOffset;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lezvcard/util/UtcOffset;-><init>(II)V

    invoke-direct {p0, v0}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;)V

    .line 136
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 3
    .param p1, "hourOffset"    # Ljava/lang/Integer;
    .param p2, "minuteOffset"    # Ljava/lang/Integer;
    .param p3, "text"    # Ljava/lang/String;

    .prologue
    .line 156
    new-instance v0, Lezvcard/util/UtcOffset;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lezvcard/util/UtcOffset;-><init>(II)V

    invoke-direct {p0, v0, p3}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;Ljava/lang/String;)V

    .line 157
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 126
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;Ljava/lang/String;)V

    .line 127
    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;)V
    .locals 2
    .param p1, "timezone"    # Ljava/util/TimeZone;

    .prologue
    .line 177
    invoke-static {p1}, Lezvcard/util/UtcOffset;->parse(Ljava/util/TimeZone;)Lezvcard/util/UtcOffset;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lezvcard/property/Timezone;-><init>(Lezvcard/util/UtcOffset;Ljava/lang/String;)V

    .line 178
    return-void
.end method


# virtual methods
.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 2
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .line 355
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    if-nez v0, :cond_0

    iget-object v0, p0, Lezvcard/property/Timezone;->text:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 356
    const-string v0, "Property does not have text or UTC offset values associated with it."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 358
    :cond_0
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    if-nez v0, :cond_1

    sget-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-ne p2, v0, :cond_1

    .line 359
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Property requires a UTC offset for its value in version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 361
    :cond_1
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    invoke-virtual {v0}, Lezvcard/util/UtcOffset;->getMinute()I

    move-result v0

    if-ltz v0, :cond_2

    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    invoke-virtual {v0}, Lezvcard/util/UtcOffset;->getMinute()I

    move-result v0

    const/16 v1, 0x3b

    if-le v0, v1, :cond_3

    .line 362
    :cond_2
    const-string v0, "Minute offset must be between 0 and 59."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 364
    :cond_3
    return-void
.end method

.method public addPid(II)V
    .locals 0
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 325
    invoke-super {p0, p1, p2}, Lezvcard/property/VCardProperty;->addPid(II)V

    .line 326
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lezvcard/property/Timezone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHourOffset()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    invoke-virtual {v0}, Lezvcard/util/UtcOffset;->getHour()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method

.method public getMediaType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lezvcard/property/Timezone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getMediaType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMinuteOffset()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    invoke-virtual {v0}, Lezvcard/util/UtcOffset;->getMinute()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method

.method public getOffset()Lezvcard/util/UtcOffset;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    return-object v0
.end method

.method public getPids()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 320
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 335
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getPref()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lezvcard/property/Timezone;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lezvcard/property/Timezone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public removePids()V
    .locals 0

    .prologue
    .line 330
    invoke-super {p0}, Lezvcard/property/VCardProperty;->removePids()V

    .line 331
    return-void
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 350
    iget-object v0, p0, Lezvcard/property/Timezone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 351
    return-void
.end method

.method public setMediaType(Ljava/lang/String;)V
    .locals 1
    .param p1, "mediaType"    # Ljava/lang/String;

    .prologue
    .line 315
    iget-object v0, p0, Lezvcard/property/Timezone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setMediaType(Ljava/lang/String;)V

    .line 316
    return-void
.end method

.method public setOffset(II)V
    .locals 1
    .param p1, "hourOffset"    # I
    .param p2, "minuteOffset"    # I

    .prologue
    .line 210
    new-instance v0, Lezvcard/util/UtcOffset;

    invoke-direct {v0, p1, p2}, Lezvcard/util/UtcOffset;-><init>(II)V

    invoke-virtual {p0, v0}, Lezvcard/property/Timezone;->setOffset(Lezvcard/util/UtcOffset;)V

    .line 211
    return-void
.end method

.method public setOffset(Lezvcard/util/UtcOffset;)V
    .locals 0
    .param p1, "offset"    # Lezvcard/util/UtcOffset;

    .prologue
    .line 218
    iput-object p1, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    .line 219
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 0
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 340
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setPref(Ljava/lang/Integer;)V

    .line 341
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 240
    iput-object p1, p0, Lezvcard/property/Timezone;->text:Ljava/lang/String;

    .line 241
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 293
    iget-object v0, p0, Lezvcard/property/Timezone;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setType(Ljava/lang/String;)V

    .line 294
    return-void
.end method

.method public toTimeZone()Ljava/util/TimeZone;
    .locals 6

    .prologue
    .line 249
    iget-object v5, p0, Lezvcard/property/Timezone;->text:Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 250
    iget-object v5, p0, Lezvcard/property/Timezone;->text:Ljava/lang/String;

    invoke-static {v5}, Lezvcard/util/VCardDateFormatter;->parseTimeZoneId(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    .line 251
    .local v4, "timezone":Ljava/util/TimeZone;
    if-eqz v4, :cond_0

    .line 269
    .end local v4    # "timezone":Ljava/util/TimeZone;
    :goto_0
    return-object v4

    .line 256
    :cond_0
    iget-object v5, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    if-eqz v5, :cond_3

    .line 257
    iget-object v5, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    invoke-virtual {v5}, Lezvcard/util/UtcOffset;->getHour()I

    move-result v5

    mul-int/lit8 v5, v5, 0x3c

    mul-int/lit8 v5, v5, 0x3c

    mul-int/lit16 v1, v5, 0x3e8

    .line 258
    .local v1, "rawHourOffset":I
    iget-object v5, p0, Lezvcard/property/Timezone;->offset:Lezvcard/util/UtcOffset;

    invoke-virtual {v5}, Lezvcard/util/UtcOffset;->getMinute()I

    move-result v5

    mul-int/lit8 v5, v5, 0x3c

    mul-int/lit16 v2, v5, 0x3e8

    .line 259
    .local v2, "rawMinuteOffset":I
    if-gez v1, :cond_1

    .line 260
    mul-int/lit8 v2, v2, -0x1

    .line 262
    :cond_1
    add-int v3, v1, v2

    .line 264
    .local v3, "rawOffset":I
    iget-object v5, p0, Lezvcard/property/Timezone;->text:Ljava/lang/String;

    if-nez v5, :cond_2

    const-string v0, ""

    .line 266
    .local v0, "id":Ljava/lang/String;
    :goto_1
    new-instance v4, Ljava/util/SimpleTimeZone;

    invoke-direct {v4, v3, v0}, Ljava/util/SimpleTimeZone;-><init>(ILjava/lang/String;)V

    goto :goto_0

    .line 264
    .end local v0    # "id":Ljava/lang/String;
    :cond_2
    iget-object v0, p0, Lezvcard/property/Timezone;->text:Ljava/lang/String;

    goto :goto_1

    .line 269
    .end local v1    # "rawHourOffset":I
    .end local v2    # "rawMinuteOffset":I
    .end local v3    # "rawOffset":I
    :cond_3
    const/4 v4, 0x0

    goto :goto_0
.end method
