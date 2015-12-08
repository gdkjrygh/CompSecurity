.class Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;
.super Ljava/lang/Object;
.source "DeviceCapabilitiesDisplay.java"

# interfaces
.implements Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisplayAdded(I)V
    .locals 2
    .param p1, "displayId"    # I

    .prologue
    .line 33
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    # getter for: Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayManager:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;
    invoke-static {v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->access$000(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;)Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v1

    # invokes: Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->notifyAndSaveConnectedDisplay(Landroid/view/Display;)V
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->access$100(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;Landroid/view/Display;)V

    .line 34
    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 0
    .param p1, "displayId"    # I

    .prologue
    .line 51
    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 2
    .param p1, "displayId"    # I

    .prologue
    .line 38
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    # getter for: Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->mDisplayList:Landroid/util/SparseArray;
    invoke-static {v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->access$200(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;)Landroid/util/SparseArray;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Display;

    .line 41
    .local v0, "disp":Landroid/view/Display;
    if-nez v0, :cond_0

    .line 47
    :goto_0
    return-void

    .line 46
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;

    # invokes: Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->notifyAndRemoveDisconnectedDisplay(Landroid/view/Display;)V
    invoke-static {v1, v0}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;->access$300(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesDisplay;Landroid/view/Display;)V

    goto :goto_0
.end method
