.class public final Lcom/roidapp/baselib/hlistview/ad;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static f:F

.field private static g:F


# instance fields
.field private a:I

.field private final b:Lcom/roidapp/baselib/hlistview/ae;

.field private final c:Lcom/roidapp/baselib/hlistview/ae;

.field private d:Landroid/view/animation/Interpolator;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 51
    const/high16 v0, 0x41000000    # 8.0f

    sput v0, Lcom/roidapp/baselib/hlistview/ad;->f:F

    .line 52
    sput v1, Lcom/roidapp/baselib/hlistview/ad;->g:F

    .line 53
    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/ad;->b(F)F

    move-result v0

    div-float v0, v1, v0

    sput v0, Lcom/roidapp/baselib/hlistview/ad;->g:F

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/ad;-><init>(Landroid/content/Context;B)V

    .line 62
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;B)V
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/ad;-><init>(Landroid/content/Context;C)V

    .line 87
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;C)V
    .locals 1

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->d:Landroid/view/animation/Interpolator;

    .line 99
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/ad;->e:Z

    .line 100
    new-instance v0, Lcom/roidapp/baselib/hlistview/ae;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/hlistview/ae;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    .line 101
    new-instance v0, Lcom/roidapp/baselib/hlistview/ae;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/hlistview/ae;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    .line 102
    return-void
.end method

.method private static b(F)F
    .locals 5

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    .line 67
    sget v0, Lcom/roidapp/baselib/hlistview/ad;->f:F

    mul-float/2addr v0, p0

    .line 68
    cmpg-float v1, v0, v4

    if-gez v1, :cond_0

    .line 69
    neg-float v1, v0

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    double-to-float v1, v2

    sub-float v1, v4, v1

    sub-float/2addr v0, v1

    .line 75
    :goto_0
    sget v1, Lcom/roidapp/baselib/hlistview/ad;->g:F

    mul-float/2addr v0, v1

    .line 76
    return v0

    .line 72
    :cond_0
    sub-float v0, v4, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    double-to-float v0, v0

    sub-float v0, v4, v0

    .line 73
    const v1, 0x3ebc5ab2

    const v2, 0x3f21d2a7

    mul-float/2addr v0, v2

    add-float/2addr v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a(II)V
    .locals 1

    .prologue
    .line 490
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/baselib/hlistview/ae;->a(II)V

    .line 491
    return-void
.end method

.method public final a(IIII)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 400
    iput v1, p0, Lcom/roidapp/baselib/hlistview/ad;->a:I

    .line 401
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0, p1, p3, p4}, Lcom/roidapp/baselib/hlistview/ae;->a(III)V

    .line 402
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0, p2, v1, p4}, Lcom/roidapp/baselib/hlistview/ae;->a(III)V

    .line 403
    return-void
.end method

.method public final a(IIIIII)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 461
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/ad;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/ad;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 462
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->c(Lcom/roidapp/baselib/hlistview/ae;)F

    move-result v0

    .line 463
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/ae;->c(Lcom/roidapp/baselib/hlistview/ae;)F

    move-result v1

    .line 464
    int-to-float v2, p2

    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    move-result v2

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v3

    cmpl-float v2, v2, v3

    if-nez v2, :cond_0

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v2

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v3

    cmpl-float v2, v2, v3

    if-nez v2, :cond_0

    .line 466
    int-to-float v2, p2

    add-float/2addr v0, v2

    float-to-int p2, v0

    .line 467
    add-float v0, v4, v1

    float-to-int p3, v0

    move v2, p2

    .line 471
    :goto_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/ad;->a:I

    .line 472
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    const v4, 0x7fffffff

    move v1, p1

    move v3, p4

    move v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/baselib/hlistview/ae;->a(IIIII)V

    .line 473
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    move v1, v6

    move v2, p3

    move v3, v6

    move v4, p5

    move v5, v6

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/baselib/hlistview/ae;->a(IIIII)V

    .line 474
    return-void

    :cond_0
    move v2, p2

    goto :goto_0
.end method

.method final a(Landroid/view/animation/Interpolator;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/ad;->d:Landroid/view/animation/Interpolator;

    .line 141
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->a(Lcom/roidapp/baselib/hlistview/ae;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->a(Lcom/roidapp/baselib/hlistview/ae;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(F)Z
    .locals 3

    .prologue
    .line 559
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->e(Lcom/roidapp/baselib/hlistview/ae;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/ae;->d(Lcom/roidapp/baselib/hlistview/ae;)I

    move-result v1

    sub-int/2addr v0, v1

    .line 560
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/ae;->e(Lcom/roidapp/baselib/hlistview/ae;)I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v2}, Lcom/roidapp/baselib/hlistview/ae;->d(Lcom/roidapp/baselib/hlistview/ae;)I

    move-result v2

    sub-int/2addr v1, v2

    .line 561
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/ad;->a()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v2

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    cmpl-float v0, v2, v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(I)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 418
    iput v1, p0, Lcom/roidapp/baselib/hlistview/ad;->a:I

    .line 421
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v2, p1}, Lcom/roidapp/baselib/hlistview/ae;->a(I)Z

    move-result v2

    .line 422
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v3, v0}, Lcom/roidapp/baselib/hlistview/ae;->a(I)Z

    move-result v3

    .line 423
    if-nez v2, :cond_0

    if-eqz v3, :cond_1

    :cond_0
    move v0, v1

    :cond_1
    return v0
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 174
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/roidapp/baselib/hlistview/ae;->a(Lcom/roidapp/baselib/hlistview/ae;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/hlistview/ae;->a(Lcom/roidapp/baselib/hlistview/ae;Z)Z

    .line 175
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->b(Lcom/roidapp/baselib/hlistview/ae;)I

    move-result v0

    return v0
.end method

.method public final d()F
    .locals 3

    .prologue
    .line 201
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->c(Lcom/roidapp/baselib/hlistview/ae;)F

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/ae;->c(Lcom/roidapp/baselib/hlistview/ae;)F

    move-result v1

    mul-float/2addr v0, v1

    .line 202
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/ae;->c(Lcom/roidapp/baselib/hlistview/ae;)F

    move-result v1

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v2}, Lcom/roidapp/baselib/hlistview/ae;->c(Lcom/roidapp/baselib/hlistview/ae;)F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 203
    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 6

    .prologue
    .line 317
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/ad;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 318
    const/4 v0, 0x0

    .line 365
    :goto_0
    return v0

    .line 321
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/hlistview/ad;->a:I

    packed-switch v0, :pswitch_data_0

    .line 365
    :cond_1
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 323
    :pswitch_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    .line 326
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v2}, Lcom/roidapp/baselib/hlistview/ae;->g(Lcom/roidapp/baselib/hlistview/ae;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 328
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v2}, Lcom/roidapp/baselib/hlistview/ae;->f(Lcom/roidapp/baselib/hlistview/ae;)I

    move-result v2

    .line 329
    int-to-long v4, v2

    cmp-long v3, v0, v4

    if-gez v3, :cond_3

    .line 330
    long-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    .line 332
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->d:Landroid/view/animation/Interpolator;

    if-nez v1, :cond_2

    .line 333
    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ad;->b(F)F

    move-result v0

    .line 338
    :goto_2
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/hlistview/ae;->a(F)V

    .line 339
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/hlistview/ae;->a(F)V

    goto :goto_1

    .line 335
    :cond_2
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/ad;->d:Landroid/view/animation/Interpolator;

    invoke-interface {v1, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    goto :goto_2

    .line 341
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/ad;->f()V

    goto :goto_1

    .line 346
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->a(Lcom/roidapp/baselib/hlistview/ae;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 347
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->c()Z

    move-result v0

    if-nez v0, :cond_4

    .line 348
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->b()Z

    move-result v0

    if-nez v0, :cond_4

    .line 349
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->a()V

    .line 354
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/ae;->a(Lcom/roidapp/baselib/hlistview/ae;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 355
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 356
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 357
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->a()V

    goto :goto_1

    .line 321
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 538
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->b:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->a()V

    .line 539
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ad;->c:Lcom/roidapp/baselib/hlistview/ae;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ae;->a()V

    .line 540
    return-void
.end method
