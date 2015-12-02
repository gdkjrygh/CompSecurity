.class public Lcom/facebook/orca/threadview/ThreadViewMapFragment;
.super Landroid/support/v4/app/Fragment;
.source "ThreadViewMapFragment.java"


# instance fields
.field private a:Landroid/app/LocalActivityManager;

.field private b:Lcom/facebook/orca/threadview/cq;

.field private c:Landroid/widget/FrameLayout;

.field private d:Z

.field private e:Lcom/facebook/orca/threads/ThreadSummary;

.field private f:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->d:Z

    if-eqz v0, :cond_1

    .line 106
    :cond_0
    :goto_0
    return-void

    .line 93
    :cond_1
    invoke-static {}, Lcom/facebook/orca/threadview/cw;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-static {}, Lcom/facebook/orca/threadview/cw;->b()Ljava/lang/Class;

    move-result-object v0

    .line 98
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object v0

    .line 99
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    const-string v2, "map"

    invoke-virtual {v1, v2, v0}, Landroid/app/LocalActivityManager;->startActivity(Ljava/lang/String;Landroid/content/Intent;)Landroid/view/Window;

    move-result-object v1

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    const-string v2, "map"

    invoke-virtual {v0, v2}, Landroid/app/LocalActivityManager;->getActivity(Ljava/lang/String;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/cq;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->b:Lcom/facebook/orca/threadview/cq;

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 102
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->d:Z

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->e:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->f:Lcom/google/common/a/es;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->b:Lcom/facebook/orca/threadview/cq;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->e:Lcom/facebook/orca/threads/ThreadSummary;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->f:Lcom/google/common/a/es;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/threadview/cq;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V

    goto :goto_0
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->A()V

    .line 51
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->w()Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a()V

    .line 53
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0}, Landroid/app/LocalActivityManager;->dispatchResume()V

    .line 55
    :cond_0
    return-void
.end method

.method public B()V
    .locals 2

    .prologue
    .line 59
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->B()V

    .line 60
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->w()Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->m()Landroid/support/v4/app/p;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/p;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/LocalActivityManager;->dispatchPause(Z)V

    .line 63
    :cond_0
    return-void
.end method

.method public C()V
    .locals 2

    .prologue
    .line 73
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->C()V

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->m()Landroid/support/v4/app/p;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/p;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/LocalActivityManager;->dispatchDestroy(Z)V

    .line 75
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 44
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->c:Landroid/widget/FrameLayout;

    .line 45
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->c:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 34
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/os/Bundle;)V

    .line 36
    new-instance v1, Landroid/app/LocalActivityManager;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Landroid/app/LocalActivityManager;-><init>(Landroid/app/Activity;Z)V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    .line 37
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0, p1}, Landroid/app/LocalActivityManager;->dispatchCreate(Landroid/os/Bundle;)V

    .line 38
    return-void
.end method

.method a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->e:Lcom/facebook/orca/threads/ThreadSummary;

    .line 110
    iput-object p2, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->f:Lcom/google/common/a/es;

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->b:Lcom/facebook/orca/threadview/cq;

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->b:Lcom/facebook/orca/threadview/cq;

    invoke-interface {v0, p1, p2}, Lcom/facebook/orca/threadview/cq;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V

    .line 114
    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 2

    .prologue
    .line 79
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    if-eqz p1, :cond_1

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/LocalActivityManager;->dispatchPause(Z)V

    .line 87
    :cond_0
    :goto_0
    return-void

    .line 83
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a()V

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0}, Landroid/app/LocalActivityManager;->dispatchResume()V

    goto :goto_0
.end method

.method public g()V
    .locals 1

    .prologue
    .line 67
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->g()V

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0}, Landroid/app/LocalActivityManager;->dispatchStop()V

    .line 69
    return-void
.end method
