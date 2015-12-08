.class public final Lcom/roidapp/baselib/c/ac;
.super Landroid/support/v7/widget/ax;
.source "SourceFile"


# instance fields
.field private final a:Landroid/widget/AbsListView$OnScrollListener;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 21
    invoke-direct {p0}, Landroid/support/v7/widget/ax;-><init>()V

    .line 17
    iput v0, p0, Lcom/roidapp/baselib/c/ac;->b:I

    .line 18
    iput v0, p0, Lcom/roidapp/baselib/c/ac;->c:I

    .line 19
    iput v0, p0, Lcom/roidapp/baselib/c/ac;->d:I

    .line 22
    iput-object p1, p0, Lcom/roidapp/baselib/c/ac;->a:Landroid/widget/AbsListView$OnScrollListener;

    .line 23
    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 3

    .prologue
    .line 28
    packed-switch p2, :pswitch_data_0

    .line 39
    const/high16 v0, -0x80000000

    .line 42
    :goto_0
    iget-object v1, p0, Lcom/roidapp/baselib/c/ac;->a:Landroid/widget/AbsListView$OnScrollListener;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    .line 43
    return-void

    .line 30
    :pswitch_0
    const/4 v0, 0x1

    .line 31
    goto :goto_0

    .line 33
    :pswitch_1
    const/4 v0, 0x0

    .line 34
    goto :goto_0

    .line 36
    :pswitch_2
    const/4 v0, 0x2

    .line 37
    goto :goto_0

    .line 28
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 5

    .prologue
    .line 47
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 49
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->l()I

    move-result v1

    .line 50
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->m()I

    move-result v0

    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 51
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->a()Landroid/support/v7/widget/al;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v7/widget/al;->a()I

    move-result v2

    .line 53
    iget v3, p0, Lcom/roidapp/baselib/c/ac;->b:I

    if-ne v1, v3, :cond_0

    iget v3, p0, Lcom/roidapp/baselib/c/ac;->c:I

    if-ne v0, v3, :cond_0

    iget v3, p0, Lcom/roidapp/baselib/c/ac;->d:I

    if-eq v2, v3, :cond_1

    .line 55
    :cond_0
    iget-object v3, p0, Lcom/roidapp/baselib/c/ac;->a:Landroid/widget/AbsListView$OnScrollListener;

    const/4 v4, 0x0

    invoke-interface {v3, v4, v1, v0, v2}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    .line 56
    iput v1, p0, Lcom/roidapp/baselib/c/ac;->b:I

    .line 57
    iput v0, p0, Lcom/roidapp/baselib/c/ac;->c:I

    .line 58
    iput v2, p0, Lcom/roidapp/baselib/c/ac;->d:I

    .line 60
    :cond_1
    return-void
.end method
