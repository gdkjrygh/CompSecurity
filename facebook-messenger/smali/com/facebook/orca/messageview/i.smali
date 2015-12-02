.class Lcom/facebook/orca/messageview/i;
.super Ljava/lang/Object;
.source "MessageViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/messages/model/threads/Message;

.field final synthetic b:Lcom/facebook/orca/messageview/MessageViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/messageview/MessageViewFragment;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lcom/facebook/orca/messageview/i;->b:Lcom/facebook/orca/messageview/MessageViewFragment;

    iput-object p2, p0, Lcom/facebook/orca/messageview/i;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 340
    iget-object v0, p0, Lcom/facebook/orca/messageview/i;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    .line 342
    iget-object v1, p0, Lcom/facebook/orca/messageview/i;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v4

    invoke-static {v1, v2, v3, v4, v5}, Lcom/facebook/location/ab;->a(Ljava/lang/String;DD)Landroid/net/Uri;

    move-result-object v0

    .line 344
    if-nez v0, :cond_1

    .line 352
    :cond_0
    :goto_0
    return-void

    .line 347
    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 348
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 349
    iget-object v0, p0, Lcom/facebook/orca/messageview/i;->b:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/facebook/common/j/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/facebook/orca/messageview/i;->b:Lcom/facebook/orca/messageview/MessageViewFragment;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/content/Intent;)V

    goto :goto_0
.end method
