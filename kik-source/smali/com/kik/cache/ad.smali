.class public final Lcom/kik/cache/ad;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cache/ad$a;,
        Lcom/kik/cache/ad$c;,
        Lcom/kik/cache/ad$d;,
        Lcom/kik/cache/ad$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/kik/cache/ad$d;


# instance fields
.field private final b:Lcom/android/volley/p;

.field private final c:Lcom/kik/cache/ap;

.field private d:I

.field private final e:Lcom/kik/cache/ad$b;

.field private final f:Ljava/util/HashMap;

.field private final g:Ljava/util/HashMap;

.field private final h:Landroid/os/Handler;

.field private i:Ljava/lang/Runnable;

.field private j:Lcom/kik/g/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 72
    new-instance v0, Lcom/kik/cache/ae;

    invoke-direct {v0}, Lcom/kik/cache/ae;-><init>()V

    sput-object v0, Lcom/kik/cache/ad;->a:Lcom/kik/cache/ad$d;

    return-void
.end method

.method public constructor <init>(Lcom/android/volley/p;Lcom/kik/cache/ad$b;Lcom/kik/cache/ap;)V
    .locals 2

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/16 v0, 0x64

    iput v0, p0, Lcom/kik/cache/ad;->d:I

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ad;->f:Ljava/util/HashMap;

    .line 63
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/ad;->g:Ljava/util/HashMap;

    .line 66
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/kik/cache/ad;->h:Landroid/os/Handler;

    .line 70
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cache/ad;->j:Lcom/kik/g/k;

    .line 103
    iput-object p3, p0, Lcom/kik/cache/ad;->c:Lcom/kik/cache/ap;

    .line 104
    iput-object p1, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    .line 105
    iput-object p2, p0, Lcom/kik/cache/ad;->e:Lcom/kik/cache/ad$b;

    .line 106
    return-void
.end method

.method private a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZZ)Lcom/kik/cache/ad$c;
    .locals 10

    .prologue
    .line 246
    if-nez p6, :cond_0

    .line 247
    invoke-static {}, Lcom/kik/cache/ad;->d()V

    .line 249
    :cond_0
    invoke-virtual {p1}, Lcom/kik/cache/z;->d()Ljava/lang/String;

    move-result-object v3

    .line 250
    invoke-virtual {p1, p3, p4}, Lcom/kik/cache/z;->a(II)Ljava/lang/String;

    move-result-object v4

    .line 252
    iget-object v0, p0, Lcom/kik/cache/ad;->e:Lcom/kik/cache/ad$b;

    invoke-interface {v0, v4}, Lcom/kik/cache/ad$b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 253
    if-eqz v2, :cond_1

    .line 255
    new-instance v0, Lcom/kik/cache/ad$c;

    const/4 v5, 0x0

    move-object v1, p0

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/kik/cache/ad$c;-><init>(Lcom/kik/cache/ad;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/kik/cache/ad$d;II)V

    .line 256
    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Lcom/kik/cache/ad$d;->a(Lcom/kik/cache/ad$c;Z)V

    .line 341
    :goto_0
    return-object v0

    .line 260
    :cond_1
    const/4 v8, 0x0

    .line 261
    if-eqz p5, :cond_9

    .line 265
    :try_start_0
    invoke-virtual {p1}, Lcom/kik/cache/z;->e()Ljava/lang/String;

    move-result-object v0

    .line 266
    if-eqz v0, :cond_9

    .line 267
    iget-object v1, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    invoke-virtual {v1}, Lcom/android/volley/p;->c()Lcom/android/volley/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/android/volley/b;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v9

    .line 268
    if-eqz v9, :cond_9

    iget-object v0, v9, Lcom/android/volley/b$a;->a:[B

    if-eqz v0, :cond_9

    .line 269
    iget-object v0, v9, Lcom/android/volley/b$a;->a:[B

    const/4 v1, 0x0

    iget-object v2, v9, Lcom/android/volley/b$a;->a:[B

    array-length v2, v2

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 271
    invoke-virtual {p1, v0}, Lcom/kik/cache/z;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 272
    if-eqz v2, :cond_9

    .line 273
    new-instance v0, Lcom/kik/cache/ad$c;

    move-object v1, p0

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/kik/cache/ad$c;-><init>(Lcom/kik/cache/ad;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/kik/cache/ad$d;II)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 274
    :try_start_1
    invoke-virtual {v9}, Lcom/android/volley/b$a;->a()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v9}, Lcom/android/volley/b$a;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    const/4 v1, 0x1

    .line 275
    :goto_1
    if-nez v1, :cond_3

    .line 277
    iget-object v1, p0, Lcom/kik/cache/ad;->e:Lcom/kik/cache/ad$b;

    invoke-interface {v1, v4, v2}, Lcom/kik/cache/ad$b;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 278
    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Lcom/kik/cache/ad$d;->a(Lcom/kik/cache/ad$c;Z)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v8, v0

    :goto_2
    move-object v0, v8

    .line 291
    :cond_3
    :goto_3
    if-nez v0, :cond_8

    .line 293
    new-instance v0, Lcom/kik/cache/ad$c;

    const/4 v2, 0x0

    move-object v1, p0

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/kik/cache/ad$c;-><init>(Lcom/kik/cache/ad;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/kik/cache/ad$d;II)V

    move-object v1, v0

    .line 296
    :goto_4
    const/4 v0, 0x1

    invoke-interface {p2, v1, v0}, Lcom/kik/cache/ad$d;->a(Lcom/kik/cache/ad$c;Z)V

    .line 298
    iget-object v0, p0, Lcom/kik/cache/ad;->f:Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad$a;

    .line 299
    if-eqz v0, :cond_5

    .line 301
    invoke-virtual {v0, v1}, Lcom/kik/cache/ad$a;->a(Lcom/kik/cache/ad$c;)V

    move-object v0, v1

    .line 302
    goto :goto_0

    .line 274
    :cond_4
    const/4 v1, 0x0

    goto :goto_1

    .line 305
    :cond_5
    invoke-virtual {p1}, Lcom/kik/cache/z;->e()Ljava/lang/String;

    move-result-object v0

    .line 308
    new-instance v2, Lcom/kik/cache/af;

    invoke-direct {v2, p0, v4, v0}, Lcom/kik/cache/af;-><init>(Lcom/kik/cache/ad;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, p1, Lcom/kik/cache/z;->c:Lcom/android/volley/r$a;

    .line 316
    new-instance v0, Lcom/kik/cache/ag;

    invoke-direct {v0, p0, v4, p1}, Lcom/kik/cache/ag;-><init>(Lcom/kik/cache/ad;Ljava/lang/String;Lcom/kik/cache/z;)V

    iput-object v0, p1, Lcom/kik/cache/z;->b:Lcom/android/volley/r$b;

    .line 329
    invoke-virtual {p1}, Lcom/kik/cache/z;->w()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 330
    iget-object v0, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    invoke-virtual {v0, p1}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 340
    :goto_5
    iget-object v0, p0, Lcom/kik/cache/ad;->f:Ljava/util/HashMap;

    new-instance v2, Lcom/kik/cache/ad$a;

    invoke-direct {v2, p0, p1, v1}, Lcom/kik/cache/ad$a;-><init>(Lcom/kik/cache/ad;Lcom/android/volley/n;Lcom/kik/cache/ad$c;)V

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 341
    goto/16 :goto_0

    .line 333
    :cond_6
    iget-object v0, p0, Lcom/kik/cache/ad;->c:Lcom/kik/cache/ap;

    if-eqz v0, :cond_7

    .line 334
    iget-object v0, p0, Lcom/kik/cache/ad;->c:Lcom/kik/cache/ap;

    invoke-virtual {v0, p1}, Lcom/kik/cache/ap;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    goto :goto_5

    .line 337
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "attempted to queue offline request to Loader with no offline queue"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_8
    move-object v1, v0

    goto :goto_4

    :cond_9
    move-object v0, v8

    goto :goto_3
.end method

.method static synthetic a(Lcom/kik/cache/ad;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cache/ad;->j:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/cache/ad;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 46
    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/kik/cache/ad;->e:Lcom/kik/cache/ad$b;

    invoke-interface {v0, p1, p2}, Lcom/kik/cache/ad$b;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :goto_0
    iget-object v0, p0, Lcom/kik/cache/ad;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad$a;

    if-eqz v0, :cond_0

    invoke-static {v0, p2}, Lcom/kik/cache/ad$a;->a(Lcom/kik/cache/ad$a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    invoke-direct {p0, p1, v0}, Lcom/kik/cache/ad;->a(Ljava/lang/String;Lcom/kik/cache/ad$a;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "attempted to add a null item to our memory cache!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/cache/ad;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/w;)V
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cache/ad;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad$a;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/kik/cache/ad$a;->a(Lcom/kik/cache/ad$a;)Lcom/android/volley/n;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/kik/cache/ad$a;->a(Lcom/kik/cache/ad$a;)Lcom/android/volley/n;

    move-result-object v1

    instance-of v1, v1, Lcom/kik/cache/z;

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/kik/cache/ad$a;->a(Lcom/kik/cache/ad$a;)Lcom/android/volley/n;

    move-result-object v1

    check-cast v1, Lcom/kik/cache/z;

    invoke-virtual {v1}, Lcom/kik/cache/z;->e_()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p2, :cond_0

    iget-object v2, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    invoke-virtual {v2}, Lcom/android/volley/p;->c()Lcom/android/volley/b;

    move-result-object v2

    if-nez v2, :cond_3

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Lcom/kik/cache/z;->b(Lcom/android/volley/b$a;)Lcom/android/volley/b$a;

    move-result-object v1

    instance-of v2, p3, Lcom/android/volley/l;

    if-nez v2, :cond_1

    if-eqz p2, :cond_1

    if-nez v1, :cond_4

    :cond_1
    :goto_1
    invoke-virtual {v0, p3}, Lcom/kik/cache/ad$a;->a(Lcom/android/volley/w;)V

    invoke-direct {p0, p1, v0}, Lcom/kik/cache/ad;->a(Ljava/lang/String;Lcom/kik/cache/ad$a;)V

    :cond_2
    return-void

    :cond_3
    iget-object v2, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    invoke-virtual {v2}, Lcom/android/volley/p;->c()Lcom/android/volley/b;

    move-result-object v2

    invoke-interface {v2, p2}, Lcom/android/volley/b;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v2

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    invoke-virtual {v2}, Lcom/android/volley/p;->c()Lcom/android/volley/b;

    move-result-object v2

    invoke-interface {v2, p2, v1}, Lcom/android/volley/b;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Lcom/kik/cache/ad$a;)V
    .locals 4

    .prologue
    .line 601
    iget-object v0, p0, Lcom/kik/cache/ad;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    iget-object v0, p0, Lcom/kik/cache/ad;->i:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 605
    new-instance v0, Lcom/kik/cache/ah;

    invoke-direct {v0, p0}, Lcom/kik/cache/ah;-><init>(Lcom/kik/cache/ad;)V

    iput-object v0, p0, Lcom/kik/cache/ad;->i:Ljava/lang/Runnable;

    .line 631
    iget-object v0, p0, Lcom/kik/cache/ad;->h:Landroid/os/Handler;

    iget-object v1, p0, Lcom/kik/cache/ad;->i:Ljava/lang/Runnable;

    iget v2, p0, Lcom/kik/cache/ad;->d:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 633
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/kik/cache/ad;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cache/ad;->f:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cache/ad;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cache/ad;->g:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cache/ad;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cache/ad;->i:Ljava/lang/Runnable;

    return-object v0
.end method

.method private static d()V
    .locals 2

    .prologue
    .line 637
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 638
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ImageLoader must be invoked from the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 640
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;)Lcom/kik/cache/ad$c;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 209
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, v3

    move v5, v3

    move v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZZ)Lcom/kik/cache/ad$c;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZ)Lcom/kik/cache/ad$c;
    .locals 7

    .prologue
    .line 233
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZZ)Lcom/kik/cache/ad$c;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;Z)Lcom/kik/cache/ad$c;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 239
    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, v3

    move v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZZ)Lcom/kik/cache/ad$c;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/kik/cache/ad;->j:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/graphics/Bitmap;Lcom/kik/cache/z;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 190
    invoke-virtual {p2, v0, v0}, Lcom/kik/cache/z;->a(II)Ljava/lang/String;

    move-result-object v0

    .line 191
    iget-object v1, p0, Lcom/kik/cache/ad;->e:Lcom/kik/cache/ad$b;

    invoke-interface {v1, v0, p1}, Lcom/kik/cache/ad$b;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 195
    return-void
.end method

.method public final a(Lcom/kik/cache/z;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 183
    invoke-static {}, Lcom/kik/cache/ad;->d()V

    .line 184
    invoke-virtual {p1, v0, v0}, Lcom/kik/cache/z;->a(II)Ljava/lang/String;

    move-result-object v1

    .line 185
    iget-object v2, p0, Lcom/kik/cache/ad;->e:Lcom/kik/cache/ad$b;

    invoke-interface {v2, v1}, Lcom/kik/cache/ad$b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 351
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/ad;->d:I

    .line 352
    return-void
.end method

.method public final c()Lcom/android/volley/p;
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Lcom/kik/cache/ad;->b:Lcom/android/volley/p;

    return-object v0
.end method
