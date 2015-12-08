.class public Lcom/googlecode/flickrjandroid/galleries/Gallery;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private commentsCount:I

.field private dateCreate:Ljava/util/Date;

.field private dateUpdate:Ljava/util/Date;

.field private description:Ljava/lang/String;

.field private galleryId:Ljava/lang/String;

.field private galleryUrl:Ljava/lang/String;

.field private ownerId:Ljava/lang/String;

.field private photoCount:I

.field private primaryPhotoId:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private videoCount:I

.field private viewsCount:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 203
    if-ne p0, p1, :cond_1

    .line 258
    :cond_0
    :goto_0
    return v0

    .line 205
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 206
    goto :goto_0

    .line 207
    :cond_2
    instance-of v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;

    if-nez v2, :cond_3

    move v0, v1

    .line 208
    goto :goto_0

    .line 209
    :cond_3
    check-cast p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;

    .line 210
    iget v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->commentsCount:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->commentsCount:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 211
    goto :goto_0

    .line 212
    :cond_4
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    if-nez v2, :cond_5

    .line 213
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    if-eqz v2, :cond_6

    move v0, v1

    .line 214
    goto :goto_0

    .line 215
    :cond_5
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    move v0, v1

    .line 216
    goto :goto_0

    .line 217
    :cond_6
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    if-nez v2, :cond_7

    .line 218
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    if-eqz v2, :cond_8

    move v0, v1

    .line 219
    goto :goto_0

    .line 220
    :cond_7
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    move v0, v1

    .line 221
    goto :goto_0

    .line 222
    :cond_8
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    if-nez v2, :cond_9

    .line 223
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    if-eqz v2, :cond_a

    move v0, v1

    .line 224
    goto :goto_0

    .line 225
    :cond_9
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    move v0, v1

    .line 226
    goto :goto_0

    .line 227
    :cond_a
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    if-nez v2, :cond_b

    .line 228
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    if-eqz v2, :cond_c

    move v0, v1

    .line 229
    goto :goto_0

    .line 230
    :cond_b
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    move v0, v1

    .line 231
    goto :goto_0

    .line 232
    :cond_c
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    if-nez v2, :cond_d

    .line 233
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    if-eqz v2, :cond_e

    move v0, v1

    .line 234
    goto :goto_0

    .line 235
    :cond_d
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    move v0, v1

    .line 236
    goto/16 :goto_0

    .line 237
    :cond_e
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    if-nez v2, :cond_f

    .line 238
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    if-eqz v2, :cond_10

    move v0, v1

    .line 239
    goto/16 :goto_0

    .line 240
    :cond_f
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    move v0, v1

    .line 241
    goto/16 :goto_0

    .line 242
    :cond_10
    iget v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->photoCount:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->photoCount:I

    if-eq v2, v3, :cond_11

    move v0, v1

    .line 243
    goto/16 :goto_0

    .line 244
    :cond_11
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    if-nez v2, :cond_12

    .line 245
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    if-eqz v2, :cond_13

    move v0, v1

    .line 246
    goto/16 :goto_0

    .line 247
    :cond_12
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    move v0, v1

    .line 248
    goto/16 :goto_0

    .line 249
    :cond_13
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    if-nez v2, :cond_14

    .line 250
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    if-eqz v2, :cond_15

    move v0, v1

    .line 251
    goto/16 :goto_0

    .line 252
    :cond_14
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    move v0, v1

    .line 253
    goto/16 :goto_0

    .line 254
    :cond_15
    iget v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->videoCount:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->videoCount:I

    if-eq v2, v3, :cond_16

    move v0, v1

    .line 255
    goto/16 :goto_0

    .line 256
    :cond_16
    iget v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->viewsCount:I

    iget v3, p1, Lcom/googlecode/flickrjandroid/galleries/Gallery;->viewsCount:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 257
    goto/16 :goto_0
.end method

.method public getCommentsCount()I
    .locals 1

    .prologue
    .line 160
    iget v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->commentsCount:I

    return v0
.end method

.method public getDateCreate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    return-object v0
.end method

.method public getDateUpdate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getGalleryId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    return-object v0
.end method

.method public getGalleryUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getOwnerId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotoCount()I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->photoCount:I

    return v0
.end method

.method public getPrimaryPhotoId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalCount()I
    .locals 2

    .prologue
    .line 99
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/galleries/Gallery;->getPhotoCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/galleries/Gallery;->getVideoCount()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getVideoCount()I
    .locals 1

    .prologue
    .line 95
    iget v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->videoCount:I

    return v0
.end method

.method public getViewsCount()I
    .locals 1

    .prologue
    .line 146
    iget v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->viewsCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 177
    iget v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->commentsCount:I

    add-int/lit8 v0, v0, 0x1f

    .line 178
    mul-int/lit8 v2, v0, 0x1f

    .line 179
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    if-nez v0, :cond_0

    move v0, v1

    .line 178
    :goto_0
    add-int/2addr v0, v2

    .line 180
    mul-int/lit8 v2, v0, 0x1f

    .line 181
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    if-nez v0, :cond_1

    move v0, v1

    .line 180
    :goto_1
    add-int/2addr v0, v2

    .line 182
    mul-int/lit8 v2, v0, 0x1f

    .line 183
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    .line 182
    :goto_2
    add-int/2addr v0, v2

    .line 184
    mul-int/lit8 v2, v0, 0x1f

    .line 185
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v1

    .line 184
    :goto_3
    add-int/2addr v0, v2

    .line 186
    mul-int/lit8 v2, v0, 0x1f

    .line 187
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v1

    .line 186
    :goto_4
    add-int/2addr v0, v2

    .line 188
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    if-nez v0, :cond_5

    move v0, v1

    :goto_5
    add-int/2addr v0, v2

    .line 189
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->photoCount:I

    add-int/2addr v0, v2

    .line 190
    mul-int/lit8 v2, v0, 0x1f

    .line 191
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    if-nez v0, :cond_6

    move v0, v1

    .line 190
    :goto_6
    add-int/2addr v0, v2

    .line 192
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    if-nez v2, :cond_7

    :goto_7
    add-int/2addr v0, v1

    .line 193
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->videoCount:I

    add-int/2addr v0, v1

    .line 194
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->viewsCount:I

    add-int/2addr v0, v1

    .line 195
    return v0

    .line 179
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    goto :goto_0

    .line 181
    :cond_1
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    goto :goto_1

    .line 183
    :cond_2
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_2

    .line 185
    :cond_3
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_3

    .line 187
    :cond_4
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_4

    .line 188
    :cond_5
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_5

    .line 191
    :cond_6
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_6

    .line 192
    :cond_7
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_7
.end method

.method public setCommentsCount(I)V
    .locals 0

    .prologue
    .line 167
    iput p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->commentsCount:I

    .line 168
    return-void
.end method

.method public setDateCreate(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 117
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    :cond_0
    :goto_0
    return-void

    .line 118
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 119
    new-instance v2, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v2}, Lcom/googlecode/flickrjandroid/galleries/Gallery;->setDateCreate(Ljava/util/Date;)V

    goto :goto_0
.end method

.method public setDateCreate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    .line 114
    return-void
.end method

.method public setDateUpdate(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 137
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    :cond_0
    :goto_0
    return-void

    .line 138
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 139
    new-instance v2, Ljava/util/Date;

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v2}, Lcom/googlecode/flickrjandroid/galleries/Gallery;->setDateUpdate(Ljava/util/Date;)V

    goto :goto_0
.end method

.method public setDateUpdate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    .line 134
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setGalleryId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setGalleryUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setOwnerId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setPhotoCount(I)V
    .locals 0

    .prologue
    .line 71
    iput p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->photoCount:I

    .line 72
    return-void
.end method

.method public setPrimaryPhotoId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setVideoCount(I)V
    .locals 0

    .prologue
    .line 91
    iput p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->videoCount:I

    .line 92
    return-void
.end method

.method public setViewsCount(I)V
    .locals 0

    .prologue
    .line 153
    iput p1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->viewsCount:I

    .line 154
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 266
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Gallery [galleryId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", galleryUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->galleryUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 267
    const-string v1, ", ownerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->ownerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", primaryPhotoId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->primaryPhotoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 268
    const-string v1, ", photoCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->photoCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->videoCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 269
    const-string v1, ", viewsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->viewsCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", commentsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 270
    iget v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->commentsCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 271
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dateCreate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateCreate:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dateUpdate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 272
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/galleries/Gallery;->dateUpdate:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
