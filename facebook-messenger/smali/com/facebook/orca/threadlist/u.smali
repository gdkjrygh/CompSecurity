.class Lcom/facebook/orca/threadlist/u;
.super Ljava/lang/Object;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Lcom/facebook/base/fragment/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 174
    iput-object p1, p0, Lcom/facebook/orca/threadlist/u;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 177
    const-string v0, "thread_id"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/threadlist/u;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/orca/nux/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/threadlist/u;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/orca/nux/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/nux/k;->d()V

    .line 181
    :cond_0
    const-string v0, "thread_id"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 182
    iget-object v1, p0, Lcom/facebook/orca/threadlist/u;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v1, v0}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/orca/threadlist/t;Ljava/lang/String;)V

    .line 183
    return-void
.end method
