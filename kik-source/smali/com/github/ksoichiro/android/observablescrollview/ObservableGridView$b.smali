.class public final Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filterable;
.implements Landroid/widget/WrapperListAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field static final a:Ljava/util/ArrayList;


# instance fields
.field b:Ljava/util/ArrayList;

.field c:Ljava/util/ArrayList;

.field d:Z

.field private final e:Landroid/database/DataSetObservable;

.field private final f:Landroid/widget/ListAdapter;

.field private g:I

.field private h:I

.field private final i:Z

.field private j:Z

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 552
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 566
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 550
    new-instance v2, Landroid/database/DataSetObservable;

    invoke-direct {v2}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->e:Landroid/database/DataSetObservable;

    .line 558
    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    .line 559
    const/4 v2, -0x1

    iput v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->h:I

    .line 562
    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->j:Z

    .line 564
    iput-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->k:Z

    .line 567
    iput-object p3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    .line 568
    instance-of v2, p3, Landroid/widget/Filterable;

    iput-boolean v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->i:Z

    .line 569
    if-nez p1, :cond_0

    .line 570
    sget-object v2, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a:Ljava/util/ArrayList;

    iput-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    .line 575
    :goto_0
    if-nez p2, :cond_1

    .line 576
    sget-object v2, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a:Ljava/util/ArrayList;

    iput-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    .line 580
    :goto_1
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-static {v2}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a(Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    invoke-static {v2}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a(Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_2
    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->d:Z

    .line 582
    return-void

    .line 572
    :cond_0
    iput-object p1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    goto :goto_0

    .line 578
    :cond_1
    iput-object p2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    goto :goto_1

    :cond_2
    move v0, v1

    .line 580
    goto :goto_2
.end method

.method private a()I
    .locals 4

    .prologue
    .line 671
    const/high16 v0, 0x3f800000    # 1.0f

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    int-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method private static a(Ljava/util/ArrayList;)Z
    .locals 2

    .prologue
    .line 618
    if-eqz p0, :cond_1

    .line 619
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;

    .line 620
    iget-boolean v0, v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;->c:Z

    if-nez v0, :cond_0

    .line 621
    const/4 v0, 0x0

    .line 625
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 585
    if-gtz p1, :cond_1

    .line 592
    :cond_0
    :goto_0
    return-void

    .line 588
    :cond_1
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    if-eq v0, p1, :cond_0

    .line 589
    iput p1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    .line 590
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->e:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    goto :goto_0
.end method

.method public final areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 667
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getCount()I
    .locals 2

    .prologue
    .line 658
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 659
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    mul-int/2addr v0, v1

    invoke-direct {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a()I

    move-result v1

    add-int/2addr v0, v1

    .line 661
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    mul-int/2addr v0, v1

    goto :goto_0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 895
    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->i:Z

    if-eqz v0, :cond_0

    .line 896
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    check-cast v0, Landroid/widget/Filterable;

    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    .line 898
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 702
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    mul-int/2addr v0, v2

    .line 703
    if-ge p1, v0, :cond_1

    .line 704
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    .line 705
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    div-int v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;

    iget-object v0, v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;->b:Ljava/lang/Object;

    .line 729
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    .line 707
    goto :goto_0

    .line 711
    :cond_1
    sub-int v2, p1, v0

    .line 712
    const/4 v0, 0x0

    .line 713
    iget-object v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v3, :cond_3

    .line 714
    invoke-direct {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a()I

    move-result v0

    .line 715
    if-ge v2, v0, :cond_3

    .line 716
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 717
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0, v2}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 719
    goto :goto_0

    .line 725
    :cond_3
    sub-int v0, v2, v0

    .line 726
    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v2, v0, v2

    if-nez v2, :cond_4

    .line 727
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;

    iget-object v0, v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_4
    move-object v0, v1

    .line 729
    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 735
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    mul-int/2addr v0, v1

    .line 736
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    if-lt p1, v0, :cond_0

    .line 737
    sub-int v0, p1, v0

    .line 738
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 739
    if-ge v0, v1, :cond_0

    .line 740
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    .line 743
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

    .line 814
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    mul-int v3, v0, v2

    .line 815
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-nez v0, :cond_4

    move v0, v1

    .line 816
    :goto_0
    const/4 v2, -0x2

    .line 817
    iget-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->j:Z

    if-eqz v4, :cond_1

    .line 819
    if-ge p1, v3, :cond_1

    .line 820
    if-nez p1, :cond_0

    .line 821
    iget-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->k:Z

    if-eqz v4, :cond_0

    .line 822
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, v0

    iget-object v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v2, v4

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    .line 825
    :cond_0
    iget v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v4, p1, v4

    if-eqz v4, :cond_1

    .line 826
    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    div-int v2, p1, v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    .line 832
    :cond_1
    sub-int v3, p1, v3

    .line 834
    iget-object v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v4, :cond_2

    .line 835
    invoke-direct {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a()I

    move-result v1

    .line 836
    if-ltz v3, :cond_2

    if-ge v3, v1, :cond_2

    .line 837
    iget-object v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v4}, Landroid/widget/ListAdapter;->getCount()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 838
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v2, v3}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v2

    .line 847
    :cond_2
    :goto_1
    iget-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->j:Z

    if-eqz v4, :cond_3

    .line 849
    sub-int v1, v3, v1

    .line 850
    if-ltz v1, :cond_3

    invoke-virtual {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->getCount()I

    move-result v3

    if-ge v1, v3, :cond_3

    iget v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v3, v1, v3

    if-eqz v3, :cond_3

    .line 851
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x1

    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    div-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    add-int v2, v0, v1

    .line 855
    :cond_3
    return v2

    .line 815
    :cond_4
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 840
    :cond_5
    iget-boolean v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->j:Z

    if-eqz v4, :cond_2

    .line 841
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 755
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    mul-int/2addr v0, v1

    .line 756
    if-ge p1, v0, :cond_2

    .line 757
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    div-int v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;

    iget-object v0, v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;->a:Landroid/view/ViewGroup;

    .line 759
    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v1, p1, v1

    if-nez v1, :cond_0

    move-object p2, v0

    .line 805
    :goto_0
    return-object p2

    .line 762
    :cond_0
    if-nez p2, :cond_1

    .line 763
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 767
    :cond_1
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 768
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    goto :goto_0

    .line 773
    :cond_2
    sub-int v1, p1, v0

    .line 774
    const/4 v0, 0x0

    .line 775
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v2, :cond_5

    .line 776
    invoke-direct {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a()I

    move-result v0

    .line 777
    if-ge v1, v0, :cond_5

    .line 778
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 779
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0, v1, p2, p3}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 781
    :cond_3
    if-nez p2, :cond_4

    .line 782
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 784
    :cond_4
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 785
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->h:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    goto :goto_0

    .line 791
    :cond_5
    sub-int v0, v1, v0

    .line 792
    invoke-virtual {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 793
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    div-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;

    iget-object v0, v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;->a:Landroid/view/ViewGroup;

    .line 795
    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v1, p1, v1

    if-nez v1, :cond_6

    move-object p2, v0

    .line 796
    goto :goto_0

    .line 798
    :cond_6
    if-nez p2, :cond_7

    .line 799
    new-instance p2, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 803
    :cond_7
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 804
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    goto :goto_0

    .line 808
    :cond_8
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw v0
.end method

.method public final getViewTypeCount()I
    .locals 3

    .prologue
    .line 865
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 866
    :goto_0
    iget-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->j:Z

    if-eqz v1, :cond_1

    .line 867
    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v1, v2

    .line 868
    iget-boolean v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->k:Z

    if-eqz v2, :cond_0

    .line 869
    add-int/lit8 v1, v1, 0x1

    .line 871
    :cond_0
    add-int/2addr v0, v1

    .line 874
    :cond_1
    return v0

    .line 865
    :cond_2
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    goto :goto_0
.end method

.method public final getWrappedAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 903
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 748
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 614
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isEnabled(I)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 677
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    mul-int/2addr v0, v3

    .line 678
    if-ge p1, v0, :cond_1

    .line 679
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->b:Ljava/util/ArrayList;

    iget v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    div-int v3, p1, v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;

    iget-boolean v0, v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;->c:Z

    if-eqz v0, :cond_0

    move v1, v2

    .line 695
    :cond_0
    :goto_0
    return v1

    .line 684
    :cond_1
    sub-int v3, p1, v0

    .line 686
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_2

    .line 687
    invoke-direct {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->a()I

    move-result v0

    .line 688
    if-ge v3, v0, :cond_3

    .line 689
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-ge v3, v0, :cond_0

    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0, v3}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v1, v2

    goto :goto_0

    :cond_2
    move v0, v1

    .line 694
    :cond_3
    sub-int v0, v3, v0

    .line 695
    iget v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    rem-int v3, v0, v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->c:Ljava/util/ArrayList;

    iget v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->g:I

    div-int/2addr v0, v4

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;

    iget-boolean v0, v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$a;->c:Z

    if-eqz v0, :cond_0

    move v1, v2

    goto :goto_0
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 879
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->e:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V

    .line 880
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 881
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 883
    :cond_0
    return-void
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 887
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->e:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V

    .line 888
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 889
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$b;->f:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 891
    :cond_0
    return-void
.end method
