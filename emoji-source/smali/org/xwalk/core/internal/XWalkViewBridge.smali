.class public Lorg/xwalk/core/internal/XWalkViewBridge;
.super Lorg/xwalk/core/internal/XWalkViewInternal;
.source "XWalkViewBridge.java"


# static fields
.field private static final WRAPPER_CLASS:Ljava/lang/String; = "org.xwalk.core.Object"


# instance fields
.field private addJavascriptInterfaceObjectStringMethod:Ljava/lang/reflect/Method;

.field private clearCachebooleanMethod:Ljava/lang/reflect/Method;

.field private evaluateJavascriptStringValueCallbackMethod:Ljava/lang/reflect/Method;

.field private getAPIVersionMethod:Ljava/lang/reflect/Method;

.field private getNavigationHistoryMethod:Ljava/lang/reflect/Method;

.field private getOriginalUrlMethod:Ljava/lang/reflect/Method;

.field private getRemoteDebuggingUrlMethod:Ljava/lang/reflect/Method;

.field private getTitleMethod:Ljava/lang/reflect/Method;

.field private getUrlMethod:Ljava/lang/reflect/Method;

.field private getXWalkVersionMethod:Ljava/lang/reflect/Method;

.field private hasEnteredFullscreenMethod:Ljava/lang/reflect/Method;

.field private leaveFullscreenMethod:Ljava/lang/reflect/Method;

.field private loadAppFromManifestStringStringMethod:Ljava/lang/reflect/Method;

.field private loadStringStringMethod:Ljava/lang/reflect/Method;

.field private onActivityResultintintIntentMethod:Ljava/lang/reflect/Method;

.field private onDestroyMethod:Ljava/lang/reflect/Method;

.field private onHideMethod:Ljava/lang/reflect/Method;

.field private onNewIntentIntentMethod:Ljava/lang/reflect/Method;

.field private onShowMethod:Ljava/lang/reflect/Method;

.field private pauseTimersMethod:Ljava/lang/reflect/Method;

.field private reloadintMethod:Ljava/lang/reflect/Method;

.field private restoreStateBundleMethod:Ljava/lang/reflect/Method;

.field private resumeTimersMethod:Ljava/lang/reflect/Method;

.field private saveStateBundleMethod:Ljava/lang/reflect/Method;

.field private setNetworkAvailablebooleanMethod:Ljava/lang/reflect/Method;

.field private setResourceClientXWalkResourceClientInternalMethod:Ljava/lang/reflect/Method;

.field private setUIClientXWalkUIClientInternalMethod:Ljava/lang/reflect/Method;

.field private stopLoadingMethod:Ljava/lang/reflect/Method;

.field private wrapper:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "activity"    # Landroid/app/Activity;
    .param p3, "wrapper"    # Ljava/lang/Object;

    .prologue
    .line 55
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    .line 56
    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    .line 58
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkViewBridge;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :goto_0
    return-void

    .line 59
    :catch_0
    move-exception v0

    .line 60
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/Object;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "wrapper"    # Ljava/lang/Object;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    .line 48
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkViewBridge;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    :goto_0
    return-void

    .line 49
    :catch_0
    move-exception v0

    .line 50
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

    .line 425
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 426
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v1, "load"

    new-array v2, v6, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->loadStringStringMethod:Ljava/lang/reflect/Method;

    .line 427
    const-string v1, "loadAppFromManifest"

    new-array v2, v6, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->loadAppFromManifestStringStringMethod:Ljava/lang/reflect/Method;

    .line 428
    const-string v1, "reload"

    new-array v2, v5, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->reloadintMethod:Ljava/lang/reflect/Method;

    .line 429
    const-string v1, "stopLoading"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->stopLoadingMethod:Ljava/lang/reflect/Method;

    .line 430
    const-string v1, "getUrl"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getUrlMethod:Ljava/lang/reflect/Method;

    .line 431
    const-string v1, "getTitle"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getTitleMethod:Ljava/lang/reflect/Method;

    .line 432
    const-string v1, "getOriginalUrl"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getOriginalUrlMethod:Ljava/lang/reflect/Method;

    .line 433
    const-string v1, "getNavigationHistory"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getNavigationHistoryMethod:Ljava/lang/reflect/Method;

    .line 434
    const-string v1, "addJavascriptInterface"

    new-array v2, v6, [Ljava/lang/Object;

    const-class v3, Ljava/lang/Object;

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->addJavascriptInterfaceObjectStringMethod:Ljava/lang/reflect/Method;

    .line 435
    const-string v1, "evaluateJavascript"

    new-array v2, v6, [Ljava/lang/Object;

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v4

    const-class v3, Landroid/webkit/ValueCallback;

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->evaluateJavascriptStringValueCallbackMethod:Ljava/lang/reflect/Method;

    .line 436
    const-string v1, "clearCache"

    new-array v2, v5, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->clearCachebooleanMethod:Ljava/lang/reflect/Method;

    .line 437
    const-string v1, "hasEnteredFullscreen"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->hasEnteredFullscreenMethod:Ljava/lang/reflect/Method;

    .line 438
    const-string v1, "leaveFullscreen"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->leaveFullscreenMethod:Ljava/lang/reflect/Method;

    .line 439
    const-string v1, "pauseTimers"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->pauseTimersMethod:Ljava/lang/reflect/Method;

    .line 440
    const-string v1, "resumeTimers"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->resumeTimersMethod:Ljava/lang/reflect/Method;

    .line 441
    const-string v1, "onHide"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onHideMethod:Ljava/lang/reflect/Method;

    .line 442
    const-string v1, "onShow"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onShowMethod:Ljava/lang/reflect/Method;

    .line 443
    const-string v1, "onDestroy"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onDestroyMethod:Ljava/lang/reflect/Method;

    .line 444
    const-string v1, "onActivityResult"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    const-class v3, Landroid/content/Intent;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onActivityResultintintIntentMethod:Ljava/lang/reflect/Method;

    .line 445
    const-string v1, "onNewIntent"

    new-array v2, v5, [Ljava/lang/Object;

    const-class v3, Landroid/content/Intent;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onNewIntentIntentMethod:Ljava/lang/reflect/Method;

    .line 446
    const-string v1, "saveState"

    new-array v2, v5, [Ljava/lang/Object;

    const-class v3, Landroid/os/Bundle;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->saveStateBundleMethod:Ljava/lang/reflect/Method;

    .line 447
    const-string v1, "restoreState"

    new-array v2, v5, [Ljava/lang/Object;

    const-class v3, Landroid/os/Bundle;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->restoreStateBundleMethod:Ljava/lang/reflect/Method;

    .line 448
    const-string v1, "getAPIVersion"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getAPIVersionMethod:Ljava/lang/reflect/Method;

    .line 449
    const-string v1, "getXWalkVersion"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getXWalkVersionMethod:Ljava/lang/reflect/Method;

    .line 450
    const-string v1, "setUIClient"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkUIClient"

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->setUIClientXWalkUIClientInternalMethod:Ljava/lang/reflect/Method;

    .line 451
    const-string v1, "setResourceClient"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkResourceClient"

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->setResourceClientXWalkResourceClientInternalMethod:Ljava/lang/reflect/Method;

    .line 452
    const-string v1, "setNetworkAvailable"

    new-array v2, v5, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->setNetworkAvailablebooleanMethod:Ljava/lang/reflect/Method;

    .line 453
    const-string v1, "getRemoteDebuggingUrl"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getRemoteDebuggingUrlMethod:Ljava/lang/reflect/Method;

    .line 455
    return-void
.end method


# virtual methods
.method public addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4
    .param p1, "object"    # Ljava/lang/Object;
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 167
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->addJavascriptInterfaceObjectStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    return-void
.end method

.method public addJavascriptInterfaceSuper(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .param p1, "object"    # Ljava/lang/Object;
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 172
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    return-void
.end method

.method public clearCache(Z)V
    .locals 5
    .param p1, "includeDiskFiles"    # Z

    .prologue
    .line 189
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->clearCachebooleanMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    return-void
.end method

.method public clearCacheSuper(Z)V
    .locals 0
    .param p1, "includeDiskFiles"    # Z

    .prologue
    .line 194
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->clearCache(Z)V

    .line 195
    return-void
.end method

.method public evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 4
    .param p1, "script"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 178
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/String;>;"
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->evaluateJavascriptStringValueCallbackMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    return-void
.end method

.method public evaluateJavascriptSuper(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 0
    .param p1, "script"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 183
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/String;>;"
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 184
    return-void
.end method

.method public getAPIVersion()Ljava/lang/String;
    .locals 3

    .prologue
    .line 333
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getAPIVersionMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAPIVersionSuper()Ljava/lang/String;
    .locals 1

    .prologue
    .line 339
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getAPIVersion()Ljava/lang/String;

    move-result-object v0

    .line 340
    .local v0, "ret":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 341
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public getNavigationHistory()Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;
    .locals 3

    .prologue
    .line 153
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getNavigationHistoryMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;

    return-object v0
.end method

.method public getNavigationHistorySuper()Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;
    .locals 2

    .prologue
    .line 159
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getNavigationHistory()Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    move-result-object v0

    .line 160
    .local v0, "ret":Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 161
    .end local v0    # "ret":Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;
    :goto_0
    return-object v0

    .restart local v0    # "ret":Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;
    :cond_0
    instance-of v1, v0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;

    if-eqz v1, :cond_1

    check-cast v0, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;

    goto :goto_0

    :cond_1
    new-instance v1, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;

    invoke-direct {v1, v0}, Lorg/xwalk/core/internal/XWalkNavigationHistoryBridge;-><init>(Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public getOriginalUrl()Ljava/lang/String;
    .locals 3

    .prologue
    .line 139
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getOriginalUrlMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalUrlSuper()Ljava/lang/String;
    .locals 1

    .prologue
    .line 145
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getOriginalUrl()Ljava/lang/String;

    move-result-object v0

    .line 146
    .local v0, "ret":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 147
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public getRemoteDebuggingUrl()Landroid/net/Uri;
    .locals 3

    .prologue
    .line 410
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getRemoteDebuggingUrlMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    return-object v0
.end method

.method public getRemoteDebuggingUrlSuper()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 416
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getRemoteDebuggingUrl()Landroid/net/Uri;

    move-result-object v0

    .line 417
    .local v0, "ret":Landroid/net/Uri;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 418
    .end local v0    # "ret":Landroid/net/Uri;
    :cond_0
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 3

    .prologue
    .line 125
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getTitleMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTitleSuper()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 132
    .local v0, "ret":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 133
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 3

    .prologue
    .line 111
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getUrlMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getUrlSuper()Ljava/lang/String;
    .locals 1

    .prologue
    .line 117
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 118
    .local v0, "ret":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 119
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public getWrapper()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    return-object v0
.end method

.method public getXWalkVersion()Ljava/lang/String;
    .locals 3

    .prologue
    .line 347
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->getXWalkVersionMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getXWalkVersionSuper()Ljava/lang/String;
    .locals 1

    .prologue
    .line 353
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getXWalkVersion()Ljava/lang/String;

    move-result-object v0

    .line 354
    .local v0, "ret":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 355
    .end local v0    # "ret":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public hasEnteredFullscreen()Z
    .locals 3

    .prologue
    .line 200
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->hasEnteredFullscreenMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public hasEnteredFullscreenSuper()Z
    .locals 1

    .prologue
    .line 206
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->hasEnteredFullscreen()Z

    move-result v0

    .line 208
    .local v0, "ret":Z
    return v0
.end method

.method public leaveFullscreen()V
    .locals 3

    .prologue
    .line 214
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->leaveFullscreenMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    return-void
.end method

.method public leaveFullscreenSuper()V
    .locals 0

    .prologue
    .line 219
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->leaveFullscreen()V

    .line 220
    return-void
.end method

.method public load(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "content"    # Ljava/lang/String;

    .prologue
    .line 67
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->loadStringStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    return-void
.end method

.method public loadAppFromManifest(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "content"    # Ljava/lang/String;

    .prologue
    .line 78
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->loadAppFromManifestStringStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    return-void
.end method

.method public loadAppFromManifestSuper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "content"    # Ljava/lang/String;

    .prologue
    .line 83
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;->loadAppFromManifest(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    return-void
.end method

.method public loadSuper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "content"    # Ljava/lang/String;

    .prologue
    .line 72
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;->load(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 280
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onActivityResultintintIntentMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    return-void
.end method

.method public onActivityResultSuper(IILandroid/content/Intent;)V
    .locals 0
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 285
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkViewInternal;->onActivityResult(IILandroid/content/Intent;)V

    .line 286
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 269
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onDestroyMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    return-void
.end method

.method public onDestroySuper()V
    .locals 0

    .prologue
    .line 274
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->onDestroy()V

    .line 275
    return-void
.end method

.method public onHide()V
    .locals 3

    .prologue
    .line 247
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onHideMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    return-void
.end method

.method public onHideSuper()V
    .locals 0

    .prologue
    .line 252
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->onHide()V

    .line 253
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)Z
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 291
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onNewIntentIntentMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public onNewIntentSuper(Landroid/content/Intent;)Z
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 297
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->onNewIntent(Landroid/content/Intent;)Z

    move-result v0

    .line 299
    .local v0, "ret":Z
    return v0
.end method

.method public onShow()V
    .locals 3

    .prologue
    .line 258
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->onShowMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    return-void
.end method

.method public onShowSuper()V
    .locals 0

    .prologue
    .line 263
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->onShow()V

    .line 264
    return-void
.end method

.method public pauseTimers()V
    .locals 3

    .prologue
    .line 225
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->pauseTimersMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    return-void
.end method

.method public pauseTimersSuper()V
    .locals 0

    .prologue
    .line 230
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->pauseTimers()V

    .line 231
    return-void
.end method

.method public reload(I)V
    .locals 5
    .param p1, "mode"    # I

    .prologue
    .line 89
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->reloadintMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    return-void
.end method

.method public reloadSuper(I)V
    .locals 0
    .param p1, "mode"    # I

    .prologue
    .line 94
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->reload(I)V

    .line 95
    return-void
.end method

.method public restoreState(Landroid/os/Bundle;)Z
    .locals 4
    .param p1, "inState"    # Landroid/os/Bundle;

    .prologue
    .line 319
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->restoreStateBundleMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public restoreStateSuper(Landroid/os/Bundle;)Z
    .locals 1
    .param p1, "inState"    # Landroid/os/Bundle;

    .prologue
    .line 325
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->restoreState(Landroid/os/Bundle;)Z

    move-result v0

    .line 327
    .local v0, "ret":Z
    return v0
.end method

.method public resumeTimers()V
    .locals 3

    .prologue
    .line 236
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->resumeTimersMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    return-void
.end method

.method public resumeTimersSuper()V
    .locals 0

    .prologue
    .line 241
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->resumeTimers()V

    .line 242
    return-void
.end method

.method public saveState(Landroid/os/Bundle;)Z
    .locals 4
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 305
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->saveStateBundleMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public saveStateSuper(Landroid/os/Bundle;)Z
    .locals 1
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 311
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->saveState(Landroid/os/Bundle;)Z

    move-result v0

    .line 313
    .local v0, "ret":Z
    return v0
.end method

.method public setNetworkAvailable(Z)V
    .locals 5
    .param p1, "networkUp"    # Z

    .prologue
    .line 399
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->setNetworkAvailablebooleanMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    return-void
.end method

.method public setNetworkAvailableSuper(Z)V
    .locals 0
    .param p1, "networkUp"    # Z

    .prologue
    .line 404
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->setNetworkAvailable(Z)V

    .line 405
    return-void
.end method

.method public setResourceClient(Lorg/xwalk/core/internal/XWalkResourceClientBridge;)V
    .locals 5
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkResourceClientBridge;

    .prologue
    .line 388
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->setResourceClientXWalkResourceClientInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkResourceClientBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    return-void
.end method

.method public setResourceClient(Lorg/xwalk/core/internal/XWalkResourceClientInternal;)V
    .locals 1
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkResourceClientInternal;

    .prologue
    .line 380
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkResourceClientBridge;

    if-eqz v0, :cond_0

    .line 381
    check-cast p1, Lorg/xwalk/core/internal/XWalkResourceClientBridge;

    .end local p1    # "client":Lorg/xwalk/core/internal/XWalkResourceClientInternal;
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->setResourceClient(Lorg/xwalk/core/internal/XWalkResourceClientBridge;)V

    .line 385
    :goto_0
    return-void

    .line 383
    .restart local p1    # "client":Lorg/xwalk/core/internal/XWalkResourceClientInternal;
    :cond_0
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->setResourceClient(Lorg/xwalk/core/internal/XWalkResourceClientInternal;)V

    goto :goto_0
.end method

.method public setResourceClientSuper(Lorg/xwalk/core/internal/XWalkResourceClientBridge;)V
    .locals 0
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkResourceClientBridge;

    .prologue
    .line 393
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->setResourceClient(Lorg/xwalk/core/internal/XWalkResourceClientInternal;)V

    .line 394
    return-void
.end method

.method public setUIClient(Lorg/xwalk/core/internal/XWalkUIClientBridge;)V
    .locals 5
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkUIClientBridge;

    .prologue
    .line 369
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->setUIClientXWalkUIClientInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    return-void
.end method

.method public setUIClient(Lorg/xwalk/core/internal/XWalkUIClientInternal;)V
    .locals 1
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkUIClientInternal;

    .prologue
    .line 361
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkUIClientBridge;

    if-eqz v0, :cond_0

    .line 362
    check-cast p1, Lorg/xwalk/core/internal/XWalkUIClientBridge;

    .end local p1    # "client":Lorg/xwalk/core/internal/XWalkUIClientInternal;
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->setUIClient(Lorg/xwalk/core/internal/XWalkUIClientBridge;)V

    .line 366
    :goto_0
    return-void

    .line 364
    .restart local p1    # "client":Lorg/xwalk/core/internal/XWalkUIClientInternal;
    :cond_0
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->setUIClient(Lorg/xwalk/core/internal/XWalkUIClientInternal;)V

    goto :goto_0
.end method

.method public setUIClientSuper(Lorg/xwalk/core/internal/XWalkUIClientBridge;)V
    .locals 0
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkUIClientBridge;

    .prologue
    .line 374
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->setUIClient(Lorg/xwalk/core/internal/XWalkUIClientInternal;)V

    .line 375
    return-void
.end method

.method public stopLoading()V
    .locals 3

    .prologue
    .line 100
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->stopLoadingMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    return-void
.end method

.method public stopLoadingSuper()V
    .locals 0

    .prologue
    .line 105
    invoke-super {p0}, Lorg/xwalk/core/internal/XWalkViewInternal;->stopLoading()V

    .line 106
    return-void
.end method
