.class Lcom/facebook/e/e;
.super Ljava/lang/Object;
.source "DeviceConditionHelper.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/e/c;


# direct methods
.method constructor <init>(Lcom/facebook/e/c;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/e/e;->a:Lcom/facebook/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 83
    const-string v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/NetworkInfo;

    .line 84
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/facebook/e/e;->a:Lcom/facebook/e/c;

    sget-object v1, Lcom/facebook/e/g;->WIFI_UNKNOWN:Lcom/facebook/e/g;

    invoke-static {v0, v1}, Lcom/facebook/e/c;->a(Lcom/facebook/e/c;Lcom/facebook/e/g;)V

    .line 89
    :goto_0
    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/facebook/e/e;->a:Lcom/facebook/e/c;

    sget-object v1, Lcom/facebook/e/g;->WIFI_OFF:Lcom/facebook/e/g;

    invoke-static {v0, v1}, Lcom/facebook/e/c;->a(Lcom/facebook/e/c;Lcom/facebook/e/g;)V

    goto :goto_0
.end method
