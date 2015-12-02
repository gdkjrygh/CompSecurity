.class public Lcom/facebook/messages/ipc/peer/k;
.super Ljava/lang/Object;
.source "NotificationPeerRoleFactory.java"

# interfaces
.implements Lcom/facebook/i/a/a/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    new-instance v0, Lcom/facebook/messages/ipc/peer/c;

    invoke-direct {v0, p2}, Lcom/facebook/messages/ipc/peer/c;-><init>(I)V

    .line 26
    :goto_0
    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    new-instance v0, Lcom/facebook/messages/ipc/peer/b;

    invoke-direct {v0, p2}, Lcom/facebook/messages/ipc/peer/b;-><init>(I)V

    goto :goto_0

    .line 20
    :cond_1
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->m:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    new-instance v0, Lcom/facebook/messages/ipc/peer/m;

    invoke-direct {v0, p2}, Lcom/facebook/messages/ipc/peer/m;-><init>(I)V

    goto :goto_0

    .line 23
    :cond_2
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->o:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 24
    new-instance v0, Lcom/facebook/messages/ipc/peer/l;

    invoke-direct {v0, p2}, Lcom/facebook/messages/ipc/peer/l;-><init>(I)V

    goto :goto_0

    .line 26
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
