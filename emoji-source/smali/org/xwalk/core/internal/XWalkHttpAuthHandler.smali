.class public Lorg/xwalk/core/internal/XWalkHttpAuthHandler;
.super Ljava/lang/Object;
.source "XWalkHttpAuthHandler.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# instance fields
.field private final mFirstAttempt:Z

.field private mNativeXWalkHttpAuthHandler:J


# direct methods
.method private constructor <init>(JZ)V
    .locals 1
    .param p1, "nativeXWalkHttpAuthHandler"    # J
    .param p3, "firstAttempt"    # Z

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-wide p1, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    .line 45
    iput-boolean p3, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mFirstAttempt:Z

    .line 46
    return-void
.end method

.method public static create(JZ)Lorg/xwalk/core/internal/XWalkHttpAuthHandler;
    .locals 2
    .param p0, "nativeXWalkAuthHandler"    # J
    .param p2, "firstAttempt"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 40
    new-instance v0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;

    invoke-direct {v0, p0, p1, p2}, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;-><init>(JZ)V

    return-object v0
.end method

.method private native nativeCancel(J)V
.end method

.method private native nativeProceed(JLjava/lang/String;Ljava/lang/String;)V
.end method


# virtual methods
.method public cancel()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 28
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    invoke-direct {p0, v0, v1}, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->nativeCancel(J)V

    .line 30
    iput-wide v2, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    .line 32
    :cond_0
    return-void
.end method

.method handlerDestroyed()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 50
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    .line 51
    return-void
.end method

.method public isFirstAttempt()Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mFirstAttempt:Z

    return v0
.end method

.method public proceed(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "username"    # Ljava/lang/String;
    .param p2, "password"    # Ljava/lang/String;

    .prologue
    const-wide/16 v2, 0x0

    .line 21
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 22
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->nativeProceed(JLjava/lang/String;Ljava/lang/String;)V

    .line 23
    iput-wide v2, p0, Lorg/xwalk/core/internal/XWalkHttpAuthHandler;->mNativeXWalkHttpAuthHandler:J

    .line 25
    :cond_0
    return-void
.end method
