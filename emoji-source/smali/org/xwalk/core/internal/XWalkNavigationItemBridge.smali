.class public Lorg/xwalk/core/internal/XWalkNavigationItemBridge;
.super Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
.source "XWalkNavigationItemBridge.java"


# static fields
.field private static final WRAPPER_CLASS:Ljava/lang/String; = "org.xwalk.core.Object"


# instance fields
.field private getOriginalUrlMethod:Ljava/lang/reflect/Method;

.field private getTitleMethod:Ljava/lang/reflect/Method;

.field private getUrlMethod:Ljava/lang/reflect/Method;

.field private internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

.field private wrapper:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 92
    const-string v0, "XWalkNavigationItemBridgeConstructor"

    const-string v1, "org.xwalk.core.XWalkNavigationItem"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    return-void
.end method

.method constructor <init>(Lorg/xwalk/core/internal/XWalkNavigationItemInternal;)V
    .locals 4
    .param p1, "internal"    # Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;-><init>()V

    .line 14
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    .line 16
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    .line 17
    const-string v1, "XWalkNavigationItemBridgeConstructor"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->wrapper:Ljava/lang/Object;

    .line 19
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->reflectionInit()V
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
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 84
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->wrapper:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 85
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "getUrl"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->getUrlMethod:Ljava/lang/reflect/Method;

    .line 86
    const-string v1, "getOriginalUrl"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->getOriginalUrlMethod:Ljava/lang/reflect/Method;

    .line 87
    const-string v1, "getTitle"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->getTitleMethod:Ljava/lang/reflect/Method;

    .line 89
    return-void
.end method


# virtual methods
.method public getOriginalUrl()Ljava/lang/String;
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->getOriginalUrlMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalUrlSuper()Ljava/lang/String;
    .locals 2

    .prologue
    .line 53
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    if-nez v1, :cond_1

    .line 54
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->getOriginalUrl()Ljava/lang/String;

    move-result-object v0

    .line 58
    .local v0, "ret":Ljava/lang/String;
    :goto_0
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 59
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0

    .line 56
    :cond_1
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->getOriginalUrl()Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "ret":Ljava/lang/String;
    goto :goto_0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 3

    .prologue
    .line 65
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->getTitleMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTitleSuper()Ljava/lang/String;
    .locals 2

    .prologue
    .line 71
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    if-nez v1, :cond_1

    .line 72
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 76
    .local v0, "ret":Ljava/lang/String;
    :goto_0
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 77
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0

    .line 74
    :cond_1
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->getTitle()Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "ret":Ljava/lang/String;
    goto :goto_0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 3

    .prologue
    .line 29
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->getUrlMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getUrlSuper()Ljava/lang/String;
    .locals 2

    .prologue
    .line 35
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    if-nez v1, :cond_1

    .line 36
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 40
    .local v0, "ret":Ljava/lang/String;
    :goto_0
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 41
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0

    .line 38
    :cond_1
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationItemInternal;->getUrl()Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "ret":Ljava/lang/String;
    goto :goto_0
.end method

.method public getWrapper()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;->wrapper:Ljava/lang/Object;

    return-object v0
.end method
