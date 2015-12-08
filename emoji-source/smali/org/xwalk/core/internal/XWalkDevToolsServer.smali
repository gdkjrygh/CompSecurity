.class Lorg/xwalk/core/internal/XWalkDevToolsServer;
.super Ljava/lang/Object;
.source "XWalkDevToolsServer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# static fields
.field private static final DEBUG_PERMISSION_SIFFIX:Ljava/lang/String; = ".permission.DEBUG"


# instance fields
.field private mNativeDevToolsServer:J

.field private mSocketName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "socketName"    # Ljava/lang/String;

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mNativeDevToolsServer:J

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mSocketName:Ljava/lang/String;

    .line 36
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkDevToolsServer;->nativeInitRemoteDebugging(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mNativeDevToolsServer:J

    .line 37
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mSocketName:Ljava/lang/String;

    .line 38
    return-void
.end method

.method private static checkDebugPermission(Landroid/content/Context;II)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "pid"    # I
    .param p2, "uid"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".permission.DEBUG"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 73
    .local v0, "debugPermissionName":Ljava/lang/String;
    invoke-virtual {p0, v0, p1, p2}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private native nativeDestroyRemoteDebugging(J)V
.end method

.method private native nativeInitRemoteDebugging(Ljava/lang/String;)J
.end method

.method private native nativeIsRemoteDebuggingEnabled(J)Z
.end method

.method private native nativeSetRemoteDebuggingEnabled(JZZZ)V
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .prologue
    .line 41
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mNativeDevToolsServer:J

    invoke-direct {p0, v0, v1}, Lorg/xwalk/core/internal/XWalkDevToolsServer;->nativeDestroyRemoteDebugging(J)V

    .line 42
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mNativeDevToolsServer:J

    .line 43
    return-void
.end method

.method public getSocketName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mSocketName:Ljava/lang/String;

    return-object v0
.end method

.method public isRemoteDebuggingEnabled()Z
    .locals 2

    .prologue
    .line 46
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mNativeDevToolsServer:J

    invoke-direct {p0, v0, v1}, Lorg/xwalk/core/internal/XWalkDevToolsServer;->nativeIsRemoteDebuggingEnabled(J)Z

    move-result v0

    return v0
.end method

.method public setRemoteDebuggingEnabled(Z)V
    .locals 1
    .param p1, "enabled"    # Z

    .prologue
    .line 57
    sget-object v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->DEFAULT:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    invoke-virtual {p0, p1, v0}, Lorg/xwalk/core/internal/XWalkDevToolsServer;->setRemoteDebuggingEnabled(ZLorg/xwalk/core/internal/XWalkDevToolsServer$Security;)V

    .line 58
    return-void
.end method

.method public setRemoteDebuggingEnabled(ZLorg/xwalk/core/internal/XWalkDevToolsServer$Security;)V
    .locals 7
    .param p1, "enabled"    # Z
    .param p2, "security"    # Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 50
    sget-object v2, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->ALLOW_DEBUG_PERMISSION:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    if-ne p2, v2, :cond_0

    move v5, v0

    .line 51
    .local v5, "allowDebugPermission":Z
    :goto_0
    sget-object v2, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->ALLOW_SOCKET_ACCESS:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    if-ne p2, v2, :cond_1

    move v6, v0

    .line 52
    .local v6, "allowSocketAccess":Z
    :goto_1
    iget-wide v2, p0, Lorg/xwalk/core/internal/XWalkDevToolsServer;->mNativeDevToolsServer:J

    move-object v1, p0

    move v4, p1

    invoke-direct/range {v1 .. v6}, Lorg/xwalk/core/internal/XWalkDevToolsServer;->nativeSetRemoteDebuggingEnabled(JZZZ)V

    .line 54
    return-void

    .end local v5    # "allowDebugPermission":Z
    .end local v6    # "allowSocketAccess":Z
    :cond_0
    move v5, v1

    .line 50
    goto :goto_0

    .restart local v5    # "allowDebugPermission":Z
    :cond_1
    move v6, v1

    .line 51
    goto :goto_1
.end method
