.class public Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;
.super Landroid/view/ViewGroup;
.source "ThreadViewImageAttachmentView.java"


# static fields
.field private static final B:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/ui/images/d/h;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:[I

.field private static final c:[I


# instance fields
.field private A:Lcom/facebook/orca/threadview/l;

.field private d:Lcom/facebook/orca/attachments/a;

.field private e:Lcom/facebook/ui/images/d/k;

.field private f:Lcom/facebook/analytics/av;

.field private g:Lcom/facebook/orca/photos/b/h;

.field private h:Lcom/facebook/orca/threadview/cg;

.field private i:Lcom/facebook/common/executors/a;

.field private j:Lcom/facebook/orca/photos/b/ab;

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:Lcom/facebook/messages/model/threads/Message;

.field private u:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/attachments/ImageAttachmentData;",
            ">;"
        }
    .end annotation
.end field

.field private v:I

.field private w:Lcom/facebook/orca/threadview/cf;

.field private x:I

.field private y:I

.field private z:[Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 68
    const-class v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a:Ljava/lang/Class;

    .line 84
    new-array v0, v3, [I

    const v1, 0x10100a7

    aput v1, v0, v2

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b:[I

    .line 85
    new-array v0, v3, [I

    const v1, 0x101009e

    aput v1, v0, v2

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->c:[I

    .line 117
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->B:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 122
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 126
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 129
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 109
    new-instance v0, Lcom/facebook/orca/threadview/cf;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/threadview/cf;-><init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/threadview/cc;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->w:Lcom/facebook/orca/threadview/cf;

    .line 130
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 131
    return-void
.end method

.method private a(ILcom/facebook/orca/attachments/ImageAttachmentData;)I
    .locals 2

    .prologue
    .line 536
    int-to-float v0, p1

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->e()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->d()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)I
    .locals 1

    .prologue
    .line 65
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->l:I

    return v0
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 718
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 719
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 720
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 724
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 725
    const/4 v3, 0x0

    invoke-virtual {v2, p1, v0, v0, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 726
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 727
    return-object v1
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Landroid/graphics/Bitmap;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Landroid/graphics/Bitmap;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/net/Uri;Lcom/facebook/ui/images/base/b;)Lcom/facebook/ui/images/b/ab;
    .locals 3

    .prologue
    .line 617
    invoke-static {p1}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    sget v1, Lcom/facebook/h;->orca_composer_overlay_normal:I

    invoke-direct {p0, p2, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/ui/images/base/b;I)Lcom/facebook/ui/images/base/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/base/b;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    .line 624
    invoke-static {p1}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_composer_overlay_pressed:I

    invoke-direct {p0, p2, v2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/ui/images/base/b;I)Lcom/facebook/ui/images/base/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/base/b;)Lcom/facebook/ui/images/b/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v1

    .line 630
    new-instance v2, Lcom/facebook/ui/images/b/ab;

    invoke-static {v0, v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->w:Lcom/facebook/orca/threadview/cf;

    invoke-direct {v2, v0, v1}, Lcom/facebook/ui/images/b/ab;-><init>(Lcom/google/common/a/es;Lcom/facebook/ui/images/base/a;)V

    return-object v2
.end method

.method private a(Lcom/facebook/ui/images/base/b;I)Lcom/facebook/ui/images/base/b;
    .locals 1

    .prologue
    .line 638
    new-instance v0, Lcom/facebook/orca/threadview/ce;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/orca/threadview/ce;-><init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/ui/images/base/b;I)V

    return-object v0
.end method

.method private a(Landroid/graphics/Point;Z)Lcom/facebook/ui/images/d/h;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    .line 327
    new-instance v0, Lcom/facebook/ui/images/d/i;

    invoke-direct {v0}, Lcom/facebook/ui/images/d/i;-><init>()V

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/d/i;->a(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    iget v1, p1, Landroid/graphics/Point;->x:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->c(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/d/i;->b(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    iget v1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->d(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Z)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    .line 333
    new-instance v1, Lcom/facebook/ui/images/d/d;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/d;-><init>()V

    iget v2, p1, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iget v3, p1, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v1

    .line 337
    if-eqz p2, :cond_0

    .line 338
    invoke-virtual {v1, v5}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    .line 339
    invoke-virtual {v1, v5}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    .line 340
    sget-object v2, Lcom/facebook/ui/images/d/c;->CENTER:Lcom/facebook/ui/images/d/c;

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/d;->a(Lcom/facebook/ui/images/d/c;)Lcom/facebook/ui/images/d/d;

    .line 342
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/ui/images/d/d;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;

    .line 343
    invoke-virtual {v0}, Lcom/facebook/ui/images/d/i;->j()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    return-object v0
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 235
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 236
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v1, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 237
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v2, v2, p1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/widget/images/UrlImage;Lcom/facebook/orca/attachments/ImageAttachmentData;Landroid/graphics/Point;)V

    .line 238
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    .line 239
    new-instance v2, Lcom/facebook/orca/threadview/cd;

    invoke-direct {v2, p0, v1}, Lcom/facebook/orca/threadview/cd;-><init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/attachments/ImageAttachmentData;)V

    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    return-void
.end method

.method private a(II)V
    .locals 5

    .prologue
    const/4 v4, 0x5

    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 380
    .line 381
    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    if-ne p1, v4, :cond_4

    .line 382
    :cond_0
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    sub-int v1, p2, v1

    .line 383
    div-int/lit8 v1, v1, 0x2

    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 384
    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    if-ge v1, v3, :cond_4

    .line 385
    iput v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    move v1, v2

    .line 389
    :goto_0
    const/4 v3, 0x3

    if-eq p1, v3, :cond_1

    if-eq p1, v4, :cond_1

    const/4 v3, 0x6

    if-ne p1, v3, :cond_2

    .line 390
    :cond_1
    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    mul-int/lit8 v3, v3, 0x2

    sub-int v3, p2, v3

    .line 391
    div-int/lit8 v3, v3, 0x3

    iget v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 392
    iget v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    if-ge v3, v4, :cond_2

    .line 393
    iput v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    move v1, v2

    .line 397
    :cond_2
    if-eqz v1, :cond_3

    .line 398
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getImageDimensions()[Landroid/graphics/Point;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    move v2, v0

    .line 400
    :goto_1
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 401
    invoke-virtual {p0, v2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 402
    const/4 v1, 0x0

    check-cast v1, Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 403
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v1, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 404
    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v3, v3, v2

    invoke-direct {p0, v0, v1, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/widget/images/UrlImage;Lcom/facebook/orca/attachments/ImageAttachmentData;Landroid/graphics/Point;)V

    .line 405
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 406
    goto :goto_1

    .line 408
    :cond_3
    return-void

    :cond_4
    move v1, v0

    goto :goto_0
.end method

.method private a(IIII)V
    .locals 5

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    const/4 v4, 0x0

    .line 415
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b(II)Landroid/graphics/Point;

    move-result-object v0

    .line 416
    iget v1, v0, Landroid/graphics/Point;->x:I

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 417
    iget v2, v0, Landroid/graphics/Point;->y:I

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 418
    iget v3, v0, Landroid/graphics/Point;->x:I

    invoke-static {v3, p3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v3

    iput v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    .line 419
    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-static {v0, p4}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    .line 420
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v3, v3, v4

    iget v3, v3, Landroid/graphics/Point;->x:I

    if-ne v0, v3, :cond_0

    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v3, v3, v4

    iget v3, v3, Landroid/graphics/Point;->y:I

    if-eq v0, v3, :cond_1

    .line 423
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getImageDimensions()[Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    .line 425
    :cond_1
    invoke-virtual {p0, v4}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 426
    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->measureChild(Landroid/view/View;II)V

    .line 427
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/high16 v3, 0x436b0000    # 235.0f

    const/high16 v2, 0x42e60000    # 115.0f

    .line 134
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 135
    const-class v0, Lcom/facebook/orca/attachments/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->d:Lcom/facebook/orca/attachments/a;

    .line 136
    const-class v0, Lcom/facebook/ui/images/d/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/d/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->e:Lcom/facebook/ui/images/d/k;

    .line 137
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->f:Lcom/facebook/analytics/av;

    .line 138
    const-class v0, Lcom/facebook/orca/photos/b/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/h;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->g:Lcom/facebook/orca/photos/b/h;

    .line 139
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->i:Lcom/facebook/common/executors/a;

    .line 140
    const-class v0, Lcom/facebook/orca/photos/b/ab;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/ab;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->j:Lcom/facebook/orca/photos/b/ab;

    .line 142
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    .line 143
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->l:I

    .line 144
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->m:I

    .line 145
    invoke-static {p1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    .line 146
    invoke-static {p1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->o:I

    .line 147
    const/high16 v0, 0x42960000    # 75.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    .line 148
    const/high16 v0, 0x43180000    # 152.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->q:I

    .line 150
    invoke-static {p1, v3}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->r:I

    .line 153
    invoke-static {p1, v3}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->s:I

    .line 155
    new-instance v0, Lcom/facebook/orca/threadview/cg;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/threadview/cg;-><init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/threadview/cc;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->h:Lcom/facebook/orca/threadview/cg;

    .line 156
    return-void
.end method

.method private a(Lcom/facebook/orca/attachments/ImageAttachmentData;)V
    .locals 6

    .prologue
    .line 593
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 594
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/facebook/orca/photos/view/PhotoViewActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 595
    const-string v2, "imageData"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 596
    const-string v2, "imageAttachments"

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 597
    const-string v2, "message"

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->t:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 599
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->f:Lcom/facebook/analytics/av;

    new-instance v3, Lcom/facebook/analytics/cb;

    const-string v4, "click"

    invoke-direct {v3, v4}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v4, "message_image"

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->t:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "threadid"

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->t:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "num_images"

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v5}, Lcom/google/common/a/es;->size()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 605
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 606
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/attachments/ImageAttachmentData;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/attachments/ImageAttachmentData;)V

    return-void
.end method

.method private a(Lcom/facebook/widget/images/UrlImage;Lcom/facebook/orca/attachments/ImageAttachmentData;Landroid/graphics/Point;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 279
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->c()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move v0, v2

    .line 280
    :goto_0
    const/16 v3, 0x7c

    invoke-static {v3}, Lcom/google/common/base/Joiner;->on(C)Lcom/google/common/base/Joiner;

    move-result-object v3

    iget v4, p3, Landroid/graphics/Point;->x:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p3, Landroid/graphics/Point;->y:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v2, v1

    invoke-virtual {v3, v4, v5, v2}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 282
    sget-object v2, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->B:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 283
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->B:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/d/h;

    .line 288
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->e:Lcom/facebook/ui/images/d/k;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/k;->a(Lcom/facebook/ui/images/d/h;)Lcom/facebook/ui/images/base/b;

    move-result-object v2

    .line 289
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->h()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 290
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->h()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/images/b/m;->a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/base/b;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/widget/images/UrlImage;->setPlaceholderImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 298
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 299
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->d()I

    move-result v0

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->e()I

    move-result v1

    if-le v0, v1, :cond_4

    .line 300
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->d()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->e()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 302
    iget v1, p3, Landroid/graphics/Point;->y:I

    .line 303
    iget v3, p3, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 315
    :goto_2
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->a()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    .line 316
    const-string v4, "preview"

    const-string v5, "1"

    invoke-virtual {v3, v4, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 317
    const-string v4, "max_height"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 318
    const-string v1, "max_width"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 319
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Landroid/net/Uri;Lcom/facebook/ui/images/base/b;)Lcom/facebook/ui/images/b/ab;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/widget/images/UrlImage;->setMultiFetchImageParams(Lcom/facebook/ui/images/b/ab;)V

    .line 322
    return-void

    :cond_2
    move v0, v1

    .line 279
    goto/16 :goto_0

    .line 285
    :cond_3
    invoke-direct {p0, p3, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Landroid/graphics/Point;Z)Lcom/facebook/ui/images/d/h;

    move-result-object v0

    .line 286
    sget-object v2, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->B:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 304
    :cond_4
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->d()I

    move-result v0

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->e()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 305
    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->e()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->d()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 307
    iget v1, p3, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 308
    iget v0, p3, Landroid/graphics/Point;->x:I

    goto :goto_2

    .line 310
    :cond_5
    iget v0, p3, Landroid/graphics/Point;->x:I

    iget v1, p3, Landroid/graphics/Point;->y:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v1, v0

    goto :goto_2

    .line 313
    :cond_6
    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    iget v3, p3, Landroid/graphics/Point;->x:I

    iget v4, p3, Landroid/graphics/Point;->y:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-double v3, v3

    mul-double/2addr v0, v3

    double-to-int v0, v0

    move v1, v0

    goto :goto_2
.end method

.method static synthetic a()[I
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b:[I

    return-object v0
.end method

.method private b(ILcom/facebook/orca/attachments/ImageAttachmentData;)I
    .locals 2

    .prologue
    .line 541
    int-to-float v0, p1

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->d()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {p2}, Lcom/facebook/orca/attachments/ImageAttachmentData;->e()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)I
    .locals 1

    .prologue
    .line 65
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->m:I

    return v0
.end method

.method private b(II)Landroid/graphics/Point;
    .locals 4

    .prologue
    .line 430
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 431
    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->g()Lcom/facebook/orca/attachments/f;

    move-result-object v1

    .line 434
    sget-object v2, Lcom/facebook/orca/attachments/f;->PORTRAIT:Lcom/facebook/orca/attachments/f;

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/attachments/f;->SQUARE:Lcom/facebook/orca/attachments/f;

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/attachments/f;->UNKNOWN:Lcom/facebook/orca/attachments/f;

    if-ne v1, v2, :cond_3

    .line 437
    :cond_0
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->s:I

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 438
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->r:I

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 439
    if-le v1, v2, :cond_1

    move v1, v2

    .line 442
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->c()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 443
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b(ILcom/facebook/orca/attachments/ImageAttachmentData;)I

    move-result v0

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 456
    :goto_0
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 457
    return-object v2

    .line 445
    :cond_2
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->s:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    .line 448
    :cond_3
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->s:I

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 449
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->q:I

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 450
    if-le v1, v2, :cond_4

    move v1, v2

    .line 453
    :cond_4
    invoke-direct {p0, v2, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(ILcom/facebook/orca/attachments/ImageAttachmentData;)I

    move-result v3

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 454
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b(ILcom/facebook/orca/attachments/ImageAttachmentData;)I

    move-result v0

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic b()[I
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->c:[I

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/google/common/a/es;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    return-object v0
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne v0, v4, :cond_0

    .line 199
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->removeAllViews()V

    .line 200
    iput v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    .line 202
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getImageDimensions()[Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    .line 204
    :goto_0
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    const/4 v3, 0x6

    if-ge v0, v3, :cond_1

    .line 205
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lcom/facebook/k;->orca_thread_view_url_image_with_upload_progress:I

    invoke-static {v0, v3, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 209
    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setShowProgressBar(Z)V

    .line 210
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v3}, Lcom/facebook/widget/images/UrlImage;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 211
    invoke-virtual {v0, v4}, Lcom/facebook/widget/images/UrlImage;->setClickable(Z)V

    .line 212
    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 213
    sget v3, Lcom/facebook/h;->orca_photo_placeholder_background_border:I

    invoke-virtual {v0, v3}, Lcom/facebook/widget/images/UrlImage;->setPlaceholderBackgroundResourceId(I)V

    .line 214
    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    invoke-virtual {p0, v0, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->addView(Landroid/view/View;I)V

    .line 215
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    goto :goto_0

    :cond_1
    move v3, v1

    .line 219
    :goto_1
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    if-ge v3, v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 220
    invoke-virtual {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    move-object v1, v2

    check-cast v1, Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 221
    invoke-direct {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(I)V

    .line 222
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 224
    :cond_2
    :goto_2
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->v:I

    if-ge v3, v0, :cond_3

    .line 225
    invoke-virtual {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 226
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    .line 227
    add-int/lit8 v3, v3, 0x1

    .line 228
    goto :goto_2

    .line 230
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->A:Lcom/facebook/orca/threadview/l;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/l;)V

    .line 231
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->requestLayout()V

    .line 232
    return-void
.end method

.method private c(II)V
    .locals 6

    .prologue
    const/high16 v1, 0x40000000    # 2.0f

    .line 461
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 463
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->o:I

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 465
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 466
    const/4 v0, 0x1

    .line 467
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v4, :cond_0

    .line 468
    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 469
    invoke-virtual {p0, v5, v2, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->measureChild(Landroid/view/View;II)V

    .line 467
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 471
    :cond_0
    const/4 v1, 0x4

    if-ne v4, v1, :cond_1

    .line 472
    const/4 v0, 0x2

    .line 474
    :cond_1
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->o:I

    mul-int/2addr v1, v0

    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/lit8 v0, v0, -0x1

    mul-int/2addr v0, v2

    add-int/2addr v0, v1

    invoke-static {v0, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    .line 477
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/2addr v0, v1

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    .line 480
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/facebook/orca/photos/b/ab;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->j:Lcom/facebook/orca/photos/b/ab;

    return-object v0
.end method

.method private d(II)V
    .locals 7

    .prologue
    const/high16 v1, 0x40000000    # 2.0f

    const/4 v6, 0x6

    .line 483
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 485
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 487
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 488
    const/4 v0, 0x1

    .line 489
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v4, :cond_0

    .line 490
    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 491
    invoke-virtual {p0, v5, v2, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->measureChild(Landroid/view/View;II)V

    .line 489
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 493
    :cond_0
    if-lt v4, v6, :cond_1

    .line 494
    const/4 v0, 0x2

    .line 496
    :cond_1
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    mul-int/2addr v1, v0

    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/lit8 v0, v0, -0x1

    mul-int/2addr v0, v2

    add-int/2addr v0, v1

    invoke-static {v0, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    .line 499
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    mul-int/lit8 v0, v0, 0x3

    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    .line 502
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)Lcom/facebook/common/executors/a;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->i:Lcom/facebook/common/executors/a;

    return-object v0
.end method

.method private e(II)V
    .locals 6

    .prologue
    const/4 v0, 0x2

    const/high16 v5, 0x40000000    # 2.0f

    .line 506
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 508
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->o:I

    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 510
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 511
    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 512
    invoke-virtual {p0, v4, v2, v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->measureChild(Landroid/view/View;II)V

    .line 510
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 515
    :cond_0
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 517
    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 519
    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 520
    :goto_1
    if-ge v0, v3, :cond_1

    .line 521
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 522
    invoke-virtual {p0, v4, v1, v2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->measureChild(Landroid/view/View;II)V

    .line 520
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 525
    :cond_1
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->o:I

    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/2addr v0, v1

    invoke-static {v0, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    .line 528
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/2addr v0, v1

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    .line 529
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    mul-int/lit8 v1, v1, 0x3

    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    invoke-static {v1, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v1

    .line 532
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    .line 533
    return-void
.end method

.method private getImageDimensions()[Landroid/graphics/Point;
    .locals 9

    .prologue
    const v8, 0x7fffffff

    const/4 v7, 0x6

    const/4 v6, 0x2

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 251
    new-array v2, v1, [Landroid/graphics/Point;

    .line 252
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_8

    .line 253
    if-eq v1, v6, :cond_0

    const/4 v3, 0x4

    if-ne v1, v3, :cond_1

    .line 254
    :cond_0
    new-instance v3, Landroid/graphics/Point;

    iget v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    iget v5, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->o:I

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    aput-object v3, v2, v0

    .line 252
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 255
    :cond_1
    const/4 v3, 0x3

    if-eq v1, v3, :cond_2

    if-ne v1, v7, :cond_3

    .line 256
    :cond_2
    new-instance v3, Landroid/graphics/Point;

    iget v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    iget v5, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    aput-object v3, v2, v0

    goto :goto_1

    .line 257
    :cond_3
    const/4 v3, 0x5

    if-ne v1, v3, :cond_5

    .line 258
    if-ge v0, v6, :cond_4

    .line 259
    new-instance v3, Landroid/graphics/Point;

    iget v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->n:I

    iget v5, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->o:I

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    aput-object v3, v2, v0

    goto :goto_1

    .line 261
    :cond_4
    new-instance v3, Landroid/graphics/Point;

    iget v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    iget v5, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->p:I

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    aput-object v3, v2, v0

    goto :goto_1

    .line 264
    :cond_5
    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    if-eqz v3, :cond_6

    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    if-nez v3, :cond_7

    .line 265
    :cond_6
    invoke-direct {p0, v8, v8}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b(II)Landroid/graphics/Point;

    move-result-object v3

    aput-object v3, v2, v0

    goto :goto_1

    .line 268
    :cond_7
    new-instance v3, Landroid/graphics/Point;

    iget v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    iget v5, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    aput-object v3, v2, v0

    goto :goto_1

    .line 272
    :cond_8
    return-object v2
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threadview/l;)V
    .locals 4

    .prologue
    .line 174
    if-nez p1, :cond_1

    .line 192
    :cond_0
    return-void

    .line 178
    :cond_1
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->A:Lcom/facebook/orca/threadview/l;

    .line 179
    const/4 v0, 0x0

    move v2, v0

    .line 180
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    const/4 v0, 0x6

    if-ge v2, v0, :cond_0

    .line 182
    invoke-virtual {p0, v2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 183
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v1, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 184
    new-instance v3, Lcom/facebook/orca/threadview/cc;

    invoke-direct {v3, p0, p1, v1}, Lcom/facebook/orca/threadview/cc;-><init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/threadview/l;Lcom/facebook/orca/attachments/ImageAttachmentData;)V

    invoke-virtual {v0, v3}, Lcom/facebook/widget/images/UrlImage;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 181
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0
.end method

.method public getMessage()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->t:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 11

    .prologue
    .line 547
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 548
    const/4 v0, 0x1

    if-ne v6, v0, :cond_3

    .line 549
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 550
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/ImageAttachmentData;

    invoke-virtual {v1}, Lcom/facebook/orca/attachments/ImageAttachmentData;->g()Lcom/facebook/orca/attachments/f;

    move-result-object v1

    .line 551
    sget-object v2, Lcom/facebook/orca/attachments/f;->PORTRAIT:Lcom/facebook/orca/attachments/f;

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/attachments/f;->SQUARE:Lcom/facebook/orca/attachments/f;

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/attachments/f;->UNKNOWN:Lcom/facebook/orca/attachments/f;

    if-ne v1, v2, :cond_2

    .line 554
    :cond_0
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    .line 555
    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->r:I

    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 556
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/facebook/widget/images/UrlImage;->layout(IIII)V

    .line 590
    :cond_1
    :goto_0
    return-void

    .line 557
    :cond_2
    sget-object v2, Lcom/facebook/orca/attachments/f;->LANDSCAPE:Lcom/facebook/orca/attachments/f;

    if-ne v1, v2, :cond_1

    .line 558
    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    .line 559
    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->q:I

    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 560
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/facebook/widget/images/UrlImage;->layout(IIII)V

    goto :goto_0

    .line 563
    :cond_3
    const/4 v4, 0x0

    .line 564
    sub-int v3, p4, p2

    .line 565
    const/4 v0, 0x0

    .line 566
    const/4 v2, 0x0

    .line 567
    const/4 v1, 0x1

    move v5, v0

    move v10, v3

    move v3, v4

    move v4, v10

    .line 569
    :goto_1
    if-ge v5, v6, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v0, v0, v5

    iget v0, v0, Landroid/graphics/Point;->x:I

    if-lt v4, v0, :cond_1

    .line 570
    invoke-virtual {p0, v5}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    .line 571
    iget-object v7, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v7, v7, v5

    iget v7, v7, Landroid/graphics/Point;->x:I

    add-int/2addr v7, v3

    add-int v8, p3, v2

    iget-object v9, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v9, v9, v5

    iget v9, v9, Landroid/graphics/Point;->y:I

    add-int/2addr v8, v9

    invoke-virtual {v0, v3, v2, v7, v8}, Lcom/facebook/widget/images/UrlImage;->layout(IIII)V

    .line 576
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v0, v0, v5

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget v7, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/2addr v0, v7

    add-int/2addr v3, v0

    .line 577
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v0, v0, v5

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget v7, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/2addr v0, v7

    sub-int v0, v4, v0

    .line 578
    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v4, v4, v5

    iget v4, v4, Landroid/graphics/Point;->x:I

    if-lt v0, v4, :cond_6

    const/4 v4, 0x4

    if-ne v6, v4, :cond_4

    const/4 v4, 0x1

    if-ne v5, v4, :cond_4

    const/4 v4, 0x1

    if-eq v1, v4, :cond_6

    :cond_4
    const/4 v4, 0x6

    if-ne v6, v4, :cond_5

    const/4 v4, 0x2

    if-ne v5, v4, :cond_5

    const/4 v4, 0x1

    if-eq v1, v4, :cond_6

    :cond_5
    const/4 v4, 0x5

    if-ne v6, v4, :cond_7

    const/4 v4, 0x1

    if-ne v5, v4, :cond_7

    const/4 v4, 0x1

    if-ne v1, v4, :cond_7

    .line 582
    :cond_6
    sub-int v3, p4, p2

    .line 583
    const/4 v4, 0x0

    .line 584
    add-int/lit8 v0, v1, 0x1

    .line 585
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->z:[Landroid/graphics/Point;

    aget-object v1, v1, v5

    iget v1, v1, Landroid/graphics/Point;->y:I

    iget v7, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->k:I

    add-int/2addr v1, v7

    add-int/2addr v1, v2

    move v2, v3

    move v3, v4

    .line 587
    :goto_2
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move v4, v2

    move v2, v1

    move v1, v0

    .line 588
    goto :goto_1

    :cond_7
    move v10, v1

    move v1, v2

    move v2, v0

    move v0, v10

    goto :goto_2
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    const v2, 0x7fffffff

    const/4 v4, 0x6

    .line 348
    .line 351
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 352
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 353
    invoke-static {v1, p1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v1

    .line 354
    invoke-static {v0, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->resolveSize(II)I

    move-result v0

    .line 355
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    invoke-virtual {v2}, Lcom/google/common/a/es;->size()I

    move-result v2

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 359
    invoke-direct {p0, v2, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(II)V

    .line 361
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 362
    invoke-direct {p0, v1, v0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(IIII)V

    .line 370
    :cond_0
    :goto_0
    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->x:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->y:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->setMeasuredDimension(II)V

    .line 373
    return-void

    .line 363
    :cond_1
    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_3

    .line 364
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->c(II)V

    goto :goto_0

    .line 365
    :cond_3
    const/4 v3, 0x3

    if-eq v2, v3, :cond_4

    if-lt v2, v4, :cond_5

    .line 366
    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->d(II)V

    goto :goto_0

    .line 367
    :cond_5
    const/4 v3, 0x5

    if-ne v2, v3, :cond_0

    .line 368
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->e(II)V

    goto :goto_0
.end method

.method public setMessage(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->g:Lcom/facebook/orca/photos/b/h;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->h:Lcom/facebook/orca/threadview/cg;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/b/h;->a(Lcom/facebook/c/a/c;)Z

    .line 164
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->t:Lcom/facebook/messages/model/threads/Message;

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->d:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->u:Lcom/google/common/a/es;

    .line 166
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->c()V

    .line 167
    return-void
.end method
