.class Lcom/facebook/k/m;
.super Ljava/lang/Object;
.source "RadioPowerManager.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field private final a:Lcom/facebook/k/j;


# direct methods
.method public constructor <init>(Lcom/facebook/k/j;)V
    .locals 0

    .prologue
    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 297
    iput-object p1, p0, Lcom/facebook/k/m;->a:Lcom/facebook/k/j;

    .line 298
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/facebook/k/m;->a:Lcom/facebook/k/j;

    invoke-static {v0}, Lcom/facebook/k/j;->b(Lcom/facebook/k/j;)Lcom/facebook/common/hardware/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/hardware/k;->c()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 304
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Lcom/facebook/k/m;->a:Lcom/facebook/k/j;

    invoke-static {v0}, Lcom/facebook/k/j;->a(Lcom/facebook/k/j;)V

    .line 307
    :cond_0
    return-void
.end method
