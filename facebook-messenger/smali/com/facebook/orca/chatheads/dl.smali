.class Lcom/facebook/orca/chatheads/dl;
.super Lcom/facebook/orca/threadview/cb;
.source "ChatThreadView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0, p2}, Lcom/facebook/orca/threadview/cb;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .prologue
    .line 237
    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->f()V

    .line 242
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->c(Lcom/facebook/orca/chatheads/dh;)J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gez v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->f()V

    goto :goto_0
.end method

.method public a(Lcom/facebook/push/mqtt/cj;)V
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->f()V

    .line 232
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 251
    if-eqz p1, :cond_0

    .line 253
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 257
    :goto_0
    return-void

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->f()V

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dl;->a:Lcom/facebook/orca/chatheads/dh;

    const-string v1, "thread_updates_finish"

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;Ljava/lang/String;)V

    .line 247
    return-void
.end method
