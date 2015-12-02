.class Lcom/facebook/push/mqtt/q;
.super Ljava/lang/Object;
.source "KeepaliveManager.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/o;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/o;)V
    .locals 0

    .prologue
    .line 386
    iput-object p1, p0, Lcom/facebook/push/mqtt/q;->a:Lcom/facebook/push/mqtt/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/o;Lcom/facebook/push/mqtt/p;)V
    .locals 0

    .prologue
    .line 386
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/q;-><init>(Lcom/facebook/push/mqtt/o;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 5

    .prologue
    .line 389
    invoke-static {}, Lcom/facebook/push/mqtt/o;->a()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Checking cycle due to alarm wake-up %s."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    iget-object v0, p0, Lcom/facebook/push/mqtt/q;->a:Lcom/facebook/push/mqtt/o;

    invoke-static {v0}, Lcom/facebook/push/mqtt/o;->a(Lcom/facebook/push/mqtt/o;)V

    .line 392
    return-void
.end method
