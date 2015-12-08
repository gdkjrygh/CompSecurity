.class final Lcom/kik/cards/web/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/kik/cards/web/bh;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/bh;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/bh;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    .line 93
    check-cast p1, Lorg/json/JSONObject;

    const-string v0, "app-icon"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "preview-image"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v7}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/bh;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->b(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :cond_0
    invoke-static {v3}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kik/cards/web/bh;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->b(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_1
    new-instance v0, Lcom/kik/cards/web/av$a;

    const-string v1, "title"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "description"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "layout"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "url"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "app-name"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Lcom/kik/cards/web/bh;->a:Ljava/lang/String;

    iget-object v9, p0, Lcom/kik/cards/web/bh;->b:Ljava/lang/String;

    invoke-direct/range {v0 .. v9}, Lcom/kik/cards/web/av$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
