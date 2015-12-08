.class public Lcom/roidapp/amf/AMFNative;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 6
    const-class v0, Lcom/roidapp/amf/AMFNative;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/amf/AMFNative;->b:Ljava/lang/String;

    .line 15
    :try_start_0
    const-string v0, "avutil-54"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 16
    const-string v0, "swresample-1"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 17
    const-string v0, "swscale-3"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 18
    const-string v0, "avcodec-56"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 19
    const-string v0, "avformat-56"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 26
    const-string v0, "amf"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-void

    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/UnsatisfiedLinkError;->printStackTrace()V

    .line 30
    throw v0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static native nativeConcatFiles([Ljava/lang/String;Ljava/lang/String;)I
.end method


# virtual methods
.method protected native nativeAddCompressedFrameA(IJ[BIII)I
.end method

.method protected native nativeAddCompressedFrameV(IJ[BIII)I
.end method

.method protected native nativeAddExtraDataA(I[BII)I
.end method

.method protected native nativeAddExtraDataV(I[BII)I
.end method

.method protected native nativeDecodeActualTimestampA(I)J
.end method

.method protected native nativeDecodeActualTimestampV(I)J
.end method

.method protected native nativeDecodeEoF(I)I
.end method

.method protected native nativeDecodeFrameA(IJ[BII)I
.end method

.method protected native nativeDecodeFrameV(IJ[BIIII)I
.end method

.method protected native nativeDecodeGetAudioBufferSize(I)I
.end method

.method protected native nativeDecodeGetAudioChannelLayout(I)I
.end method

.method protected native nativeDecodeGetAudioChannels(I)I
.end method

.method protected native nativeDecodeGetAudioFormat(I)I
.end method

.method protected native nativeDecodeGetAudioFrameSize(I)I
.end method

.method protected native nativeDecodeGetAudioSamplerate(I)I
.end method

.method protected native nativeDecodeSeekTo(IJ)I
.end method

.method protected native nativeDecodeSetAudioChannels(II)I
.end method

.method protected native nativeDecodeSetAudioFormat(II)I
.end method

.method protected native nativeDecodeSetAudioFrameSize(II)I
.end method

.method protected native nativeDecodeSetAudioSamplerate(II)I
.end method

.method protected native nativeEncodeBufferA(IJ[BII)I
.end method

.method protected native nativeEncodeBufferV(IJ[BIIII)I
.end method

.method protected native nativeEncodeFrameV(IJLandroid/graphics/Bitmap;ZZ)I
.end method

.method protected native nativeEncodeGetDurationA(I)J
.end method

.method protected native nativeEncodeGetDurationV(I)J
.end method

.method protected native nativeEncodeSetFps(ID)I
.end method

.method protected native nativeEncodeSetResolution(III)I
.end method

.method protected native nativeEncodeSetVideoQuality(II)I
.end method

.method protected native nativeGetLastError(I)I
.end method

.method protected native nativeInit()I
.end method

.method protected native nativeRelease(I)V
.end method

.method protected native nativeRgbaBitmapToRgbaBuffer(ILandroid/graphics/Bitmap;[B)I
.end method

.method protected native nativeRgbaBitmapToYuv(ILandroid/graphics/Bitmap;[BI)I
.end method

.method protected native nativeRgbaToYuv(I[B[BIII)I
.end method

.method protected native nativeSetAudioStartFrom(IJ)I
.end method

.method protected native nativeSetDecodeFrom(ILjava/lang/String;)I
.end method

.method protected native nativeSetEncodeDuration(IJ)I
.end method

.method protected native nativeSetEncodeTo(ILjava/lang/String;)I
.end method
