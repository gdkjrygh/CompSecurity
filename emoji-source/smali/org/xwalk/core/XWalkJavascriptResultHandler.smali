.class public Lorg/xwalk/core/XWalkJavascriptResultHandler;
.super Ljava/lang/Object;
.source "XWalkJavascriptResultHandler.java"

# interfaces
.implements Lorg/xwalk/core/XWalkJavascriptResult;


# static fields
.field private static final BRIDGE_CLASS:Ljava/lang/String; = "org.xwalk.core.internal.XWalkJavascriptResultHandlerBridge"


# instance fields
.field private bridge:Ljava/lang/Object;

.field private cancelMethod:Ljava/lang/reflect/Method;

.field private confirmMethod:Ljava/lang/reflect/Method;

.field private confirmWithResultStringMethod:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1, "bridge"    # Ljava/lang/Object;

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->bridge:Ljava/lang/Object;

    .line 24
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/XWalkJavascriptResultHandler;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    :goto_0
    return-void

    .line 25
    :catch_0
    move-exception v0

    .line 26
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

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

    .line 52
    iget-object v1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->bridge:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 53
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "confirmSuper"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->confirmMethod:Ljava/lang/reflect/Method;

    .line 54
    const-string v1, "confirmWithResultSuper"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->confirmWithResultStringMethod:Ljava/lang/reflect/Method;

    .line 55
    const-string v1, "cancelSuper"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->cancelMethod:Ljava/lang/reflect/Method;

    .line 57
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 3

    .prologue
    .line 45
    iget-object v0, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->cancelMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    return-void
.end method

.method public confirm()V
    .locals 3

    .prologue
    .line 33
    iget-object v0, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->confirmMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    return-void
.end method

.method public confirmWithResult(Ljava/lang/String;)V
    .locals 4
    .param p1, "promptResult"    # Ljava/lang/String;

    .prologue
    .line 39
    iget-object v0, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->confirmWithResultStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->bridge:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    return-void
.end method

.method getBridge()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lorg/xwalk/core/XWalkJavascriptResultHandler;->bridge:Ljava/lang/Object;

    return-object v0
.end method
