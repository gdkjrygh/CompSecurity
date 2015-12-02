.class Lcom/facebook/orca/chatheads/ap;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/messages/model/threads/Message;

.field final synthetic b:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 917
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ap;->b:Lcom/facebook/orca/chatheads/al;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/ap;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 920
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ap;->b:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->s(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ap;->b:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ap;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 922
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ap;->b:Lcom/facebook/orca/chatheads/al;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ap;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/al;->b(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;)V

    .line 924
    :cond_0
    return-void
.end method
