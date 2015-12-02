.class Lcom/facebook/orca/chatheads/cp;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/cn;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/cn;)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cp;->a:Lcom/facebook/orca/chatheads/cn;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 250
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/cp;-><init>(Lcom/facebook/orca/chatheads/cn;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/a;
    .locals 3

    .prologue
    .line 254
    new-instance v1, Lcom/facebook/orca/f/a;

    const-class v0, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/chatheads/cp;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/a/f;

    invoke-direct {v1, v0}, Lcom/facebook/orca/f/a;-><init>(Lcom/facebook/i/a/a/f;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 250
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cp;->a()Lcom/facebook/orca/f/a;

    move-result-object v0

    return-object v0
.end method
