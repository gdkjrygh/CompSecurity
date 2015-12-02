.class Lcom/facebook/orca/login/ak;
.super Lcom/facebook/base/broadcast/q;
.source "WildfireSmsRequestOperation.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/login/ai;


# direct methods
.method constructor <init>(Lcom/facebook/orca/login/ai;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/facebook/orca/login/ak;->a:Lcom/facebook/orca/login/ai;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 113
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 115
    const-string v1, "com.facebook.orca.phonenumber.CONFIRMATION_CODE_RECEIVED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/login/ak;->a:Lcom/facebook/orca/login/ai;

    invoke-static {v0, p2}, Lcom/facebook/orca/login/ai;->a(Lcom/facebook/orca/login/ai;Landroid/content/Intent;)V

    .line 118
    :cond_0
    return-void
.end method
