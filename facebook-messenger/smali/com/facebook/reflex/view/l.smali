.class Lcom/facebook/reflex/view/l;
.super Ljava/lang/Object;
.source "ListView.java"

# interfaces
.implements Lcom/facebook/reflex/ah;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/h;

.field private b:Lcom/facebook/reflex/aj;


# direct methods
.method private constructor <init>(Lcom/facebook/reflex/view/h;)V
    .locals 1

    .prologue
    .line 560
    iput-object p1, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 561
    sget-object v0, Lcom/facebook/reflex/aj;->Idle:Lcom/facebook/reflex/aj;

    iput-object v0, p0, Lcom/facebook/reflex/view/l;->b:Lcom/facebook/reflex/aj;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/view/i;)V
    .locals 0

    .prologue
    .line 560
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/l;-><init>(Lcom/facebook/reflex/view/h;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/reflex/aj;FF)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 564
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->k(Lcom/facebook/reflex/view/h;)Lcom/facebook/common/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/b/a;->size()I

    move-result v4

    move v3, v1

    :goto_0
    if-ge v3, v4, :cond_0

    .line 565
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->k(Lcom/facebook/reflex/view/h;)Lcom/facebook/common/b/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/common/b/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/ah;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/reflex/ah;->a(Lcom/facebook/reflex/aj;FF)V

    .line 564
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 568
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->l(Lcom/facebook/reflex/view/h;)F

    move-result v0

    sub-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v3, v0

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v3, v5

    if-lez v0, :cond_4

    move v0, v2

    .line 569
    :goto_1
    if-eqz v0, :cond_2

    .line 570
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->m(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/l;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 571
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->m(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/reflex/view/c/l;->a(Lcom/facebook/reflex/aj;F)V

    .line 573
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0, p2}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;F)F

    .line 576
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->i(Lcom/facebook/reflex/view/h;)V

    .line 577
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getFirstVisiblePosition()I

    move-result v0

    .line 578
    iget-object v3, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v3}, Lcom/facebook/reflex/view/h;->getLastVisiblePosition()I

    move-result v3

    .line 579
    sub-int/2addr v3, v0

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v4}, Lcom/facebook/reflex/view/h;->getHeaderViewsCount()I

    move-result v4

    add-int/2addr v3, v4

    .line 580
    iget-object v4, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v4}, Lcom/facebook/reflex/view/h;->n(Lcom/facebook/reflex/view/h;)Lcom/facebook/widget/b/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/widget/b/b;->a()Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    iget-object v6, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v6}, Lcom/facebook/reflex/view/h;->e(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/s;

    move-result-object v6

    invoke-interface {v6}, Lcom/facebook/reflex/view/c/s;->a()I

    move-result v6

    invoke-interface {v4, v5, v0, v3, v6}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 583
    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/l;->b:Lcom/facebook/reflex/aj;

    if-eq v0, p1, :cond_3

    .line 584
    iput-object p1, p0, Lcom/facebook/reflex/view/l;->b:Lcom/facebook/reflex/aj;

    .line 586
    sget-object v0, Lcom/facebook/reflex/view/k;->a:[I

    iget-object v3, p0, Lcom/facebook/reflex/view/l;->b:Lcom/facebook/reflex/aj;

    invoke-virtual {v3}, Lcom/facebook/reflex/aj;->ordinal()I

    move-result v3

    aget v0, v0, v3

    packed-switch v0, :pswitch_data_0

    move v0, v1

    .line 597
    :goto_2
    iget-object v1, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v1}, Lcom/facebook/reflex/view/h;->n(Lcom/facebook/reflex/view/h;)Lcom/facebook/widget/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/widget/b/b;->a()Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/reflex/view/l;->a:Lcom/facebook/reflex/view/h;

    invoke-interface {v1, v2, v0}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 599
    :cond_3
    return-void

    :cond_4
    move v0, v1

    .line 568
    goto :goto_1

    :pswitch_0
    move v0, v1

    .line 589
    goto :goto_2

    :pswitch_1
    move v0, v2

    .line 592
    goto :goto_2

    .line 594
    :pswitch_2
    const/4 v0, 0x2

    goto :goto_2

    .line 586
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
