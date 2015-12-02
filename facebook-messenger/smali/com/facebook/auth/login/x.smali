.class Lcom/facebook/auth/login/x;
.super Lcom/facebook/base/broadcast/q;
.source "AuthenticatedActivityHelper.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/w;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/w;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/auth/login/x;->a:Lcom/facebook/auth/login/w;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/auth/login/x;->a:Lcom/facebook/auth/login/w;

    invoke-static {v0}, Lcom/facebook/auth/login/w;->a(Lcom/facebook/auth/login/w;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 71
    return-void
.end method
