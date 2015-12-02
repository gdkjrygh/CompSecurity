.class public Lcom/facebook/messages/ipc/peer/f;
.super Lcom/facebook/inject/c;
.source "MessageNotificationPeerModule.java"


# instance fields
.field private final a:Lcom/facebook/messages/ipc/peer/j;


# direct methods
.method public constructor <init>(Lcom/facebook/messages/ipc/peer/j;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/facebook/messages/ipc/peer/f;->a:Lcom/facebook/messages/ipc/peer/j;

    .line 45
    return-void
.end method

.method static synthetic a(Lcom/facebook/messages/ipc/peer/f;)Lcom/facebook/messages/ipc/peer/j;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/messages/ipc/peer/f;->a:Lcom/facebook/messages/ipc/peer/j;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 49
    const-class v0, Lcom/facebook/messages/ipc/f;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/peer/f;->e(Ljava/lang/Class;)V

    .line 50
    const-class v0, Lcom/facebook/i/a/n;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/peer/f;->e(Ljava/lang/Class;)V

    .line 52
    const-class v0, Lcom/facebook/i/a/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/peer/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/messages/ipc/peer/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/messages/ipc/peer/i;-><init>(Lcom/facebook/messages/ipc/peer/f;Lcom/facebook/messages/ipc/peer/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 57
    const-class v0, Lcom/facebook/i/a/a/f;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/peer/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/messages/ipc/peer/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/messages/ipc/peer/h;-><init>(Lcom/facebook/messages/ipc/peer/f;Lcom/facebook/messages/ipc/peer/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 62
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/messages/ipc/peer/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 65
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/ipc/peer/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 67
    return-void
.end method
