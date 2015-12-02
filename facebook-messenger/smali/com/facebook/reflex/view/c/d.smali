.class public Lcom/facebook/reflex/view/c/d;
.super Ljava/lang/Object;
.source "LayoutController.java"


# static fields
.field public static a:F
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/reflex/Scroller;

.field private final c:Lcom/facebook/reflex/view/c/s;

.field private final d:Lcom/facebook/reflex/view/c/c;

.field private final e:Lcom/facebook/reflex/view/c/f;

.field private final f:Lcom/facebook/reflex/Transaction;

.field private final g:Lcom/facebook/reflex/view/c/h;

.field private final h:Lcom/facebook/reflex/view/c/h;

.field private final i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/reflex/view/b/r;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/facebook/reflex/a/c;

.field private final k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:Z

.field private final q:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/reflex/view/b/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 66
    const/high16 v0, 0x3f000000    # 0.5f

    sput v0, Lcom/facebook/reflex/view/c/d;->a:F

    return-void
.end method

.method public constructor <init>(Lcom/facebook/reflex/Scroller;Lcom/facebook/reflex/view/c/s;Lcom/facebook/reflex/view/c/f;Lcom/facebook/reflex/Transaction;Lcom/facebook/reflex/a/c;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Lcom/facebook/reflex/view/c/h;

    invoke-direct {v0, p0, v2}, Lcom/facebook/reflex/view/c/h;-><init>(Lcom/facebook/reflex/view/c/d;Lcom/facebook/reflex/view/c/e;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/d;->g:Lcom/facebook/reflex/view/c/h;

    .line 74
    new-instance v0, Lcom/facebook/reflex/view/c/h;

    invoke-direct {v0, p0, v2}, Lcom/facebook/reflex/view/c/h;-><init>(Lcom/facebook/reflex/view/c/d;Lcom/facebook/reflex/view/c/e;)V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/d;->h:Lcom/facebook/reflex/view/c/h;

    .line 78
    iput v1, p0, Lcom/facebook/reflex/view/c/d;->l:I

    .line 79
    iput v1, p0, Lcom/facebook/reflex/view/c/d;->m:I

    .line 80
    iput v1, p0, Lcom/facebook/reflex/view/c/d;->n:I

    .line 81
    iput v1, p0, Lcom/facebook/reflex/view/c/d;->o:I

    .line 82
    iput-boolean v1, p0, Lcom/facebook/reflex/view/c/d;->p:Z

    .line 95
    iput-object p1, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    .line 96
    iput-object p2, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    .line 97
    iput-object p3, p0, Lcom/facebook/reflex/view/c/d;->e:Lcom/facebook/reflex/view/c/f;

    .line 98
    iput-object p4, p0, Lcom/facebook/reflex/view/c/d;->f:Lcom/facebook/reflex/Transaction;

    .line 99
    iput-object p5, p0, Lcom/facebook/reflex/view/c/d;->j:Lcom/facebook/reflex/a/c;

    .line 101
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    .line 102
    new-instance v0, Lcom/facebook/reflex/view/c/c;

    invoke-direct {v0}, Lcom/facebook/reflex/view/c/c;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    .line 103
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    .line 105
    invoke-interface {p3}, Lcom/facebook/reflex/view/c/f;->a()I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/view/c/d;->k:I

    .line 106
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    iget v1, p0, Lcom/facebook/reflex/view/c/d;->k:I

    int-to-float v1, v1

    const/high16 v2, 0x3e800000    # 0.25f

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/Scroller;->a(F)V

    .line 107
    return-void
.end method

.method private a(Lcom/facebook/reflex/view/c/h;)F
    .locals 5

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 257
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 275
    :goto_0
    return v0

    .line 260
    :cond_0
    iget v0, p1, Lcom/facebook/reflex/view/c/h;->b:I

    iget v2, p1, Lcom/facebook/reflex/view/c/h;->a:I

    if-ne v0, v2, :cond_1

    .line 261
    const/4 v0, 0x0

    goto :goto_0

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    .line 264
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v3

    .line 265
    const/4 v0, 0x0

    .line 266
    invoke-direct {p0, v2, v3, p1}, Lcom/facebook/reflex/view/c/d;->a(IILcom/facebook/reflex/view/c/h;)Z

    move-result v4

    if-nez v4, :cond_2

    move v0, v1

    .line 267
    goto :goto_0

    .line 269
    :cond_2
    iget v1, p1, Lcom/facebook/reflex/view/c/h;->a:I

    if-le v2, v1, :cond_3

    .line 270
    iget v1, p1, Lcom/facebook/reflex/view/c/h;->a:I

    sub-int v1, v2, v1

    add-int/2addr v0, v1

    .line 272
    :cond_3
    iget v1, p1, Lcom/facebook/reflex/view/c/h;->b:I

    if-ge v3, v1, :cond_4

    .line 273
    iget v1, p1, Lcom/facebook/reflex/view/c/h;->b:I

    sub-int/2addr v1, v3

    add-int/2addr v0, v1

    .line 275
    :cond_4
    iget v1, p1, Lcom/facebook/reflex/view/c/h;->b:I

    iget v2, p1, Lcom/facebook/reflex/view/c/h;->a:I

    sub-int/2addr v1, v2

    div-int/2addr v0, v1

    int-to-float v0, v0

    goto :goto_0
.end method

.method private a(IILcom/facebook/reflex/view/c/h;Lcom/facebook/reflex/view/c/g;)I
    .locals 9

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->f:Lcom/facebook/reflex/Transaction;

    invoke-virtual {v0}, Lcom/facebook/reflex/Transaction;->b()V

    .line 356
    :try_start_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/c/s;->a(I)Lcom/facebook/reflex/view/b/r;

    move-result-object v1

    .line 357
    invoke-interface {v1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v2

    .line 358
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 362
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 363
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->e:Lcom/facebook/reflex/view/c/f;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/view/c/f;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 364
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->e:Lcom/facebook/reflex/view/c/f;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/view/c/f;->b(Lcom/facebook/reflex/view/b/r;)V

    .line 367
    :cond_0
    invoke-direct {p0, v2}, Lcom/facebook/reflex/view/c/d;->a(Landroid/view/View;)V

    .line 368
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    .line 369
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    invoke-virtual {v0, p1, v5}, Lcom/facebook/reflex/view/c/c;->a(II)V

    .line 371
    sget-object v0, Lcom/facebook/reflex/view/c/g;->BEFORE:Lcom/facebook/reflex/view/c/g;

    if-ne p4, v0, :cond_3

    .line 372
    sub-int v0, p2, v5

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/reflex/view/c/d;->a(IILcom/facebook/reflex/view/c/h;)Z

    move-result v0

    .line 373
    if-eqz v0, :cond_1

    .line 374
    iget-object v6, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v6, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 375
    const/4 v6, 0x0

    sub-int v7, p2, v5

    iget-object v8, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v8}, Lcom/facebook/reflex/Scroller;->f()I

    move-result v8

    invoke-virtual {v2, v6, v7, v8, p2}, Landroid/view/View;->layout(IIII)V

    .line 384
    :cond_1
    :goto_0
    if-eqz v0, :cond_4

    .line 385
    invoke-interface {v1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v6, v2}, Lcom/facebook/reflex/Widget;->b(FF)V

    .line 386
    invoke-interface {v1}, Lcom/facebook/reflex/view/b/r;->e()V

    .line 387
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->e:Lcom/facebook/reflex/view/c/f;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/view/c/f;->c(Lcom/facebook/reflex/view/b/r;)V

    .line 389
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 396
    :cond_2
    :goto_1
    iget v0, p0, Lcom/facebook/reflex/view/c/d;->m:I

    int-to-long v0, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v2, v6, v3

    add-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p0, Lcom/facebook/reflex/view/c/d;->m:I

    .line 397
    iget v0, p0, Lcom/facebook/reflex/view/c/d;->l:I

    add-int/2addr v0, v5

    iput v0, p0, Lcom/facebook/reflex/view/c/d;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 399
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->f:Lcom/facebook/reflex/Transaction;

    invoke-virtual {v0}, Lcom/facebook/reflex/Transaction;->c()V

    .line 402
    return v5

    .line 378
    :cond_3
    add-int v0, p2, v5

    :try_start_1
    invoke-direct {p0, p2, v0, p3}, Lcom/facebook/reflex/view/c/d;->a(IILcom/facebook/reflex/view/c/h;)Z

    move-result v0

    .line 379
    if-eqz v0, :cond_1

    .line 380
    iget-object v6, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v6, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 381
    const/4 v6, 0x0

    iget-object v7, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v7}, Lcom/facebook/reflex/Scroller;->f()I

    move-result v7

    add-int v8, p2, v5

    invoke-virtual {v2, v6, p2, v7, v8}, Landroid/view/View;->layout(IIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 399
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->f:Lcom/facebook/reflex/Transaction;

    invoke-virtual {v1}, Lcom/facebook/reflex/Transaction;->c()V

    throw v0

    .line 391
    :cond_4
    :try_start_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0, v1}, Lcom/facebook/reflex/view/c/s;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 392
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 393
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method private a(Lcom/facebook/reflex/view/c/h;J)I
    .locals 6

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v1

    .line 192
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v0

    .line 194
    :goto_0
    iget v2, p1, Lcom/facebook/reflex/view/c/h;->b:I

    if-ge v1, v2, :cond_0

    .line 195
    iget-object v2, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v2}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-lt v0, v2, :cond_1

    .line 203
    :cond_0
    return v1

    .line 198
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, p2

    const-wide/16 v4, 0x20

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    .line 201
    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/reflex/view/c/d;->c(IILcom/facebook/reflex/view/c/h;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0
.end method

.method private a(Landroid/view/View;)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    const/4 v3, 0x0

    .line 329
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 330
    if-nez v0, :cond_0

    .line 331
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 336
    :cond_0
    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v1}, Lcom/facebook/reflex/Scroller;->f()I

    move-result v1

    invoke-static {v4, v3, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 338
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 340
    if-lez v0, :cond_1

    .line 341
    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 345
    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V

    .line 346
    return-void

    .line 343
    :cond_1
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/reflex/view/b/r;)V
    .locals 1

    .prologue
    .line 419
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->e:Lcom/facebook/reflex/view/c/f;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/c/f;->b(Lcom/facebook/reflex/view/b/r;)V

    .line 420
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/view/c/s;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 421
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    :cond_0
    return-void
.end method

.method private a(IILcom/facebook/reflex/view/c/h;)Z
    .locals 1

    .prologue
    .line 407
    iget v0, p3, Lcom/facebook/reflex/view/c/h;->b:I

    if-gt p1, v0, :cond_0

    iget v0, p3, Lcom/facebook/reflex/view/c/h;->a:I

    if-lt p2, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(IILcom/facebook/reflex/view/c/h;)I
    .locals 1

    .prologue
    .line 411
    sget-object v0, Lcom/facebook/reflex/view/c/g;->BEFORE:Lcom/facebook/reflex/view/c/g;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/reflex/view/c/d;->a(IILcom/facebook/reflex/view/c/h;Lcom/facebook/reflex/view/c/g;)I

    move-result v0

    return v0
.end method

.method private b(Lcom/facebook/reflex/view/c/h;J)I
    .locals 8

    .prologue
    .line 207
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v1

    .line 208
    invoke-virtual {p0, v1}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v0

    move v2, v1

    .line 210
    :goto_0
    iget v1, p1, Lcom/facebook/reflex/view/c/h;->a:I

    if-le v2, v1, :cond_0

    .line 211
    if-gtz v0, :cond_1

    .line 237
    :cond_0
    return v2

    .line 214
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, p2

    const-wide/16 v5, 0x20

    cmp-long v1, v3, v5

    if-gtz v1, :cond_0

    .line 217
    add-int/lit8 v1, v0, -0x1

    .line 218
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/c;->c(I)I

    move-result v3

    .line 219
    invoke-direct {p0, v1, v2, p1}, Lcom/facebook/reflex/view/c/d;->b(IILcom/facebook/reflex/view/c/h;)I

    move-result v0

    .line 222
    if-eq v0, v3, :cond_3

    .line 223
    sub-int v4, v0, v3

    .line 225
    :try_start_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->f:Lcom/facebook/reflex/Transaction;

    invoke-virtual {v0}, Lcom/facebook/reflex/Transaction;->b()V

    .line 226
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 227
    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v4}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 228
    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v7, v0}, Lcom/facebook/reflex/Widget;->b(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 231
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->f:Lcom/facebook/reflex/Transaction;

    invoke-virtual {v1}, Lcom/facebook/reflex/Transaction;->c()V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->f:Lcom/facebook/reflex/Transaction;

    invoke-virtual {v0}, Lcom/facebook/reflex/Transaction;->c()V

    .line 235
    :cond_3
    sub-int v0, v2, v3

    move v2, v0

    move v0, v1

    .line 236
    goto :goto_0
.end method

.method private b(F)Lcom/facebook/reflex/view/c/h;
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->g:Lcom/facebook/reflex/view/c/h;

    float-to-int v1, p1

    iput v1, v0, Lcom/facebook/reflex/view/c/h;->a:I

    .line 287
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->h:Lcom/facebook/reflex/view/c/h;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v1}, Lcom/facebook/reflex/Scroller;->g()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, p1

    float-to-int v1, v1

    iput v1, v0, Lcom/facebook/reflex/view/c/h;->b:I

    .line 288
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->h:Lcom/facebook/reflex/view/c/h;

    return-object v0
.end method

.method private c(IILcom/facebook/reflex/view/c/h;)I
    .locals 1

    .prologue
    .line 415
    sget-object v0, Lcom/facebook/reflex/view/c/g;->AFTER:Lcom/facebook/reflex/view/c/g;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/reflex/view/c/d;->a(IILcom/facebook/reflex/view/c/h;Lcom/facebook/reflex/view/c/g;)I

    move-result v0

    return v0
.end method

.method private c(F)Lcom/facebook/reflex/view/c/h;
    .locals 7

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v0}, Lcom/facebook/reflex/Scroller;->g()I

    move-result v0

    int-to-float v0, v0

    .line 294
    sget v1, Lcom/facebook/reflex/view/c/d;->a:F

    mul-float/2addr v1, v0

    .line 295
    sub-float v2, p1, v1

    .line 296
    add-float v3, p1, v0

    add-float/2addr v3, v1

    .line 297
    iget-object v4, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v4}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v4

    iget v5, p0, Lcom/facebook/reflex/view/c/d;->n:I

    int-to-float v5, v5

    add-float/2addr v4, v5

    .line 299
    iget-object v5, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v5}, Lcom/facebook/reflex/Scroller;->d()F

    move-result v5

    iget v6, p0, Lcom/facebook/reflex/view/c/d;->o:I

    int-to-float v6, v6

    sub-float/2addr v5, v6

    add-float/2addr v0, v4

    const/high16 v6, 0x40000000    # 2.0f

    mul-float/2addr v1, v6

    add-float/2addr v0, v1

    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v5

    .line 303
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 304
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 306
    cmpl-float v6, v1, v2

    if-lez v6, :cond_1

    .line 307
    add-float/2addr v0, v1

    sub-float/2addr v0, v2

    invoke-static {v5, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 311
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/facebook/reflex/view/c/d;->h:Lcom/facebook/reflex/view/c/h;

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v1, v3

    iput v1, v2, Lcom/facebook/reflex/view/c/h;->a:I

    .line 312
    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->h:Lcom/facebook/reflex/view/c/h;

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    iput v0, v1, Lcom/facebook/reflex/view/c/h;->b:I

    .line 313
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->h:Lcom/facebook/reflex/view/c/h;

    return-object v0

    .line 308
    :cond_1
    cmpg-float v2, v0, v3

    if-gez v2, :cond_0

    .line 309
    sub-float v2, v3, v0

    sub-float/2addr v1, v2

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    goto :goto_0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 241
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/c;->b()I

    move-result v0

    if-nez v0, :cond_1

    const/high16 v0, 0x42c80000    # 100.0f

    .line 243
    :goto_0
    iget v1, p0, Lcom/facebook/reflex/view/c/d;->o:I

    iget v2, p0, Lcom/facebook/reflex/view/c/d;->n:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    add-float/2addr v0, v1

    .line 244
    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    iget-object v2, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v2}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v2

    iget-object v3, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v3}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v3

    add-float/2addr v0, v3

    invoke-virtual {v1, v2, v0}, Lcom/facebook/reflex/Scroller;->a(FF)V

    .line 247
    iget v0, p0, Lcom/facebook/reflex/view/c/d;->m:I

    if-lez v0, :cond_0

    .line 248
    iget v0, p0, Lcom/facebook/reflex/view/c/d;->l:I

    iget v1, p0, Lcom/facebook/reflex/view/c/d;->m:I

    div-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3e8

    int-to-float v0, v0

    .line 249
    iget v1, p0, Lcom/facebook/reflex/view/c/d;->k:I

    int-to-float v1, v1

    const v2, 0x3e4ccccd    # 0.2f

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, Lcom/facebook/reflex/view/c/d;->k:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 252
    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v1, v0}, Lcom/facebook/reflex/Scroller;->a(F)V

    .line 254
    :cond_0
    return-void

    .line 241
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/c;->a()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v1}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v1

    mul-int/2addr v0, v1

    int-to-float v0, v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    invoke-virtual {v1}, Lcom/facebook/reflex/view/c/c;->b()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    goto :goto_0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 279
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 280
    iget-object v2, p0, Lcom/facebook/reflex/view/c/d;->e:Lcom/facebook/reflex/view/c/f;

    invoke-interface {v2, v0}, Lcom/facebook/reflex/view/c/f;->d(Lcom/facebook/reflex/view/b/r;)V

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 283
    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 322
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 323
    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/d;->a(Lcom/facebook/reflex/view/b/r;)V

    goto :goto_0

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 326
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 317
    invoke-direct {p0}, Lcom/facebook/reflex/view/c/d;->e()V

    .line 318
    invoke-direct {p0}, Lcom/facebook/reflex/view/c/d;->d()V

    .line 319
    return-void
.end method

.method public a(F)V
    .locals 11

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 119
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/c/d;->b(F)Lcom/facebook/reflex/view/c/h;

    move-result-object v3

    .line 120
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/c/d;->c(F)Lcom/facebook/reflex/view/c/h;

    move-result-object v4

    .line 123
    iget-boolean v0, p0, Lcom/facebook/reflex/view/c/d;->p:Z

    if-eqz v0, :cond_0

    .line 124
    iput-boolean v1, p0, Lcom/facebook/reflex/view/c/d;->p:Z

    .line 125
    invoke-direct {p0}, Lcom/facebook/reflex/view/c/d;->e()V

    .line 129
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v5, v4, Lcom/facebook/reflex/view/c/h;->a:I

    if-ge v0, v5, :cond_1

    .line 130
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/d;->a(Lcom/facebook/reflex/view/b/r;)V

    goto :goto_0

    .line 133
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget v5, v4, Lcom/facebook/reflex/view/c/h;->b:I

    if-le v0, v5, :cond_2

    .line 134
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/d;->a(Lcom/facebook/reflex/view/b/r;)V

    goto :goto_1

    .line 137
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v0

    iget-object v5, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v5}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v5

    if-le v0, v5, :cond_3

    .line 139
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/d;->a(Lcom/facebook/reflex/view/b/r;)V

    goto :goto_2

    .line 144
    :cond_3
    iget v0, v4, Lcom/facebook/reflex/view/c/h;->a:I

    iget v5, v4, Lcom/facebook/reflex/view/c/h;->b:I

    if-ge v0, v5, :cond_8

    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v0

    if-lez v0, :cond_8

    .line 145
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 146
    invoke-direct {p0, v3}, Lcom/facebook/reflex/view/c/d;->a(Lcom/facebook/reflex/view/c/h;)F

    move-result v7

    .line 147
    :goto_3
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 148
    iget v0, v4, Lcom/facebook/reflex/view/c/h;->a:I

    iget v3, v4, Lcom/facebook/reflex/view/c/h;->b:I

    add-int/2addr v0, v3

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v0

    .line 150
    iget-object v3, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v3}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v3

    if-lt v0, v3, :cond_a

    .line 153
    iget v0, v4, Lcom/facebook/reflex/view/c/h;->a:I

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v0

    .line 155
    iget-object v3, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v3}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v3

    if-lt v0, v3, :cond_a

    .line 163
    :cond_4
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 164
    invoke-direct {p0, v4, v5, v6}, Lcom/facebook/reflex/view/c/d;->b(Lcom/facebook/reflex/view/c/h;J)I

    move-result v3

    .line 165
    invoke-direct {p0, v4, v5, v6}, Lcom/facebook/reflex/view/c/d;->a(Lcom/facebook/reflex/view/c/h;J)I

    move-result v8

    .line 166
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v9

    .line 167
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->q:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/d;->c(I)I

    move-result v10

    .line 168
    iget v0, v4, Lcom/facebook/reflex/view/c/h;->b:I

    if-ge v8, v0, :cond_5

    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-lt v9, v0, :cond_b

    :cond_5
    move v0, v2

    .line 170
    :goto_4
    iget v4, v4, Lcom/facebook/reflex/view/c/h;->a:I

    if-le v3, v4, :cond_6

    if-nez v10, :cond_c

    :cond_6
    move v3, v2

    .line 172
    :goto_5
    if-eqz v3, :cond_d

    if-eqz v0, :cond_d

    move v1, v2

    .line 179
    :cond_7
    :goto_6
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->j:Lcom/facebook/reflex/a/c;

    float-to-double v2, v7

    invoke-virtual {v0, v2, v3}, Lcom/facebook/reflex/a/c;->a(D)V

    .line 180
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->j:Lcom/facebook/reflex/a/c;

    const/4 v2, 0x0

    cmpl-float v2, v7, v2

    if-lez v2, :cond_e

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v5

    long-to-double v2, v2

    :goto_7
    invoke-virtual {v0, v2, v3}, Lcom/facebook/reflex/a/c;->b(D)V

    .line 182
    :cond_8
    invoke-direct {p0}, Lcom/facebook/reflex/view/c/d;->c()V

    .line 184
    if-eqz v1, :cond_9

    .line 185
    invoke-direct {p0}, Lcom/facebook/reflex/view/c/d;->d()V

    .line 186
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->c:Lcom/facebook/reflex/view/c/s;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/s;->b()V

    .line 188
    :cond_9
    return-void

    .line 160
    :cond_a
    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/c/d;->d(I)I

    move-result v3

    invoke-direct {p0, v0, v3, v4}, Lcom/facebook/reflex/view/c/d;->c(IILcom/facebook/reflex/view/c/h;)I

    goto/16 :goto_3

    :cond_b
    move v0, v1

    .line 168
    goto :goto_4

    :cond_c
    move v3, v1

    .line 170
    goto :goto_5

    .line 175
    :cond_d
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->e:Lcom/facebook/reflex/view/c/f;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/f;->b()V

    goto :goto_6

    .line 180
    :cond_e
    const-wide/16 v2, 0x0

    goto :goto_7
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 110
    iput p1, p0, Lcom/facebook/reflex/view/c/d;->n:I

    .line 111
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 435
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/view/c/d;->p:Z

    .line 436
    return-void
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 114
    iput p1, p0, Lcom/facebook/reflex/view/c/d;->o:I

    .line 115
    return-void
.end method

.method public c(I)I
    .locals 4

    .prologue
    .line 427
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    int-to-float v1, p1

    iget-object v2, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v2}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v2

    iget v3, p0, Lcom/facebook/reflex/view/c/d;->n:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    sub-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/c;->b(I)I

    move-result v0

    return v0
.end method

.method public d(I)I
    .locals 2

    .prologue
    .line 431
    iget-object v0, p0, Lcom/facebook/reflex/view/c/d;->d:Lcom/facebook/reflex/view/c/c;

    invoke-virtual {v0, p1}, Lcom/facebook/reflex/view/c/c;->a(I)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/d;->b:Lcom/facebook/reflex/Scroller;

    invoke-virtual {v1}, Lcom/facebook/reflex/Scroller;->c()F

    move-result v1

    add-float/2addr v0, v1

    iget v1, p0, Lcom/facebook/reflex/view/c/d;->n:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
