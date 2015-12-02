.class Lcom/facebook/selfupdate/ah;
.super Ljava/lang/Object;
.source "SelfUpdateNotifier.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/af;


# direct methods
.method constructor <init>(Lcom/facebook/selfupdate/af;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Lcom/facebook/selfupdate/ah;->a:Lcom/facebook/selfupdate/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 1

    .prologue
    .line 432
    iget-object v0, p0, Lcom/facebook/selfupdate/ah;->a:Lcom/facebook/selfupdate/af;

    invoke-virtual {v0}, Lcom/facebook/selfupdate/af;->f()V

    .line 433
    iget-object v0, p0, Lcom/facebook/selfupdate/ah;->a:Lcom/facebook/selfupdate/af;

    invoke-static {v0}, Lcom/facebook/selfupdate/af;->c(Lcom/facebook/selfupdate/af;)Lcom/facebook/base/broadcast/l;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/facebook/selfupdate/ah;->a:Lcom/facebook/selfupdate/af;

    invoke-static {v0}, Lcom/facebook/selfupdate/af;->c(Lcom/facebook/selfupdate/af;)Lcom/facebook/base/broadcast/l;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->c()V

    .line 436
    :cond_0
    return-void
.end method
