.class Lbolts/WebViewAppLinkResolver$2$1;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lbolts/s;

.field private b:Z


# direct methods
.method constructor <init>(Lbolts/s;)V
    .locals 1

    .prologue
    .line 132
    iput-object p1, p0, Lbolts/WebViewAppLinkResolver$2$1;->a:Lbolts/s;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 133
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->b:Z

    return-void
.end method

.method private runJavaScript(Landroid/webkit/WebView;)V
    .locals 1

    .prologue
    .line 136
    iget-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->b:Z

    if-nez v0, :cond_0

    .line 139
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbolts/WebViewAppLinkResolver$2$1;->b:Z

    .line 140
    const-string v0, "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName(\'meta\');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute(\'property\');    if (property && property.substring(0, \'al:\'.length) === \'al:\') {      var tag = { \"property\": metaTags[i].getAttribute(\'property\') };      if (metaTags[i].hasAttribute(\'content\')) {        tag[\'content\'] = metaTags[i].getAttribute(\'content\');      }      results.push(tag);    }  }  return JSON.stringify(results);})())"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 142
    :cond_0
    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 152
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 153
    invoke-direct {p0, p1}, Lbolts/WebViewAppLinkResolver$2$1;->runJavaScript(Landroid/webkit/WebView;)V

    .line 154
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 146
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 147
    invoke-direct {p0, p1}, Lbolts/WebViewAppLinkResolver$2$1;->runJavaScript(Landroid/webkit/WebView;)V

    .line 148
    return-void
.end method
