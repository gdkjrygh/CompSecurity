.class Lcom/facebook/orca/f/v;
.super Ljava/lang/Object;
.source "SendMessageManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/facebook/orca/f/r;


# direct methods
.method constructor <init>(Lcom/facebook/orca/f/r;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 643
    iput-object p1, p0, Lcom/facebook/orca/f/v;->c:Lcom/facebook/orca/f/r;

    iput-object p2, p0, Lcom/facebook/orca/f/v;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/orca/f/v;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 647
    iget-object v0, p0, Lcom/facebook/orca/f/v;->c:Lcom/facebook/orca/f/r;

    invoke-static {v0}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/orca/f/r;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/f/v;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 677
    :goto_0
    return-void

    .line 653
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/f/v;->c:Lcom/facebook/orca/f/r;

    invoke-static {v0}, Lcom/facebook/orca/f/r;->c(Lcom/facebook/orca/f/r;)Lcom/facebook/orca/f/ad;

    move-result-object v1

    iget-object v0, p0, Lcom/facebook/orca/f/v;->c:Lcom/facebook/orca/f/r;

    invoke-static {v0}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/orca/f/r;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    iget-object v2, p0, Lcom/facebook/orca/f/v;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 655
    if-nez v0, :cond_2

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 657
    :goto_1
    new-instance v1, Lcom/facebook/orca/f/w;

    invoke-direct {v1, p0}, Lcom/facebook/orca/f/w;-><init>(Lcom/facebook/orca/f/v;)V

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/common/a/gb;->a(Ljava/lang/Iterable;Lcom/google/common/base/Predicate;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 668
    if-nez v0, :cond_3

    .line 676
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/f/v;->c:Lcom/facebook/orca/f/r;

    invoke-static {v0}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/orca/f/r;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/f/v;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 655
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_1

    .line 670
    :cond_3
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v1

    const/16 v2, 0x385

    if-ne v1, v2, :cond_4

    .line 671
    iget-object v0, p0, Lcom/facebook/orca/f/v;->c:Lcom/facebook/orca/f/r;

    invoke-static {v0}, Lcom/facebook/orca/f/r;->d(Lcom/facebook/orca/f/r;)Lcom/facebook/orca/notify/av;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/f/v;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/av;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 672
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    if-nez v0, :cond_1

    .line 673
    iget-object v0, p0, Lcom/facebook/orca/f/v;->c:Lcom/facebook/orca/f/r;

    iget-object v1, p0, Lcom/facebook/orca/f/v;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/r;->a(Ljava/lang/String;)V

    goto :goto_2
.end method
