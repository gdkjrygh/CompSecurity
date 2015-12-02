.class public Lcom/facebook/messages/ipc/peer/c;
.super Lcom/facebook/i/a/a/b;
.source "DashPeerRole.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final b:Lcom/facebook/messages/ipc/peer/a;

.field private c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    invoke-direct {p0, v0, p1}, Lcom/facebook/i/a/a/b;-><init>(Landroid/net/Uri;I)V

    .line 26
    new-instance v0, Lcom/facebook/messages/ipc/peer/a;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->c:Landroid/net/Uri;

    const-string v2, "peer://msg_notification_dash/active_threads"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/ipc/peer/a;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    .line 30
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0}, Lcom/facebook/messages/ipc/peer/a;->a()V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/c;->c:Z

    .line 50
    return-void
.end method

.method public a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V
    .locals 1

    .prologue
    .line 71
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->d:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/c;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 73
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/c;->c:Z

    if-eqz v0, :cond_0

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p2, Lcom/facebook/i/a/a/d;->b:Z

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 34
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->d:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/messages/ipc/peer/c;->c:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 36
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/os/Bundle;)V

    .line 37
    return-void
.end method

.method public a(Landroid/net/Uri;Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 54
    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->b:Landroid/net/Uri;

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 55
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/peer/c;->a()V

    .line 65
    :goto_0
    return v0

    .line 57
    :cond_0
    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->d:Landroid/net/Uri;

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 58
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 59
    iget-boolean v3, p0, Lcom/facebook/messages/ipc/peer/c;->c:Z

    if-eq v2, v3, :cond_1

    .line 60
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/messages/ipc/peer/c;->c:Z

    goto :goto_0

    :cond_1
    move v0, v1

    .line 59
    goto :goto_1

    .line 62
    :cond_2
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 63
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_3
    move v0, v1

    .line 65
    goto :goto_0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 41
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->d:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/c;->c:Z

    .line 43
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/c;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/ipc/peer/a;->b(Landroid/os/Bundle;)V

    .line 44
    return-void
.end method
