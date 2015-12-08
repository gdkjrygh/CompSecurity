.class public Lorg/xwalk/core/internal/XWalkResourceClientBridge;
.super Lorg/xwalk/core/internal/XWalkResourceClientInternal;
.source "XWalkResourceClientBridge.java"


# static fields
.field private static final WRAPPER_CLASS:Ljava/lang/String; = "org.xwalk.core.Object"


# instance fields
.field private onLoadFinishedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private onLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private onProgressChangedXWalkViewInternalintMethod:Ljava/lang/reflect/Method;

.field private onReceivedLoadErrorXWalkViewInternalintStringStringMethod:Ljava/lang/reflect/Method;

.field private onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod:Ljava/lang/reflect/Method;

.field private shouldInterceptLoadRequestXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private shouldOverrideUrlLoadingXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private wrapper:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/Object;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "wrapper"    # Ljava/lang/Object;

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;-><init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 25
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    .line 27
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    return-void

    .line 28
    :catch_0
    move-exception v0

    .line 29
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private reflectionInit()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 176
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 177
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "onLoadStarted"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 178
    const-string v1, "onLoadFinished"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onLoadFinishedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 179
    const-string v1, "onProgressChanged"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onProgressChangedXWalkViewInternalintMethod:Ljava/lang/reflect/Method;

    .line 180
    const-string v1, "shouldInterceptLoadRequest"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->shouldInterceptLoadRequestXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 181
    const-string v1, "onReceivedLoadError"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onReceivedLoadErrorXWalkViewInternalintStringStringMethod:Ljava/lang/reflect/Method;

    .line 182
    const-string v1, "shouldOverrideUrlLoading"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->shouldOverrideUrlLoadingXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 183
    const-string v1, "onReceivedSslError"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v4

    const-class v3, Landroid/webkit/ValueCallback;

    aput-object v3, v2, v5

    const-class v3, Landroid/net/http/SslError;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod:Ljava/lang/reflect/Method;

    .line 185
    return-void
.end method


# virtual methods
.method public getWrapper()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    return-object v0
.end method

.method public onLoadFinished(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 63
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onLoadFinishedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    return-void
.end method

.method public onLoadFinished(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 55
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 56
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onLoadFinished(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V

    .line 60
    :goto_0
    return-void

    .line 58
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onLoadFinished(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onLoadFinishedSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 68
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onLoadFinished(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 69
    return-void
.end method

.method public onLoadStarted(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 44
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    return-void
.end method

.method public onLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 36
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 37
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onLoadStarted(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V

    .line 41
    :goto_0
    return-void

    .line 39
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onLoadStartedSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 50
    return-void
.end method

.method public onProgressChanged(Lorg/xwalk/core/internal/XWalkViewBridge;I)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "progressInPercent"    # I

    .prologue
    .line 82
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onProgressChangedXWalkViewInternalintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    return-void
.end method

.method public onProgressChanged(Lorg/xwalk/core/internal/XWalkViewInternal;I)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "progressInPercent"    # I

    .prologue
    .line 74
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 75
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onProgressChanged(Lorg/xwalk/core/internal/XWalkViewBridge;I)V

    .line 79
    :goto_0
    return-void

    .line 77
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onProgressChanged(Lorg/xwalk/core/internal/XWalkViewInternal;I)V

    goto :goto_0
.end method

.method public onProgressChangedSuper(Lorg/xwalk/core/internal/XWalkViewBridge;I)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "progressInPercent"    # I

    .prologue
    .line 87
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onProgressChanged(Lorg/xwalk/core/internal/XWalkViewInternal;I)V

    .line 88
    return-void
.end method

.method public onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewBridge;ILjava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 123
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onReceivedLoadErrorXWalkViewInternalintStringStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    const/4 v3, 0x3

    aput-object p4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    return-void
.end method

.method public onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewInternal;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 115
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 116
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewBridge;ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    :goto_0
    return-void

    .line 118
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewInternal;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onReceivedLoadErrorSuper(Lorg/xwalk/core/internal/XWalkViewBridge;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 128
    invoke-super {p0, p1, p2, p3, p4}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedLoadError(Lorg/xwalk/core/internal/XWalkViewInternal;ILjava/lang/String;Ljava/lang/String;)V

    .line 129
    return-void
.end method

.method public onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p3, "error"    # Landroid/net/http/SslError;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewBridge;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/net/http/SslError;",
            ")V"
        }
    .end annotation

    .prologue
    .line 164
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    return-void
.end method

.method public onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p3, "error"    # Landroid/net/http/SslError;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/net/http/SslError;",
            ")V"
        }
    .end annotation

    .prologue
    .line 156
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 157
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V

    .line 161
    :goto_0
    return-void

    .line 159
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V

    goto :goto_0
.end method

.method public onReceivedSslErrorSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p3, "error"    # Landroid/net/http/SslError;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewBridge;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/net/http/SslError;",
            ")V"
        }
    .end annotation

    .prologue
    .line 169
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->onReceivedSslError(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V

    .line 170
    return-void
.end method

.method public shouldInterceptLoadRequest(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 101
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->shouldInterceptLoadRequestXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebResourceResponse;

    return-object v0
.end method

.method public shouldInterceptLoadRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 93
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 94
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->shouldInterceptLoadRequest(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    .line 96
    :goto_0
    return-object v0

    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->shouldInterceptLoadRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    goto :goto_0
.end method

.method public shouldInterceptLoadRequestSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 107
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->shouldInterceptLoadRequest(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    .line 108
    .local v0, "ret":Landroid/webkit/WebResourceResponse;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 109
    .end local v0    # "ret":Landroid/webkit/WebResourceResponse;
    :cond_0
    return-object v0
.end method

.method public shouldOverrideUrlLoading(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)Z
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 142
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->shouldOverrideUrlLoadingXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public shouldOverrideUrlLoading(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 134
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 135
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->shouldOverrideUrlLoading(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)Z

    move-result v0

    .line 137
    :goto_0
    return v0

    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->shouldOverrideUrlLoading(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public shouldOverrideUrlLoadingSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 148
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkResourceClientInternal;->shouldOverrideUrlLoading(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)Z

    move-result v0

    .line 150
    .local v0, "ret":Z
    return v0
.end method
