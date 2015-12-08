.class public Lorg/xwalk/core/XWalkResourceClient;
.super Ljava/lang/Object;
.source "XWalkResourceClient.java"


# static fields
.field private static final BRIDGE_CLASS:Ljava/lang/String; = "org.xwalk.core.internal.XWalkResourceClientBridge"

.field public static final ERROR_AUTHENTICATION:I = -0x4

.field public static final ERROR_BAD_URL:I = -0xc

.field public static final ERROR_CONNECT:I = -0x6

.field public static final ERROR_FAILED_SSL_HANDSHAKE:I = -0xb

.field public static final ERROR_FILE:I = -0xd

.field public static final ERROR_FILE_NOT_FOUND:I = -0xe

.field public static final ERROR_HOST_LOOKUP:I = -0x2

.field public static final ERROR_IO:I = -0x7

.field public static final ERROR_OK:I = 0x0

.field public static final ERROR_PROXY_AUTHENTICATION:I = -0x5

.field public static final ERROR_REDIRECT_LOOP:I = -0x9

.field public static final ERROR_TIMEOUT:I = -0x8

.field public static final ERROR_TOO_MANY_REQUESTS:I = -0xf

.field public static final ERROR_UNKNOWN:I = -0x1

.field public static final ERROR_UNSUPPORTED_AUTH_SCHEME:I = -0x3

.field public static final ERROR_UNSUPPORTED_SCHEME:I = -0xa


# instance fields
.field private bridge:Ljava/lang/Object;

.field private onLoadFinishedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private onLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private onProgressChangedXWalkViewInternalintMethod:Ljava/lang/reflect/Method;

.field private onReceivedLoadErrorXWalkViewInternalintStringStringMethod:Ljava/lang/reflect/Method;

.field private onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod:Ljava/lang/reflect/Method;

.field private shouldInterceptLoadRequestXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private shouldOverrideUrlLoadingXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 282
    const-string v0, "XWalkResourceClientInternalXWalkViewInternalConstructor"

    const-string v1, "org.xwalk.core.internal.XWalkResourceClientBridge"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    return-void
.end method

.method public constructor <init>(Lorg/xwalk/core/XWalkView;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;

    .prologue
    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    const-string v1, "XWalkResourceClientInternalXWalkViewInternalConstructor"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Lorg/xwalk/core/ReflectionHelper;->createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    .line 140
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/XWalkResourceClient;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :goto_0
    return-void

    .line 141
    :catch_0
    move-exception v0

    .line 142
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

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

    .line 269
    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 270
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "onLoadStartedSuper"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->onLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 271
    const-string v1, "onLoadFinishedSuper"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->onLoadFinishedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 272
    const-string v1, "onProgressChangedSuper"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->onProgressChangedXWalkViewInternalintMethod:Ljava/lang/reflect/Method;

    .line 273
    const-string v1, "shouldInterceptLoadRequestSuper"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->shouldInterceptLoadRequestXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 274
    const-string v1, "onReceivedLoadErrorSuper"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->onReceivedLoadErrorXWalkViewInternalintStringStringMethod:Ljava/lang/reflect/Method;

    .line 275
    const-string v1, "shouldOverrideUrlLoadingSuper"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->shouldOverrideUrlLoadingXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 276
    const-string v1, "onReceivedSslErrorSuper"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v4

    const-class v3, Landroid/webkit/ValueCallback;

    aput-object v3, v2, v5

    const-class v3, Landroid/net/http/SslError;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod:Ljava/lang/reflect/Method;

    .line 278
    return-void
.end method


# virtual methods
.method getBridge()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    return-object v0
.end method

.method public onLoadFinished(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 172
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->onLoadFinishedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    return-void
.end method

.method public onLoadStarted(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 158
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->onLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    return-void
.end method

.method public onProgressChanged(Lorg/xwalk/core/XWalkView;I)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "progressInPercent"    # I

    .prologue
    .line 185
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->onProgressChangedXWalkViewInternalintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    return-void
.end method

.method public onReceivedLoadError(Lorg/xwalk/core/XWalkView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 222
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->onReceivedLoadErrorXWalkViewInternalintStringStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

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

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    return-void
.end method

.method public onReceivedSslError(Lorg/xwalk/core/XWalkView;Landroid/webkit/ValueCallback;Landroid/net/http/SslError;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p3, "error"    # Landroid/net/http/SslError;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/XWalkView;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/net/http/SslError;",
            ")V"
        }
    .end annotation

    .prologue
    .line 262
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    return-void
.end method

.method public shouldInterceptLoadRequest(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 207
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->shouldInterceptLoadRequestXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebResourceResponse;

    return-object v0
.end method

.method public shouldOverrideUrlLoading(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)Z
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 244
    iget-object v0, p0, Lorg/xwalk/core/XWalkResourceClient;->shouldOverrideUrlLoadingXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkResourceClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
