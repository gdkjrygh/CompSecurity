.class final Lcom/kik/cards/web/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/kik/cards/web/bi;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/bi;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/bi;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 120
    new-instance v0, Lcom/kik/cards/web/av$a;

    iget-object v1, p0, Lcom/kik/cards/web/bi;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->b(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;)Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/bi;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-static {v2}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->b(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;)Landroid/webkit/WebView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    const-string v4, "article"

    iget-object v5, p0, Lcom/kik/cards/web/bi;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-static {v5}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->b(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;)Landroid/webkit/WebView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/kik/cards/web/bi;->c:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-static {v6}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->b(Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;)Landroid/webkit/WebView;

    move-result-object v6

    invoke-virtual {v6}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Lcom/kik/cards/web/bi;->a:Ljava/lang/String;

    iget-object v9, p0, Lcom/kik/cards/web/bi;->b:Ljava/lang/String;

    move-object v7, v3

    invoke-direct/range {v0 .. v9}, Lcom/kik/cards/web/av$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
