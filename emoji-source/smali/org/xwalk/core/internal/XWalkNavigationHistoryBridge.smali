.class public Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;
.super Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;
.source "XWalkNavigationHistoryBridge.java"


# static fields
.field private static final WRAPPER_CLASS:Ljava/lang/String; = "org.xwalk.core.Object"


# instance fields
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

.field private internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

.field private navigateDirectionInternalintMethod:Ljava/lang/reflect/Method;

.field private sizeMethod:Ljava/lang/reflect/Method;

.field private wrapper:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 208
    const-string v0, "XWalkNavigationHistoryBridgeConstructor"

    const-string v1, "org.xwalk.core.XWalkNavigationHistory"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void
.end method

.method constructor <init>(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;)V
    .locals 4
    .param p1, "internal"    # Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    .prologue
    .line 16
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;-><init>()V

    .line 15
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    .line 17
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    .line 18
    const-string v1, "XWalkNavigationHistoryBridgeConstructor"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->createInstance(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    .line 20
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->reflectionInit()V
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

.method private ConvertDirectionInternal(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->enumDirectionClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 192
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 193
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.XWalkNavigationHistory$Direction"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->enumDirectionClass:Ljava/lang/Class;

    .line 194
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->enumDirectionClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->enumDirectionClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 195
    const-string v1, "size"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->sizeMethod:Ljava/lang/reflect/Method;

    .line 196
    const-string v1, "hasItemAt"

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->hasItemAtintMethod:Ljava/lang/reflect/Method;

    .line 197
    const-string v1, "getItemAt"

    new-array v2, v6, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->getItemAtintMethod:Ljava/lang/reflect/Method;

    .line 198
    const-string v1, "getCurrentItem"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->getCurrentItemMethod:Ljava/lang/reflect/Method;

    .line 199
    const-string v1, "canGoBack"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->canGoBackMethod:Ljava/lang/reflect/Method;

    .line 200
    const-string v1, "canGoForward"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->canGoForwardMethod:Ljava/lang/reflect/Method;

    .line 201
    const-string v1, "navigate"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->enumDirectionClass:Ljava/lang/Class;

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->navigateDirectionInternalintMethod:Ljava/lang/reflect/Method;

    .line 202
    const-string v1, "getCurrentIndex"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->getCurrentIndexMethod:Ljava/lang/reflect/Method;

    .line 203
    const-string v1, "clear"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->clearMethod:Ljava/lang/reflect/Method;

    .line 205
    return-void
.end method


# virtual methods
.method public canGoBack()Z
    .locals 3

    .prologue
    .line 107
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->canGoBackMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public canGoBackSuper()Z
    .locals 2

    .prologue
    .line 113
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v1, :cond_0

    .line 114
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->canGoBack()Z

    move-result v0

    .line 119
    .local v0, "ret":Z
    :goto_0
    return v0

    .line 116
    .end local v0    # "ret":Z
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->canGoBack()Z

    move-result v0

    .restart local v0    # "ret":Z
    goto :goto_0
.end method

.method public canGoForward()Z
    .locals 3

    .prologue
    .line 125
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->canGoForwardMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public canGoForwardSuper()Z
    .locals 2

    .prologue
    .line 131
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v1, :cond_0

    .line 132
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->canGoForward()Z

    move-result v0

    .line 137
    .local v0, "ret":Z
    :goto_0
    return v0

    .line 134
    .end local v0    # "ret":Z
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->canGoForward()Z

    move-result v0

    .restart local v0    # "ret":Z
    goto :goto_0
.end method

.method public clear()V
    .locals 3

    .prologue
    .line 176
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->clearMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    return-void
.end method

.method public clearSuper()V
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v0, :cond_0

    .line 182
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->clear()V

    .line 186
    :goto_0
    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->clear()V

    goto :goto_0
.end method

.method public getCurrentIndex()I
    .locals 3

    .prologue
    .line 158
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->getCurrentIndexMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCurrentIndexSuper()I
    .locals 2

    .prologue
    .line 164
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v1, :cond_0

    .line 165
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getCurrentIndex()I

    move-result v0

    .line 170
    .local v0, "ret":I
    :goto_0
    return v0

    .line 167
    .end local v0    # "ret":I
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getCurrentIndex()I

    move-result v0

    .restart local v0    # "ret":I
    goto :goto_0
.end method

.method public getCurrentItem()Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    .locals 3

    .prologue
    .line 89
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->getCurrentItemMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    return-object v0
.end method

.method public getCurrentItemSuper()Lorg/xwalk/core/internal/XWalkNavigationItemBridge;
    .locals 2

    .prologue
    .line 95
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v1, :cond_0

    .line 96
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getCurrentItem()Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    move-result-object v0

    .line 100
    .local v0, "ret":Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 101
    .end local v0    # "ret":Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    :goto_1
    return-object v0

    .line 98
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getCurrentItem()Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    move-result-object v0

    .restart local v0    # "ret":Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    goto :goto_0

    .line 101
    :cond_1
    instance-of v1, v0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    if-eqz v1, :cond_2

    check-cast v0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    goto :goto_1

    :cond_2
    new-instance v1, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    invoke-direct {v1, v0}, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;-><init>(Lorg/xwalk/core/internal/XWalkNavigationItemInternal;)V

    move-object v0, v1

    goto :goto_1
.end method

.method public getItemAt(I)Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    .locals 5
    .param p1, "index"    # I

    .prologue
    .line 71
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->getItemAtintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    return-object v0
.end method

.method public getItemAtSuper(I)Lorg/xwalk/core/internal/XWalkNavigationItemBridge;
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 77
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v1, :cond_0

    .line 78
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getItemAt(I)Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    move-result-object v0

    .line 82
    .local v0, "ret":Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 83
    .end local v0    # "ret":Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    :goto_1
    return-object v0

    .line 80
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v1, p1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->getItemAt(I)Lorg/xwalk/core/internal/XWalkNavigationItemInternal;

    move-result-object v0

    .restart local v0    # "ret":Lorg/xwalk/core/internal/XWalkNavigationItemInternal;
    goto :goto_0

    .line 83
    :cond_1
    instance-of v1, v0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    if-eqz v1, :cond_2

    check-cast v0, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    goto :goto_1

    :cond_2
    new-instance v1, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;

    invoke-direct {v1, v0}, Lorg/xwalk/core/internal/XWalkNavigationItemBridge;-><init>(Lorg/xwalk/core/internal/XWalkNavigationItemInternal;)V

    move-object v0, v1

    goto :goto_1
.end method

.method public getWrapper()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    return-object v0
.end method

.method public hasItemAt(I)Z
    .locals 5
    .param p1, "index"    # I

    .prologue
    .line 53
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->hasItemAtintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public hasItemAtSuper(I)Z
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 59
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v1, :cond_0

    .line 60
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->hasItemAt(I)Z

    move-result v0

    .line 65
    .local v0, "ret":Z
    :goto_0
    return v0

    .line 62
    .end local v0    # "ret":Z
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v1, p1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->hasItemAt(I)Z

    move-result v0

    .restart local v0    # "ret":Z
    goto :goto_0
.end method

.method public navigate(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;I)V
    .locals 5
    .param p1, "direction"    # Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;
    .param p2, "steps"    # I

    .prologue
    .line 143
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->navigateDirectionInternalintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->ConvertDirectionInternal(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    return-void
.end method

.method public navigateSuper(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;I)V
    .locals 1
    .param p1, "direction"    # Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;
    .param p2, "steps"    # I

    .prologue
    .line 148
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v0, :cond_0

    .line 149
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->navigate(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;I)V

    .line 153
    :goto_0
    return-void

    .line 151
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v0, p1, p2}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->navigate(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal;I)V

    goto :goto_0
.end method

.method public size()I
    .locals 3

    .prologue
    .line 35
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->sizeMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public sizeSuper()I
    .locals 2

    .prologue
    .line 41
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    if-nez v1, :cond_0

    .line 42
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->size()I

    move-result v0

    .line 47
    .local v0, "ret":I
    :goto_0
    return v0

    .line 44
    .end local v0    # "ret":I
    :cond_0
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;->internal:Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->size()I

    move-result v0

    .restart local v0    # "ret":I
    goto :goto_0
.end method
