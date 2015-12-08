.class public abstract Lorg/xwalk/core/XWalkExtension;
.super Ljava/lang/Object;
.source "XWalkExtension.java"


# static fields
.field private static final BRIDGE_CLASS:Ljava/lang/String; = "org.xwalk.core.internal.XWalkExtensionBridge"


# instance fields
.field private bridge:Ljava/lang/Object;

.field private broadcastMessageStringMethod:Ljava/lang/reflect/Method;

.field private postMessageintStringMethod:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 123
    const-string v0, "XWalkExtensionInternalStringStringConstructor"

    const-string v1, "org.xwalk.core.internal.XWalkExtensionBridge"

    new-array v2, v7, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/Object;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const-string v0, "XWalkExtensionInternalStringStringString[]Constructor"

    const-string v1, "org.xwalk.core.internal.XWalkExtensionBridge"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    const-class v3, [Ljava/lang/String;

    aput-object v3, v2, v6

    const-class v3, Ljava/lang/Object;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-string v1, "XWalkExtensionInternalStringStringConstructor"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Lorg/xwalk/core/ReflectionHelper;->createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkExtension;->bridge:Ljava/lang/Object;

    .line 37
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/XWalkExtension;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :goto_0
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .param p3, "entryPoints"    # [Ljava/lang/String;

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const-string v1, "XWalkExtensionInternalStringStringString[]Constructor"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    const/4 v3, 0x3

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Lorg/xwalk/core/ReflectionHelper;->createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkExtension;->bridge:Ljava/lang/Object;

    .line 59
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/XWalkExtension;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_0
    return-void

    .line 60
    :catch_0
    move-exception v0

    .line 61
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private reflectionInit()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 115
    iget-object v1, p0, Lorg/xwalk/core/XWalkExtension;->bridge:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 116
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "postMessageSuper"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkExtension;->postMessageintStringMethod:Ljava/lang/reflect/Method;

    .line 117
    const-string v1, "broadcastMessageSuper"

    new-array v2, v5, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkExtension;->broadcastMessageStringMethod:Ljava/lang/reflect/Method;

    .line 119
    return-void
.end method


# virtual methods
.method public broadcastMessage(Ljava/lang/String;)V
    .locals 4
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 88
    iget-object v0, p0, Lorg/xwalk/core/XWalkExtension;->broadcastMessageStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkExtension;->bridge:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    return-void
.end method

.method getBridge()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lorg/xwalk/core/XWalkExtension;->bridge:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract onMessage(ILjava/lang/String;)V
.end method

.method public abstract onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public postMessage(ILjava/lang/String;)V
    .locals 5
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 76
    iget-object v0, p0, Lorg/xwalk/core/XWalkExtension;->postMessageintStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkExtension;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    return-void
.end method
