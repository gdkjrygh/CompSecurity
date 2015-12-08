.class public Ljp/co/cyberagent/android/gpuimage/GPUImageNativeLibrary;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static loadGPUImageFailed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 20
    sput-boolean v0, Ljp/co/cyberagent/android/gpuimage/GPUImageNativeLibrary;->loadGPUImageFailed:Z

    .line 23
    :try_start_0
    const-string v0, "gpuimage-library"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 24
    const/4 v0, 0x0

    sput-boolean v0, Ljp/co/cyberagent/android/gpuimage/GPUImageNativeLibrary;->loadGPUImageFailed:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    :goto_0
    return-void

    .line 26
    :catch_0
    move-exception v0

    const/4 v0, 0x1

    sput-boolean v0, Ljp/co/cyberagent/android/gpuimage/GPUImageNativeLibrary;->loadGPUImageFailed:Z

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native YUVtoARBG([BII[I)V
.end method

.method public static native YUVtoRBGA([BII[I)V
.end method
