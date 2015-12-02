.class Lcom/facebook/selfupdate/n;
.super Ljava/lang/Object;
.source "SelfUpdateInstallActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/facebook/inject/t;

.field final synthetic c:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;


# direct methods
.method constructor <init>(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;Landroid/net/Uri;Lcom/facebook/inject/t;)V
    .locals 0

    .prologue
    .line 235
    iput-object p1, p0, Lcom/facebook/selfupdate/n;->c:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    iput-object p2, p0, Lcom/facebook/selfupdate/n;->a:Landroid/net/Uri;

    iput-object p3, p0, Lcom/facebook/selfupdate/n;->b:Lcom/facebook/inject/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 238
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    iget-object v2, p0, Lcom/facebook/selfupdate/n;->a:Landroid/net/Uri;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 239
    iget-object v0, p0, Lcom/facebook/selfupdate/n;->b:Lcom/facebook/inject/t;

    const-class v2, Lcom/facebook/c/s;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    .line 240
    iget-object v2, p0, Lcom/facebook/selfupdate/n;->c:Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 241
    return-void
.end method
