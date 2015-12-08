.class public final Lcom/roidapp/photogrid/k;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;


# instance fields
.field private final a:Lcom/roidapp/photogrid/s;

.field private b:Landroid/support/v7/widget/RecyclerView;

.field private c:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private d:Lcom/roidapp/photogrid/a;

.field private e:Lcom/roidapp/baselib/c/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/baselib/c/y",
            "<",
            "Lcom/roidapp/cloudlib/sns/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/roidapp/cloudlib/template/b/c;

.field private h:Lcom/roidapp/photogrid/cloud/a/a;

.field private i:Lcom/roidapp/photogrid/MainPage;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;"
        }
    .end annotation
.end field

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Lcom/roidapp/cloudlib/template/b/a;

.field private o:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 75
    new-instance v0, Lcom/roidapp/photogrid/s;

    invoke-direct {v0}, Lcom/roidapp/photogrid/s;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    .line 81
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->f:Ljava/util/Set;

    .line 398
    new-instance v0, Lcom/roidapp/photogrid/p;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/p;-><init>(Lcom/roidapp/photogrid/k;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->n:Lcom/roidapp/cloudlib/template/b/a;

    .line 456
    new-instance v0, Lcom/roidapp/photogrid/l;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/l;-><init>(Lcom/roidapp/photogrid/k;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->o:Landroid/view/View$OnClickListener;

    .line 730
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/k;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/k;Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 72
    .line 2382
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2383
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/c/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/c/a;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 2384
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    .line 2386
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/k;->k:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    iget-object v0, v0, Lcom/roidapp/photogrid/s;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 2387
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "other"

    const-string v2, "templateEntry"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2388
    if-nez v0, :cond_1

    const-string v0, "%d NEW"

    .line 2389
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    iget-object v1, v1, Lcom/roidapp/photogrid/s;->a:Landroid/widget/TextView;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/roidapp/photogrid/k;->k:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2390
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    iget-object v0, v0, Lcom/roidapp/photogrid/s;->a:Landroid/widget/TextView;

    const v1, 0x7f0205ed

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 2391
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    iget-object v0, v0, Lcom/roidapp/photogrid/s;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 72
    :cond_2
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 368
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/a;->a(Ljava/util/List;)V

    .line 370
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    const v1, 0x7f0d026b

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 372
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/k;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/k;->a(Ljava/util/List;)V

    return-void
.end method

.method private b(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 655
    iput-boolean v2, p0, Lcom/roidapp/photogrid/k;->l:Z

    .line 656
    new-instance v0, Lcom/roidapp/photogrid/q;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/q;-><init>(Lcom/roidapp/photogrid/k;B)V

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/q;->b(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 657
    if-eqz p1, :cond_0

    .line 658
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 660
    :cond_0
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 662
    iput-boolean v2, p0, Lcom/roidapp/photogrid/k;->m:Z

    .line 663
    new-instance v0, Lcom/roidapp/photogrid/r;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/r;-><init>(Lcom/roidapp/photogrid/k;B)V

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/q;->a(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 664
    if-eqz p1, :cond_1

    .line 665
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 667
    :cond_1
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 668
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/k;)Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/k;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->f:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/k;)Lcom/roidapp/cloudlib/template/b/c;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->g:Lcom/roidapp/cloudlib/template/b/c;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/k;)I
    .locals 2

    .prologue
    .line 72
    iget v0, p0, Lcom/roidapp/photogrid/k;->k:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/roidapp/photogrid/k;->k:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/k;)Z
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/k;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/k;->l:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/k;)V
    .locals 2

    .prologue
    .line 72
    .line 3375
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    if-eqz v0, :cond_0

    .line 3376
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/a;->a(Ljava/util/List;)V

    .line 3377
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    const v1, 0x7f0d026b

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 72
    :cond_0
    return-void
.end method

.method static synthetic j(Lcom/roidapp/photogrid/k;)Z
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/k;)Ljava/util/List;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/k;)Z
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/k;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/k;->m:Z

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/k;)Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->c:Landroid/support/v4/widget/SwipeRefreshLayout;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/k;)Z
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->z()Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected final a(Z)V
    .locals 1

    .prologue
    .line 113
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->a(Z)V

    .line 114
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->a(Z)V

    .line 115
    const-string v0, "HomePage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 116
    return-void
.end method

.method protected final b()V
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 120
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->b()V

    .line 121
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_0

    .line 2135
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/c/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/c/a;->a()I

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    .line 123
    :goto_0
    if-eq v0, v1, :cond_0

    .line 124
    const-string v1, "HomePage"

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;I)V

    .line 127
    :cond_0
    const-string v0, "HomePage"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 128
    return-void

    .line 2138
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    .line 2139
    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->c()Landroid/support/v7/widget/t;

    move-result-object v2

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->l()I

    move-result v3

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->d()I

    move-result v0

    invoke-virtual {v2, v3, v0}, Landroid/support/v7/widget/t;->c(II)I

    move-result v0

    goto :goto_0
.end method

.method public final i_()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 166
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->i_()V

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_0

    .line 173
    :goto_0
    return-void

    .line 170
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/TittleClick/Home"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "SNS/TittleClick/Home"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->c()V

    goto :goto_0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    if-nez v0, :cond_0

    .line 157
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/main/b;->onActivityResult(IILandroid/content/Intent;)V

    .line 161
    :goto_0
    return-void

    .line 160
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/main/b;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 144
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onAttach(Landroid/app/Activity;)V

    .line 145
    check-cast p1, Lcom/roidapp/photogrid/MainPage;

    iput-object p1, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    .line 146
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 91
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 92
    new-instance v0, Lcom/roidapp/cloudlib/template/b/c;

    iget-object v1, p0, Lcom/roidapp/photogrid/k;->n:Lcom/roidapp/cloudlib/template/b/a;

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/template/b/c;-><init>(Lcom/roidapp/cloudlib/template/b/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->g:Lcom/roidapp/cloudlib/template/b/c;

    .line 93
    new-instance v0, Lcom/roidapp/baselib/c/y;

    new-instance v1, Lcom/roidapp/cloudlib/sns/c/a;

    iget-object v2, p0, Lcom/roidapp/photogrid/k;->o:Landroid/view/View$OnClickListener;

    invoke-direct {v1, p0, v2}, Lcom/roidapp/cloudlib/sns/c/a;-><init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;)V

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/c/y;-><init>(Landroid/support/v7/widget/al;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    .line 95
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/k;->b(Z)V

    .line 96
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 100
    const v0, 0x7f0300b4

    invoke-virtual {p1, v0, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1253
    if-eqz v1, :cond_0

    .line 1254
    const v0, 0x7f0d02c7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/SwipeRefreshLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->c:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 1255
    const v0, 0x7f0d02c8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    .line 1258
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Landroid/support/v7/widget/GridLayoutManager;-><init>(I)V

    .line 1259
    new-instance v2, Lcom/roidapp/photogrid/m;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/m;-><init>(Lcom/roidapp/photogrid/k;)V

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/t;)V

    .line 1270
    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v2

    .line 1271
    iget-object v3, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v4, Lcom/roidapp/photogrid/n;

    invoke-direct {v4, p0, v2, v0}, Lcom/roidapp/photogrid/n;-><init>(Lcom/roidapp/photogrid/k;ILandroid/support/v7/widget/GridLayoutManager;)V

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/as;)V

    .line 1294
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Lcom/roidapp/photogrid/o;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/o;-><init>(Lcom/roidapp/photogrid/k;)V

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/av;)V

    .line 1320
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/au;)V

    .line 1322
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->c:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {v0, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 1323
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->c:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/k;->a(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    .line 1327
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    if-eqz v0, :cond_4

    .line 1332
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    iget-object v4, p0, Lcom/roidapp/photogrid/k;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v4}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v4

    invoke-virtual {p0}, Lcom/roidapp/photogrid/k;->hashCode()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v2, v3, v4, v5}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/ax;Lcom/roidapp/baselib/c/y;Landroid/view/View;Ljava/lang/Object;)V

    .line 1336
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    .line 1360
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    if-nez v2, :cond_1

    .line 1361
    new-instance v2, Lcom/roidapp/photogrid/a;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/a;-><init>(Lcom/roidapp/photogrid/k;)V

    iput-object v2, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    .line 1362
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    const v3, 0x7f0d026b

    invoke-static {v2, v3}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1364
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    .line 1336
    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/c/y;->a(Landroid/view/View;)V

    .line 1337
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1338
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/k;->a(Ljava/util/List;)V

    .line 1343
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    iget-object v2, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/s;->a(Landroid/app/Activity;)V

    .line 1344
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 1345
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    iget-object v3, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0, v3}, Lcom/roidapp/photogrid/s;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 1346
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/s;->a()V

    .line 1347
    iget-object v2, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/c/y;->a(Landroid/view/View;)V

    .line 1351
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->z()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1352
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->g:Lcom/roidapp/cloudlib/template/b/c;

    const/16 v2, 0x2310

    invoke-static {v0, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1355
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 103
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    if-eqz v0, :cond_5

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/common/w;->a(Landroid/view/View;)V

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    iget-object v2, v0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/common/w;->a(Landroid/view/ViewGroup;)V

    .line 107
    :cond_5
    return-object v1
.end method

.method public final onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 618
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroy()V

    .line 620
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->g:Lcom/roidapp/cloudlib/template/b/c;

    if-eqz v0, :cond_0

    .line 621
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->g:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 622
    iput-object v1, p0, Lcom/roidapp/photogrid/k;->g:Lcom/roidapp/cloudlib/template/b/c;

    .line 624
    :cond_0
    iput-object v1, p0, Lcom/roidapp/photogrid/k;->n:Lcom/roidapp/cloudlib/template/b/a;

    .line 625
    iput-object v1, p0, Lcom/roidapp/photogrid/k;->o:Landroid/view/View$OnClickListener;

    .line 628
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_1

    .line 629
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/c/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/c/a;->d()V

    .line 630
    iput-object v1, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    .line 633
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 634
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 635
    iput-object v1, p0, Lcom/roidapp/photogrid/k;->j:Ljava/util/List;

    .line 638
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->h:Lcom/roidapp/photogrid/cloud/a/a;

    if-eqz v0, :cond_3

    .line 639
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->h:Lcom/roidapp/photogrid/cloud/a/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/a;->a()V

    .line 640
    iput-object v1, p0, Lcom/roidapp/photogrid/k;->h:Lcom/roidapp/photogrid/cloud/a/a;

    .line 642
    :cond_3
    return-void
.end method

.method public final onDestroyView()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 589
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroyView()V

    .line 591
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_0

    .line 592
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->e()V

    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->e:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->f()V

    .line 595
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_1

    .line 596
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 597
    iput-object v2, p0, Lcom/roidapp/photogrid/k;->b:Landroid/support/v7/widget/RecyclerView;

    .line 599
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->c:Landroid/support/v4/widget/SwipeRefreshLayout;

    if-eqz v0, :cond_2

    .line 600
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->c:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 601
    iput-object v2, p0, Lcom/roidapp/photogrid/k;->c:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 603
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    if-eqz v0, :cond_3

    .line 604
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/a;->a()V

    .line 605
    iput-object v2, p0, Lcom/roidapp/photogrid/k;->d:Lcom/roidapp/photogrid/a;

    .line 607
    :cond_3
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .prologue
    .line 150
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    .line 151
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDetach()V

    .line 152
    return-void
.end method

.method public final onPause()V
    .locals 1

    .prologue
    .line 552
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->a:Lcom/roidapp/photogrid/s;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/s;->b()V

    .line 553
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->G()V

    .line 554
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onPause()V

    .line 555
    return-void
.end method

.method public final onRefresh()V
    .locals 1

    .prologue
    .line 646
    iget-boolean v0, p0, Lcom/roidapp/photogrid/k;->l:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/k;->m:Z

    if-eqz v0, :cond_1

    .line 651
    :cond_0
    :goto_0
    return-void

    .line 650
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/k;->b(Z)V

    goto :goto_0
.end method

.method public final onResume()V
    .locals 0

    .prologue
    .line 584
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onResume()V

    .line 585
    return-void
.end method

.method public final onStart()V
    .locals 2

    .prologue
    .line 559
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onStart()V

    .line 560
    const-string v0, "MainPage"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 561
    sget v0, Lcom/roidapp/photogrid/common/az;->y:I

    if-nez v0, :cond_0

    .line 563
    iget-object v0, p0, Lcom/roidapp/photogrid/k;->i:Lcom/roidapp/photogrid/MainPage;

    const-string v1, "HomePage"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 565
    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 0

    .prologue
    .line 569
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onStop()V

    .line 570
    return-void
.end method

.method public final setUserVisibleHint(Z)V
    .locals 1

    .prologue
    .line 611
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->setUserVisibleHint(Z)V

    .line 612
    if-eqz p1, :cond_0

    .line 613
    const-string v0, "Home"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 615
    :cond_0
    return-void
.end method
