.class public Lcom/facebook/debug/fps/i;
.super Landroid/view/View;
.source "FPSView.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;

.field private static final d:[I

.field private static final e:[I

.field private static final f:[D


# instance fields
.field private A:F

.field private final B:Lcom/facebook/debug/e/a;

.field private g:J

.field private h:J

.field private i:J

.field private j:J

.field private k:I

.field private l:I

.field private m:Z

.field private final n:Ljava/lang/String;

.field private o:[I

.field private p:[I

.field private q:I

.field private r:Z

.field private s:Z

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Landroid/graphics/Paint;

.field private final v:Lcom/facebook/analytics/av;

.field private final w:Lcom/facebook/analytics/e/i;

.field private final x:Lcom/facebook/e/a/e;

.field private y:Ljava/lang/String;

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x5

    .line 46
    const-class v0, Lcom/facebook/debug/fps/i;

    sput-object v0, Lcom/facebook/debug/fps/i;->a:Ljava/lang/Class;

    .line 54
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "mpf_8_or_less"

    aput-object v1, v0, v4

    const-string v1, "mpf_between_8_and_16"

    aput-object v1, v0, v5

    const-string v1, "mpf_between_16_and_24"

    aput-object v1, v0, v6

    const-string v1, "mpf_between_24_and_32"

    aput-object v1, v0, v7

    const/4 v1, 0x4

    const-string v2, "mpf_between_32_and_64"

    aput-object v2, v0, v1

    const-string v1, "mpf_more_than_64"

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/debug/fps/i;->b:[Ljava/lang/String;

    .line 61
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "fps_55_or_more"

    aput-object v1, v0, v4

    const-string v1, "fps_between_55_and_50"

    aput-object v1, v0, v5

    const-string v1, "fps_between_50_and_45"

    aput-object v1, v0, v6

    const-string v1, "fps_between_45_and_40"

    aput-object v1, v0, v7

    const/4 v1, 0x4

    const-string v2, "fps_between_40_and_35"

    aput-object v2, v0, v1

    const-string v1, "fps_between_35_and_30"

    aput-object v1, v0, v3

    const/4 v1, 0x6

    const-string v2, "fps_between_30_and_20"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "fps_between_20_and_10"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "fps_10_or_less"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/debug/fps/i;->c:[Ljava/lang/String;

    .line 71
    new-array v0, v3, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/facebook/debug/fps/i;->d:[I

    .line 72
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/facebook/debug/fps/i;->e:[I

    .line 75
    const/16 v0, 0x9

    new-array v0, v0, [D

    fill-array-data v0, :array_2

    sput-object v0, Lcom/facebook/debug/fps/i;->f:[D

    return-void

    .line 71
    :array_0
    .array-data 4
        0x8
        0x10
        0x18
        0x20
        0x40
    .end array-data

    .line 72
    :array_1
    .array-data 4
        0x37
        0x32
        0x2d
        0x28
        0x23
        0x1e
        0x14
        0xa
    .end array-data

    .line 75
    :array_2
    .array-data 8
        0x404cc00000000000L    # 57.5
        0x404a400000000000L    # 52.5
        0x4047c00000000000L    # 47.5
        0x4045400000000000L    # 42.5
        0x4042c00000000000L    # 37.5
        0x4040400000000000L    # 32.5
        0x4039000000000000L    # 25.0
        0x402e000000000000L    # 15.0
        0x4014000000000000L    # 5.0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const-wide/16 v0, -0x1

    const/4 v3, 0x0

    .line 106
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 78
    iput-wide v0, p0, Lcom/facebook/debug/fps/i;->g:J

    .line 79
    iput-wide v0, p0, Lcom/facebook/debug/fps/i;->h:J

    .line 80
    iput-wide v0, p0, Lcom/facebook/debug/fps/i;->i:J

    .line 81
    iput-wide v0, p0, Lcom/facebook/debug/fps/i;->j:J

    .line 83
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/debug/fps/i;->l:I

    .line 84
    iput-boolean v3, p0, Lcom/facebook/debug/fps/i;->m:Z

    .line 89
    iput v3, p0, Lcom/facebook/debug/fps/i;->q:I

    .line 90
    iput-boolean v3, p0, Lcom/facebook/debug/fps/i;->r:Z

    .line 91
    iput-boolean v4, p0, Lcom/facebook/debug/fps/i;->s:Z

    .line 107
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 108
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->v:Lcom/facebook/analytics/av;

    .line 109
    const-class v0, Lcom/facebook/analytics/e/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/e/i;

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->w:Lcom/facebook/analytics/e/i;

    .line 110
    const-class v0, Lcom/facebook/common/l/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/l/a;

    iget-object v0, v0, Lcom/facebook/common/l/a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->n:Ljava/lang/String;

    .line 111
    const-class v0, Lcom/facebook/e/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/e;

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->x:Lcom/facebook/e/a/e;

    .line 112
    new-instance v2, Lcom/facebook/debug/e/a;

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    invoke-direct {v2, p1, v0}, Lcom/facebook/debug/e/a;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;)V

    iput-object v2, p0, Lcom/facebook/debug/fps/i;->B:Lcom/facebook/debug/e/a;

    .line 114
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    .line 115
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 116
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 117
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 118
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->t:Ljava/util/List;

    .line 119
    sget-object v0, Lcom/facebook/debug/fps/i;->b:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->o:[I

    .line 120
    sget-object v0, Lcom/facebook/debug/fps/i;->c:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->p:[I

    .line 121
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->o:[I

    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([II)V

    .line 122
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->p:[I

    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([II)V

    .line 124
    invoke-direct {p0}, Lcom/facebook/debug/fps/i;->b()V

    .line 125
    return-void
.end method

.method private static a(F)I
    .locals 1

    .prologue
    .line 393
    const/high16 v0, 0x40800000    # 4.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    .line 394
    const v0, -0xff0100

    .line 398
    :goto_0
    return v0

    .line 395
    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    .line 396
    const/16 v0, -0x100

    goto :goto_0

    .line 398
    :cond_1
    const/high16 v0, -0x10000

    goto :goto_0
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 346
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->m:Z

    if-nez v0, :cond_0

    .line 356
    :goto_0
    return-void

    .line 349
    :cond_0
    const/4 v0, 0x0

    :goto_1
    sget-object v1, Lcom/facebook/debug/fps/i;->e:[I

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 350
    sget-object v1, Lcom/facebook/debug/fps/i;->e:[I

    aget v1, v1, v0

    if-lt p1, v1, :cond_1

    .line 351
    iget-object v1, p0, Lcom/facebook/debug/fps/i;->p:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    goto :goto_0

    .line 349
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 355
    :cond_2
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->p:[I

    iget-object v1, p0, Lcom/facebook/debug/fps/i;->p:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    goto :goto_0
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 360
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->m:Z

    if-nez v0, :cond_0

    .line 370
    :goto_0
    return-void

    .line 363
    :cond_0
    const/4 v0, 0x0

    :goto_1
    sget-object v1, Lcom/facebook/debug/fps/i;->d:[I

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 364
    sget-object v1, Lcom/facebook/debug/fps/i;->d:[I

    aget v1, v1, v0

    int-to-long v1, v1

    cmp-long v1, p1, v1

    if-gtz v1, :cond_1

    .line 365
    iget-object v1, p0, Lcom/facebook/debug/fps/i;->o:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    goto :goto_0

    .line 363
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 369
    :cond_2
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->o:[I

    iget-object v1, p0, Lcom/facebook/debug/fps/i;->o:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    goto :goto_0
.end method

.method private static b(I)I
    .locals 1

    .prologue
    .line 378
    const/16 v0, 0x2d

    if-lt p0, v0, :cond_0

    .line 379
    const v0, -0xff0100

    .line 383
    :goto_0
    return v0

    .line 380
    :cond_0
    const/16 v0, 0x1e

    if-lt p0, v0, :cond_1

    .line 381
    const/16 v0, -0x100

    goto :goto_0

    .line 383
    :cond_1
    const/high16 v0, -0x10000

    goto :goto_0
.end method

.method private b()V
    .locals 4

    .prologue
    const/high16 v3, 0x49800000    # 1048576.0f

    .line 216
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->x:Lcom/facebook/e/a/e;

    invoke-virtual {v0}, Lcom/facebook/e/a/e;->b()Lcom/facebook/common/c/i;

    move-result-object v0

    .line 218
    iget-wide v1, v0, Lcom/facebook/common/c/i;->a:J

    .line 219
    long-to-float v1, v1

    div-float/2addr v1, v3

    iput v1, p0, Lcom/facebook/debug/fps/i;->z:F

    .line 220
    invoke-virtual {v0}, Lcom/facebook/common/c/i;->a()J

    move-result-wide v0

    long-to-float v0, v0

    div-float/2addr v0, v3

    iput v0, p0, Lcom/facebook/debug/fps/i;->A:F

    .line 221
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 255
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 256
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/debug/fps/i;->g:J

    .line 257
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->o:[I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 258
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->p:[I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 259
    iput v2, p0, Lcom/facebook/debug/fps/i;->q:I

    .line 260
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 14

    .prologue
    .line 263
    invoke-virtual {p0}, Lcom/facebook/debug/fps/i;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 264
    if-nez v0, :cond_1

    .line 342
    :cond_0
    :goto_0
    return-void

    .line 268
    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/debug/fps/i;->m:Z

    .line 271
    iget-object v1, p0, Lcom/facebook/debug/fps/i;->o:[I

    array-length v1, v1

    new-array v5, v1, [D

    .line 272
    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/debug/fps/i;->d:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    int-to-double v2, v2

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v6

    aput-wide v2, v5, v1

    .line 273
    const/4 v1, 0x1

    :goto_1
    sget-object v2, Lcom/facebook/debug/fps/i;->d:[I

    array-length v2, v2

    if-ge v1, v2, :cond_2

    .line 274
    sget-object v2, Lcom/facebook/debug/fps/i;->d:[I

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    sget-object v3, Lcom/facebook/debug/fps/i;->d:[I

    aget v3, v3, v1

    add-int/2addr v2, v3

    int-to-double v2, v2

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v6

    aput-wide v2, v5, v1

    .line 273
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 276
    :cond_2
    iget-object v1, p0, Lcom/facebook/debug/fps/i;->o:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    sget-object v2, Lcom/facebook/debug/fps/i;->d:[I

    sget-object v3, Lcom/facebook/debug/fps/i;->d:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    iget v3, p0, Lcom/facebook/debug/fps/i;->q:I

    add-int/2addr v2, v3

    int-to-double v2, v2

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v6

    aput-wide v2, v5, v1

    .line 280
    const/4 v4, 0x0

    .line 281
    const-wide/16 v2, 0x0

    .line 282
    const/4 v1, 0x0

    :goto_2
    iget-object v6, p0, Lcom/facebook/debug/fps/i;->o:[I

    array-length v6, v6

    if-ge v1, v6, :cond_3

    .line 283
    iget-object v6, p0, Lcom/facebook/debug/fps/i;->o:[I

    aget v6, v6, v1

    add-int/2addr v4, v6

    .line 284
    iget-object v6, p0, Lcom/facebook/debug/fps/i;->o:[I

    aget v6, v6, v1

    int-to-double v6, v6

    aget-wide v8, v5, v1

    mul-double/2addr v6, v8

    add-double/2addr v2, v6

    .line 282
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 286
    :cond_3
    const/4 v7, 0x0

    .line 287
    const-wide/16 v5, 0x0

    .line 288
    const/4 v1, 0x0

    :goto_3
    iget-object v8, p0, Lcom/facebook/debug/fps/i;->p:[I

    array-length v8, v8

    if-ge v1, v8, :cond_4

    .line 289
    iget-object v8, p0, Lcom/facebook/debug/fps/i;->p:[I

    aget v8, v8, v1

    add-int/2addr v7, v8

    .line 290
    iget-object v8, p0, Lcom/facebook/debug/fps/i;->p:[I

    aget v8, v8, v1

    int-to-double v8, v8

    sget-object v10, Lcom/facebook/debug/fps/i;->f:[D

    aget-wide v10, v10, v1

    mul-double/2addr v8, v10

    add-double/2addr v5, v8

    .line 288
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 292
    :cond_4
    if-eqz v4, :cond_0

    if-eqz v7, :cond_0

    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 297
    new-instance v8, Lcom/facebook/analytics/cb;

    const-string v0, "frames_per_second"

    invoke-direct {v8, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 298
    const-string v0, "current_activity"

    invoke-virtual {v8, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 299
    if-eqz p1, :cond_5

    .line 300
    const-string v0, "scenario"

    invoke-virtual {v8, v0, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 303
    :cond_5
    const/4 v0, 0x0

    :goto_4
    sget-object v9, Lcom/facebook/debug/fps/i;->b:[Ljava/lang/String;

    array-length v9, v9

    if-ge v0, v9, :cond_6

    .line 304
    sget-object v9, Lcom/facebook/debug/fps/i;->b:[Ljava/lang/String;

    aget-object v9, v9, v0

    iget-object v10, p0, Lcom/facebook/debug/fps/i;->o:[I

    aget v10, v10, v0

    invoke-virtual {v8, v9, v10}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 305
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/facebook/debug/fps/i;->b:[Ljava/lang/String;

    aget-object v10, v10, v0

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "_pct"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lcom/facebook/debug/fps/i;->o:[I

    aget v10, v10, v0

    int-to-double v10, v10

    int-to-double v12, v4

    div-double/2addr v10, v12

    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    mul-double/2addr v10, v12

    invoke-virtual {v8, v9, v10, v11}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    .line 303
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 307
    :cond_6
    const/4 v0, 0x0

    :goto_5
    sget-object v9, Lcom/facebook/debug/fps/i;->c:[Ljava/lang/String;

    array-length v9, v9

    if-ge v0, v9, :cond_7

    .line 308
    sget-object v9, Lcom/facebook/debug/fps/i;->c:[Ljava/lang/String;

    aget-object v9, v9, v0

    iget-object v10, p0, Lcom/facebook/debug/fps/i;->p:[I

    aget v10, v10, v0

    invoke-virtual {v8, v9, v10}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 309
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/facebook/debug/fps/i;->c:[Ljava/lang/String;

    aget-object v10, v10, v0

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "_pct"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lcom/facebook/debug/fps/i;->p:[I

    aget v10, v10, v0

    int-to-double v10, v10

    int-to-double v12, v7

    div-double/2addr v10, v12

    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    mul-double/2addr v10, v12

    invoke-virtual {v8, v9, v10, v11}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    .line 307
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 313
    :cond_7
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->n:Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/facebook/debug/fps/i;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_8

    .line 314
    const-string v0, "githash"

    iget-object v9, p0, Lcom/facebook/debug/fps/i;->n:Ljava/lang/String;

    invoke-virtual {v8, v0, v9}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 317
    :cond_8
    const-string v0, "fps_average"

    int-to-double v9, v7

    div-double/2addr v5, v9

    invoke-virtual {v8, v0, v5, v6}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    .line 318
    const-string v0, "mpf_average"

    int-to-double v5, v4

    div-double/2addr v2, v5

    invoke-virtual {v8, v0, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    .line 319
    const-string v0, "mpf_max"

    iget v2, p0, Lcom/facebook/debug/fps/i;->q:I

    invoke-virtual {v8, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 322
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->v:Lcom/facebook/analytics/av;

    invoke-interface {v0, v8}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 325
    const-string v0, "%s:%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v5, "FPS"

    aput-object v5, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-static {v0, v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 326
    const-string v2, "%s:%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "MPF"

    aput-object v6, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    invoke-static {v2, v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 329
    iget-object v2, p0, Lcom/facebook/debug/fps/i;->w:Lcom/facebook/analytics/e/i;

    invoke-interface {v2, v0}, Lcom/facebook/analytics/e/i;->a(Ljava/lang/String;)V

    .line 330
    iget-object v2, p0, Lcom/facebook/debug/fps/i;->w:Lcom/facebook/analytics/e/i;

    iget-object v3, p0, Lcom/facebook/debug/fps/i;->p:[I

    const/4 v5, 0x0

    aget v3, v3, v5

    int-to-double v5, v3

    int-to-double v7, v7

    div-double/2addr v5, v7

    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    mul-double/2addr v5, v7

    invoke-interface {v2, v0, v5, v6}, Lcom/facebook/analytics/e/i;->a(Ljava/lang/String;D)V

    .line 331
    iget-object v2, p0, Lcom/facebook/debug/fps/i;->w:Lcom/facebook/analytics/e/i;

    invoke-interface {v2, v0}, Lcom/facebook/analytics/e/i;->b(Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->w:Lcom/facebook/analytics/e/i;

    invoke-interface {v0, v1}, Lcom/facebook/analytics/e/i;->a(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->w:Lcom/facebook/analytics/e/i;

    iget-object v2, p0, Lcom/facebook/debug/fps/i;->o:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    int-to-double v2, v2

    int-to-double v4, v4

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double/2addr v2, v4

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/analytics/e/i;->a(Ljava/lang/String;D)V

    .line 336
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->w:Lcom/facebook/analytics/e/i;

    invoke-interface {v0, v1}, Lcom/facebook/analytics/e/i;->b(Ljava/lang/String;)V

    .line 339
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/debug/fps/i;->m:Z

    .line 341
    invoke-virtual {p0}, Lcom/facebook/debug/fps/i;->a()V

    goto/16 :goto_0
.end method

.method public getEnableFrameCounter()Z
    .locals 1

    .prologue
    .line 251
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->s:Z

    return v0
.end method

.method public getEnableOutputToLogcat()Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->r:Z

    return v0
.end method

.method public getEnableRecordingData()Z
    .locals 1

    .prologue
    .line 243
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->m:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .prologue
    .line 129
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 130
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 131
    iget-wide v3, p0, Lcom/facebook/debug/fps/i;->h:J

    const-wide/16 v5, -0x1

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    .line 132
    iput-wide v1, p0, Lcom/facebook/debug/fps/i;->h:J

    .line 133
    iput-wide v1, p0, Lcom/facebook/debug/fps/i;->i:J

    .line 134
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/debug/fps/i;->k:I

    .line 137
    :cond_0
    iget-wide v3, p0, Lcom/facebook/debug/fps/i;->g:J

    const-wide/16 v5, -0x1

    cmp-long v0, v3, v5

    if-nez v0, :cond_1

    .line 138
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/debug/fps/i;->g:J

    .line 141
    :cond_1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/i;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 142
    iget-wide v3, p0, Lcom/facebook/debug/fps/i;->h:J

    sub-long v3, v1, v3

    .line 143
    iget-wide v5, p0, Lcom/facebook/debug/fps/i;->i:J

    sub-long v5, v1, v5

    .line 146
    const-wide/16 v7, 0x3e8

    cmp-long v0, v3, v7

    if-lez v0, :cond_2

    .line 148
    invoke-direct {p0}, Lcom/facebook/debug/fps/i;->b()V

    .line 150
    iput-wide v1, p0, Lcom/facebook/debug/fps/i;->h:J

    .line 151
    iget v0, p0, Lcom/facebook/debug/fps/i;->k:I

    iput v0, p0, Lcom/facebook/debug/fps/i;->l:I

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/debug/fps/i;->k:I

    .line 154
    iget v0, p0, Lcom/facebook/debug/fps/i;->l:I

    invoke-direct {p0, v0}, Lcom/facebook/debug/fps/i;->a(I)V

    .line 157
    :cond_2
    invoke-direct {p0, v5, v6}, Lcom/facebook/debug/fps/i;->a(J)V

    .line 158
    iget v0, p0, Lcom/facebook/debug/fps/i;->q:I

    int-to-long v7, v0

    cmp-long v0, v7, v5

    if-gez v0, :cond_3

    .line 159
    long-to-int v0, v5

    iput v0, p0, Lcom/facebook/debug/fps/i;->q:I

    .line 165
    :cond_3
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->t:Ljava/util/List;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    iget-wide v7, p0, Lcom/facebook/debug/fps/i;->g:J

    const-wide/16 v9, 0x1388

    cmp-long v0, v7, v9

    if-lez v0, :cond_4

    const-wide/16 v7, 0x3e8

    cmp-long v0, v3, v7

    if-lez v0, :cond_4

    .line 170
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 171
    const/4 v3, 0x2

    if-le v0, v3, :cond_4

    .line 172
    iget-object v3, p0, Lcom/facebook/debug/fps/i;->t:Ljava/util/List;

    div-int/lit8 v4, v0, 0x2

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v3, v4, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->t:Ljava/util/List;

    .line 173
    iget-object v0, p0, Lcom/facebook/debug/fps/i;->t:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/debug/fps/i;->j:J

    .line 178
    :cond_4
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->s:Z

    if-eqz v0, :cond_5

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/facebook/debug/fps/i;->l:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " fps "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " ms/f "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v3, p0, Lcom/facebook/debug/fps/i;->j:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " max;"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 182
    iget-object v3, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    iget v4, p0, Lcom/facebook/debug/fps/i;->l:I

    invoke-static {v4}, Lcom/facebook/debug/fps/i;->b(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 183
    const/4 v3, 0x0

    const/high16 v4, 0x42ba0000    # 93.0f

    iget-object v5, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 186
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 187
    iget-object v4, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v0, v5, v6, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 188
    iget v4, v3, Landroid/graphics/Rect;->right:I

    add-int/lit8 v4, v4, 0xb

    .line 190
    const-string v5, "mem %.1fM (%.1fM free)"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget v8, p0, Lcom/facebook/debug/fps/i;->z:F

    float-to-double v8, v8

    const-wide v10, 0x3fa999999999999aL    # 0.05

    add-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    iget v8, p0, Lcom/facebook/debug/fps/i;->A:F

    float-to-double v8, v8

    const-wide v10, 0x3fa999999999999aL    # 0.05

    add-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 194
    iget-object v6, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    iget v7, p0, Lcom/facebook/debug/fps/i;->A:F

    invoke-static {v7}, Lcom/facebook/debug/fps/i;->a(F)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 195
    int-to-float v6, v4

    const/high16 v7, 0x42ba0000    # 93.0f

    iget-object v8, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6, v7, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 197
    iget-object v6, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    const/4 v7, 0x0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v6, v5, v7, v8, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 198
    iget v3, v3, Landroid/graphics/Rect;->right:I

    add-int/lit8 v3, v3, 0xb

    .line 200
    iget-object v6, p0, Lcom/facebook/debug/fps/i;->B:Lcom/facebook/debug/e/a;

    invoke-virtual {v6}, Lcom/facebook/debug/e/a;->a()Lcom/facebook/debug/e/b;

    move-result-object v6

    .line 201
    iget-object v7, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    invoke-virtual {v6}, Lcom/facebook/debug/e/b;->b()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 202
    invoke-virtual {v6}, Lcom/facebook/debug/e/b;->a()Ljava/lang/String;

    move-result-object v7

    add-int/2addr v3, v4

    int-to-float v3, v3

    const/high16 v4, 0x42ba0000    # 93.0f

    iget-object v8, p0, Lcom/facebook/debug/fps/i;->u:Landroid/graphics/Paint;

    invoke-virtual {p1, v7, v3, v4, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 204
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lcom/facebook/debug/e/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/debug/fps/i;->y:Ljava/lang/String;

    .line 207
    :cond_5
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->r:Z

    if-eqz v0, :cond_6

    .line 208
    sget-object v0, Lcom/facebook/debug/fps/i;->a:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/log/g;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/facebook/debug/fps/i;->y:Ljava/lang/String;

    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    :cond_6
    iput-wide v1, p0, Lcom/facebook/debug/fps/i;->i:J

    .line 211
    iget v0, p0, Lcom/facebook/debug/fps/i;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/debug/fps/i;->k:I

    .line 212
    return-void
.end method

.method public setEnableFrameCounter(Z)V
    .locals 0

    .prologue
    .line 247
    iput-boolean p1, p0, Lcom/facebook/debug/fps/i;->s:Z

    .line 248
    return-void
.end method

.method public setEnableOutputToLogcat(Z)V
    .locals 0

    .prologue
    .line 224
    iput-boolean p1, p0, Lcom/facebook/debug/fps/i;->r:Z

    .line 225
    return-void
.end method

.method public setEnableRecordingData(Z)V
    .locals 1

    .prologue
    .line 232
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->m:Z

    if-ne v0, p1, :cond_1

    .line 240
    :cond_0
    :goto_0
    return-void

    .line 235
    :cond_1
    iput-boolean p1, p0, Lcom/facebook/debug/fps/i;->m:Z

    .line 237
    iget-boolean v0, p0, Lcom/facebook/debug/fps/i;->m:Z

    if-eqz v0, :cond_0

    .line 238
    invoke-virtual {p0}, Lcom/facebook/debug/fps/i;->a()V

    goto :goto_0
.end method
