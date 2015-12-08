.class Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$3;
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
    .line 243
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$3;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$3;->val$view:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 246
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$3;->val$view:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 247
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$3;->val$view:Landroid/webkit/WebView;

    const-string v1, "javascript:webview.handleErrorCodes(document.body.innerHTML)"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 248
    return-void
.end method
