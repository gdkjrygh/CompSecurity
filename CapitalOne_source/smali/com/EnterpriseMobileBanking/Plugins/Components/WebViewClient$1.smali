.class Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$1;
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
    .line 193
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$1;->val$view:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->access$000(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;)Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-result-object v0

    const-string v1, "app.pageLoaded();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$1;->val$view:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 198
    return-void
.end method
