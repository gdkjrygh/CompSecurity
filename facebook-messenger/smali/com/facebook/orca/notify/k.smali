.class Lcom/facebook/orca/notify/k;
.super Ljava/lang/Object;
.source "InAppMessagingNotificationHandler.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/ap;

.field final synthetic b:Lcom/facebook/orca/notify/j;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/ap;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/facebook/orca/notify/k;->b:Lcom/facebook/orca/notify/j;

    iput-object p2, p0, Lcom/facebook/orca/notify/k;->a:Lcom/facebook/orca/notify/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 145
    iget-object v0, p0, Lcom/facebook/orca/notify/k;->b:Lcom/facebook/orca/notify/j;

    iget-object v1, p0, Lcom/facebook/orca/notify/k;->a:Lcom/facebook/orca/notify/ap;

    invoke-virtual {v1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/j;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 148
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/k;->b:Lcom/facebook/orca/notify/j;

    iget-object v1, p0, Lcom/facebook/orca/notify/k;->a:Lcom/facebook/orca/notify/ap;

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/ap;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 142
    invoke-virtual {p0}, Lcom/facebook/orca/notify/k;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
