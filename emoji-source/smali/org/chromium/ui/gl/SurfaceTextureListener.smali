.class Lorg/chromium/ui/gl/SurfaceTextureListener;
.super Ljava/lang/Object;
.source "SurfaceTextureListener.java"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "gfx"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final mNativeSurfaceTextureListener:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lorg/chromium/ui/gl/SurfaceTextureListener;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/ui/gl/SurfaceTextureListener;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(J)V
    .locals 3
    .param p1, "nativeSurfaceTextureListener"    # J

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-boolean v0, Lorg/chromium/ui/gl/SurfaceTextureListener;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 21
    :cond_0
    iput-wide p1, p0, Lorg/chromium/ui/gl/SurfaceTextureListener;->mNativeSurfaceTextureListener:J

    .line 22
    return-void
.end method

.method private native nativeDestroy(J)V
.end method

.method private native nativeFrameAvailable(J)V
.end method


# virtual methods
.method protected finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    .line 32
    :try_start_0
    iget-wide v0, p0, Lorg/chromium/ui/gl/SurfaceTextureListener;->mNativeSurfaceTextureListener:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/ui/gl/SurfaceTextureListener;->nativeDestroy(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 36
    return-void

    .line 34
    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 2
    .param p1, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;

    .prologue
    .line 26
    iget-wide v0, p0, Lorg/chromium/ui/gl/SurfaceTextureListener;->mNativeSurfaceTextureListener:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/ui/gl/SurfaceTextureListener;->nativeFrameAvailable(J)V

    .line 27
    return-void
.end method
