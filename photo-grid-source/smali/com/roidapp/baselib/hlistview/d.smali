.class final Lcom/roidapp/baselib/hlistview/d;
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
    .line 2538
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/hlistview/p;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V
    .locals 0

    .prologue
    .line 2538
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/d;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 2542
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    if-ltz v0, :cond_0

    .line 2543
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v2, v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v0, v2

    .line 2544
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2546
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-nez v0, :cond_1

    .line 2548
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/d;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2549
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v3, v3, Lcom/roidapp/baselib/hlistview/AbsHListView;->am:I

    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-wide v4, v4, Lcom/roidapp/baselib/hlistview/AbsHListView;->an:J

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Landroid/view/View;IJ)Z

    move-result v0

    .line 2551
    :goto_0
    if-eqz v0, :cond_0

    .line 2552
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 2553
    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    .line 2560
    :cond_0
    :goto_1
    return-void

    .line 2556
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/d;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->setPressed(Z)V

    .line 2557
    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method
