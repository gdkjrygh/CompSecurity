.class Lcom/facebook/orca/notify/z;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lcom/facebook/orca/notify/z;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 183
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/z;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/d;
    .locals 8

    .prologue
    .line 188
    new-instance v0, Lcom/facebook/orca/notify/d;

    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/notify/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/notify/ak;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/notify/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/notify/ak;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/z;->e()Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Landroid/app/KeyguardManager;

    invoke-interface {v3, v4}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/KeyguardManager;

    const-class v4, Lcom/facebook/orca/notify/at;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/notify/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/notify/at;

    const-class v5, Lcom/facebook/b/a/b;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/notify/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/b/a/b;

    const-class v6, Lcom/facebook/i/a/a/f;

    const-class v7, Lcom/facebook/messages/ipc/peer/MessageNotificationPeer;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/notify/z;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/i/a/a/f;

    const-class v7, Lcom/facebook/common/hardware/q;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/notify/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/hardware/q;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/notify/d;-><init>(Ljavax/inject/a;Lcom/facebook/orca/notify/ak;Landroid/app/KeyguardManager;Lcom/facebook/orca/notify/at;Lcom/facebook/b/a/b;Lcom/facebook/i/a/a/f;Lcom/facebook/common/hardware/q;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 183
    invoke-virtual {p0}, Lcom/facebook/orca/notify/z;->a()Lcom/facebook/orca/notify/d;

    move-result-object v0

    return-object v0
.end method
