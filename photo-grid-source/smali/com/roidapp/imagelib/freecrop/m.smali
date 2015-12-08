.class public abstract Lcom/roidapp/imagelib/freecrop/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected A:F

.field protected B:F

.field protected C:F

.field public D:F

.field public E:F

.field protected F:F

.field protected n:F

.field protected o:F

.field protected p:F

.field protected q:I

.field protected r:I

.field protected s:F

.field protected t:Landroid/graphics/Matrix;

.field protected u:Landroid/graphics/Matrix;

.field protected v:Landroid/graphics/Matrix;

.field protected w:Landroid/graphics/Matrix;

.field protected x:Landroid/graphics/Matrix;

.field protected y:Landroid/graphics/Matrix;

.field protected z:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/m;->s:F

    .line 16
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->u:Landroid/graphics/Matrix;

    .line 18
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->w:Landroid/graphics/Matrix;

    .line 19
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->x:Landroid/graphics/Matrix;

    .line 20
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->y:Landroid/graphics/Matrix;

    .line 24
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/m;->D:F

    .line 25
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/m;->E:F

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/m;->F:F

    .line 37
    return-void
.end method


# virtual methods
.method public final a(FFF)V
    .locals 4

    .prologue
    .line 47
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/m;->o:F

    .line 48
    iput p2, p0, Lcom/roidapp/imagelib/freecrop/m;->p:F

    .line 49
    iput p3, p0, Lcom/roidapp/imagelib/freecrop/m;->s:F

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/m;->n:F

    .line 1073
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->t:Landroid/graphics/Matrix;

    .line 1074
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/m;->g()F

    move-result v0

    .line 1075
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/m;->t:Landroid/graphics/Matrix;

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/m;->s:F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/m;->s:F

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1076
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/m;->t:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 1077
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->t:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/m;->o:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/m;->p:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1078
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->t:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/m;->u:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 52
    return-void
.end method

.method public final b(FF)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 98
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 99
    aput p1, v0, v2

    .line 100
    aput p2, v0, v3

    .line 103
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/m;->x:Landroid/graphics/Matrix;

    aget v2, v0, v2

    aget v0, v0, v3

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 104
    return-void
.end method

.method public final b(FFF)V
    .locals 4

    .prologue
    .line 55
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/m;->z:F

    .line 56
    iput p2, p0, Lcom/roidapp/imagelib/freecrop/m;->A:F

    .line 57
    iput p3, p0, Lcom/roidapp/imagelib/freecrop/m;->C:F

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/m;->B:F

    .line 1089
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->v:Landroid/graphics/Matrix;

    .line 2069
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->B:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 1091
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/m;->v:Landroid/graphics/Matrix;

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/m;->C:F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/m;->C:F

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1092
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/m;->v:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 1093
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->v:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/m;->z:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/m;->A:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1094
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->v:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/m;->w:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 62
    return-void
.end method

.method public final b(FFFF)V
    .locals 1

    .prologue
    .line 107
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->D:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/m;->D:F

    .line 108
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->E:F

    mul-float/2addr v0, p2

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/m;->E:F

    .line 109
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->x:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 110
    return-void
.end method

.method public final c(FFF)V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->x:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 114
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->F:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/m;->F:F

    .line 115
    return-void
.end method

.method public final c(FF)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 168
    cmpg-float v0, p1, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->r:I

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-gez v0, :cond_0

    cmpg-float v0, p2, v1

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->q:I

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_1

    .line 169
    :cond_0
    const/4 v0, 0x0

    .line 172
    :goto_0
    return v0

    .line 171
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final g()F
    .locals 2

    .prologue
    .line 65
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->n:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public final h()Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->t:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final i()Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->u:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final j()Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->v:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final k()Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/m;->x:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final l()F
    .locals 1

    .prologue
    .line 144
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->o:F

    return v0
.end method

.method public final m()F
    .locals 1

    .prologue
    .line 149
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->p:F

    return v0
.end method

.method public final n()F
    .locals 1

    .prologue
    .line 154
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/m;->s:F

    return v0
.end method
