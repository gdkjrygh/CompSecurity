.class final Lcom/roidapp/baselib/hlistview/e;
.super Lcom/roidapp/baselib/hlistview/p;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 1

    .prologue
    .line 2513
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/p;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V
    .locals 0

    .prologue
    .line 2513
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/e;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 2517
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 2518
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v3, v3, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v0, v3

    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2519
    if-eqz v2, :cond_0

    .line 2520
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 2521
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v3, v3, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v4, v4, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    invoke-interface {v3, v4}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    .line 2524
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/e;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v3, v3, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v3, :cond_2

    .line 2525
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v3, v2, v0, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Landroid/view/View;IJ)Z

    move-result v0

    .line 2527
    :goto_0
    if-eqz v0, :cond_1

    .line 2528
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v3, -0x1

    iput v3, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 2529
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 2530
    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    .line 2535
    :cond_0
    :goto_1
    return-void

    .line 2532
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/e;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x2

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method
