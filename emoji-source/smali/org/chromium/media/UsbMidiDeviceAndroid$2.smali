.class Lorg/chromium/media/UsbMidiDeviceAndroid$2;
.super Ljava/lang/Object;
.source "UsbMidiDeviceAndroid.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/media/UsbMidiDeviceAndroid;->postOnDataEvent(I[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

.field final synthetic val$bs:[B

.field final synthetic val$endpointNumber:I


# direct methods
.method constructor <init>(Lorg/chromium/media/UsbMidiDeviceAndroid;I[B)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$2;->this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

    iput p2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$2;->val$endpointNumber:I

    iput-object p3, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$2;->val$bs:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 170
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$2;->this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

    # getter for: Lorg/chromium/media/UsbMidiDeviceAndroid;->mIsClosed:Z
    invoke-static {v0}, Lorg/chromium/media/UsbMidiDeviceAndroid;->access$300(Lorg/chromium/media/UsbMidiDeviceAndroid;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    :goto_0
    return-void

    .line 173
    :cond_0
    iget-object v0, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$2;->this$0:Lorg/chromium/media/UsbMidiDeviceAndroid;

    # getter for: Lorg/chromium/media/UsbMidiDeviceAndroid;->mNativePointer:J
    invoke-static {v0}, Lorg/chromium/media/UsbMidiDeviceAndroid;->access$400(Lorg/chromium/media/UsbMidiDeviceAndroid;)J

    move-result-wide v0

    iget v2, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$2;->val$endpointNumber:I

    iget-object v3, p0, Lorg/chromium/media/UsbMidiDeviceAndroid$2;->val$bs:[B

    # invokes: Lorg/chromium/media/UsbMidiDeviceAndroid;->nativeOnData(JI[B)V
    invoke-static {v0, v1, v2, v3}, Lorg/chromium/media/UsbMidiDeviceAndroid;->access$500(JI[B)V

    goto :goto_0
.end method
