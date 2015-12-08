.class Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;
.super Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;
.source "NativeToJsMessageQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/NativeToJsMessageQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoadUrlBridgeMode"
.end annotation


# instance fields
.field final runnable:Ljava/lang/Runnable;

.field final synthetic this$0:Lorg/apache/cordova/NativeToJsMessageQueue;


# direct methods
.method private constructor <init>(Lorg/apache/cordova/NativeToJsMessageQueue;)V
    .locals 1

    .prologue
    .line 296
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V

    .line 297
    new-instance v0, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode$1;

    invoke-direct {v0, p0}, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode$1;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;)V

    iput-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;->runnable:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue;
    .param p2, "x1"    # Lorg/apache/cordova/NativeToJsMessageQueue$1;

    .prologue
    .line 296
    invoke-direct {p0, p1}, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;)V

    return-void
.end method


# virtual methods
.method onNativeToJsMessageAvailable()V
    .locals 2

    .prologue
    .line 307
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    # getter for: Lorg/apache/cordova/NativeToJsMessageQueue;->cordova:Lorg/apache/cordova/CordovaInterface;
    invoke-static {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->access$700(Lorg/apache/cordova/NativeToJsMessageQueue;)Lorg/apache/cordova/CordovaInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 308
    return-void
.end method
