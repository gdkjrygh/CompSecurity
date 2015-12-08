.class public Lkik/android/widget/VideoKeyFrameView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/VideoKeyFrameView$a;,
        Lkik/android/widget/VideoKeyFrameView$b;
    }
.end annotation


# instance fields
.field final a:F

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Landroid/graphics/drawable/Drawable;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:F

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:I

.field private k:Landroid/graphics/Paint;

.field private l:Landroid/graphics/Paint;

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:F

.field private q:Ljava/util/ArrayList;

.field private r:I

.field private s:I

.field private t:I

.field private u:J

.field private v:J

.field private w:Landroid/media/MediaMetadataRetriever;

.field private x:Lkik/android/widget/VideoKeyFrameView$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 77
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 46
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->m:Z

    .line 47
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->n:Z

    .line 48
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->o:Z

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    .line 66
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->a:F

    .line 78
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 82
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->m:Z

    .line 47
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->n:Z

    .line 48
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->o:Z

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    .line 66
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->a:F

    .line 83
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 87
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->m:Z

    .line 47
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->n:Z

    .line 48
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->o:Z

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    .line 66
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->a:F

    .line 88
    return-void
.end method

.method private a(I)I
    .locals 2

    .prologue
    .line 156
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->j:I

    mul-int/2addr v0, p1

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->j:I

    mul-int/2addr v1, p1

    add-int/2addr v0, v1

    return v0
.end method

.method static synthetic a(Lkik/android/widget/VideoKeyFrameView;)J
    .locals 2

    .prologue
    .line 27
    iget-wide v0, p0, Lkik/android/widget/VideoKeyFrameView;->u:J

    return-wide v0
.end method

.method public static a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    .line 439
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 440
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 445
    int-to-float v2, p2

    int-to-float v3, v0

    div-float/2addr v2, v3

    .line 446
    int-to-float v3, p1

    int-to-float v4, v1

    div-float/2addr v3, v4

    .line 447
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 450
    int-to-float v0, v0

    mul-float/2addr v0, v2

    .line 451
    int-to-float v1, v1

    mul-float/2addr v1, v2

    .line 455
    int-to-float v2, p2

    sub-float/2addr v2, v0

    div-float/2addr v2, v5

    .line 456
    int-to-float v3, p1

    sub-float/2addr v3, v1

    div-float/2addr v3, v5

    .line 460
    new-instance v4, Landroid/graphics/RectF;

    add-float/2addr v0, v2

    add-float/2addr v1, v3

    invoke-direct {v4, v2, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 464
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-static {p2, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 465
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 466
    invoke-virtual {v1, p0, v6, v4, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 468
    return-object v0
.end method

.method static synthetic b(Lkik/android/widget/VideoKeyFrameView;)Landroid/media/MediaMetadataRetriever;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->w:Landroid/media/MediaMetadataRetriever;

    return-object v0
.end method

.method static synthetic c(Lkik/android/widget/VideoKeyFrameView;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->r:I

    return v0
.end method

.method static synthetic d(Lkik/android/widget/VideoKeyFrameView;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->s:I

    return v0
.end method

.method static synthetic e(Lkik/android/widget/VideoKeyFrameView;)I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->t:I

    return v0
.end method

.method private e()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 227
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->o:Z

    .line 228
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->n:Z

    .line 229
    iput-boolean v0, p0, Lkik/android/widget/VideoKeyFrameView;->m:Z

    .line 230
    return-void
.end method

.method static synthetic f(Lkik/android/widget/VideoKeyFrameView;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 121
    const/16 v0, 0x10

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->j:I

    .line 122
    return-void
.end method

.method public final a(F)V
    .locals 1

    .prologue
    .line 110
    iput p1, p0, Lkik/android/widget/VideoKeyFrameView;->h:F

    .line 111
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->h:F

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    .line 112
    return-void
.end method

.method public final a(Landroid/graphics/Paint;Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lkik/android/widget/VideoKeyFrameView;->k:Landroid/graphics/Paint;

    .line 105
    iput-object p2, p0, Lkik/android/widget/VideoKeyFrameView;->l:Landroid/graphics/Paint;

    .line 106
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    .line 98
    iput-object p2, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    .line 99
    iput-object p3, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    .line 100
    return-void
.end method

.method public final a(Ljava/lang/String;J)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xa
    .end annotation

    .prologue
    .line 428
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    iput-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->w:Landroid/media/MediaMetadataRetriever;

    .line 429
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->w:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 431
    iput-wide p2, p0, Lkik/android/widget/VideoKeyFrameView;->v:J

    .line 432
    return-void
.end method

.method public final a(Lkik/android/widget/VideoKeyFrameView$b;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    .line 93
    return-void
.end method

.method public final b()F
    .locals 1

    .prologue
    .line 140
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    return v0
.end method

.method public final b(F)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 116
    invoke-direct {p0, v1}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    div-int v0, v1, v0

    int-to-float v0, v0

    add-float/2addr v0, p1

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->i:F

    .line 117
    return-void
.end method

.method public final c()F
    .locals 1

    .prologue
    .line 145
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    return v0
.end method

.method public final c(F)V
    .locals 0

    .prologue
    .line 126
    iput p1, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    .line 127
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->invalidate()V

    .line 128
    return-void
.end method

.method public final d()F
    .locals 1

    .prologue
    .line 150
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .prologue
    .line 167
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredHeight()I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    sub-int v6, v0, v1

    .line 170
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredWidth()I

    move-result v0

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v7, v0

    .line 171
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    mul-float/2addr v0, v7

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    int-to-float v1, v1

    add-float v8, v0, v1

    .line 172
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    mul-float/2addr v0, v7

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    int-to-float v1, v1

    add-float v9, v0, v1

    .line 173
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    mul-float/2addr v0, v7

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    int-to-float v1, v1

    add-float v10, v0, v1

    .line 175
    const/16 v0, 0x1e

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v11

    .line 176
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    int-to-float v1, v0

    int-to-float v2, v11

    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->j:I

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v7

    const/high16 v3, 0x41a00000    # 20.0f

    add-float/2addr v3, v0

    const/16 v0, 0x24

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    add-int/2addr v0, v11

    int-to-float v4, v0

    iget-object v5, p0, Lkik/android/widget/VideoKeyFrameView;->l:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 178
    const/16 v0, 0xa

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 180
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->s:I

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    int-to-float v0, v0

    cmpg-float v0, v0, v7

    if-gez v0, :cond_1

    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 181
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 182
    if-eqz v0, :cond_0

    .line 183
    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v2

    iget v3, p0, Lkik/android/widget/VideoKeyFrameView;->s:I

    mul-int/2addr v3, v1

    add-int/2addr v2, v3

    int-to-float v2, v2

    const/16 v3, 0x1e

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 180
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 190
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    int-to-float v1, v0

    int-to-float v2, v11

    const/16 v0, 0x24

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    add-int/2addr v0, v11

    int-to-float v4, v0

    iget-object v5, p0, Lkik/android/widget/VideoKeyFrameView;->k:Landroid/graphics/Paint;

    move-object v0, p1

    move v3, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 191
    int-to-float v2, v11

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    int-to-float v0, v0

    add-float v3, v7, v0

    const/16 v0, 0x24

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    add-int/2addr v0, v11

    int-to-float v4, v0

    iget-object v5, p0, Lkik/android/widget/VideoKeyFrameView;->k:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 193
    float-to-int v0, v10

    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 194
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v3, v0

    iget-object v4, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 195
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 197
    float-to-int v0, v8

    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    const/16 v1, 0x9

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    sub-int/2addr v0, v1

    .line 198
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    sub-int v2, v6, v2

    iget-object v3, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1, v0, v2, v3, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 199
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 201
    float-to-int v0, v9

    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    const/16 v1, 0xa

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 202
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    sub-int v2, v6, v2

    iget-object v3, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1, v0, v2, v3, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 203
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 205
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 5

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x0

    .line 475
    const/16 v0, 0xa

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 476
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 477
    const/16 v0, 0x24

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->r:I

    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredWidth()I

    move-result v0

    invoke-direct {p0, v2}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->r:I

    div-int/2addr v0, v1

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->t:I

    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredWidth()I

    move-result v0

    invoke-direct {p0, v2}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->t:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->s:I

    iget-wide v0, p0, Lkik/android/widget/VideoKeyFrameView;->v:J

    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->t:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    iput-wide v0, p0, Lkik/android/widget/VideoKeyFrameView;->u:J

    .line 478
    new-instance v0, Lkik/android/widget/VideoKeyFrameView$a;

    invoke-direct {v0, p0, v4}, Lkik/android/widget/VideoKeyFrameView$a;-><init>(Lkik/android/widget/VideoKeyFrameView;I)V

    new-array v1, v4, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lkik/android/widget/VideoKeyFrameView$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 480
    :cond_2
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    const/high16 v11, 0x41200000    # 10.0f

    const/4 v10, 0x0

    const/4 v9, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 235
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    .line 236
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    .line 239
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredWidth()I

    move-result v0

    invoke-direct {p0, v9}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    sub-int v4, v0, v1

    .line 242
    int-to-float v0, v4

    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    mul-float/2addr v0, v1

    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, v0

    .line 243
    int-to-float v0, v4

    iget v7, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    mul-float/2addr v0, v7

    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v0, v7

    .line 244
    int-to-float v7, v4

    iget v8, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    mul-float/2addr v7, v8

    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v7, v8

    .line 247
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v8

    packed-switch v8, :pswitch_data_0

    move v0, v2

    .line 370
    :goto_0
    return v0

    .line 249
    :pswitch_0
    iget-object v4, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    mul-int/lit8 v4, v4, 0x3

    int-to-float v4, v4

    sub-float v4, v1, v4

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_1

    iget-object v4, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v1

    cmpg-float v4, v5, v4

    if-gtz v4, :cond_1

    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredHeight()I

    move-result v4

    iget v8, p0, Lkik/android/widget/VideoKeyFrameView;->j:I

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    sub-int/2addr v4, v8

    iget-object v8, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v8

    sub-int/2addr v4, v8

    int-to-float v4, v4

    cmpl-float v4, v6, v4

    if-ltz v4, :cond_1

    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredHeight()I

    move-result v4

    int-to-float v4, v4

    cmpg-float v4, v6, v4

    if-gtz v4, :cond_1

    move v4, v3

    :goto_1
    if-eqz v4, :cond_2

    .line 250
    iput-boolean v3, p0, Lkik/android/widget/VideoKeyFrameView;->m:Z

    .line 251
    sub-float v0, v5, v1

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->p:F

    :cond_0
    :goto_2
    move v0, v3

    .line 261
    goto :goto_0

    :cond_1
    move v4, v2

    .line 249
    goto :goto_1

    .line 253
    :cond_2
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float v1, v0, v1

    cmpg-float v1, v1, v5

    if-gtz v1, :cond_3

    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    int-to-float v1, v1

    add-float/2addr v1, v0

    cmpg-float v1, v5, v1

    if-gtz v1, :cond_3

    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredHeight()I

    move-result v1

    iget-object v4, p0, Lkik/android/widget/VideoKeyFrameView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    sub-int/2addr v1, v4

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->j:I

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    sub-int/2addr v1, v4

    int-to-float v1, v1

    cmpl-float v1, v6, v1

    if-ltz v1, :cond_3

    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v1, v6, v1

    if-gtz v1, :cond_3

    move v1, v3

    :goto_3
    if-eqz v1, :cond_4

    .line 254
    iput-boolean v3, p0, Lkik/android/widget/VideoKeyFrameView;->n:Z

    .line 255
    sub-float v0, v5, v0

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->p:F

    goto :goto_2

    :cond_3
    move v1, v2

    .line 253
    goto :goto_3

    .line 257
    :cond_4
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, v7, v0

    sub-float/2addr v0, v11

    cmpg-float v0, v0, v5

    if-gtz v0, :cond_5

    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v7

    add-float/2addr v0, v11

    cmpg-float v0, v5, v0

    if-gtz v0, :cond_5

    cmpl-float v0, v6, v10

    if-ltz v0, :cond_5

    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->getMeasuredHeight()I

    move-result v0

    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpg-float v0, v6, v0

    if-gtz v0, :cond_5

    move v2, v3

    :cond_5
    if-eqz v2, :cond_0

    .line 258
    iput-boolean v3, p0, Lkik/android/widget/VideoKeyFrameView;->o:Z

    .line 259
    sub-float v0, v5, v7

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->p:F

    goto/16 :goto_2

    .line 265
    :pswitch_1
    invoke-direct {p0}, Lkik/android/widget/VideoKeyFrameView;->e()V

    move v0, v3

    .line 266
    goto/16 :goto_0

    .line 270
    :pswitch_2
    invoke-direct {p0}, Lkik/android/widget/VideoKeyFrameView;->e()V

    move v0, v3

    .line 271
    goto/16 :goto_0

    .line 276
    :pswitch_3
    iget-boolean v2, p0, Lkik/android/widget/VideoKeyFrameView;->m:Z

    if-eqz v2, :cond_e

    .line 278
    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->p:F

    sub-float v1, v5, v1

    .line 281
    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v2

    int-to-float v2, v2

    cmpg-float v2, v1, v2

    if-gez v2, :cond_d

    .line 282
    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    int-to-float v0, v0

    .line 288
    :cond_6
    :goto_4
    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    .line 289
    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v2

    int-to-float v2, v2

    sub-float v2, v0, v2

    int-to-float v4, v4

    div-float/2addr v2, v4

    iput v2, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    .line 292
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    sub-float/2addr v2, v4

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->h:F

    cmpl-float v2, v2, v4

    if-gtz v2, :cond_7

    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    sub-float/2addr v2, v4

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->i:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_a

    .line 293
    :cond_7
    const/high16 v2, 0x3f800000    # 1.0f

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iget v5, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    sub-float v5, v1, v5

    sub-float/2addr v4, v5

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iput v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    .line 294
    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    if-eqz v2, :cond_8

    .line 295
    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    invoke-interface {v2, v4, v9}, Lkik/android/widget/VideoKeyFrameView$b;->a(FI)V

    .line 297
    :cond_8
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_9

    .line 298
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iput v2, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    .line 301
    :cond_9
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    sub-float/2addr v2, v4

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->i:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_a

    .line 302
    iput v1, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    .line 306
    :cond_a
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    if-eqz v1, :cond_b

    .line 307
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    invoke-interface {v1, v2, v3}, Lkik/android/widget/VideoKeyFrameView$b;->a(FI)V

    .line 310
    :cond_b
    cmpl-float v0, v0, v7

    if-lez v0, :cond_c

    .line 311
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    .line 365
    :cond_c
    :goto_5
    invoke-virtual {p0}, Lkik/android/widget/VideoKeyFrameView;->invalidate()V

    move v0, v3

    .line 366
    goto/16 :goto_0

    .line 284
    :cond_d
    cmpl-float v2, v1, v0

    if-gtz v2, :cond_6

    move v0, v1

    goto :goto_4

    .line 315
    :cond_e
    iget-boolean v2, p0, Lkik/android/widget/VideoKeyFrameView;->n:Z

    if-eqz v2, :cond_16

    .line 316
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->p:F

    sub-float v0, v5, v0

    .line 319
    cmpg-float v2, v0, v1

    if-gez v2, :cond_15

    move v0, v1

    .line 326
    :cond_f
    :goto_6
    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    .line 327
    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v2

    int-to-float v2, v2

    sub-float v2, v0, v2

    int-to-float v4, v4

    div-float/2addr v2, v4

    iput v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    .line 328
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    sub-float/2addr v2, v4

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->h:F

    cmpl-float v2, v2, v4

    if-gtz v2, :cond_10

    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    sub-float/2addr v2, v4

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->i:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_13

    .line 329
    :cond_10
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    add-float/2addr v2, v4

    sub-float/2addr v2, v1

    invoke-static {v10, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iput v2, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    .line 330
    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    if-eqz v2, :cond_11

    .line 331
    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    invoke-interface {v2, v4, v3}, Lkik/android/widget/VideoKeyFrameView$b;->a(FI)V

    .line 333
    :cond_11
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_12

    .line 334
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    iput v2, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    .line 337
    :cond_12
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->e:F

    sub-float/2addr v2, v4

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView;->i:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_13

    .line 338
    iput v1, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    .line 342
    :cond_13
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    if-eqz v1, :cond_14

    .line 343
    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    invoke-interface {v1, v2, v9}, Lkik/android/widget/VideoKeyFrameView$b;->a(FI)V

    .line 345
    :cond_14
    cmpl-float v0, v7, v0

    if-lez v0, :cond_c

    .line 346
    iget v0, p0, Lkik/android/widget/VideoKeyFrameView;->f:F

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    goto :goto_5

    .line 322
    :cond_15
    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v1

    add-int/2addr v1, v4

    int-to-float v1, v1

    cmpl-float v1, v0, v1

    if-lez v1, :cond_f

    .line 323
    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    add-int/2addr v0, v4

    int-to-float v0, v0

    goto :goto_6

    .line 350
    :cond_16
    iget-boolean v2, p0, Lkik/android/widget/VideoKeyFrameView;->o:Z

    if-eqz v2, :cond_c

    .line 351
    iget v2, p0, Lkik/android/widget/VideoKeyFrameView;->p:F

    sub-float v2, v5, v2

    .line 354
    cmpg-float v5, v2, v1

    if-gez v5, :cond_17

    .line 360
    :goto_7
    invoke-direct {p0, v3}, Lkik/android/widget/VideoKeyFrameView;->a(I)I

    move-result v0

    int-to-float v0, v0

    sub-float v0, v1, v0

    int-to-float v1, v4

    div-float/2addr v0, v1

    iput v0, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    .line 361
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    if-eqz v0, :cond_c

    .line 362
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView;->x:Lkik/android/widget/VideoKeyFrameView$b;

    iget v1, p0, Lkik/android/widget/VideoKeyFrameView;->g:F

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lkik/android/widget/VideoKeyFrameView$b;->a(FI)V

    goto/16 :goto_5

    .line 357
    :cond_17
    cmpl-float v1, v2, v0

    if-lez v1, :cond_18

    move v1, v0

    .line 358
    goto :goto_7

    :cond_18
    move v1, v2

    goto :goto_7

    .line 247
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
