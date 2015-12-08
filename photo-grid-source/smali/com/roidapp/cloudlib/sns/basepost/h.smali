.class public Lcom/roidapp/cloudlib/sns/basepost/h;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/basepost/u;
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;


# instance fields
.field protected a:Landroid/widget/ProgressBar;

.field protected b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

.field protected c:Lcom/roidapp/baselib/c/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/baselib/c/y",
            "<",
            "Lcom/roidapp/cloudlib/sns/basepost/bc;",
            ">;"
        }
    .end annotation
.end field

.field protected d:Lcom/roidapp/cloudlib/sns/basepost/bc;

.field protected e:Z

.field protected f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

.field protected g:Z

.field protected h:Lcom/roidapp/cloudlib/sns/b/x;

.field protected i:Lcom/roidapp/cloudlib/sns/b/p;

.field protected j:Landroid/view/View;

.field protected k:Landroid/widget/FrameLayout;

.field protected l:Landroid/widget/FrameLayout;

.field protected m:Lcom/roidapp/cloudlib/sns/b/a/e;

.field protected n:Z

.field protected o:Z

.field protected p:Z

.field protected q:Z

.field protected r:Z

.field private v:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 56
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 81
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->n:Z

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->o:Z

    .line 83
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->p:Z

    .line 84
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->q:Z

    return-void
.end method


# virtual methods
.method protected final a(I)V
    .locals 2

    .prologue
    .line 317
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getUserVisibleHint()Z

    move-result v0

    if-nez v0, :cond_1

    .line 324
    :cond_0
    :goto_0
    return-void

    .line 320
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 322
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(IZ)V
    .locals 6

    .prologue
    .line 424
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 425
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->k()V

    .line 441
    :goto_0
    return-void

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    if-nez v0, :cond_1

    .line 430
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 431
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 435
    :cond_1
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;-><init>()V

    .line 436
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->x()V

    .line 437
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v4, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/roidapp/cloudlib/sns/b/n;

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Ljava/lang/String;JZLcom/roidapp/cloudlib/sns/b/n;)V

    .line 440
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0
.end method

.method protected a(J)V
    .locals 0

    .prologue
    .line 527
    return-void
.end method

.method protected a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 124
    sget v0, Lcom/roidapp/cloudlib/ar;->aI:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->l:Landroid/widget/FrameLayout;

    .line 125
    sget v0, Lcom/roidapp/cloudlib/ar;->aG:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->k:Landroid/widget/FrameLayout;

    .line 126
    sget v0, Lcom/roidapp/cloudlib/ar;->aF:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 129
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->r:Z

    invoke-virtual {p0, v0, v2, v1}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V

    .line 130
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->q:Z

    if-nez v0, :cond_0

    .line 131
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->m:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 132
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    float-to-int v0, v0

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(II)V

    .line 135
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->r:Z

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/w;)V

    .line 139
    :cond_1
    sget v0, Lcom/roidapp/cloudlib/ar;->aA:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->q:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b(Z)V

    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/i;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/basepost/i;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/support/v7/widget/ap;)V

    .line 144
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>()V

    .line 145
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 146
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/support/v7/widget/au;)V

    .line 148
    sget v0, Lcom/roidapp/cloudlib/ar;->aD:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->a:Landroid/widget/ProgressBar;

    .line 172
    return-void
.end method

.method protected a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V
    .locals 10

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 203
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->z()Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    :goto_0
    return-void

    .line 207
    :cond_0
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 209
    if-eqz p2, :cond_7

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_1
    move v7, v8

    .line 211
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-nez v0, :cond_2

    .line 212
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/bc;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->n:Z

    iget-boolean v4, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->o:Z

    iget-boolean v5, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->p:Z

    move-object v1, p0

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/cloudlib/sns/basepost/bc;-><init>(Landroid/support/v4/app/Fragment;Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;ZZZLcom/roidapp/cloudlib/sns/basepost/u;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    .line 213
    new-instance v0, Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/y;-><init>(Landroid/support/v7/widget/al;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    .line 214
    new-instance v0, Lcom/roidapp/baselib/c/ad;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/baselib/c/ad;-><init>(Lcom/bumptech/glide/k;Lcom/bumptech/glide/l;)V

    .line 215
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b(Landroid/support/v7/widget/ax;)V

    .line 220
    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_3
    move v0, v8

    .line 221
    :goto_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 222
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Ljava/util/List;)V

    .line 223
    if-eqz p3, :cond_4

    .line 224
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v1, v8}, Lcom/roidapp/cloudlib/sns/basepost/bc;->f(I)V

    .line 226
    :cond_4
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v1, v9}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    .line 227
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    if-eqz v0, :cond_9

    :goto_3
    invoke-virtual {v1, v9}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b(I)V

    .line 228
    if-eqz v0, :cond_5

    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    .line 231
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 233
    if-nez v7, :cond_6

    .line 234
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    if-nez v0, :cond_a

    .line 235
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/support/v7/widget/al;)V

    .line 241
    :cond_6
    :goto_4
    invoke-virtual {p0, v7}, Lcom/roidapp/cloudlib/sns/basepost/h;->b(Z)V

    .line 242
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v8}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    goto/16 :goto_0

    :cond_7
    move v7, v9

    .line 209
    goto :goto_1

    :cond_8
    move v0, v9

    .line 220
    goto :goto_2

    .line 227
    :cond_9
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v9

    goto :goto_3

    .line 237
    :cond_a
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    goto :goto_4
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 386
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 387
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->k()V

    .line 420
    :cond_0
    :goto_0
    return-void

    .line 391
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    if-nez v0, :cond_2

    .line 392
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 393
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 396
    :cond_2
    if-eqz p1, :cond_4

    .line 397
    iget-wide v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    .line 399
    instance-of v0, p0, Lcom/roidapp/cloudlib/sns/h/h;

    if-eqz v0, :cond_3

    move-object v0, p0

    .line 400
    check-cast v0, Lcom/roidapp/cloudlib/sns/h/h;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->B()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-nez v0, :cond_3

    .line 401
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-lez v0, :cond_0

    .line 402
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->l_()V

    .line 403
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a_(I)V

    goto :goto_0

    .line 409
    :cond_3
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    .line 410
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 411
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0

    .line 413
    :cond_4
    invoke-static {p2}, Lcom/roidapp/cloudlib/sns/h/h;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    .line 414
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 415
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0
.end method

.method public a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 508
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 509
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_1

    .line 510
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e(I)V

    .line 519
    :cond_0
    :goto_0
    return-void

    .line 511
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_2

    .line 512
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->o()V

    goto :goto_0

    .line 513
    :cond_2
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_3

    .line 514
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(J)V

    goto :goto_0

    .line 516
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 501
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/topic/e;-><init>()V

    .line 502
    const-string v1, "Comment_[tag]_Page"

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/cloudlib/sns/topic/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 504
    return-void
.end method

.method protected a(Z)V
    .locals 7

    .prologue
    .line 265
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->a(Z)V

    .line 266
    if-eqz p1, :cond_0

    .line 267
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    const/4 v1, 0x0

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->b:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/h;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    .line 2280
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-nez v0, :cond_1

    .line 2281
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/bc;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget-boolean v3, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->n:Z

    iget-boolean v4, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->o:Z

    iget-boolean v5, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->p:Z

    move-object v1, p0

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/cloudlib/sns/basepost/bc;-><init>(Landroid/support/v4/app/Fragment;Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;ZZZLcom/roidapp/cloudlib/sns/basepost/u;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    .line 2282
    new-instance v0, Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/y;-><init>(Landroid/support/v7/widget/al;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    .line 2283
    new-instance v0, Lcom/roidapp/baselib/c/ad;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/baselib/c/ad;-><init>(Lcom/bumptech/glide/k;Lcom/bumptech/glide/l;)V

    .line 2284
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b(Landroid/support/v7/widget/ax;)V

    .line 2290
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->e()V

    .line 2291
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->f()V

    .line 2294
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->q:Z

    if-eqz v0, :cond_2

    .line 2295
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->j()Landroid/support/v7/widget/ax;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v3}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->hashCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/ax;Lcom/roidapp/baselib/c/y;Landroid/view/View;Ljava/lang/Object;)V

    .line 2297
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->d()V

    .line 2298
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->h(I)V

    .line 2300
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 2301
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    if-nez v0, :cond_4

    .line 2302
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Landroid/support/v7/widget/al;)V

    .line 270
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    if-eqz v0, :cond_3

    .line 271
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->l()V

    .line 273
    :cond_3
    return-void

    .line 2304
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    goto :goto_0
.end method

.method public b(Z)V
    .locals 1

    .prologue
    .line 483
    if-eqz p1, :cond_0

    .line 484
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    .line 485
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c()V

    .line 486
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->l_()V

    .line 489
    :cond_0
    return-void
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 194
    return-void
.end method

.method protected f()V
    .locals 0

    .prologue
    .line 277
    return-void
.end method

.method protected final g()I
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 333
    const/4 v0, -0x1

    .line 336
    :goto_0
    return v0

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 336
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->l()I

    move-result v0

    goto :goto_0
.end method

.method public final h()V
    .locals 2

    .prologue
    .line 347
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 348
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 356
    :cond_0
    :goto_0
    return-void

    .line 352
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 353
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ae:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 354
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    goto :goto_0
.end method

.method public final h_()Z
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->v:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->v:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    :cond_0
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->h_()Z

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 361
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->e:Z

    if-eqz v1, :cond_0

    .line 362
    const/4 v0, 0x0

    .line 368
    :goto_0
    return v0

    .line 364
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 365
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 367
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->onRefresh()V

    goto :goto_0
.end method

.method public final i_()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 177
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->i_()V

    .line 179
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    if-nez v0, :cond_0

    .line 188
    :goto_0
    return-void

    .line 182
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/TittleClick/Base"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/TittleClick/Base"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->k()V

    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a_(I)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->l_()V

    goto :goto_0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 372
    const/4 v0, 0x0

    return v0
.end method

.method public k()V
    .locals 0

    .prologue
    .line 446
    return-void
.end method

.method public final l()V
    .locals 2

    .prologue
    .line 464
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->bringToFront()V

    .line 467
    return-void
.end method

.method public final m()V
    .locals 2

    .prologue
    .line 471
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->a:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 472
    return-void
.end method

.method public final n()V
    .locals 1

    .prologue
    .line 476
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/h;->b(Z)V

    .line 477
    return-void

    .line 476
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected o()V
    .locals 0

    .prologue
    .line 523
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 90
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 91
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 92
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 93
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "FromShare"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->g:Z

    .line 97
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 102
    sget v0, Lcom/roidapp/cloudlib/as;->t:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 103
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->f()V

    .line 104
    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 105
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 111
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroy()V

    .line 112
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    .line 1330
    invoke-static {}, Lcom/roidapp/cloudlib/sns/u;->a()Lcom/roidapp/cloudlib/sns/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/u;->a(Ljava/lang/Object;)V

    .line 115
    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 492
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroyView()V

    .line 493
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_0

    .line 494
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->e()V

    .line 495
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->f()V

    .line 497
    :cond_0
    return-void
.end method

.method public onRefresh()V
    .locals 0

    .prologue
    .line 343
    return-void
.end method

.method public p()V
    .locals 0

    .prologue
    .line 533
    return-void
.end method

.method public final q()V
    .locals 1

    .prologue
    .line 537
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/h;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->l_()V

    .line 538
    return-void
.end method
