.class public final Lcom/googlecode/flickrjandroid/photos/PhotoUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final PHOTO_SUFFIX_LARGE:Ljava/lang/String; = "_l"

.field private static final PHOTO_SUFFIX_LARGE_1600:Ljava/lang/String; = "_h"

.field private static final PHOTO_SUFFIX_LARGE_2048:Ljava/lang/String; = "_k"

.field private static final PHOTO_SUFFIX_LARGE_SQUARE:Ljava/lang/String; = "_q"

.field private static final PHOTO_SUFFIX_MEDIUM:Ljava/lang/String; = "_m"

.field private static final PHOTO_SUFFIX_MEDIUM_640:Ljava/lang/String; = "_z"

.field private static final PHOTO_SUFFIX_MEDIUM_800:Ljava/lang/String; = "_c"

.field private static final PHOTO_SUFFIX_ORIGINAL:Ljava/lang/String; = "_o"

.field private static final PHOTO_SUFFIX_SMALL:Ljava/lang/String; = "_s"

.field private static final PHOTO_SUFFIX_SMALL_320:Ljava/lang/String; = "_n"

.field private static final PHOTO_SUFFIX_SQUARE:Ljava/lang/String; = "_sq"

.field private static final PHOTO_SUFFIX_THUMB:Ljava/lang/String; = "_t"

.field public static final serialVersionUID:J = 0xcL


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method

.method private static addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/photos/Size;",
            ">;",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 315
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "url"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 316
    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 317
    new-instance v1, Lcom/googlecode/flickrjandroid/photos/Size;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photos/Size;-><init>()V

    .line 318
    invoke-virtual {v1, p3}, Lcom/googlecode/flickrjandroid/photos/Size;->setLabel(I)V

    .line 319
    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setSource(Ljava/lang/String;)V

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "width"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "width"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setWidth(I)V

    .line 325
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "height"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "height"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photos/Size;->setHeight(I)V

    .line 328
    :cond_1
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    :cond_2
    return-void
.end method

.method public static final createPhoto(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/Photo;
    .locals 13

    .prologue
    const/4 v1, 0x0

    const/4 v12, -0x1

    const/4 v11, 0x0

    .line 89
    new-instance v2, Lcom/googlecode/flickrjandroid/photos/Photo;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/photos/Photo;-><init>()V

    .line 90
    const-string v0, "id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setId(Ljava/lang/String;)V

    .line 91
    const-string v0, "place_id"

    invoke-virtual {p0, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setPlaceId(Ljava/lang/String;)V

    .line 92
    const-string v0, "secret"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setSecret(Ljava/lang/String;)V

    .line 93
    const-string v0, "server"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setServer(Ljava/lang/String;)V

    .line 94
    const-string v0, "farm"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFarm(Ljava/lang/String;)V

    .line 95
    const-string v0, "rotation"

    invoke-virtual {p0, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setRotation(Ljava/lang/String;)V

    .line 96
    const-string v0, "1"

    const-string v3, "isfavorite"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFavorite(Z)V

    .line 97
    const-string v0, "isprimary"

    invoke-virtual {p0, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setPrimary(Ljava/lang/String;)V

    .line 98
    const-string v0, "license"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setLicense(Ljava/lang/String;)V

    .line 99
    const-string v0, "originalformat"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOriginalFormat(Ljava/lang/String;)V

    .line 100
    const-string v0, "originalsecret"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOriginalSecret(Ljava/lang/String;)V

    .line 101
    const-string v0, "iconserver"

    invoke-virtual {p0, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setIconServer(Ljava/lang/String;)V

    .line 102
    const-string v0, "iconfarm"

    invoke-virtual {p0, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setIconFarm(Ljava/lang/String;)V

    .line 103
    const-string v0, "datetaken"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDateTaken(Ljava/lang/String;)V

    .line 104
    const-string v0, "dateupload"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDatePosted(Ljava/lang/String;)V

    .line 105
    const-string v0, "lastupdate"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setLastUpdate(Ljava/lang/String;)V

    .line 107
    const-string v0, "dateadded"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDateAdded(Ljava/lang/String;)V

    .line 108
    const-string v0, "o_width"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOriginalWidth(Ljava/lang/String;)V

    .line 109
    const-string v0, "o_height"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOriginalHeight(Ljava/lang/String;)V

    .line 110
    const-string v0, "media"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setMedia(Ljava/lang/String;)V

    .line 111
    const-string v0, "media_status"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setMediaStatus(Ljava/lang/String;)V

    .line 112
    const-string v0, "pathalias"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setPathAlias(Ljava/lang/String;)V

    .line 114
    const-string v0, "dates"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 115
    if-eqz v0, :cond_0

    .line 116
    const-string v3, "taken"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDateTaken(Ljava/lang/String;)V

    .line 117
    const-string v3, "posted"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDatePosted(Ljava/lang/String;)V

    .line 118
    const-string v3, "lastupdate"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setLastUpdate(Ljava/lang/String;)V

    .line 124
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    const-string v3, "_sq"

    const/4 v4, 0x1

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 126
    const-string v3, "_q"

    const/4 v4, 0x6

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 127
    const-string v3, "_t"

    invoke-static {v0, p0, v3, v1}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 128
    const-string v3, "_s"

    const/4 v4, 0x2

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 129
    const-string v3, "_n"

    const/16 v4, 0xa

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 130
    const-string v3, "_m"

    const/4 v4, 0x3

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 131
    const-string v3, "_z"

    const/16 v4, 0xb

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 132
    const-string v3, "_c"

    const/16 v4, 0xc

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 133
    const-string v3, "_l"

    const/4 v4, 0x4

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 134
    const-string v3, "_h"

    const/16 v4, 0xd

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 135
    const-string v3, "_k"

    const/16 v4, 0xe

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 136
    const-string v3, "_o"

    const/4 v4, 0x5

    invoke-static {v0, p0, v3, v4}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->addSize(Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 138
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 139
    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setSizes(Ljava/util/Collection;)V

    .line 142
    :cond_1
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalFormat()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 143
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/photos/Photo;->getOriginalFormat()Ljava/lang/String;

    move-result-object v0

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 144
    :cond_2
    const-string v0, "jpg"

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOriginalFormat(Ljava/lang/String;)V

    .line 147
    :cond_3
    new-instance v3, Lcom/googlecode/flickrjandroid/people/User;

    invoke-direct {v3}, Lcom/googlecode/flickrjandroid/people/User;-><init>()V

    .line 148
    const-string v0, "owner"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 149
    const-string v0, "owner"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 150
    instance-of v4, v0, Lorg/json/JSONObject;

    if-eqz v4, :cond_a

    .line 151
    check-cast v0, Lorg/json/JSONObject;

    .line 152
    const-string v4, "nsid"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/googlecode/flickrjandroid/people/User;->setId(Ljava/lang/String;)V

    .line 153
    const-string v4, "username"

    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/googlecode/flickrjandroid/people/User;->setUsername(Ljava/lang/String;)V

    .line 154
    const-string v4, "realname"

    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/googlecode/flickrjandroid/people/User;->setRealName(Ljava/lang/String;)V

    .line 155
    const-string v4, "location"

    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/googlecode/flickrjandroid/people/User;->setLocation(Ljava/lang/String;)V

    .line 156
    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOwner(Lcom/googlecode/flickrjandroid/people/User;)V

    .line 163
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "https://flickr.com/photos/"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/people/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 164
    invoke-virtual {v2}, Lcom/googlecode/flickrjandroid/photos/Photo;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 163
    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setUrl(Ljava/lang/String;)V

    .line 167
    :cond_4
    const-string v0, "title"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 168
    if-eqz v0, :cond_b

    .line 169
    const-string v3, "_content"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTitle(Ljava/lang/String;)V

    .line 175
    :goto_1
    const-string v0, "description"

    .line 174
    invoke-static {p0, v0}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setDescription(Ljava/lang/String;)V

    .line 178
    const-string v0, "1"

    const-string v3, "ispublic"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setPublicFlag(Z)V

    .line 179
    const-string v0, "1"

    const-string v3, "isfriend"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFriendFlag(Z)V

    .line 180
    const-string v0, "1"

    const-string v3, "isfamily"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFamilyFlag(Z)V

    .line 220
    const-string v0, "comments"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 221
    const-string v0, "comments"

    invoke-static {p0, v0}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setComments(Ljava/lang/String;)V

    .line 224
    :cond_5
    const-string v0, "notes"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 225
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 226
    if-eqz v0, :cond_6

    .line 227
    const-string v4, "note"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    move v0, v1

    .line 228
    :goto_2
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-lt v0, v5, :cond_c

    .line 241
    :cond_6
    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setNotes(Ljava/util/Collection;)V

    .line 248
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 249
    const-string v0, "tags"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 250
    instance-of v4, v0, Lorg/json/JSONObject;

    if-eqz v4, :cond_e

    .line 251
    check-cast v0, Lorg/json/JSONObject;

    .line 252
    const-string v4, "tag"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 253
    :goto_3
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-lt v1, v4, :cond_d

    .line 271
    :cond_7
    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTags(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 291
    :goto_4
    const-string v0, "longitude"

    invoke-virtual {p0, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 292
    const-string v1, "latitude"

    invoke-virtual {p0, v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 293
    const-string v3, "accuracy"

    invoke-virtual {p0, v3, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 294
    const-string v4, "woeid"

    invoke-virtual {p0, v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    if-eqz v0, :cond_9

    if-eqz v1, :cond_9

    .line 296
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_9

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_9

    .line 297
    const-string v4, "0"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const-string v4, "0"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    .line 298
    :cond_8
    new-instance v4, Lcom/googlecode/flickrjandroid/photos/GeoData;

    invoke-direct {v4, v0, v1, v3}, Lcom/googlecode/flickrjandroid/photos/GeoData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setGeoData(Lcom/googlecode/flickrjandroid/photos/GeoData;)V

    .line 302
    :cond_9
    const-string v0, "stats"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 303
    if-eqz v0, :cond_f

    .line 304
    const-string v1, "views"

    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/googlecode/flickrjandroid/photos/Photo;->setViews(I)V

    .line 305
    const-string v1, "comments"

    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/googlecode/flickrjandroid/photos/Photo;->setComments(I)V

    .line 306
    const-string v1, "favorites"

    invoke-virtual {v0, v1, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFavorites(I)V

    .line 311
    :goto_5
    return-object v2

    .line 158
    :cond_a
    const-string v0, "owner"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/googlecode/flickrjandroid/people/User;->setId(Ljava/lang/String;)V

    .line 159
    const-string v0, "ownername"

    invoke-virtual {p0, v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/googlecode/flickrjandroid/people/User;->setUsername(Ljava/lang/String;)V

    .line 160
    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setOwner(Lcom/googlecode/flickrjandroid/people/User;)V

    goto/16 :goto_0

    .line 171
    :cond_b
    const-string v0, "title"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTitle(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 229
    :cond_c
    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 230
    new-instance v6, Lcom/googlecode/flickrjandroid/photos/Note;

    invoke-direct {v6}, Lcom/googlecode/flickrjandroid/photos/Note;-><init>()V

    .line 231
    const-string v7, "id"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/googlecode/flickrjandroid/photos/Note;->setId(Ljava/lang/String;)V

    .line 232
    const-string v7, "author"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/googlecode/flickrjandroid/photos/Note;->setAuthor(Ljava/lang/String;)V

    .line 233
    const-string v7, "authorname"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/googlecode/flickrjandroid/photos/Note;->setAuthorName(Ljava/lang/String;)V

    .line 234
    const-string v7, "x"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 235
    const-string v8, "y"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "w"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 236
    const-string v10, "h"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 234
    invoke-virtual {v6, v7, v8, v9, v10}, Lcom/googlecode/flickrjandroid/photos/Note;->setBounds(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const-string v7, "_content"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/googlecode/flickrjandroid/photos/Note;->setText(Ljava/lang/String;)V

    .line 238
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2

    .line 254
    :cond_d
    :try_start_1
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 255
    new-instance v5, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 256
    const-string v6, "id"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/Tag;->setId(Ljava/lang/String;)V

    .line 257
    const-string v6, "author"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/Tag;->setAuthor(Ljava/lang/String;)V

    .line 258
    const-string v6, "raw"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/googlecode/flickrjandroid/tags/Tag;->setRaw(Ljava/lang/String;)V

    .line 259
    const-string v6, "_content"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 260
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_3

    .line 262
    :cond_e
    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_7

    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 264
    const-string v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    move v0, v1

    .line 265
    :goto_6
    array-length v1, v4

    if-ge v0, v1, :cond_7

    .line 266
    new-instance v1, Lcom/googlecode/flickrjandroid/tags/Tag;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/tags/Tag;-><init>()V

    .line 267
    aget-object v5, v4, v0

    invoke-virtual {v1, v5}, Lcom/googlecode/flickrjandroid/tags/Tag;->setValue(Ljava/lang/String;)V

    .line 268
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 265
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 273
    :catch_0
    move-exception v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTags(Ljava/util/Collection;)V

    goto/16 :goto_4

    .line 308
    :cond_f
    const-string v0, "views"

    invoke-virtual {p0, v0, v12}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/googlecode/flickrjandroid/photos/Photo;->setViews(I)V

    goto/16 :goto_5
.end method

.method public static final createPhotoContext(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/PhotoContext;
    .locals 5

    .prologue
    .line 49
    const-string v0, "count"

    invoke-static {p0, v0}, Lcom/googlecode/flickrjandroid/util/JSONUtils;->getChildValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    new-instance v1, Lcom/googlecode/flickrjandroid/photos/PhotoContext;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photos/PhotoContext;-><init>()V

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->setCount(I)V

    .line 53
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 54
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 77
    return-object v1

    .line 55
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 56
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 57
    if-eqz v3, :cond_0

    .line 59
    const-string v4, "prevphoto"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 60
    new-instance v2, Lcom/googlecode/flickrjandroid/photos/Photo;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/photos/Photo;-><init>()V

    .line 61
    const-string v4, "id"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setId(Ljava/lang/String;)V

    .line 62
    const-string v4, "secret"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setSecret(Ljava/lang/String;)V

    .line 63
    const-string v4, "title"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTitle(Ljava/lang/String;)V

    .line 64
    const-string v4, "farm"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFarm(Ljava/lang/String;)V

    .line 65
    const-string v4, "url"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setUrl(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->setPreviousPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V

    goto :goto_0

    .line 67
    :cond_2
    const-string v4, "nextphoto"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 68
    new-instance v2, Lcom/googlecode/flickrjandroid/photos/Photo;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/photos/Photo;-><init>()V

    .line 69
    const-string v4, "id"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setId(Ljava/lang/String;)V

    .line 70
    const-string v4, "secret"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setSecret(Ljava/lang/String;)V

    .line 71
    const-string v4, "title"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setTitle(Ljava/lang/String;)V

    .line 72
    const-string v4, "farm"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/googlecode/flickrjandroid/photos/Photo;->setFarm(Ljava/lang/String;)V

    .line 73
    const-string v4, "url"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/photos/Photo;->setUrl(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->setNextPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V

    goto/16 :goto_0
.end method

.method public static final createPhotoList(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/PhotoList;
    .locals 4

    .prologue
    .line 342
    const-string v0, "photos"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 343
    new-instance v1, Lcom/googlecode/flickrjandroid/photos/PhotoList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/photos/PhotoList;-><init>()V

    .line 344
    const-string v2, "page"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setPage(I)V

    .line 345
    const-string v2, "pages"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setPages(I)V

    .line 346
    const-string v2, "perpage"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setPerPage(I)V

    .line 347
    const-string v2, "total"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->setTotal(I)V

    .line 349
    const-string v2, "photo"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 350
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_1

    .line 354
    :cond_0
    return-object v1

    .line 351
    :cond_1
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 352
    invoke-static {v3}, Lcom/googlecode/flickrjandroid/photos/PhotoUtils;->createPhoto(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/photos/Photo;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/photos/PhotoList;->add(Ljava/lang/Object;)Z

    .line 350
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
