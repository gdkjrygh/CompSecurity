.class public Lcom/facebook/messages/ipc/peer/e;
.super Ljava/lang/Object;
.source "MessageNotificationPeerHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/i/a/a/f;)I
    .locals 2

    .prologue
    .line 18
    invoke-static {p0}, Lcom/facebook/messages/ipc/peer/d;->c(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 20
    if-nez v0, :cond_0

    .line 21
    const/4 v0, 0x1

    .line 23
    :goto_0
    return v0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static a(Lcom/facebook/i/a/a/f;)V
    .locals 2

    .prologue
    .line 42
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->p:Landroid/net/Uri;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 44
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/facebook/i/a/a/f;)V
    .locals 2

    .prologue
    .line 37
    invoke-static {p0}, Lcom/facebook/messages/ipc/peer/d;->d(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 39
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/i/a/a/f;)V
    .locals 1

    .prologue
    .line 30
    invoke-static {p0}, Lcom/facebook/messages/ipc/peer/d;->c(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 33
    return-void
.end method
