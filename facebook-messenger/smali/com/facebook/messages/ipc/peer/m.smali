.class public Lcom/facebook/messages/ipc/peer/m;
.super Lcom/facebook/i/a/a/b;
.source "UserInteractionPeerRole.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private b:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->m:Landroid/net/Uri;

    invoke-direct {p0, v0, p1}, Lcom/facebook/i/a/a/b;-><init>(Landroid/net/Uri;I)V

    .line 23
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    .line 42
    return-void
.end method

.method public a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->n:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 58
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    if-eqz v0, :cond_0

    .line 59
    const/4 v0, 0x1

    iput-boolean v0, p2, Lcom/facebook/i/a/a/d;->b:Z

    .line 63
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 27
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->n:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 30
    return-void
.end method

.method public a(Landroid/net/Uri;Ljava/lang/Object;)Z
    .locals 3
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 46
    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->n:Landroid/net/Uri;

    invoke-virtual {v1, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    iget-boolean v1, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    .line 48
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    .line 49
    iget-boolean v2, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    if-eq v1, v2, :cond_0

    const/4 v0, 0x1

    .line 51
    :cond_0
    return v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 34
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->n:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/m;->b:Z

    .line 37
    return-void
.end method
