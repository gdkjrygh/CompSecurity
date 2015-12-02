.class public Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;
.super Landroid/view/ViewGroup;
.source "RefreshableListViewContainer.java"

# interfaces
.implements Lcom/facebook/widget/refreshablelistview/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Landroid/widget/Scroller;

.field private c:Lcom/facebook/widget/refreshablelistview/d;

.field private d:I

.field private e:I

.field private f:Lcom/facebook/widget/refreshablelistview/c;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Lcom/facebook/common/o/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/o/a",
            "<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;

    sput-object v0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/high16 v1, -0x40800000    # -1.0f

    .line 71
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 43
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    .line 44
    iput v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    .line 53
    iput v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->j:I

    .line 56
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    .line 57
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    .line 58
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    .line 61
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->p:F

    .line 62
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->q:F

    .line 63
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->r:F

    .line 65
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->t:Z

    .line 66
    iput-boolean v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->u:Z

    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/high16 v1, -0x40800000    # -1.0f

    .line 76
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    .line 44
    iput v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    .line 53
    iput v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->j:I

    .line 56
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    .line 57
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    .line 58
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    .line 61
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->p:F

    .line 62
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->q:F

    .line 63
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->r:F

    .line 65
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->t:Z

    .line 66
    iput-boolean v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->u:Z

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 78
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/high16 v1, -0x40800000    # -1.0f

    .line 81
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    .line 44
    iput v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    .line 53
    iput v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->j:I

    .line 56
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    .line 57
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    .line 58
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    .line 61
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->p:F

    .line 62
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->q:F

    .line 63
    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->r:F

    .line 65
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->t:Z

    .line 66
    iput-boolean v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->u:Z

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 83
    return-void
.end method

.method private a(I)Lcom/facebook/widget/refreshablelistview/d;
    .locals 3

    .prologue
    .line 648
    if-nez p1, :cond_0

    .line 649
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->PULL_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    .line 651
    :goto_0
    return-object v0

    .line 650
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 651
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->PUSH_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    goto :goto_0

    .line 653
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown direction: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 86
    new-instance v0, Landroid/widget/Scroller;

    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    .line 87
    sget-object v0, Lcom/facebook/q;->PullToRefreshListView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 88
    sget v1, Lcom/facebook/q;->PullToRefreshListView_refreshDirection:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x40a00000    # 5.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    .line 90
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/common/o/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/o/e;

    const-class v1, Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Lcom/facebook/common/o/e;->b(Ljava/lang/Class;)Lcom/facebook/common/o/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->v:Lcom/facebook/common/o/a;

    .line 91
    sget-object v0, Lcom/facebook/q;->RefreshableListViewContainer:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 92
    sget v1, Lcom/facebook/q;->RefreshableListViewContainer_overflowAndListOverlap:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->j:I

    .line 94
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 96
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->k:I

    .line 98
    return-void
.end method

.method private a(Lcom/facebook/widget/refreshablelistview/d;)V
    .locals 1

    .prologue
    .line 599
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;Z)V

    .line 600
    return-void
.end method

.method private a(Lcom/facebook/widget/refreshablelistview/d;Z)V
    .locals 2

    .prologue
    .line 603
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    if-eq p1, v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    .line 605
    iput-object p1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    .line 606
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getHeaderView()Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    move-result-object v0

    .line 607
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->setDirection(I)V

    .line 608
    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v1, :cond_1

    .line 609
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    invoke-direct {p0, v1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(I)Lcom/facebook/widget/refreshablelistview/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->setState(Lcom/facebook/widget/refreshablelistview/d;)V

    .line 614
    :goto_0
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->f:Lcom/facebook/widget/refreshablelistview/c;

    if-eqz v0, :cond_0

    .line 615
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->f:Lcom/facebook/widget/refreshablelistview/c;

    invoke-virtual {v0, p2}, Lcom/facebook/widget/refreshablelistview/c;->a(Z)V

    .line 618
    :cond_0
    return-void

    .line 611
    :cond_1
    invoke-virtual {v0, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->setState(Lcom/facebook/widget/refreshablelistview/d;)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 621
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v2, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v2, :cond_2

    .line 622
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->i:I

    add-int/2addr v0, v2

    int-to-float v0, v0

    .line 623
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    div-float/2addr v2, v0

    const/high16 v3, 0x44960000    # 1200.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    const/16 v3, 0x12c

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 625
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    float-to-int v2, v2

    .line 626
    const v3, 0x3d4ccccd    # 0.05f

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 627
    if-ge v2, v0, :cond_0

    .line 628
    mul-int v3, v5, v2

    div-int v5, v3, v0

    .line 630
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    neg-int v4, v2

    move v3, v1

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 631
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->invalidate()V

    .line 645
    :cond_1
    :goto_0
    return-void

    .line 632
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v2, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v2, :cond_1

    .line 633
    if-nez p1, :cond_3

    .line 634
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    float-to-int v2, v0

    .line 636
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-nez v0, :cond_4

    .line 637
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    sub-int v4, v0, v2

    .line 641
    :goto_1
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    const/16 v5, 0x1f4

    move v3, v1

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 643
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->invalidate()V

    goto :goto_0

    .line 639
    :cond_4
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    neg-int v0, v0

    sub-int v4, v0, v2

    goto :goto_1
.end method

.method private a(F)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 338
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1

    .line 350
    :cond_0
    :goto_0
    return v0

    .line 340
    :cond_1
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-nez v2, :cond_3

    .line 341
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 342
    cmpl-float v2, p1, v3

    if-gtz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 344
    goto :goto_0

    .line 346
    :cond_3
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-ne v2, v0, :cond_5

    .line 347
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 348
    cmpg-float v2, p1, v3

    if-ltz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v1

    .line 350
    goto :goto_0

    .line 353
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown direction: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    .line 358
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v1

    .line 359
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/widget/AbsListView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-nez v0, :cond_1

    .line 360
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 361
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 362
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getScrollX()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v0

    .line 363
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getScrollY()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v2, v0

    .line 364
    float-to-int v4, v3

    .line 365
    float-to-int v5, v2

    .line 367
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->v:Lcom/facebook/common/o/a;

    invoke-virtual {v0}, Lcom/facebook/common/o/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 370
    invoke-virtual {v1, v0}, Landroid/widget/AbsListView;->getHitRect(Landroid/graphics/Rect;)V

    .line 371
    invoke-virtual {v0, v4, v5}, Landroid/graphics/Rect;->contains(II)Z

    move-result v4

    iput-boolean v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->u:Z

    .line 372
    iget-object v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->v:Lcom/facebook/common/o/a;

    invoke-virtual {v4, v0}, Lcom/facebook/common/o/a;->a(Ljava/lang/Object;)V

    .line 376
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->u:Z

    if-eqz v0, :cond_1

    .line 378
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, v3, v0

    .line 379
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getTop()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    .line 380
    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->q:F

    .line 381
    iput v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->r:F

    .line 382
    invoke-virtual {p1, v0, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 383
    invoke-direct {p0, v1, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/widget/AbsListView;Landroid/view/MotionEvent;)Z

    move-result v0

    .line 386
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private a(Landroid/widget/AbsListView;Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 426
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/widget/AbsListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 431
    :goto_0
    return v0

    .line 427
    :catch_0
    move-exception v0

    .line 430
    sget-object v1, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a:Ljava/lang/Class;

    const-string v2, "Caught and ignoring ArrayIndexOutOfBoundsException"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 431
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b(F)F
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 522
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-nez v1, :cond_2

    .line 523
    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    .line 524
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    add-float/2addr v1, p1

    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    .line 525
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 526
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    int-to-float v1, v1

    sub-float p1, v0, v1

    .line 527
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    int-to-float v0, v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    .line 547
    :goto_0
    return p1

    :cond_0
    move p1, v0

    .line 529
    goto :goto_0

    .line 532
    :cond_1
    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    goto :goto_0

    .line 535
    :cond_2
    cmpg-float v1, p1, v0

    if-gez v1, :cond_4

    .line 536
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    sub-float/2addr v1, p1

    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    .line 537
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    .line 538
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    neg-float p1, v0

    .line 539
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    int-to-float v0, v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    goto :goto_0

    :cond_3
    move p1, v0

    .line 541
    goto :goto_0

    .line 544
    :cond_4
    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    goto :goto_0
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 400
    iget-boolean v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->s:Z

    if-eqz v0, :cond_1

    .line 422
    :cond_0
    :goto_0
    return-void

    .line 403
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->p:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 404
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->k:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 409
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v1

    .line 410
    invoke-virtual {v1}, Landroid/widget/AbsListView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Landroid/widget/AbsListView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-nez v0, :cond_0

    .line 411
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->k:I

    add-int/lit8 v0, v0, 0x1

    .line 412
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-ne v2, v5, :cond_2

    .line 413
    neg-int v0, v0

    .line 415
    :cond_2
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v2

    .line 416
    iget v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->q:F

    iget v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->r:F

    int-to-float v0, v0

    sub-float v0, v4, v0

    invoke-virtual {v2, v3, v0}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 417
    invoke-direct {p0, v1, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/widget/AbsListView;Landroid/view/MotionEvent;)Z

    .line 418
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->q:F

    iget v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->r:F

    invoke-virtual {v2, v0, v3}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 419
    invoke-direct {p0, v1, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/widget/AbsListView;Landroid/view/MotionEvent;)Z

    .line 420
    iput-boolean v5, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->s:Z

    goto :goto_0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 436
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    .line 438
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 439
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->invalidate()V

    .line 443
    :cond_0
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 458
    :cond_1
    :goto_0
    return-void

    .line 447
    :cond_2
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 448
    if-eqz v0, :cond_1

    .line 452
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    int-to-float v2, v0

    add-float/2addr v1, v2

    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    .line 454
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/AbsListView;->offsetTopAndBottom(I)V

    .line 455
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getHeaderView()Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->offsetTopAndBottom(I)V

    .line 456
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getOverScrollHeaderView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 457
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->invalidate()V

    goto :goto_0
.end method

.method private c(F)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 551
    const v0, 0x3f4ccccd    # 0.8f

    mul-float/2addr v0, p1

    .line 552
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    .line 554
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-nez v0, :cond_1

    .line 555
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    .line 559
    :goto_0
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_0

    .line 561
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-nez v0, :cond_2

    .line 562
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    .line 567
    :cond_0
    :goto_1
    return-void

    .line 557
    :cond_1
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    goto :goto_0

    .line 564
    :cond_2
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    neg-int v1, v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    goto :goto_1
.end method

.method private d()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 479
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v2

    .line 480
    iget v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_1

    .line 492
    :cond_0
    :goto_0
    return v0

    .line 484
    :cond_1
    invoke-virtual {v2}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v3

    if-lez v3, :cond_2

    move v0, v1

    .line 485
    goto :goto_0

    .line 487
    :cond_2
    invoke-virtual {v2, v1}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 488
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    if-gez v2, :cond_0

    move v0, v1

    .line 489
    goto :goto_0
.end method

.method private e()Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 496
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v4

    .line 497
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 517
    :goto_0
    return v2

    .line 501
    :cond_0
    invoke-virtual {v4}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    invoke-virtual {v4}, Landroid/widget/AbsListView;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_1

    move v2, v3

    .line 502
    goto :goto_0

    .line 504
    :cond_1
    invoke-virtual {v4}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v4, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 505
    if-nez v5, :cond_2

    move v2, v3

    .line 506
    goto :goto_0

    .line 508
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->v:Lcom/facebook/common/o/a;

    invoke-virtual {v0}, Lcom/facebook/common/o/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 509
    iget-object v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->v:Lcom/facebook/common/o/a;

    invoke-virtual {v1}, Lcom/facebook/common/o/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    .line 510
    invoke-virtual {v4, v1}, Landroid/widget/AbsListView;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 511
    invoke-virtual {v5, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 513
    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    iget v5, v1, Landroid/graphics/Rect;->bottom:I

    if-gt v4, v5, :cond_3

    .line 515
    :goto_1
    iget-object v3, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->v:Lcom/facebook/common/o/a;

    invoke-virtual {v3, v1}, Lcom/facebook/common/o/a;->a(Ljava/lang/Object;)V

    .line 516
    iget-object v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->v:Lcom/facebook/common/o/a;

    invoke-virtual {v1, v0}, Lcom/facebook/common/o/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move v2, v3

    .line 513
    goto :goto_1
.end method

.method private getHeaderView()Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;
    .locals 1

    .prologue
    .line 662
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    return-object v0
.end method

.method private getListView()Landroid/widget/AbsListView;
    .locals 1

    .prologue
    .line 666
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/AbsListView;

    return-object v0
.end method

.method private getOverScrollHeaderView()Landroid/view/View;
    .locals 1

    .prologue
    .line 658
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 574
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-eq v0, v1, :cond_0

    .line 575
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    .line 576
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Z)V

    .line 578
    :cond_0
    return-void
.end method

.method public a(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 461
    iput p2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->g:I

    .line 462
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 592
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_0

    .line 593
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    .line 594
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Z)V

    .line 596
    :cond_0
    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x1

    return v0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 236
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 237
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c()V

    .line 238
    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 144
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 149
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 159
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getDirection()I
    .locals 1

    .prologue
    .line 124
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    return v0
.end method

.method public getHeaderHeightExposed()F
    .locals 1

    .prologue
    .line 468
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    return v0
.end method

.method public getOnRefreshListener()Lcom/facebook/widget/refreshablelistview/c;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->f:Lcom/facebook/widget/refreshablelistview/c;

    return-object v0
.end method

.method public getState()Lcom/facebook/widget/refreshablelistview/d;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    return-object v0
.end method

.method protected onFinishInflate()V
    .locals 2

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/r;

    new-instance v1, Lcom/facebook/widget/refreshablelistview/a;

    invoke-direct {v1, p0}, Lcom/facebook/widget/refreshablelistview/a;-><init>(Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;)V

    invoke-interface {v0, v1}, Lcom/facebook/widget/r;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 113
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 243
    const/4 v0, 0x1

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 189
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getChildCount()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 232
    :goto_0
    return-void

    .line 193
    :cond_0
    const-string v0, "RefreshableListViewContainer.onLayout"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 194
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    if-nez v1, :cond_1

    .line 197
    sub-int v1, p5, p3

    .line 198
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v2

    sub-int v3, p4, p2

    invoke-virtual {v2, v5, v5, v3, v1}, Landroid/widget/AbsListView;->layout(IIII)V

    .line 201
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->j:I

    add-int/2addr v1, v5

    .line 202
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    sub-int v2, v1, v2

    .line 203
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getHeaderView()Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    move-result-object v3

    sub-int v4, p4, p2

    invoke-virtual {v3, v5, v2, v4, v1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->layout(IIII)V

    .line 207
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->i:I

    sub-int v1, v2, v1

    .line 208
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getOverScrollHeaderView()Landroid/view/View;

    move-result-object v3

    sub-int v4, p4, p2

    invoke-virtual {v3, v5, v1, v4, v2}, Landroid/view/View;->layout(IIII)V

    .line 229
    :goto_1
    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->n:F

    .line 230
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c()V

    .line 231
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_0

    .line 209
    :cond_1
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 213
    sub-int v1, p5, p3

    .line 214
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getListView()Landroid/widget/AbsListView;

    move-result-object v2

    sub-int v3, p4, p2

    invoke-virtual {v2, v5, v5, v3, v1}, Landroid/widget/AbsListView;->layout(IIII)V

    .line 218
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    add-int/2addr v2, v1

    .line 219
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getHeaderView()Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    move-result-object v3

    sub-int v4, p4, p2

    invoke-virtual {v3, v5, v1, v4, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->layout(IIII)V

    .line 223
    iget v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->i:I

    add-int/2addr v1, v2

    .line 224
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getOverScrollHeaderView()Landroid/view/View;

    move-result-object v3

    sub-int v4, p4, p2

    invoke-virtual {v3, v5, v2, v4, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_1

    .line 226
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown direction: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onMeasure(II)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 164
    const-string v1, "RefreshableListViewContainer.onMeasure"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 165
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getChildCount()I

    move-result v4

    move v1, v0

    move v2, v0

    .line 170
    :goto_0
    if-ge v0, v4, :cond_0

    .line 171
    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 172
    invoke-virtual {p0, v5, p1, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->measureChild(Landroid/view/View;II)V

    .line 173
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 174
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 170
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 179
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 181
    invoke-static {v1, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->resolveSize(II)I

    move-result v1

    invoke-static {v0, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->resolveSize(II)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->setMeasuredDimension(II)V

    .line 182
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getHeaderView()Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    .line 183
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getOverScrollHeaderView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->i:I

    .line 184
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    .line 185
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 248
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 250
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 251
    packed-switch v0, :pswitch_data_0

    .line 328
    invoke-direct {p0, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/view/MotionEvent;)Z

    move-result v3

    .line 332
    :cond_0
    :goto_0
    iput v5, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->o:F

    .line 333
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c()V

    .line 334
    return v3

    .line 253
    :pswitch_0
    iput v5, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->p:F

    .line 254
    iput-boolean v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->s:Z

    .line 255
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 260
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/view/MotionEvent;)Z

    move-result v3

    goto :goto_0

    .line 263
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v3, Lcom/facebook/widget/refreshablelistview/d;->PULL_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v3, Lcom/facebook/widget/refreshablelistview/d;->PUSH_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v3, Lcom/facebook/widget/refreshablelistview/d;->BUFFERING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v3, :cond_4

    .line 266
    :cond_2
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    .line 267
    invoke-direct {p0, v1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Z)V

    .line 274
    :cond_3
    :goto_1
    iput v7, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    .line 275
    invoke-direct {p0, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/view/MotionEvent;)Z

    move-result v3

    goto :goto_0

    .line 268
    :cond_4
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v3, Lcom/facebook/widget/refreshablelistview/d;->RELEASE_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v3, :cond_5

    .line 269
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v0, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;Z)V

    .line 270
    invoke-direct {p0, v1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Z)V

    goto :goto_1

    .line 271
    :cond_5
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_3

    .line 272
    iput v7, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    goto :goto_1

    .line 279
    :pswitch_2
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->o:F

    sub-float v4, v5, v0

    .line 280
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v3, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v3, :cond_12

    .line 281
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->g:I

    if-nez v0, :cond_11

    .line 282
    invoke-direct {p0, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    move v3, v0

    move v0, v1

    .line 285
    :goto_2
    iget v6, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->g:I

    if-ne v6, v2, :cond_6

    invoke-direct {p0, v4}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(F)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 287
    sget-object v2, Lcom/facebook/widget/refreshablelistview/d;->BUFFERING:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    .line 290
    :cond_6
    :goto_3
    iget-object v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v6, Lcom/facebook/widget/refreshablelistview/d;->BUFFERING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v2, v6, :cond_10

    .line 291
    invoke-direct {p0, v4}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b(F)F

    move-result v0

    .line 292
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    iget v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->e:I

    int-to-float v4, v4

    cmpl-float v2, v2, v4

    if-ltz v2, :cond_a

    .line 293
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    invoke-direct {p0, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(I)Lcom/facebook/widget/refreshablelistview/d;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    :cond_7
    :goto_4
    move v2, v1

    .line 299
    :goto_5
    iget-object v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v6, Lcom/facebook/widget/refreshablelistview/d;->PULL_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-eq v4, v6, :cond_8

    iget-object v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v6, Lcom/facebook/widget/refreshablelistview/d;->RELEASE_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-eq v4, v6, :cond_8

    iget-object v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v6, Lcom/facebook/widget/refreshablelistview/d;->PUSH_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v4, v6, :cond_e

    .line 302
    :cond_8
    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c(F)V

    .line 303
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    cmpl-float v0, v0, v7

    if-nez v0, :cond_b

    .line 304
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    .line 319
    :cond_9
    :goto_6
    if-eqz v2, :cond_f

    .line 320
    invoke-direct {p0, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Landroid/view/MotionEvent;)Z

    move-result v3

    goto/16 :goto_0

    .line 294
    :cond_a
    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->l:F

    cmpl-float v2, v2, v7

    if-nez v2, :cond_7

    .line 295
    sget-object v2, Lcom/facebook/widget/refreshablelistview/d;->NORMAL:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    goto :goto_4

    .line 306
    :cond_b
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    int-to-float v2, v2

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_d

    .line 307
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->RELEASE_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    :cond_c
    :goto_7
    move v2, v1

    .line 311
    goto :goto_6

    .line 308
    :cond_d
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->m:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->h:I

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_c

    .line 309
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(I)Lcom/facebook/widget/refreshablelistview/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(Lcom/facebook/widget/refreshablelistview/d;)V

    goto :goto_7

    .line 313
    :cond_e
    iget-object v4, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v6, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v4, v6, :cond_9

    .line 314
    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->a(F)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 315
    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c(F)V

    move v2, v1

    .line 316
    goto :goto_6

    .line 321
    :cond_f
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->c:Lcom/facebook/widget/refreshablelistview/d;

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_0

    .line 322
    invoke-direct {p0, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->b(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    :cond_10
    move v2, v0

    move v0, v4

    goto :goto_5

    :cond_11
    move v0, v2

    move v3, v2

    goto/16 :goto_2

    :cond_12
    move v0, v2

    move v3, v2

    goto/16 :goto_3

    .line 251
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setDirection(I)V
    .locals 0

    .prologue
    .line 132
    iput p1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->d:I

    .line 133
    return-void
.end method

.method public setLastLoadedTime(J)V
    .locals 1

    .prologue
    .line 570
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getHeaderView()Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->setLastLoadedTime(J)V

    .line 571
    return-void
.end method

.method public setOnRefreshListener(Lcom/facebook/widget/refreshablelistview/c;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->f:Lcom/facebook/widget/refreshablelistview/c;

    .line 121
    return-void
.end method

.method public setOverflowListOverlap(I)V
    .locals 1

    .prologue
    .line 138
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewContainer;->j:I

    .line 140
    return-void
.end method
