.class Lcom/facebook/orca/threadview/bu;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 465
    iput-object p1, p0, Lcom/facebook/orca/threadview/bu;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 468
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "cancel_group_name_button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 471
    iget-object v1, p0, Lcom/facebook/orca/threadview/bu;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/analytics/cb;)V

    .line 472
    iget-object v0, p0, Lcom/facebook/orca/threadview/bu;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Lcom/facebook/orca/threadview/ThreadViewFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 473
    iget-object v0, p0, Lcom/facebook/orca/threadview/bu;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->g(Lcom/facebook/orca/threadview/ThreadViewFragment;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 474
    iget-object v0, p0, Lcom/facebook/orca/threadview/bu;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->h(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 475
    invoke-static {}, Lcom/facebook/orca/threadview/ThreadViewFragment;->U()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Cancelled group name upsell"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 476
    iget-object v0, p0, Lcom/facebook/orca/threadview/bu;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/bu;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->h(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Ljava/lang/String;)V

    .line 478
    :cond_0
    return-void
.end method
