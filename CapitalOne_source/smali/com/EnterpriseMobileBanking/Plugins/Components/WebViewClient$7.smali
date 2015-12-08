.class Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$7;
.super Ljava/lang/Object;
.source "WebViewClient.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
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
    .line 571
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$7;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$7;->val$view:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 574
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$7;->val$view:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 575
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$7;->val$view:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 577
    :cond_0
    return-void
.end method
