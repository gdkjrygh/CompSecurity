.class Lcom/facebook/e/d;
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
    .line 67
    iput-object p1, p0, Lcom/facebook/e/d;->a:Lcom/facebook/e/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 70
    const-string v0, "connected"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 71
    if-nez v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/facebook/e/d;->a:Lcom/facebook/e/c;

    sget-object v1, Lcom/facebook/e/g;->WIFI_OFF:Lcom/facebook/e/g;

    invoke-static {v0, v1}, Lcom/facebook/e/c;->a(Lcom/facebook/e/c;Lcom/facebook/e/g;)V

    .line 75
    :cond_0
    return-void
.end method
