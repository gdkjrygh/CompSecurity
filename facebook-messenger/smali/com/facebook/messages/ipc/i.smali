.class Lcom/facebook/messages/ipc/i;
.super Lcom/facebook/inject/d;
.source "MessagesIpcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/messages/ipc/l;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/messages/ipc/g;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/messages/ipc/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/ipc/l;
    .locals 1

    .prologue
    .line 58
    new-instance v0, Lcom/facebook/messages/ipc/l;

    invoke-direct {v0}, Lcom/facebook/messages/ipc/l;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/i;->a()Lcom/facebook/messages/ipc/l;

    move-result-object v0

    return-object v0
.end method
