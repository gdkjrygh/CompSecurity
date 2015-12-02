.class Lcom/facebook/messages/ipc/peer/h;
.super Lcom/facebook/inject/d;
.source "MessageNotificationPeerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/i/a/a/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/messages/ipc/peer/f;


# direct methods
.method private constructor <init>(Lcom/facebook/messages/ipc/peer/f;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/messages/ipc/peer/h;->a:Lcom/facebook/messages/ipc/peer/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/messages/ipc/peer/f;Lcom/facebook/messages/ipc/peer/g;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0, p1}, Lcom/facebook/messages/ipc/peer/h;-><init>(Lcom/facebook/messages/ipc/peer/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/i/a/a/f;
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v4, 0x0

    .line 74
    const-class v0, Lcom/facebook/i/a/a/e;

    const-class v1, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/messages/ipc/peer/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/i/a/a/e;

    .line 76
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v2

    .line 77
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/h;->a:Lcom/facebook/messages/ipc/peer/f;

    invoke-static {v0}, Lcom/facebook/messages/ipc/peer/f;->a(Lcom/facebook/messages/ipc/peer/f;)Lcom/facebook/messages/ipc/peer/j;

    move-result-object v0

    sget-object v3, Lcom/facebook/messages/ipc/peer/j;->Dash:Lcom/facebook/messages/ipc/peer/j;

    if-ne v0, v3, :cond_1

    .line 78
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->a:Landroid/net/Uri;

    invoke-interface {v1, v0, v4}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 92
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "com.facebook.messages.ipc.peers."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/peer/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->j()Lcom/facebook/base/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/base/j;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 95
    new-instance v0, Lcom/facebook/i/a/a/g;

    invoke-virtual {v2}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v2

    const-class v3, Lcom/facebook/i/a/c;

    invoke-virtual {p0, v3}, Lcom/facebook/messages/ipc/peer/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/i/a/c;

    const-class v5, Lcom/facebook/base/broadcast/j;

    const-class v6, Lcom/facebook/base/broadcast/CrossFbAppBroadcast;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/messages/ipc/peer/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/base/broadcast/j;

    const-class v6, Lcom/facebook/messages/ipc/peer/f;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    const-class v7, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v7}, Lcom/facebook/messages/ipc/peer/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/i/a/a/g;-><init>(Lcom/facebook/i/a/a/e;Lcom/google/common/a/fi;Lcom/facebook/i/a/c;Ljava/lang/String;Lcom/facebook/base/broadcast/j;Ljava/lang/ClassLoader;Lcom/facebook/common/e/h;Z)V

    return-object v0

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/h;->a:Lcom/facebook/messages/ipc/peer/f;

    invoke-static {v0}, Lcom/facebook/messages/ipc/peer/f;->a(Lcom/facebook/messages/ipc/peer/f;)Lcom/facebook/messages/ipc/peer/j;

    move-result-object v0

    sget-object v3, Lcom/facebook/messages/ipc/peer/j;->Messenger:Lcom/facebook/messages/ipc/peer/j;

    if-ne v0, v3, :cond_2

    .line 80
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->e:Landroid/net/Uri;

    const/16 v3, 0x1f3

    invoke-interface {v1, v0, v3}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 81
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->m:Landroid/net/Uri;

    invoke-interface {v1, v0, v4}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 82
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->o:Landroid/net/Uri;

    invoke-interface {v1, v0, v4}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 83
    :cond_2
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/h;->a:Lcom/facebook/messages/ipc/peer/f;

    invoke-static {v0}, Lcom/facebook/messages/ipc/peer/f;->a(Lcom/facebook/messages/ipc/peer/f;)Lcom/facebook/messages/ipc/peer/j;

    move-result-object v0

    sget-object v3, Lcom/facebook/messages/ipc/peer/j;->Fb4a:Lcom/facebook/messages/ipc/peer/j;

    if-ne v0, v3, :cond_3

    .line 84
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->m:Landroid/net/Uri;

    invoke-interface {v1, v0, v8}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 85
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->o:Landroid/net/Uri;

    invoke-interface {v1, v0, v8}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto/16 :goto_0

    .line 87
    :cond_3
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/h;->a:Lcom/facebook/messages/ipc/peer/f;

    invoke-static {v0}, Lcom/facebook/messages/ipc/peer/f;->a(Lcom/facebook/messages/ipc/peer/f;)Lcom/facebook/messages/ipc/peer/j;

    move-result-object v0

    sget-object v3, Lcom/facebook/messages/ipc/peer/j;->PMA:Lcom/facebook/messages/ipc/peer/j;

    if-ne v0, v3, :cond_0

    .line 88
    sget-object v0, Lcom/facebook/messages/ipc/peer/d;->m:Landroid/net/Uri;

    const/4 v3, 0x2

    invoke-interface {v1, v0, v3}, Lcom/facebook/i/a/a/e;->a(Landroid/net/Uri;I)Lcom/facebook/i/a/a/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto/16 :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/peer/h;->a()Lcom/facebook/i/a/a/f;

    move-result-object v0

    return-object v0
.end method
