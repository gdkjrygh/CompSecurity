.class Lcom/facebook/selfupdate/ag;
.super Ljava/lang/Object;
.source "SelfUpdateNotifier.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/facebook/selfupdate/af;


# direct methods
.method constructor <init>(Lcom/facebook/selfupdate/af;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lcom/facebook/selfupdate/ag;->b:Lcom/facebook/selfupdate/af;

    iput-object p2, p0, Lcom/facebook/selfupdate/ag;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 312
    iget-object v0, p0, Lcom/facebook/selfupdate/ag;->b:Lcom/facebook/selfupdate/af;

    invoke-static {v0}, Lcom/facebook/selfupdate/af;->b(Lcom/facebook/selfupdate/af;)Lcom/facebook/c/s;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/selfupdate/ag;->a:Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/selfupdate/ag;->b:Lcom/facebook/selfupdate/af;

    invoke-static {v2}, Lcom/facebook/selfupdate/af;->a(Lcom/facebook/selfupdate/af;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 313
    return-void
.end method
