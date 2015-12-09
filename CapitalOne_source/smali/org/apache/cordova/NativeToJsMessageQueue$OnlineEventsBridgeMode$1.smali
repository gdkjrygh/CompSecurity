.class Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;
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

    .prologue
    .line 300
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 302
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    iget-object v0, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    # getter for: Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;
    invoke-static {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->access$500(Lorg/apache/cordova/NativeToJsMessageQueue;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 303
    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    iget-boolean v0, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v1, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z

    .line 304
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    iget-object v0, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    # getter for: Lorg/apache/cordova/NativeToJsMessageQueue;->webView:Lorg/apache/cordova/CordovaWebView;
    invoke-static {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->access$300(Lorg/apache/cordova/NativeToJsMessageQueue;)Lorg/apache/cordova/CordovaWebView;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;->this$1:Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    iget-boolean v1, v1, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CordovaWebView;->setNetworkAvailable(Z)V

    .line 306
    :cond_0
    return-void

    .line 303
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
