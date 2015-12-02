.class Lcom/facebook/push/c2dm/b;
.super Ljava/lang/Object;
.source "C2DMBroadcastReceiver.java"

# interfaces
.implements Lcom/facebook/c/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/a;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/push/c2dm/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 37
    invoke-static {}, Lcom/facebook/push/c2dm/C2DMBroadcastReceiver;->a()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "received intent with action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 38
    invoke-static {p1, p2}, Lcom/facebook/push/c2dm/C2DMService;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 39
    const/4 v0, -0x1

    invoke-interface {p3, v0, v3, v3}, Lcom/facebook/c/c;->setResult(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 40
    return-void
.end method
