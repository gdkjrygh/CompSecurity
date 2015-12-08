.class public Lcom/roidapp/imagelib/freecrop/Magnifier;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:F

.field private f:Landroid/graphics/RectF;

.field private g:Landroid/graphics/RectF;

.field private h:Landroid/graphics/Path;

.field private i:Landroid/graphics/Bitmap;

.field private j:Landroid/graphics/Rect;

.field private k:I

.field private l:I

.field private m:Landroid/graphics/Rect;

.field private n:Lcom/roidapp/imagelib/freecrop/l;

.field private o:Landroid/graphics/Paint;

.field private p:Landroid/graphics/Paint;

.field private q:Landroid/graphics/Paint;

.field private r:Lcom/roidapp/imagelib/freecrop/c;

.field private s:Landroid/graphics/Path;

.field private t:Landroid/graphics/Matrix;

.field private u:Z

.field private v:I

.field private w:I

.field private x:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    .line 57
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 60
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/graphics/Paint;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 62
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 73
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->a:I

    .line 74
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->b:I

    .line 75
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->b()V

    .line 76
    return-void

    .line 68
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/UnsupportedOperationException;->printStackTrace()V

    goto :goto_0

    .line 69
    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_0

    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .prologue
    .line 79
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 81
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 83
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/graphics/Paint;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 85
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 96
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->a:I

    .line 97
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->b:I

    .line 98
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->b()V

    .line 100
    return-void

    .line 91
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/UnsupportedOperationException;->printStackTrace()V

    goto :goto_0

    .line 92
    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_0

    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method private b()V
    .locals 8

    .prologue
    const/16 v7, 0x32

    const/4 v6, 0x1

    const/high16 v5, 0x40a00000    # 5.0f

    const/16 v4, 0xff

    const/4 v3, 0x0

    .line 103
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->a:I

    int-to-float v0, v0

    const v1, 0x3e19999a    # 0.15f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    .line 104
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->f:Landroid/graphics/RectF;

    .line 105
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v1, v5

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    add-float/2addr v2, v5

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->g:Landroid/graphics/RectF;

    .line 106
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->h:Landroid/graphics/Path;

    .line 107
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->h:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->f:Landroid/graphics/RectF;

    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 108
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    .line 110
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    .line 111
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/d;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 112
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 114
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 115
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 117
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->p:Landroid/graphics/Paint;

    .line 118
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->p:Landroid/graphics/Paint;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1, v7, v7, v7}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 119
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 121
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->q:Landroid/graphics/Paint;

    .line 122
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 123
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 124
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->q:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 125
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->q:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 127
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->s:Landroid/graphics/Path;

    .line 128
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->t:Landroid/graphics/Matrix;

    .line 130
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->d:I

    .line 131
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->v:I

    .line 132
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->w:I

    .line 133
    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->setBackgroundColor(I)V

    .line 134
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 137
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x5

    return v0
.end method

.method public final a(Landroid/graphics/PointF;)V
    .locals 3

    .prologue
    .line 173
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 174
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 175
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 176
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 177
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/freecrop/c;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->r:Lcom/roidapp/imagelib/freecrop/c;

    .line 166
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/freecrop/l;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    .line 141
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->n:Lcom/roidapp/imagelib/freecrop/l;

    .line 142
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->n:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->t:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->n:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v1

    div-float v1, v3, v1

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->n:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v2

    div-float v2, v3, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 1150
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->n:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/l;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->i:Landroid/graphics/Bitmap;

    .line 1151
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->k:I

    .line 1152
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->l:I

    .line 1153
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->k:I

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->l:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->x:I

    .line 1154
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->x:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->c:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 1155
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->d:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->x:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    .line 1159
    :goto_0
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->k:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 1160
    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->l:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 1161
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v4, v4, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->m:Landroid/graphics/Rect;

    .line 147
    :cond_0
    return-void

    .line 1157
    :cond_1
    iput v3, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 169
    iput-boolean p1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->u:Z

    .line 170
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/high16 v5, 0x40800000    # 4.0f

    const/high16 v4, 0x40000000    # 2.0f

    .line 181
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 183
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->i:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 185
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->v:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->w:I

    int-to-float v3, v3

    div-float/2addr v3, v4

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->i:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    neg-int v2, v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 187
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->r:Lcom/roidapp/imagelib/freecrop/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->r:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->i()I

    move-result v0

    if-eqz v0, :cond_2

    .line 190
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 191
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->v:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->w:I

    int-to-float v3, v3

    div-float/2addr v3, v4

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 192
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->j:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 193
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->r:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->e()[F

    move-result-object v0

    .line 194
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->r:Lcom/roidapp/imagelib/freecrop/c;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->t:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->s:Landroid/graphics/Path;

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/imagelib/freecrop/c;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 195
    iget-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->u:Z

    if-eqz v1, :cond_1

    .line 196
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 198
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->s:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 199
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->p:Landroid/graphics/Paint;

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    div-float v2, v5, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 200
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->p:Landroid/graphics/Paint;

    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 201
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->m:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 202
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 205
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    const/high16 v2, -0x10000

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 206
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    div-float v2, v5, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 207
    const/4 v1, 0x0

    aget v1, v0, v1

    aget v0, v0, v6

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->e:F

    div-float v2, v5, v2

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 209
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/Magnifier;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/d;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 210
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 211
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->s:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 212
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 215
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->g:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/Magnifier;->q:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 217
    return-void
.end method
