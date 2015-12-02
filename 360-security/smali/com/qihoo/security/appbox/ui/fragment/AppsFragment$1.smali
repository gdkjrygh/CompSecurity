.class Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/appbox/b/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 49
    :cond_0
    :goto_0
    return-void

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 46
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->u:I

    if-nez v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 81
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;)V

    .line 77
    const v0, 0x9ca6

    if-ne v0, p1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 79
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->a()V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 69
    :goto_0
    return-void

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-wide v2, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    iput-wide v2, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->v:J

    .line 59
    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->f()V

    goto :goto_0

    .line 62
    :cond_2
    iget v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    if-ne v0, v4, :cond_3

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->a()V

    .line 66
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    iget-object v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/ui/view/a;->a(Ljava/util/List;)V

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    iget-object v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, v0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->u:I

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 89
    :goto_0
    return-void

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;)V

    goto :goto_0
.end method
