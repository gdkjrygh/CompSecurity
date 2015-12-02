.class public Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static h:Landroid/graphics/drawable/Drawable;

.field private static i:Landroid/graphics/Rect;

.field private static j:F

.field private static k:J

.field private static l:F

.field private static m:Z

.field private static n:Ljava/util/Random;

.field private static o:Landroid/content/Context;

.field private static p:Landroid/os/Handler;

.field private static q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;",
            ">;"
        }
    .end annotation
.end field

.field private static r:Lcom/nineoldandroids/a/o$b;

.field private static s:Z

.field private static t:F


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:I

.field private e:F

.field private f:Z

.field private g:Lcom/nineoldandroids/a/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 46
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->h:Landroid/graphics/drawable/Drawable;

    .line 48
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    .line 50
    sput v3, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->j:F

    .line 52
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->k:J

    .line 54
    const/high16 v0, 0x3f800000    # 1.0f

    sput v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->l:F

    .line 56
    sput-boolean v4, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->m:Z

    .line 58
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->n:Ljava/util/Random;

    .line 60
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->o:Landroid/content/Context;

    .line 62
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->p:Landroid/os/Handler;

    .line 64
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    .line 67
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->r:Lcom/nineoldandroids/a/o$b;

    .line 71
    sput-boolean v4, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->s:Z

    .line 73
    sput v3, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->t:F

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a:F

    .line 32
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->b:F

    .line 35
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->c:F

    .line 38
    const/16 v0, 0xff

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->d:I

    .line 40
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->e:F

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->f:Z

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->g:Lcom/nineoldandroids/a/k;

    .line 77
    return-void
.end method

.method static synthetic a()F
    .locals 1

    .prologue
    .line 27
    sget v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->t:F

    return v0
.end method

.method static synthetic a(F)F
    .locals 1

    .prologue
    .line 27
    sget v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->j:F

    add-float/2addr v0, p0

    sput v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->j:F

    return v0
.end method

.method static synthetic a(FFF)Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;
    .locals 1

    .prologue
    .line 27
    invoke-static {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->b(FFF)Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Z)Z
    .locals 0

    .prologue
    .line 27
    sput-boolean p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->m:Z

    return p0
.end method

.method static synthetic b()J
    .locals 2

    .prologue
    .line 27
    sget-wide v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->k:J

    return-wide v0
.end method

.method private static b(FFF)Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x2

    const/4 v10, 0x0

    .line 221
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->d()Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    move-result-object v0

    .line 222
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 223
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 224
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    .line 225
    sget v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->l:F

    float-to-double v2, v2

    const-wide v4, 0x3fe3333333333333L    # 0.6

    sget-object v6, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->n:Ljava/util/Random;

    invoke-virtual {v6}, Ljava/util/Random;->nextFloat()F

    move-result v6

    float-to-double v6, v6

    const-wide v8, 0x3fd999999999999aL    # 0.4

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    mul-double/2addr v2, v4

    double-to-float v2, v2

    .line 226
    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->setRadius(F)V

    .line 227
    const/16 v3, 0xff

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->setAplha(I)V

    .line 228
    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->setY(F)V

    .line 230
    const/high16 v1, 0x42480000    # 50.0f

    sget-object v3, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->n:Ljava/util/Random;

    invoke-virtual {v3}, Ljava/util/Random;->nextFloat()F

    move-result v3

    mul-float/2addr v1, v3

    add-float/2addr v1, p0

    .line 231
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->setAngle(F)V

    .line 234
    const-string/jumbo v1, "aplha"

    new-array v3, v11, [I

    fill-array-data v3, :array_0

    invoke-static {v1, v3}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[I)Lcom/nineoldandroids/a/m;

    move-result-object v1

    .line 235
    const-string/jumbo v3, "radius"

    new-array v4, v11, [F

    aput v2, v4, v10

    sget v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->l:F

    const/high16 v5, 0x41200000    # 10.0f

    mul-float/2addr v2, v5

    aput v2, v4, v12

    invoke-static {v3, v4}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v2

    .line 236
    const-string/jumbo v3, "x"

    new-array v4, v11, [F

    aput p1, v4, v10

    aput p2, v4, v12

    invoke-static {v3, v4}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v3

    .line 237
    const/4 v4, 0x3

    new-array v4, v4, [Lcom/nineoldandroids/a/m;

    aput-object v1, v4, v10

    aput-object v2, v4, v12

    aput-object v3, v4, v11

    invoke-static {v0, v4}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v1

    const-wide/16 v2, 0x320

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 239
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 240
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 241
    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke$2;

    invoke-direct {v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke$2;-><init>()V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 260
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->setAnimator(Lcom/nineoldandroids/a/k;)V

    .line 261
    invoke-virtual {v1}, Lcom/nineoldandroids/a/k;->a()V

    .line 262
    invoke-virtual {v0, v10}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->setDied(Z)V

    .line 264
    return-object v0

    .line 234
    :array_0
    .array-data 4
        0xff
        0x35
    .end array-data
.end method

.method private static c()F
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 196
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 197
    if-eqz v0, :cond_1

    .line 198
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x6

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    .line 200
    :goto_0
    cmpl-float v1, v0, v1

    if-nez v1, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    :cond_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method private static d()Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;
    .locals 2

    .prologue
    .line 212
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->e()Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    move-result-object v0

    .line 213
    if-nez v0, :cond_0

    .line 214
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    invoke-direct {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;-><init>()V

    .line 215
    sget-object v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    :cond_0
    return-object v0
.end method

.method public static destroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 282
    sget-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->s:Z

    if-eqz v0, :cond_3

    .line 283
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->p:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 284
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->p:Landroid/os/Handler;

    const/16 v1, 0x16

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 285
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->p:Landroid/os/Handler;

    .line 288
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    .line 289
    if-eqz v0, :cond_1

    .line 290
    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->getAnimator()Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 291
    if-eqz v0, :cond_1

    .line 292
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    goto :goto_0

    .line 296
    :cond_2
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 297
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    .line 298
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->o:Landroid/content/Context;

    .line 299
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->r:Lcom/nineoldandroids/a/o$b;

    .line 300
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->n:Ljava/util/Random;

    .line 301
    sput-object v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->h:Landroid/graphics/drawable/Drawable;

    .line 302
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->s:Z

    .line 304
    :cond_3
    return-void
.end method

.method public static draw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 330
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 331
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    .line 332
    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->isDied()Z

    move-result v2

    if-nez v2, :cond_0

    sget-boolean v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->m:Z

    if-eqz v2, :cond_0

    .line 333
    invoke-virtual {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 337
    :cond_1
    return-void
.end method

.method private static e()Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;
    .locals 3

    .prologue
    .line 271
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    .line 272
    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->isDied()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 275
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;
    .locals 1

    .prologue
    .line 307
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->r:Lcom/nineoldandroids/a/o$b;

    return-object v0
.end method

.method public static getBounds()Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 326
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    return-object v0
.end method

.method public static init(Landroid/content/Context;Landroid/graphics/Rect;Lcom/nineoldandroids/a/o$b;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 147
    sget-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->s:Z

    if-nez v0, :cond_1

    .line 148
    sput-object p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->o:Landroid/content/Context;

    .line 149
    invoke-static {p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->setBounds(Landroid/graphics/Rect;)V

    .line 150
    sput-object p2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->r:Lcom/nineoldandroids/a/o$b;

    .line 151
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->n:Ljava/util/Random;

    .line 152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->q:Ljava/util/ArrayList;

    .line 153
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020068

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->h:Landroid/graphics/drawable/Drawable;

    .line 154
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->c()F

    move-result v0

    sput v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->l:F

    .line 155
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->h:Landroid/graphics/drawable/Drawable;

    sget v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->l:F

    float-to-int v1, v1

    sget v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->l:F

    float-to-int v2, v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 156
    const/4 v0, 0x0

    sput v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->j:F

    .line 158
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->p:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke$1;

    invoke-direct {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->p:Landroid/os/Handler;

    .line 189
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->s:Z

    .line 191
    :cond_1
    return-void
.end method

.method public static setAnimatorUpdateListener(Lcom/nineoldandroids/a/o$b;)V
    .locals 0

    .prologue
    .line 311
    sput-object p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->r:Lcom/nineoldandroids/a/o$b;

    .line 312
    return-void
.end method

.method public static setBounds(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    .line 315
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 316
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    .line 323
    :goto_0
    return-void

    .line 318
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 319
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/Rect;->top:I

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 320
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/Rect;->right:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 321
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->i:Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/Rect;->bottom:I

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_0
.end method

.method public static startSmoke(F)V
    .locals 2

    .prologue
    .line 204
    sget-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->s:Z

    if-eqz v0, :cond_0

    .line 205
    sput p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->t:F

    .line 206
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->k:J

    .line 207
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->p:Landroid/os/Handler;

    const/16 v1, 0x16

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 209
    :cond_0
    return-void
.end method


# virtual methods
.method a(Landroid/graphics/Canvas;)V
    .locals 12

    .prologue
    const-wide v10, 0x4066800000000000L    # 180.0

    const-wide v8, 0x400921fb54442d18L    # Math.PI

    .line 136
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a:F

    float-to-double v0, v0

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->c:F

    float-to-double v2, v2

    iget v4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->e:F

    float-to-double v4, v4

    mul-double/2addr v4, v8

    div-double/2addr v4, v10

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v0, v0

    .line 137
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->b:F

    float-to-double v2, v1

    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->c:F

    float-to-double v4, v1

    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->e:F

    float-to-double v6, v1

    mul-double/2addr v6, v8

    div-double/2addr v6, v10

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    double-to-float v1, v2

    sget v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->j:F

    add-float/2addr v1, v2

    .line 138
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 139
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->c:F

    sget v3, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->l:F

    div-float/2addr v2, v3

    .line 140
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 141
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 142
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 143
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 144
    return-void
.end method

.method public getAlpha()I
    .locals 1

    .prologue
    .line 108
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->d:I

    return v0
.end method

.method public getAngle()F
    .locals 1

    .prologue
    .line 116
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->e:F

    return v0
.end method

.method public getAnimator()Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->g:Lcom/nineoldandroids/a/k;

    return-object v0
.end method

.method public getRadius()F
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->c:F

    return v0
.end method

.method public getX()F
    .locals 1

    .prologue
    .line 84
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a:F

    return v0
.end method

.method public getY()F
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->b:F

    return v0
.end method

.method public isDied()Z
    .locals 1

    .prologue
    .line 120
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->f:Z

    return v0
.end method

.method public setAngle(F)V
    .locals 0

    .prologue
    .line 112
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->e:F

    .line 113
    return-void
.end method

.method public setAnimator(Lcom/nineoldandroids/a/k;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->g:Lcom/nineoldandroids/a/k;

    .line 129
    return-void
.end method

.method public setAplha(I)V
    .locals 0

    .prologue
    .line 104
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->d:I

    .line 105
    return-void
.end method

.method public setDied(Z)V
    .locals 0

    .prologue
    .line 124
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->f:Z

    .line 125
    return-void
.end method

.method public setRadius(F)V
    .locals 0

    .prologue
    .line 96
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->c:F

    .line 97
    return-void
.end method

.method public setX(F)V
    .locals 0

    .prologue
    .line 80
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a:F

    .line 81
    return-void
.end method

.method public setY(F)V
    .locals 0

    .prologue
    .line 88
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->b:F

    .line 89
    return-void
.end method
