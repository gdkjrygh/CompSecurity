.class public Lcom/facebook/webrtc/WebrtcEngine;
.super Ljava/lang/Object;
.source "WebrtcEngine.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static b:Z

.field private static c:Z


# instance fields
.field private nativeEngine:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/facebook/webrtc/WebrtcEngine;

    sput-object v0, Lcom/facebook/webrtc/WebrtcEngine;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/webrtc/IWebrtcSignalingMessageInterface;Lcom/facebook/webrtc/IWebrtcUiInterface;Lcom/facebook/webrtc/IWebrtcConfigInterface;Lcom/facebook/webrtc/IWebrtcLoggingInterface;)V
    .locals 4

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-static {p4}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    invoke-static {}, Lcom/facebook/webrtc/WebrtcEngine;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/webrtc/WebrtcEngine;->createEngineNative(Lcom/facebook/webrtc/IWebrtcSignalingMessageInterface;Lcom/facebook/webrtc/IWebrtcUiInterface;Lcom/facebook/webrtc/IWebrtcConfigInterface;Lcom/facebook/webrtc/IWebrtcLoggingInterface;)V

    .line 48
    sget-object v0, Lcom/facebook/webrtc/WebrtcEngine;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Loaded webrtc engine. id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/webrtc/WebrtcEngine;->nativeEngine:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 50
    :cond_0
    return-void
.end method

.method private native acceptCallNative()V
.end method

.method private native createEngineNative(Lcom/facebook/webrtc/IWebrtcSignalingMessageInterface;Lcom/facebook/webrtc/IWebrtcUiInterface;Lcom/facebook/webrtc/IWebrtcConfigInterface;Lcom/facebook/webrtc/IWebrtcLoggingInterface;)V
.end method

.method private native destroyEngineNative()V
.end method

.method private native didShowUiNative()V
.end method

.method private static e()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 168
    sget-boolean v0, Lcom/facebook/webrtc/WebrtcEngine;->b:Z

    if-nez v0, :cond_0

    .line 169
    sput-boolean v1, Lcom/facebook/webrtc/WebrtcEngine;->b:Z

    .line 171
    :try_start_0
    const-string v0, "fb_stl_shared"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 172
    const-string v0, "fb_webrtc_jni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 173
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/webrtc/WebrtcEngine;->c:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    :cond_0
    :goto_0
    sget-boolean v0, Lcom/facebook/webrtc/WebrtcEngine;->c:Z

    return v0

    .line 174
    :catch_0
    move-exception v0

    .line 175
    const/4 v1, 0x0

    sput-boolean v1, Lcom/facebook/webrtc/WebrtcEngine;->c:Z

    .line 176
    sget-object v1, Lcom/facebook/webrtc/WebrtcEngine;->a:Ljava/lang/Class;

    const-string v2, "native library not available"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private native endCallNative(I)V
.end method

.method private native onMessageFromPeerNative(JLjava/lang/String;)V
.end method

.method private native onMessageSendErrorNative(JILjava/lang/String;Ljava/lang/String;)V
.end method

.method private native onMessageSendSuccessNative(J)V
.end method

.method private native setMuteNative(Z)V
.end method

.method private native startCallNative(J)V
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/facebook/webrtc/WebrtcEngine;->endCallNative(I)V

    .line 83
    return-void
.end method

.method public a(J)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0, p1, p2}, Lcom/facebook/webrtc/WebrtcEngine;->startCallNative(J)V

    .line 74
    return-void
.end method

.method public a(JILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 137
    invoke-direct/range {p0 .. p5}, Lcom/facebook/webrtc/WebrtcEngine;->onMessageSendErrorNative(JILjava/lang/String;Ljava/lang/String;)V

    .line 138
    return-void
.end method

.method public a(JLjava/lang/String;)V
    .locals 0

    .prologue
    .line 115
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/webrtc/WebrtcEngine;->onMessageFromPeerNative(JLjava/lang/String;)V

    .line 116
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0, p1}, Lcom/facebook/webrtc/WebrtcEngine;->setMuteNative(Z)V

    .line 106
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 53
    sget-boolean v0, Lcom/facebook/webrtc/WebrtcEngine;->c:Z

    return v0
.end method

.method public b()V
    .locals 4

    .prologue
    .line 60
    iget-wide v0, p0, Lcom/facebook/webrtc/WebrtcEngine;->nativeEngine:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 61
    sget-object v0, Lcom/facebook/webrtc/WebrtcEngine;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closing webrtc engine. id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/webrtc/WebrtcEngine;->nativeEngine:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 63
    invoke-direct {p0}, Lcom/facebook/webrtc/WebrtcEngine;->destroyEngineNative()V

    .line 65
    :cond_0
    return-void
.end method

.method public b(J)V
    .locals 0

    .prologue
    .line 124
    invoke-direct {p0, p1, p2}, Lcom/facebook/webrtc/WebrtcEngine;->onMessageSendSuccessNative(J)V

    .line 125
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lcom/facebook/webrtc/WebrtcEngine;->acceptCallNative()V

    .line 90
    return-void
.end method

.method public d()V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0}, Lcom/facebook/webrtc/WebrtcEngine;->didShowUiNative()V

    .line 97
    return-void
.end method

.method protected finalize()V
    .locals 0

    .prologue
    .line 142
    invoke-virtual {p0}, Lcom/facebook/webrtc/WebrtcEngine;->b()V

    .line 143
    return-void
.end method
