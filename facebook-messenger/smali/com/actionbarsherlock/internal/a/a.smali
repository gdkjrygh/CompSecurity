.class public Lcom/actionbarsherlock/internal/a/a;
.super Ljava/lang/Object;
.source "IcsListPopupWindow.java"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/PopupWindow;

.field private c:Landroid/widget/ListAdapter;

.field private d:Lcom/actionbarsherlock/internal/a/c;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:I

.field private k:Landroid/view/View;

.field private l:I

.field private m:Landroid/database/DataSetObserver;

.field private n:Landroid/view/View;

.field private o:Landroid/graphics/drawable/Drawable;

.field private p:Landroid/widget/AdapterView$OnItemClickListener;

.field private q:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private final r:Lcom/actionbarsherlock/internal/a/h;

.field private final s:Lcom/actionbarsherlock/internal/a/g;

.field private final t:Lcom/actionbarsherlock/internal/a/f;

.field private final u:Lcom/actionbarsherlock/internal/a/d;

.field private v:Landroid/os/Handler;

.field private w:Landroid/graphics/Rect;

.field private x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/4 v0, -0x2

    const/4 v1, 0x0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput v0, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    .line 46
    iput v0, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    .line 51
    const v0, 0x7fffffff

    iput v0, p0, Lcom/actionbarsherlock/internal/a/a;->j:I

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/actionbarsherlock/internal/a/a;->l:I

    .line 65
    new-instance v0, Lcom/actionbarsherlock/internal/a/h;

    invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/a/h;-><init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->r:Lcom/actionbarsherlock/internal/a/h;

    .line 66
    new-instance v0, Lcom/actionbarsherlock/internal/a/g;

    invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/a/g;-><init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->s:Lcom/actionbarsherlock/internal/a/g;

    .line 67
    new-instance v0, Lcom/actionbarsherlock/internal/a/f;

    invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/a/f;-><init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->t:Lcom/actionbarsherlock/internal/a/f;

    .line 68
    new-instance v0, Lcom/actionbarsherlock/internal/a/d;

    invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/a/d;-><init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->u:Lcom/actionbarsherlock/internal/a/d;

    .line 70
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->v:Landroid/os/Handler;

    .line 72
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    .line 84
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/a;->a:Landroid/content/Context;

    .line 85
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    .line 86
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 87
    return-void
.end method

.method private a(IIIII)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 445
    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    .line 446
    if-nez v3, :cond_1

    .line 447
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/c;->getListPaddingTop()I

    move-result v0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/a/c;->getListPaddingBottom()I

    move-result v1

    add-int p4, v0, v1

    .line 495
    :cond_0
    :goto_0
    return p4

    .line 451
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/c;->getListPaddingTop()I

    move-result v0

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/a/c;->getListPaddingBottom()I

    move-result v2

    add-int/2addr v0, v2

    .line 452
    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/a/c;->getDividerHeight()I

    move-result v2

    if-lez v2, :cond_5

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/a/c;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/a/c;->getDividerHeight()I

    move-result v2

    .line 460
    :goto_1
    const/4 v4, -0x1

    if-ne p3, v4, :cond_2

    invoke-interface {v3}, Landroid/widget/ListAdapter;->getCount()I

    move-result v3

    add-int/lit8 p3, v3, -0x1

    .line 462
    :cond_2
    :goto_2
    if-gt p2, p3, :cond_8

    .line 463
    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-interface {v3, p2, v4, v5}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 464
    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v4}, Lcom/actionbarsherlock/internal/a/c;->getCacheColorHint()I

    move-result v4

    if-eqz v4, :cond_3

    .line 465
    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v4}, Lcom/actionbarsherlock/internal/a/c;->getCacheColorHint()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    .line 468
    :cond_3
    invoke-direct {p0, v3, p2, p1}, Lcom/actionbarsherlock/internal/a/a;->a(Landroid/view/View;II)V

    .line 470
    if-lez p2, :cond_4

    .line 472
    add-int/2addr v0, v2

    .line 475
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v0, v3

    .line 477
    if-lt v0, p4, :cond_6

    .line 480
    if-ltz p5, :cond_0

    if-le p2, p5, :cond_0

    if-lez v1, :cond_0

    if-eq v0, p4, :cond_0

    move p4, v1

    goto :goto_0

    :cond_5
    move v2, v1

    .line 452
    goto :goto_1

    .line 488
    :cond_6
    if-ltz p5, :cond_7

    if-lt p2, p5, :cond_7

    move v1, v0

    .line 462
    :cond_7
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_8
    move p4, v0

    .line 495
    goto :goto_0
.end method

.method private a(Landroid/view/View;IZ)I
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 418
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 419
    invoke-virtual {p1, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 421
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 422
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 424
    iget v0, v1, Landroid/graphics/Rect;->bottom:I

    .line 425
    if-eqz p3, :cond_0

    .line 426
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 427
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 429
    :cond_0
    aget v3, v2, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    sub-int/2addr v0, v3

    sub-int/2addr v0, p2

    .line 430
    aget v2, v2, v5

    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int v1, v2, v1

    add-int/2addr v1, p2

    .line 433
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 434
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 435
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 436
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 439
    :cond_1
    return v0
.end method

.method static synthetic a(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/c;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    return-object v0
.end method

.method private a(Landroid/view/View;II)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 498
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/AbsListView$LayoutParams;

    .line 499
    if-nez v0, :cond_0

    .line 500
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(III)V

    .line 502
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 507
    :cond_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/a/c;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/a/c;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, v0, Landroid/widget/AbsListView$LayoutParams;->width:I

    invoke-static {p3, v1, v2}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 509
    iget v0, v0, Landroid/widget/AbsListView$LayoutParams;->height:I

    .line 511
    if-lez v0, :cond_1

    .line 512
    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 516
    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V

    .line 517
    return-void

    .line 514
    :cond_1
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/actionbarsherlock/internal/a/a;)I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/actionbarsherlock/internal/a/a;->j:I

    return v0
.end method

.method static synthetic c(Lcom/actionbarsherlock/internal/a/a;)Landroid/widget/PopupWindow;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method static synthetic d(Lcom/actionbarsherlock/internal/a/a;)Lcom/actionbarsherlock/internal/a/h;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->r:Lcom/actionbarsherlock/internal/a/h;

    return-object v0
.end method

.method static synthetic e(Lcom/actionbarsherlock/internal/a/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->v:Landroid/os/Handler;

    return-object v0
.end method

.method private f()Z
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic f(Lcom/actionbarsherlock/internal/a/a;)Z
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/a/a;->f()Z

    move-result v0

    return v0
.end method

.method private g()I
    .locals 8

    .prologue
    const/4 v3, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 295
    .line 297
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    if-nez v0, :cond_4

    .line 298
    iget-object v5, p0, Lcom/actionbarsherlock/internal/a/a;->a:Landroid/content/Context;

    .line 300
    new-instance v4, Lcom/actionbarsherlock/internal/a/c;

    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/a;->x:Z

    if-nez v0, :cond_3

    move v0, v2

    :goto_0
    invoke-direct {v4, v5, v0}, Lcom/actionbarsherlock/internal/a/c;-><init>(Landroid/content/Context;Z)V

    iput-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    .line 301
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/internal/a/c;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/internal/a/c;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 305
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->p:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/internal/a/c;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 306
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/a/c;->setFocusable(Z)V

    .line 307
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/a/c;->setFocusableInTouchMode(Z)V

    .line 308
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    new-instance v4, Lcom/actionbarsherlock/internal/a/b;

    invoke-direct {v4, p0}, Lcom/actionbarsherlock/internal/a/b;-><init>(Lcom/actionbarsherlock/internal/a/a;)V

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/internal/a/c;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 324
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->t:Lcom/actionbarsherlock/internal/a/f;

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/internal/a/c;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 326
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->q:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v0, :cond_1

    .line 327
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->q:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/internal/a/c;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 330
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    .line 332
    iget-object v6, p0, Lcom/actionbarsherlock/internal/a/a;->k:Landroid/view/View;

    .line 333
    if-eqz v6, :cond_a

    .line 336
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 337
    invoke-virtual {v4, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 339
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v3, v1, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 343
    iget v7, p0, Lcom/actionbarsherlock/internal/a/a;->l:I

    packed-switch v7, :pswitch_data_0

    .line 360
    :goto_1
    iget v0, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    const/high16 v5, -0x80000000

    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 362
    invoke-virtual {v6, v0, v1}, Landroid/view/View;->measure(II)V

    .line 364
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 365
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    iget v6, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v5, v6

    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v5

    .line 371
    :goto_2
    iget-object v5, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v5, v4}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    move v6, v0

    .line 386
    :goto_3
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 387
    if-eqz v0, :cond_8

    .line 388
    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 389
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v4

    .line 393
    iget-boolean v4, p0, Lcom/actionbarsherlock/internal/a/a;->i:Z

    if-nez v4, :cond_2

    .line 394
    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    neg-int v4, v4

    iput v4, p0, Lcom/actionbarsherlock/internal/a/a;->h:I

    :cond_2
    move v7, v0

    .line 399
    :goto_4
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    const/4 v4, 0x2

    if-ne v0, v4, :cond_5

    .line 401
    :goto_5
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->n:Landroid/view/View;

    iget v4, p0, Lcom/actionbarsherlock/internal/a/a;->h:I

    invoke-direct {p0, v0, v4, v2}, Lcom/actionbarsherlock/internal/a/a;->a(Landroid/view/View;IZ)I

    move-result v0

    .line 404
    iget v2, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    if-ne v2, v3, :cond_6

    .line 405
    add-int/2addr v0, v7

    .line 414
    :goto_6
    return v0

    :cond_3
    move v0, v1

    .line 300
    goto/16 :goto_0

    .line 345
    :pswitch_0
    invoke-virtual {v4, v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 350
    :pswitch_1
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 351
    invoke-virtual {v4, v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 373
    :cond_4
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 374
    iget-object v4, p0, Lcom/actionbarsherlock/internal/a/a;->k:Landroid/view/View;

    .line 375
    if-eqz v4, :cond_9

    .line 376
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 378
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v4, v5

    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v4

    move v6, v0

    goto :goto_3

    :cond_5
    move v2, v1

    .line 399
    goto :goto_5

    .line 408
    :cond_6
    sub-int v4, v0, v6

    move-object v0, p0

    move v2, v1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lcom/actionbarsherlock/internal/a/a;->a(IIIII)I

    move-result v0

    .line 412
    if-lez v0, :cond_7

    add-int/2addr v6, v7

    .line 414
    :cond_7
    add-int/2addr v0, v6

    goto :goto_6

    :cond_8
    move v7, v1

    goto :goto_4

    :cond_9
    move v6, v1

    goto :goto_3

    :cond_a
    move-object v4, v0

    move v0, v1

    goto/16 :goto_2

    .line 343
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, -0x2

    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 157
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/a/a;->g()I

    move-result v5

    .line 162
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/a/a;->f()Z

    move-result v2

    .line 165
    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 166
    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    if-ne v3, v0, :cond_2

    move v4, v0

    .line 176
    :goto_0
    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    if-ne v3, v0, :cond_8

    .line 179
    if-eqz v2, :cond_4

    .line 180
    :goto_1
    if-eqz v2, :cond_6

    .line 181
    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    if-ne v3, v0, :cond_5

    :goto_2
    invoke-virtual {v2, v0, v1}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    .line 196
    :cond_0
    :goto_3
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v7}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 198
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->n:Landroid/view/View;

    iget v2, p0, Lcom/actionbarsherlock/internal/a/a;->g:I

    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->h:I

    invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 243
    :cond_1
    :goto_4
    return-void

    .line 170
    :cond_2
    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    if-ne v3, v6, :cond_3

    .line 171
    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->n:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v4

    goto :goto_0

    .line 173
    :cond_3
    iget v4, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    goto :goto_0

    :cond_4
    move v5, v0

    .line 179
    goto :goto_1

    :cond_5
    move v0, v1

    .line 181
    goto :goto_2

    .line 185
    :cond_6
    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    if-ne v3, v0, :cond_7

    move v1, v0

    :cond_7
    invoke-virtual {v2, v1, v0}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    goto :goto_3

    .line 190
    :cond_8
    iget v0, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    if-eq v0, v6, :cond_0

    .line 193
    iget v5, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    goto :goto_3

    .line 201
    :cond_9
    iget v2, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    if-ne v2, v0, :cond_c

    move v2, v0

    .line 211
    :goto_5
    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    if-ne v3, v0, :cond_e

    move v1, v0

    .line 221
    :goto_6
    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v3, v2, v1}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    .line 226
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v7}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 227
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->s:Lcom/actionbarsherlock/internal/a/g;

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 230
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/a/a;->x:Z

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 232
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->n:Landroid/view/View;

    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->g:I

    iget v4, p0, Lcom/actionbarsherlock/internal/a/a;->h:I

    invoke-virtual {v1, v2, v3, v4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 234
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/a/c;->setSelection(I)V

    .line 236
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/a;->x:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/c;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 237
    :cond_a
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/a/a;->c()V

    .line 239
    :cond_b
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/a/a;->x:Z

    if-nez v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->u:Lcom/actionbarsherlock/internal/a/d;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    .line 204
    :cond_c
    iget v2, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    if-ne v2, v6, :cond_d

    .line 205
    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->n:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setWidth(I)V

    move v2, v1

    goto :goto_5

    .line 207
    :cond_d
    iget-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setWidth(I)V

    move v2, v1

    goto :goto_5

    .line 214
    :cond_e
    iget v3, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    if-ne v3, v6, :cond_f

    .line 215
    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_6

    .line 217
    :cond_f
    iget-object v3, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    iget v4, p0, Lcom/actionbarsherlock/internal/a/a;->e:I

    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_6
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 143
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 144
    if-eqz v0, :cond_0

    .line 145
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 146
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->w:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iput v0, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    .line 150
    :goto_0
    return-void

    .line 148
    :cond_0
    iput p1, p0, Lcom/actionbarsherlock/internal/a/a;->f:I

    goto :goto_0
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/a;->n:Landroid/view/View;

    .line 131
    return-void
.end method

.method public a(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/a;->p:Landroid/widget/AdapterView$OnItemClickListener;

    .line 154
    return-void
.end method

.method public a(Landroid/widget/ListAdapter;)V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->m:Landroid/database/DataSetObserver;

    if-nez v0, :cond_3

    .line 102
    new-instance v0, Lcom/actionbarsherlock/internal/a/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/actionbarsherlock/internal/a/e;-><init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->m:Landroid/database/DataSetObserver;

    .line 106
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    .line 107
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_1

    .line 108
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->m:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    if-eqz v0, :cond_2

    .line 112
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/a/c;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 114
    :cond_2
    return-void

    .line 103
    :cond_3
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->c:Landroid/widget/ListAdapter;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->m:Landroid/database/DataSetObserver;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    goto :goto_0
.end method

.method public a(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 265
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/a/a;->x:Z

    .line 122
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 123
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 248
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 250
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 251
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->k:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 253
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 254
    check-cast v0, Landroid/view/ViewGroup;

    .line 255
    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->k:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 259
    iput-object v2, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    .line 260
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/a/a;->r:Lcom/actionbarsherlock/internal/a/h;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 261
    return-void
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 269
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 272
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    .line 273
    if-eqz v0, :cond_0

    .line 275
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/a/c;->a(Lcom/actionbarsherlock/internal/a/c;Z)Z

    .line 277
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/c;->requestLayout()V

    .line 279
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public e()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/a;->d:Lcom/actionbarsherlock/internal/a/c;

    return-object v0
.end method
