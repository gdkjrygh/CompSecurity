.class public abstract Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;
.super Ljava/lang/Object;
.source "XWalkExtensionAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk::extensions"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "XWalkExtensionAndroid"


# instance fields
.field private mXWalkExtension:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->nativeGetOrCreateExtension(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .param p3, "entryPoints"    # [Ljava/lang/String;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->nativeGetOrCreateExtension(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    .line 29
    return-void
.end method

.method private native nativeBroadcastMessage(JLjava/lang/String;)V
.end method

.method private native nativeDestroyExtension(J)V
.end method

.method private native nativeGetOrCreateExtension(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
.end method

.method private native nativePostMessage(JILjava/lang/String;)V
.end method


# virtual methods
.method public broadcastMessage(Ljava/lang/String;)V
    .locals 4
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 51
    iget-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 52
    const-string v0, "XWalkExtensionAndroid"

    const-string v1, "Can not broadcast message to an invalid extension!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    :goto_0
    return-void

    .line 56
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    invoke-direct {p0, v0, v1, p1}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->nativeBroadcastMessage(JLjava/lang/String;)V

    goto :goto_0
.end method

.method protected destroyExtension()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 32
    iget-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 33
    const-string v0, "XWalkExtensionAndroid"

    const-string v1, "The extension to be destroyed is invalid!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    :goto_0
    return-void

    .line 37
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    invoke-direct {p0, v0, v1}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->nativeDestroyExtension(J)V

    .line 38
    iput-wide v2, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    goto :goto_0
.end method

.method public abstract onMessage(ILjava/lang/String;)V
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public postMessage(ILjava/lang/String;)V
    .locals 4
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 42
    iget-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 43
    const-string v0, "XWalkExtensionAndroid"

    const-string v1, "Can not post a message to an invalid extension!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    :goto_0
    return-void

    .line 47
    :cond_0
    iget-wide v0, p0, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->mXWalkExtension:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->nativePostMessage(JILjava/lang/String;)V

    goto :goto_0
.end method
