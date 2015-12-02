.class public Lcom/facebook/auth/broadcast/CrossProcessLogoutReceiver;
.super Lcom/facebook/c/m;
.source "CrossProcessLogoutReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    const-string v0, "AUTH_LOGOUT"

    invoke-direct {p0, v0}, Lcom/facebook/c/m;-><init>(Ljava/lang/String;)V

    .line 32
    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 37
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 38
    const-class v1, Lcom/facebook/auth/broadcast/CrossProcessLogoutService;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 39
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 40
    return-void
.end method
