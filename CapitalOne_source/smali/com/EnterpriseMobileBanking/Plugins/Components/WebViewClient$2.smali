.class Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$2;
.super Ljava/lang/Object;
.source "WebViewClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

.field final synthetic val$view:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$2;->val$view:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 233
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$2;->val$view:Landroid/webkit/WebView;

    const-string v1, "javascript:function getAlerts(className) {var alerts = \'\';var allElements = document.body.getElementsByTagName(\'div\');var length = allElements.length;for (var i=0; i<length; i++) {var currentElement = allElements[i];var classes = currentElement.className;if (classes.indexOf(className) != -1) {var spanAlerts = \'\';var allSpans = currentElement.getElementsByTagName(\'span\');var spans = allSpans.length;for (var j=0; j<spans; j++) {var currentSpan = allSpans[j];spanAlerts += currentSpan.innerHTML + \'|\';}alerts += spanAlerts;}} webview.handleAlerts(alerts);}getAlerts(\'alert\');"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 234
    return-void
.end method
