.class public Lcom/facebook/messages/ipc/peer/b;
.super Lcom/facebook/i/a/a/b;
.source "ChatHeadPeerRole.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final b:Lcom/facebook/messages/ipc/peer/a;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .prologue
    .line 26
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    invoke-direct {p0, v0, p1}, Lcom/facebook/i/a/a/b;-><init>(Landroid/net/Uri;I)V

    .line 28
    new-instance v0, Lcom/facebook/messages/ipc/peer/a;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->g:Landroid/net/Uri;

    const-string v2, "peer://msg_notification_chathead/active_threads"

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/ipc/peer/a;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    .line 32
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 61
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0}, Lcom/facebook/messages/ipc/peer/a;->a()V

    .line 62
    iput-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    .line 63
    iput-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    .line 64
    iput-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    .line 65
    iput-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    .line 66
    return-void
.end method

.method public a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 98
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/d;)V

    .line 121
    :cond_0
    :goto_0
    return-void

    .line 100
    :cond_1
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 102
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    if-eqz v0, :cond_0

    .line 103
    iput-boolean v1, p2, Lcom/facebook/i/a/a/d;->b:Z

    goto :goto_0

    .line 105
    :cond_2
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 107
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    if-eqz v0, :cond_0

    .line 108
    iput-boolean v1, p2, Lcom/facebook/i/a/a/d;->b:Z

    goto :goto_0

    .line 110
    :cond_3
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 111
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 112
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    if-eqz v0, :cond_0

    .line 113
    iput-boolean v1, p2, Lcom/facebook/i/a/a/d;->b:Z

    goto :goto_0

    .line 115
    :cond_4
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/facebook/i/a/a/d;->a:Ljava/lang/Object;

    .line 117
    iget-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    if-eqz v0, :cond_0

    .line 118
    iput-boolean v1, p2, Lcom/facebook/i/a/a/d;->b:Z

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/os/Bundle;)V

    .line 37
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 38
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 40
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 42
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 44
    return-void
.end method

.method public a(Landroid/net/Uri;Ljava/lang/Object;)Z
    .locals 4
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 70
    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->f:Landroid/net/Uri;

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 71
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/peer/b;->a()V

    .line 92
    :cond_0
    :goto_0
    return v0

    .line 73
    :cond_1
    iget-object v2, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v2, p1}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 74
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/messages/ipc/peer/a;->a(Landroid/net/Uri;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 75
    :cond_2
    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 76
    iget-boolean v2, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    .line 77
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    .line 78
    iget-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    if-ne v2, v3, :cond_0

    move v0, v1

    goto :goto_0

    .line 79
    :cond_3
    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 80
    iget-boolean v2, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    .line 81
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    .line 82
    iget-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    if-ne v2, v3, :cond_0

    move v0, v1

    goto :goto_0

    .line 83
    :cond_4
    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 84
    iget-boolean v2, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    .line 85
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    .line 86
    iget-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    if-ne v2, v3, :cond_0

    move v0, v1

    goto :goto_0

    .line 87
    :cond_5
    sget-object v2, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 88
    iget-boolean v2, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    .line 89
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    .line 90
    iget-boolean v3, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    if-ne v2, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_6
    move v0, v1

    .line 92
    goto :goto_0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 48
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/b;->b:Lcom/facebook/messages/ipc/peer/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/ipc/peer/a;->b(Landroid/os/Bundle;)V

    .line 49
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->h:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->c:Z

    .line 51
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->d:Z

    .line 53
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->j:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->e:Z

    .line 55
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/ipc/peer/b;->f:Z

    .line 57
    return-void
.end method
