.class public final Lcom/c/a/a/a;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# static fields
.field public static final a:Z

.field private static final b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Lcom/c/a/a/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/graphics/Camera;

.field private e:Z

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private final p:Landroid/graphics/RectF;

.field private final q:Landroid/graphics/RectF;

.field private final r:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 21
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/c/a/a/a;->a:Z

    .line 23
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/c/a/a/a;->b:Ljava/util/WeakHashMap;

    return-void

    .line 21
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Landroid/view/View;)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 63
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 45
    new-instance v0, Landroid/graphics/Camera;

    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    iput-object v0, p0, Lcom/c/a/a/a;->d:Landroid/graphics/Camera;

    .line 48
    iput v1, p0, Lcom/c/a/a/a;->f:F

    .line 54
    iput v1, p0, Lcom/c/a/a/a;->l:F

    .line 55
    iput v1, p0, Lcom/c/a/a/a;->m:F

    .line 59
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/c/a/a/a;->p:Landroid/graphics/RectF;

    .line 60
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/c/a/a/a;->q:Landroid/graphics/RectF;

    .line 61
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/c/a/a/a;->r:Landroid/graphics/Matrix;

    .line 64
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/c/a/a/a;->setDuration(J)V

    .line 65
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/c/a/a/a;->setFillAfter(Z)V

    .line 66
    invoke-virtual {p1, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 67
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/c/a/a/a;->c:Ljava/lang/ref/WeakReference;

    .line 68
    return-void
.end method

.method public static a(Landroid/view/View;)Lcom/c/a/a/a;
    .locals 2

    .prologue
    .line 35
    sget-object v0, Lcom/c/a/a/a;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/a/a/a;

    .line 37
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 38
    :cond_0
    new-instance v0, Lcom/c/a/a/a;

    invoke-direct {v0, p0}, Lcom/c/a/a/a;-><init>(Landroid/view/View;)V

    .line 39
    sget-object v1, Lcom/c/a/a/a;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a()F
    .locals 2

    .prologue
    .line 203
    iget-object v0, p0, Lcom/c/a/a/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 204
    if-nez v0, :cond_0

    .line 205
    const/4 v0, 0x0

    .line 207
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/c/a/a/a;->n:F

    add-float/2addr v0, v1

    goto :goto_0
.end method

.method protected final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 11

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    .line 316
    iget-object v0, p0, Lcom/c/a/a/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 317
    if-eqz v0, :cond_4

    .line 318
    iget v1, p0, Lcom/c/a/a/a;->f:F

    invoke-virtual {p2, v1}, Landroid/view/animation/Transformation;->setAlpha(F)V

    .line 319
    invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    .line 1281
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v3, v1

    .line 1282
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v4, v0

    .line 1283
    iget-boolean v5, p0, Lcom/c/a/a/a;->e:Z

    .line 1284
    if-eqz v5, :cond_5

    iget v0, p0, Lcom/c/a/a/a;->g:F

    move v1, v0

    .line 1285
    :goto_0
    if-eqz v5, :cond_6

    iget v0, p0, Lcom/c/a/a/a;->h:F

    .line 1287
    :goto_1
    iget v5, p0, Lcom/c/a/a/a;->i:F

    .line 1288
    iget v6, p0, Lcom/c/a/a/a;->j:F

    .line 1289
    iget v7, p0, Lcom/c/a/a/a;->k:F

    .line 1290
    cmpl-float v8, v5, v9

    if-nez v8, :cond_0

    cmpl-float v8, v6, v9

    if-nez v8, :cond_0

    cmpl-float v8, v7, v9

    if-eqz v8, :cond_1

    .line 1291
    :cond_0
    iget-object v8, p0, Lcom/c/a/a/a;->d:Landroid/graphics/Camera;

    .line 1292
    invoke-virtual {v8}, Landroid/graphics/Camera;->save()V

    .line 1293
    invoke-virtual {v8, v5}, Landroid/graphics/Camera;->rotateX(F)V

    .line 1294
    invoke-virtual {v8, v6}, Landroid/graphics/Camera;->rotateY(F)V

    .line 1295
    neg-float v5, v7

    invoke-virtual {v8, v5}, Landroid/graphics/Camera;->rotateZ(F)V

    .line 1296
    invoke-virtual {v8, v2}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 1297
    invoke-virtual {v8}, Landroid/graphics/Camera;->restore()V

    .line 1298
    neg-float v5, v1

    neg-float v6, v0

    invoke-virtual {v2, v5, v6}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 1299
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1302
    :cond_1
    iget v5, p0, Lcom/c/a/a/a;->l:F

    .line 1303
    iget v6, p0, Lcom/c/a/a/a;->m:F

    .line 1304
    cmpl-float v7, v5, v10

    if-nez v7, :cond_2

    cmpl-float v7, v6, v10

    if-eqz v7, :cond_3

    .line 1305
    :cond_2
    invoke-virtual {v2, v5, v6}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1306
    div-float/2addr v1, v3

    neg-float v1, v1

    mul-float/2addr v5, v3

    sub-float v3, v5, v3

    mul-float/2addr v1, v3

    .line 1307
    div-float/2addr v0, v4

    neg-float v0, v0

    mul-float v3, v6, v4

    sub-float/2addr v3, v4

    mul-float/2addr v0, v3

    .line 1308
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1311
    :cond_3
    iget v0, p0, Lcom/c/a/a/a;->n:F

    iget v1, p0, Lcom/c/a/a/a;->o:F

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 321
    :cond_4
    return-void

    .line 1284
    :cond_5
    div-float v0, v3, v6

    move v1, v0

    goto :goto_0

    .line 1285
    :cond_6
    div-float v0, v4, v6

    goto :goto_1
.end method

.method public final b()F
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Lcom/c/a/a/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 217
    if-nez v0, :cond_0

    .line 218
    const/4 v0, 0x0

    .line 220
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/c/a/a/a;->o:F

    add-float/2addr v0, v1

    goto :goto_0
.end method
