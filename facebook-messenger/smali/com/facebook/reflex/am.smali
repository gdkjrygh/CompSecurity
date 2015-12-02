.class Lcom/facebook/reflex/am;
.super Ljava/lang/Object;
.source "Widget.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/reflex/Widget;

.field private b:J

.field private c:J

.field private d:I

.field private e:I

.field private f:F

.field private g:F

.field private h:[I

.field private i:[Landroid/view/MotionEvent$PointerCoords;

.field private j:I


# direct methods
.method public constructor <init>(Lcom/facebook/reflex/Widget;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 352
    iput-object p1, p0, Lcom/facebook/reflex/am;->a:Lcom/facebook/reflex/Widget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/facebook/reflex/am;->h:[I

    .line 354
    new-array v0, v1, [Landroid/view/MotionEvent$PointerCoords;

    iput-object v0, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    .line 355
    iget-object v0, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    const/4 v1, 0x0

    new-instance v2, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v2}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v2, v0, v1

    .line 356
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/reflex/am;->j:I

    .line 357
    return-void
.end method


# virtual methods
.method public a()Landroid/view/MotionEvent;
    .locals 15

    .prologue
    const/4 v8, 0x0

    .line 360
    iget v0, p0, Lcom/facebook/reflex/am;->j:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 361
    iget-wide v0, p0, Lcom/facebook/reflex/am;->b:J

    iget-wide v2, p0, Lcom/facebook/reflex/am;->c:J

    iget v4, p0, Lcom/facebook/reflex/am;->e:I

    iget v5, p0, Lcom/facebook/reflex/am;->j:I

    iget-object v6, p0, Lcom/facebook/reflex/am;->h:[I

    iget-object v7, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    iget v9, p0, Lcom/facebook/reflex/am;->f:F

    iget v10, p0, Lcom/facebook/reflex/am;->g:F

    iget v12, p0, Lcom/facebook/reflex/am;->d:I

    const/16 v13, 0x1002

    move v11, v8

    move v14, v8

    invoke-static/range {v0 .. v14}, Landroid/view/MotionEvent;->obtain(JJII[I[Landroid/view/MotionEvent$PointerCoords;IFFIIII)Landroid/view/MotionEvent;

    move-result-object v0

    .line 376
    const/4 v1, -0x1

    iput v1, p0, Lcom/facebook/reflex/am;->j:I

    .line 377
    return-object v0

    :cond_0
    move v0, v8

    .line 360
    goto :goto_0
.end method

.method public a(IFF)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 406
    iget v0, p0, Lcom/facebook/reflex/am;->j:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/am;->j:I

    iget-object v2, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 407
    iget v0, p0, Lcom/facebook/reflex/am;->j:I

    iget-object v2, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    array-length v2, v2

    if-lt v0, v2, :cond_2

    .line 408
    iget-object v0, p0, Lcom/facebook/reflex/am;->h:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v2, v0, [I

    .line 409
    iget-object v0, p0, Lcom/facebook/reflex/am;->h:[I

    iget-object v3, p0, Lcom/facebook/reflex/am;->h:[I

    array-length v3, v3

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 410
    iget-object v0, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v3, v0, [Landroid/view/MotionEvent$PointerCoords;

    .line 411
    iget-object v0, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    iget-object v4, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    array-length v4, v4

    invoke-static {v0, v1, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 412
    iget-object v0, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    array-length v0, v0

    :goto_1
    array-length v1, v3

    if-ge v0, v1, :cond_1

    .line 413
    new-instance v1, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v1}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v1, v3, v0

    .line 412
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    move v0, v1

    .line 406
    goto :goto_0

    .line 415
    :cond_1
    iput-object v2, p0, Lcom/facebook/reflex/am;->h:[I

    .line 416
    iput-object v3, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    .line 418
    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/am;->h:[I

    iget v1, p0, Lcom/facebook/reflex/am;->j:I

    aput p1, v0, v1

    .line 419
    iget-object v0, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    iget v1, p0, Lcom/facebook/reflex/am;->j:I

    aget-object v0, v0, v1

    invoke-static {}, Lcom/facebook/reflex/Widget;->m()I

    move-result v1

    int-to-float v1, v1

    sub-float v1, p2, v1

    iput v1, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 420
    iget-object v0, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    iget v1, p0, Lcom/facebook/reflex/am;->j:I

    aget-object v0, v0, v1

    invoke-static {}, Lcom/facebook/reflex/Widget;->n()I

    move-result v1

    int-to-float v1, v1

    sub-float v1, p3, v1

    iput v1, v0, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 421
    iget v0, p0, Lcom/facebook/reflex/am;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/reflex/am;->j:I

    .line 422
    return-void
.end method

.method public a(JJIIIFF)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 388
    iput-wide p1, p0, Lcom/facebook/reflex/am;->b:J

    .line 389
    iput-wide p3, p0, Lcom/facebook/reflex/am;->c:J

    .line 390
    iput p5, p0, Lcom/facebook/reflex/am;->d:I

    .line 391
    iput p6, p0, Lcom/facebook/reflex/am;->e:I

    .line 392
    iput v0, p0, Lcom/facebook/reflex/am;->j:I

    .line 393
    iput p8, p0, Lcom/facebook/reflex/am;->f:F

    .line 394
    iput p9, p0, Lcom/facebook/reflex/am;->g:F

    .line 396
    iget-object v1, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    array-length v1, v1

    if-le p7, v1, :cond_0

    .line 397
    new-array v1, p7, [I

    iput-object v1, p0, Lcom/facebook/reflex/am;->h:[I

    .line 398
    new-array v1, p7, [Landroid/view/MotionEvent$PointerCoords;

    iput-object v1, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    .line 399
    :goto_0
    iget-object v1, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 400
    iget-object v1, p0, Lcom/facebook/reflex/am;->i:[Landroid/view/MotionEvent$PointerCoords;

    new-instance v2, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v2}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v2, v1, v0

    .line 399
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 403
    :cond_0
    return-void
.end method
