.class public Lcom/mopub/volley/toolbox/ImageLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/mopub/volley/RequestQueue;

.field private b:I

.field private final c:Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;

.field private final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/mopub/volley/toolbox/h;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/mopub/volley/toolbox/h;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Handler;

.field private g:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/mopub/volley/RequestQueue;Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;)V
    .locals 2

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/16 v0, 0x64

    iput v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->b:I

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->d:Ljava/util/HashMap;

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->e:Ljava/util/HashMap;

    .line 64
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->f:Landroid/os/Handler;

    .line 85
    iput-object p1, p0, Lcom/mopub/volley/toolbox/ImageLoader;->a:Lcom/mopub/volley/RequestQueue;

    .line 86
    iput-object p2, p0, Lcom/mopub/volley/toolbox/ImageLoader;->c:Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;

    .line 87
    return-void
.end method

.method private static a(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2

    .prologue
    .line 479
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0xc

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "#W"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#H"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method private static a()V
    .locals 2

    .prologue
    .line 468
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 469
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ImageLoader must be invoked from the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 471
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/mopub/volley/toolbox/h;)V
    .locals 4

    .prologue
    .line 434
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->g:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 438
    new-instance v0, Lcom/mopub/volley/toolbox/g;

    invoke-direct {v0, p0}, Lcom/mopub/volley/toolbox/g;-><init>(Lcom/mopub/volley/toolbox/ImageLoader;)V

    iput-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->g:Ljava/lang/Runnable;

    .line 463
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/volley/toolbox/ImageLoader;->g:Ljava/lang/Runnable;

    iget v2, p0, Lcom/mopub/volley/toolbox/ImageLoader;->b:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 465
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->e:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->g:Ljava/lang/Runnable;

    return-object v0
.end method

.method public static getImageListener(Landroid/widget/ImageView;II)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;
    .locals 1

    .prologue
    .line 99
    new-instance v0, Lcom/mopub/volley/toolbox/d;

    invoke-direct {v0, p2, p0, p1}, Lcom/mopub/volley/toolbox/d;-><init>(ILandroid/widget/ImageView;I)V

    return-object v0
.end method


# virtual methods
.method protected final a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->c:Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;

    invoke-interface {v0, p1, p2}, Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 260
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/h;

    .line 262
    if-eqz v0, :cond_0

    .line 264
    invoke-static {v0, p2}, Lcom/mopub/volley/toolbox/h;->a(Lcom/mopub/volley/toolbox/h;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 267
    invoke-direct {p0, p1, v0}, Lcom/mopub/volley/toolbox/ImageLoader;->a(Ljava/lang/String;Lcom/mopub/volley/toolbox/h;)V

    .line 269
    :cond_0
    return-void
.end method

.method protected final a(Ljava/lang/String;Lcom/mopub/volley/VolleyError;)V
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/h;

    .line 280
    if-eqz v0, :cond_0

    .line 282
    invoke-virtual {v0, p2}, Lcom/mopub/volley/toolbox/h;->setError(Lcom/mopub/volley/VolleyError;)V

    .line 285
    invoke-direct {p0, p1, v0}, Lcom/mopub/volley/toolbox/ImageLoader;->a(Ljava/lang/String;Lcom/mopub/volley/toolbox/h;)V

    .line 287
    :cond_0
    return-void
.end method

.method public get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 170
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/mopub/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;II)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;II)Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;
    .locals 14

    .prologue
    .line 188
    invoke-static {}, Lcom/mopub/volley/toolbox/ImageLoader;->a()V

    .line 190
    move/from16 v0, p3

    move/from16 v1, p4

    invoke-static {p1, v0, v1}, Lcom/mopub/volley/toolbox/ImageLoader;->a(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v6

    .line 193
    iget-object v2, p0, Lcom/mopub/volley/toolbox/ImageLoader;->c:Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;

    invoke-interface {v2, v6}, Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 194
    if-eqz v4, :cond_0

    .line 196
    new-instance v2, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v2 .. v7}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;-><init>(Lcom/mopub/volley/toolbox/ImageLoader;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;)V

    .line 197
    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-interface {v0, v2, v3}, Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;->onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V

    .line 223
    :goto_0
    return-object v2

    .line 202
    :cond_0
    new-instance v2, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    const/4 v4, 0x0

    move-object v3, p0

    move-object v5, p1

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;-><init>(Lcom/mopub/volley/toolbox/ImageLoader;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;)V

    .line 206
    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-interface {v0, v2, v3}, Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;->onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V

    .line 209
    iget-object v3, p0, Lcom/mopub/volley/toolbox/ImageLoader;->d:Ljava/util/HashMap;

    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mopub/volley/toolbox/h;

    .line 210
    if-eqz v3, :cond_1

    .line 212
    invoke-virtual {v3, v2}, Lcom/mopub/volley/toolbox/h;->addContainer(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)V

    goto :goto_0

    .line 1227
    :cond_1
    new-instance v7, Lcom/mopub/volley/toolbox/ImageRequest;

    new-instance v9, Lcom/mopub/volley/toolbox/e;

    invoke-direct {v9, p0, v6}, Lcom/mopub/volley/toolbox/e;-><init>(Lcom/mopub/volley/toolbox/ImageLoader;Ljava/lang/String;)V

    sget-object v12, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    new-instance v13, Lcom/mopub/volley/toolbox/f;

    invoke-direct {v13, p0, v6}, Lcom/mopub/volley/toolbox/f;-><init>(Lcom/mopub/volley/toolbox/ImageLoader;Ljava/lang/String;)V

    move-object v8, p1

    move/from16 v10, p3

    move/from16 v11, p4

    invoke-direct/range {v7 .. v13}, Lcom/mopub/volley/toolbox/ImageRequest;-><init>(Ljava/lang/String;Lcom/mopub/volley/Response$Listener;IILandroid/graphics/Bitmap$Config;Lcom/mopub/volley/Response$ErrorListener;)V

    .line 220
    iget-object v3, p0, Lcom/mopub/volley/toolbox/ImageLoader;->a:Lcom/mopub/volley/RequestQueue;

    invoke-virtual {v3, v7}, Lcom/mopub/volley/RequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    .line 221
    iget-object v3, p0, Lcom/mopub/volley/toolbox/ImageLoader;->d:Ljava/util/HashMap;

    new-instance v4, Lcom/mopub/volley/toolbox/h;

    invoke-direct {v4, p0, v7, v2}, Lcom/mopub/volley/toolbox/h;-><init>(Lcom/mopub/volley/toolbox/ImageLoader;Lcom/mopub/volley/Request;Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)V

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public isCached(Ljava/lang/String;II)Z
    .locals 2

    .prologue
    .line 153
    invoke-static {}, Lcom/mopub/volley/toolbox/ImageLoader;->a()V

    .line 155
    invoke-static {p1, p2, p3}, Lcom/mopub/volley/toolbox/ImageLoader;->a(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    .line 156
    iget-object v1, p0, Lcom/mopub/volley/toolbox/ImageLoader;->c:Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;

    invoke-interface {v1, v0}, Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setBatchedResponseDelay(I)V
    .locals 0

    .prologue
    .line 247
    iput p1, p0, Lcom/mopub/volley/toolbox/ImageLoader;->b:I

    .line 248
    return-void
.end method
