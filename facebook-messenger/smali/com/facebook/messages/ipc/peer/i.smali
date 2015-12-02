.class Lcom/facebook/messages/ipc/peer/i;
.super Lcom/facebook/inject/d;
.source "MessageNotificationPeerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/i/a/a/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/messages/ipc/peer/f;


# direct methods
.method private constructor <init>(Lcom/facebook/messages/ipc/peer/f;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/facebook/messages/ipc/peer/i;->a:Lcom/facebook/messages/ipc/peer/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/messages/ipc/peer/f;Lcom/facebook/messages/ipc/peer/g;)V
    .locals 0

    .prologue
    .line 107
    invoke-direct {p0, p1}, Lcom/facebook/messages/ipc/peer/i;-><init>(Lcom/facebook/messages/ipc/peer/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/i/a/a/e;
    .locals 1

    .prologue
    .line 111
    new-instance v0, Lcom/facebook/messages/ipc/peer/k;

    invoke-direct {v0}, Lcom/facebook/messages/ipc/peer/k;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 107
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/peer/i;->a()Lcom/facebook/i/a/a/e;

    move-result-object v0

    return-object v0
.end method
