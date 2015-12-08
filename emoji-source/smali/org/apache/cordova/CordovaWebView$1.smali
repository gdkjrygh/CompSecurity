.class Lorg/apache/cordova/CordovaWebView$1;
.super Ljava/lang/Object;
.source "CordovaWebView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaWebView;->loadUrlIntoView(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CordovaWebView;

.field final synthetic val$me:Lorg/apache/cordova/CordovaWebView;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaWebView;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 378
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView$1;->this$0:Lorg/apache/cordova/CordovaWebView;

    iput-object p2, p0, Lorg/apache/cordova/CordovaWebView$1;->val$me:Lorg/apache/cordova/CordovaWebView;

    iput-object p3, p0, Lorg/apache/cordova/CordovaWebView$1;->val$url:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 380
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView$1;->val$me:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaWebView;->stopLoading()V

    .line 381
    const-string v0, "CordovaWebView"

    const-string v1, "CordovaWebView: TIMEOUT ERROR!"

    invoke-static {v0, v1}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView$1;->this$0:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->viewClient:Lorg/apache/cordova/CordovaWebViewClient;

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView$1;->this$0:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->viewClient:Lorg/apache/cordova/CordovaWebViewClient;

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView$1;->val$me:Lorg/apache/cordova/CordovaWebView;

    const/4 v2, -0x6

    const-string v3, "The connection to the server was unsuccessful."

    iget-object v4, p0, Lorg/apache/cordova/CordovaWebView$1;->val$url:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/apache/cordova/CordovaWebViewClient;->onReceivedLoadError(Lorg/xwalk/core/XWalkView;ILjava/lang/String;Ljava/lang/String;)V

    .line 385
    :cond_0
    return-void
.end method
