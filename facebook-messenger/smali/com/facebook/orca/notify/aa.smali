.class Lcom/facebook/orca/notify/aa;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lcom/facebook/orca/notify/aa;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/aa;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/e;
    .locals 8

    .prologue
    .line 233
    new-instance v0, Lcom/facebook/orca/notify/e;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/aa;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/messages/ipc/e;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/notify/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/messages/ipc/e;

    const-class v3, Lcom/facebook/messages/ipc/c;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/notify/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/messages/ipc/c;

    const-class v4, Lcom/facebook/messages/ipc/k;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/notify/aa;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/messages/ipc/k;

    const-class v5, Ljava/lang/String;

    const-class v6, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/notify/aa;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/i/a/a/f;

    const-class v7, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/notify/aa;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/i/a/a/f;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/notify/e;-><init>(Landroid/content/Context;Lcom/facebook/messages/ipc/e;Lcom/facebook/messages/ipc/c;Lcom/facebook/messages/ipc/k;Ljavax/inject/a;Lcom/facebook/i/a/a/f;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 228
    invoke-virtual {p0}, Lcom/facebook/orca/notify/aa;->a()Lcom/facebook/orca/notify/e;

    move-result-object v0

    return-object v0
.end method
