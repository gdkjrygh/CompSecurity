.class public final Lcom/mopub/common/HttpResponses;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static asBitmap(Lcom/mopub/common/DownloadResponse;)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 15
    if-nez p0, :cond_0

    .line 16
    const/4 v0, 0x0

    .line 20
    :goto_0
    return-object v0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/common/DownloadResponse;->getByteArray()[B

    move-result-object v0

    .line 20
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method public static asJsonObject(Lcom/mopub/common/DownloadResponse;)Lorg/json/JSONObject;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 24
    if-nez p0, :cond_0

    .line 34
    :goto_0
    return-object v0

    .line 29
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/mopub/common/HttpResponses;->asResponseString(Lcom/mopub/common/DownloadResponse;)Ljava/lang/String;

    move-result-object v1

    .line 31
    new-instance v2, Lorg/json/JSONTokener;

    invoke-direct {v2, v1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 32
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Lorg/json/JSONTokener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    .line 34
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static asResponseString(Lcom/mopub/common/DownloadResponse;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 39
    if-nez p0, :cond_0

    .line 46
    :goto_0
    return-object v0

    .line 44
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/mopub/common/DownloadResponse;->getByteArray()[B

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    .line 46
    :catch_0
    move-exception v1

    goto :goto_0
.end method
