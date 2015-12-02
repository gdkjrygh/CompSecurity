.class Lcom/facebook/orca/chatheads/cw;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/ch;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/cn;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/cn;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cw;->a:Lcom/facebook/orca/chatheads/cn;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 215
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/cw;-><init>(Lcom/facebook/orca/chatheads/cn;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/ch;
    .locals 7

    .prologue
    .line 219
    new-instance v0, Lcom/facebook/orca/chatheads/ch;

    const-class v1, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/chatheads/cw;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/i/a/a/f;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/chatheads/cw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/orca/chatheads/by;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/chatheads/cw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/chatheads/by;

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/chatheads/cw;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Ljava/lang/String;

    const-class v6, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/chatheads/cw;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/chatheads/ch;-><init>(Lcom/facebook/i/a/a/f;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/chatheads/by;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 215
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cw;->a()Lcom/facebook/orca/chatheads/ch;

    move-result-object v0

    return-object v0
.end method
