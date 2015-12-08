.class public final Lcom/facebook/Profile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/Profile;",
            ">;"
        }
    .end annotation
.end field

.field private static final FIRST_NAME_KEY:Ljava/lang/String; = "first_name"

.field private static final ID_KEY:Ljava/lang/String; = "id"

.field private static final LAST_NAME_KEY:Ljava/lang/String; = "last_name"

.field private static final LINK_URI_KEY:Ljava/lang/String; = "link_uri"

.field private static final MIDDLE_NAME_KEY:Ljava/lang/String; = "middle_name"

.field private static final NAME_KEY:Ljava/lang/String; = "name"


# instance fields
.field private final firstName:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final lastName:Ljava/lang/String;

.field private final linkUri:Landroid/net/Uri;

.field private final middleName:Ljava/lang/String;

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 301
    new-instance v0, Lcom/facebook/Profile$2;

    invoke-direct {v0}, Lcom/facebook/Profile$2;-><init>()V

    sput-object v0, Lcom/facebook/Profile;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 277
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    .line 278
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    .line 279
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    .line 280
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    .line 282
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 283
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    .line 284
    return-void

    .line 283
    :cond_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/Profile$1;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/Profile;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    const-string v0, "id"

    invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    iput-object p1, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    .line 137
    iput-object p2, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    .line 138
    iput-object p3, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    .line 139
    iput-object p4, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    .line 140
    iput-object p5, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    .line 141
    iput-object p6, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    .line 142
    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 267
    const-string v1, "id"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    .line 268
    const-string v1, "first_name"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    .line 269
    const-string v1, "middle_name"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    .line 270
    const-string v1, "last_name"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    .line 271
    const-string v1, "name"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    .line 272
    const-string v1, "link_uri"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 273
    if-nez v1, :cond_0

    :goto_0
    iput-object v0, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    .line 274
    return-void

    .line 273
    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public static fetchProfileForCurrentAccessToken()V
    .locals 2

    .prologue
    .line 80
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 81
    if-nez v0, :cond_0

    .line 82
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/facebook/Profile;->setCurrentProfile(Lcom/facebook/Profile;)V

    .line 111
    :goto_0
    return-void

    .line 86
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/Profile$1;

    invoke-direct {v1}, Lcom/facebook/Profile$1;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->getGraphMeRequestWithCacheAsync(Ljava/lang/String;Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;)V

    goto :goto_0
.end method

.method public static getCurrentProfile()Lcom/facebook/Profile;
    .locals 1

    .prologue
    .line 60
    invoke-static {}, Lcom/facebook/ProfileManager;->getInstance()Lcom/facebook/ProfileManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ProfileManager;->getCurrentProfile()Lcom/facebook/Profile;

    move-result-object v0

    return-object v0
.end method

.method public static setCurrentProfile(Lcom/facebook/Profile;)V
    .locals 1

    .prologue
    .line 71
    invoke-static {}, Lcom/facebook/ProfileManager;->getInstance()Lcom/facebook/ProfileManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ProfileManager;->setCurrentProfile(Lcom/facebook/Profile;)V

    .line 72
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .prologue
    .line 288
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 207
    if-ne p0, p1, :cond_1

    .line 217
    :cond_0
    :goto_0
    return v0

    .line 211
    :cond_1
    instance-of v2, p1, Lcom/facebook/Profile;

    if-nez v2, :cond_2

    move v0, v1

    .line 212
    goto :goto_0

    .line 215
    :cond_2
    check-cast p1, Lcom/facebook/Profile;

    .line 217
    iget-object v2, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/Profile;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    if-nez v2, :cond_3

    iget-object v2, p1, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    if-nez v2, :cond_4

    iget-object v2, p1, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    if-nez v2, :cond_5

    iget-object v2, p1, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    if-nez v2, :cond_6

    iget-object v2, p1, Lcom/facebook/Profile;->name:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/Profile;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    if-nez v2, :cond_7

    iget-object v2, p1, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    iget-object v1, p1, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final getFirstName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkUri()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getMiddleName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getProfilePictureUri(II)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lcom/facebook/internal/ImageRequest;->getProfilePictureUri(Ljava/lang/String;II)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    .line 230
    iget-object v1, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 231
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 233
    :cond_0
    iget-object v1, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 234
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 236
    :cond_1
    iget-object v1, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 237
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 239
    :cond_2
    iget-object v1, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 240
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 242
    :cond_3
    iget-object v1, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    if-eqz v1, :cond_4

    .line 243
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 246
    :cond_4
    return v0
.end method

.method final toJSONObject()Lorg/json/JSONObject;
    .locals 3

    .prologue
    .line 250
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 252
    :try_start_0
    const-string v1, "id"

    iget-object v2, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 253
    const-string v1, "first_name"

    iget-object v2, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 254
    const-string v1, "middle_name"

    iget-object v2, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 255
    const-string v1, "last_name"

    iget-object v2, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 256
    const-string v1, "name"

    iget-object v2, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 257
    iget-object v1, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    if-eqz v1, :cond_0

    .line 258
    const-string v1, "link_uri"

    iget-object v2, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    :cond_0
    :goto_0
    return-object v0

    .line 261
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/Profile;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 294
    iget-object v0, p0, Lcom/facebook/Profile;->firstName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lcom/facebook/Profile;->middleName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lcom/facebook/Profile;->lastName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 297
    iget-object v0, p0, Lcom/facebook/Profile;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 298
    iget-object v0, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 299
    return-void

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/facebook/Profile;->linkUri:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
