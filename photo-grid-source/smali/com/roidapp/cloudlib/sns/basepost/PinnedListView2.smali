.class public Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;
.super Landroid/support/v7/widget/RecyclerView;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/a/c;


# instance fields
.field private final h:Landroid/graphics/Rect;

.field private final i:Landroid/graphics/PointF;

.field private j:I

.field private k:Landroid/view/View;

.field private l:Landroid/view/MotionEvent;

.field private m:Z

.field private n:Lcom/roidapp/cloudlib/sns/basepost/c;

.field private o:Lcom/roidapp/cloudlib/sns/basepost/c;

.field private p:I

.field private q:Landroid/view/View;

.field private r:I

.field private s:I

.field private t:Z

.field private u:Z

.field private final v:Landroid/support/v7/widget/ax;

.field private w:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 58
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    .line 59
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->i:Landroid/graphics/PointF;

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m:Z

    .line 147
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/a;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/basepost/a;-><init>(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->v:Landroid/support/v7/widget/ax;

    .line 577
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->w:I

    .line 38
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/content/Context;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    .line 59
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->i:Landroid/graphics/PointF;

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m:Z

    .line 147
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/a;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/basepost/a;-><init>(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->v:Landroid/support/v7/widget/ax;

    .line 577
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->w:I

    .line 43
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/content/Context;)V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    .line 59
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->i:Landroid/graphics/PointF;

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m:Z

    .line 147
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/a;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/basepost/a;-><init>(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->v:Landroid/support/v7/widget/ax;

    .line 577
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->w:I

    .line 48
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/content/Context;)V

    .line 49
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 207
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->s:I

    .line 208
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->j:I

    .line 210
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->u:Z

    .line 213
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->v:Landroid/support/v7/widget/ax;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/support/v7/widget/ax;)V

    .line 214
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/a/a;->a(Lcom/roidapp/cloudlib/sns/a/c;)V

    .line 215
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;III)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 34
    .line 3234
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m:Z

    if-eqz v0, :cond_1

    .line 3238
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->s:I

    div-int/lit8 v0, v0, 0x2

    .line 3240
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->q:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 3241
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    .line 3245
    :cond_0
    if-gtz p3, :cond_2

    .line 3246
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    .line 3303
    :cond_1
    :goto_0
    return-void

    .line 3251
    :cond_2
    if-ltz v0, :cond_3

    iget v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->s:I

    if-lt v0, v1, :cond_5

    .line 3253
    :cond_3
    if-gtz p1, :cond_4

    .line 3254
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    goto :goto_0

    .line 3258
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/basepost/c;->b:I

    if-eq v0, p1, :cond_5

    .line 3260
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    .line 3265
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-nez v0, :cond_6

    .line 3267
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->d(II)V

    .line 3270
    :cond_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-eqz v0, :cond_1

    .line 3275
    add-int/lit8 v0, p1, 0x1

    .line 3276
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/au;->y()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3277
    add-int/lit8 v1, p1, 0x1

    .line 3278
    if-ltz v1, :cond_8

    .line 3282
    sub-int/2addr v1, p2

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 3285
    if-eqz v1, :cond_7

    .line 3288
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/basepost/c;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->r:I

    add-int/2addr v2, v3

    .line 3292
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v1, v2

    .line 3294
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/basepost/c;->b:I

    if-ge v2, v0, :cond_7

    if-gez v1, :cond_7

    .line 3296
    iput v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    goto :goto_0

    .line 3299
    :cond_7
    iput v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    goto :goto_0

    .line 3305
    :cond_8
    iput v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    goto :goto_0
.end method

.method private a(Landroid/view/View;FF)Z
    .locals 4

    .prologue
    .line 507
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 511
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->r:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 513
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->r:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 514
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 515
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 516
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->h:Landroid/graphics/Rect;

    float-to-int v1, p2

    float-to-int v2, p3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->u:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->t:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)Z
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->t:Z

    return v0
.end method

.method private d(II)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v5, 0x0

    .line 315
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->o:Lcom/roidapp/cloudlib/sns/basepost/c;

    .line 316
    iput-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->o:Lcom/roidapp/cloudlib/sns/basepost/c;

    .line 319
    if-nez v0, :cond_7

    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/c;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/basepost/c;-><init>()V

    move-object v1, v0

    .line 321
    :goto_0
    sub-int v0, p1, p2

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->q:Landroid/view/View;

    .line 322
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->q:Landroid/view/View;

    if-nez v0, :cond_1

    .line 367
    :cond_0
    :goto_1
    return-void

    .line 325
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->q:Landroid/view/View;

    .line 1563
    instance-of v6, v0, Lcom/roidapp/baselib/c/y;

    if-eqz v6, :cond_2

    .line 1564
    check-cast v0, Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    .line 1567
    :cond_2
    if-nez v0, :cond_4

    move-object v6, v3

    .line 326
    :goto_2
    if-eqz v6, :cond_0

    .line 331
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 333
    iget v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 334
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 337
    if-nez v0, :cond_3

    move v0, v2

    .line 339
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v7/widget/au;->v()I

    move-result v7

    sub-int/2addr v3, v7

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v7/widget/au;->x()I

    move-result v7

    sub-int/2addr v3, v7

    .line 340
    if-le v4, v3, :cond_6

    .line 343
    :goto_3
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v7/widget/au;->u()I

    move-result v7

    sub-int/2addr v4, v7

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v7/widget/au;->w()I

    move-result v7

    sub-int/2addr v4, v7

    invoke-static {v4, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 344
    invoke-static {v3, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 345
    invoke-virtual {v6, v2, v0}, Landroid/view/View;->measure(II)V

    .line 346
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v6, v5, v5, v0, v2}, Landroid/view/View;->layout(IIII)V

    .line 347
    iput v5, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    .line 350
    iput-object v6, v1, Lcom/roidapp/cloudlib/sns/basepost/c;->a:Landroid/view/View;

    .line 351
    iput p1, v1, Lcom/roidapp/cloudlib/sns/basepost/c;->b:I

    .line 355
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_5

    .line 356
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->g()I

    move-result v0

    .line 358
    :goto_4
    sub-int v0, p1, v0

    iput v0, v1, Lcom/roidapp/cloudlib/sns/basepost/c;->c:I

    .line 360
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/al;->b(I)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/roidapp/cloudlib/sns/basepost/c;->d:J

    .line 363
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    goto/16 :goto_1

    .line 1571
    :cond_4
    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/b;

    invoke-interface {v0, v4}, Lcom/roidapp/cloudlib/sns/basepost/b;->a(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    goto/16 :goto_2

    :cond_5
    move v0, v5

    goto :goto_4

    :cond_6
    move v3, v4

    goto :goto_3

    :cond_7
    move-object v1, v0

    goto/16 :goto_0
.end method

.method private m()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 520
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k:Landroid/view/View;

    .line 521
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->l:Landroid/view/MotionEvent;

    if-eqz v0, :cond_0

    .line 522
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->l:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 523
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->l:Landroid/view/MotionEvent;

    .line 525
    :cond_0
    return-void
.end method

.method private n()V
    .locals 1

    .prologue
    .line 594
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    .line 595
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->s:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->r:I

    .line 596
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 601
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->s:I

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->r:I

    .line 602
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 579
    iput p1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->w:I

    .line 580
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 144
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m:Z

    .line 145
    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 416
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 417
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-eqz v0, :cond_0

    .line 424
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 431
    const/4 v0, 0x0

    iget v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->r:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 432
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/c;->a:Landroid/view/View;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getDrawingTime()J

    move-result-wide v2

    invoke-virtual {p0, p1, v0, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 435
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 437
    :cond_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v1, 0x1

    .line 447
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-nez v0, :cond_0

    .line 448
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 504
    :goto_0
    return v0

    .line 451
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 452
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 453
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    .line 455
    if-nez v3, :cond_1

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k:Landroid/view/View;

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/basepost/c;->a:Landroid/view/View;

    invoke-direct {p0, v4, v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/view/View;FF)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 461
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/basepost/c;->a:Landroid/view/View;

    iput-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k:Landroid/view/View;

    .line 462
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->i:Landroid/graphics/PointF;

    iput v0, v4, Landroid/graphics/PointF;->x:F

    .line 463
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->i:Landroid/graphics/PointF;

    iput v2, v4, Landroid/graphics/PointF;->y:F

    .line 466
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v4

    iput-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->l:Landroid/view/MotionEvent;

    .line 469
    :cond_1
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k:Landroid/view/View;

    if-eqz v4, :cond_a

    .line 470
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k:Landroid/view/View;

    invoke-direct {p0, v4, v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/view/View;FF)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 471
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 474
    :cond_2
    if-ne v3, v1, :cond_8

    .line 475
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2528
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-eqz v0, :cond_6

    .line 2539
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    .line 2540
    instance-of v2, v0, Lcom/roidapp/baselib/c/y;

    if-eqz v2, :cond_3

    .line 2541
    check-cast v0, Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    .line 2543
    :cond_3
    if-eqz v0, :cond_6

    .line 2545
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/basepost/c;->a:Landroid/view/View;

    .line 2546
    if-eqz v2, :cond_4

    .line 2547
    invoke-virtual {v2, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 2549
    :cond_4
    instance-of v2, v0, Lcom/roidapp/baselib/c/y;

    if-eqz v2, :cond_5

    .line 2550
    check-cast v0, Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    .line 2552
    :cond_5
    if-eqz v0, :cond_6

    .line 2553
    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/b;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/basepost/c;->c:I

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/b;->b_(I)V

    .line 477
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m()V

    :cond_7
    :goto_1
    move v0, v1

    .line 500
    goto/16 :goto_0

    .line 479
    :cond_8
    if-ne v3, v5, :cond_9

    .line 481
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m()V

    goto :goto_1

    .line 483
    :cond_9
    const/4 v0, 0x2

    if-ne v3, v0, :cond_7

    .line 484
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->i:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    sub-float v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->j:I

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_7

    .line 487
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 488
    invoke-virtual {v0, v5}, Landroid/view/MotionEvent;->setAction(I)V

    .line 489
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 490
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 493
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->l:Landroid/view/MotionEvent;

    invoke-super {p0, v0}, Landroid/support/v7/widget/RecyclerView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 494
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 495
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m()V

    goto :goto_1

    .line 504
    :cond_a
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public final j()Landroid/support/v7/widget/ax;
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->v:Landroid/support/v7/widget/ax;

    return-object v0
.end method

.method protected final k()V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->o:Lcom/roidapp/cloudlib/sns/basepost/c;

    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    .line 230
    :cond_0
    return-void
.end method

.method protected final l()V
    .locals 4

    .prologue
    .line 377
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->m:Z

    if-nez v0, :cond_1

    .line 411
    :cond_0
    :goto_0
    return-void

    .line 381
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    if-eqz v0, :cond_3

    .line 382
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget v1, v0, Lcom/roidapp/cloudlib/sns/basepost/c;->b:I

    .line 383
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 385
    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->p:I

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->r:I

    add-int/2addr v2, v3

    if-gez v2, :cond_2

    .line 387
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n()V

    .line 388
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    .line 389
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->l()I

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->d(II)V

    goto :goto_0

    .line 393
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n()V

    .line 395
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->l()I

    move-result v0

    sub-int v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 396
    if-eqz v0, :cond_0

    .line 397
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    .line 399
    iget v1, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->s:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n:Lcom/roidapp/cloudlib/sns/basepost/c;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/basepost/c;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    .line 400
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    goto :goto_0

    .line 409
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->n()V

    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 219
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView;->onDetachedFromWindow()V

    .line 220
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/a/a;->b(Lcom/roidapp/cloudlib/sns/a/c;)V

    .line 221
    return-void
.end method
