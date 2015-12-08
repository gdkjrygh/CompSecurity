.class public Lcom/thetransitapp/droid/MapsLaunchActivity;
.super Landroid/app/Activity;
.source "MapsLaunchActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 10
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    invoke-super {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 13
    .local v2, "launch":Landroid/content/Intent;
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    const-string v6, "saddr"

    invoke-virtual {v5, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14
    .local v0, "from":Ljava/lang/String;
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    const-string v6, "daddr"

    invoke-virtual {v5, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 16
    .local v4, "to":Ljava/lang/String;
    if-eqz v0, :cond_0

    if-nez v4, :cond_1

    .line 17
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    const-string v6, "myl"

    invoke-virtual {v5, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 19
    .local v3, "myLocation":Ljava/lang/String;
    if-eqz v3, :cond_1

    .line 20
    const-string v5, "saddr"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 21
    const-string v0, "myl"

    .line 28
    .end local v3    # "myLocation":Ljava/lang/String;
    :cond_1
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-class v5, Lcom/thetransitapp/droid/TransitActivity;

    invoke-direct {v1, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 29
    .local v1, "intent":Landroid/content/Intent;
    const-string v5, "from"

    invoke-virtual {v1, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    const-string v5, "to"

    invoke-virtual {v1, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    invoke-super {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 33
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 34
    return-void

    .line 23
    .end local v1    # "intent":Landroid/content/Intent;
    .restart local v3    # "myLocation":Ljava/lang/String;
    :cond_2
    const-string v4, "myl"

    goto :goto_0
.end method
