.class Lorg/apache/cordova/CordovaChromeClient$10;
.super Ljava/lang/Object;
.source "CordovaChromeClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaChromeClient;->onPageLoadStopped(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Lorg/xwalk/core/XWalkUIClient$LoadStatus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CordovaChromeClient;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaChromeClient;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/CordovaChromeClient;

    .prologue
    .line 302
    iput-object p1, p0, Lorg/apache/cordova/CordovaChromeClient$10;->this$0:Lorg/apache/cordova/CordovaChromeClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 305
    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 306
    iget-object v0, p0, Lorg/apache/cordova/CordovaChromeClient$10;->this$0:Lorg/apache/cordova/CordovaChromeClient;

    iget-object v0, v0, Lorg/apache/cordova/CordovaChromeClient;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lorg/apache/cordova/CordovaChromeClient$10$1;

    invoke-direct {v1, p0}, Lorg/apache/cordova/CordovaChromeClient$10$1;-><init>(Lorg/apache/cordova/CordovaChromeClient$10;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 313
    :goto_0
    return-void

    .line 311
    :catch_0
    move-exception v0

    goto :goto_0
.end method
