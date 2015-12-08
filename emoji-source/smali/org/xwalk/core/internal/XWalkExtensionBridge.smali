.class public Lorg/xwalk/core/internal/XWalkExtensionBridge;
.super Lorg/xwalk/core/internal/XWalkExtensionInternal;
.source "XWalkExtensionBridge.java"


# static fields
.field private static final WRAPPER_CLASS:Ljava/lang/String; = "org.xwalk.core.Object"


# instance fields
.field private broadcastMessageStringMethod:Ljava/lang/reflect/Method;

.field private onMessageintStringMethod:Ljava/lang/reflect/Method;

.field private onSyncMessageintStringMethod:Ljava/lang/reflect/Method;

.field private postMessageintStringMethod:Ljava/lang/reflect/Method;

.field private wrapper:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .param p3, "wrapper"    # Ljava/lang/Object;

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkExtensionInternal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    .line 20
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkExtensionBridge;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :goto_0
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .param p3, "entryPoints"    # [Ljava/lang/String;
    .param p4, "wrapper"    # Ljava/lang/Object;

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkExtensionInternal;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 28
    iput-object p4, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    .line 30
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkExtensionBridge;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    :goto_0
    return-void

    .line 31
    :catch_0
    move-exception v0

    .line 32
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private reflectionInit()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 76
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 77
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "postMessage"

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->postMessageintStringMethod:Ljava/lang/reflect/Method;

    .line 78
    const-string v1, "broadcastMessage"

    new-array v2, v5, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->broadcastMessageStringMethod:Ljava/lang/reflect/Method;

    .line 79
    const-string v1, "onMessage"

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->onMessageintStringMethod:Ljava/lang/reflect/Method;

    .line 80
    const-string v1, "onSyncMessage"

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->onSyncMessageintStringMethod:Ljava/lang/reflect/Method;

    .line 82
    return-void
.end method


# virtual methods
.method public broadcastMessage(Ljava/lang/String;)V
    .locals 4
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->broadcastMessageStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    return-void
.end method

.method public broadcastMessageSuper(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 55
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkExtensionInternal;->broadcastMessage(Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method public getWrapper()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    return-object v0
.end method

.method public onMessage(ILjava/lang/String;)V
    .locals 5
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 61
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->onMessageintStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    return-void
.end method

.method public onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 68
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->onSyncMessageintStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public postMessage(ILjava/lang/String;)V
    .locals 5
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 39
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->postMessageintStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkExtensionBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    return-void
.end method

.method public postMessageSuper(ILjava/lang/String;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 44
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkExtensionInternal;->postMessage(ILjava/lang/String;)V

    .line 45
    return-void
.end method
