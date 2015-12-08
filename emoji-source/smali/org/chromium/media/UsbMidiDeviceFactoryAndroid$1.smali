.class Lorg/chromium/media/UsbMidiDeviceFactoryAndroid$1;
.super Landroid/content/BroadcastReceiver;
.source "UsbMidiDeviceFactoryAndroid.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->enumerateDevices(Landroid/content/Context;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;


# direct methods
.method constructor <init>(Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid$1;->this$0:Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 116
    const-string v0, "org.chromium.media.USB_PERMISSION"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid$1;->this$0:Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;

    # invokes: Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->onRequestDone(Landroid/content/Context;Landroid/content/Intent;)V
    invoke-static {v0, p1, p2}, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->access$000(Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;Landroid/content/Context;Landroid/content/Intent;)V

    .line 119
    :cond_0
    return-void
.end method
