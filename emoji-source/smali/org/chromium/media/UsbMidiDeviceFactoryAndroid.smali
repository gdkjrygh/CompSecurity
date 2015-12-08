.class Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;
.super Ljava/lang/Object;
.source "UsbMidiDeviceFactoryAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field private static final ACTION_USB_PERMISSION:Ljava/lang/String; = "org.chromium.media.USB_PERMISSION"


# instance fields
.field private final mDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/chromium/media/UsbMidiDeviceAndroid;",
            ">;"
        }
    .end annotation
.end field

.field private mNativePointer:J

.field private mReceiver:Landroid/content/BroadcastReceiver;

.field private mRequestedDevices:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Landroid/hardware/usb/UsbDevice;",
            ">;"
        }
    .end annotation
.end field

.field private mUsbManager:Landroid/hardware/usb/UsbManager;


# direct methods
.method constructor <init>(J)V
    .locals 1
    .param p1, "nativePointer"    # J

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mDevices:Ljava/util/List;

    .line 65
    iput-wide p1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mNativePointer:J

    .line 66
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;
    .param p1, "x1"    # Landroid/content/Context;
    .param p2, "x2"    # Landroid/content/Intent;

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->onRequestDone(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method static create(J)Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;
    .locals 2
    .param p0, "nativePointer"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 74
    new-instance v0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;

    invoke-direct {v0, p0, p1}, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;-><init>(J)V

    return-object v0
.end method

.method private static native nativeOnUsbMidiDeviceRequestDone(J[Ljava/lang/Object;)V
.end method

.method private onRequestDone(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 132
    const-string v1, "device"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/hardware/usb/UsbDevice;

    .line 133
    .local v0, "device":Landroid/hardware/usb/UsbDevice;
    iget-object v1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mRequestedDevices:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 153
    :cond_0
    :goto_0
    return-void

    .line 137
    :cond_1
    iget-object v1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mRequestedDevices:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 138
    const-string v1, "permission"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_2

    .line 140
    const/4 v0, 0x0

    .line 142
    :cond_2
    if-eqz v0, :cond_3

    .line 144
    iget-object v1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mDevices:Ljava/util/List;

    new-instance v2, Lorg/chromium/media/UsbMidiDeviceAndroid;

    iget-object v3, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mUsbManager:Landroid/hardware/usb/UsbManager;

    invoke-direct {v2, v3, v0}, Lorg/chromium/media/UsbMidiDeviceAndroid;-><init>(Landroid/hardware/usb/UsbManager;Landroid/hardware/usb/UsbDevice;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_3
    iget-object v1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mRequestedDevices:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 148
    iget-object v1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 149
    iget-wide v2, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mNativePointer:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    .line 150
    iget-wide v2, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mNativePointer:J

    iget-object v1, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mDevices:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->nativeOnUsbMidiDeviceRequestDone(J[Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method close()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 160
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mNativePointer:J

    .line 161
    return-void
.end method

.method enumerateDevices(Landroid/content/Context;)Z
    .locals 12
    .param p1, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 88
    const-string v8, "usb"

    invoke-virtual {p1, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/hardware/usb/UsbManager;

    iput-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mUsbManager:Landroid/hardware/usb/UsbManager;

    .line 89
    iget-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mUsbManager:Landroid/hardware/usb/UsbManager;

    invoke-virtual {v8}, Landroid/hardware/usb/UsbManager;->getDeviceList()Ljava/util/HashMap;

    move-result-object v1

    .line 90
    .local v1, "devices":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Landroid/hardware/usb/UsbDevice;>;"
    new-instance v8, Landroid/content/Intent;

    const-string v11, "org.chromium.media.USB_PERMISSION"

    invoke-direct {v8, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v9, v8, v9}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    .line 92
    .local v7, "pendingIntent":Landroid/app/PendingIntent;
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    iput-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mRequestedDevices:Ljava/util/Set;

    .line 93
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/usb/UsbDevice;

    .line 94
    .local v0, "device":Landroid/hardware/usb/UsbDevice;
    const/4 v3, 0x0

    .line 95
    .local v3, "found":Z
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_1
    invoke-virtual {v0}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    move-result v8

    if-ge v4, v8, :cond_2

    if-nez v3, :cond_2

    .line 96
    invoke-virtual {v0, v4}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    move-result-object v6

    .line 97
    .local v6, "iface":Landroid/hardware/usb/UsbInterface;
    invoke-virtual {v6}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    move-result v8

    if-ne v8, v10, :cond_1

    invoke-virtual {v6}, Landroid/hardware/usb/UsbInterface;->getInterfaceSubclass()I

    move-result v8

    const/4 v11, 0x3

    if-ne v8, v11, :cond_1

    .line 99
    const/4 v3, 0x1

    .line 95
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 102
    .end local v6    # "iface":Landroid/hardware/usb/UsbInterface;
    :cond_2
    if-eqz v3, :cond_0

    .line 103
    iget-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mUsbManager:Landroid/hardware/usb/UsbManager;

    invoke-virtual {v8, v0, v7}, Landroid/hardware/usb/UsbManager;->requestPermission(Landroid/hardware/usb/UsbDevice;Landroid/app/PendingIntent;)V

    .line 104
    iget-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mRequestedDevices:Ljava/util/Set;

    invoke-interface {v8, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 107
    .end local v0    # "device":Landroid/hardware/usb/UsbDevice;
    .end local v3    # "found":Z
    .end local v4    # "i":I
    :cond_3
    iget-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mRequestedDevices:Ljava/util/Set;

    invoke-interface {v8}, Ljava/util/Set;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v9

    .line 122
    :goto_2
    return v8

    .line 112
    :cond_4
    new-instance v2, Landroid/content/IntentFilter;

    const-string v8, "org.chromium.media.USB_PERMISSION"

    invoke-direct {v2, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 113
    .local v2, "filter":Landroid/content/IntentFilter;
    new-instance v8, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid$1;

    invoke-direct {v8, p0}, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid$1;-><init>(Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;)V

    iput-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mReceiver:Landroid/content/BroadcastReceiver;

    .line 121
    iget-object v8, p0, Lorg/chromium/media/UsbMidiDeviceFactoryAndroid;->mReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v8, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move v8, v10

    .line 122
    goto :goto_2
.end method
