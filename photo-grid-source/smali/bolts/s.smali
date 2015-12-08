.class final Lbolts/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbolts/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/i",
        "<",
        "Ljava/lang/Void;",
        "Lbolts/j",
        "<",
        "Lorg/json/JSONArray;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lbolts/h;

.field final synthetic b:Landroid/net/Uri;

.field final synthetic c:Lbolts/h;

.field final synthetic d:Lbolts/r;


# virtual methods
.method public final synthetic then(Lbolts/j;)Ljava/lang/Object;
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 124
    .line 1128
    invoke-static {}, Lbolts/j;->a()Lbolts/q;

    move-result-object v6

    .line 1129
    new-instance v0, Landroid/webkit/WebView;

    iget-object v1, p0, Lbolts/s;->d:Lbolts/r;

    invoke-static {v1}, Lbolts/r;->a(Lbolts/r;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 1130
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 1131
    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setNetworkAvailable(Z)V

    .line 1132
    new-instance v1, Lbolts/WebViewAppLinkResolver$2$1;

    invoke-direct {v1, p0}, Lbolts/WebViewAppLinkResolver$2$1;-><init>(Lbolts/s;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 1157
    new-instance v1, Lbolts/t;

    invoke-direct {v1, p0, v6}, Lbolts/t;-><init>(Lbolts/s;Lbolts/q;)V

    const-string v2, "boltsWebViewAppLinkResolverResult"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1168
    iget-object v1, p0, Lbolts/s;->a:Lbolts/h;

    invoke-virtual {v1}, Lbolts/h;->a()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1169
    iget-object v1, p0, Lbolts/s;->a:Lbolts/h;

    invoke-virtual {v1}, Lbolts/h;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v3, v1, v3

    .line 1171
    :goto_0
    iget-object v1, p0, Lbolts/s;->b:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lbolts/s;->c:Lbolts/h;

    invoke-virtual {v2}, Lbolts/h;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1540
    iget-object v0, v6, Lbolts/q;->a:Lbolts/j;

    .line 124
    return-object v0

    :cond_0
    move-object v3, v4

    goto :goto_0
.end method
