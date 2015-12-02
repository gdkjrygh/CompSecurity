.class public abstract Lcom/facebook/widget/listview/d;
.super Landroid/widget/ListView;
.source "DragSortListView.java"


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/view/WindowManager;

.field private g:Landroid/view/WindowManager$LayoutParams;

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Lcom/facebook/widget/listview/e;

.field private m:Lcom/facebook/widget/listview/g;

.field private n:I

.field private o:I

.field private p:I

.field private q:Landroid/view/GestureDetector;

.field private r:Landroid/graphics/Rect;

.field private s:Landroid/graphics/Bitmap;

.field private final t:I

.field private u:I

.field private v:Landroid/graphics/drawable/Drawable;

.field private w:Landroid/graphics/drawable/Drawable;

.field private x:J

.field private final y:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/listview/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 109
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, -0x1

    .line 112
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 73
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/listview/d;->r:Landroid/graphics/Rect;

    .line 76
    iput v4, p0, Lcom/facebook/widget/listview/d;->a:I

    .line 77
    iput v4, p0, Lcom/facebook/widget/listview/d;->b:I

    .line 78
    iput v4, p0, Lcom/facebook/widget/listview/d;->c:I

    .line 79
    iput v4, p0, Lcom/facebook/widget/listview/d;->u:I

    .line 81
    iput-object v3, p0, Lcom/facebook/widget/listview/d;->v:Landroid/graphics/drawable/Drawable;

    .line 82
    iput-object v3, p0, Lcom/facebook/widget/listview/d;->w:Landroid/graphics/drawable/Drawable;

    .line 114
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/listview/d;->t:I

    .line 116
    if-eqz p2, :cond_0

    .line 117
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lcom/facebook/q;->DragSortListView:[I

    invoke-virtual {v0, p2, v3, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 122
    sget v3, Lcom/facebook/q;->DragSortListView_normalHeight:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/facebook/widget/listview/d;->a:I

    .line 123
    iget v3, p0, Lcom/facebook/widget/listview/d;->a:I

    mul-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Lcom/facebook/widget/listview/d;->b:I

    .line 124
    sget v3, Lcom/facebook/q;->DragSortListView_grabberId:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Lcom/facebook/widget/listview/d;->c:I

    .line 125
    sget v3, Lcom/facebook/q;->DragSortListView_viewToHideWhileDragging:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Lcom/facebook/widget/listview/d;->u:I

    .line 127
    sget v3, Lcom/facebook/q;->DragSortListView_dragndropImageBackground:I

    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Lcom/facebook/widget/listview/d;->v:Landroid/graphics/drawable/Drawable;

    .line 129
    sget v3, Lcom/facebook/q;->DragSortListView_dragndropBackground:I

    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Lcom/facebook/widget/listview/d;->w:Landroid/graphics/drawable/Drawable;

    .line 131
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 134
    :cond_0
    iget v0, p0, Lcom/facebook/widget/listview/d;->a:I

    if-lez v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Item height must be > 0"

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 135
    iget v0, p0, Lcom/facebook/widget/listview/d;->c:I

    if-lez v0, :cond_2

    :goto_1
    const-string v0, "Grabber id must be valid"

    invoke-static {v1, v0}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 137
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/widget/listview/d;->y:Lcom/facebook/common/e/h;

    .line 138
    return-void

    :cond_1
    move v0, v2

    .line 134
    goto :goto_0

    :cond_2
    move v1, v2

    .line 135
    goto :goto_1
.end method

.method private a(I)I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 285
    iget v0, p0, Lcom/facebook/widget/listview/d;->j:I

    sub-int v0, p1, v0

    iget v2, p0, Lcom/facebook/widget/listview/d;->a:I

    div-int/lit8 v2, v2, 0x2

    sub-int v2, v0, v2

    .line 286
    invoke-direct {p0, v1, v2}, Lcom/facebook/widget/listview/d;->a(II)I

    move-result v0

    .line 287
    if-ltz v0, :cond_1

    .line 288
    iget v1, p0, Lcom/facebook/widget/listview/d;->i:I

    if-gt v0, v1, :cond_0

    .line 289
    add-int/lit8 v0, v0, 0x1

    .line 294
    :cond_0
    :goto_0
    return v0

    .line 291
    :cond_1
    if-gez v2, :cond_0

    move v0, v1

    .line 292
    goto :goto_0
.end method

.method private a(II)I
    .locals 3

    .prologue
    .line 272
    iget-object v1, p0, Lcom/facebook/widget/listview/d;->r:Landroid/graphics/Rect;

    .line 273
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getChildCount()I

    move-result v0

    .line 274
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 275
    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 276
    invoke-virtual {v2, v1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 277
    invoke-virtual {v1, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 278
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getFirstVisiblePosition()I

    move-result v1

    add-int/2addr v0, v1

    .line 281
    :goto_1
    return v0

    .line 274
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 281
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private a()V
    .locals 2

    .prologue
    .line 310
    const/4 v0, 0x0

    .line 311
    :goto_0
    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 312
    if-nez v1, :cond_0

    .line 313
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->layoutChildren()V

    .line 314
    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 315
    if-nez v1, :cond_0

    .line 321
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->e()V

    .line 322
    return-void

    .line 310
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private a(Landroid/graphics/Bitmap;II)V
    .locals 4

    .prologue
    const/4 v3, -0x2

    .line 502
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->c()V

    .line 504
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/widget/listview/d;->x:J

    .line 506
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    .line 507
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 508
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    iput p2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 509
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/facebook/widget/listview/d;->j:I

    sub-int v1, p3, v1

    iget v2, p0, Lcom/facebook/widget/listview/d;->k:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 511
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 512
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 513
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x198

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 517
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 518
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 520
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/widget/listview/d;->d:Landroid/widget/ImageView;

    .line 521
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->v:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 522
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/widget/listview/d;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 524
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 525
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 526
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 527
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 528
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 530
    :cond_1
    iput-object p1, p0, Lcom/facebook/widget/listview/d;->s:Landroid/graphics/Bitmap;

    .line 532
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v2, Landroid/view/WindowManager;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/facebook/widget/listview/d;->f:Landroid/view/WindowManager;

    .line 533
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->f:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 534
    iput-object v1, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    .line 535
    return-void
.end method

.method private b()V
    .locals 12

    .prologue
    const/16 v1, 0x50

    const/4 v3, 0x4

    const/4 v4, 0x0

    .line 337
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iget-wide v7, p0, Lcom/facebook/widget/listview/d;->x:J

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x32

    cmp-long v0, v5, v7

    if-gez v0, :cond_0

    .line 395
    :goto_0
    return-void

    .line 340
    :cond_0
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getDragSortListAdapter()Lcom/facebook/widget/listview/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/widget/listview/f;->d()I

    move-result v2

    .line 341
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getDragSortListAdapter()Lcom/facebook/widget/listview/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/widget/listview/f;->e()I

    move-result v8

    .line 344
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getBoundedDragPosition()I

    move-result v0

    .line 346
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getFirstVisiblePosition()I

    move-result v5

    sub-int/2addr v0, v5

    .line 347
    iget v5, p0, Lcom/facebook/widget/listview/d;->h:I

    iget v6, p0, Lcom/facebook/widget/listview/d;->i:I

    if-lt v5, v6, :cond_1

    iget v5, p0, Lcom/facebook/widget/listview/d;->h:I

    if-ge v5, v8, :cond_1

    .line 348
    add-int/lit8 v0, v0, 0x1

    .line 351
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getLastVisiblePosition()I

    move-result v5

    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getFirstVisiblePosition()I

    move-result v6

    sub-int/2addr v5, v6

    add-int/lit8 v9, v5, 0x1

    .line 352
    iget v5, p0, Lcom/facebook/widget/listview/d;->i:I

    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getFirstVisiblePosition()I

    move-result v6

    sub-int v10, v5, v6

    .line 354
    iget v5, p0, Lcom/facebook/widget/listview/d;->i:I

    if-ne v5, v8, :cond_2

    iget v5, p0, Lcom/facebook/widget/listview/d;->h:I

    if-lt v5, v8, :cond_2

    .line 356
    add-int/lit8 v0, v0, -0x1

    move v7, v0

    .line 362
    :goto_1
    if-ne v2, v8, :cond_3

    .line 364
    invoke-virtual {p0, v10}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget v2, p0, Lcom/facebook/widget/listview/d;->a:I

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/facebook/widget/listview/d;->a(Landroid/view/View;III)V

    goto :goto_0

    .line 357
    :cond_2
    iget v5, p0, Lcom/facebook/widget/listview/d;->i:I

    if-ne v5, v2, :cond_9

    iget v5, p0, Lcom/facebook/widget/listview/d;->h:I

    if-ge v5, v2, :cond_9

    .line 359
    add-int/lit8 v0, v0, 0x1

    move v7, v0

    goto :goto_1

    :cond_3
    move v6, v4

    .line 369
    :goto_2
    if-ge v6, v9, :cond_4

    .line 370
    invoke-virtual {p0, v6}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 371
    if-nez v11, :cond_5

    .line 394
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->layoutChildren()V

    goto :goto_0

    .line 374
    :cond_5
    iget v0, p0, Lcom/facebook/widget/listview/d;->a:I

    .line 378
    if-ne v6, v10, :cond_6

    .line 379
    const/4 v0, 0x1

    move v2, v3

    move v5, v0

    move v0, v1

    .line 388
    :goto_3
    invoke-virtual {p0, v11, v5, v0, v2}, Lcom/facebook/widget/listview/d;->a(Landroid/view/View;III)V

    .line 369
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_2

    .line 381
    :cond_6
    if-ne v6, v7, :cond_8

    .line 382
    iget v2, p0, Lcom/facebook/widget/listview/d;->b:I

    .line 383
    iget v0, p0, Lcom/facebook/widget/listview/d;->h:I

    if-lt v0, v8, :cond_7

    .line 384
    const/16 v0, 0x30

    move v5, v2

    move v2, v4

    goto :goto_3

    :cond_7
    move v0, v1

    move v5, v2

    move v2, v4

    goto :goto_3

    :cond_8
    move v2, v4

    move v5, v0

    move v0, v1

    goto :goto_3

    :cond_9
    move v7, v0

    goto :goto_1
.end method

.method private b(I)V
    .locals 1

    .prologue
    .line 298
    iget v0, p0, Lcom/facebook/widget/listview/d;->p:I

    div-int/lit8 v0, v0, 0x3

    if-lt p1, v0, :cond_0

    .line 299
    iget v0, p0, Lcom/facebook/widget/listview/d;->p:I

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/facebook/widget/listview/d;->n:I

    .line 301
    :cond_0
    iget v0, p0, Lcom/facebook/widget/listview/d;->p:I

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    if-gt p1, v0, :cond_1

    .line 302
    iget v0, p0, Lcom/facebook/widget/listview/d;->p:I

    mul-int/lit8 v0, v0, 0x2

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/facebook/widget/listview/d;->o:I

    .line 304
    :cond_1
    return-void
.end method

.method private b(II)V
    .locals 3

    .prologue
    .line 538
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Lcom/facebook/widget/listview/d;->j:I

    sub-int v1, p2, v1

    iget v2, p0, Lcom/facebook/widget/listview/d;->k:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 539
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->f:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/facebook/widget/listview/d;->g:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 540
    return-void
.end method

.method private c()V
    .locals 0

    .prologue
    .line 543
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->d()V

    .line 544
    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 550
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 551
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Landroid/view/WindowManager;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 552
    iget-object v1, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 553
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 554
    iput-object v2, p0, Lcom/facebook/widget/listview/d;->d:Landroid/widget/ImageView;

    .line 555
    iput-object v2, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    .line 557
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->s:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 558
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 559
    iput-object v2, p0, Lcom/facebook/widget/listview/d;->s:Landroid/graphics/Bitmap;

    .line 561
    :cond_1
    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 575
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 576
    invoke-virtual {p0, v0}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 578
    invoke-virtual {p0, v1}, Lcom/facebook/widget/listview/d;->a(Landroid/view/View;)V

    .line 575
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 580
    :cond_0
    return-void
.end method

.method private getBoundedDragPosition()I
    .locals 3

    .prologue
    .line 410
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getDragSortListAdapter()Lcom/facebook/widget/listview/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/widget/listview/f;->d()I

    move-result v1

    .line 411
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getDragSortListAdapter()Lcom/facebook/widget/listview/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/widget/listview/f;->e()I

    move-result v0

    .line 413
    iget v2, p0, Lcom/facebook/widget/listview/d;->h:I

    .line 414
    if-le v2, v0, :cond_0

    .line 420
    :goto_0
    return v0

    .line 416
    :cond_0
    if-ge v2, v1, :cond_1

    move v0, v1

    .line 417
    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method private getDragSortListAdapter()Lcom/facebook/widget/listview/f;
    .locals 1

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/f;

    return-object v0
.end method


# virtual methods
.method protected abstract a(Landroid/view/View;)V
.end method

.method protected a(Landroid/view/View;II)V
    .locals 1

    .prologue
    .line 398
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 406
    :cond_0
    :goto_0
    return-void

    .line 402
    :cond_1
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 403
    if-eqz v0, :cond_0

    .line 404
    invoke-virtual {v0, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method protected abstract a(Landroid/view/View;III)V
.end method

.method public final addFooterView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 175
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Footers are not supported with DragSortListView in conjunction with remove_mode"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V
    .locals 2

    .prologue
    .line 169
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Footers are not supported with DragSortListView in conjunction with remove_mode"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final addHeaderView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 164
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Headers are not supported with DragSortListView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
    .locals 2

    .prologue
    .line 159
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Headers are not supported with DragSortListView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract b(Landroid/view/View;)Z
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 565
    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    .line 566
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->d()V

    .line 567
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v0, 0x0

    .line 185
    iget-object v1, p0, Lcom/facebook/widget/listview/d;->l:Lcom/facebook/widget/listview/e;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/widget/listview/d;->m:Lcom/facebook/widget/listview/g;

    if-eqz v1, :cond_1

    .line 186
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 264
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_1
    return v0

    .line 188
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    .line 189
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 191
    invoke-virtual {p0, v1, v2}, Lcom/facebook/widget/listview/d;->pointToPosition(II)I

    move-result v3

    .line 192
    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 196
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getFirstVisiblePosition()I

    move-result v4

    sub-int v4, v3, v4

    invoke-virtual {p0, v4}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 198
    invoke-virtual {p0, v4}, Lcom/facebook/widget/listview/d;->b(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 199
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v5

    sub-int v5, v2, v5

    iput v5, p0, Lcom/facebook/widget/listview/d;->j:I

    .line 200
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v5

    float-to-int v5, v5

    sub-int/2addr v5, v2

    iput v5, p0, Lcom/facebook/widget/listview/d;->k:I

    .line 201
    iget v5, p0, Lcom/facebook/widget/listview/d;->c:I

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 202
    iget-object v6, p0, Lcom/facebook/widget/listview/d;->r:Landroid/graphics/Rect;

    .line 204
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v7

    iput v7, v6, Landroid/graphics/Rect;->left:I

    .line 205
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v7

    iput v7, v6, Landroid/graphics/Rect;->right:I

    .line 206
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v7

    iput v7, v6, Landroid/graphics/Rect;->top:I

    .line 207
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    iput v5, v6, Landroid/graphics/Rect;->bottom:I

    .line 209
    iget v5, v6, Landroid/graphics/Rect;->left:I

    if-gt v5, v1, :cond_5

    iget v5, v6, Landroid/graphics/Rect;->right:I

    if-gt v1, v5, :cond_5

    .line 210
    iget v1, p0, Lcom/facebook/widget/listview/d;->u:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 211
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v5

    .line 212
    if-nez v5, :cond_2

    .line 213
    const/4 v6, 0x4

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 215
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->isDrawingCacheEnabled()Z

    move-result v6

    .line 216
    invoke-virtual {v4}, Landroid/view/View;->willNotCacheDrawing()Z

    move-result v7

    .line 219
    const/4 v8, 0x1

    invoke-virtual {v4, v8}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 220
    invoke-virtual {v4, v0}, Landroid/view/View;->setWillNotCacheDrawing(Z)V

    .line 225
    :try_start_0
    invoke-virtual {v4}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v8

    .line 226
    if-nez v8, :cond_3

    .line 227
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->y:Lcom/facebook/common/e/h;

    const-string v1, "bookmark"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The drawing cache is null while dragging the item in the list! "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    invoke-virtual {v4, v6}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 236
    invoke-virtual {v4, v7}, Landroid/view/View;->setWillNotCacheDrawing(Z)V

    goto/16 :goto_0

    .line 233
    :cond_3
    :try_start_1
    invoke-virtual {v4}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v8

    .line 235
    invoke-virtual {v4, v6}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 236
    invoke-virtual {v4, v7}, Landroid/view/View;->setWillNotCacheDrawing(Z)V

    .line 239
    if-nez v5, :cond_4

    .line 240
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 243
    :cond_4
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 245
    invoke-virtual {p0, v1, v9}, Lcom/facebook/widget/listview/d;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 247
    iget v1, v1, Landroid/graphics/Rect;->left:I

    invoke-direct {p0, v8, v1, v2}, Lcom/facebook/widget/listview/d;->a(Landroid/graphics/Bitmap;II)V

    .line 248
    iput v3, p0, Lcom/facebook/widget/listview/d;->h:I

    .line 249
    iget v1, p0, Lcom/facebook/widget/listview/d;->h:I

    iput v1, p0, Lcom/facebook/widget/listview/d;->i:I

    .line 250
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/listview/d;->p:I

    .line 252
    iget v1, p0, Lcom/facebook/widget/listview/d;->t:I

    .line 253
    sub-int v3, v2, v1

    iget v4, p0, Lcom/facebook/widget/listview/d;->p:I

    div-int/lit8 v4, v4, 0x3

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p0, Lcom/facebook/widget/listview/d;->n:I

    .line 254
    add-int/2addr v1, v2

    iget v2, p0, Lcom/facebook/widget/listview/d;->p:I

    mul-int/lit8 v2, v2, 0x2

    div-int/lit8 v2, v2, 0x3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/widget/listview/d;->o:I

    goto/16 :goto_1

    .line 235
    :catchall_0
    move-exception v0

    invoke-virtual {v4, v6}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 236
    invoke-virtual {v4, v7}, Landroid/view/View;->setWillNotCacheDrawing(Z)V

    throw v0

    .line 258
    :cond_5
    iput-object v9, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    goto/16 :goto_0

    .line 186
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 425
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->q:Landroid/view/GestureDetector;

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->q:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 428
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->l:Lcom/facebook/widget/listview/e;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/widget/listview/d;->m:Lcom/facebook/widget/listview/g;

    if-eqz v0, :cond_9

    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_9

    .line 429
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 430
    packed-switch v0, :pswitch_data_0

    .line 496
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 498
    :goto_1
    return v0

    .line 433
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->r:Landroid/graphics/Rect;

    .line 434
    iget-object v1, p0, Lcom/facebook/widget/listview/d;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 435
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->c()V

    .line 436
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->m:Lcom/facebook/widget/listview/g;

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/facebook/widget/listview/d;->h:I

    iget v1, p0, Lcom/facebook/widget/listview/d;->i:I

    if-eq v0, v1, :cond_3

    .line 438
    iget-object v0, p0, Lcom/facebook/widget/listview/d;->m:Lcom/facebook/widget/listview/g;

    iget v1, p0, Lcom/facebook/widget/listview/d;->i:I

    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getBoundedDragPosition()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/widget/listview/g;->a(II)V

    .line 440
    :cond_3
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->a()V

    goto :goto_0

    .line 444
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 445
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 446
    invoke-direct {p0, v0, v2}, Lcom/facebook/widget/listview/d;->b(II)V

    .line 447
    invoke-direct {p0, v2}, Lcom/facebook/widget/listview/d;->a(I)I

    move-result v0

    .line 449
    if-ltz v0, :cond_2

    .line 450
    iget-object v3, p0, Lcom/facebook/widget/listview/d;->l:Lcom/facebook/widget/listview/e;

    if-eqz v3, :cond_4

    .line 451
    iget-object v3, p0, Lcom/facebook/widget/listview/d;->l:Lcom/facebook/widget/listview/e;

    iget v4, p0, Lcom/facebook/widget/listview/d;->h:I

    invoke-interface {v3, v4, v0}, Lcom/facebook/widget/listview/e;->a(II)V

    .line 453
    :cond_4
    iput v0, p0, Lcom/facebook/widget/listview/d;->h:I

    .line 455
    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->b()V

    .line 458
    invoke-direct {p0, v2}, Lcom/facebook/widget/listview/d;->b(I)V

    .line 460
    iget v0, p0, Lcom/facebook/widget/listview/d;->o:I

    if-le v2, v0, :cond_7

    .line 462
    iget v0, p0, Lcom/facebook/widget/listview/d;->p:I

    iget v3, p0, Lcom/facebook/widget/listview/d;->o:I

    add-int/2addr v0, v3

    div-int/lit8 v0, v0, 0x2

    if-le v2, v0, :cond_6

    const/16 v0, 0x10

    .line 466
    :goto_2
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getLastVisiblePosition()I

    move-result v2

    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getDragSortListAdapter()Lcom/facebook/widget/listview/f;

    move-result-object v3

    invoke-interface {v3}, Lcom/facebook/widget/listview/f;->e()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    if-ge v2, v3, :cond_b

    :goto_3
    move v2, v0

    .line 481
    :goto_4
    if-eqz v2, :cond_2

    .line 482
    iget v0, p0, Lcom/facebook/widget/listview/d;->p:I

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/facebook/widget/listview/d;->pointToPosition(II)I

    move-result v0

    .line 483
    const/4 v3, -0x1

    if-ne v0, v3, :cond_5

    .line 485
    iget v0, p0, Lcom/facebook/widget/listview/d;->p:I

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getDividerHeight()I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x40

    invoke-virtual {p0, v1, v0}, Lcom/facebook/widget/listview/d;->pointToPosition(II)I

    move-result v0

    .line 487
    :cond_5
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getFirstVisiblePosition()I

    move-result v1

    sub-int v1, v0, v1

    invoke-virtual {p0, v1}, Lcom/facebook/widget/listview/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 488
    if-eqz v1, :cond_2

    .line 489
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 490
    sub-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/listview/d;->setSelectionFromTop(II)V

    goto/16 :goto_0

    .line 462
    :cond_6
    const/4 v0, 0x4

    goto :goto_2

    .line 470
    :cond_7
    iget v0, p0, Lcom/facebook/widget/listview/d;->n:I

    if-ge v2, v0, :cond_a

    .line 472
    iget v0, p0, Lcom/facebook/widget/listview/d;->n:I

    div-int/lit8 v0, v0, 0x2

    if-ge v2, v0, :cond_8

    const/16 v0, -0x10

    .line 475
    :goto_5
    invoke-virtual {p0}, Lcom/facebook/widget/listview/d;->getFirstVisiblePosition()I

    move-result v2

    invoke-direct {p0}, Lcom/facebook/widget/listview/d;->getDragSortListAdapter()Lcom/facebook/widget/listview/f;

    move-result-object v3

    invoke-interface {v3}, Lcom/facebook/widget/listview/f;->d()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    if-le v2, v3, :cond_a

    move v2, v0

    .line 477
    goto :goto_4

    .line 472
    :cond_8
    const/4 v0, -0x4

    goto :goto_5

    .line 498
    :cond_9
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto/16 :goto_1

    :cond_a
    move v2, v1

    goto :goto_4

    :cond_b
    move v0, v1

    goto :goto_3

    .line 430
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .prologue
    .line 51
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/facebook/widget/listview/d;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/ListAdapter;)V
    .locals 2

    .prologue
    .line 150
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/facebook/widget/listview/f;

    if-nez v0, :cond_0

    .line 151
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "DragSortListView expects a DragSortListAdapter based adapter"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 155
    return-void
.end method

.method public setDragListener(Lcom/facebook/widget/listview/e;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/widget/listview/d;->l:Lcom/facebook/widget/listview/e;

    .line 142
    return-void
.end method

.method public setDropListener(Lcom/facebook/widget/listview/g;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/widget/listview/d;->m:Lcom/facebook/widget/listview/g;

    .line 146
    return-void
.end method
