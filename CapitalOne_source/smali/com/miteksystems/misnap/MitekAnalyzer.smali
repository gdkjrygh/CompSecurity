.class Lcom/miteksystems/misnap/MitekAnalyzer;
.super Ljava/lang/Object;


# instance fields
.field private A:F

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:Ljava/util/List;

.field private H:[B

.field private I:Landroid/graphics/Rect;

.field private J:Landroid/os/Handler;

.field private K:Z

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:F

.field a:Ljava/lang/String;

.field b:I

.field c:F

.field d:F

.field e:F

.field f:Ljava/util/List;

.field g:Ljava/util/List;

.field h:Ljava/util/List;

.field i:Z

.field j:[I

.field k:[I

.field l:Landroid/graphics/Rect;

.field m:Landroid/graphics/Rect;

.field n:Landroid/graphics/Rect;

.field o:Ljava/util/List;

.field p:Ljava/util/List;

.field q:[I

.field private r:Z

.field private s:Ljava/util/ArrayList;

.field private t:Ljava/util/List;

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "mitek"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(IIIIILjava/lang/String;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->r:Z

    iput v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->B:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->K:Z

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->Q:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->a:Ljava/lang/String;

    iput v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->b:I

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->c:F

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->d:F

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->e:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->h:Ljava/util/List;

    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->j:[I

    const/16 v0, 0x8

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->k:[I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->m:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->n:Landroid/graphics/Rect;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->p:Ljava/util/List;

    const/16 v0, 0x100

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->q:[I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->s:Ljava/util/ArrayList;

    iput p1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->L:I

    iput p5, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->M:I

    iput p2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->N:I

    iput p3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->O:I

    iput p4, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->P:I

    iput-object p6, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->a:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->J:Landroid/os/Handler;

    return-void
.end method

.method private static a(Ljava/util/List;)F
    .locals 7

    const/4 v2, 0x0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v1, v2

    :goto_1
    const/4 v0, 0x4

    if-lt v1, v0, :cond_1

    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v1, 0x1

    rem-int/lit8 v4, v0, 0x4

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v5, v0, Landroid/graphics/Point;->x:I

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    sub-int v0, v5, v0

    int-to-float v5, v0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v6, v0, Landroid/graphics/Point;->y:I

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    sub-int v0, v6, v0

    int-to-float v0, v0

    mul-float v4, v5, v5

    mul-float/2addr v0, v0

    add-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method private native argbBitmapToYUVN21(Landroid/graphics/Bitmap;II[B)V
.end method

.method private b([BII)Ljava/util/List;
    .locals 5

    const/4 v4, 0x4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->k:[I

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->j:[I

    invoke-direct {p0, p1, v1, v2, p2}, Lcom/miteksystems/misnap/MitekAnalyzer;->findCandidatePoints([B[I[II)V

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    move v1, v0

    :goto_0
    const/4 v2, 0x5

    if-lt v1, v2, :cond_1

    :cond_0
    move v1, v0

    :goto_1
    if-lt v1, v4, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iput p2, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iput p3, v0, Landroid/graphics/Point;->y:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    return-object v0

    :cond_1
    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3, v0, v0}, Landroid/graphics/Point;-><init>(II)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->j:[I

    mul-int/lit8 v3, v1, 0x2

    aget v2, v2, v3

    iput v2, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->o:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->j:[I

    mul-int/lit8 v3, v1, 0x2

    add-int/lit8 v3, v3, 0x1

    aget v2, v2, v3

    iput v2, v0, Landroid/graphics/Point;->y:I

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method private b(Ljava/util/List;)Z
    .locals 14

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v0, 0x4

    if-lt v1, v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_0

    const/4 v0, 0x4

    new-array v3, v0, [F

    fill-array-data v3, :array_0

    const/4 v0, 0x4

    new-array v4, v0, [F

    fill-array-data v4, :array_1

    const/4 v0, 0x4

    new-array v5, v0, [F

    fill-array-data v5, :array_2

    const/4 v0, 0x4

    new-array v6, v0, [F

    fill-array-data v6, :array_3

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v1, v0

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v1, v0

    const/4 v0, 0x3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x2

    int-to-float v7, v0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->y:I

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v1, v0

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v1, v0

    const/4 v0, 0x3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x2

    int-to-float v8, v0

    const/4 v1, 0x0

    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_2
    const/4 v0, 0x4

    if-lt v1, v0, :cond_4

    const/high16 v0, 0x3e800000    # 0.25f

    mul-float/2addr v2, v0

    const/4 v0, 0x0

    move v1, v0

    :goto_3
    const/4 v0, 0x4

    if-lt v1, v0, :cond_5

    const/4 v0, 0x1

    :goto_4
    if-nez v0, :cond_8

    :cond_0
    const/4 v0, 0x0

    :goto_5
    return v0

    :cond_1
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v2, v0, Landroid/graphics/Point;->x:I

    const/4 v3, 0x1

    if-le v2, v3, :cond_2

    iget v2, v0, Landroid/graphics/Point;->x:I

    iget v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_2

    iget v2, v0, Landroid/graphics/Point;->y:I

    const/4 v3, 0x1

    if-le v2, v3, :cond_2

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    add-int/lit8 v2, v2, -0x1

    if-lt v0, v2, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto/16 :goto_1

    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_0

    :cond_4
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    sub-float v0, v7, v0

    aput v0, v5, v1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    sub-float v0, v8, v0

    aput v0, v6, v1

    aget v0, v5, v1

    aget v9, v5, v1

    mul-float/2addr v0, v9

    aget v9, v6, v1

    aget v10, v6, v1

    mul-float/2addr v9, v10

    add-float/2addr v0, v9

    aput v0, v3, v1

    aget v0, v3, v1

    float-to-double v10, v0

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    double-to-float v0, v10

    aput v0, v4, v1

    aget v0, v4, v1

    add-float/2addr v2, v0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_5
    aget v0, v4, v1

    float-to-double v6, v0

    float-to-double v8, v2

    const-wide v10, 0x3fb999999999999aL    # 0.1

    float-to-double v12, v2

    mul-double/2addr v10, v12

    sub-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    cmpg-double v0, v6, v10

    if-gez v0, :cond_6

    const/4 v0, 0x1

    :goto_6
    if-nez v0, :cond_7

    const/4 v0, 0x0

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    goto :goto_6

    :cond_7
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_3

    :cond_8
    const/4 v0, 0x1

    goto/16 :goto_5

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private c(Ljava/util/List;)Landroid/graphics/Rect;
    .locals 4

    const v2, 0x7fffffff

    const/high16 v1, -0x80000000

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iput v2, v0, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iput v2, v0, Landroid/graphics/Rect;->left:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iput v1, v0, Landroid/graphics/Rect;->right:I

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v0, 0x4

    if-lt v1, v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    return-object v0

    :cond_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v2, v0, Landroid/graphics/Point;->x:I

    iget-object v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    if-le v2, v3, :cond_1

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Point;->x:I

    add-int/lit8 v3, v3, 0x0

    iput v3, v2, Landroid/graphics/Rect;->right:I

    :cond_1
    iget v2, v0, Landroid/graphics/Point;->x:I

    iget-object v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    if-ge v2, v3, :cond_2

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Point;->x:I

    add-int/lit8 v3, v3, 0x0

    iput v3, v2, Landroid/graphics/Rect;->left:I

    :cond_2
    iget v2, v0, Landroid/graphics/Point;->y:I

    iget-object v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Point;->y:I

    add-int/lit8 v3, v3, 0x0

    iput v3, v2, Landroid/graphics/Rect;->bottom:I

    :cond_3
    iget v2, v0, Landroid/graphics/Point;->y:I

    iget-object v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    if-ge v2, v3, :cond_4

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->l:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/lit8 v0, v0, 0x0

    iput v0, v2, Landroid/graphics/Rect;->top:I

    :cond_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private static d(Ljava/util/List;)D
    .locals 8

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v0, 0x4

    if-lt v1, v0, :cond_0

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    return-wide v0

    :cond_0
    add-int/lit8 v0, v1, 0x1

    rem-int/lit8 v4, v0, 0x4

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v5, v0, Landroid/graphics/Point;->x:I

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v5

    int-to-double v6, v0

    add-double/2addr v2, v6

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v5, v0, Landroid/graphics/Point;->y:I

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v5

    int-to-double v4, v0

    sub-double/2addr v2, v4

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private static e(Ljava/util/List;)D
    .locals 9

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v4, v0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v2, v0

    const/4 v0, 0x1

    move v6, v0

    :goto_0
    const/4 v0, 0x4

    if-lt v6, v0, :cond_0

    sub-double v0, v2, v4

    return-wide v0

    :cond_0
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v0, v0

    cmpg-double v0, v0, v4

    if-gez v0, :cond_1

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v0, v0

    move-wide v7, v2

    move-wide v2, v0

    move-wide v0, v7

    :goto_1
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    move-wide v4, v2

    move-wide v2, v0

    goto :goto_0

    :cond_1
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v0, v0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-double v0, v0

    move-wide v2, v4

    goto :goto_1

    :cond_2
    move-wide v0, v2

    move-wide v2, v4

    goto :goto_1
.end method

.method private static f(Ljava/util/List;)D
    .locals 9

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v4, v0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v2, v0

    const/4 v0, 0x1

    move v6, v0

    :goto_0
    const/4 v0, 0x4

    if-lt v6, v0, :cond_0

    sub-double v0, v2, v4

    return-wide v0

    :cond_0
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v0, v0

    cmpg-double v0, v0, v4

    if-gez v0, :cond_1

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v0, v0

    move-wide v7, v2

    move-wide v2, v0

    move-wide v0, v7

    :goto_1
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    move-wide v4, v2

    move-wide v2, v0

    goto :goto_0

    :cond_1
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v0, v0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-double v0, v0

    move-wide v2, v4

    goto :goto_1

    :cond_2
    move-wide v0, v2

    move-wide v2, v4

    goto :goto_1
.end method

.method private native findCandidatePoints([B[I[II)V
.end method

.method private native getOOFscoreGray([B[I)I
.end method

.method private native invertY([BIII)V
.end method

.method private native preFilter([B[IIIII)V
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/miteksystems/misnap/a;

    invoke-interface {v0, p0}, Lcom/miteksystems/misnap/a;->a(Lcom/miteksystems/misnap/MitekAnalyzer;)I

    goto :goto_0
.end method

.method private native statistics([B[IIIIIII)V
.end method


# virtual methods
.method final a([BIIIIILjava/lang/String;)I
    .locals 3

    const/4 v2, 0x0

    const-string v0, "ACH"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "CheckFront"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    const/4 v0, 0x7

    new-array v0, v0, [I

    aput p5, v0, v2

    const/4 v1, 0x1

    aput p6, v0, v1

    const/4 v1, 0x2

    aput v2, v0, v1

    const/4 v1, 0x3

    aput v2, v0, v1

    const/4 v1, 0x4

    aput p3, v0, v1

    const/4 v1, 0x5

    aput p4, v0, v1

    const/4 v1, 0x6

    aput p2, v0, v1

    invoke-direct {p0, p1, v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->getOOFscoreGray([B[I)I

    move-result v0

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->x:I

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->x:I

    return v0

    :cond_1
    const-string v0, "CheckBack"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Auto"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Balance"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Bill"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Business"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "License"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "VIN"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "W2"

    invoke-virtual {p7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    goto :goto_0
.end method

.method final a(Lcom/miteksystems/misnap/a;)V
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final a([BII)V
    .locals 12

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->K:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->r:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->i:Z

    if-nez v0, :cond_0

    iput p2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    iput p3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    iput-object p1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->K:Z

    const/4 v0, 0x7

    new-array v9, v0, [J

    const/4 v0, 0x0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    aput-wide v2, v9, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MitekAnalyzer;->q()V

    invoke-virtual {p0}, Lcom/miteksystems/misnap/MitekAnalyzer;->p()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/miteksystems/misnap/MitekAnalyzer;->q()V

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    iget v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    iget v4, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->k:[I

    const/4 v5, 0x1

    move-object v0, p0

    move v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/miteksystems/misnap/MitekAnalyzer;->preFilter([B[IIIII)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->k:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->E:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->k:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->F:I

    const/4 v0, 0x1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    aput-wide v2, v9, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    invoke-direct {p0, v0, v1, v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->b([BII)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    const/4 v0, 0x2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    aput-wide v2, v9, v0

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v2, v0, Landroid/graphics/Point;->x:I

    const/4 v0, 0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v2, v0

    const/4 v0, 0x2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v2, v0

    const/4 v0, 0x3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/2addr v0, v2

    shr-int/lit8 v2, v0, 0x2

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v3, v0, Landroid/graphics/Point;->y:I

    const/4 v0, 0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v3, v0

    const/4 v0, 0x2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v3, v0

    const/4 v0, 0x3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    add-int/2addr v0, v3

    shr-int/lit8 v0, v0, 0x2

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    const v0, 0x3f333333    # 0.7f

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-static {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->a(Ljava/util/List;)F

    move-result v2

    mul-float/2addr v0, v2

    const/4 v2, 0x0

    cmpl-float v2, v0, v2

    if-nez v2, :cond_2

    const/high16 v0, 0x42200000    # 40.0f

    new-instance v1, Landroid/graphics/Point;

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    div-int/lit8 v2, v2, 0x2

    iget v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    div-int/lit8 v3, v3, 0x2

    invoke-direct {v1, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    :cond_2
    new-instance v8, Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v0, v3

    sub-float/2addr v2, v3

    float-to-int v2, v2

    iget v3, v1, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v0, v4

    sub-float/2addr v3, v4

    float-to-int v3, v3

    iget v4, v1, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v0, v5

    add-float/2addr v4, v5

    float-to-int v4, v4

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v0, v5

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-direct {v8, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    iget v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    iget v4, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    const/4 v0, 0x4

    new-array v2, v0, [I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget v5, v8, Landroid/graphics/Rect;->left:I

    iget v6, v8, Landroid/graphics/Rect;->top:I

    iget v7, v8, Landroid/graphics/Rect;->right:I

    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/miteksystems/misnap/MitekAnalyzer;->statistics([B[IIIIIII)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->p:Ljava/util/List;

    const/4 v1, 0x0

    aget v1, v2, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->p:Ljava/util/List;

    const/4 v1, 0x1

    aget v1, v2, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->p:Ljava/util/List;

    const/4 v1, 0x2

    aget v1, v2, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->p:Ljava/util/List;

    const/4 v1, 0x3

    aget v1, v2, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->p:Ljava/util/List;

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->G:Ljava/util/List;

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->G:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_7

    :cond_3
    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    const/4 v2, 0x0

    const v3, 0x3f666666    # 0.9f

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v3, v0

    const v4, 0x3dccccd0    # 0.100000024f

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->G:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    const/4 v2, 0x1

    const v3, 0x3f666666    # 0.9f

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    const/4 v4, 0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v3, v0

    const v4, 0x3dccccd0    # 0.100000024f

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->G:Ljava/util/List;

    const/4 v5, 0x1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    div-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->w:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->E:I

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->F:I

    iget v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->E:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->invertY([BIII)V

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    invoke-direct {p0, v0, v1, v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->b([BII)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    const/4 v0, 0x3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    aput-wide v2, v9, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v1, 0x0

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->b:I

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_4
    const/4 v1, 0x0

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->z:I

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->y:I

    iput v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->v:I

    :cond_5
    if-eqz v0, :cond_6

    const/4 v0, 0x4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    aput-wide v2, v9, v0

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->c(Ljava/util/List;)Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-static {v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->d(Ljava/util/List;)D

    move-result-wide v0

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-static {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->e(Ljava/util/List;)D

    move-result-wide v2

    iget-object v4, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    invoke-static {v4}, Lcom/miteksystems/misnap/MitekAnalyzer;->f(Ljava/util/List;)D

    move-result-wide v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    mul-double/2addr v6, v0

    iget v8, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    iget v10, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    mul-int/2addr v8, v10

    int-to-double v10, v8

    div-double/2addr v6, v10

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    double-to-int v6, v6

    iput v6, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->v:I

    const-wide v6, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    div-int/2addr v2, v3

    iput v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->y:I

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v3, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->D:I

    div-int/2addr v2, v3

    iput v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->z:I

    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v4

    iget v4, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int v2, v4, v2

    mul-int/2addr v2, v3

    int-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    sub-double v0, v2, v0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    mul-double/2addr v0, v4

    double-to-int v0, v0

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->u:I

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->C:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v5, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    sub-int v5, v0, v5

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v6, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    sub-int v6, v0, v6

    iget-object v7, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->a:Ljava/lang/String;

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lcom/miteksystems/misnap/MitekAnalyzer;->a([BIIIIILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->x:I

    :cond_6
    const v0, 0x3f4ccccd    # 0.8f

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->c:F

    mul-float/2addr v0, v1

    const v1, 0x3e4ccccc    # 0.19999999f

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->v:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->c:F

    const v0, 0x3f4ccccd    # 0.8f

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->d:F

    mul-float/2addr v0, v1

    const v1, 0x3e4ccccc    # 0.19999999f

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->y:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->d:F

    const v0, 0x3f4ccccd    # 0.8f

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->e:F

    mul-float/2addr v0, v1

    const v1, 0x3e4ccccc    # 0.19999999f

    iget v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->z:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->e:F

    invoke-direct {p0}, Lcom/miteksystems/misnap/MitekAnalyzer;->s()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->K:Z

    const/4 v0, 0x5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    aput-wide v2, v9, v0

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->b:I

    goto/16 :goto_0

    :cond_7
    iget-object v2, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->f:Ljava/util/List;

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->G:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_1
.end method

.method final a()Z
    .locals 2

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->u:I

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->N:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final a(I)Z
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->w:I

    if-le v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final a(Landroid/graphics/Bitmap;II)[B
    .locals 1

    mul-int v0, p2, p3

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/miteksystems/misnap/MitekAnalyzer;->argbBitmapToYUVN21(Landroid/graphics/Bitmap;II[B)V

    return-object v0
.end method

.method final b(Lcom/miteksystems/misnap/a;)V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->s:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method final b()Z
    .locals 2

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->c:F

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->L:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final c()Z
    .locals 2

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->d:F

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->M:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d()Z
    .locals 2

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->w:I

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->O:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final e()Z
    .locals 2

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->x:I

    iget v1, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->P:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final f()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->u:I

    return v0
.end method

.method final g()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->c:F

    float-to-int v0, v0

    return v0
.end method

.method final h()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->d:F

    float-to-int v0, v0

    return v0
.end method

.method final i()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->e:F

    float-to-int v0, v0

    return v0
.end method

.method final j()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->w:I

    return v0
.end method

.method final k()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->x:I

    return v0
.end method

.method final l()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->t:Ljava/util/List;

    return-object v0
.end method

.method final m()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->L:I

    return v0
.end method

.method final n()I
    .locals 1

    iget v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->M:I

    return v0
.end method

.method final o()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->I:Landroid/graphics/Rect;

    return-object v0
.end method

.method final p()V
    .locals 1

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->u:I

    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->A:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->H:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->K:Z

    return-void
.end method

.method final q()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->v:I

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->y:I

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->z:I

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->w:I

    iput v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->x:I

    return-void
.end method

.method final r()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/miteksystems/misnap/MitekAnalyzer;->r:Z

    return-void
.end method
