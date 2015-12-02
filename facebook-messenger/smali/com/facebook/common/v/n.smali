.class Lcom/facebook/common/v/n;
.super Lcom/facebook/inject/d;
.source "UserInteractionModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/v/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/common/v/k;


# direct methods
.method private constructor <init>(Lcom/facebook/common/v/k;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/common/v/n;->a:Lcom/facebook/common/v/k;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/v/k;Lcom/facebook/common/v/l;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/common/v/n;-><init>(Lcom/facebook/common/v/k;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/v/a;
    .locals 7

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/common/v/a;

    const-class v1, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v1}, Lcom/facebook/common/v/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/base/broadcast/a;

    const-class v2, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v2}, Lcom/facebook/common/v/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/executors/a;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/common/v/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    const-class v4, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v5, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/common/v/n;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p0}, Lcom/facebook/common/v/n;->e()Lcom/facebook/inject/ab;

    move-result-object v5

    const-class v6, Landroid/app/KeyguardManager;

    invoke-interface {v5, v6}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/KeyguardManager;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/common/v/a;-><init>(Lcom/facebook/base/broadcast/a;Lcom/facebook/common/executors/a;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Landroid/app/KeyguardManager;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/facebook/common/v/n;->a()Lcom/facebook/common/v/a;

    move-result-object v0

    return-object v0
.end method
