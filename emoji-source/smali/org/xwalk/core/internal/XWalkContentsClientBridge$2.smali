.class Lorg/xwalk/core/internal/XWalkContentsClientBridge$2;
.super Ljava/lang/Object;
.source "XWalkContentsClientBridge.java"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkContentsClientBridge;->onCreateWindow(ZZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback",
        "<",
        "Lorg/xwalk/core/internal/XWalkViewInternal;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)V
    .locals 0

    .prologue
    .line 388
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$2;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 388
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewInternal;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge$2;->onReceiveValue(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    return-void
.end method

.method public onReceiveValue(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 3
    .param p1, "newXWalkView"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 391
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$2;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mUiThreadHandler:Landroid/os/Handler;
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$400(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x64

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 392
    .local v0, "m":Landroid/os/Message;
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 393
    return-void
.end method
