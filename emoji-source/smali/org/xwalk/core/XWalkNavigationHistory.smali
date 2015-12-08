.class public Lorg/xwalk/core/XWalkNavigationHistory;
.super Ljava/lang/Object;
.source "XWalkNavigationHistory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/XWalkNavigationHistory$Direction;
    }
.end annotation


# static fields
.field private static final BRIDGE_CLASS:Ljava/lang/String; = "org.xwalk.core.internal.XWalkNavigationHistoryBridge"


# instance fields
.field private bridge:Ljava/lang/Object;

.field private canGoBackMethod:Ljava/lang/reflect/Method;

.field private canGoForwardMethod:Ljava/lang/reflect/Method;

.field private clearMethod:Ljava/lang/reflect/Method;

.field private enumDirectionClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private enumDirectionClassValueOfMethod:Ljava/lang/reflect/Method;

.field private getCurrentIndexMethod:Ljava/lang/reflect/Method;

.field private getCurrentItemMethod:Ljava/lang/reflect/Method;

.field private getItemAtintMethod:Ljava/lang/reflect/Method;

.field private hasItemAtintMethod:Ljava/lang/reflect/Method;

.field private navigateDirectionInternalintMethod:Ljava/lang/reflect/Method;

.field private sizeMethod:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1, "bridge"    # Ljava/lang/Object;

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    .line 47
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/XWalkNavigationHistory;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :goto_0
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private ConvertDirection(Lorg/xwalk/core/XWalkNavigationHistory$Direction;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/XWalkNavigationHistory$Direction;

    .prologue
    .line 34
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->enumDirectionClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkNavigationHistory$Direction;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
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
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 170
    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 171
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.internal.XWalkNavigationHistoryInternal$DirectionInternal"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->enumDirectionClass:Ljava/lang/Class;

    .line 172
    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->enumDirectionClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->enumDirectionClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 173
    const-string v1, "sizeSuper"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->sizeMethod:Ljava/lang/reflect/Method;

    .line 174
    const-string v1, "hasItemAtSuper"

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->hasItemAtintMethod:Ljava/lang/reflect/Method;

    .line 175
    const-string v1, "getItemAtSuper"

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->getItemAtintMethod:Ljava/lang/reflect/Method;

    .line 176
    const-string v1, "getCurrentItemSuper"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->getCurrentItemMethod:Ljava/lang/reflect/Method;

    .line 177
    const-string v1, "canGoBackSuper"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->canGoBackMethod:Ljava/lang/reflect/Method;

    .line 178
    const-string v1, "canGoForwardSuper"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->canGoForwardMethod:Ljava/lang/reflect/Method;

    .line 179
    const-string v1, "navigateSuper"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lorg/xwalk/core/XWalkNavigationHistory;->enumDirectionClass:Ljava/lang/Class;

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->navigateDirectionInternalintMethod:Ljava/lang/reflect/Method;

    .line 180
    const-string v1, "getCurrentIndexSuper"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->getCurrentIndexMethod:Ljava/lang/reflect/Method;

    .line 181
    const-string v1, "clearSuper"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->clearMethod:Ljava/lang/reflect/Method;

    .line 183
    return-void
.end method


# virtual methods
.method public canGoBack()Z
    .locals 3

    .prologue
    .line 114
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->canGoBackMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public canGoForward()Z
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->canGoForwardMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public clear()V
    .locals 3

    .prologue
    .line 163
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->clearMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    return-void
.end method

.method getBridge()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    return-object v0
.end method

.method public getCurrentIndex()I
    .locals 3

    .prologue
    .line 152
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->getCurrentIndexMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCurrentItem()Lorg/xwalk/core/XWalkNavigationItem;
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->getCurrentItemMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/XWalkNavigationItem;

    return-object v0
.end method

.method public getItemAt(I)Lorg/xwalk/core/XWalkNavigationItem;
    .locals 5
    .param p1, "index"    # I

    .prologue
    .line 88
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->getItemAtintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/XWalkNavigationItem;

    return-object v0
.end method

.method public hasItemAt(I)Z
    .locals 5
    .param p1, "index"    # I

    .prologue
    .line 75
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->hasItemAtintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public navigate(Lorg/xwalk/core/XWalkNavigationHistory$Direction;I)V
    .locals 5
    .param p1, "direction"    # Lorg/xwalk/core/XWalkNavigationHistory$Direction;
    .param p2, "steps"    # I

    .prologue
    .line 140
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->navigateDirectionInternalintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {p0, p1}, Lorg/xwalk/core/XWalkNavigationHistory;->ConvertDirection(Lorg/xwalk/core/XWalkNavigationHistory$Direction;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    return-void
.end method

.method public size()I
    .locals 3

    .prologue
    .line 62
    iget-object v0, p0, Lorg/xwalk/core/XWalkNavigationHistory;->sizeMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkNavigationHistory;->bridge:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
