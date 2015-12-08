.class public Lezvcard/property/DateOrTimeProperty;
.super Lezvcard/property/VCardProperty;
.source "DateOrTimeProperty.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# instance fields
.field private date:Ljava/util/Date;

.field private dateHasTime:Z

.field private partialDate:Lezvcard/util/PartialDate;

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lezvcard/util/PartialDate;)V
    .locals 0
    .param p1, "partialDate"    # Lezvcard/util/PartialDate;

    .prologue
    .line 74
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 75
    invoke-virtual {p0, p1}, Lezvcard/property/DateOrTimeProperty;->setPartialDate(Lezvcard/util/PartialDate;)V

    .line 76
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 82
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 83
    invoke-virtual {p0, p1}, Lezvcard/property/DateOrTimeProperty;->setText(Ljava/lang/String;)V

    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .locals 1
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/property/DateOrTimeProperty;-><init>(Ljava/util/Date;Z)V

    .line 58
    return-void
.end method

.method public constructor <init>(Ljava/util/Date;Z)V
    .locals 0
    .param p1, "date"    # Ljava/util/Date;
    .param p2, "hasTime"    # Z

    .prologue
    .line 66
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 67
    invoke-virtual {p0, p1, p2}, Lezvcard/property/DateOrTimeProperty;->setDate(Ljava/util/Date;Z)V

    .line 68
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
    .line 211
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->date:Ljava/util/Date;

    if-nez v0, :cond_0

    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->partialDate:Lezvcard/util/PartialDate;

    if-nez v0, :cond_0

    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->text:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 212
    const-string v0, "Property has no value associated with it."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    :cond_0
    sget-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-eq p2, v0, :cond_1

    sget-object v0, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    if-ne p2, v0, :cond_3

    .line 216
    :cond_1
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->text:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Text values are not supported in version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    :cond_2
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->partialDate:Lezvcard/util/PartialDate;

    if-eqz v0, :cond_3

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reduced accuracy or truncated dates are not supported in version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    :cond_3
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCalscale()Lezvcard/parameter/Calscale;
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getCalscale()Lezvcard/parameter/Calscale;

    move-result-object v0

    return-object v0
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->date:Ljava/util/Date;

    return-object v0
.end method

.method public getPartialDate()Lezvcard/util/PartialDate;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->partialDate:Lezvcard/util/PartialDate;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hasTime()Z
    .locals 1

    .prologue
    .line 166
    iget-boolean v0, p0, Lezvcard/property/DateOrTimeProperty;->dateHasTime:Z

    return v0
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 206
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 207
    return-void
.end method

.method public setCalscale(Lezvcard/parameter/Calscale;)V
    .locals 1
    .param p1, "calscale"    # Lezvcard/parameter/Calscale;

    .prologue
    .line 196
    iget-object v0, p0, Lezvcard/property/DateOrTimeProperty;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setCalscale(Lezvcard/parameter/Calscale;)V

    .line 197
    return-void
.end method

.method public setDate(Ljava/util/Date;Z)V
    .locals 1
    .param p1, "date"    # Ljava/util/Date;
    .param p2, "hasTime"    # Z

    .prologue
    const/4 v0, 0x0

    .line 101
    iput-object p1, p0, Lezvcard/property/DateOrTimeProperty;->date:Ljava/util/Date;

    .line 102
    if-nez p1, :cond_0

    const/4 p2, 0x0

    .end local p2    # "hasTime":Z
    :cond_0
    iput-boolean p2, p0, Lezvcard/property/DateOrTimeProperty;->dateHasTime:Z

    .line 103
    iput-object v0, p0, Lezvcard/property/DateOrTimeProperty;->text:Ljava/lang/String;

    .line 104
    iput-object v0, p0, Lezvcard/property/DateOrTimeProperty;->partialDate:Lezvcard/util/PartialDate;

    .line 105
    return-void
.end method

.method public setPartialDate(Lezvcard/util/PartialDate;)V
    .locals 2
    .param p1, "partialDate"    # Lezvcard/util/PartialDate;

    .prologue
    const/4 v1, 0x0

    .line 133
    iput-object p1, p0, Lezvcard/property/DateOrTimeProperty;->partialDate:Lezvcard/util/PartialDate;

    .line 134
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lezvcard/property/DateOrTimeProperty;->dateHasTime:Z

    .line 135
    iput-object v1, p0, Lezvcard/property/DateOrTimeProperty;->text:Ljava/lang/String;

    .line 136
    iput-object v1, p0, Lezvcard/property/DateOrTimeProperty;->date:Ljava/util/Date;

    .line 137
    return-void

    .line 134
    :cond_0
    invoke-virtual {p1}, Lezvcard/util/PartialDate;->hasTimeComponent()Z

    move-result v0

    goto :goto_0
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 153
    iput-object p1, p0, Lezvcard/property/DateOrTimeProperty;->text:Ljava/lang/String;

    .line 154
    iput-object v0, p0, Lezvcard/property/DateOrTimeProperty;->date:Ljava/util/Date;

    .line 155
    iput-object v0, p0, Lezvcard/property/DateOrTimeProperty;->partialDate:Lezvcard/util/PartialDate;

    .line 156
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/property/DateOrTimeProperty;->dateHasTime:Z

    .line 157
    return-void
.end method
