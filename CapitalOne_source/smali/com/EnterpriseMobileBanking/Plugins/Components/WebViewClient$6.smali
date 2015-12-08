.class Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$6;
.super Ljava/lang/Object;
.source "WebViewClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
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
    .line 383
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$6;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$6;->val$view:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$6;->val$view:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 388
    return-void
.end method
