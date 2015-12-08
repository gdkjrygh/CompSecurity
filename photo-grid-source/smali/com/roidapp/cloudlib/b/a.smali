.class public final Lcom/roidapp/cloudlib/b/a;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/support/v4/view/ViewPager;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/view/View;

.field private f:Landroid/widget/TextView;

.field private g:Ljava/lang/String;

.field private h:Lcom/roidapp/cloudlib/b/e;

.field private i:Lcom/roidapp/cloudlib/b/j;

.field private j:Lcom/roidapp/cloudlib/b/g;

.field private k:Ljava/lang/Thread;

.field private l:Ljava/lang/Thread;

.field private m:I

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Landroid/os/Handler;

.field private r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/a;->o:Z

    .line 223
    new-instance v0, Lcom/roidapp/cloudlib/b/c;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b/c;-><init>(Lcom/roidapp/cloudlib/b/a;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->q:Landroid/os/Handler;

    .line 341
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/a;)I
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    return v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/a;Lcom/roidapp/cloudlib/b/g;)Lcom/roidapp/cloudlib/b/g;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/a;->j:Lcom/roidapp/cloudlib/b/g;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/a;Lcom/roidapp/cloudlib/b/j;)Lcom/roidapp/cloudlib/b/j;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/a;->i:Lcom/roidapp/cloudlib/b/j;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    .line 1282
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    .line 32
    return-void
.end method

.method private declared-synchronized a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 252
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/cloudlib/b/d;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/cloudlib/b/d;-><init>(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 265
    iget v1, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    if-nez v1, :cond_0

    .line 266
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->i:Lcom/roidapp/cloudlib/b/j;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/b/j;->d()V

    .line 267
    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->k:Ljava/lang/Thread;

    .line 272
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    monitor-exit p0

    return-void

    .line 269
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->j:Lcom/roidapp/cloudlib/b/g;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/b/g;->d()V

    .line 270
    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->l:Ljava/lang/Thread;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 252
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Ljava/lang/Thread;)V
    .locals 0

    .prologue
    .line 32
    invoke-static {p0}, Lcom/roidapp/cloudlib/b/a;->b(Ljava/lang/Thread;)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->i:Lcom/roidapp/cloudlib/b/j;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/b/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static b(Ljava/lang/Thread;)V
    .locals 0

    .prologue
    .line 246
    if-eqz p0, :cond_0

    .line 247
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 249
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->j:Lcom/roidapp/cloudlib/b/g;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/sns/ab;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/sns/ab;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 298
    iget v0, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    if-nez v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->i:Lcom/roidapp/cloudlib/b/j;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/j;->c()V

    .line 303
    :goto_0
    return-void

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->j:Lcom/roidapp/cloudlib/b/g;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/g;->c()V

    goto :goto_0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/sns/ab;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    return-object v0
.end method

.method private g()Z
    .locals 2

    .prologue
    .line 405
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    if-eqz v0, :cond_1

    .line 406
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 407
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    .line 409
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/String;)V

    .line 410
    const/4 v0, 0x1

    .line 412
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/b/a;)Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/b/a;->r:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->k:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->l:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/b/a;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/a;->f()V

    return-void
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/b/a;)Z
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/a;->r:Z

    return v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/b/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->q:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 83
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 84
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;Z)V

    .line 85
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/ab;->e()V

    .line 87
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 88
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/String;)V

    .line 90
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/b/a;->p:Z

    .line 92
    new-instance v1, Lcom/roidapp/cloudlib/b/f;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/b/f;-><init>(Lcom/roidapp/cloudlib/b/a;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/text/TextWatcher;)V

    .line 93
    new-instance v1, Lcom/roidapp/cloudlib/b/b;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/b/b;-><init>(Lcom/roidapp/cloudlib/b/a;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Lcom/roidapp/cloudlib/sns/ae;)V

    .line 113
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/ab;->a()V

    .line 115
    return-object v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 290
    if-nez p1, :cond_0

    .line 291
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->i:Lcom/roidapp/cloudlib/b/j;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/j;->b(Ljava/lang/String;)V

    .line 295
    :goto_0
    return-void

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->j:Lcom/roidapp/cloudlib/b/g;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/g;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final a(Z)V
    .locals 1

    .prologue
    .line 307
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->a(Z)V

    .line 308
    const-string v0, "SearchPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    .line 310
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/b/a;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0, p0}, Lcom/roidapp/cloudlib/b/a;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 312
    :cond_0
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 316
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->b()V

    .line 317
    const-string v0, "SearchPage"

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 318
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 136
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/a;->p:Z

    .line 137
    return-void
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/ab;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->t:Lcom/roidapp/cloudlib/sns/ab;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/String;)V

    .line 143
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/a;->f()V

    .line 144
    const/4 v0, 0x1

    .line 147
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 120
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onActivityCreated(Landroid/os/Bundle;)V

    .line 121
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->h:Lcom/roidapp/cloudlib/b/e;

    if-nez v0, :cond_0

    .line 122
    new-instance v0, Lcom/roidapp/cloudlib/b/j;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/b/j;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->i:Lcom/roidapp/cloudlib/b/j;

    .line 123
    new-instance v0, Lcom/roidapp/cloudlib/b/g;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/b/g;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->j:Lcom/roidapp/cloudlib/b/g;

    .line 124
    new-instance v0, Lcom/roidapp/cloudlib/b/e;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/a;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/b/e;-><init>(Lcom/roidapp/cloudlib/b/a;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->h:Lcom/roidapp/cloudlib/b/e;

    .line 126
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/a;->r:Z

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/roidapp/cloudlib/b/a;->h:Lcom/roidapp/cloudlib/b/e;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 129
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 130
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/a;->r:Z

    .line 131
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/a;->g()Z

    .line 133
    :cond_1
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 322
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->c:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 323
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 327
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/a;->g()Z

    .line 329
    :cond_0
    iput v2, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    .line 339
    :cond_1
    :goto_0
    return-void

    .line 330
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 331
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    if-eq v0, v1, :cond_3

    .line 332
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 335
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/a;->g()Z

    .line 337
    :cond_3
    iput v1, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/b/a;->o:Z

    .line 56
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/cloudlib/b/a;->n:I

    .line 57
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 62
    sget v0, Lcom/roidapp/cloudlib/as;->b:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 64
    sget v0, Lcom/roidapp/cloudlib/ar;->bJ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    .line 65
    sget v0, Lcom/roidapp/cloudlib/ar;->cf:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->e:Landroid/view/View;

    .line 66
    sget v0, Lcom/roidapp/cloudlib/ar;->ce:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->f:Landroid/widget/TextView;

    .line 68
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 69
    sget v0, Lcom/roidapp/cloudlib/ar;->ch:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->b:Landroid/view/View;

    .line 70
    sget v0, Lcom/roidapp/cloudlib/ar;->co:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->c:Landroid/widget/TextView;

    .line 71
    sget v0, Lcom/roidapp/cloudlib/ar;->cn:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/b/a;->d:Landroid/widget/TextView;

    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    iget v0, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    .line 1151
    if-nez v0, :cond_0

    .line 1152
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->b:Landroid/view/View;

    iget v2, p0, Lcom/roidapp/cloudlib/b/a;->n:I

    div-int/lit8 v2, v2, 0x8

    iget v3, p0, Lcom/roidapp/cloudlib/b/a;->n:I

    div-int/lit8 v3, v3, 0x8

    mul-int/lit8 v3, v3, 0x5

    invoke-virtual {v0, v2, v4, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 76
    :goto_0
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/b/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const-string v3, "Search page"

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 77
    const-string v0, "Search page"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 78
    return-object v1

    .line 1154
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->b:Landroid/view/View;

    iget v2, p0, Lcom/roidapp/cloudlib/b/a;->n:I

    div-int/lit8 v2, v2, 0x8

    mul-int/lit8 v2, v2, 0x5

    iget v3, p0, Lcom/roidapp/cloudlib/b/a;->n:I

    div-int/lit8 v3, v3, 0x8

    invoke-virtual {v0, v2, v4, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0
.end method

.method public final onDestroy()V
    .locals 1

    .prologue
    .line 432
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroy()V

    .line 433
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->k:Ljava/lang/Thread;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Ljava/lang/Thread;)V

    .line 434
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->l:Ljava/lang/Thread;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Ljava/lang/Thread;)V

    .line 435
    return-void
.end method

.method public final onDetach()V
    .locals 2

    .prologue
    .line 417
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDetach()V

    .line 419
    :try_start_0
    const-class v0, Landroid/support/v4/app/Fragment;

    const-string v1, "mChildFragmentManager"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 420
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 421
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 426
    return-void

    .line 422
    :catch_0
    move-exception v0

    .line 423
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 424
    :catch_1
    move-exception v0

    .line 425
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final onPageScrollStateChanged(I)V
    .locals 0

    .prologue
    .line 384
    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 388
    if-lez p3, :cond_0

    .line 389
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->b:Landroid/view/View;

    iget v1, p0, Lcom/roidapp/cloudlib/b/a;->n:I

    div-int/lit8 v1, v1, 0x8

    div-int/lit8 v2, p3, 0x2

    add-int/2addr v1, v2

    iget v2, p0, Lcom/roidapp/cloudlib/b/a;->n:I

    div-int/lit8 v2, v2, 0x8

    mul-int/lit8 v2, v2, 0x5

    div-int/lit8 v3, p3, 0x2

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v4, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 390
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/a;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 392
    :cond_0
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 1

    .prologue
    .line 398
    iget v0, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    if-eq v0, p1, :cond_0

    .line 399
    iput p1, p0, Lcom/roidapp/cloudlib/b/a;->m:I

    .line 400
    invoke-direct {p0}, Lcom/roidapp/cloudlib/b/a;->g()Z

    .line 402
    :cond_0
    return-void
.end method
