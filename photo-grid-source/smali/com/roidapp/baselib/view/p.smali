.class final Lcom/roidapp/baselib/view/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filterable;
.implements Landroid/widget/WrapperListAdapter;


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/view/n;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/view/n;",
            ">;"
        }
    .end annotation
.end field

.field c:Z

.field private final d:Landroid/database/DataSetObservable;

.field private final e:Landroid/widget/ListAdapter;

.field private f:I

.field private final g:Z

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/view/n;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/view/n;",
            ">;",
            "Landroid/widget/ListAdapter;",
            ")V"
        }
    .end annotation

    .prologue
    .line 320
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 300
    new-instance v0, Landroid/database/DataSetObservable;

    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/p;->d:Landroid/database/DataSetObservable;

    .line 303
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/baselib/view/p;->f:I

    .line 321
    iput-object p3, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    .line 322
    instance-of v0, p3, Landroid/widget/Filterable;

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/p;->g:Z

    .line 324
    if-nez p1, :cond_0

    .line 325
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "headerViewInfos cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 327
    :cond_0
    if-nez p2, :cond_1

    .line 328
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "footerViewInfos cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 330
    :cond_1
    iput-object p1, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    .line 331
    iput-object p2, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    .line 333
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/roidapp/baselib/view/p;->a(Ljava/util/ArrayList;)Z

    move-result v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/roidapp/baselib/view/p;->a(Ljava/util/ArrayList;)Z

    move-result v1

    and-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/p;->c:Z

    .line 334
    return-void
.end method

.method private a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/roidapp/baselib/view/q;
    .locals 2

    .prologue
    .line 517
    new-instance v0, Lcom/roidapp/baselib/view/q;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/baselib/view/q;-><init>(Lcom/roidapp/baselib/view/p;Landroid/content/Context;)V

    .line 518
    invoke-virtual {v0, p2}, Lcom/roidapp/baselib/view/q;->a(Landroid/view/View;)V

    .line 519
    return-object v0
.end method

.method private static a(Ljava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/view/n;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 360
    if-eqz p0, :cond_1

    .line 361
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/n;

    .line 362
    iget-boolean v0, v0, Lcom/roidapp/baselib/view/n;->d:Z

    if-nez v0, :cond_0

    .line 363
    const/4 v0, 0x0

    .line 367
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 651
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->d:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    .line 652
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 350
    if-gtz p1, :cond_0

    .line 351
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of columns must be 1 or more"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 353
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/view/p;->f:I

    if-eq v0, p1, :cond_1

    .line 354
    iput p1, p0, Lcom/roidapp/baselib/view/p;->f:I

    .line 1651
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->d:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    .line 357
    :cond_1
    return-void
.end method

.method public final areAllItemsEnabled()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 418
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    .line 419
    iget-boolean v1, p0, Lcom/roidapp/baselib/view/p;->c:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/roidapp/baselib/view/p;->j:I

    if-nez v1, :cond_1

    .line 421
    :cond_0
    :goto_0
    return v0

    .line 419
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getCount()I
    .locals 4

    .prologue
    .line 409
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_1

    .line 2337
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 410
    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    add-int/2addr v0, v1

    .line 2341
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 410
    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 2401
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    .line 2402
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v1, v2

    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/roidapp/baselib/view/p;->j:I

    .line 2404
    :cond_0
    iget v1, p0, Lcom/roidapp/baselib/view/p;->j:I

    .line 410
    add-int/2addr v0, v1

    .line 412
    :goto_0
    return v0

    .line 3337
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 412
    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v0, v1

    .line 3341
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 412
    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    goto :goto_0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 639
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/p;->g:Z

    if-eqz v0, :cond_0

    .line 640
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    check-cast v0, Landroid/widget/Filterable;

    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    .line 642
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 461
    .line 5337
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 461
    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v2, v0

    .line 462
    if-ge p1, v2, :cond_1

    .line 463
    iget v0, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    .line 464
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    div-int v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/n;

    iget-object v0, v0, Lcom/roidapp/baselib/view/n;->c:Ljava/lang/Object;

    .line 488
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    .line 466
    goto :goto_0

    .line 470
    :cond_1
    sub-int v3, p1, v2

    .line 471
    const/4 v0, 0x0

    .line 472
    iget-object v4, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v4, :cond_3

    .line 473
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 474
    if-ge v3, v0, :cond_2

    .line 475
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 477
    :cond_2
    sub-int/2addr v3, v0

    iget v4, p0, Lcom/roidapp/baselib/view/p;->j:I

    if-ge v3, v4, :cond_3

    move-object v0, v1

    .line 478
    goto :goto_0

    .line 5341
    :cond_3
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 484
    iget v3, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v1, v3

    .line 485
    sub-int v0, p1, v0

    sub-int/2addr v0, v2

    iget v2, p0, Lcom/roidapp/baselib/view/p;->j:I

    sub-int/2addr v0, v2

    .line 486
    if-lez v1, :cond_4

    if-ltz v0, :cond_4

    .line 487
    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int v1, p1, v1

    if-nez v1, :cond_4

    .line 488
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    div-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/n;

    iget-object v0, v0, Lcom/roidapp/baselib/view/n;->c:Ljava/lang/Object;

    goto :goto_0

    .line 492
    :cond_4
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 497
    .line 6337
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 497
    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v0, v1

    .line 498
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    if-lt p1, v0, :cond_0

    .line 499
    sub-int v0, p1, v0

    .line 500
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 501
    if-ge v0, v1, :cond_0

    .line 502
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    .line 505
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public final getItemViewType(I)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 585
    .line 8337
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 585
    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v2, v0

    .line 586
    if-ge p1, v2, :cond_1

    iget v0, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int v0, p1, v0

    if-eqz v0, :cond_1

    .line 588
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v0, -0x1

    .line 609
    :cond_0
    :goto_0
    return v1

    .line 592
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_3

    if-lt p1, v2, :cond_3

    .line 593
    sub-int v3, p1, v2

    .line 594
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 595
    if-ge v3, v0, :cond_2

    .line 596
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v1

    goto :goto_0

    .line 598
    :cond_2
    sub-int/2addr v3, v0

    iget v4, p0, Lcom/roidapp/baselib/view/p;->j:I

    if-ge v3, v4, :cond_4

    .line 599
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v1, v0, -0x1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 8341
    :cond_4
    iget-object v3, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 602
    iget v4, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v3, v4

    .line 603
    sub-int v0, p1, v0

    sub-int/2addr v0, v2

    iget v2, p0, Lcom/roidapp/baselib/view/p;->j:I

    sub-int/2addr v0, v2

    .line 604
    if-lez v3, :cond_5

    if-ltz v0, :cond_5

    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int/2addr v0, v2

    if-eqz v0, :cond_5

    .line 606
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v0, -0x1

    goto :goto_0

    .line 609
    :cond_5
    const/4 v1, -0x2

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 525
    .line 7337
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 525
    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v1, v0

    .line 526
    if-ge p1, v1, :cond_1

    .line 527
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    div-int v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/n;

    iget-object v0, v0, Lcom/roidapp/baselib/view/n;->b:Landroid/view/ViewGroup;

    .line 528
    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int v1, p1, v1

    if-nez v1, :cond_0

    .line 529
    iput-object v0, p0, Lcom/roidapp/baselib/view/p;->i:Landroid/view/View;

    .line 568
    :goto_0
    return-object v0

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->i:Landroid/view/View;

    invoke-direct {p0, p3, v0}, Lcom/roidapp/baselib/view/p;->a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/roidapp/baselib/view/q;

    move-result-object v0

    goto :goto_0

    .line 545
    :cond_1
    sub-int v2, p1, v1

    .line 546
    const/4 v0, 0x0

    .line 547
    iget-object v3, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v3, :cond_3

    .line 548
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 549
    if-ge v2, v0, :cond_2

    .line 550
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, v2, p2, p3}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 551
    iput-object v0, p0, Lcom/roidapp/baselib/view/p;->h:Landroid/view/View;

    goto :goto_0

    .line 554
    :cond_2
    sub-int/2addr v2, v0

    iget v3, p0, Lcom/roidapp/baselib/view/p;->j:I

    if-ge v2, v3, :cond_3

    .line 555
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->h:Landroid/view/View;

    invoke-direct {p0, p3, v0}, Lcom/roidapp/baselib/view/p;->a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/roidapp/baselib/view/q;

    move-result-object v0

    goto :goto_0

    .line 7341
    :cond_3
    iget-object v2, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 560
    iget v3, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v2, v3

    .line 561
    sub-int v0, p1, v0

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/roidapp/baselib/view/p;->j:I

    sub-int/2addr v0, v1

    .line 562
    if-lez v2, :cond_5

    if-ltz v0, :cond_5

    .line 563
    iget-object v1, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    iget v2, p0, Lcom/roidapp/baselib/view/p;->f:I

    div-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/n;

    iget-object v0, v0, Lcom/roidapp/baselib/view/n;->b:Landroid/view/ViewGroup;

    .line 564
    iget v1, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int v1, p1, v1

    if-nez v1, :cond_4

    .line 565
    iput-object v0, p0, Lcom/roidapp/baselib/view/p;->i:Landroid/view/View;

    goto :goto_0

    .line 568
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->i:Landroid/view/View;

    invoke-direct {p0, p3, v0}, Lcom/roidapp/baselib/view/p;->a(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/roidapp/baselib/view/q;

    move-result-object v0

    goto :goto_0

    .line 580
    :cond_5
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw v0
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 614
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 616
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    .line 618
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0
.end method

.method public final getWrappedAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 647
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 510
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 511
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    .line 513
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1337
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 346
    if-nez v0, :cond_1

    .line 1341
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 346
    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isEnabled(I)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 428
    .line 4337
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 428
    iget v3, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v3, v0

    .line 429
    if-ge p1, v3, :cond_1

    .line 430
    iget v0, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->a:Ljava/util/ArrayList;

    iget v3, p0, Lcom/roidapp/baselib/view/p;->f:I

    div-int v3, p1, v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/n;

    iget-boolean v0, v0, Lcom/roidapp/baselib/view/n;->d:Z

    if-eqz v0, :cond_0

    move v1, v2

    .line 451
    :cond_0
    :goto_0
    return v1

    .line 435
    :cond_1
    sub-int v4, p1, v3

    .line 437
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_4

    .line 438
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 439
    if-ge v4, v0, :cond_2

    .line 440
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, v4}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v1

    goto :goto_0

    .line 442
    :cond_2
    sub-int/2addr v4, v0

    iget v5, p0, Lcom/roidapp/baselib/view/p;->j:I

    if-lt v4, v5, :cond_0

    .line 4341
    :goto_1
    iget-object v4, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 448
    iget v5, p0, Lcom/roidapp/baselib/view/p;->f:I

    mul-int/2addr v4, v5

    .line 449
    sub-int v0, p1, v0

    sub-int/2addr v0, v3

    iget v3, p0, Lcom/roidapp/baselib/view/p;->j:I

    sub-int/2addr v0, v3

    .line 450
    if-lez v4, :cond_3

    if-ltz v0, :cond_3

    .line 451
    iget v3, p0, Lcom/roidapp/baselib/view/p;->f:I

    rem-int v3, p1, v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/roidapp/baselib/view/p;->b:Ljava/util/ArrayList;

    iget v4, p0, Lcom/roidapp/baselib/view/p;->f:I

    div-int/2addr v0, v4

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/n;

    iget-boolean v0, v0, Lcom/roidapp/baselib/view/n;->d:Z

    if-eqz v0, :cond_0

    move v1, v2

    goto :goto_0

    .line 455
    :cond_3
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw v0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 623
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->d:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V

    .line 624
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 625
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 627
    :cond_0
    return-void
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 631
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->d:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V

    .line 632
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 633
    iget-object v0, p0, Lcom/roidapp/baselib/view/p;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 635
    :cond_0
    return-void
.end method
