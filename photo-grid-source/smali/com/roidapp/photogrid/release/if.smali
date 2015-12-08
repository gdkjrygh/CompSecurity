.class public final Lcom/roidapp/photogrid/release/if;
.super Lcom/roidapp/photogrid/release/aq;
.source "SourceFile"


# static fields
.field private static E:I


# instance fields
.field public A:Z

.field public B:I

.field public C:Z

.field public D:Z

.field private F:F

.field private G:Landroid/graphics/PaintFlagsDrawFilter;

.field private H:F

.field private I:Landroid/graphics/Paint;

.field private J:Landroid/graphics/Matrix;

.field private K:Landroid/graphics/Path;

.field private L:Landroid/graphics/Paint;

.field private M:Landroid/graphics/Paint;

.field private N:Landroid/graphics/DashPathEffect;

.field private O:Landroid/graphics/drawable/ShapeDrawable;

.field private P:Landroid/graphics/Matrix;

.field private Q:Z

.field public w:F

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x2

    sput v0, Lcom/roidapp/photogrid/release/if;->E:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/ig;IIIII)V
    .locals 8

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/aq;-><init>(Landroid/content/Context;)V

    .line 42
    const/high16 v1, 0x40000000    # 2.0f

    iput v1, p0, Lcom/roidapp/photogrid/release/if;->w:F

    .line 43
    const/4 v1, 0x0

    iput v1, p0, Lcom/roidapp/photogrid/release/if;->F:F

    .line 49
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/if;->A:Z

    .line 50
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/photogrid/release/if;->G:Landroid/graphics/PaintFlagsDrawFilter;

    .line 52
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 53
    const/high16 v1, 0x41a00000    # 20.0f

    iput v1, p0, Lcom/roidapp/photogrid/release/if;->H:F

    .line 56
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    .line 57
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    .line 58
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/if;->L:Landroid/graphics/Paint;

    .line 59
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    .line 61
    new-instance v1, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    .line 62
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/if;->P:Landroid/graphics/Matrix;

    .line 69
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xa

    if-le v1, v2, :cond_0

    .line 70
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;)V

    .line 72
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    .line 73
    iput-object p2, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    .line 74
    iput-object p3, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    .line 75
    iput-object p4, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 76
    iput p5, p0, Lcom/roidapp/photogrid/release/if;->f:I

    .line 77
    iput p6, p0, Lcom/roidapp/photogrid/release/if;->g:I

    .line 78
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/if;->m:Z

    .line 79
    move/from16 v0, p8

    iput v0, p0, Lcom/roidapp/photogrid/release/if;->q:I

    .line 80
    iput p7, p0, Lcom/roidapp/photogrid/release/if;->p:I

    .line 81
    move/from16 v0, p9

    iput v0, p0, Lcom/roidapp/photogrid/release/if;->B:I

    .line 82
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 84
    sget v2, Lcom/roidapp/photogrid/release/if;->E:I

    int-to-float v2, v2

    mul-float/2addr v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    float-to-int v2, v2

    sput v2, Lcom/roidapp/photogrid/release/if;->E:I

    .line 85
    iget v2, p0, Lcom/roidapp/photogrid/release/if;->w:F

    mul-float/2addr v2, v1

    iput v2, p0, Lcom/roidapp/photogrid/release/if;->w:F

    .line 87
    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v2, v1

    iput v2, p0, Lcom/roidapp/photogrid/release/if;->H:F

    .line 90
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v4}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/if;->G:Landroid/graphics/PaintFlagsDrawFilter;

    .line 91
    const/4 v2, 0x0

    iput v2, p0, Lcom/roidapp/photogrid/release/if;->x:F

    .line 92
    const/4 v2, 0x0

    iput v2, p0, Lcom/roidapp/photogrid/release/if;->y:F

    .line 93
    const/4 v2, 0x0

    iput v2, p0, Lcom/roidapp/photogrid/release/if;->z:F

    .line 94
    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, Lcom/roidapp/photogrid/release/if;->o:F

    .line 96
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    .line 97
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v2, :pswitch_data_0

    .line 125
    :pswitch_0
    iget-boolean v2, p4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 129
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    if-eqz v2, :cond_1

    .line 130
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/if;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00b5

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 131
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    const/16 v3, 0xe5

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 132
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 133
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    const/high16 v3, 0x3fc00000    # 1.5f

    const v4, 0x3f333333    # 0.7f

    const v5, 0x3f333333    # 0.7f

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/if;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0c00b6

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 139
    :cond_1
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p3, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v2, :cond_2

    .line 140
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->A:Z

    .line 147
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 148
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    iget v3, p0, Lcom/roidapp/photogrid/release/if;->w:F

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 149
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 150
    new-instance v2, Landroid/graphics/DashPathEffect;

    const/4 v3, 0x4

    new-array v3, v3, [F

    const/4 v4, 0x0

    const/4 v5, 0x0

    aput v5, v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    aput v5, v3, v4

    const/4 v4, 0x2

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v5, v1

    aput v5, v3, v4

    const/4 v4, 0x3

    const/high16 v5, 0x40000000    # 2.0f

    mul-float/2addr v1, v5

    aput v1, v3, v4

    const/4 v1, 0x0

    invoke-direct {v2, v3, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/if;->N:Landroid/graphics/DashPathEffect;

    .line 151
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    const v2, -0xc39b2b

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 152
    return-void

    .line 99
    :pswitch_1
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->Q:Z

    .line 100
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    .line 109
    :goto_1
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    goto/16 :goto_0

    .line 102
    :pswitch_2
    iget-boolean v2, p4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    goto :goto_1

    .line 112
    :pswitch_3
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->Q:Z

    .line 113
    iget-boolean v2, p4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 114
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_3

    .line 115
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 117
    :cond_3
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    goto/16 :goto_0

    .line 120
    :pswitch_4
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->Q:Z

    .line 121
    iget-boolean v2, p4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 122
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    goto/16 :goto_0

    .line 97
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 100
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
    .end packed-switch
.end method

.method private static a(Lcom/roidapp/photogrid/release/lc;FF)Landroid/graphics/Path;
    .locals 7

    .prologue
    const/4 v4, 0x0

    const/high16 v6, 0x42c80000    # 100.0f

    .line 492
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 493
    iget-object v3, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 494
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v0, p1

    div-float v1, v0, v6

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v0, p2

    div-float/2addr v0, v6

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 495
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 496
    const/4 v0, 0x1

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    .line 497
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v0, p1

    div-float v5, v0, v6

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v0, p2

    div-float/2addr v0, v6

    invoke-virtual {v2, v5, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 496
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 499
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 500
    return-object v2
.end method

.method private static a(Lcom/roidapp/photogrid/release/lc;FFF)Landroid/graphics/Path;
    .locals 12

    .prologue
    const/4 v3, 0x0

    const/high16 v11, 0x42c80000    # 100.0f

    const/high16 v10, 0x40000000    # 2.0f

    .line 504
    new-instance v4, Landroid/graphics/Path;

    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 505
    iget-object v5, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 506
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 507
    iget v6, v0, Landroid/graphics/PointF;->x:F

    .line 508
    iget v7, v0, Landroid/graphics/PointF;->y:F

    .line 509
    div-float v1, p1, v10

    .line 510
    div-float v2, p1, v10

    .line 511
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v0, p2

    div-float/2addr v0, v11

    add-float/2addr v1, v0

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v0, p3

    div-float/2addr v0, v11

    add-float/2addr v0, v2

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 512
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    .line 513
    const/4 v0, 0x1

    move v3, v0

    :goto_0
    if-ge v3, v8, :cond_2

    .line 514
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 515
    div-float v1, p1, v10

    .line 516
    div-float v2, p1, v10

    .line 517
    iget v9, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v9, v9, v6

    if-lez v9, :cond_0

    .line 518
    neg-float v1, v1

    .line 520
    :cond_0
    iget v9, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v9, v9, v7

    if-lez v9, :cond_1

    .line 521
    neg-float v2, v2

    .line 523
    :cond_1
    iget v9, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v9, p2

    div-float/2addr v9, v11

    add-float/2addr v1, v9

    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v0, p3

    div-float/2addr v0, v11

    add-float/2addr v0, v2

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 513
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 526
    :cond_2
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 527
    return-object v4
.end method

.method private static d(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 534
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 535
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 538
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/release/lc;IIII)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    .line 198
    iput p2, p0, Lcom/roidapp/photogrid/release/if;->f:I

    .line 199
    iput p3, p0, Lcom/roidapp/photogrid/release/if;->g:I

    .line 200
    iput p4, p0, Lcom/roidapp/photogrid/release/if;->p:I

    .line 201
    iput p5, p0, Lcom/roidapp/photogrid/release/if;->q:I

    .line 202
    return-void
.end method

.method public final b(F)V
    .locals 1

    .prologue
    .line 191
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->r:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/if;->r:F

    .line 192
    return-void
.end method

.method public final b(Landroid/graphics/Bitmap;)V
    .locals 5

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    .line 158
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    :cond_0
    :goto_0
    return-void

    .line 162
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 163
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 166
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->Q:Z

    if-eqz v2, :cond_2

    .line 167
    cmpg-float v2, v1, v4

    if-gtz v2, :cond_3

    .line 168
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->y(I)V

    .line 174
    :cond_2
    :goto_1
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    if-eqz v2, :cond_4

    .line 175
    cmpl-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 178
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/if;->r:F

    goto :goto_0

    .line 170
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->y(I)V

    goto :goto_1

    .line 181
    :cond_4
    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 182
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/if;->r:F

    goto :goto_0

    .line 184
    :cond_5
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/if;->r:F

    goto :goto_0
.end method

.method public final c(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 552
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 553
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 555
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->P:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 556
    iput-object p1, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    .line 558
    return-void
.end method

.method public final f()V
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    .line 562
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 568
    :cond_0
    :goto_0
    return-void

    .line 566
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->P:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 567
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->P:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v1, v1

    mul-float/2addr v1, v3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v2, v2

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_0
.end method

.method protected final onDetachedFromWindow()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 574
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 575
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/ig;->E:Z

    .line 576
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/ig;->F:Z

    .line 577
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/ig;->G:Z

    .line 578
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/ig;->H:Z

    .line 580
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    rem-int/lit8 v0, v0, 0x5a

    if-nez v0, :cond_1

    .line 581
    const/4 v0, 0x4

    new-array v0, v0, [F

    aput v1, v0, v4

    aput v1, v0, v5

    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    aput v1, v0, v6

    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    aput v1, v0, v7

    .line 582
    const/4 v1, 0x4

    new-array v1, v1, [F

    .line 583
    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 585
    aget v0, v1, v4

    aget v2, v1, v6

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    .line 586
    aget v2, v1, v5

    aget v3, v1, v7

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    float-to-int v2, v2

    .line 587
    aget v3, v1, v4

    aget v4, v1, v6

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    float-to-int v3, v3

    .line 588
    aget v4, v1, v5

    aget v1, v1, v7

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    float-to-int v1, v1

    .line 590
    if-ltz v0, :cond_2

    int-to-float v0, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_2

    .line 591
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ig;->E:Z

    .line 596
    :cond_0
    :goto_0
    if-ltz v2, :cond_3

    int-to-float v0, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_3

    .line 597
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ig;->F:Z

    .line 608
    :cond_1
    :goto_1
    invoke-super {p0}, Lcom/roidapp/photogrid/release/aq;->onDetachedFromWindow()V

    .line 609
    return-void

    .line 592
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    if-gt v3, v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    iget v3, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v0, v0, v3

    if-gez v0, :cond_0

    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ig;->G:Z

    goto :goto_0

    .line 598
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    if-gt v1, v0, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 599
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ig;->H:Z

    goto :goto_1
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .prologue
    const/4 v12, 0x2

    const/4 v2, 0x1

    const/4 v7, 0x0

    const/high16 v11, 0x40000000    # 2.0f

    const/4 v0, 0x0

    .line 244
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/aq;->onDraw(Landroid/graphics/Canvas;)V

    .line 245
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/if;->h:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 480
    :cond_0
    :goto_0
    return-void

    .line 248
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 250
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->r:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->s:I

    int-to-float v4, v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v11

    iget-object v6, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v11

    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 252
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->p:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v11

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v11

    invoke-virtual {v1, v3, v4, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 253
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/roidapp/photogrid/release/if;->z:F

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v11

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v11

    invoke-virtual {v1, v3, v4, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 255
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->v:F

    iget v4, p0, Lcom/roidapp/photogrid/release/if;->r:F

    mul-float/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->v:F

    iget v5, p0, Lcom/roidapp/photogrid/release/if;->r:F

    mul-float/2addr v4, v5

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 256
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/roidapp/photogrid/release/if;->o:F

    iget v4, p0, Lcom/roidapp/photogrid/release/if;->o:F

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 292
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->t:F

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v4, v5

    iget v5, p0, Lcom/roidapp/photogrid/release/if;->r:F

    mul-float/2addr v4, v5

    div-float/2addr v4, v11

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v4, v4

    div-float/2addr v4, v11

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->u:F

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v6, v6, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v5, v6

    iget v6, p0, Lcom/roidapp/photogrid/release/if;->r:F

    mul-float/2addr v5, v6

    div-float/2addr v5, v11

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v5, v5

    div-float/2addr v5, v11

    add-float/2addr v4, v5

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 294
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/roidapp/photogrid/release/if;->x:F

    iget v4, p0, Lcom/roidapp/photogrid/release/if;->y:F

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 296
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->t:F

    iput v1, p0, Lcom/roidapp/photogrid/release/if;->u:F

    .line 297
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->u:F

    iput v1, p0, Lcom/roidapp/photogrid/release/if;->v:F

    .line 299
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/if;->t:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->p:I

    rem-int/lit8 v1, v1, 0x5a

    if-nez v1, :cond_3

    .line 301
    const/4 v1, 0x4

    new-array v1, v1, [F

    aput v0, v1, v7

    aput v0, v1, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    aput v3, v1, v12

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    aput v4, v1, v3

    .line 302
    const/4 v3, 0x4

    new-array v3, v3, [F

    .line 303
    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    invoke-virtual {v4, v3, v1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 305
    aget v1, v3, v7

    aget v4, v3, v12

    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 306
    aget v4, v3, v2

    const/4 v5, 0x3

    aget v5, v3, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 307
    aget v5, v3, v7

    aget v6, v3, v12

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v5

    .line 308
    aget v6, v3, v2

    const/4 v8, 0x3

    aget v3, v3, v8

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 339
    cmpl-float v6, v1, v0

    if-lez v6, :cond_8

    iget v6, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v6, v1, v6

    if-gez v6, :cond_8

    .line 340
    neg-float v1, v1

    .line 346
    :goto_1
    cmpl-float v5, v4, v0

    if-lez v5, :cond_9

    iget v5, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v5, v4, v5

    if-gez v5, :cond_9

    .line 347
    neg-float v0, v4

    .line 351
    :cond_2
    :goto_2
    iget v3, p0, Lcom/roidapp/photogrid/release/if;->u:F

    add-float/2addr v3, v1

    iput v3, p0, Lcom/roidapp/photogrid/release/if;->u:F

    .line 352
    iget v3, p0, Lcom/roidapp/photogrid/release/if;->v:F

    add-float/2addr v3, v0

    iput v3, p0, Lcom/roidapp/photogrid/release/if;->v:F

    .line 353
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    invoke-virtual {v3, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 357
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->G:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 358
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/if;->F:F

    .line 359
    new-instance v8, Landroid/graphics/CornerPathEffect;

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->F:F

    invoke-direct {v8, v0}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    .line 362
    const/4 v1, 0x0

    .line 364
    :try_start_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/if;->A:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v0, :cond_a

    .line 365
    :cond_4
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v4, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v2, v3, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 366
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v1

    .line 367
    :try_start_1
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 368
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 369
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 370
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 371
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 372
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 373
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    .line 375
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    new-instance v4, Landroid/graphics/drawable/shapes/PathShape;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->K:Landroid/graphics/Path;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    iget-object v9, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    invoke-direct {v4, v5, v6, v9}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    .line 376
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 377
    iget-object v3, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 378
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 381
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-object v6, v1

    .line 424
    :goto_3
    :try_start_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v0, :cond_f

    .line 1483
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    if-eqz v0, :cond_5

    .line 1484
    const/4 v1, 0x0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    div-int/lit8 v0, v0, 0x3

    int-to-float v2, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    div-int/lit8 v0, v0, 0x3

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 1485
    const/4 v1, 0x0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x2

    int-to-float v2, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x2

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 1486
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    div-int/lit8 v0, v0, 0x3

    int-to-float v1, v0

    const/4 v2, 0x0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    div-int/lit8 v0, v0, 0x3

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 1487
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x2

    int-to-float v1, v0

    const/4 v2, 0x0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x2

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v4, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->I:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 426
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v0, :cond_e

    .line 427
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 431
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget v1, p0, Lcom/roidapp/photogrid/release/if;->w:F

    iget v2, p0, Lcom/roidapp/photogrid/release/if;->p:I

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/if;->q:I

    int-to-float v3, v3

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/if;->a(Lcom/roidapp/photogrid/release/lc;FFF)Landroid/graphics/Path;

    move-result-object v0

    .line 432
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 445
    :cond_7
    :goto_5
    invoke-static {v6}, Lcom/roidapp/photogrid/release/if;->d(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 479
    :goto_6
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/aq;->onDraw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 341
    :cond_8
    iget v1, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v1, v1

    cmpg-float v1, v5, v1

    if-gez v1, :cond_15

    iget v1, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v1, v1

    sub-float/2addr v1, v5

    iget v6, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v1, v1, v6

    if-gez v1, :cond_15

    .line 342
    iget v1, p0, Lcom/roidapp/photogrid/release/if;->f:I

    int-to-float v1, v1

    sub-float/2addr v1, v5

    goto/16 :goto_1

    .line 348
    :cond_9
    iget v4, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v4, v4

    cmpg-float v4, v3, v4

    if-gez v4, :cond_2

    iget v4, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v4, v4

    sub-float/2addr v4, v3

    iget v5, p0, Lcom/roidapp/photogrid/release/if;->H:F

    cmpg-float v4, v4, v5

    if-gez v4, :cond_2

    .line 349
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    int-to-float v0, v0

    sub-float/2addr v0, v3

    goto/16 :goto_2

    .line 383
    :cond_a
    :try_start_3
    iget v3, p0, Lcom/roidapp/photogrid/release/if;->f:I

    .line 384
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    .line 386
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    sget-object v4, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v0, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v1

    .line 387
    if-nez v1, :cond_14

    .line 388
    :try_start_4
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    div-int/lit8 v3, v0, 0x2

    .line 389
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->g:I

    div-int/lit8 v0, v0, 0x2

    .line 390
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    sget-object v4, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v0, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    move v13, v2

    move v2, v0

    move v0, v13

    .line 393
    :goto_7
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 395
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->G:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 396
    if-eqz v0, :cond_b

    .line 397
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    const/high16 v6, 0x3f000000    # 0.5f

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-virtual {v5, v6, v9}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 399
    :cond_b
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->L:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->reset()V

    .line 400
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->L:Landroid/graphics/Paint;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 401
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->L:Landroid/graphics/Paint;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 402
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/if;->J:Landroid/graphics/Matrix;

    iget-object v9, p0, Lcom/roidapp/photogrid/release/if;->L:Landroid/graphics/Paint;

    invoke-virtual {v4, v5, v6, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 403
    invoke-virtual {v4}, Landroid/graphics/Canvas;->save()I

    .line 404
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_c

    .line 405
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->L:Landroid/graphics/Paint;

    new-instance v6, Landroid/graphics/PorterDuffXfermode;

    sget-object v9, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v6, v9}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 406
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/if;->P:Landroid/graphics/Matrix;

    iget-object v9, p0, Lcom/roidapp/photogrid/release/if;->L:Landroid/graphics/Paint;

    invoke-virtual {v4, v5, v6, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 410
    :cond_c
    new-instance v4, Landroid/graphics/BitmapShader;

    sget-object v5, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v4, v1, v5, v6}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 411
    iget-object v5, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 412
    if-eqz v0, :cond_d

    .line 413
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    new-instance v5, Landroid/graphics/drawable/shapes/PathShape;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget v9, p0, Lcom/roidapp/photogrid/release/if;->p:I

    int-to-float v9, v9

    div-float/2addr v9, v11

    iget v10, p0, Lcom/roidapp/photogrid/release/if;->q:I

    int-to-float v10, v10

    div-float/2addr v10, v11

    invoke-static {v6, v9, v10}, Lcom/roidapp/photogrid/release/if;->a(Lcom/roidapp/photogrid/release/lc;FF)Landroid/graphics/Path;

    move-result-object v6

    int-to-float v3, v3

    int-to-float v2, v2

    invoke-direct {v5, v6, v3, v2}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    .line 417
    :goto_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 418
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 419
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lcom/roidapp/photogrid/release/if;->f:I

    iget v5, p0, Lcom/roidapp/photogrid/release/if;->g:I

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 420
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    move-object v6, v1

    goto/16 :goto_3

    .line 415
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->O:Landroid/graphics/drawable/ShapeDrawable;

    new-instance v6, Landroid/graphics/drawable/shapes/PathShape;

    int-to-float v3, v3

    int-to-float v2, v2

    invoke-direct {v6, v5, v3, v2}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-virtual {v0, v6}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_8

    .line 446
    :catch_0
    move-exception v0

    move-object v13, v0

    move-object v0, v1

    move-object v1, v13

    .line 447
    :goto_9
    invoke-static {v0}, Lcom/roidapp/photogrid/release/if;->d(Landroid/graphics/Bitmap;)V

    .line 448
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_12

    .line 449
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 450
    const/16 v0, 0xe

    iput v0, v2, Landroid/os/Message;->what:I

    .line 451
    const/16 v0, 0xc9

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 452
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 461
    :goto_a
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_6

    .line 429
    :cond_e
    :try_start_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    goto/16 :goto_4

    .line 446
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v6

    goto :goto_9

    .line 434
    :cond_f
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/if;->D:Z

    if-eqz v0, :cond_7

    .line 435
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/if;->D:Z

    .line 436
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/if;->C:Z

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v0, :cond_11

    .line 437
    :cond_10
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/ComposePathEffect;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/if;->N:Landroid/graphics/DashPathEffect;

    invoke-direct {v1, v2, v8}, Landroid/graphics/ComposePathEffect;-><init>(Landroid/graphics/PathEffect;Landroid/graphics/PathEffect;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 441
    :goto_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    iget v1, p0, Lcom/roidapp/photogrid/release/if;->w:F

    iget v2, p0, Lcom/roidapp/photogrid/release/if;->p:I

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/if;->q:I

    int-to-float v3, v3

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/if;->a(Lcom/roidapp/photogrid/release/lc;FFF)Landroid/graphics/Path;

    move-result-object v0

    .line 442
    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto/16 :goto_5

    .line 462
    :catch_2
    move-exception v0

    move-object v1, v0

    .line 463
    :goto_c
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 464
    invoke-static {v6}, Lcom/roidapp/photogrid/release/if;->d(Landroid/graphics/Bitmap;)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_13

    .line 466
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 467
    const/16 v0, 0xe

    iput v0, v2, Landroid/os/Message;->what:I

    .line 468
    const/16 v0, 0xca

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 477
    :goto_d
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_6

    .line 439
    :cond_11
    :try_start_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->M:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/if;->N:Landroid/graphics/DashPathEffect;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_b

    .line 454
    :cond_12
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 455
    iput v12, v2, Landroid/os/Message;->what:I

    .line 456
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 457
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_a

    .line 471
    :cond_13
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 472
    iput v12, v2, Landroid/os/Message;->what:I

    .line 473
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 474
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 475
    iget-object v0, p0, Lcom/roidapp/photogrid/release/if;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_d

    .line 462
    :catch_3
    move-exception v0

    move-object v6, v1

    move-object v1, v0

    goto :goto_c

    :catch_4
    move-exception v0

    move-object v6, v1

    move-object v1, v0

    goto :goto_c

    .line 446
    :catch_5
    move-exception v0

    move-object v13, v0

    move-object v0, v1

    move-object v1, v13

    goto/16 :goto_9

    :cond_14
    move v2, v0

    move v0, v7

    goto/16 :goto_7

    :cond_15
    move v1, v0

    goto/16 :goto_1
.end method

.method public final onMeasure(II)V
    .locals 2

    .prologue
    .line 206
    iget v0, p0, Lcom/roidapp/photogrid/release/if;->f:I

    iget v1, p0, Lcom/roidapp/photogrid/release/if;->g:I

    invoke-super {p0, v0, v1}, Lcom/roidapp/photogrid/release/aq;->setMeasuredDimension(II)V

    .line 207
    return-void
.end method
