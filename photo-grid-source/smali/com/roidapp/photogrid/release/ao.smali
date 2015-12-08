.class public abstract Lcom/roidapp/photogrid/release/ao;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:I

.field public E:I

.field public F:Landroid/graphics/Matrix;

.field protected a:Landroid/content/Context;

.field public b:Landroid/graphics/Matrix;

.field public c:I

.field public d:I

.field public e:Landroid/graphics/Point;

.field public f:Z

.field public g:Ljava/lang/String;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:[F

.field public o:[F

.field public p:I

.field public q:I

.field public r:[F

.field public s:I

.field public t:I

.field public u:F

.field public v:F

.field public w:F

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->h:F

    .line 20
    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->i:F

    .line 21
    iput v2, p0, Lcom/roidapp/photogrid/release/ao;->j:F

    iput v2, p0, Lcom/roidapp/photogrid/release/ao;->k:F

    .line 28
    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->u:F

    .line 31
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ao;->y:Z

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 48
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ao;->C:Z

    .line 50
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ao;->F:Landroid/graphics/Matrix;

    .line 58
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ao;->a:Landroid/content/Context;

    .line 59
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    .line 60
    return-void
.end method

.method public static a(FFFF)F
    .locals 2

    .prologue
    .line 134
    sub-float v0, p0, p2

    .line 135
    sub-float v1, p1, p3

    .line 136
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    return v0
.end method

.method private static a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z
    .locals 4

    .prologue
    .line 114
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    iget v1, p2, Landroid/graphics/PointF;->y:F

    iget v2, p0, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    iget v2, p1, Landroid/graphics/PointF;->y:F

    iget v3, p0, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-double v0, v0

    .line 115
    const-wide/16 v2, 0x0

    cmpl-double v2, v0, v2

    if-gtz v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    :cond_0
    const/4 v0, 0x1

    .line 118
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/ao;
.end method

.method public abstract a()V
.end method

.method public abstract a(Landroid/graphics/Canvas;)V
.end method

.method public abstract a(F)Z
.end method

.method public final a(FF)Z
    .locals 9

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    if-nez v0, :cond_1

    .line 100
    :cond_0
    :goto_0
    return v2

    .line 66
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    .line 67
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    invoke-virtual {v1, v0, v4}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    move v1, v2

    .line 1105
    :goto_1
    array-length v4, v0

    if-ge v1, v4, :cond_3

    .line 1106
    aget v4, v0, v1

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_2

    move v1, v3

    .line 69
    :goto_2
    if-eqz v1, :cond_4

    move v2, v3

    .line 70
    goto :goto_0

    .line 1105
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    move v1, v2

    .line 1110
    goto :goto_2

    .line 73
    :cond_4
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    .line 76
    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    aget v1, v1, v2

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    aget v4, v4, v3

    invoke-direct {v0, v1, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 77
    new-instance v1, Landroid/graphics/PointF;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v5, 0x4

    aget v4, v4, v5

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v6, 0x5

    aget v5, v5, v6

    invoke-direct {v1, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 78
    new-instance v4, Landroid/graphics/PointF;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v6, 0x8

    aget v5, v5, v6

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v7, 0x9

    aget v6, v6, v7

    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 79
    new-instance v5, Landroid/graphics/PointF;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v7, 0xc

    aget v6, v6, v7

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v8, 0xd

    aget v7, v7, v8

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 84
    new-instance v6, Landroid/graphics/PointF;

    invoke-direct {v6, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 87
    invoke-static {v0, v1, v6}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    move-result v7

    .line 88
    invoke-static {v1, v4, v6}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    move-result v1

    .line 89
    invoke-static {v4, v5, v6}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    move-result v4

    .line 90
    invoke-static {v5, v0, v6}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    move-result v0

    .line 95
    if-eqz v7, :cond_5

    if-eqz v1, :cond_5

    if-eqz v4, :cond_5

    if-eqz v0, :cond_5

    move v2, v3

    .line 96
    goto/16 :goto_0

    .line 97
    :cond_5
    if-nez v7, :cond_0

    if-nez v1, :cond_0

    if-nez v4, :cond_0

    if-nez v0, :cond_0

    goto/16 :goto_0
.end method

.method public abstract b()V
.end method

.method public b(F)V
    .locals 4

    .prologue
    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v2, 0x10

    aget v1, v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v3, 0x11

    aget v2, v2, v3

    invoke-virtual {v0, p1, v1, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 130
    iget v0, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    .line 131
    return-void
.end method

.method public b(FF)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 124
    iget v0, p0, Lcom/roidapp/photogrid/release/ao;->k:F

    add-float/2addr v0, p2

    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->k:F

    .line 125
    iget v0, p0, Lcom/roidapp/photogrid/release/ao;->j:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->j:F

    .line 126
    return-void
.end method

.method public final c()I
    .locals 5

    .prologue
    .line 151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/4 v3, 0x4

    aget v2, v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/4 v4, 0x5

    aget v3, v3, v4

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/ao;->a(FFFF)F

    move-result v0

    .line 152
    iget v1, p0, Lcom/roidapp/photogrid/release/ao;->h:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 153
    return v0
.end method

.method public final d()I
    .locals 5

    .prologue
    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/16 v3, 0xc

    aget v2, v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    const/16 v4, 0xd

    aget v3, v3, v4

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/ao;->a(FFFF)F

    move-result v0

    .line 158
    iget v1, p0, Lcom/roidapp/photogrid/release/ao;->h:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 159
    return v0
.end method

.method public final e()[F
    .locals 4

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->n:[F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 165
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v3, 0x10

    aget v2, v2, v3

    aput v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v3, 0x11

    aget v2, v2, v3

    aput v2, v0, v1

    return-object v0
.end method

.method public final f()[F
    .locals 4

    .prologue
    .line 169
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v3, 0x10

    aget v2, v2, v3

    aput v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v3, 0x11

    aget v2, v2, v3

    aput v2, v0, v1

    return-object v0
.end method
