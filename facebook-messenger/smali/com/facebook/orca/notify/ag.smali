.class Lcom/facebook/orca/notify/ag;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/at;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/facebook/orca/notify/ag;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 128
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/ag;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/at;
    .locals 3

    .prologue
    .line 133
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 134
    const-class v1, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-static {v1, v2}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/notify/ag;->d(Lcom/google/inject/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 135
    const-class v0, Lcom/facebook/i/a/a/f;

    const-class v1, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/notify/ag;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 138
    :cond_0
    new-instance v1, Lcom/facebook/orca/notify/at;

    invoke-direct {v1, v0}, Lcom/facebook/orca/notify/at;-><init>(Lcom/google/common/base/Optional;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 128
    invoke-virtual {p0}, Lcom/facebook/orca/notify/ag;->a()Lcom/facebook/orca/notify/at;

    move-result-object v0

    return-object v0
.end method
