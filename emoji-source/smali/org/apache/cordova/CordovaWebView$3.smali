.class Lorg/apache/cordova/CordovaWebView$3;
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

.field final synthetic val$timeoutCheck:Ljava/lang/Runnable;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaWebView;Ljava/lang/Runnable;Lorg/apache/cordova/CordovaWebView;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 407
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView$3;->this$0:Lorg/apache/cordova/CordovaWebView;

    iput-object p2, p0, Lorg/apache/cordova/CordovaWebView$3;->val$timeoutCheck:Ljava/lang/Runnable;

    iput-object p3, p0, Lorg/apache/cordova/CordovaWebView$3;->val$me:Lorg/apache/cordova/CordovaWebView;

    iput-object p4, p0, Lorg/apache/cordova/CordovaWebView$3;->val$url:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 409
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView$3;->this$0:Lorg/apache/cordova/CordovaWebView;

    # getter for: Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;
    invoke-static {v0}, Lorg/apache/cordova/CordovaWebView;->access$000(Lorg/apache/cordova/CordovaWebView;)Lorg/apache/cordova/CordovaInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView$3;->val$timeoutCheck:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 410
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView$3;->val$me:Lorg/apache/cordova/CordovaWebView;

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView$3;->val$url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CordovaWebView;->loadUrlNow(Ljava/lang/String;)V

    .line 411
    return-void
.end method
