.class public Lcom/facebook/n/c;
.super Ljava/lang/Object;
.source "Spring.java"


# static fields
.field private static a:I


# instance fields
.field private b:Lcom/facebook/n/g;

.field private c:Z

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/n/e;

.field private final f:Lcom/facebook/n/e;

.field private final g:Lcom/facebook/n/e;

.field private h:D

.field private i:D

.field private j:Z

.field private k:D

.field private l:D

.field private m:Lcom/facebook/common/b/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/b/d",
            "<",
            "Lcom/facebook/n/i;",
            ">;"
        }
    .end annotation
.end field

.field private n:D

.field private final o:Lcom/facebook/n/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    sput v0, Lcom/facebook/n/c;->a:I

    return-void
.end method

.method constructor <init>(Lcom/facebook/n/j;)V
    .locals 4
    .param p1    # Lcom/facebook/n/j;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .prologue
    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    const/4 v1, 0x0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lcom/facebook/n/e;

    invoke-direct {v0, v1}, Lcom/facebook/n/e;-><init>(Lcom/facebook/n/d;)V

    iput-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    .line 36
    new-instance v0, Lcom/facebook/n/e;

    invoke-direct {v0, v1}, Lcom/facebook/n/e;-><init>(Lcom/facebook/n/d;)V

    iput-object v0, p0, Lcom/facebook/n/c;->f:Lcom/facebook/n/e;

    .line 37
    new-instance v0, Lcom/facebook/n/e;

    invoke-direct {v0, v1}, Lcom/facebook/n/e;-><init>(Lcom/facebook/n/d;)V

    iput-object v0, p0, Lcom/facebook/n/c;->g:Lcom/facebook/n/e;

    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/n/c;->j:Z

    .line 42
    iput-wide v2, p0, Lcom/facebook/n/c;->k:D

    .line 43
    iput-wide v2, p0, Lcom/facebook/n/c;->l:D

    .line 44
    new-instance v0, Lcom/facebook/common/b/d;

    invoke-direct {v0}, Lcom/facebook/common/b/d;-><init>()V

    iput-object v0, p0, Lcom/facebook/n/c;->m:Lcom/facebook/common/b/d;

    .line 45
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/n/c;->n:D

    .line 53
    const-string v0, "Spring cannot be created outside of a SpringSystem"

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iput-object p1, p0, Lcom/facebook/n/c;->o:Lcom/facebook/n/j;

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "spring:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/facebook/n/c;->a:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/facebook/n/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/n/c;->d:Ljava/lang/String;

    .line 56
    return-void
.end method

.method private a(Lcom/facebook/n/e;)D
    .locals 4

    .prologue
    .line 140
    iget-wide v0, p0, Lcom/facebook/n/c;->i:D

    iget-wide v2, p1, Lcom/facebook/n/e;->a:D

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    return-wide v0
.end method

.method private f(D)V
    .locals 9

    .prologue
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 462
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-object v1, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v1, v1, Lcom/facebook/n/e;->a:D

    mul-double/2addr v1, p1

    iget-object v3, p0, Lcom/facebook/n/c;->f:Lcom/facebook/n/e;

    iget-wide v3, v3, Lcom/facebook/n/e;->a:D

    sub-double v5, v7, p1

    mul-double/2addr v3, v5

    add-double/2addr v1, v3

    iput-wide v1, v0, Lcom/facebook/n/e;->a:D

    .line 463
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-object v1, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v1, v1, Lcom/facebook/n/e;->b:D

    mul-double/2addr v1, p1

    iget-object v3, p0, Lcom/facebook/n/c;->f:Lcom/facebook/n/e;

    iget-wide v3, v3, Lcom/facebook/n/e;->b:D

    sub-double v5, v7, p1

    mul-double/2addr v3, v5

    add-double/2addr v1, v3

    iput-wide v1, v0, Lcom/facebook/n/e;->b:D

    .line 464
    return-void
.end method


# virtual methods
.method public a(D)Lcom/facebook/n/c;
    .locals 2

    .prologue
    .line 102
    iput-wide p1, p0, Lcom/facebook/n/c;->h:D

    .line 103
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iput-wide p1, v0, Lcom/facebook/n/e;->a:D

    .line 104
    iget-object v0, p0, Lcom/facebook/n/c;->m:Lcom/facebook/common/b/d;

    invoke-virtual {v0}, Lcom/facebook/common/b/d;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/i;

    .line 105
    invoke-interface {v0, p0}, Lcom/facebook/n/i;->b(Lcom/facebook/n/c;)V

    goto :goto_0

    .line 107
    :cond_0
    return-object p0
.end method

.method public a(Lcom/facebook/n/g;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 82
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/g;

    iput-object v0, p0, Lcom/facebook/n/c;->b:Lcom/facebook/n/g;

    .line 83
    return-object p0
.end method

.method public a(Lcom/facebook/n/i;)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 474
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    iget-object v0, p0, Lcom/facebook/n/c;->m:Lcom/facebook/common/b/d;

    invoke-virtual {v0, p1}, Lcom/facebook/common/b/d;->a(Ljava/lang/Object;)V

    .line 476
    return-object p0
.end method

.method public a(Z)Lcom/facebook/n/c;
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lcom/facebook/n/c;->c:Z

    .line 229
    return-object p0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/n/c;->m:Lcom/facebook/common/b/d;

    invoke-virtual {v0}, Lcom/facebook/common/b/d;->a()V

    .line 65
    iget-object v0, p0, Lcom/facebook/n/c;->o:Lcom/facebook/n/j;

    invoke-virtual {v0, p0}, Lcom/facebook/n/j;->b(Lcom/facebook/n/c;)V

    .line 66
    return-void
.end method

.method a(DD)V
    .locals 31

    .prologue
    .line 266
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/n/c;->h()Z

    move-result v10

    .line 268
    if-eqz v10, :cond_1

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/facebook/n/c;->j:Z

    if-eqz v2, :cond_1

    .line 415
    :cond_0
    return-void

    .line 278
    :cond_1
    const-wide v2, 0x3fb0624dd2f1a9fcL    # 0.064

    cmpl-double v2, p3, v2

    if-lez v2, :cond_2

    .line 279
    const-wide p3, 0x3fb0624dd2f1a9fcL    # 0.064

    .line 287
    :cond_2
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/facebook/n/c;->n:D

    add-double v2, v2, p3

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/facebook/n/c;->n:D

    .line 289
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->b:Lcom/facebook/n/g;

    iget-wide v11, v2, Lcom/facebook/n/g;->b:D

    .line 290
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->b:Lcom/facebook/n/g;

    iget-wide v13, v2, Lcom/facebook/n/g;->a:D

    .line 292
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v8, v2, Lcom/facebook/n/e;->a:D

    .line 293
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v6, v2, Lcom/facebook/n/e;->b:D

    .line 294
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->g:Lcom/facebook/n/e;

    iget-wide v4, v2, Lcom/facebook/n/e;->a:D

    .line 295
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->g:Lcom/facebook/n/e;

    iget-wide v2, v2, Lcom/facebook/n/e;->b:D

    .line 305
    :goto_0
    move-object/from16 v0, p0

    iget-wide v15, v0, Lcom/facebook/n/c;->n:D

    const-wide v17, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v15, v15, v17

    if-ltz v15, :cond_4

    .line 309
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/facebook/n/c;->n:D

    const-wide v15, 0x3f50624dd2f1a9fcL    # 0.001

    sub-double/2addr v2, v15

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/facebook/n/c;->n:D

    .line 311
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/facebook/n/c;->n:D

    const-wide v15, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v2, v2, v15

    if-gez v2, :cond_3

    .line 314
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->f:Lcom/facebook/n/e;

    iput-wide v8, v2, Lcom/facebook/n/e;->a:D

    .line 315
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->f:Lcom/facebook/n/e;

    iput-wide v6, v2, Lcom/facebook/n/e;->b:D

    .line 327
    :cond_3
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/facebook/n/c;->i:D

    sub-double/2addr v2, v4

    mul-double/2addr v2, v11

    mul-double v4, v13, v6

    sub-double v15, v2, v4

    .line 331
    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v2, v6

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, v4

    add-double/2addr v2, v8

    .line 332
    const-wide v4, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v4, v15

    const-wide/high16 v17, 0x3fe0000000000000L    # 0.5

    mul-double v4, v4, v17

    add-double v17, v6, v4

    .line 334
    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/facebook/n/c;->i:D

    sub-double v2, v4, v2

    mul-double/2addr v2, v11

    mul-double v4, v13, v17

    sub-double v19, v2, v4

    .line 336
    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double v2, v2, v17

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, v4

    add-double/2addr v2, v8

    .line 337
    const-wide v4, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double v4, v4, v19

    const-wide/high16 v21, 0x3fe0000000000000L    # 0.5

    mul-double v4, v4, v21

    add-double v21, v6, v4

    .line 339
    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/facebook/n/c;->i:D

    sub-double v2, v4, v2

    mul-double/2addr v2, v11

    mul-double v4, v13, v21

    sub-double v23, v2, v4

    .line 341
    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double v2, v2, v21

    add-double v4, v8, v2

    .line 342
    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double v2, v2, v23

    add-double/2addr v2, v6

    .line 344
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/facebook/n/c;->i:D

    move-wide/from16 v25, v0

    sub-double v25, v25, v4

    mul-double v25, v25, v11

    mul-double v27, v13, v2

    sub-double v25, v25, v27

    .line 347
    const-wide v27, 0x3fc5555555555555L    # 0.16666666666666666

    const-wide/high16 v29, 0x4000000000000000L    # 2.0

    add-double v17, v17, v21

    mul-double v17, v17, v29

    add-double v17, v17, v6

    add-double v17, v17, v2

    mul-double v17, v17, v27

    .line 348
    const-wide v21, 0x3fc5555555555555L    # 0.16666666666666666

    const-wide/high16 v27, 0x4000000000000000L    # 2.0

    add-double v19, v19, v23

    mul-double v19, v19, v27

    add-double v15, v15, v19

    add-double v15, v15, v25

    mul-double v15, v15, v21

    .line 350
    const-wide v19, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double v17, v17, v19

    add-double v8, v8, v17

    .line 351
    const-wide v17, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double v15, v15, v17

    add-double/2addr v6, v15

    goto/16 :goto_0

    .line 354
    :cond_4
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/facebook/n/c;->g:Lcom/facebook/n/e;

    iput-wide v4, v11, Lcom/facebook/n/e;->a:D

    .line 355
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/n/c;->g:Lcom/facebook/n/e;

    iput-wide v2, v4, Lcom/facebook/n/e;->b:D

    .line 357
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iput-wide v8, v2, Lcom/facebook/n/e;->a:D

    .line 358
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iput-wide v6, v2, Lcom/facebook/n/e;->b:D

    .line 360
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/facebook/n/c;->n:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_5

    .line 361
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/facebook/n/c;->n:D

    const-wide v4, 0x3f50624dd2f1a9fcL    # 0.001

    div-double/2addr v2, v4

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/facebook/n/c;->f(D)V

    .line 367
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/n/c;->h()Z

    move-result v2

    if-nez v2, :cond_6

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/facebook/n/c;->c:Z

    if-eqz v2, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/facebook/n/c;->e()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 369
    :cond_6
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/facebook/n/c;->i:D

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/facebook/n/c;->h:D

    .line 370
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    move-object/from16 v0, p0

    iget-wide v3, v0, Lcom/facebook/n/c;->i:D

    iput-wide v3, v2, Lcom/facebook/n/e;->a:D

    .line 371
    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lcom/facebook/n/c;->c(D)Lcom/facebook/n/c;

    .line 372
    const/4 v2, 0x1

    .line 391
    :goto_1
    const/4 v3, 0x0

    .line 392
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/facebook/n/c;->j:Z

    if-eqz v4, :cond_a

    .line 393
    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lcom/facebook/n/c;->j:Z

    .line 394
    const/4 v3, 0x1

    move v4, v3

    .line 396
    :goto_2
    const/4 v3, 0x0

    .line 397
    if-eqz v2, :cond_7

    .line 398
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/facebook/n/c;->j:Z

    .line 399
    const/4 v2, 0x1

    move v3, v2

    .line 401
    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/n/c;->m:Lcom/facebook/common/b/d;

    invoke-virtual {v2}, Lcom/facebook/common/b/d;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/n/i;

    .line 403
    if-eqz v4, :cond_9

    .line 404
    move-object/from16 v0, p0

    invoke-interface {v2, v0}, Lcom/facebook/n/i;->a(Lcom/facebook/n/c;)V

    .line 408
    :cond_9
    move-object/from16 v0, p0

    invoke-interface {v2, v0}, Lcom/facebook/n/i;->b(Lcom/facebook/n/c;)V

    .line 411
    if-eqz v3, :cond_8

    .line 412
    move-object/from16 v0, p0

    invoke-interface {v2, v0}, Lcom/facebook/n/i;->c(Lcom/facebook/n/c;)V

    goto :goto_3

    :cond_a
    move v4, v3

    goto :goto_2

    :cond_b
    move v2, v10

    goto :goto_1
.end method

.method public b(D)Lcom/facebook/n/c;
    .locals 2

    .prologue
    .line 149
    iget-wide v0, p0, Lcom/facebook/n/c;->i:D

    cmpl-double v0, v0, p1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    :cond_0
    return-object p0

    .line 152
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/n/c;->h:D

    .line 153
    iput-wide p1, p0, Lcom/facebook/n/c;->i:D

    .line 154
    iget-object v0, p0, Lcom/facebook/n/c;->o:Lcom/facebook/n/j;

    invoke-virtual {p0}, Lcom/facebook/n/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/n/j;->a(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/facebook/n/c;->m:Lcom/facebook/common/b/d;

    invoke-virtual {v0}, Lcom/facebook/common/b/d;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/i;

    .line 156
    invoke-interface {v0, p0}, Lcom/facebook/n/i;->d(Lcom/facebook/n/c;)V

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/n/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()D
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v0, v0, Lcom/facebook/n/e;->a:D

    return-wide v0
.end method

.method public c(D)Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iput-wide p1, v0, Lcom/facebook/n/e;->b:D

    .line 175
    return-object p0
.end method

.method public d()D
    .locals 2

    .prologue
    .line 166
    iget-wide v0, p0, Lcom/facebook/n/c;->i:D

    return-wide v0
.end method

.method public d(D)Lcom/facebook/n/c;
    .locals 0

    .prologue
    .line 192
    iput-wide p1, p0, Lcom/facebook/n/c;->k:D

    .line 193
    return-object p0
.end method

.method public e(D)Lcom/facebook/n/c;
    .locals 0

    .prologue
    .line 210
    iput-wide p1, p0, Lcom/facebook/n/c;->l:D

    .line 211
    return-object p0
.end method

.method public e()Z
    .locals 4

    .prologue
    .line 245
    iget-wide v0, p0, Lcom/facebook/n/c;->h:D

    iget-wide v2, p0, Lcom/facebook/n/c;->i:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/n/c;->i:D

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_1

    :cond_0
    iget-wide v0, p0, Lcom/facebook/n/c;->h:D

    iget-wide v2, p0, Lcom/facebook/n/c;->i:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/n/c;->i:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 423
    invoke-virtual {p0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/n/c;->g()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 432
    iget-boolean v0, p0, Lcom/facebook/n/c;->j:Z

    return v0
.end method

.method public h()Z
    .locals 4

    .prologue
    .line 440
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v0, v0, Lcom/facebook/n/e;->b:D

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/n/c;->k:D

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    invoke-direct {p0, v0}, Lcom/facebook/n/c;->a(Lcom/facebook/n/e;)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/n/c;->l:D

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i()Lcom/facebook/n/c;
    .locals 3

    .prologue
    .line 449
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v0, v0, Lcom/facebook/n/e;->a:D

    iput-wide v0, p0, Lcom/facebook/n/c;->i:D

    .line 450
    iget-object v0, p0, Lcom/facebook/n/c;->g:Lcom/facebook/n/e;

    iget-object v1, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    iget-wide v1, v1, Lcom/facebook/n/e;->a:D

    iput-wide v1, v0, Lcom/facebook/n/e;->a:D

    .line 451
    iget-object v0, p0, Lcom/facebook/n/c;->e:Lcom/facebook/n/e;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/facebook/n/e;->b:D

    .line 452
    return-object p0
.end method

.method public j()Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 495
    iget-object v0, p0, Lcom/facebook/n/c;->m:Lcom/facebook/common/b/d;

    invoke-virtual {v0}, Lcom/facebook/common/b/d;->a()V

    .line 496
    return-object p0
.end method
