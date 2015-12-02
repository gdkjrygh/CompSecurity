.class public Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;
.super Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;
.source "360Security"


# instance fields
.field private final y:Lcom/qihoo/security/appbox/b/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;-><init>()V

    .line 35
    new-instance v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;-><init>(Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->y:Lcom/qihoo/security/appbox/b/c;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->h()V

    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 92
    iget v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->u:I

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->f()V

    .line 98
    :goto_0
    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->c()V

    goto :goto_0
.end method


# virtual methods
.method protected b()V
    .locals 6

    .prologue
    .line 24
    invoke-super {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->b()V

    .line 25
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->r:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->y:Lcom/qihoo/security/appbox/b/c;

    iget-object v3, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->t:Ljava/lang/String;

    iget v4, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->u:I

    iget-object v5, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 27
    return-void
.end method

.method protected c()V
    .locals 9

    .prologue
    .line 31
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->r:Landroid/content/Context;

    iget-object v3, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->t:Ljava/lang/String;

    iget v4, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->u:I

    iget-object v5, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-wide v6, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->v:J

    iget-object v8, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->y:Lcom/qihoo/security/appbox/b/c;

    invoke-virtual/range {v0 .. v8}, Lcom/qihoo/security/appbox/core/a;->a(ZLandroid/content/Context;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;JLcom/qihoo/security/appbox/b/c;)V

    .line 33
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 18
    const-string/jumbo v0, "2"

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->a(Ljava/lang/String;)V

    .line 19
    const-wide/16 v0, 0x5dc

    iput-wide v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->x:J

    .line 20
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 102
    invoke-super {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->onDestroy()V

    .line 103
    const-string/jumbo v0, "2"

    invoke-static {v0}, Lcom/qihoo/security/appbox/c/b/a;->a(Ljava/lang/Object;)V

    .line 104
    return-void
.end method
