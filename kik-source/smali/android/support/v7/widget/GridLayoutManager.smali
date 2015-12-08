.class public final Landroid/support/v7/widget/GridLayoutManager;
.super Landroid/support/v7/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/GridLayoutManager$LayoutParams;,
        Landroid/support/v7/widget/GridLayoutManager$a;,
        Landroid/support/v7/widget/GridLayoutManager$b;
    }
.end annotation


# static fields
.field static final a:I


# instance fields
.field b:Z

.field c:I

.field d:[I

.field e:[Landroid/view/View;

.field final f:Landroid/util/SparseIntArray;

.field final g:Landroid/util/SparseIntArray;

.field h:Landroid/support/v7/widget/GridLayoutManager$b;

.field final i:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 43
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    sput v0, Landroid/support/v7/widget/GridLayoutManager;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/GridLayoutManager;->b:Z

    .line 49
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    .line 60
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->f:Landroid/util/SparseIntArray;

    .line 61
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->g:Landroid/util/SparseIntArray;

    .line 62
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager$a;

    invoke-direct {v0}, Landroid/support/v7/widget/GridLayoutManager$a;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    .line 64
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->i:Landroid/graphics/Rect;

    .line 89
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/GridLayoutManager;->a(I)V

    .line 90
    return-void
.end method

.method private static a(III)I
    .locals 2

    .prologue
    .line 573
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    .line 581
    :cond_0
    :goto_0
    return p0

    .line 576
    :cond_1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 577
    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    .line 578
    :cond_2
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    goto :goto_0
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I
    .locals 3

    .prologue
    .line 355
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 356
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget v1, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    invoke-virtual {v0, p3, v1}, Landroid/support/v7/widget/GridLayoutManager$b;->c(II)I

    move-result v0

    .line 367
    :goto_0
    return v0

    .line 358
    :cond_0
    invoke-virtual {p1, p3}, Landroid/support/v7/widget/RecyclerView$m;->a(I)I

    move-result v0

    .line 359
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 364
    const-string v0, "GridLayoutManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot find span size for pre layout position. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 365
    const/4 v0, 0x0

    goto :goto_0

    .line 367
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget v2, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/GridLayoutManager$b;->c(II)I

    move-result v0

    goto :goto_0
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;IZ)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    .line 588
    if-eqz p4, :cond_0

    move v1, v2

    move v0, v4

    .line 597
    :goto_0
    iget v5, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    if-ne v5, v2, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->h()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 598
    iget v4, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    add-int/lit8 v4, v4, -0x1

    move v5, v3

    move v6, v4

    move v4, v0

    .line 604
    :goto_1
    if-eq v4, p3, :cond_3

    .line 605
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    aget-object v7, v0, v4

    .line 606
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    .line 607
    invoke-static {v7}, Landroid/support/v7/widget/GridLayoutManager;->e(Landroid/view/View;)I

    move-result v7

    invoke-direct {p0, p1, p2, v7}, Landroid/support/v7/widget/GridLayoutManager;->c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v7

    invoke-static {v0, v7}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;I)I

    .line 608
    if-ne v5, v3, :cond_2

    invoke-static {v0}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v7

    if-le v7, v2, :cond_2

    .line 609
    invoke-static {v0}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    sub-int v7, v6, v7

    invoke-static {v0, v7}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;I)I

    .line 613
    :goto_2
    invoke-static {v0}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v0

    mul-int/2addr v0, v5

    add-int/2addr v6, v0

    .line 604
    add-int v0, v4, v1

    move v4, v0

    goto :goto_1

    .line 593
    :cond_0
    add-int/lit8 v0, p3, -0x1

    move v1, v3

    move p3, v3

    .line 595
    goto :goto_0

    :cond_1
    move v5, v2

    move v6, v4

    move v4, v0

    .line 602
    goto :goto_1

    .line 611
    :cond_2
    invoke-static {v0, v6}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;I)I

    goto :goto_2

    .line 615
    :cond_3
    return-void
.end method

.method private a(Landroid/view/View;II)V
    .locals 4

    .prologue
    .line 563
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->i:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 564
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 565
    iget v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    iget-object v2, p0, Landroid/support/v7/widget/GridLayoutManager;->i:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iget v2, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->rightMargin:I

    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->i:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    invoke-static {p2, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;->a(III)I

    move-result v1

    .line 567
    iget v2, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->i:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    iget v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->i:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v3

    invoke-static {p3, v2, v0}, Landroid/support/v7/widget/GridLayoutManager;->a(III)I

    move-result v0

    .line 569
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V

    .line 570
    return-void
.end method

.method private b(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 371
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 372
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget v1, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    invoke-virtual {v0, p3, v1}, Landroid/support/v7/widget/GridLayoutManager$b;->b(II)I

    move-result v0

    .line 388
    :cond_0
    :goto_0
    return v0

    .line 374
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    .line 375
    if-ne v0, v1, :cond_0

    .line 378
    invoke-virtual {p1, p3}, Landroid/support/v7/widget/RecyclerView$m;->a(I)I

    move-result v0

    .line 379
    if-ne v0, v1, :cond_2

    .line 384
    const-string v0, "GridLayoutManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 386
    const/4 v0, 0x0

    goto :goto_0

    .line 388
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget v2, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/GridLayoutManager$b;->b(II)I

    move-result v0

    goto :goto_0
.end method

.method private c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 392
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 393
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    invoke-virtual {v0, p3}, Landroid/support/v7/widget/GridLayoutManager$b;->a(I)I

    move-result v0

    .line 409
    :cond_0
    :goto_0
    return v0

    .line 395
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    .line 396
    if-ne v0, v1, :cond_0

    .line 399
    invoke-virtual {p1, p3}, Landroid/support/v7/widget/RecyclerView$m;->a(I)I

    move-result v0

    .line 400
    if-ne v0, v1, :cond_2

    .line 405
    const-string v0, "GridLayoutManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 407
    const/4 v0, 0x1

    goto :goto_0

    .line 409
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/GridLayoutManager$b;->a(I)I

    move-result v0

    goto :goto_0
.end method

.method private static h(I)I
    .locals 1

    .prologue
    .line 555
    if-gez p0, :cond_0

    .line 556
    sget v0, Landroid/support/v7/widget/GridLayoutManager;->a:I

    .line 558
    :goto_0
    return v0

    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    if-nez v0, :cond_0

    .line 123
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    .line 128
    :goto_0
    return v0

    .line 125
    :cond_0
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    if-gtz v0, :cond_1

    .line 126
    const/4 v0, 0x0

    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v0

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 229
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 234
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 235
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 237
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method final a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;III)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 322
    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->i()V

    .line 325
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v5

    .line 326
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v6

    .line 327
    if-le p4, p3, :cond_0

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    move-object v4, v2

    .line 328
    :goto_1
    if-eq p3, p4, :cond_3

    .line 329
    invoke-virtual {p0, p3}, Landroid/support/v7/widget/GridLayoutManager;->d(I)Landroid/view/View;

    move-result-object v3

    .line 330
    invoke-static {v3}, Landroid/support/v7/widget/GridLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    .line 331
    if-ltz v0, :cond_6

    if-ge v0, p5, :cond_6

    .line 332
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/GridLayoutManager;->b(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v0

    .line 333
    if-nez v0, :cond_6

    .line 334
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 337
    if-nez v4, :cond_6

    move-object v0, v2

    .line 328
    :goto_2
    add-int/2addr p3, v1

    move-object v2, v0

    move-object v4, v3

    goto :goto_1

    .line 327
    :cond_0
    const/4 v0, -0x1

    move v1, v0

    goto :goto_0

    .line 340
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v0

    if-ge v0, v6, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v0

    if-ge v0, v5, :cond_4

    .line 342
    :cond_2
    if-nez v2, :cond_6

    move-object v0, v3

    move-object v3, v4

    .line 343
    goto :goto_2

    .line 350
    :cond_3
    if-eqz v2, :cond_5

    move-object v3, v2

    :cond_4
    :goto_3
    return-object v3

    :cond_5
    move-object v3, v4

    goto :goto_3

    :cond_6
    move-object v0, v2

    move-object v3, v4

    goto :goto_2
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget-object v0, v0, Landroid/support/v7/widget/GridLayoutManager$b;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 204
    return-void
.end method

.method public final a(I)V
    .locals 3

    .prologue
    .line 637
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    if-ne p1, v0, :cond_0

    .line 647
    :goto_0
    return-void

    .line 640
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/GridLayoutManager;->b:Z

    .line 641
    if-gtz p1, :cond_1

    .line 642
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Span count should be at least 1. Provided "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 645
    :cond_1
    iput p1, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    .line 646
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget-object v0, v0, Landroid/support/v7/widget/GridLayoutManager$b;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget-object v0, v0, Landroid/support/v7/widget/GridLayoutManager$b;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 199
    return-void
.end method

.method public final a(Landroid/support/v7/widget/GridLayoutManager$b;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    .line 254
    return-void
.end method

.method final a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/LinearLayoutManager$a;)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 300
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/LinearLayoutManager$a;)V

    .line 301
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->q()I

    move-result v0

    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->u()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->s()I

    move-result v3

    sub-int/2addr v0, v3

    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    array-length v3, v3

    iget v4, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    add-int/lit8 v4, v4, 0x1

    if-ne v3, v4, :cond_0

    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    iget-object v4, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    aget v3, v3, v4

    if-eq v3, v0, :cond_1

    :cond_0
    iget v3, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [I

    iput-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    :cond_1
    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    aput v2, v3, v2

    iget v3, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    div-int v4, v0, v3

    iget v3, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    rem-int v5, v0, v3

    move v0, v1

    move v1, v2

    :goto_1
    iget v3, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    if-gt v0, v3, :cond_3

    add-int v3, v1, v5

    if-lez v3, :cond_7

    iget v1, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    sub-int/2addr v1, v3

    if-ge v1, v5, :cond_7

    add-int/lit8 v1, v4, 0x1

    iget v6, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    sub-int/2addr v3, v6

    move v7, v1

    move v1, v3

    move v3, v7

    :goto_2
    add-int/2addr v2, v3

    iget-object v3, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    aput v2, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->r()I

    move-result v0

    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->v()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->t()I

    move-result v3

    sub-int/2addr v0, v3

    goto :goto_0

    .line 302
    :cond_3
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 303
    iget v0, p3, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/GridLayoutManager;->b(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v0

    :goto_3
    if-lez v0, :cond_4

    iget v0, p3, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    if-lez v0, :cond_4

    iget v0, p3, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p3, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    iget v0, p3, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/GridLayoutManager;->b(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v0

    goto :goto_3

    .line 305
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    array-length v0, v0

    iget v1, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    if-eq v0, v1, :cond_6

    .line 306
    :cond_5
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    .line 308
    :cond_6
    return-void

    :cond_7
    move v1, v3

    move v3, v4

    goto :goto_2
.end method

.method final a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/LinearLayoutManager$b;)V
    .locals 15

    .prologue
    .line 415
    move-object/from16 v0, p3

    iget v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    move v3, v2

    .line 417
    :goto_0
    const/4 v4, 0x0

    .line 418
    iget v2, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    .line 420
    if-nez v3, :cond_0

    .line 421
    move-object/from16 v0, p3

    iget v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-direct {p0, v0, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;->b(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v2

    .line 422
    move-object/from16 v0, p3

    iget v5, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-direct {p0, v0, v1, v5}, Landroid/support/v7/widget/GridLayoutManager;->c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v5

    .line 423
    add-int/2addr v2, v5

    .line 425
    :cond_0
    :goto_1
    iget v5, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    if-ge v4, v5, :cond_3

    move-object/from16 v0, p3

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager$c;->a(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v5

    if-eqz v5, :cond_3

    if-lez v2, :cond_3

    .line 426
    move-object/from16 v0, p3

    iget v5, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 427
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-direct {p0, v0, v1, v5}, Landroid/support/v7/widget/GridLayoutManager;->c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v6

    .line 428
    iget v7, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    if-le v6, v7, :cond_2

    .line 429
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Item at position "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " requires "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " spans but GridLayoutManager has only "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " spans."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 415
    :cond_1
    const/4 v2, 0x0

    move v3, v2

    goto :goto_0

    .line 433
    :cond_2
    sub-int/2addr v2, v6

    .line 434
    if-ltz v2, :cond_3

    .line 435
    move-object/from16 v0, p3

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager$c;->a(Landroid/support/v7/widget/RecyclerView$m;)Landroid/view/View;

    move-result-object v5

    .line 438
    if-eqz v5, :cond_3

    .line 439
    iget-object v6, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    aput-object v5, v6, v4

    .line 443
    add-int/lit8 v4, v4, 0x1

    .line 444
    goto :goto_1

    .line 446
    :cond_3
    if-nez v4, :cond_4

    .line 447
    const/4 v2, 0x1

    move-object/from16 v0, p4

    iput-boolean v2, v0, Landroid/support/v7/widget/LinearLayoutManager$b;->b:Z

    .line 552
    :goto_2
    return-void

    .line 451
    :cond_4
    const/4 v5, 0x0

    .line 454
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-direct {p0, v0, v1, v4, v3}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;IZ)V

    .line 455
    const/4 v2, 0x0

    move v6, v2

    :goto_3
    if-ge v6, v4, :cond_9

    .line 456
    iget-object v2, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    aget-object v7, v2, v6

    .line 457
    move-object/from16 v0, p3

    iget-object v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    if-nez v2, :cond_6

    .line 458
    if-eqz v3, :cond_5

    .line 459
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/GridLayoutManager;->c(Landroid/view/View;)V

    .line 471
    :goto_4
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    .line 472
    iget-object v8, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v9

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v10

    add-int/2addr v9, v10

    aget v8, v8, v9

    iget-object v9, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v10

    aget v9, v9, v10

    sub-int/2addr v8, v9

    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 476
    iget v9, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    const/4 v10, 0x1

    if-ne v9, v10, :cond_8

    .line 477
    iget v2, v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->height:I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager;->h(I)I

    move-result v2

    invoke-direct {p0, v7, v8, v2}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/view/View;II)V

    .line 481
    :goto_5
    iget-object v2, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2, v7}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v2

    .line 482
    if-le v2, v5, :cond_14

    .line 455
    :goto_6
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    move v5, v2

    goto :goto_3

    .line 461
    :cond_5
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/GridLayoutManager;->d(Landroid/view/View;)V

    goto :goto_4

    .line 464
    :cond_6
    if-eqz v3, :cond_7

    .line 465
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/view/View;)V

    goto :goto_4

    .line 467
    :cond_7
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/GridLayoutManager;->b(Landroid/view/View;)V

    goto :goto_4

    .line 479
    :cond_8
    iget v2, v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->width:I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager;->h(I)I

    move-result v2

    invoke-direct {p0, v7, v2, v8}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/view/View;II)V

    goto :goto_5

    .line 488
    :cond_9
    invoke-static {v5}, Landroid/support/v7/widget/GridLayoutManager;->h(I)I

    move-result v6

    .line 489
    const/4 v2, 0x0

    move v3, v2

    :goto_7
    if-ge v3, v4, :cond_c

    .line 490
    iget-object v2, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    aget-object v7, v2, v3

    .line 491
    iget-object v2, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2, v7}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v2

    if-eq v2, v5, :cond_a

    .line 492
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    .line 493
    iget-object v8, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v9

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v10

    add-int/2addr v9, v10

    aget v8, v8, v9

    iget-object v9, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v2

    aget v2, v9, v2

    sub-int v2, v8, v2

    const/high16 v8, 0x40000000    # 2.0f

    invoke-static {v2, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 497
    iget v8, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_b

    .line 498
    invoke-direct {p0, v7, v2, v6}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/view/View;II)V

    .line 489
    :cond_a
    :goto_8
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_7

    .line 500
    :cond_b
    invoke-direct {p0, v7, v6, v2}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/view/View;II)V

    goto :goto_8

    .line 505
    :cond_c
    move-object/from16 v0, p4

    iput v5, v0, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    .line 507
    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 508
    iget v8, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_10

    .line 509
    move-object/from16 v0, p3

    iget v3, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    const/4 v6, -0x1

    if-ne v3, v6, :cond_f

    .line 510
    move-object/from16 v0, p3

    iget v3, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 511
    sub-int v5, v3, v5

    move v6, v7

    .line 525
    :goto_9
    const/4 v7, 0x0

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v3

    move v3, v2

    :goto_a
    if-ge v8, v4, :cond_13

    .line 526
    iget-object v2, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    aget-object v9, v2, v8

    .line 527
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    .line 528
    iget v10, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    const/4 v11, 0x1

    if-ne v10, v11, :cond_12

    .line 529
    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->s()I

    move-result v3

    iget-object v7, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v10

    aget v7, v7, v10

    add-int/2addr v3, v7

    .line 530
    iget-object v7, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v7, v9}, Landroid/support/v7/widget/q;->d(Landroid/view/View;)I

    move-result v7

    add-int/2addr v7, v3

    .line 537
    :goto_b
    iget v10, v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->leftMargin:I

    add-int/2addr v10, v3

    iget v11, v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->topMargin:I

    add-int/2addr v11, v6

    iget v12, v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->rightMargin:I

    sub-int v12, v7, v12

    iget v13, v2, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->bottomMargin:I

    sub-int v13, v5, v13

    invoke-static {v9, v10, v11, v12, v13}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/view/View;IIII)V

    .line 546
    iget-object v10, v2, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v10}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v10

    if-nez v10, :cond_d

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 547
    :cond_d
    const/4 v2, 0x1

    move-object/from16 v0, p4

    iput-boolean v2, v0, Landroid/support/v7/widget/LinearLayoutManager$b;->c:Z

    .line 549
    :cond_e
    move-object/from16 v0, p4

    iget-boolean v2, v0, Landroid/support/v7/widget/LinearLayoutManager$b;->d:Z

    invoke-virtual {v9}, Landroid/view/View;->isFocusable()Z

    move-result v9

    or-int/2addr v2, v9

    move-object/from16 v0, p4

    iput-boolean v2, v0, Landroid/support/v7/widget/LinearLayoutManager$b;->d:Z

    .line 525
    add-int/lit8 v2, v8, 0x1

    move v8, v2

    goto :goto_a

    .line 513
    :cond_f
    move-object/from16 v0, p3

    iget v6, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 514
    add-int v3, v6, v5

    move v5, v6

    move v6, v7

    goto :goto_9

    .line 517
    :cond_10
    move-object/from16 v0, p3

    iget v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    const/4 v7, -0x1

    if-ne v2, v7, :cond_11

    .line 518
    move-object/from16 v0, p3

    iget v7, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 519
    sub-int v2, v7, v5

    move v5, v6

    move v6, v7

    goto :goto_9

    .line 521
    :cond_11
    move-object/from16 v0, p3

    iget v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 522
    add-int/2addr v5, v2

    move v14, v6

    move v6, v5

    move v5, v14

    goto/16 :goto_9

    .line 532
    :cond_12
    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->t()I

    move-result v5

    iget-object v6, p0, Landroid/support/v7/widget/GridLayoutManager;->d:[I

    invoke-static {v2}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a(Landroid/support/v7/widget/GridLayoutManager$LayoutParams;)I

    move-result v10

    aget v6, v6, v10

    add-int/2addr v6, v5

    .line 533
    iget-object v5, p0, Landroid/support/v7/widget/GridLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5, v9}, Landroid/support/v7/widget/q;->d(Landroid/view/View;)I

    move-result v5

    add-int/2addr v5, v6

    goto :goto_b

    .line 551
    :cond_13
    iget-object v2, p0, Landroid/support/v7/widget/GridLayoutManager;->e:[Landroid/view/View;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_14
    move v2, v5

    goto/16 :goto_6
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 8

    .prologue
    .line 146
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 147
    instance-of v1, v0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    if-nez v1, :cond_0

    .line 148
    invoke-super {p0, p3, p4}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 164
    :goto_0
    return-void

    :cond_0
    move-object v6, v0

    .line 151
    check-cast v6, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    .line 152
    iget-object v0, v6, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v2

    .line 153
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    if-nez v0, :cond_2

    .line 154
    invoke-virtual {v6}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a()I

    move-result v0

    invoke-virtual {v6}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b()I

    move-result v1

    const/4 v3, 0x1

    iget v4, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    const/4 v5, 0x1

    if-le v4, v5, :cond_1

    invoke-virtual {v6}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b()I

    move-result v4

    iget v5, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    :goto_1
    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->obtain(IIIIZZ)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setCollectionItemInfo(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    goto :goto_1

    .line 159
    :cond_2
    const/4 v3, 0x1

    invoke-virtual {v6}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a()I

    move-result v4

    invoke-virtual {v6}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b()I

    move-result v5

    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    invoke-virtual {v6}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b()I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    if-ne v0, v1, :cond_3

    const/4 v6, 0x1

    :goto_2
    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->obtain(IIIIZZ)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setCollectionItemInfo(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    goto :goto_2
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$LayoutParams;)Z
    .locals 1

    .prologue
    .line 243
    instance-of v0, p1, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    return v0
.end method

.method public final b(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 2

    .prologue
    .line 134
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 135
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    .line 140
    :goto_0
    return v0

    .line 137
    :cond_0
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    if-gtz v0, :cond_1

    .line 138
    const/4 v0, 0x0

    goto :goto_0

    .line 140
    :cond_1
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;I)I

    move-result v0

    goto :goto_0
.end method

.method public final b()Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 1

    .prologue
    .line 223
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    invoke-direct {v0}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;-><init>()V

    return-object v0
.end method

.method public final b(II)V
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget-object v0, v0, Landroid/support/v7/widget/GridLayoutManager$b;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 209
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 624
    iget v0, p0, Landroid/support/v7/widget/GridLayoutManager;->c:I

    return v0
.end method

.method public final c(II)V
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget-object v0, v0, Landroid/support/v7/widget/GridLayoutManager$b;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 214
    return-void
.end method

.method public final c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 168
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    invoke-virtual {p0}, Landroid/support/v7/widget/GridLayoutManager;->p()I

    move-result v3

    move v1, v2

    :goto_0
    if-ge v1, v3, :cond_0

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/GridLayoutManager;->d(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    iget-object v5, p0, Landroid/support/v7/widget/GridLayoutManager;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->b()I

    move-result v6

    invoke-virtual {v5, v4, v6}, Landroid/util/SparseIntArray;->put(II)V

    iget-object v5, p0, Landroid/support/v7/widget/GridLayoutManager;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager$LayoutParams;->a()I

    move-result v0

    invoke-virtual {v5, v4, v0}, Landroid/util/SparseIntArray;->put(II)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 171
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)V

    .line 175
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->g:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 176
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 177
    iput-boolean v2, p0, Landroid/support/v7/widget/GridLayoutManager;->b:Z

    .line 179
    :cond_1
    return-void
.end method

.method public final d(II)V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->h:Landroid/support/v7/widget/GridLayoutManager$b;

    iget-object v0, v0, Landroid/support/v7/widget/GridLayoutManager$b;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 219
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 820
    iget-object v0, p0, Landroid/support/v7/widget/GridLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/GridLayoutManager;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
