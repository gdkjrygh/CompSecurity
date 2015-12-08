.class Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;
.super Ljava/lang/Object;
.source "WebViewLinker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->createTransiteView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

.field final synthetic val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 283
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    monitor-enter v2

    .line 284
    :try_start_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v3

    # setter for: Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
    invoke-static {v1, v3}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->access$102(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;)Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    .line 286
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-direct {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 287
    .local v0, "client":Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->access$100(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 292
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->access$100(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setTag(Ljava/lang/Object;)V

    .line 294
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->transiteWebView:Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->access$100(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v1

    new-instance v3, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-direct {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$JavaScriptInterface;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    const-string v4, "webview"

    invoke-virtual {v1, v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker$2;->val$me:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 298
    monitor-exit v2

    .line 299
    return-void

    .line 298
    .end local v0    # "client":Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
