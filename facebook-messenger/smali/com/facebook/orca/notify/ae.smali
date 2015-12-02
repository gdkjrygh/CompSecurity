.class Lcom/facebook/orca/notify/ae;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/ak;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/facebook/orca/notify/ae;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/ae;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/ak;
    .locals 5

    .prologue
    .line 110
    new-instance v4, Lcom/facebook/orca/notify/ak;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ae;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ae;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/os/Vibrator;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Vibrator;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ae;->e()Lcom/facebook/inject/ab;

    move-result-object v2

    const-class v3, Landroid/media/AudioManager;

    invoke-interface {v2, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/AudioManager;

    const-class v3, Lcom/facebook/orca/notify/an;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/notify/ae;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/notify/an;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/notify/ak;-><init>(Landroid/content/Context;Landroid/os/Vibrator;Landroid/media/AudioManager;Lcom/facebook/orca/notify/an;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/facebook/orca/notify/ae;->a()Lcom/facebook/orca/notify/ak;

    move-result-object v0

    return-object v0
.end method
