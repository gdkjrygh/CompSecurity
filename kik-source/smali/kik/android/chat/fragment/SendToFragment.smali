.class public Lkik/android/chat/fragment/SendToFragment;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/SendToFragment$a;
    }
.end annotation


# instance fields
.field protected a:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/i;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field g:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private final h:I

.field private final i:Landroid/os/Handler;

.field private j:Landroid/widget/ListView;

.field private k:Z

.field private l:Z

.field private m:J

.field private n:Lcom/kik/g/f;

.field private o:Lkik/a/d/a/a;

.field private p:J

.field private q:Ljava/lang/String;

.field private r:Ljava/util/List;

.field private final s:Lkik/android/chat/fragment/SendToFragment$a;

.field private t:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 47
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 50
    const/4 v0, 0x3

    iput v0, p0, Lkik/android/chat/fragment/SendToFragment;->h:I

    .line 51
    new-instance v0, Lkik/android/chat/fragment/qx;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/qx;-><init>(Lkik/android/chat/fragment/SendToFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->i:Landroid/os/Handler;

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/SendToFragment;->k:Z

    .line 71
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/SendToFragment;->l:Z

    .line 72
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lkik/android/chat/fragment/SendToFragment;->m:J

    .line 73
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    .line 78
    new-instance v0, Lkik/android/chat/fragment/SendToFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/SendToFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->s:Lkik/android/chat/fragment/SendToFragment$a;

    .line 82
    new-instance v0, Lkik/android/chat/fragment/qy;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/qy;-><init>(Lkik/android/chat/fragment/SendToFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    .line 336
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 320
    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 321
    if-nez v0, :cond_0

    .line 322
    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->J()V

    .line 324
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->m()Lcom/kik/g/l;

    move-result-object v0

    iget-wide v2, p0, Lkik/android/chat/fragment/SendToFragment;->m:J

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/l;->a(J)I

    move-result v0

    .line 325
    if-eqz v0, :cond_2

    sget v1, Lcom/kik/g/p$a;->d:I

    if-eq v0, v1, :cond_1

    sget v1, Lcom/kik/g/p$a;->c:I

    if-ne v0, v1, :cond_2

    .line 326
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->J()V

    .line 328
    :cond_2
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/SendToFragment;)V
    .locals 9

    .prologue
    .line 47
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v8, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    new-instance v0, Lcom/kik/view/adapters/t;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v2}, Lkik/a/e/i;->A()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/SendToFragment;->g:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/SendToFragment;->a:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/SendToFragment;->b:Lkik/a/e/l;

    iget-object v6, p0, Lkik/android/chat/fragment/SendToFragment;->c:Lkik/a/e/n;

    iget-object v7, p0, Lkik/android/chat/fragment/SendToFragment;->f:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v7}, Lcom/kik/view/adapters/t;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/kik/cache/ad;Lkik/a/e/r;Lkik/a/e/l;Lkik/a/e/n;Lcom/kik/android/a;)V

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/HeaderViewListAdapter;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    :cond_1
    check-cast v0, Lcom/kik/view/adapters/t;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->A()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/t;->a(Ljava/util/List;)V

    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/SendToFragment;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 47
    if-eqz p1, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "SendToFragment.RESULT_JID"

    const-string v2, "KikSelectUserFragment.RESULT_JID"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->isResumed()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lkik/android/chat/fragment/re;

    invoke-direct {v1, p0, v0}, Lkik/android/chat/fragment/re;-><init>(Lkik/android/chat/fragment/SendToFragment;Landroid/os/Bundle;)V

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/SendToFragment;->a(Ljava/lang/Runnable;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/SendToFragment;->b(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/SendToFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->i:Landroid/os/Handler;

    return-object v0
.end method

.method private b(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 332
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/SendToFragment;->a(Landroid/os/Bundle;)V

    .line 333
    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->J()V

    .line 334
    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/SendToFragment;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/SendToFragment;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/SendToFragment;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/SendToFragment;)Z
    .locals 1

    .prologue
    .line 47
    iget-boolean v0, p0, Lkik/android/chat/fragment/SendToFragment;->l:Z

    return v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/SendToFragment;)Lkik/android/chat/fragment/SendToFragment$a;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->s:Lkik/android/chat/fragment/SendToFragment$a;

    return-object v0
.end method

.method static synthetic f(Lkik/android/chat/fragment/SendToFragment;)Z
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/SendToFragment;->k:Z

    return v0
.end method

.method static synthetic g(Lkik/android/chat/fragment/SendToFragment;)J
    .locals 2

    .prologue
    .line 47
    iget-wide v0, p0, Lkik/android/chat/fragment/SendToFragment;->m:J

    return-wide v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/SendToFragment;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lkik/android/chat/fragment/SendToFragment;->a()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 93
    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/SendToFragment;)V

    .line 94
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 95
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->a:Lkik/a/e/r;

    invoke-interface {v1}, Lkik/a/e/r;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->b:Lkik/a/e/l;

    invoke-interface {v1}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->i()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->e()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->k()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->e:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->o()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->g()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->h()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->t:Lcom/kik/g/i;

    new-instance v3, Lcom/kik/g/o;

    invoke-direct {v3}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 96
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v8, 0x0

    .line 102
    const v0, 0x7f030093

    invoke-virtual {p1, v0, p2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/view/ViewGroup;

    .line 104
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->o:Lkik/a/d/a/a;

    .line 105
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->g()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/chat/fragment/SendToFragment;->p:J

    .line 106
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->q:Ljava/lang/String;

    .line 107
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->i()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->r:Ljava/util/List;

    .line 109
    const v0, 0x7f03003c

    invoke-virtual {p1, v0, v9, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 110
    const v0, 0x7f0e004b

    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    .line 112
    if-eqz v9, :cond_1

    const v0, 0x7f0e001d

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lkik/android/chat/fragment/rf;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/rf;-><init>(Lkik/android/chat/fragment/SendToFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const v0, 0x7f0e0078

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09030a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    :cond_1
    const/16 v0, 0x9

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 115
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOverscrollFooter(Landroid/graphics/drawable/Drawable;)V

    .line 118
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    const v1, 0x7f0e003e

    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 119
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/qz;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/qz;-><init>(Lkik/android/chat/fragment/SendToFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 150
    new-instance v0, Lkik/android/util/af;

    invoke-direct {v0}, Lkik/android/util/af;-><init>()V

    .line 151
    new-instance v1, Lkik/android/chat/fragment/ra;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ra;-><init>(Lkik/android/chat/fragment/SendToFragment;)V

    iput-object v1, v0, Lkik/android/util/af;->a:Ljava/lang/Runnable;

    .line 201
    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    const v2, 0x7f030083

    iget-object v3, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    invoke-virtual {p1, v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2, v0, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 202
    new-instance v0, Lcom/kik/view/adapters/t;

    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/SendToFragment;->d:Lkik/a/e/i;

    invoke-interface {v2}, Lkik/a/e/i;->A()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/SendToFragment;->g:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/SendToFragment;->a:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/SendToFragment;->b:Lkik/a/e/l;

    iget-object v6, p0, Lkik/android/chat/fragment/SendToFragment;->c:Lkik/a/e/n;

    iget-object v7, p0, Lkik/android/chat/fragment/SendToFragment;->f:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v8}, Lcom/kik/view/adapters/t;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/kik/cache/ad;Lkik/a/e/r;Lkik/a/e/l;Lkik/a/e/n;Lcom/kik/android/a;B)V

    .line 203
    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->c()V

    .line 204
    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 206
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->s:Lkik/android/chat/fragment/SendToFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/SendToFragment$a;->a(Landroid/os/Bundle;)V

    .line 207
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->s:Lkik/android/chat/fragment/SendToFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/SendToFragment$a;->a(Lkik/android/chat/fragment/SendToFragment$a;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/SendToFragment;->l:Z

    .line 209
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->s:Lkik/android/chat/fragment/SendToFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/SendToFragment$a;->b(Lkik/android/chat/fragment/SendToFragment$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/chat/fragment/SendToFragment;->m:J

    .line 210
    iget-wide v0, p0, Lkik/android/chat/fragment/SendToFragment;->m:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 211
    invoke-direct {p0}, Lkik/android/chat/fragment/SendToFragment;->a()V

    .line 212
    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    invoke-virtual {p0}, Lkik/android/chat/fragment/SendToFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->m()Lcom/kik/g/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/l;->a()Lcom/kik/g/e;

    move-result-object v0

    new-instance v2, Lkik/android/chat/fragment/rd;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/rd;-><init>(Lkik/android/chat/fragment/SendToFragment;)V

    invoke-virtual {v1, v0, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 220
    :cond_3
    return-object v9
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    .line 309
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroy()V

    .line 310
    iget-object v0, p0, Lkik/android/chat/fragment/SendToFragment;->n:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 311
    iget-boolean v0, p0, Lkik/android/chat/fragment/SendToFragment;->l:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/SendToFragment;->k:Z

    if-nez v0, :cond_0

    .line 312
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->o:Lkik/a/d/a/a;

    iget-wide v2, p0, Lkik/android/chat/fragment/SendToFragment;->p:J

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;J)V

    .line 313
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->c(Ljava/lang/String;)V

    .line 314
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->r:Ljava/util/List;

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->a(Ljava/util/List;)V

    .line 316
    :cond_0
    return-void
.end method

.method public final v()Z
    .locals 4

    .prologue
    .line 301
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->o:Lkik/a/d/a/a;

    iget-wide v2, p0, Lkik/android/chat/fragment/SendToFragment;->p:J

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;J)V

    .line 302
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/SendToFragment;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->c(Ljava/lang/String;)V

    .line 303
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->v()Z

    move-result v0

    return v0
.end method
