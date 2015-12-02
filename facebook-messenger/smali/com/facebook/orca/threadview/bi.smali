.class Lcom/facebook/orca/threadview/bi;
.super Lcom/facebook/orca/threadview/cb;
.source "ThreadViewFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 232
    iput-object p1, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0, p2}, Lcom/facebook/orca/threadview/cb;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .prologue
    .line 241
    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    .line 242
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 246
    :cond_0
    :goto_0
    return-void

    .line 243
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ThreadViewFragment;)J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gez v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/push/mqtt/cj;)V
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 236
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 259
    if-eqz p1, :cond_0

    .line 261
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 265
    :goto_0
    return-void

    .line 263
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    goto :goto_0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/orca/threadlist/s;

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 255
    :goto_0
    return-void

    .line 253
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/bi;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method
