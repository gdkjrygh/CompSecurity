.class Lcom/facebook/orca/messageview/b;
.super Lcom/facebook/base/broadcast/q;
.source "MessageViewActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/messageview/MessageViewActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/messageview/MessageViewActivity;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/orca/messageview/b;->a:Lcom/facebook/orca/messageview/MessageViewActivity;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 86
    const-string v0, "threadid"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/facebook/orca/messageview/b;->a:Lcom/facebook/orca/messageview/MessageViewActivity;

    invoke-static {v1}, Lcom/facebook/orca/messageview/MessageViewActivity;->a(Lcom/facebook/orca/messageview/MessageViewActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const-string v0, "message_ids"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/facebook/orca/messageview/b;->a:Lcom/facebook/orca/messageview/MessageViewActivity;

    invoke-static {v1}, Lcom/facebook/orca/messageview/MessageViewActivity;->b(Lcom/facebook/orca/messageview/MessageViewActivity;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/messageview/b;->a:Lcom/facebook/orca/messageview/MessageViewActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/MessageViewActivity;->finish()V

    .line 93
    :cond_0
    return-void
.end method
