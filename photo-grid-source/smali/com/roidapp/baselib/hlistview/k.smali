.class final Lcom/roidapp/baselib/hlistview/k;
.super Lcom/roidapp/baselib/hlistview/p;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:I

.field final synthetic b:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 1

    .prologue
    .line 2488
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/k;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/p;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V
    .locals 0

    .prologue
    .line 2488
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/k;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 2496
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/k;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-eqz v0, :cond_1

    .line 2510
    :cond_0
    :goto_0
    return-void

    .line 2498
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/k;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    .line 2499
    iget v1, p0, Lcom/roidapp/baselib/hlistview/k;->a:I

    .line 2500
    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/k;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v2, v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-lez v2, :cond_0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/k;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2503
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/k;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/k;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v3, v3, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int v3, v1, v3

    invoke-virtual {v2, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2506
    if-eqz v2, :cond_0

    .line 2507
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/k;->b:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    invoke-virtual {v3, v2, v1, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Landroid/view/View;IJ)Z

    goto :goto_0
.end method
