.class public final Lcom/roidapp/photogrid/release/kp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/graphics/Bitmap;

.field private c:Lcom/roidapp/baselib/b/i;

.field private d:Landroid/content/res/Resources;

.field private e:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/roidapp/photogrid/release/kr;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/roidapp/photogrid/release/kr;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/roidapp/photogrid/release/ks;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/roidapp/photogrid/release/ks;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:Z

.field private k:Lcom/roidapp/photogrid/release/rd;

.field private l:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid/os/Handler;)V
    .locals 4

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput p2, p0, Lcom/roidapp/photogrid/release/kp;->i:I

    .line 46
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    .line 47
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    .line 48
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->g:Ljava/util/HashSet;

    .line 49
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->h:Ljava/util/HashSet;

    .line 51
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kp;->a:Landroid/content/Context;

    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->d:Landroid/content/res/Resources;

    .line 54
    new-instance v0, Lcom/roidapp/baselib/b/i;

    const v1, 0x3e19999a    # 0.15f

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v2

    long-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/b/i;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->c:Lcom/roidapp/baselib/b/i;

    .line 56
    invoke-static {}, Lcom/roidapp/photogrid/release/rd;->a()Lcom/roidapp/photogrid/release/rd;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->k:Lcom/roidapp/photogrid/release/rd;

    .line 57
    iput-object p3, p0, Lcom/roidapp/photogrid/release/kp;->l:Landroid/os/Handler;

    .line 58
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kp;Ljava/lang/String;IZ)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/kp;->a(Ljava/lang/String;IZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;IZ)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    .line 436
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->l:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 438
    const/4 v0, 0x0

    .line 439
    if-eqz p3, :cond_0

    .line 441
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 442
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 443
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kp;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 452
    :goto_0
    return-object v0

    .line 445
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 449
    :cond_0
    invoke-static {p1, p2, p2}, Lcom/roidapp/photogrid/release/rd;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/kr;
    .locals 1

    .prologue
    .line 17
    invoke-static {p0}, Lcom/roidapp/photogrid/release/kp;->b(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/kr;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kp;Lcom/roidapp/photogrid/release/kr;Z)V
    .locals 2

    .prologue
    const/4 v1, 0x6

    .line 2456
    if-eqz p2, :cond_1

    .line 2458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 2460
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 2461
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->l:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    :goto_0
    return-void

    .line 2466
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 2469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 2470
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->l:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/kp;)Z
    .locals 1

    .prologue
    .line 17
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/kp;->j:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/kp;)I
    .locals 1

    .prologue
    .line 17
    iget v0, p0, Lcom/roidapp/photogrid/release/kp;->i:I

    return v0
.end method

.method private static b(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/kr;
    .locals 2

    .prologue
    .line 283
    if-eqz p0, :cond_0

    .line 284
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/GridImageView;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 285
    instance-of v1, v0, Lcom/roidapp/photogrid/release/kq;

    if-eqz v1, :cond_0

    .line 286
    check-cast v0, Lcom/roidapp/photogrid/release/kq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kq;->a()Lcom/roidapp/photogrid/release/kr;

    move-result-object v0

    .line 289
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/kp;)Lcom/roidapp/baselib/b/i;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->c:Lcom/roidapp/baselib/b/i;

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 9

    .prologue
    const/4 v4, 0x1

    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->l:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/roidapp/photogrid/release/kr;

    .line 93
    iget-object v8, p0, Lcom/roidapp/photogrid/release/kp;->g:Ljava/util/HashSet;

    new-instance v0, Lcom/roidapp/photogrid/release/ks;

    iget-object v2, v6, Lcom/roidapp/photogrid/release/kr;->a:Ljava/lang/String;

    iget-object v3, v6, Lcom/roidapp/photogrid/release/kr;->b:Lcom/roidapp/photogrid/release/GridImageView;

    iget-boolean v5, v6, Lcom/roidapp/photogrid/release/kr;->d:Z

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/ks;-><init>(Lcom/roidapp/photogrid/release/kp;Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    invoke-virtual {v8, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    invoke-virtual {v6, v4}, Lcom/roidapp/photogrid/release/kr;->cancel(Z)Z

    goto :goto_0

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 97
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kp;->b:Landroid/graphics/Bitmap;

    .line 81
    return-void
.end method

.method protected final a(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v4, 0x1

    .line 184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->c:Lcom/roidapp/baselib/b/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->c:Lcom/roidapp/baselib/b/i;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/b/i;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 185
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_2

    .line 186
    invoke-virtual {p2, v0}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/Bitmap;)V

    .line 199
    :cond_0
    :goto_1
    return-void

    .line 184
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 187
    :cond_2
    if-nez p3, :cond_5

    .line 2240
    invoke-static {p2}, Lcom/roidapp/photogrid/release/kp;->b(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/kr;

    move-result-object v0

    .line 2241
    if-eqz v0, :cond_4

    .line 2242
    iget-object v1, v0, Lcom/roidapp/photogrid/release/kr;->a:Ljava/lang/String;

    .line 2243
    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 2244
    :cond_3
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/kr;->cancel(Z)Z

    .line 2245
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_4
    move v0, v4

    .line 187
    :goto_2
    if-eqz v0, :cond_0

    .line 188
    :cond_5
    new-instance v0, Lcom/roidapp/photogrid/release/kr;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/kr;-><init>(Lcom/roidapp/photogrid/release/kp;Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    .line 189
    new-instance v1, Lcom/roidapp/photogrid/release/kq;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kp;->d:Landroid/content/res/Resources;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/kp;->b:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2, v3, v0}, Lcom/roidapp/photogrid/release/kq;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/kr;)V

    .line 190
    invoke-virtual {p2, v1}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 192
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 195
    sget-object v1, Lcom/roidapp/baselib/c/c;->EXECUTOR_SHAPE:Ljava/util/concurrent/Executor;

    new-array v2, v4, [Ljava/lang/String;

    aput-object p1, v2, v6

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/kr;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_1

    :cond_6
    move v0, v6

    .line 2247
    goto :goto_2
.end method

.method protected final b()V
    .locals 9

    .prologue
    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->l:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/roidapp/photogrid/release/kr;

    .line 107
    iget-object v8, p0, Lcom/roidapp/photogrid/release/kp;->h:Ljava/util/HashSet;

    new-instance v0, Lcom/roidapp/photogrid/release/ks;

    iget-object v2, v6, Lcom/roidapp/photogrid/release/kr;->a:Ljava/lang/String;

    iget-object v3, v6, Lcom/roidapp/photogrid/release/kr;->b:Lcom/roidapp/photogrid/release/GridImageView;

    const/4 v4, 0x0

    iget-boolean v5, v6, Lcom/roidapp/photogrid/release/kr;->d:Z

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/ks;-><init>(Lcom/roidapp/photogrid/release/kp;Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    invoke-virtual {v8, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 108
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/roidapp/photogrid/release/kr;->cancel(Z)Z

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 112
    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v4, 0x0

    .line 209
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->c:Lcom/roidapp/baselib/b/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->c:Lcom/roidapp/baselib/b/i;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/b/i;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 210
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_2

    .line 211
    invoke-virtual {p2, v0}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/Bitmap;)V

    .line 223
    :cond_0
    :goto_1
    return-void

    .line 209
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 212
    :cond_2
    if-nez p3, :cond_5

    .line 2261
    invoke-static {p2}, Lcom/roidapp/photogrid/release/kp;->b(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/kr;

    move-result-object v0

    .line 2262
    if-eqz v0, :cond_4

    .line 2263
    iget-object v1, v0, Lcom/roidapp/photogrid/release/kr;->a:Ljava/lang/String;

    .line 2264
    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 2265
    :cond_3
    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/kr;->cancel(Z)Z

    .line 2266
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_4
    move v0, v6

    .line 212
    :goto_2
    if-eqz v0, :cond_0

    .line 213
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->l:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 214
    new-instance v0, Lcom/roidapp/photogrid/release/kr;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/kr;-><init>(Lcom/roidapp/photogrid/release/kp;Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    .line 215
    new-instance v1, Lcom/roidapp/photogrid/release/kq;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/kp;->d:Landroid/content/res/Resources;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/kp;->b:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2, v3, v0}, Lcom/roidapp/photogrid/release/kq;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/kr;)V

    .line 216
    invoke-virtual {p2, v1}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 217
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 220
    sget-object v1, Lcom/roidapp/baselib/c/c;->EXECUTOR_SHAPE:Ljava/util/concurrent/Executor;

    new-array v2, v6, [Ljava/lang/String;

    aput-object p1, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/kr;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_1

    :cond_6
    move v0, v4

    .line 2268
    goto :goto_2
.end method

.method protected final c()V
    .locals 5

    .prologue
    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->g:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ks;

    .line 121
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ks;->a:Ljava/lang/String;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ks;->b:Lcom/roidapp/photogrid/release/GridImageView;

    const/4 v4, 0x1

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ks;->d:Z

    invoke-virtual {p0, v2, v3, v4, v0}, Lcom/roidapp/photogrid/release/kp;->a(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    goto :goto_0

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->g:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 126
    return-void
.end method

.method protected final d()V
    .locals 5

    .prologue
    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->h:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ks;

    .line 134
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ks;->a:Ljava/lang/String;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ks;->b:Lcom/roidapp/photogrid/release/GridImageView;

    const/4 v4, 0x1

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ks;->d:Z

    invoke-virtual {p0, v2, v3, v4, v0}, Lcom/roidapp/photogrid/release/kp;->b(Ljava/lang/String;Lcom/roidapp/photogrid/release/GridImageView;ZZ)V

    goto :goto_0

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->h:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 138
    return-void
.end method

.method public final e()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 143
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/kp;->j:Z

    .line 1156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kr;

    .line 1157
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/kr;->cancel(Z)Z

    goto :goto_0

    .line 1159
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 1160
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kr;

    .line 1161
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/kr;->cancel(Z)Z

    goto :goto_1

    .line 1163
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 1165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->g:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 1166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->h:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 145
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 148
    .line 2068
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->c:Lcom/roidapp/baselib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/i;->a()V

    .line 2069
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2070
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 2071
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/kp;->b:Landroid/graphics/Bitmap;

    .line 149
    :cond_0
    return-void
.end method

.method protected final g()V
    .locals 3

    .prologue
    .line 226
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kr;

    .line 227
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/kr;->cancel(Z)Z

    goto :goto_0

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 230
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kp;->h:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 231
    return-void
.end method
