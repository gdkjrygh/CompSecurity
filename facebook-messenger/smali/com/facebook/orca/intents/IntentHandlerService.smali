.class public Lcom/facebook/orca/intents/IntentHandlerService;
.super Lcom/facebook/base/d/b;
.source "IntentHandlerService.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/base/d/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    return-object v0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/facebook/orca/intents/IntentHandlerService;->a()Lcom/facebook/inject/t;

    move-result-object v0

    .line 33
    const-class v1, Lcom/facebook/orca/intents/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/intents/b;

    .line 35
    invoke-virtual {v0, p1}, Lcom/facebook/orca/intents/b;->a(Landroid/content/Intent;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 36
    new-instance v1, Lcom/facebook/orca/intents/d;

    invoke-direct {v1, p0, p3}, Lcom/facebook/orca/intents/d;-><init>(Lcom/facebook/orca/intents/IntentHandlerService;I)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 47
    const/4 v0, 0x2

    return v0
.end method
