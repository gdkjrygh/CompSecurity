.class Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/appbox/b/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 46
    :cond_0
    :goto_0
    return-void

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->u:I

    if-nez v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;)V

    .line 74
    const v0, 0x9ca6

    if-ne v0, p1, :cond_0

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->a()V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 66
    :goto_0
    return-void

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-wide v2, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    iput-wide v2, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->v:J

    .line 54
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 55
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 56
    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->f()V

    goto :goto_0

    .line 59
    :cond_2
    iget v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    if-ne v0, v4, :cond_3

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->a()V

    .line 63
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    iget-object v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/ui/view/a;->a(Ljava/util/List;)V

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    iget-object v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->u:I

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 86
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;)V

    goto :goto_0
.end method
