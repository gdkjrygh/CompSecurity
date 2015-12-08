.class Lorg/chromium/media/UsbMidiDeviceAndroid;
.super Ljava/lang/Object;
.source "UsbMidiDeviceAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field static final MIDI_SUBCLASS:I = 0x3


# instance fields
.field private final mConnection:Landroid/hardware/usb/UsbDeviceConnection;

.field private final mEndpointMap:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/hardware/usb/UsbEndpoint;",
            ">;"
        }
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;

.field private mHasInputThread:Z

.field private mIsClosed:Z

.field private mNativePointer:J

.field private final mRequestMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/hardware/usb/UsbEndpoint;",
            "Landroid/hardware/usb/UsbRequest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/hardware/usb/UsbManager;Landroid/hardware/usb/UsbDevice;)V
    .locals 7
    .param p1, "manager"    # Landroid/hardware/usb/UsbManager;
    .param p2, "device"    # Landroid/hardware/usb/UsbDevice;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-virtual {p1, p2}, Landroid/hardware/usb/UsbManager;->openDevice(Landroid/hardware/usb/UsbDevice;)Landroid/hardware/usb/UsbDeviceConnection;

    move-result-object v4

    iput-object v4, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    .line 79
    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    iput-object v4, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mEndpointMap:Landroid/util/SparseArray;

    .line 80
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iput-object v4, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mRequestMap:Ljava/util/Map;

    .line 81
    new-instance v4, Landroid/os/Handler;

    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    iput-object v4, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mHandler:Landroid/os/Handler;

    .line 82
    iput-boolean v5, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mIsClosed:Z

    .line 83
    iput-boolean v5, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mHasInputThread:Z

    .line 84
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mNativePointer:J

    .line 86
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p2}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    move-result v4

    if-ge v1, v4, :cond_3

    .line 87
    invoke-virtual {p2, v1}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    move-result-object v2

    .line 88
    .local v2, "iface":Landroid/hardware/usb/UsbInterface;
    invoke-virtual {v2}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    move-result v4

    if-ne v4, v6, :cond_0

    invoke-virtual {v2}, Landroid/hardware/usb/UsbInterface;->getInterfaceSubclass()I

    move-result v4

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    .line 86
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 92
    :cond_1
    iget-object v4, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    invoke-virtual {v4, v2, v6}, Landroid/hardware/usb/UsbDeviceConnection;->claimInterface(Landroid/hardware/usb/UsbInterface;Z)Z

    .line 93
    const/4 v3, 0x0

    .local v3, "j":I
    :goto_1
    invoke-virtual {v2}, Landroid/hardware/usb/UsbInterface;->getEndpointCount()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 94
    invoke-virtual {v2, v3}, Landroid/hardware/usb/UsbInterface;->getEndpoint(I)Landroid/hardware/usb/UsbEndpoint;

    move-result-object v0

    .line 95
    .local v0, "endpoint":Landroid/hardware/usb/UsbEndpoint;
    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    move-result v4

    if-nez v4, :cond_2

    .line 96
    iget-object v4, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mEndpointMap:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/hardware/usb/UsbEndpoint;->getEndpointNumber()I

    move-result v5

    invoke-virtual {v4, v5, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 93
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 105
    .end local v0    # "endpoint":Landroid/hardware/usb/UsbEndpoint;
    .end local v2    # "iface":Landroid/hardware/usb/UsbInterface;
    .end local v3    # "j":I
    :cond_3
    invoke-direct {p0, p2}, Lorg/chromium/media/UsbMidiDeviceAndroid;->startListen(Landroid/hardware/usb/UsbDevice;)V

    .line 106
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/media/UsbMidiDeviceAndroid;)Landroid/hardware/usb/UsbDeviceConnection;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/UsbMidiDeviceAndroid;

    .prologue
    .line 31
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    return-object v0
.end method

.method static synthetic access$100(Ljava/nio/ByteBuffer;)I
    .locals 1
    .param p0, "x0"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 31
    invoke-static {p0}, Lorg/chromium/media/UsbMidiDeviceAndroid;->getInputDataLength(Ljava/nio/ByteBuffer;)I

    move-result v0

    return v0
.end method

.method static synthetic access$200(Lorg/chromium/media/UsbMidiDeviceAndroid;I[B)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/media/UsbMidiDeviceAndroid;
    .param p1, "x1"    # I
    .param p2, "x2"    # [B

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Lorg/chromium/media/UsbMidiDeviceAndroid;->postOnDataEvent(I[B)V

    return-void
.end method

.method static synthetic access$300(Lorg/chromium/media/UsbMidiDeviceAndroid;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/UsbMidiDeviceAndroid;

    .prologue
    .line 31
    iget-boolean v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mIsClosed:Z

    return v0
.end method

.method static synthetic access$400(Lorg/chromium/media/UsbMidiDeviceAndroid;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/media/UsbMidiDeviceAndroid;

    .prologue
    .line 31
    iget-wide v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mNativePointer:J

    return-wide v0
.end method

.method static synthetic access$500(JI[B)V
    .locals 0
    .param p0, "x0"    # J
    .param p2, "x1"    # I
    .param p3, "x2"    # [B

    .prologue
    .line 31
    invoke-static {p0, p1, p2, p3}, Lorg/chromium/media/UsbMidiDeviceAndroid;->nativeOnData(JI[B)V

    return-void
.end method

.method private static getInputDataLength(Ljava/nio/ByteBuffer;)I
    .locals 3
    .param p0, "buffer"    # Ljava/nio/ByteBuffer;

    .prologue
    .line 265
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    .line 267
    .local v1, "position":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v1, :cond_1

    .line 269
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-nez v2, :cond_0

    .line 273
    .end local v0    # "i":I
    :goto_1
    return v0

    .line 267
    .restart local v0    # "i":I
    :cond_0
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_1
    move v0, v1

    .line 273
    goto :goto_1
.end method

.method private static native nativeOnData(JI[B)V
.end method

.method private postOnDataEvent(I[B)V
    .locals 2
    .param p1, "endpointNumber"    # I
    .param p2, "bs"    # [B

    .prologue
    .line 168
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mHandler:Landroid/os/Handler;

    new-instance v1, Lorg/chromium/media/UsbMidiDeviceAndroid$2;

    invoke-direct {v1, p0, p1, p2}, Lorg/chromium/media/UsbMidiDeviceAndroid$2;-><init>(Lorg/chromium/media/UsbMidiDeviceAndroid;I[B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 176
    return-void
.end method

.method private shouldUseBulkTransfer()Z
    .locals 1

    .prologue
    .line 229
    iget-boolean v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mHasInputThread:Z

    return v0
.end method

.method private startListen(Landroid/hardware/usb/UsbDevice;)V
    .locals 10
    .param p1, "device"    # Landroid/hardware/usb/UsbDevice;

    .prologue
    const/4 v9, 0x1

    .line 112
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 115
    .local v1, "bufferForEndpoints":Ljava/util/Map;, "Ljava/util/Map<Landroid/hardware/usb/UsbEndpoint;Ljava/nio/ByteBuffer;>;"
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {p1}, Landroid/hardware/usb/UsbDevice;->getInterfaceCount()I

    move-result v7

    if-ge v3, v7, :cond_3

    .line 116
    invoke-virtual {p1, v3}, Landroid/hardware/usb/UsbDevice;->getInterface(I)Landroid/hardware/usb/UsbInterface;

    move-result-object v4

    .line 117
    .local v4, "iface":Landroid/hardware/usb/UsbInterface;
    invoke-virtual {v4}, Landroid/hardware/usb/UsbInterface;->getInterfaceClass()I

    move-result v7

    if-ne v7, v9, :cond_0

    invoke-virtual {v4}, Landroid/hardware/usb/UsbInterface;->getInterfaceSubclass()I

    move-result v7

    const/4 v8, 0x3

    if-eq v7, v8, :cond_1

    .line 115
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 121
    :cond_1
    const/4 v5, 0x0

    .local v5, "j":I
    :goto_1
    invoke-virtual {v4}, Landroid/hardware/usb/UsbInterface;->getEndpointCount()I

    move-result v7

    if-ge v5, v7, :cond_0

    .line 122
    invoke-virtual {v4, v5}, Landroid/hardware/usb/UsbInterface;->getEndpoint(I)Landroid/hardware/usb/UsbEndpoint;

    move-result-object v2

    .line 123
    .local v2, "endpoint":Landroid/hardware/usb/UsbEndpoint;
    invoke-virtual {v2}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    move-result v7

    const/16 v8, 0x80

    if-ne v7, v8, :cond_2

    .line 124
    invoke-virtual {v2}, Landroid/hardware/usb/UsbEndpoint;->getMaxPacketSize()I

    move-result v7

    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 125
    .local v0, "buffer":Ljava/nio/ByteBuffer;
    new-instance v6, Landroid/hardware/usb/UsbRequest;

    invoke-direct {v6}, Landroid/hardware/usb/UsbRequest;-><init>()V

    .line 126
    .local v6, "request":Landroid/hardware/usb/UsbRequest;
    iget-object v7, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    invoke-virtual {v6, v7, v2}, Landroid/hardware/usb/UsbRequest;->initialize(Landroid/hardware/usb/UsbDeviceConnection;Landroid/hardware/usb/UsbEndpoint;)Z

    .line 127
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v7

    invoke-virtual {v6, v0, v7}, Landroid/hardware/usb/UsbRequest;->queue(Ljava/nio/ByteBuffer;I)Z

    .line 128
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .end local v0    # "buffer":Ljava/nio/ByteBuffer;
    .end local v6    # "request":Landroid/hardware/usb/UsbRequest;
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 132
    .end local v2    # "endpoint":Landroid/hardware/usb/UsbEndpoint;
    .end local v4    # "iface":Landroid/hardware/usb/UsbInterface;
    .end local v5    # "j":I
    :cond_3
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 162
    :goto_2
    return-void

    .line 135
    :cond_4
    iput-boolean v9, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mHasInputThread:Z

    .line 137
    new-instance v7, Lorg/chromium/media/UsbMidiDeviceAndroid$1;

    invoke-direct {v7, p0, v1}, Lorg/chromium/media/UsbMidiDeviceAndroid$1;-><init>(Lorg/chromium/media/UsbMidiDeviceAndroid;Ljava/util/Map;)V

    invoke-virtual {v7}, Lorg/chromium/media/UsbMidiDeviceAndroid$1;->start()V

    goto :goto_2
.end method


# virtual methods
.method close()V
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 249
    iget-object v2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mEndpointMap:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    .line 250
    iget-object v2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mRequestMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/usb/UsbRequest;

    .line 251
    .local v1, "request":Landroid/hardware/usb/UsbRequest;
    invoke-virtual {v1}, Landroid/hardware/usb/UsbRequest;->close()V

    goto :goto_0

    .line 253
    .end local v1    # "request":Landroid/hardware/usb/UsbRequest;
    :cond_0
    iget-object v2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mRequestMap:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 254
    iget-object v2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    invoke-virtual {v2}, Landroid/hardware/usb/UsbDeviceConnection;->close()V

    .line 255
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mNativePointer:J

    .line 256
    const/4 v2, 0x1

    iput-boolean v2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mIsClosed:Z

    .line 257
    return-void
.end method

.method getDescriptors()[B
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 238
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    if-nez v0, :cond_0

    .line 239
    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 241
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    invoke-virtual {v0}, Landroid/hardware/usb/UsbDeviceConnection;->getRawDescriptors()[B

    move-result-object v0

    goto :goto_0
.end method

.method registerSelf(J)V
    .locals 1
    .param p1, "nativePointer"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 183
    iput-wide p1, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mNativePointer:J

    .line 184
    return-void
.end method

.method send(I[B)V
    .locals 8
    .param p1, "endpointNumber"    # I
    .param p2, "bs"    # [B
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 194
    iget-boolean v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mIsClosed:Z

    if-eqz v0, :cond_1

    .line 222
    :cond_0
    :goto_0
    return-void

    .line 197
    :cond_1
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mEndpointMap:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/usb/UsbEndpoint;

    .line 198
    .local v1, "endpoint":Landroid/hardware/usb/UsbEndpoint;
    if-eqz v1, :cond_0

    .line 201
    invoke-direct {p0}, Lorg/chromium/media/UsbMidiDeviceAndroid;->shouldUseBulkTransfer()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 211
    const/16 v7, 0x64

    .line 212
    .local v7, "timeout":I
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    const/4 v3, 0x0

    array-length v4, p2

    const/16 v5, 0x64

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroid/hardware/usb/UsbDeviceConnection;->bulkTransfer(Landroid/hardware/usb/UsbEndpoint;[BIII)I

    goto :goto_0

    .line 214
    .end local v7    # "timeout":I
    :cond_2
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mRequestMap:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/hardware/usb/UsbRequest;

    .line 215
    .local v6, "request":Landroid/hardware/usb/UsbRequest;
    if-nez v6, :cond_3

    .line 216
    new-instance v6, Landroid/hardware/usb/UsbRequest;

    .end local v6    # "request":Landroid/hardware/usb/UsbRequest;
    invoke-direct {v6}, Landroid/hardware/usb/UsbRequest;-><init>()V

    .line 217
    .restart local v6    # "request":Landroid/hardware/usb/UsbRequest;
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;

    invoke-virtual {v6, v0, v1}, Landroid/hardware/usb/UsbRequest;->initialize(Landroid/hardware/usb/UsbDeviceConnection;Landroid/hardware/usb/UsbEndpoint;)Z

    .line 218
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid;->mRequestMap:Ljava/util/Map;

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    :cond_3
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    array-length v2, p2

    invoke-virtual {v6, v0, v2}, Landroid/hardware/usb/UsbRequest;->queue(Ljava/nio/ByteBuffer;I)Z

    goto :goto_0
.end method
