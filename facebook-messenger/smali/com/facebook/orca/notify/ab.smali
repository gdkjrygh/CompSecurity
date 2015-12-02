.class Lcom/facebook/orca/notify/ab;
.super Lcom/facebook/inject/d;
.source "MessageNotificationModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/notify/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/x;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/notify/x;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/facebook/orca/notify/ab;->a:Lcom/facebook/orca/notify/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/notify/x;Lcom/facebook/orca/notify/y;)V
    .locals 0

    .prologue
    .line 161
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/ab;-><init>(Lcom/facebook/orca/notify/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/f;
    .locals 14

    .prologue
    .line 166
    new-instance v0, Lcom/facebook/orca/notify/f;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ab;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ab;->e()Lcom/facebook/inject/ab;

    move-result-object v2

    const-class v3, Landroid/app/NotificationManager;

    invoke-interface {v2, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    const-class v3, Lcom/facebook/orca/notify/an;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/notify/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/notify/an;

    const-class v4, Lcom/facebook/orca/notify/ak;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/notify/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/notify/ak;

    const-class v5, Lcom/facebook/messages/ipc/k;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/notify/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/messages/ipc/k;

    const-class v6, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/notify/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/prefs/shared/d;

    const-class v7, Lcom/facebook/ui/images/b/h;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/notify/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/ui/images/b/h;

    const-class v8, Lcom/facebook/user/tiles/c;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/notify/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/user/tiles/c;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ab;->e()Lcom/facebook/inject/ab;

    move-result-object v9

    const-class v10, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v9, v10}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ab;->e()Lcom/facebook/inject/ab;

    move-result-object v10

    const-class v11, Landroid/app/KeyguardManager;

    invoke-interface {v10, v11}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/app/KeyguardManager;

    invoke-virtual {p0}, Lcom/facebook/orca/notify/ab;->e()Lcom/facebook/inject/ab;

    move-result-object v11

    const-class v12, Landroid/os/PowerManager;

    invoke-interface {v11, v12}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/os/PowerManager;

    const-class v12, Ljava/lang/Boolean;

    const-class v13, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsEnabled;

    invoke-virtual {p0, v12, v13}, Lcom/facebook/orca/notify/ab;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v12

    invoke-direct/range {v0 .. v12}, Lcom/facebook/orca/notify/f;-><init>(Landroid/content/Context;Landroid/app/NotificationManager;Lcom/facebook/orca/notify/an;Lcom/facebook/orca/notify/ak;Lcom/facebook/messages/ipc/k;Lcom/facebook/prefs/shared/d;Lcom/facebook/ui/images/b/h;Lcom/facebook/user/tiles/c;Lcom/facebook/fbservice/ops/k;Landroid/app/KeyguardManager;Landroid/os/PowerManager;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 161
    invoke-virtual {p0}, Lcom/facebook/orca/notify/ab;->a()Lcom/facebook/orca/notify/f;

    move-result-object v0

    return-object v0
.end method
