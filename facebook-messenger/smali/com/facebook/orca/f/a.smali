.class public Lcom/facebook/orca/f/a;
.super Ljava/lang/Object;
.source "ActiveChatHeadsManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/i/a/a/f;

.field private final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/messages/threads/model/b;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/i/a/a/f;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/f/a;->a:Lcom/facebook/i/a/a/f;

    .line 28
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/a;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 29
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/f/a;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 57
    iget-object v0, p0, Lcom/facebook/orca/f/a;->a:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->g:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 59
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/b;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 32
    if-nez p1, :cond_1

    .line 41
    :cond_0
    :goto_0
    return-void

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/f/a;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/b;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/facebook/orca/f/a;->a:Lcom/facebook/i/a/a/f;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/messages/ipc/peer/d;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b(Lcom/facebook/messages/threads/model/b;)V
    .locals 3

    .prologue
    .line 44
    if-nez p1, :cond_1

    .line 53
    :cond_0
    :goto_0
    return-void

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/f/a;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/b;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/f/a;->a:Lcom/facebook/i/a/a/f;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/messages/ipc/peer/d;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    goto :goto_0
.end method
