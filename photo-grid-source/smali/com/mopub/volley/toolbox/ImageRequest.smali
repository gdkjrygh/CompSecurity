.class public Lcom/mopub/volley/toolbox/ImageRequest;
.super Lcom/mopub/volley/Request;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mopub/volley/Request",
        "<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/Object;


# instance fields
.field private final a:Lcom/mopub/volley/Response$Listener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mopub/volley/Response$Listener",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/graphics/Bitmap$Config;

.field private final c:I

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/mopub/volley/toolbox/ImageRequest;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/mopub/volley/Response$Listener;IILandroid/graphics/Bitmap$Config;Lcom/mopub/volley/Response$ErrorListener;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/mopub/volley/Response$Listener",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Landroid/graphics/Bitmap$Config;",
            "Lcom/mopub/volley/Response$ErrorListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p6}, Lcom/mopub/volley/Request;-><init>(ILjava/lang/String;Lcom/mopub/volley/Response$ErrorListener;)V

    .line 72
    new-instance v0, Lcom/mopub/volley/DefaultRetryPolicy;

    const/16 v1, 0x3e8

    const/4 v2, 0x2

    const/high16 v3, 0x40000000    # 2.0f

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/volley/DefaultRetryPolicy;-><init>(IIF)V

    invoke-virtual {p0, v0}, Lcom/mopub/volley/toolbox/ImageRequest;->setRetryPolicy(Lcom/mopub/volley/RetryPolicy;)Lcom/mopub/volley/Request;

    .line 74
    iput-object p2, p0, Lcom/mopub/volley/toolbox/ImageRequest;->a:Lcom/mopub/volley/Response$Listener;

    .line 75
    iput-object p5, p0, Lcom/mopub/volley/toolbox/ImageRequest;->b:Landroid/graphics/Bitmap$Config;

    .line 76
    iput p3, p0, Lcom/mopub/volley/toolbox/ImageRequest;->c:I

    .line 77
    iput p4, p0, Lcom/mopub/volley/toolbox/ImageRequest;->d:I

    .line 78
    return-void
.end method

.method private static a(IIII)I
    .locals 6

    .prologue
    .line 99
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    move p0, p2

    .line 118
    :cond_0
    :goto_0
    return p0

    .line 104
    :cond_1
    if-nez p0, :cond_2

    .line 105
    int-to-double v0, p1

    int-to-double v2, p3

    div-double/2addr v0, v2

    .line 106
    int-to-double v2, p2

    mul-double/2addr v0, v2

    double-to-int p0, v0

    goto :goto_0

    .line 109
    :cond_2
    if-eqz p1, :cond_0

    .line 113
    int-to-double v0, p3

    int-to-double v2, p2

    div-double/2addr v0, v2

    .line 115
    int-to-double v2, p0

    mul-double/2addr v2, v0

    int-to-double v4, p1

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    .line 116
    int-to-double v2, p1

    div-double v0, v2, v0

    double-to-int p0, v0

    goto :goto_0
.end method

.method private static b(IIII)I
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 201
    int-to-double v0, p0

    int-to-double v2, p2

    div-double/2addr v0, v2

    .line 202
    int-to-double v2, p1

    int-to-double v4, p3

    div-double/2addr v2, v4

    .line 203
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    .line 204
    const/high16 v0, 0x3f800000    # 1.0f

    .line 205
    :goto_0
    mul-float v1, v0, v6

    float-to-double v4, v1

    cmpg-double v1, v4, v2

    if-gtz v1, :cond_0

    .line 206
    mul-float/2addr v0, v6

    goto :goto_0

    .line 209
    :cond_0
    float-to-int v0, v0

    return v0
.end method


# virtual methods
.method protected final a(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Response;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/NetworkResponse;",
            ")",
            "Lcom/mopub/volley/Response",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 124
    sget-object v2, Lcom/mopub/volley/toolbox/ImageRequest;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 1138
    :try_start_0
    iget-object v0, p1, Lcom/mopub/volley/NetworkResponse;->data:[B

    .line 1139
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1141
    iget v3, p0, Lcom/mopub/volley/toolbox/ImageRequest;->c:I

    if-nez v3, :cond_0

    iget v3, p0, Lcom/mopub/volley/toolbox/ImageRequest;->d:I

    if-nez v3, :cond_0

    .line 1142
    iget-object v3, p0, Lcom/mopub/volley/toolbox/ImageRequest;->b:Landroid/graphics/Bitmap$Config;

    iput-object v3, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1143
    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v0, v3, v4, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1177
    :goto_0
    if-nez v0, :cond_3

    .line 1178
    new-instance v0, Lcom/mopub/volley/ParseError;

    invoke-direct {v0, p1}, Lcom/mopub/volley/ParseError;-><init>(Lcom/mopub/volley/NetworkResponse;)V

    invoke-static {v0}, Lcom/mopub/volley/Response;->error(Lcom/mopub/volley/VolleyError;)Lcom/mopub/volley/Response;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 126
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    :goto_2
    return-object v0

    .line 1146
    :cond_0
    const/4 v3, 0x1

    :try_start_2
    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1147
    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v0, v3, v4, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1148
    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1149
    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1152
    iget v5, p0, Lcom/mopub/volley/toolbox/ImageRequest;->c:I

    iget v6, p0, Lcom/mopub/volley/toolbox/ImageRequest;->d:I

    invoke-static {v5, v6, v3, v4}, Lcom/mopub/volley/toolbox/ImageRequest;->a(IIII)I

    move-result v5

    .line 1154
    iget v6, p0, Lcom/mopub/volley/toolbox/ImageRequest;->d:I

    iget v7, p0, Lcom/mopub/volley/toolbox/ImageRequest;->c:I

    invoke-static {v6, v7, v4, v3}, Lcom/mopub/volley/toolbox/ImageRequest;->a(IIII)I

    move-result v6

    .line 1158
    const/4 v7, 0x0

    iput-boolean v7, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1161
    invoke-static {v3, v4, v5, v6}, Lcom/mopub/volley/toolbox/ImageRequest;->b(IIII)I

    move-result v3

    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1163
    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v0, v3, v4, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1167
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt v0, v5, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-le v0, v6, :cond_2

    .line 1169
    :cond_1
    const/4 v0, 0x1

    invoke-static {v1, v5, v6, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1171
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 127
    :catch_0
    move-exception v0

    .line 128
    :try_start_3
    const-string v1, "Caught OOM for %d byte image, url=%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p1, Lcom/mopub/volley/NetworkResponse;->data:[B

    array-length v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/ImageRequest;->getUrl()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v3}, Lcom/mopub/volley/VolleyLog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    new-instance v1, Lcom/mopub/volley/ParseError;

    invoke-direct {v1, v0}, Lcom/mopub/volley/ParseError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1}, Lcom/mopub/volley/Response;->error(Lcom/mopub/volley/VolleyError;)Lcom/mopub/volley/Response;

    move-result-object v0

    monitor-exit v2

    goto :goto_2

    .line 131
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_2
    move-object v0, v1

    .line 1173
    goto :goto_0

    .line 1180
    :cond_3
    :try_start_4
    invoke-static {p1}, Lcom/mopub/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/mopub/volley/NetworkResponse;)Lcom/mopub/volley/Cache$Entry;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/volley/Response;->success(Ljava/lang/Object;Lcom/mopub/volley/Cache$Entry;)Lcom/mopub/volley/Response;
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    goto :goto_1
.end method

.method protected synthetic deliverResponse(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 34
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1186
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageRequest;->a:Lcom/mopub/volley/Response$Listener;

    invoke-interface {v0, p1}, Lcom/mopub/volley/Response$Listener;->onResponse(Ljava/lang/Object;)V

    .line 34
    return-void
.end method

.method public getPriority()Lcom/mopub/volley/Request$Priority;
    .locals 1

    .prologue
    .line 82
    sget-object v0, Lcom/mopub/volley/Request$Priority;->LOW:Lcom/mopub/volley/Request$Priority;

    return-object v0
.end method
