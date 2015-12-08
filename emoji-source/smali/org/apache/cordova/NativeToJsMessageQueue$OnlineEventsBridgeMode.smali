.class Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;
.super Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;
.source "NativeToJsMessageQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/NativeToJsMessageQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnlineEventsBridgeMode"
.end annotation


# instance fields
.field private ignoreNextFlush:Z

.field private online:Z

.field final resetNetworkRunnable:Ljava/lang/Runnable;

.field final synthetic this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

.field final toggleNetworkRunnable:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>(Lorg/apache/cordova/NativeToJsMessageQueue;)V
    .locals 1

    .prologue
    .line 312
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V

    .line 316
    new-instance v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;

    invoke-direct {v0, p0}, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$1;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;)V

    iput-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->toggleNetworkRunnable:Ljava/lang/Runnable;

    .line 324
    new-instance v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$2;

    invoke-direct {v0, p0}, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode$2;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;)V

    iput-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->resetNetworkRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue;
    .param p2, "x1"    # Lorg/apache/cordova/NativeToJsMessageQueue$1;

    .prologue
    .line 312
    invoke-direct {p0, p1}, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;)V

    return-void
.end method

.method static synthetic access$1000(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;)Z
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    .prologue
    .line 312
    iget-boolean v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z

    return v0
.end method

.method static synthetic access$1002(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;
    .param p1, "x1"    # Z

    .prologue
    .line 312
    iput-boolean p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z

    return p1
.end method

.method static synthetic access$902(Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;
    .param p1, "x1"    # Z

    .prologue
    .line 312
    iput-boolean p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->ignoreNextFlush:Z

    return p1
.end method


# virtual methods
.method notifyOfFlush(Z)V
    .locals 1
    .param p1, "fromOnlineEvent"    # Z

    .prologue
    .line 340
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->ignoreNextFlush:Z

    if-nez v0, :cond_0

    .line 341
    iget-boolean v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->online:Z

    .line 343
    :cond_0
    return-void

    .line 341
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method onNativeToJsMessageAvailable()V
    .locals 2

    .prologue
    .line 336
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    # getter for: Lorg/apache/cordova/NativeToJsMessageQueue;->cordova:Lorg/apache/cordova/CordovaInterface;
    invoke-static {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->access$700(Lorg/apache/cordova/NativeToJsMessageQueue;)Lorg/apache/cordova/CordovaInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->toggleNetworkRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 337
    return-void
.end method

.method reset()V
    .locals 2

    .prologue
    .line 333
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    # getter for: Lorg/apache/cordova/NativeToJsMessageQueue;->cordova:Lorg/apache/cordova/CordovaInterface;
    invoke-static {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->access$700(Lorg/apache/cordova/NativeToJsMessageQueue;)Lorg/apache/cordova/CordovaInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->resetNetworkRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 334
    return-void
.end method
