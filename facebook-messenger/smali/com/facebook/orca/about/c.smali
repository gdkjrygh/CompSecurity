.class Lcom/facebook/orca/about/c;
.super Ljava/lang/Object;
.source "MessengerAboutActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/about/MessengerAboutActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/orca/about/c;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 100
    const-string v0, "http://m.facebook.com/terms.php"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 101
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/about/c;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-static {v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->a(Lcom/facebook/orca/about/MessengerAboutActivity;)Lcom/facebook/c/s;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/about/c;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 103
    return-void
.end method
