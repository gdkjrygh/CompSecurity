.class public Lcom/qihoo/security/ui/opti/sysclear/rocket/c;
.super Landroid/graphics/drawable/Drawable;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;
    }
.end annotation


# instance fields
.field a:Landroid/os/Handler;

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:Landroid/graphics/Paint;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private m:Landroid/view/animation/Interpolator;

.field private n:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 150
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 28
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->b:F

    .line 30
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->c:F

    .line 33
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->d:F

    .line 36
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->e:F

    .line 39
    const/4 v0, 0x5

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->f:I

    .line 42
    const/16 v0, 0x9c4

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->g:I

    .line 45
    const/16 v0, 0x3c

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->h:I

    .line 48
    const/16 v0, 0xcc

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->i:I

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->j:Z

    .line 53
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    .line 55
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    .line 58
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->m:Landroid/view/animation/Interpolator;

    .line 70
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    .line 151
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    .line 152
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    const v1, -0x33000001    # -1.3421772E8f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 155
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 156
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    const v2, 0x7f09006c

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 157
    const v1, 0x7f09006d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->d:F

    .line 158
    const v1, 0x7f09006e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->e:F

    .line 159
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    .line 160
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->n:Landroid/graphics/Rect;

    .line 161
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->g:I

    return v0
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    .line 339
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    .line 341
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;

    .line 342
    if-eqz v0, :cond_0

    .line 343
    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b()I

    move-result v2

    .line 344
    if-lez v2, :cond_0

    .line 345
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 346
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->n:Landroid/graphics/Rect;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 347
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 348
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->b:F

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->c:F

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a()F

    move-result v0

    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 349
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0

    .line 354
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)F
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->d:F

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)F
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->e:F

    return v0
.end method

.method private c()V
    .locals 0

    .prologue
    .line 290
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->f()Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;

    .line 291
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->i:I

    return v0
.end method

.method private d()Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    .line 294
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 295
    const/4 v0, 0x0

    .line 296
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;

    .line 297
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b()I

    move-result v4

    if-lez v4, :cond_2

    .line 298
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b(J)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    :goto_1
    move v1, v0

    .line 302
    goto :goto_0

    .line 303
    :cond_0
    if-eqz v1, :cond_1

    .line 304
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->invalidateSelf()V

    .line 308
    :cond_1
    return v2

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method private e()Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;
    .locals 5

    .prologue
    .line 312
    const/4 v1, 0x0

    .line 313
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;

    .line 315
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->c()F

    move-result v3

    const v4, 0x461c4000    # 10000.0f

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_0

    .line 321
    :goto_0
    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)Z
    .locals 1

    .prologue
    .line 25
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->j:Z

    return v0
.end method

.method private f()Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;
    .locals 4

    .prologue
    .line 325
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->e()Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;

    move-result-object v0

    .line 326
    if-nez v0, :cond_0

    .line 327
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;)V

    .line 328
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    :cond_0
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->i:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a(I)V

    .line 331
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->d:F

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a(F)V

    .line 332
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->a(J)V

    .line 333
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$a;->b(I)V

    .line 335
    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->c()V

    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->f:I

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)Z
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->d()Z

    move-result v0

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->h:I

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 208
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->j:Z

    .line 209
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 214
    :cond_0
    return-void
.end method

.method public a(FF)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 167
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a()V

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->n:Landroid/graphics/Rect;

    const/4 v1, 0x0

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->e:F

    sub-float v2, p2, v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 169
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->b:F

    .line 170
    iput p2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->c:F

    .line 172
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->b()Landroid/view/animation/Interpolator;

    move-result-object v0

    if-nez v0, :cond_0

    .line 173
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(Landroid/view/animation/Interpolator;)V

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 177
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/c;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 198
    iput-boolean v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->j:Z

    .line 199
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 200
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 202
    :cond_2
    return-void
.end method

.method public a(Landroid/view/animation/Interpolator;)V
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->m:Landroid/view/animation/Interpolator;

    .line 228
    return-void
.end method

.method public b()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->m:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/c;->a(Landroid/graphics/Canvas;)V

    .line 274
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 286
    const/4 v0, 0x0

    return v0
.end method

.method public setAlpha(I)V
    .locals 0

    .prologue
    .line 278
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .prologue
    .line 282
    return-void
.end method
