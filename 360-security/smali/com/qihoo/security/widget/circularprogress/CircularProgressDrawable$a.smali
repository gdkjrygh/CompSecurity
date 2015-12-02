.class public Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:[I

.field private b:F

.field private c:F

.field private d:F

.field private e:I

.field private f:I

.field private g:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

.field private h:Landroid/view/animation/Interpolator;

.field private i:Landroid/view/animation/Interpolator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 408
    invoke-static {}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a()Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->h:Landroid/view/animation/Interpolator;

    .line 409
    invoke-static {}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b()Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->i:Landroid/view/animation/Interpolator;

    .line 412
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a(Landroid/content/Context;)V

    .line 413
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 416
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090015

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->d:F

    .line 417
    iput v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->b:F

    .line 418
    iput v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->c:F

    .line 419
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f080048

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    aput v2, v0, v1

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a:[I

    .line 420
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0002

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->e:I

    .line 421
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0003

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->f:I

    .line 422
    sget-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->ROUNDED:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->g:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    .line 423
    return-void
.end method


# virtual methods
.method public a(F)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
    .locals 0

    .prologue
    .line 437
    invoke-static {p1}, Lcom/qihoo/security/widget/circularprogress/a;->a(F)V

    .line 438
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->b:F

    .line 439
    return-object p0
.end method

.method public a(I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
    .locals 2

    .prologue
    .line 426
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p1, v0, v1

    iput-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a:[I

    .line 427
    return-object p0
.end method

.method public a([I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
    .locals 0

    .prologue
    .line 431
    invoke-static {p1}, Lcom/qihoo/security/widget/circularprogress/a;->a([I)V

    .line 432
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a:[I

    .line 433
    return-object p0
.end method

.method public a()Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;
    .locals 11

    .prologue
    .line 485
    new-instance v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->a:[I

    iget v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->d:F

    iget v3, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->b:F

    iget v4, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->c:F

    iget v5, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->e:I

    iget v6, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->f:I

    iget-object v7, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->g:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    iget-object v8, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->i:Landroid/view/animation/Interpolator;

    iget-object v9, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->h:Landroid/view/animation/Interpolator;

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;-><init>([IFFFIILcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$1;)V

    return-object v0
.end method

.method public b(F)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
    .locals 0

    .prologue
    .line 443
    invoke-static {p1}, Lcom/qihoo/security/widget/circularprogress/a;->a(F)V

    .line 444
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->c:F

    .line 445
    return-object p0
.end method

.method public b(I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
    .locals 0

    .prologue
    .line 449
    invoke-static {p1}, Lcom/qihoo/security/widget/circularprogress/a;->a(I)V

    .line 450
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->e:I

    .line 451
    return-object p0
.end method

.method public c(F)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
    .locals 1

    .prologue
    .line 461
    const-string/jumbo v0, "StrokeWidth"

    invoke-static {p1, v0}, Lcom/qihoo/security/widget/circularprogress/a;->a(FLjava/lang/String;)V

    .line 462
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->d:F

    .line 463
    return-object p0
.end method

.method public c(I)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;
    .locals 0

    .prologue
    .line 455
    invoke-static {p1}, Lcom/qihoo/security/widget/circularprogress/a;->a(I)V

    .line 456
    iput p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$a;->f:I

    .line 457
    return-object p0
.end method
