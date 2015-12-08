.class Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$2;
.super Ljava/lang/Object;
.source "NativeToJsMessageQueue.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;


# direct methods
.method constructor <init>(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;)V
    .locals 0
    .param p1, "this$1"    # Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    .prologue
    .line 324
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$2;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 326
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$2;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    const/4 v1, 0x0

    # setter for: Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z
    invoke-static {v0, v1}, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->access$1002(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;Z)Z

    .line 328
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$2;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    # setter for: Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->ignoreNextFlush:Z
    invoke-static {v0, v2}, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->access$902(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;Z)Z

    .line 329
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$2;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    iget-object v0, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    # getter for: Lorg/apache/cordova/NativeToJsMessageQueue;->webView:Lorg/apache/cordova/CordovaWebView;
    invoke-static {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->access$600(Lorg/apache/cordova/NativeToJsMessageQueue;)Lorg/apache/cordova/CordovaWebView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lorg/apache/cordova/CordovaWebView;->setNetworkAvailable(Z)V

    .line 330
    return-void
.end method
