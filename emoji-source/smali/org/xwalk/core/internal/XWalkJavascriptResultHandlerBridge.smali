.class public Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;
.super Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
.source "XWalkJavascriptResultHandlerBridge.java"


# static fields
.field private static final WRAPPER_CLASS:Ljava/lang/String; = "org.xwalk.core.Object"


# instance fields
.field private cancelMethod:Ljava/lang/reflect/Method;

.field private confirmMethod:Ljava/lang/reflect/Method;

.field private confirmWithResultStringMethod:Ljava/lang/reflect/Method;

.field private internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

.field private wrapper:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 83
    const-string v0, "XWalkJavascriptResultHandlerBridgeConstructor"

    const-string v1, "org.xwalk.core.XWalkJavascriptResultHandler"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void
.end method

.method constructor <init>(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)V
    .locals 4
    .param p1, "internal"    # Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;-><init>()V

    .line 14
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    .line 16
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    .line 17
    const-string v1, "XWalkJavascriptResultHandlerBridgeConstructor"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->wrapper:Ljava/lang/Object;

    .line 19
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :goto_0
    return-void

    .line 20
    :catch_0
    move-exception v0

    .line 21
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private reflectionInit()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 75
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->wrapper:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 76
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "confirm"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->confirmMethod:Ljava/lang/reflect/Method;

    .line 77
    const-string v1, "confirmWithResult"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->confirmWithResultStringMethod:Ljava/lang/reflect/Method;

    .line 78
    const-string v1, "cancel"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->cancelMethod:Ljava/lang/reflect/Method;

    .line 80
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 3

    .prologue
    .line 59
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->cancelMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    return-void
.end method

.method public cancelSuper()V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    if-nez v0, :cond_0

    .line 65
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->cancel()V

    .line 69
    :goto_0
    return-void

    .line 67
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->cancel()V

    goto :goto_0
.end method

.method public confirm()V
    .locals 3

    .prologue
    .line 29
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->confirmMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    return-void
.end method

.method public confirmSuper()V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    if-nez v0, :cond_0

    .line 35
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->confirm()V

    .line 39
    :goto_0
    return-void

    .line 37
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->confirm()V

    goto :goto_0
.end method

.method public confirmWithResult(Ljava/lang/String;)V
    .locals 4
    .param p1, "promptResult"    # Ljava/lang/String;

    .prologue
    .line 44
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->confirmWithResultStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    return-void
.end method

.method public confirmWithResultSuper(Ljava/lang/String;)V
    .locals 1
    .param p1, "promptResult"    # Ljava/lang/String;

    .prologue
    .line 49
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    if-nez v0, :cond_0

    .line 50
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->confirmWithResult(Ljava/lang/String;)V

    .line 54
    :goto_0
    return-void

    .line 52
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->internal:Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    invoke-virtual {v0, p1}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->confirmWithResult(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getWrapper()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->wrapper:Ljava/lang/Object;

    return-object v0
.end method
