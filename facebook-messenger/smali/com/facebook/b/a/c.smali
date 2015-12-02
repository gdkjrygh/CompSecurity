.class Lcom/facebook/b/a/c;
.super Ljava/lang/Object;
.source "ChatHeadsBroadcaster.java"

# interfaces
.implements Lcom/facebook/i/a/a/a;


# instance fields
.field final synthetic a:Lcom/facebook/b/a/b;


# direct methods
.method constructor <init>(Lcom/facebook/b/a/b;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/b/a/c;->a:Lcom/facebook/b/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;ZLcom/facebook/i/a/a/f;)V
    .locals 3

    .prologue
    .line 68
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 69
    iget-object v0, p0, Lcom/facebook/b/a/c;->a:Lcom/facebook/b/a/b;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Lcom/facebook/common/w/q;->valueOf(Z)Lcom/facebook/common/w/q;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/b/a/b;->a(Lcom/facebook/b/a/b;Lcom/facebook/common/w/q;)Lcom/facebook/common/w/q;

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    const-string v0, "disconnected"

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    iget-object v0, p0, Lcom/facebook/b/a/c;->a:Lcom/facebook/b/a/b;

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-static {v0, v1}, Lcom/facebook/b/a/b;->a(Lcom/facebook/b/a/b;Lcom/facebook/common/w/q;)Lcom/facebook/common/w/q;

    goto :goto_0

    .line 76
    :cond_2
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->f:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/facebook/b/a/c;->a:Lcom/facebook/b/a/b;

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-static {v0, v1}, Lcom/facebook/b/a/b;->a(Lcom/facebook/b/a/b;Lcom/facebook/common/w/q;)Lcom/facebook/common/w/q;

    goto :goto_0
.end method
