.class final Lcom/google/zxing/client/android/camera/PreviewCallback;
.super Ljava/lang/Object;
.source "PreviewCallback.java"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final configManager:Lcom/google/zxing/client/android/camera/CameraConfigurationManager;

.field private previewHandler:Landroid/os/Handler;

.field private previewMessage:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/google/zxing/client/android/camera/PreviewCallback;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/client/android/camera/PreviewCallback;->TAG:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/google/zxing/client/android/camera/CameraConfigurationManager;)V
    .locals 0
    .param p1, "configManager"    # Lcom/google/zxing/client/android/camera/CameraConfigurationManager;

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/google/zxing/client/android/camera/PreviewCallback;->configManager:Lcom/google/zxing/client/android/camera/CameraConfigurationManager;

    .line 35
    return-void
.end method


# virtual methods
.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 6
    .param p1, "data"    # [B
    .param p2, "camera"    # Landroid/hardware/Camera;

    .prologue
    .line 44
    iget-object v3, p0, Lcom/google/zxing/client/android/camera/PreviewCallback;->configManager:Lcom/google/zxing/client/android/camera/CameraConfigurationManager;

    invoke-virtual {v3}, Lcom/google/zxing/client/android/camera/CameraConfigurationManager;->getCameraResolution()Landroid/graphics/Point;

    move-result-object v0

    .line 45
    .local v0, "cameraResolution":Landroid/graphics/Point;
    iget-object v2, p0, Lcom/google/zxing/client/android/camera/PreviewCallback;->previewHandler:Landroid/os/Handler;

    .line 46
    .local v2, "thePreviewHandler":Landroid/os/Handler;
    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    .line 47
    iget v3, p0, Lcom/google/zxing/client/android/camera/PreviewCallback;->previewMessage:I

    iget v4, v0, Landroid/graphics/Point;->x:I

    .line 48
    iget v5, v0, Landroid/graphics/Point;->y:I

    .line 47
    invoke-virtual {v2, v3, v4, v5, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 49
    .local v1, "message":Landroid/os/Message;
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 50
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/google/zxing/client/android/camera/PreviewCallback;->previewHandler:Landroid/os/Handler;

    .line 54
    .end local v1    # "message":Landroid/os/Message;
    :goto_0
    return-void

    .line 52
    :cond_0
    sget-object v3, Lcom/google/zxing/client/android/camera/PreviewCallback;->TAG:Ljava/lang/String;

    const-string v4, "Got preview callback, but no handler or resolution available"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method setHandler(Landroid/os/Handler;I)V
    .locals 0
    .param p1, "previewHandler"    # Landroid/os/Handler;
    .param p2, "previewMessage"    # I

    .prologue
    .line 38
    iput-object p1, p0, Lcom/google/zxing/client/android/camera/PreviewCallback;->previewHandler:Landroid/os/Handler;

    .line 39
    iput p2, p0, Lcom/google/zxing/client/android/camera/PreviewCallback;->previewMessage:I

    .line 40
    return-void
.end method
