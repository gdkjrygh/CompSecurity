.class Lcom/facebook/orca/about/d;
.super Lcom/facebook/widget/text/f;
.source "MessengerAboutActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/about/MessengerAboutActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/facebook/orca/about/d;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-direct {p0}, Lcom/facebook/widget/text/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 117
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "http://m.facebook.com"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 118
    iget-object v1, p0, Lcom/facebook/orca/about/d;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-static {v1}, Lcom/facebook/orca/about/MessengerAboutActivity;->a(Lcom/facebook/orca/about/MessengerAboutActivity;)Lcom/facebook/c/s;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/about/d;->a:Lcom/facebook/orca/about/MessengerAboutActivity;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 119
    return-void
.end method
