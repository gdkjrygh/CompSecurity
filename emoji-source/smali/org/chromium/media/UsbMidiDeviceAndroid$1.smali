.class Lorg/chromium/media/UsbMidiDeviceAndroid$1;
.super Ljava/lang/Thread;
.source "UsbMidiDeviceAndroid.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/media/UsbMidiDeviceAndroid;->startListen(Landroid/hardware/usb/UsbDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

.field final synthetic val$bufferForEndpoints:Ljava/util/Map;


# direct methods
.method constructor <init>(Lorg/chromium/media/UsbMidiDeviceAndroid;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$1;->this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

    iput-object p2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$1;->val$bufferForEndpoints:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 140
    :cond_0
    :goto_0
    iget-object v5, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$1;->this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

    # getter for: Lorg/chromium/media/UsbMidiDeviceAndroid;->mConnection:Landroid/hardware/usb/UsbDeviceConnection;
    invoke-static {v5}, Lorg/chromium/media/UsbMidiDeviceAndroid;->access$000(Lorg/chromium/media/UsbMidiDeviceAndroid;)Landroid/hardware/usb/UsbDeviceConnection;

    move-result-object v5

    invoke-virtual {v5}, Landroid/hardware/usb/UsbDeviceConnection;->requestWait()Landroid/hardware/usb/UsbRequest;

    move-result-object v4

    .line 141
    .local v4, "request":Landroid/hardware/usb/UsbRequest;
    if-nez v4, :cond_1

    .line 160
    return-void

    .line 145
    :cond_1
    invoke-virtual {v4}, Landroid/hardware/usb/UsbRequest;->getEndpoint()Landroid/hardware/usb/UsbEndpoint;

    move-result-object v2

    .line 146
    .local v2, "endpoint":Landroid/hardware/usb/UsbEndpoint;
    invoke-virtual {v2}, Landroid/hardware/usb/UsbEndpoint;->getDirection()I

    move-result v5

    const/16 v6, 0x80

    if-ne v5, v6, :cond_0

    .line 149
    iget-object v5, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$1;->val$bufferForEndpoints:Ljava/util/Map;

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    .line 150
    .local v1, "buffer":Ljava/nio/ByteBuffer;
    # invokes: Lorg/chromium/media/UsbMidiDeviceAndroid;->getInputDataLength(Ljava/nio/ByteBuffer;)I
    invoke-static {v1}, Lorg/chromium/media/UsbMidiDeviceAndroid;->access$100(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 151
    .local v3, "length":I
    if-lez v3, :cond_2

    .line 152
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 153
    new-array v0, v3, [B

    .line 154
    .local v0, "bs":[B
    const/4 v5, 0x0

    invoke-virtual {v1, v0, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 155
    iget-object v5, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$1;->this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

    invoke-virtual {v2}, Landroid/hardware/usb/UsbEndpoint;->getEndpointNumber()I

    move-result v6

    # invokes: Lorg/chromium/media/UsbMidiDeviceAndroid;->postOnDataEvent(I[B)V
    invoke-static {v5, v6, v0}, Lorg/chromium/media/UsbMidiDeviceAndroid;->access$200(Lorg/chromium/media/UsbMidiDeviceAndroid;I[B)V

    .line 157
    .end local v0    # "bs":[B
    :cond_2
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 158
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v5

    invoke-virtual {v4, v1, v5}, Landroid/hardware/usb/UsbRequest;->queue(Ljava/nio/ByteBuffer;I)Z

    goto :goto_0
.end method
