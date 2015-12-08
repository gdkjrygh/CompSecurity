.class Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$1;
.super Landroid/content/BroadcastReceiver;
.source "DeviceCapabilitiesStorage.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 125
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 126
    .local v0, "action":Ljava/lang/String;
    const-string v1, "android.intent.action.MEDIA_MOUNTED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 127
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    # invokes: Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->notifyAndSaveAttachedStorage()V
    invoke-static {v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->access$100(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)V

    .line 130
    :cond_0
    const-string v1, "android.intent.action.MEDIA_UNMOUNTED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "android.intent.action.MEDIA_REMOVED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "android.intent.action.MEDIA_BAD_REMOVAL"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 133
    :cond_1
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage$1;->this$0:Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;

    # invokes: Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->notifyAndRemoveDetachedStorage()V
    invoke-static {v1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;->access$200(Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilitiesStorage;)V

    .line 135
    :cond_2
    return-void
.end method
