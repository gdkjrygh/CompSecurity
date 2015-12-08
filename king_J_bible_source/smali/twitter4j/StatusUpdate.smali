.class public final Ltwitter4j/StatusUpdate;
.super Ljava/lang/Object;
.source "StatusUpdate.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x31e5caa537ab7fbcL


# instance fields
.field private annotations:Ltwitter4j/Annotations;

.field private displayCoordinates:Z

.field private inReplyToStatusId:J

.field private location:Ltwitter4j/GeoLocation;

.field private transient mediaBody:Ljava/io/InputStream;

.field private mediaFile:Ljava/io/File;

.field private mediaName:Ljava/lang/String;

.field private placeId:Ljava/lang/String;

.field private possiblySensitive:Z

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3
    .param p1, "status"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    .line 34
    iput-object v2, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    .line 35
    iput-object v2, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    .line 37
    iput-object v2, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    .line 45
    iput-object p1, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    .line 46
    return-void
.end method

.method private appendParameter(Ljava/lang/String;DLjava/util/List;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "D",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 224
    .local p4, "params":Ljava/util/List;, "Ljava/util/List<Ltwitter4j/internal/http/HttpParameter;>;"
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    return-void
.end method

.method private appendParameter(Ljava/lang/String;JLjava/util/List;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 228
    .local p4, "params":Ljava/util/List;, "Ljava/util/List<Ltwitter4j/internal/http/HttpParameter;>;"
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    return-void
.end method

.method private appendParameter(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 218
    .local p3, "params":Ljava/util/List;, "Ljava/util/List<Ltwitter4j/internal/http/HttpParameter;>;"
    if-eqz p2, :cond_0

    .line 219
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    invoke-direct {v0, p1, p2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_0
    return-void
.end method


# virtual methods
.method public addAnnotation(Ltwitter4j/Annotation;)V
    .locals 1
    .param p1, "annotation"    # Ltwitter4j/Annotation;

    .prologue
    .line 175
    iget-object v0, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    if-nez v0, :cond_0

    .line 176
    new-instance v0, Ltwitter4j/Annotations;

    invoke-direct {v0}, Ltwitter4j/Annotations;-><init>()V

    iput-object v0, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    .line 178
    :cond_0
    iget-object v0, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    invoke-virtual {v0, p1}, Ltwitter4j/Annotations;->addAnnotation(Ltwitter4j/Annotation;)V

    .line 179
    return-void
.end method

.method public annotation(Ltwitter4j/Annotation;)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "annotation"    # Ltwitter4j/Annotation;

    .prologue
    .line 182
    invoke-virtual {p0, p1}, Ltwitter4j/StatusUpdate;->addAnnotation(Ltwitter4j/Annotation;)V

    .line 183
    return-object p0
.end method

.method public annotations(Ltwitter4j/Annotations;)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "annotations"    # Ltwitter4j/Annotations;

    .prologue
    .line 170
    invoke-virtual {p0, p1}, Ltwitter4j/StatusUpdate;->setAnnotations(Ltwitter4j/Annotations;)V

    .line 171
    return-object p0
.end method

.method asHttpParameterArray(Ltwitter4j/internal/http/HttpParameter;)[Ltwitter4j/internal/http/HttpParameter;
    .locals 6
    .param p1, "includeEntities"    # Ltwitter4j/internal/http/HttpParameter;

    .prologue
    .line 187
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .local v1, "params":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ltwitter4j/internal/http/HttpParameter;>;"
    const-string v2, "status"

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    invoke-direct {p0, v2, v3, v1}, Ltwitter4j/StatusUpdate;->appendParameter(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 189
    const-wide/16 v2, -0x1

    iget-wide v4, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 190
    const-string v2, "in_reply_to_status_id"

    iget-wide v4, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    invoke-direct {p0, v2, v4, v5, v1}, Ltwitter4j/StatusUpdate;->appendParameter(Ljava/lang/String;JLjava/util/List;)V

    .line 192
    :cond_0
    iget-object v2, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    if-eqz v2, :cond_1

    .line 193
    const-string v2, "lat"

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    invoke-virtual {v3}, Ltwitter4j/GeoLocation;->getLatitude()D

    move-result-wide v4

    invoke-direct {p0, v2, v4, v5, v1}, Ltwitter4j/StatusUpdate;->appendParameter(Ljava/lang/String;DLjava/util/List;)V

    .line 194
    const-string v2, "long"

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    invoke-virtual {v3}, Ltwitter4j/GeoLocation;->getLongitude()D

    move-result-wide v4

    invoke-direct {p0, v2, v4, v5, v1}, Ltwitter4j/StatusUpdate;->appendParameter(Ljava/lang/String;DLjava/util/List;)V

    .line 197
    :cond_1
    const-string v2, "place_id"

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    invoke-direct {p0, v2, v3, v1}, Ltwitter4j/StatusUpdate;->appendParameter(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 198
    iget-boolean v2, p0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    if-nez v2, :cond_2

    .line 199
    const-string v2, "display_coordinates"

    const-string v3, "false"

    invoke-direct {p0, v2, v3, v1}, Ltwitter4j/StatusUpdate;->appendParameter(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 201
    :cond_2
    iget-object v2, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    if-eqz v2, :cond_3

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    invoke-virtual {v2}, Ltwitter4j/Annotations;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 202
    const-string v2, "annotations"

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    invoke-virtual {v3}, Ltwitter4j/Annotations;->asParameterValue()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v1}, Ltwitter4j/StatusUpdate;->appendParameter(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 204
    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    iget-object v2, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    if-eqz v2, :cond_5

    .line 206
    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    const-string v3, "media[]"

    iget-object v4, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    invoke-direct {v2, v3, v4}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/io/File;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    const-string v3, "possibly_sensitive"

    iget-boolean v4, p0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    invoke-direct {v2, v3, v4}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    :cond_4
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v0, v2, [Ltwitter4j/internal/http/HttpParameter;

    .line 214
    .local v0, "paramArray":[Ltwitter4j/internal/http/HttpParameter;
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ltwitter4j/internal/http/HttpParameter;

    return-object v2

    .line 208
    .end local v0    # "paramArray":[Ltwitter4j/internal/http/HttpParameter;
    :cond_5
    iget-object v2, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    if-eqz v2, :cond_4

    .line 209
    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    const-string v3, "media[]"

    iget-object v4, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    iget-object v5, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    invoke-direct {v2, v3, v4, v5}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    const-string v3, "possibly_sensitive"

    iget-boolean v4, p0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    invoke-direct {v2, v3, v4}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public displayCoordinates(Z)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "displayCoordinates"    # Z

    .prologue
    .line 100
    invoke-virtual {p0, p1}, Ltwitter4j/StatusUpdate;->setDisplayCoordinates(Z)V

    .line 101
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 233
    if-ne p0, p1, :cond_1

    .line 249
    :cond_0
    :goto_0
    return v1

    .line 234
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 236
    check-cast v0, Ltwitter4j/StatusUpdate;

    .line 238
    .local v0, "that":Ltwitter4j/StatusUpdate;
    iget-boolean v3, p0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    iget-boolean v4, v0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    if-eq v3, v4, :cond_4

    move v1, v2

    goto :goto_0

    .line 239
    :cond_4
    iget-wide v4, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    iget-wide v6, v0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    cmp-long v3, v4, v6

    if-eqz v3, :cond_5

    move v1, v2

    goto :goto_0

    .line 240
    :cond_5
    iget-boolean v3, p0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    iget-boolean v4, v0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    if-eq v3, v4, :cond_6

    move v1, v2

    goto :goto_0

    .line 241
    :cond_6
    iget-object v3, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    if-eqz v3, :cond_8

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    iget-object v4, v0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    invoke-virtual {v3, v4}, Ltwitter4j/Annotations;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_7
    move v1, v2

    goto :goto_0

    :cond_8
    iget-object v3, v0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    if-nez v3, :cond_7

    .line 242
    :cond_9
    iget-object v3, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    if-eqz v3, :cond_b

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    iget-object v4, v0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    invoke-virtual {v3, v4}, Ltwitter4j/GeoLocation;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_a
    move v1, v2

    goto :goto_0

    :cond_b
    iget-object v3, v0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    if-nez v3, :cond_a

    .line 243
    :cond_c
    iget-object v3, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    if-eqz v3, :cond_e

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    iget-object v4, v0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_d
    move v1, v2

    goto :goto_0

    :cond_e
    iget-object v3, v0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    if-nez v3, :cond_d

    .line 244
    :cond_f
    iget-object v3, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    if-eqz v3, :cond_11

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    iget-object v4, v0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    invoke-virtual {v3, v4}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    :cond_10
    move v1, v2

    goto :goto_0

    :cond_11
    iget-object v3, v0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    if-nez v3, :cond_10

    .line 245
    :cond_12
    iget-object v3, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    if-eqz v3, :cond_14

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    iget-object v4, v0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_13
    move v1, v2

    goto/16 :goto_0

    :cond_14
    iget-object v3, v0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    if-nez v3, :cond_13

    .line 246
    :cond_15
    iget-object v3, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    if-eqz v3, :cond_17

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    iget-object v4, v0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    :cond_16
    move v1, v2

    goto/16 :goto_0

    :cond_17
    iget-object v3, v0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    if-nez v3, :cond_16

    .line 247
    :cond_18
    iget-object v3, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    if-eqz v3, :cond_19

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    iget-object v4, v0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :goto_1
    move v1, v2

    goto/16 :goto_0

    :cond_19
    iget-object v3, v0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    if-eqz v3, :cond_0

    goto :goto_1
.end method

.method public getAnnotations()Ltwitter4j/Annotations;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    return-object v0
.end method

.method public getInReplyToStatusId()J
    .locals 2

    .prologue
    .line 53
    iget-wide v0, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    return-wide v0
.end method

.method public getLocation()Ltwitter4j/GeoLocation;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    return-object v0
.end method

.method public getPlaceId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 9

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 254
    iget-object v2, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 255
    .local v0, "result":I
    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-wide v4, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    iget-wide v6, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    const/16 v8, 0x20

    ushr-long/2addr v6, v8

    xor-long/2addr v4, v6

    long-to-int v4, v4

    add-int v0, v2, v4

    .line 256
    mul-int/lit8 v4, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    invoke-virtual {v2}, Ltwitter4j/GeoLocation;->hashCode()I

    move-result v2

    :goto_1
    add-int v0, v4, v2

    .line 257
    mul-int/lit8 v4, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int v0, v4, v2

    .line 258
    mul-int/lit8 v4, v0, 0x1f

    iget-boolean v2, p0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    if-eqz v2, :cond_4

    move v2, v3

    :goto_3
    add-int v0, v4, v2

    .line 259
    mul-int/lit8 v4, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    if-eqz v2, :cond_5

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    invoke-virtual {v2}, Ltwitter4j/Annotations;->hashCode()I

    move-result v2

    :goto_4
    add-int v0, v4, v2

    .line 260
    mul-int/lit8 v2, v0, 0x1f

    iget-boolean v4, p0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    if-eqz v4, :cond_6

    :goto_5
    add-int v0, v2, v3

    .line 261
    mul-int/lit8 v3, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int v0, v3, v2

    .line 262
    mul-int/lit8 v3, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    if-eqz v2, :cond_8

    iget-object v2, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int v0, v3, v2

    .line 263
    mul-int/lit8 v2, v0, 0x1f

    iget-object v3, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    if-eqz v3, :cond_0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->hashCode()I

    move-result v1

    :cond_0
    add-int v0, v2, v1

    .line 264
    return v0

    .end local v0    # "result":I
    :cond_1
    move v0, v1

    .line 254
    goto :goto_0

    .restart local v0    # "result":I
    :cond_2
    move v2, v1

    .line 256
    goto :goto_1

    :cond_3
    move v2, v1

    .line 257
    goto :goto_2

    :cond_4
    move v2, v1

    .line 258
    goto :goto_3

    :cond_5
    move v2, v1

    .line 259
    goto :goto_4

    :cond_6
    move v3, v1

    .line 260
    goto :goto_5

    :cond_7
    move v2, v1

    .line 261
    goto :goto_6

    :cond_8
    move v2, v1

    .line 262
    goto :goto_7
.end method

.method public inReplyToStatusId(J)Ltwitter4j/StatusUpdate;
    .locals 1
    .param p1, "inReplyToStatusId"    # J

    .prologue
    .line 61
    invoke-virtual {p0, p1, p2}, Ltwitter4j/StatusUpdate;->setInReplyToStatusId(J)V

    .line 62
    return-object p0
.end method

.method public isDisplayCoordinates()Z
    .locals 1

    .prologue
    .line 92
    iget-boolean v0, p0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    return v0
.end method

.method public isPossiblySensitive()Z
    .locals 1

    .prologue
    .line 158
    iget-boolean v0, p0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    return v0
.end method

.method isWithMedia()Z
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    if-nez v0, :cond_0

    iget-object v0, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public location(Ltwitter4j/GeoLocation;)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "location"    # Ltwitter4j/GeoLocation;

    .prologue
    .line 74
    invoke-virtual {p0, p1}, Ltwitter4j/StatusUpdate;->setLocation(Ltwitter4j/GeoLocation;)V

    .line 75
    return-object p0
.end method

.method public media(Ljava/io/File;)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "file"    # Ljava/io/File;

    .prologue
    .line 115
    invoke-virtual {p0, p1}, Ltwitter4j/StatusUpdate;->setMedia(Ljava/io/File;)V

    .line 116
    return-object p0
.end method

.method public media(Ljava/lang/String;Ljava/io/InputStream;)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "body"    # Ljava/io/InputStream;

    .prologue
    .line 135
    invoke-virtual {p0, p1, p2}, Ltwitter4j/StatusUpdate;->setMedia(Ljava/lang/String;Ljava/io/InputStream;)V

    .line 136
    return-object p0
.end method

.method public placeId(Ljava/lang/String;)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "placeId"    # Ljava/lang/String;

    .prologue
    .line 87
    invoke-virtual {p0, p1}, Ltwitter4j/StatusUpdate;->setPlaceId(Ljava/lang/String;)V

    .line 88
    return-object p0
.end method

.method public possiblySensitive(Z)Ltwitter4j/StatusUpdate;
    .locals 0
    .param p1, "possiblySensitive"    # Z

    .prologue
    .line 150
    invoke-virtual {p0, p1}, Ltwitter4j/StatusUpdate;->setPossiblySensitive(Z)V

    .line 151
    return-object p0
.end method

.method public setAnnotations(Ltwitter4j/Annotations;)V
    .locals 0
    .param p1, "annotations"    # Ltwitter4j/Annotations;

    .prologue
    .line 166
    iput-object p1, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    .line 167
    return-void
.end method

.method public setDisplayCoordinates(Z)V
    .locals 0
    .param p1, "displayCoordinates"    # Z

    .prologue
    .line 96
    iput-boolean p1, p0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    .line 97
    return-void
.end method

.method public setInReplyToStatusId(J)V
    .locals 1
    .param p1, "inReplyToStatusId"    # J

    .prologue
    .line 57
    iput-wide p1, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    .line 58
    return-void
.end method

.method public setLocation(Ltwitter4j/GeoLocation;)V
    .locals 0
    .param p1, "location"    # Ltwitter4j/GeoLocation;

    .prologue
    .line 70
    iput-object p1, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    .line 71
    return-void
.end method

.method public setMedia(Ljava/io/File;)V
    .locals 0
    .param p1, "file"    # Ljava/io/File;

    .prologue
    .line 108
    iput-object p1, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    .line 109
    return-void
.end method

.method public setMedia(Ljava/lang/String;Ljava/io/InputStream;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "body"    # Ljava/io/InputStream;

    .prologue
    .line 123
    iput-object p1, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    .line 124
    iput-object p2, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    .line 125
    return-void
.end method

.method public setPlaceId(Ljava/lang/String;)V
    .locals 0
    .param p1, "placeId"    # Ljava/lang/String;

    .prologue
    .line 83
    iput-object p1, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setPossiblySensitive(Z)V
    .locals 0
    .param p1, "possiblySensitive"    # Z

    .prologue
    .line 143
    iput-boolean p1, p0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    .line 144
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0x27

    .line 269
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "StatusUpdate{status=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", inReplyToStatusId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v2, p0, Ltwitter4j/StatusUpdate;->inReplyToStatusId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->location:Ltwitter4j/GeoLocation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", placeId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->placeId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", displayCoordinates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/StatusUpdate;->displayCoordinates:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", annotations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->annotations:Ltwitter4j/Annotations;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", possiblySensitive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-boolean v1, p0, Ltwitter4j/StatusUpdate;->possiblySensitive:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", mediaName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->mediaName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", mediaBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->mediaBody:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", mediaFile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/StatusUpdate;->mediaFile:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
