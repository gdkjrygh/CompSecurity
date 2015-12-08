.class public Lcom/roidapp/photogrid/release/PhotoView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private A:Landroid/graphics/Paint;

.field private B:Ljava/util/Timer;

.field private C:Z

.field private D:Landroid/graphics/DrawFilter;

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:J

.field private I:Z

.field private J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/id;",
            ">;"
        }
    .end annotation
.end field

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:Lcom/roidapp/photogrid/release/id;

.field private R:Lcom/roidapp/photogrid/release/if;

.field private S:Landroid/widget/RelativeLayout;

.field private T:Z

.field public a:Z

.field protected b:I

.field private c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation
.end field

.field private h:F

.field private final i:I

.field private j:I

.field private k:F

.field private l:F

.field private m:Z

.field private n:Landroid/graphics/Bitmap;

.field private o:Landroid/graphics/Point;

.field private p:Landroid/graphics/Bitmap;

.field private q:Landroid/graphics/Bitmap;

.field private r:Landroid/graphics/Bitmap;

.field private s:Landroid/graphics/RectF;

.field private t:Landroid/graphics/RectF;

.field private u:Landroid/graphics/RectF;

.field private v:Landroid/graphics/Paint;

.field private w:I

.field private x:J

.field private y:F

.field private z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 92
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    .line 50
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    .line 52
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->i:I

    .line 54
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    .line 55
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->m:Z

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->o:Landroid/graphics/Point;

    .line 61
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->s:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->t:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->u:Landroid/graphics/RectF;

    .line 63
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 64
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->w:I

    .line 65
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->x:J

    .line 66
    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    .line 68
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->z:Landroid/graphics/Paint;

    .line 69
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->A:Landroid/graphics/Paint;

    .line 71
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0x8

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    .line 143
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x7

    invoke-direct {v0, v2, v3}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->D:Landroid/graphics/DrawFilter;

    .line 365
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->E:Z

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->F:Z

    .line 366
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    .line 368
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->I:Z

    .line 1365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    .line 1372
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->T:Z

    .line 93
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->p()V

    .line 94
    return-void

    :cond_0
    move v0, v2

    .line 71
    goto :goto_0
.end method

.method public constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V
    .locals 7

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 74
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    .line 50
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    .line 52
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->i:I

    .line 54
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    .line 55
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->m:Z

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->o:Landroid/graphics/Point;

    .line 61
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->s:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->t:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->u:Landroid/graphics/RectF;

    .line 63
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 64
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->w:I

    .line 65
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->x:J

    .line 66
    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    .line 68
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->z:Landroid/graphics/Paint;

    .line 69
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->A:Landroid/graphics/Paint;

    .line 71
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0x8

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    .line 143
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x7

    invoke-direct {v0, v2, v3}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->D:Landroid/graphics/DrawFilter;

    .line 365
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->E:Z

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->F:Z

    .line 366
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    .line 368
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->I:Z

    .line 1365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    .line 1372
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->T:Z

    .line 75
    iput-object p1, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 76
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->p()V

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->z:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 78
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->z:Landroid/graphics/Paint;

    const v2, -0x3f282829

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 79
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->A:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->A:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 81
    invoke-virtual {p1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v6

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    .line 82
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    cmpg-float v0, v0, v6

    if-gez v0, :cond_0

    .line 83
    iput v6, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->z:Landroid/graphics/Paint;

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 88
    invoke-static {}, Lcom/roidapp/photogrid/release/pr;->a()Lcom/roidapp/photogrid/release/pr;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/pr;->a(Ljava/util/List;)V

    .line 89
    return-void

    :cond_1
    move v0, v2

    .line 71
    goto :goto_0
.end method

.method private static a(FFFF)F
    .locals 2

    .prologue
    .line 1130
    sub-float v0, p0, p2

    .line 1131
    sub-float v1, p1, p3

    .line 1132
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method private static a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 13

    .prologue
    const/high16 v12, 0x43340000    # 180.0f

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    const/4 v6, 0x0

    .line 893
    iget v4, p0, Landroid/graphics/PointF;->x:F

    iget v5, p1, Landroid/graphics/PointF;->x:F

    sub-float v7, v4, v5

    .line 894
    iget v4, p0, Landroid/graphics/PointF;->y:F

    iget v5, p1, Landroid/graphics/PointF;->y:F

    sub-float v8, v4, v5

    .line 896
    float-to-double v4, v7

    mul-float v9, v7, v7

    mul-float v10, v8, v8

    add-float/2addr v9, v10

    float-to-double v10, v9

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    div-double/2addr v4, v10

    .line 897
    cmpl-double v9, v4, v0

    if-lez v9, :cond_0

    .line 902
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->asin(D)D

    move-result-wide v0

    const-wide v2, 0x4066800000000000L    # 180.0

    mul-double/2addr v0, v2

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v0, v2

    double-to-float v0, v0

    .line 903
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_1

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_1

    .line 904
    const/high16 v1, 0x43b40000    # 360.0f

    sub-float v0, v1, v0

    .line 912
    :goto_1
    return v0

    .line 899
    :cond_0
    cmpg-double v0, v4, v2

    if-gez v0, :cond_5

    move-wide v0, v2

    .line 900
    goto :goto_0

    .line 905
    :cond_1
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_2

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_2

    .line 906
    neg-float v0, v0

    goto :goto_1

    .line 907
    :cond_2
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_3

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_3

    .line 908
    add-float/2addr v0, v12

    goto :goto_1

    .line 909
    :cond_3
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_4

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_4

    .line 910
    add-float/2addr v0, v12

    goto :goto_1

    :cond_4
    move v0, v6

    goto :goto_1

    :cond_5
    move-wide v0, v4

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method private a(Landroid/graphics/Canvas;Landroid/graphics/PointF;ILandroid/graphics/Paint;)V
    .locals 10

    .prologue
    const/4 v6, 0x0

    .line 294
    int-to-float v0, p3

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    div-float/2addr v0, v1

    float-to-int v8, v0

    .line 295
    iget v0, p2, Landroid/graphics/PointF;->x:F

    div-int/lit8 v1, p3, 0x2

    int-to-float v1, v1

    sub-float v9, v0, v1

    move v7, v6

    .line 296
    :goto_0
    if-ge v7, v8, :cond_1

    .line 297
    rem-int/lit8 v0, v7, 0x2

    if-nez v0, :cond_0

    .line 298
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    int-to-float v1, v7

    mul-float/2addr v0, v1

    add-float v1, v9, v0

    iget v2, p2, Landroid/graphics/PointF;->y:F

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    add-int/lit8 v3, v7, 0x1

    int-to-float v3, v3

    mul-float/2addr v0, v3

    add-float v3, v9, v0

    iget v4, p2, Landroid/graphics/PointF;->y:F

    move-object v0, p1

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 296
    :cond_0
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    .line 301
    :cond_1
    iget v0, p2, Landroid/graphics/PointF;->y:F

    div-int/lit8 v1, p3, 0x2

    int-to-float v1, v1

    sub-float v7, v0, v1

    .line 302
    :goto_1
    if-ge v6, v8, :cond_3

    .line 303
    rem-int/lit8 v0, v6, 0x2

    if-nez v0, :cond_2

    .line 304
    iget v1, p2, Landroid/graphics/PointF;->x:F

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    int-to-float v2, v6

    mul-float/2addr v0, v2

    add-float v2, v7, v0

    iget v3, p2, Landroid/graphics/PointF;->x:F

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->y:F

    add-int/lit8 v4, v6, 0x1

    int-to-float v4, v4

    mul-float/2addr v0, v4

    add-float v4, v7, v0

    move-object v0, p1

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 302
    :cond_2
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_1

    .line 307
    :cond_3
    return-void
.end method

.method private a(Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/roidapp/photogrid/release/id;Z)V
    .locals 6

    .prologue
    const/high16 v5, 0x42c80000    # 100.0f

    const/high16 v4, 0x40000000    # 2.0f

    .line 1470
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1471
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 1472
    const/4 v0, 0x0

    .line 1475
    :cond_0
    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget v2, p2, Landroid/graphics/PointF;->x:F

    add-float/2addr v1, v2

    div-float/2addr v1, v4

    sub-float/2addr v1, v0

    .line 1476
    iget v2, p1, Landroid/graphics/PointF;->y:F

    iget v3, p2, Landroid/graphics/PointF;->y:F

    add-float/2addr v2, v3

    div-float/2addr v2, v4

    sub-float v0, v2, v0

    .line 1477
    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->O:I

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->M:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v1, v5

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    int-to-float v3, v3

    mul-float/2addr v1, v3

    add-float/2addr v1, v2

    .line 1478
    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->P:I

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->N:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v0, v5

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    int-to-float v3, v3

    mul-float/2addr v0, v3

    add-float/2addr v0, v2

    .line 1479
    invoke-virtual {p3, v1, v0, p4}, Lcom/roidapp/photogrid/release/id;->a(FFZ)V

    .line 1492
    return-void
.end method

.method private a(FF)[F
    .locals 3

    .prologue
    .line 1143
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float v2, p1, v2

    aput v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float v2, p2, v2

    aput v2, v0, v1

    .line 1146
    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    return-object v0
.end method

.method private b(FF)[F
    .locals 3

    .prologue
    .line 1149
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float v2, p1, v2

    aput v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float v2, p2, v2

    aput v2, v0, v1

    .line 1152
    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    return-object v0
.end method

.method private static e(Lcom/roidapp/photogrid/release/ao;)V
    .locals 6

    .prologue
    const/high16 v5, 0x42ae0000    # 87.0f

    const/high16 v4, 0x40400000    # 3.0f

    const/4 v3, 0x0

    const/high16 v2, 0x42b40000    # 90.0f

    .line 334
    if-eqz p0, :cond_0

    .line 335
    instance-of v0, p0, Lcom/roidapp/photogrid/release/ra;

    if-nez v0, :cond_3

    .line 336
    iget v0, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    rem-float/2addr v0, v2

    .line 338
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v4

    if-gez v1, :cond_1

    .line 339
    iget v1, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    sub-float v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    .line 361
    :cond_0
    :goto_0
    return-void

    .line 340
    :cond_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v5

    if-lez v1, :cond_0

    .line 341
    cmpl-float v1, v0, v3

    if-lez v1, :cond_2

    .line 342
    iget v1, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    sub-float v0, v2, v0

    add-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    goto :goto_0

    .line 344
    :cond_2
    iget v1, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    add-float/2addr v0, v2

    sub-float v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    goto :goto_0

    .line 348
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/ao;->l:F

    rem-float/2addr v0, v2

    .line 350
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v4

    if-gez v1, :cond_4

    .line 351
    neg-float v0, v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    goto :goto_0

    .line 352
    :cond_4
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v5

    if-lez v1, :cond_0

    .line 353
    cmpl-float v1, v0, v3

    if-lez v1, :cond_5

    .line 354
    sub-float v0, v2, v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    goto :goto_0

    .line 356
    :cond_5
    neg-float v0, v0

    sub-float/2addr v0, v2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    goto :goto_0
.end method

.method private p()V
    .locals 2

    .prologue
    .line 97
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->v:Landroid/graphics/Paint;

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->v:Landroid/graphics/Paint;

    const v1, -0xffff01

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->v:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 100
    return-void
.end method

.method private declared-synchronized q()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 134
    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    move v1, v0

    .line 135
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 136
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-eq v1, v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/ao;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 141
    :cond_1
    monitor-exit p0

    return-void

    .line 134
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized r()V
    .locals 2

    .prologue
    .line 1220
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 1221
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ao;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1220
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 1223
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->n:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->n:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->n:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1226
    :cond_1
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 1177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-eq v0, v2, :cond_0

    .line 1178
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 1179
    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 1180
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 1183
    :cond_0
    return-void
.end method

.method public final declared-synchronized a(Lcom/roidapp/photogrid/release/ao;)V
    .locals 3

    .prologue
    .line 103
    monitor-enter p0

    :try_start_0
    instance-of v1, p1, Lcom/roidapp/photogrid/release/qz;

    if-eqz v1, :cond_1

    .line 104
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    move-object v1, v0

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    monitor-exit p0

    return-void

    .line 105
    :cond_1
    :try_start_1
    instance-of v1, p1, Lcom/roidapp/photogrid/release/ps;

    if-eqz v1, :cond_2

    .line 106
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    move-object v1, v0

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 103
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 107
    :cond_2
    :try_start_2
    instance-of v1, p1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    .line 108
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v1, v0

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/photogrid/release/if;Landroid/widget/RelativeLayout;Z)V
    .locals 17

    .prologue
    .line 1376
    invoke-virtual/range {p2 .. p2}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1377
    iget v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->O:I

    .line 1378
    iget v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->P:I

    .line 1379
    iget v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    .line 1380
    iget v2, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    .line 1384
    if-eqz p3, :cond_0

    .line 1385
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->T:Z

    .line 1387
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/roidapp/photogrid/release/PhotoView;->R:Lcom/roidapp/photogrid/release/if;

    .line 1388
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/roidapp/photogrid/release/PhotoView;->S:Landroid/widget/RelativeLayout;

    .line 1392
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/roidapp/photogrid/release/if;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1393
    iget v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->M:I

    .line 1394
    iget v2, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->N:I

    .line 1397
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aR()F

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    int-to-float v3, v3

    mul-float v11, v2, v3

    .line 1398
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aS()F

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    int-to-float v3, v3

    mul-float v12, v2, v3

    .line 1401
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 1402
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    new-instance v3, Lcom/roidapp/photogrid/release/id;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/roidapp/photogrid/release/id;-><init>(Landroid/app/Activity;I)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1403
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    new-instance v3, Lcom/roidapp/photogrid/release/id;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Lcom/roidapp/photogrid/release/id;-><init>(Landroid/app/Activity;I)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1404
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    new-instance v3, Lcom/roidapp/photogrid/release/id;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v5, 0x2

    invoke-direct {v3, v4, v5}, Lcom/roidapp/photogrid/release/id;-><init>(Landroid/app/Activity;I)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1405
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    new-instance v3, Lcom/roidapp/photogrid/release/id;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/roidapp/photogrid/release/id;-><init>(Landroid/app/Activity;I)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1408
    :cond_1
    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/roidapp/photogrid/release/if;->b:Lcom/roidapp/photogrid/release/lc;

    .line 1409
    iget-object v2, v9, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 1410
    iget-object v3, v9, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 1411
    iget-object v4, v9, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v5, 0x2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 1412
    iget-object v5, v9, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v6, 0x3

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    .line 1413
    iget-object v6, v9, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/PointF;

    .line 1414
    iget-object v7, v9, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/PointF;

    .line 1415
    iget-object v8, v9, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    const/4 v10, 0x2

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/PointF;

    .line 1416
    iget-object v9, v9, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    const/4 v10, 0x3

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/PointF;

    .line 1419
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    const/4 v13, 0x0

    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/roidapp/photogrid/release/id;

    .line 1420
    invoke-virtual {v10, v6, v7}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 1421
    move-object/from16 v0, p0

    iget v13, v0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    move-object/from16 v0, p0

    iget v14, v0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    move-object/from16 v0, p0

    iget v15, v0, Lcom/roidapp/photogrid/release/PhotoView;->O:I

    move-object/from16 v0, p0

    iget v0, v0, Lcom/roidapp/photogrid/release/PhotoView;->P:I

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-virtual {v10, v13, v14, v15, v0}, Lcom/roidapp/photogrid/release/id;->a(IIII)V

    .line 1422
    invoke-virtual {v10, v11, v12}, Lcom/roidapp/photogrid/release/id;->a(FF)V

    .line 1423
    iget v13, v6, Landroid/graphics/PointF;->y:F

    const/4 v14, 0x0

    cmpg-float v13, v13, v14

    if-lez v13, :cond_2

    iget v13, v7, Landroid/graphics/PointF;->y:F

    const/4 v14, 0x0

    cmpg-float v13, v13, v14

    if-gtz v13, :cond_6

    .line 1424
    :cond_2
    const/4 v13, 0x0

    iput-boolean v13, v10, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1430
    :goto_0
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    const/4 v13, 0x1

    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/roidapp/photogrid/release/id;

    .line 1431
    invoke-virtual {v10, v7, v8}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 1432
    move-object/from16 v0, p0

    iget v13, v0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    move-object/from16 v0, p0

    iget v14, v0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    move-object/from16 v0, p0

    iget v15, v0, Lcom/roidapp/photogrid/release/PhotoView;->O:I

    move-object/from16 v0, p0

    iget v0, v0, Lcom/roidapp/photogrid/release/PhotoView;->P:I

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-virtual {v10, v13, v14, v15, v0}, Lcom/roidapp/photogrid/release/id;->a(IIII)V

    .line 1433
    invoke-virtual {v10, v11, v12}, Lcom/roidapp/photogrid/release/id;->a(FF)V

    .line 1434
    iget v7, v7, Landroid/graphics/PointF;->x:F

    const/high16 v13, 0x42c80000    # 100.0f

    cmpl-float v7, v7, v13

    if-gez v7, :cond_3

    iget v7, v8, Landroid/graphics/PointF;->x:F

    const/high16 v13, 0x42c80000    # 100.0f

    cmpl-float v7, v7, v13

    if-ltz v7, :cond_7

    .line 1435
    :cond_3
    const/4 v3, 0x0

    iput-boolean v3, v10, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1441
    :goto_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    const/4 v7, 0x2

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/id;

    .line 1442
    invoke-virtual {v3, v9, v8}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 1443
    move-object/from16 v0, p0

    iget v7, v0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    move-object/from16 v0, p0

    iget v10, v0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    move-object/from16 v0, p0

    iget v13, v0, Lcom/roidapp/photogrid/release/PhotoView;->O:I

    move-object/from16 v0, p0

    iget v14, v0, Lcom/roidapp/photogrid/release/PhotoView;->P:I

    invoke-virtual {v3, v7, v10, v13, v14}, Lcom/roidapp/photogrid/release/id;->a(IIII)V

    .line 1444
    invoke-virtual {v3, v11, v12}, Lcom/roidapp/photogrid/release/id;->a(FF)V

    .line 1445
    iget v7, v9, Landroid/graphics/PointF;->y:F

    const/high16 v10, 0x42c80000    # 100.0f

    cmpl-float v7, v7, v10

    if-gez v7, :cond_4

    iget v7, v8, Landroid/graphics/PointF;->y:F

    const/high16 v8, 0x42c80000    # 100.0f

    cmpl-float v7, v7, v8

    if-ltz v7, :cond_8

    .line 1446
    :cond_4
    const/4 v4, 0x0

    iput-boolean v4, v3, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1452
    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    const/4 v4, 0x3

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/id;

    .line 1453
    invoke-virtual {v3, v6, v9}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 1454
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    move-object/from16 v0, p0

    iget v8, v0, Lcom/roidapp/photogrid/release/PhotoView;->O:I

    move-object/from16 v0, p0

    iget v10, v0, Lcom/roidapp/photogrid/release/PhotoView;->P:I

    invoke-virtual {v3, v4, v7, v8, v10}, Lcom/roidapp/photogrid/release/id;->a(IIII)V

    .line 1455
    invoke-virtual {v3, v11, v12}, Lcom/roidapp/photogrid/release/id;->a(FF)V

    .line 1456
    iget v4, v6, Landroid/graphics/PointF;->x:F

    const/4 v6, 0x0

    cmpg-float v4, v4, v6

    if-lez v4, :cond_5

    iget v4, v9, Landroid/graphics/PointF;->x:F

    const/4 v6, 0x0

    cmpg-float v4, v4, v6

    if-gtz v4, :cond_9

    .line 1457
    :cond_5
    const/4 v2, 0x0

    iput-boolean v2, v3, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1463
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 1465
    return-void

    .line 1426
    :cond_6
    const/4 v13, 0x1

    iput-boolean v13, v10, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1427
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-direct {v0, v2, v3, v10, v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/roidapp/photogrid/release/id;Z)V

    goto/16 :goto_0

    .line 1437
    :cond_7
    const/4 v7, 0x1

    iput-boolean v7, v10, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1438
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-direct {v0, v3, v4, v10, v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/roidapp/photogrid/release/id;Z)V

    goto/16 :goto_1

    .line 1448
    :cond_8
    const/4 v7, 0x1

    iput-boolean v7, v3, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1449
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-direct {v0, v5, v4, v3, v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/roidapp/photogrid/release/id;Z)V

    goto :goto_2

    .line 1459
    :cond_9
    const/4 v4, 0x1

    iput-boolean v4, v3, Lcom/roidapp/photogrid/release/id;->c:Z

    .line 1460
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-direct {v0, v2, v5, v3, v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Lcom/roidapp/photogrid/release/id;Z)V

    goto :goto_3
.end method

.method public final declared-synchronized a(Lcom/roidapp/photogrid/release/ra;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 1312
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/ra;->f:Z

    if-eqz v0, :cond_1

    .line 1314
    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/roidapp/photogrid/release/ra;->f:Z

    .line 1315
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 1316
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 1326
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1327
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1328
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1329
    monitor-exit p0

    return-void

    .line 1319
    :cond_1
    :try_start_1
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-eq v0, v1, :cond_0

    .line 1320
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 1321
    if-ltz v0, :cond_0

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-ge v0, v1, :cond_0

    .line 1322
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1312
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 1254
    monitor-enter p0

    if-eqz p1, :cond_2

    .line 1255
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1256
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ao;

    .line 1257
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    move-object v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1258
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1254
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 1261
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 1262
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1264
    :cond_2
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/qz;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 124
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 125
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 126
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 127
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 124
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 129
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    monitor-exit p0

    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    .line 1497
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/id;

    .line 1498
    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/id;->c:Z

    goto :goto_0

    .line 1501
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    if-eqz v0, :cond_1

    .line 1502
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 1503
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    .line 1505
    :cond_1
    if-eqz p1, :cond_2

    .line 1506
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->T:Z

    .line 1507
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 1509
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1186
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 1187
    return-void
.end method

.method public final declared-synchronized b(Lcom/roidapp/photogrid/release/ao;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 1019
    monitor-enter p0

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1020
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v3, v1, [Lcom/roidapp/photogrid/release/ao;

    .line 1021
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 1022
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1023
    const/4 v1, 0x0

    iput v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    move v1, v0

    .line 1024
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1026
    if-ge v1, v4, :cond_0

    .line 1027
    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    aput-object v0, v3, v5

    .line 1028
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 1024
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1030
    :cond_0
    if-le v1, v4, :cond_1

    .line 1031
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    aput-object v0, v3, v1

    .line 1032
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 1019
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 1034
    :cond_1
    const/4 v5, 0x0

    :try_start_1
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    aput-object v0, v3, v5

    .line 1035
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 1036
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    .line 1037
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    goto :goto_1

    .line 1040
    :cond_2
    array-length v0, v3

    if-ne v0, v6, :cond_3

    .line 1041
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 1042
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    .line 1044
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1045
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1047
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->q()V

    .line 1048
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1049
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized b(Ljava/lang/String;)Z
    .locals 6

    .prologue
    .line 1271
    monitor-enter p0

    const/4 v3, 0x0

    .line 1272
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1273
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ao;

    .line 1274
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    move-object v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/release/qz;->R:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1275
    const/4 v2, 0x1

    .line 1276
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v2

    :goto_1
    move v3, v1

    .line 1278
    goto :goto_0

    .line 1279
    :cond_0
    if-eqz v3, :cond_1

    .line 1280
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 1281
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1283
    :cond_1
    monitor-exit p0

    return v3

    .line 1271
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    :cond_2
    move v1, v3

    goto :goto_1
.end method

.method public final declared-synchronized c(Lcom/roidapp/photogrid/release/ao;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 1058
    monitor-enter p0

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1059
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v3, v1, [Lcom/roidapp/photogrid/release/ao;

    .line 1060
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 1061
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1062
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    move v1, v0

    .line 1063
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 1064
    if-ne v1, v4, :cond_2

    .line 1065
    if-nez v1, :cond_0

    .line 1066
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 1067
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    .line 1075
    :goto_1
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 1079
    :goto_2
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    aput-object v0, v3, v1

    .line 1063
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1068
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v1, v0, :cond_1

    .line 1069
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 1070
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 1058
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 1072
    :cond_1
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 1073
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    goto :goto_1

    .line 1077
    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    goto :goto_2

    .line 1081
    :cond_3
    array-length v0, v3

    if-ne v0, v6, :cond_4

    .line 1082
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 1083
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    .line 1085
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1086
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1088
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->q()V

    .line 1089
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1090
    monitor-exit p0

    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 1190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final declared-synchronized c(Ljava/lang/String;)Z
    .locals 6

    .prologue
    .line 1292
    monitor-enter p0

    const/4 v3, 0x0

    .line 1293
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1294
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ao;

    .line 1295
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    move-object v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1296
    const/4 v2, 0x1

    .line 1297
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v2

    :goto_1
    move v3, v1

    .line 1299
    goto :goto_0

    .line 1300
    :cond_0
    if-eqz v3, :cond_1

    .line 1301
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 1302
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1304
    :cond_1
    monitor-exit p0

    return v3

    .line 1292
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    :cond_2
    move v1, v3

    goto :goto_1
.end method

.method public final declared-synchronized d(Lcom/roidapp/photogrid/release/ao;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 1098
    monitor-enter p0

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1099
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v3, v1, [Lcom/roidapp/photogrid/release/ao;

    .line 1100
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 1101
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1102
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    move v1, v0

    .line 1103
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1105
    if-ge v1, v4, :cond_0

    .line 1106
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    aput-object v0, v3, v1

    .line 1107
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 1103
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1108
    :cond_0
    if-le v1, v4, :cond_1

    .line 1109
    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    aput-object v0, v3, v5

    .line 1110
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 1098
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 1112
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    aput-object v0, v3, v5

    .line 1113
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 1114
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 1115
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    const/4 v5, 0x0

    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    goto :goto_1

    .line 1118
    :cond_2
    array-length v0, v3

    if-ne v0, v6, :cond_3

    .line 1119
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    .line 1120
    const/4 v0, 0x0

    aget-object v0, v3, v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    .line 1122
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1125
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->q()V

    .line 1126
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1127
    monitor-exit p0

    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 1194
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1198
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    return-object v0
.end method

.method public final g()Lcom/roidapp/photogrid/release/ao;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1210
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_0
    move-object v0, v1

    .line 1214
    :cond_1
    :goto_0
    return-object v0

    .line 1213
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 1214
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-nez v2, :cond_1

    move-object v0, v1

    goto :goto_0
.end method

.method public final declared-synchronized h()V
    .locals 1

    .prologue
    .line 1229
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->r()V

    .line 1230
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1231
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1234
    monitor-exit p0

    return-void

    .line 1229
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized i()V
    .locals 2

    .prologue
    .line 1240
    monitor-enter p0

    const/4 v0, -0x1

    :try_start_0
    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 1241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 1242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1243
    monitor-exit p0

    return-void

    .line 1240
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1246
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    return-object v0
.end method

.method public final k()I
    .locals 1

    .prologue
    .line 1250
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final l()I
    .locals 1

    .prologue
    .line 1352
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->w:I

    return v0
.end method

.method public final m()I
    .locals 1

    .prologue
    .line 1356
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    return v0
.end method

.method public final n()V
    .locals 1

    .prologue
    .line 1360
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 1361
    return-void
.end method

.method public final o()V
    .locals 6

    .prologue
    .line 1523
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/id;

    .line 1524
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/id;->c:Z

    if-eqz v2, :cond_0

    .line 1525
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    if-eqz v1, :cond_1

    .line 1526
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 1527
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    .line 1529
    :cond_1
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    .line 1530
    const/16 v1, 0xc8

    .line 1531
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-ne v2, v3, :cond_3

    .line 1532
    const/16 v1, 0x12c

    move v4, v1

    .line 1534
    :goto_0
    new-instance v1, Lcom/roidapp/photogrid/release/pq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/pq;-><init>(Lcom/roidapp/photogrid/release/PhotoView;)V

    .line 1535
    iput-object v0, v1, Lcom/roidapp/photogrid/release/pq;->c:Lcom/roidapp/photogrid/release/id;

    .line 1536
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    const-wide/16 v2, 0x258

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 1540
    :cond_2
    return-void

    :cond_3
    move v4, v1

    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1158
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 1159
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoView;->r()V

    .line 1160
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1161
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1162
    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    .line 1164
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1166
    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;

    .line 1168
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1170
    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    .line 6512
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/id;

    .line 6513
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/id;->a()V

    goto :goto_0

    .line 6515
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    if-eqz v0, :cond_4

    .line 6516
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 6517
    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    .line 6519
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1174
    return-void
.end method

.method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .prologue
    const/4 v11, -0x1

    .line 148
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->D:Landroid/graphics/DrawFilter;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 149
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v5, v1

    :goto_0
    if-ltz v5, :cond_18

    .line 150
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ao;

    .line 152
    instance-of v2, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_c

    .line 153
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    :try_start_1
    invoke-virtual {v2, p1}, Lcom/roidapp/photogrid/release/ra;->b(Landroid/graphics/Canvas;)V

    .line 156
    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ra;->ak:Z

    .line 157
    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ra;->al:Z

    .line 158
    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ra;->am:Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    :cond_0
    :goto_1
    :try_start_2
    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ra;->al:Z

    if-nez v3, :cond_1

    .line 173
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->r()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/roidapp/photogrid/release/ra;->L:Ljava/lang/String;

    .line 179
    :cond_1
    :goto_2
    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->m:Z

    if-eqz v2, :cond_2

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v2, :cond_2

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->A:Z

    if-eqz v2, :cond_2

    .line 182
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v3, 0xe

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v4, 0xf

    aget v3, v3, v4

    iget-object v4, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v6, 0x6

    aget v4, v4, v6

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v7, 0x7

    aget v6, v6, v7

    invoke-static {v2, v3, v4, v6}, Lcom/roidapp/photogrid/release/PhotoView;->a(FFFF)F

    move-result v2

    float-to-int v2, v2

    .line 183
    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    iget-object v4, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v6, 0x3

    aget v4, v4, v6

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v7, 0xa

    aget v6, v6, v7

    iget-object v7, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v8, 0xb

    aget v7, v7, v8

    invoke-static {v3, v4, v6, v7}, Lcom/roidapp/photogrid/release/PhotoView;->a(FFFF)F

    move-result v3

    float-to-int v3, v3

    .line 184
    if-le v2, v3, :cond_d

    .line 189
    :goto_3
    int-to-float v2, v2

    const v3, 0x3f99999a    # 1.2f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 190
    new-instance v3, Landroid/graphics/PointF;

    iget-object v4, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v6, 0x10

    aget v4, v4, v6

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v7, 0x11

    aget v6, v6, v7

    invoke-direct {v3, v4, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->z:Landroid/graphics/Paint;

    invoke-direct {p0, p1, v3, v2, v4}, Lcom/roidapp/photogrid/release/PhotoView;->a(Landroid/graphics/Canvas;Landroid/graphics/PointF;ILandroid/graphics/Paint;)V

    .line 193
    :cond_2
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    if-nez v2, :cond_10

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v2, :cond_10

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->m:Z

    if-nez v2, :cond_10

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v2, :cond_10

    .line 194
    instance-of v2, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_3

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v2

    if-nez v2, :cond_b

    .line 195
    :cond_3
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 196
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02036d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    .line 197
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 199
    if-eqz v2, :cond_5

    .line 200
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 206
    :cond_5
    :goto_4
    :try_start_4
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 207
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020582

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    .line 208
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 210
    if-eqz v2, :cond_7

    .line 211
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 218
    :cond_7
    :goto_5
    :try_start_6
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    .line 219
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    .line 221
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoView;->a(FF)[F

    move-result-object v4

    .line 222
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v3, 0x8

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v8, 0x9

    aget v3, v3, v8

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoView;->a(FF)[F

    move-result-object v3

    .line 223
    instance-of v2, v1, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_e

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    move-object v2, v0

    iget v2, v2, Lcom/roidapp/photogrid/release/qz;->P:I

    if-ne v2, v11, :cond_e

    .line 224
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v3, 0x4

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v4, 0x5

    aget v3, v3, v4

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoView;->a(FF)[F

    move-result-object v3

    .line 225
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v4, 0xc

    aget v2, v2, v4

    iget-object v4, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v8, 0xd

    aget v4, v4, v8

    invoke-direct {p0, v2, v4}, Lcom/roidapp/photogrid/release/PhotoView;->a(FF)[F

    move-result-object v2

    move-object v4, v3

    move-object v3, v2

    .line 230
    :cond_8
    :goto_6
    instance-of v2, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_a

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    iget-boolean v2, v2, Lcom/roidapp/photogrid/release/ra;->ak:Z

    if-nez v2, :cond_a

    .line 231
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    .line 232
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v8

    if-eqz v8, :cond_f

    .line 233
    :cond_9
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->h()V

    .line 234
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    const/4 v8, 0x0

    invoke-virtual {p1, v2, v1, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 241
    :cond_a
    :goto_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->p:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    aget v2, v4, v2

    const/4 v8, 0x1

    aget v8, v4, v8

    const/4 v9, 0x0

    invoke-virtual {p1, v1, v2, v8, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 242
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->q:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    aget v2, v3, v2

    const/4 v8, 0x1

    aget v8, v3, v8

    const/4 v9, 0x0

    invoke-virtual {p1, v1, v2, v8, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 243
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->s:Landroid/graphics/RectF;

    const/4 v2, 0x0

    aget v2, v4, v2

    const/4 v8, 0x1

    aget v8, v4, v8

    const/4 v9, 0x0

    aget v9, v4, v9

    int-to-float v10, v6

    add-float/2addr v9, v10

    const/4 v10, 0x1

    aget v4, v4, v10

    int-to-float v10, v7

    add-float/2addr v4, v10

    invoke-virtual {v1, v2, v8, v9, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 244
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->t:Landroid/graphics/RectF;

    const/4 v2, 0x0

    aget v2, v3, v2

    const/4 v4, 0x1

    aget v4, v3, v4

    const/4 v8, 0x0

    aget v8, v3, v8

    int-to-float v6, v6

    add-float/2addr v6, v8

    const/4 v8, 0x1

    aget v3, v3, v8

    int-to-float v7, v7

    add-float/2addr v3, v7

    invoke-virtual {v1, v2, v4, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 149
    :cond_b
    :goto_8
    add-int/lit8 v1, v5, -0x1

    move v5, v1

    goto/16 :goto_0

    .line 160
    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 162
    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ra;->ak:Z

    .line 163
    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ra;->al:Z

    .line 164
    iput v5, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 165
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/ao;

    const/4 v4, 0x1

    iput-boolean v4, v3, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 168
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v3

    if-nez v3, :cond_0

    .line 169
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto/16 :goto_1

    .line 148
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 176
    :cond_c
    :try_start_7
    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/graphics/Canvas;)V

    goto/16 :goto_2

    :cond_d
    move v2, v3

    .line 187
    goto/16 :goto_3

    .line 203
    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_4

    .line 214
    :catch_2
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_5

    .line 226
    :cond_e
    instance-of v2, v1, Lcom/roidapp/photogrid/release/ps;

    if-eqz v2, :cond_8

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    move-object v2, v0

    iget v2, v2, Lcom/roidapp/photogrid/release/ps;->K:I

    if-ne v2, v11, :cond_8

    .line 227
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v3, 0x4

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v4, 0x5

    aget v3, v3, v4

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoView;->a(FF)[F

    move-result-object v3

    .line 228
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v4, 0xc

    aget v2, v2, v4

    iget-object v4, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/16 v8, 0xd

    aget v4, v4, v8

    invoke-direct {p0, v2, v4}, Lcom/roidapp/photogrid/release/PhotoView;->a(FF)[F

    move-result-object v2

    move-object v4, v3

    move-object v3, v2

    goto/16 :goto_6

    .line 236
    :cond_f
    iget-object v1, v1, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    const/4 v8, 0x0

    invoke-virtual {p1, v2, v1, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    goto/16 :goto_7

    .line 246
    :cond_10
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    if-nez v2, :cond_b

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v2, :cond_b

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->m:Z

    if-nez v2, :cond_b

    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v2, :cond_b

    .line 247
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_11

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 248
    :cond_11
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0203b5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    .line 249
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 251
    if-eqz v2, :cond_12

    .line 252
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 258
    :cond_12
    :goto_9
    :try_start_9
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 259
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    .line 260
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v3, 0x4

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v7, 0x5

    aget v3, v3, v7

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoView;->b(FF)[F

    move-result-object v3

    .line 262
    instance-of v2, v1, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_16

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    move-object v2, v0

    iget v2, v2, Lcom/roidapp/photogrid/release/qz;->P:I

    if-ne v2, v11, :cond_16

    .line 263
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v7, 0x1

    aget v3, v3, v7

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoView;->b(FF)[F

    move-result-object v2

    move-object v3, v2

    .line 267
    :cond_13
    :goto_a
    instance-of v2, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_15

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    iget-boolean v2, v2, Lcom/roidapp/photogrid/release/ra;->ak:Z

    if-nez v2, :cond_15

    .line 268
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    .line 269
    if-eqz v2, :cond_14

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v7

    if-eqz v7, :cond_17

    .line 270
    :cond_14
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->h()V

    .line 271
    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ra;->U:Landroid/graphics/Bitmap;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    const/4 v7, 0x0

    invoke-virtual {p1, v2, v1, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 278
    :cond_15
    :goto_b
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->r:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    aget v2, v3, v2

    const/4 v7, 0x1

    aget v7, v3, v7

    const/4 v8, 0x0

    invoke-virtual {p1, v1, v2, v7, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 279
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->u:Landroid/graphics/RectF;

    const/4 v2, 0x0

    aget v2, v3, v2

    const/4 v7, 0x1

    aget v7, v3, v7

    const/4 v8, 0x0

    aget v8, v3, v8

    int-to-float v4, v4

    add-float/2addr v4, v8

    const/4 v8, 0x1

    aget v3, v3, v8

    int-to-float v6, v6

    add-float/2addr v3, v6

    invoke-virtual {v1, v2, v7, v4, v3}, Landroid/graphics/RectF;->set(FFFF)V

    goto/16 :goto_8

    .line 255
    :catch_3
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_9

    .line 264
    :cond_16
    instance-of v2, v1, Lcom/roidapp/photogrid/release/ps;

    if-eqz v2, :cond_13

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    move-object v2, v0

    iget v2, v2, Lcom/roidapp/photogrid/release/ps;->K:I

    if-ne v2, v11, :cond_13

    .line 265
    iget-object v2, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    iget-object v3, v1, Lcom/roidapp/photogrid/release/ao;->o:[F

    const/4 v7, 0x1

    aget v3, v3, v7

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoView;->b(FF)[F

    move-result-object v2

    move-object v3, v2

    goto :goto_a

    .line 274
    :cond_17
    iget-object v1, v1, Lcom/roidapp/photogrid/release/ao;->b:Landroid/graphics/Matrix;

    const/4 v7, 0x0

    invoke-virtual {p1, v2, v1, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    goto :goto_b

    .line 283
    :cond_18
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_19
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/id;

    .line 284
    iget-boolean v3, v1, Lcom/roidapp/photogrid/release/id;->c:Z

    if-eqz v3, :cond_19

    .line 285
    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/Canvas;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_c

    .line 289
    :cond_1a
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    const/high16 v11, 0x40400000    # 3.0f

    const/4 v9, 0x0

    const/4 v7, -0x1

    const/4 v10, 0x1

    const/4 v4, 0x0

    .line 372
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    if-eqz v2, :cond_2

    .line 373
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    .line 889
    :goto_0
    monitor-exit p0

    return v2

    .line 382
    :cond_2
    :try_start_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    .line 386
    sparse-switch v2, :sswitch_data_0

    .line 888
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move v2, v10

    .line 889
    goto :goto_0

    .line 389
    :sswitch_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(Z)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 390
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v3

    .line 391
    if-eqz v3, :cond_5

    instance-of v2, v3, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_4

    move-object v0, v3

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v2

    if-nez v2, :cond_5

    .line 392
    :cond_4
    const/4 v2, 0x0

    iput-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 393
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    :cond_5
    move v2, v10

    .line 395
    goto :goto_0

    .line 397
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    .line 398
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    .line 399
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    if-eqz v2, :cond_7

    .line 400
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/id;->b()V

    .line 401
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    .line 403
    :cond_7
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->J:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/id;

    .line 404
    iget-boolean v8, v2, Lcom/roidapp/photogrid/release/id;->c:Z

    if-eqz v8, :cond_8

    .line 405
    iget-object v8, v2, Lcom/roidapp/photogrid/release/id;->b:Landroid/graphics/RectF;

    invoke-virtual {v8, v5, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 406
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    if-eqz v3, :cond_9

    .line 407
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    invoke-virtual {v3}, Ljava/util/Timer;->cancel()V

    .line 408
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->B:Ljava/util/Timer;

    .line 410
    :cond_9
    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    move v2, v10

    .line 411
    goto :goto_0

    .line 442
    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->x:J

    .line 443
    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-eq v2, v7, :cond_11

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    if-nez v2, :cond_11

    .line 444
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ao;

    .line 445
    if-eqz v2, :cond_11

    instance-of v3, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v3, :cond_b

    move-object v0, v2

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v3, v0

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v3

    if-nez v3, :cond_11

    :cond_b
    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v3, :cond_11

    .line 446
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->t:Landroid/graphics/RectF;

    invoke-virtual {v3, v5, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v3

    if-eqz v3, :cond_c

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v3, :cond_c

    .line 447
    new-instance v3, Landroid/graphics/Point;

    float-to-int v4, v5

    float-to-int v5, v6

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    iput-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->o:Landroid/graphics/Point;

    .line 448
    const/4 v3, 0x0

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    .line 449
    new-instance v3, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    int-to-float v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    int-to-float v5, v5

    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v4, Landroid/graphics/PointF;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->f()[F

    move-result-object v5

    const/4 v6, 0x0

    aget v5, v5, v6

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->f()[F

    move-result-object v2

    const/4 v6, 0x1

    aget v2, v2, v6

    invoke-direct {v4, v5, v2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/release/PhotoView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    move v2, v10

    .line 450
    goto/16 :goto_0

    .line 451
    :cond_c
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->s:Landroid/graphics/RectF;

    invoke-virtual {v3, v5, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v3

    if-eqz v3, :cond_f

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v3, :cond_f

    .line 452
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 456
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v3, :cond_e

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_e

    .line 458
    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 459
    instance-of v4, v2, Lcom/roidapp/photogrid/release/qz;

    if-eqz v4, :cond_d

    .line 460
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070177

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 464
    :goto_2
    const v4, 0x7f07032f

    new-instance v5, Lcom/roidapp/photogrid/release/pl;

    invoke-direct {v5, p0, v2}, Lcom/roidapp/photogrid/release/pl;-><init>(Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/ao;)V

    invoke-virtual {v3, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const v4, 0x7f0701ec

    new-instance v5, Lcom/roidapp/photogrid/release/pk;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/release/pk;-><init>(Lcom/roidapp/photogrid/release/PhotoView;)V

    invoke-virtual {v2, v4, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 511
    new-instance v2, Lcom/roidapp/photogrid/release/pm;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/pm;-><init>(Lcom/roidapp/photogrid/release/PhotoView;)V

    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 518
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 520
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    move v2, v10

    .line 522
    goto/16 :goto_0

    .line 462
    :cond_d
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070177

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 372
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    :cond_e
    move v2, v4

    .line 524
    goto/16 :goto_0

    .line 525
    :cond_f
    :try_start_2
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->u:Landroid/graphics/RectF;

    invoke-virtual {v3, v5, v6}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v3

    if-eqz v3, :cond_11

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v3, :cond_11

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v3, :cond_11

    .line 526
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v3, :cond_10

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v3

    if-nez v3, :cond_10

    .line 528
    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 529
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0702fb

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 530
    const v4, 0x7f07032f

    new-instance v5, Lcom/roidapp/photogrid/release/pn;

    invoke-direct {v5, p0, v2}, Lcom/roidapp/photogrid/release/pn;-><init>(Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/ao;)V

    invoke-virtual {v3, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 556
    const v2, 0x7f0701ec

    new-instance v4, Lcom/roidapp/photogrid/release/po;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/po;-><init>(Lcom/roidapp/photogrid/release/PhotoView;)V

    invoke-virtual {v3, v2, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 562
    new-instance v2, Lcom/roidapp/photogrid/release/pp;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/pp;-><init>(Lcom/roidapp/photogrid/release/PhotoView;)V

    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 569
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 570
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    move v2, v10

    .line 572
    goto/16 :goto_0

    :cond_10
    move v2, v4

    .line 574
    goto/16 :goto_0

    .line 578
    :cond_11
    iget v8, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 579
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 580
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    if-eqz v2, :cond_13

    .line 581
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ao;

    .line 582
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {v2, v3, v5}, Lcom/roidapp/photogrid/release/ao;->a(FF)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 583
    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 584
    const/4 v2, 0x0

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 585
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->H:J

    move v2, v10

    .line 586
    goto/16 :goto_0

    .line 589
    :cond_12
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 590
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->H:J

    move v2, v4

    .line 591
    goto/16 :goto_0

    .line 595
    :cond_13
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v4

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ao;

    .line 596
    iget-boolean v5, v2, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 597
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    invoke-virtual {v2, v6, v9}, Lcom/roidapp/photogrid/release/ao;->a(FF)Z

    move-result v6

    if-eqz v6, :cond_1f

    .line 598
    new-instance v3, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    float-to-int v9, v9

    invoke-direct {v3, v6, v9}, Landroid/graphics/Point;-><init>(II)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/ao;->e:Landroid/graphics/Point;

    .line 599
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoView;->c(Lcom/roidapp/photogrid/release/ao;)V

    .line 601
    const/4 v3, 0x2

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->j:I

    .line 602
    const/4 v3, 0x0

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    .line 603
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    .line 605
    instance-of v3, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v3, :cond_16

    .line 606
    if-nez v5, :cond_45

    .line 607
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    .line 608
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H()V

    move v2, v5

    .line 666
    :cond_14
    :goto_4
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-ne v3, v7, :cond_20

    .line 667
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->w:I

    .line 668
    if-eq v8, v7, :cond_15

    .line 669
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 670
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-nez v2, :cond_15

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentEditTip"

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_15

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v3, "FragmentDoodle"

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_15

    .line 671
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    :cond_15
    move v2, v4

    .line 674
    goto/16 :goto_0

    .line 610
    :cond_16
    instance-of v3, v2, Lcom/roidapp/photogrid/release/qz;

    if-eqz v3, :cond_17

    .line 611
    if-nez v5, :cond_45

    .line 612
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    .line 614
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I()V

    move v2, v5

    goto :goto_4

    .line 616
    :cond_17
    instance-of v3, v2, Lcom/roidapp/photogrid/release/ps;

    if-eqz v3, :cond_45

    .line 618
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v9, v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 619
    if-eqz v9, :cond_44

    move v6, v4

    .line 620
    :goto_5
    array-length v3, v9

    if-ge v6, v3, :cond_44

    .line 621
    aget-object v11, v9, v6

    move-object v0, v2

    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    move-object v3, v0

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    move v3, v6

    .line 627
    :goto_6
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v6, v6, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v2, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 628
    if-eqz v5, :cond_1b

    .line 629
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v6, "FragmentFreeEdit"

    invoke-virtual {v2, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/db;

    .line 630
    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/db;->c()Z

    move-result v2

    if-eqz v2, :cond_1a

    .line 632
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 4094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v2}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v2

    .line 632
    if-eqz v2, :cond_19

    .line 633
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-virtual {v2, v3, v6, v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    move v2, v5

    goto/16 :goto_4

    .line 620
    :cond_18
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 635
    :cond_19
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v6, 0x1

    const/4 v9, 0x0

    invoke-virtual {v2, v3, v6, v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    :cond_1a
    move v2, v5

    .line 638
    goto/16 :goto_4

    .line 640
    :cond_1b
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v6, "FragmentEditTip"

    invoke-virtual {v2, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/dj;

    .line 641
    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/dj;->b()Z

    move-result v2

    if-eqz v2, :cond_1d

    .line 642
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 5094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v2}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v2

    .line 642
    if-eqz v2, :cond_1c

    .line 643
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-virtual {v2, v3, v6, v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    .line 658
    :goto_7
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->w:I

    move v2, v5

    .line 660
    goto/16 :goto_4

    .line 645
    :cond_1c
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v6, 0x1

    const/4 v9, 0x0

    invoke-virtual {v2, v3, v6, v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto :goto_7

    .line 648
    :cond_1d
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v6, "FragmentFreeEdit"

    invoke-virtual {v2, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1e

    .line 649
    new-instance v2, Lcom/roidapp/photogrid/release/db;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/db;-><init>()V

    .line 650
    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v9, 0x7f0d028d

    const-string v11, "FragmentFreeEdit"

    invoke-virtual {v6, v9, v2, v11}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_7

    .line 653
    :cond_1e
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v6, "FragmentFreeEdit"

    invoke-virtual {v2, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/db;

    .line 654
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/db;->a()V

    .line 655
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/db;->b()V

    goto :goto_7

    .line 663
    :cond_1f
    const/4 v6, 0x0

    iput-boolean v6, v2, Lcom/roidapp/photogrid/release/ao;->f:Z

    move v2, v5

    .line 665
    goto/16 :goto_3

    .line 676
    :cond_20
    if-nez v2, :cond_21

    .line 677
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->H:J

    goto/16 :goto_1

    .line 679
    :cond_21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->H:J

    goto/16 :goto_1

    .line 683
    :sswitch_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    if-eqz v2, :cond_26

    .line 684
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->T:Z

    if-eqz v2, :cond_22

    move v2, v4

    .line 685
    goto/16 :goto_0

    .line 687
    :cond_22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 688
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 689
    cmpg-float v5, v2, v9

    if-lez v5, :cond_23

    iget v5, p0, Lcom/roidapp/photogrid/release/PhotoView;->K:I

    int-to-float v5, v5

    cmpl-float v5, v2, v5

    if-gez v5, :cond_23

    cmpg-float v5, v3, v9

    if-lez v5, :cond_23

    iget v5, p0, Lcom/roidapp/photogrid/release/PhotoView;->L:I

    int-to-float v5, v5

    cmpl-float v5, v3, v5

    if-ltz v5, :cond_24

    :cond_23
    move v2, v4

    .line 690
    goto/16 :goto_0

    .line 693
    :cond_24
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    iget v5, v5, Lcom/roidapp/photogrid/release/id;->g:I

    packed-switch v5, :pswitch_data_0

    .line 707
    :goto_8
    if-nez v4, :cond_25

    .line 708
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->R:Lcom/roidapp/photogrid/release/if;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->S:Landroid/widget/RelativeLayout;

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v3, v4}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/if;Landroid/widget/RelativeLayout;Z)V

    :cond_25
    move v2, v10

    .line 710
    goto/16 :goto_0

    .line 698
    :pswitch_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    iget v4, v4, Lcom/roidapp/photogrid/release/id;->d:F

    invoke-virtual {v2, v4, v3}, Lcom/roidapp/photogrid/release/id;->b(FF)Z

    move-result v4

    goto :goto_8

    .line 704
    :pswitch_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    iget v4, v4, Lcom/roidapp/photogrid/release/id;->e:F

    invoke-virtual {v3, v2, v4}, Lcom/roidapp/photogrid/release/id;->b(FF)Z

    move-result v4

    goto :goto_8

    .line 713
    :cond_26
    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-eq v2, v7, :cond_36

    .line 714
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ao;

    .line 715
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    if-nez v3, :cond_3

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    if-nez v3, :cond_3

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v3, :cond_3

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v3, :cond_3

    .line 716
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->m:Z

    .line 721
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v3

    packed-switch v3, :pswitch_data_1

    goto/16 :goto_1

    .line 5916
    :pswitch_2
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->o:Landroid/graphics/Point;

    if-eqz v3, :cond_2d

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->F:Z

    if-nez v3, :cond_2d

    .line 5917
    new-instance v3, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    float-to-int v5, v5

    int-to-float v5, v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    float-to-int v6, v6

    int-to-float v6, v6

    invoke-direct {v3, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v5, Landroid/graphics/PointF;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->f()[F

    move-result-object v6

    const/4 v7, 0x0

    aget v6, v6, v7

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->f()[F

    move-result-object v7

    const/4 v8, 0x1

    aget v7, v7, v8

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v3, v5}, Lcom/roidapp/photogrid/release/PhotoView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v3

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    .line 5920
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    iget v5, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    sub-float/2addr v3, v5

    .line 5954
    iget v5, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    add-float/2addr v5, v3

    iput v5, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    .line 5955
    iget v5, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    const/high16 v6, 0x42b40000    # 90.0f

    rem-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 5956
    cmpg-float v6, v5, v11

    if-ltz v6, :cond_27

    const/high16 v6, 0x42b40000    # 90.0f

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v5, v5, v11

    if-gez v5, :cond_28

    :cond_27
    move v4, v10

    .line 5958
    :cond_28
    if-eqz v4, :cond_2b

    .line 5959
    const/4 v4, 0x1

    iput-boolean v4, v2, Lcom/roidapp/photogrid/release/ao;->A:Z

    .line 5960
    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    .line 5961
    invoke-static {v2}, Lcom/roidapp/photogrid/release/PhotoView;->e(Lcom/roidapp/photogrid/release/ao;)V

    .line 5969
    :goto_9
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    .line 5970
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->f()[F

    move-result-object v5

    const/4 v6, 0x0

    aget v5, v5, v6

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->f()[F

    move-result-object v6

    const/4 v7, 0x1

    aget v6, v6, v7

    invoke-static {v3, v4, v5, v6}, Lcom/roidapp/photogrid/release/PhotoView;->a(FFFF)F

    move-result v3

    .line 5973
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    cmpl-float v4, v4, v9

    if-eqz v4, :cond_29

    .line 5974
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    div-float v4, v3, v4

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_2c

    .line 5975
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    div-float v4, v3, v4

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ao;->a(F)Z

    .line 5982
    :cond_29
    :goto_a
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    .line 6010
    :cond_2a
    :goto_b
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_1

    .line 5963
    :cond_2b
    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->A:Z

    .line 5964
    iget v3, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    iget v4, v2, Lcom/roidapp/photogrid/release/ao;->l:F

    sub-float/2addr v3, v4

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    goto :goto_9

    .line 5977
    :cond_2c
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->c()I

    move-result v4

    const/16 v5, 0xa

    if-lt v4, v5, :cond_29

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->d()I

    move-result v4

    const/16 v5, 0xa

    if-lt v4, v5, :cond_29

    .line 5978
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    div-float v4, v3, v4

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ao;->a(F)Z

    goto :goto_a

    .line 5985
    :cond_2d
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->j:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2a

    .line 5986
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->F:Z

    if-nez v3, :cond_3

    .line 5989
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    .line 5990
    iget-object v3, v2, Lcom/roidapp/photogrid/release/ao;->e:Landroid/graphics/Point;

    if-eqz v3, :cond_2a

    .line 6000
    instance-of v3, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v3, :cond_2e

    move-object v0, v2

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v3, v0

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v3

    if-nez v3, :cond_2a

    .line 6001
    :cond_2e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    iget-object v4, v2, Lcom/roidapp/photogrid/release/ao;->e:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    iget-object v5, v2, Lcom/roidapp/photogrid/release/ao;->e:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/photogrid/release/ao;->b(FF)V

    .line 6003
    new-instance v3, Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    iput-object v3, v2, Lcom/roidapp/photogrid/release/ao;->e:Landroid/graphics/Point;

    goto :goto_b

    .line 734
    :pswitch_3
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    if-eqz v3, :cond_2f

    .line 735
    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v8

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    .line 736
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 737
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 738
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    goto/16 :goto_1

    .line 741
    :cond_2f
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->F:Z

    .line 742
    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->E:Z

    if-eqz v3, :cond_30

    .line 743
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->E:Z

    .line 744
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bp;->b(Landroid/view/MotionEvent;)F

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    .line 745
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bp;->c(Landroid/view/MotionEvent;)F

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    goto/16 :goto_1

    .line 747
    :cond_30
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bp;->c(Landroid/view/MotionEvent;)F

    move-result v3

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    .line 748
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    iget v5, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    sub-float/2addr v3, v5

    .line 750
    iget v5, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    add-float/2addr v5, v3

    iput v5, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    .line 751
    iget v5, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    const/high16 v6, 0x42b40000    # 90.0f

    rem-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 752
    cmpg-float v6, v5, v11

    if-ltz v6, :cond_31

    const/high16 v6, 0x42b40000    # 90.0f

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v5, v5, v11

    if-gez v5, :cond_32

    :cond_31
    move v4, v10

    .line 754
    :cond_32
    if-eqz v4, :cond_34

    .line 755
    const/4 v4, 0x1

    iput-boolean v4, v2, Lcom/roidapp/photogrid/release/ao;->A:Z

    .line 756
    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    .line 757
    invoke-static {v2}, Lcom/roidapp/photogrid/release/PhotoView;->e(Lcom/roidapp/photogrid/release/ao;)V

    .line 764
    :goto_c
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->k:F

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    .line 765
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bp;->b(Landroid/view/MotionEvent;)F

    move-result v3

    .line 766
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    cmpl-float v4, v4, v9

    if-eqz v4, :cond_33

    .line 767
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    div-float v4, v3, v4

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_35

    .line 768
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    div-float v4, v3, v4

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ao;->a(F)Z

    .line 775
    :cond_33
    :goto_d
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    .line 776
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto/16 :goto_1

    .line 759
    :cond_34
    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->A:Z

    .line 760
    iget v3, v2, Lcom/roidapp/photogrid/release/ao;->m:F

    iget v4, v2, Lcom/roidapp/photogrid/release/ao;->l:F

    sub-float/2addr v3, v4

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ao;->b(F)V

    goto :goto_c

    .line 770
    :cond_35
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->c()I

    move-result v4

    const/16 v5, 0xa

    if-lt v4, v5, :cond_33

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ao;->d()I

    move-result v4

    const/16 v5, 0xa

    if-lt v4, v5, :cond_33

    .line 771
    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->h:F

    div-float v4, v3, v4

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ao;->a(F)Z

    goto :goto_d

    :cond_36
    move v2, v4

    .line 783
    goto/16 :goto_0

    .line 790
    :sswitch_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 791
    const/4 v3, 0x0

    .line 792
    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    if-eq v2, v7, :cond_37

    .line 793
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->d:Ljava/util/List;

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ao;

    move-object v3, v2

    .line 795
    :cond_37
    iget-wide v6, p0, Lcom/roidapp/photogrid/release/PhotoView;->H:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x12c

    cmp-long v2, v4, v6

    if-gtz v2, :cond_41

    .line 796
    if-eqz v3, :cond_39

    .line 797
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v3, v2, v4}, Lcom/roidapp/photogrid/release/ao;->a(FF)Z

    move-result v2

    if-eqz v2, :cond_38

    .line 798
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->C:Z

    if-eqz v2, :cond_3d

    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v2, :cond_3d

    instance-of v2, v3, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_3d

    .line 799
    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-object v0, v3

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    invoke-virtual {v4, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/photogrid/release/ra;)V

    .line 800
    move-object v0, v3

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->C()V

    .line 821
    :cond_38
    :goto_e
    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->C:Z

    if-eqz v2, :cond_39

    .line 822
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ao;->b()V

    .line 848
    :cond_39
    :goto_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoView;->x:J

    .line 850
    if-eqz v3, :cond_3b

    .line 851
    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->A:Z

    if-eqz v2, :cond_3a

    .line 852
    invoke-static {v3}, Lcom/roidapp/photogrid/release/PhotoView;->e(Lcom/roidapp/photogrid/release/ao;)V

    .line 853
    const/4 v2, 0x0

    iput-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->A:Z

    .line 855
    :cond_3a
    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->C:Z

    if-eqz v2, :cond_3b

    .line 856
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ao;->b()V

    .line 859
    :cond_3b
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->m:Z

    .line 860
    const/4 v2, 0x0

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->l:F

    .line 861
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->o:Landroid/graphics/Point;

    .line 862
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->E:Z

    .line 863
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    .line 864
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->F:Z

    if-eqz v2, :cond_3c

    .line 865
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->F:Z

    .line 870
    :cond_3c
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 872
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->Q:Lcom/roidapp/photogrid/release/id;

    if-eqz v2, :cond_3

    .line 873
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    goto/16 :goto_1

    .line 802
    :cond_3d
    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->f:Z

    if-eqz v2, :cond_3f

    instance-of v2, v3, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_3e

    move-object v0, v3

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    move-object v2, v0

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v2

    if-nez v2, :cond_3f

    .line 803
    :cond_3e
    const/4 v2, 0x0

    iput-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 804
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 805
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    goto :goto_e

    .line 806
    :cond_3f
    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v2, :cond_38

    .line 807
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 808
    instance-of v2, v3, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_40

    .line 809
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I()V

    goto :goto_e

    .line 810
    :cond_40
    instance-of v2, v3, Lcom/roidapp/photogrid/release/ps;

    if-eqz v2, :cond_38

    .line 811
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentFreeEdit"

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_38

    .line 812
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentFreeEdit"

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/db;

    .line 813
    if-eqz v2, :cond_38

    .line 814
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/db;->a()V

    .line 815
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/db;->b()V

    goto/16 :goto_e

    .line 825
    :cond_41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/roidapp/photogrid/release/PhotoView;->x:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x12c

    cmp-long v2, v4, v6

    if-gtz v2, :cond_39

    .line 826
    if-eqz v3, :cond_39

    .line 827
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v3, v2, v4}, Lcom/roidapp/photogrid/release/ao;->a(FF)Z

    move-result v2

    if-eqz v2, :cond_42

    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v2, :cond_42

    .line 828
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 829
    instance-of v2, v3, Lcom/roidapp/photogrid/release/qz;

    if-eqz v2, :cond_43

    .line 830
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I()V

    .line 841
    :cond_42
    :goto_10
    iget-boolean v2, v3, Lcom/roidapp/photogrid/release/ao;->C:Z

    if-eqz v2, :cond_39

    .line 842
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ao;->b()V

    goto/16 :goto_f

    .line 831
    :cond_43
    instance-of v2, v3, Lcom/roidapp/photogrid/release/ps;

    if-eqz v2, :cond_42

    .line 832
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentFreeEdit"

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_42

    .line 833
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v4, "FragmentFreeEdit"

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/db;

    .line 834
    if-eqz v2, :cond_42

    .line 835
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/db;->a()V

    .line 836
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/db;->b()V

    goto :goto_10

    .line 879
    :sswitch_3
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->E:Z

    .line 880
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z

    goto/16 :goto_1

    .line 883
    :sswitch_4
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->E:Z

    .line 884
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoView;->G:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_1

    :cond_44
    move v3, v7

    goto/16 :goto_6

    :cond_45
    move v2, v5

    goto/16 :goto_4

    .line 386
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_2
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x6 -> :sswitch_4
        0x105 -> :sswitch_3
    .end sparse-switch

    .line 693
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 721
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
