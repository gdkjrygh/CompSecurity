.class abstract Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;
.super Ljava/lang/Object;
.source "NativeToJsMessageQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/NativeToJsMessageQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "BridgeMode"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/NativeToJsMessageQueue;


# direct methods
.method private constructor <init>(Lorg/apache/cordova/NativeToJsMessageQueue;)V
    .locals 0

    .prologue
    .line 283
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;->this$0:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue;
    .param p2, "x1"    # Lorg/apache/cordova/NativeToJsMessageQueue$1;

    .prologue
    .line 283
    invoke-direct {p0, p1}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;)V

    return-void
.end method


# virtual methods
.method notifyOfFlush(Z)V
    .locals 0
    .param p1, "fromOnlineEvent"    # Z

    .prologue
    .line 285
    return-void
.end method

.method abstract onNativeToJsMessageAvailable()V
.end method

.method reset()V
    .locals 0

    .prologue
    .line 286
    return-void
.end method
