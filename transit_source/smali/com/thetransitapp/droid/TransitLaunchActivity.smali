.class public Lcom/thetransitapp/droid/TransitLaunchActivity;
.super Landroid/app/Activity;
.source "TransitLaunchActivity.java"


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
    .locals 9
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 10
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    invoke-super {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 13
    .local v3, "launch":Landroid/content/Intent;
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v7}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 15
    .local v1, "host":Ljava/lang/String;
    new-instance v2, Landroid/content/Intent;

    const-class v7, Lcom/thetransitapp/droid/TransitActivity;

    invoke-direct {v2, p0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 17
    .local v2, "intent":Landroid/content/Intent;
    const-string v7, "routes"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 18
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v7

    const-string v8, "q"

    invoke-virtual {v7, v8}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 20
    .local v5, "q":Ljava/lang/String;
    const-string v7, "query"

    invoke-virtual {v2, v7, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .end local v5    # "q":Ljava/lang/String;
    :cond_0
    :goto_0
    invoke-super {p0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 42
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 43
    return-void

    .line 21
    :cond_1
    const-string v7, "directions"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 22
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v7

    const-string v8, "from"

    invoke-virtual {v7, v8}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    .local v0, "from":Ljava/lang/String;
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v7

    const-string v8, "to"

    invoke-virtual {v7, v8}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 25
    .local v6, "to":Ljava/lang/String;
    if-eqz v0, :cond_2

    if-nez v6, :cond_3

    .line 26
    :cond_2
    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v7

    const-string v8, "myl"

    invoke-virtual {v7, v8}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 28
    .local v4, "myLocation":Ljava/lang/String;
    if-eqz v4, :cond_3

    .line 29
    const-string v7, "saddr"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 30
    const-string v0, "myl"

    .line 37
    .end local v4    # "myLocation":Ljava/lang/String;
    :cond_3
    :goto_1
    const-string v7, "from"

    invoke-virtual {v2, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    const-string v7, "to"

    invoke-virtual {v2, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 32
    .restart local v4    # "myLocation":Ljava/lang/String;
    :cond_4
    const-string v6, "myl"

    goto :goto_1
.end method
