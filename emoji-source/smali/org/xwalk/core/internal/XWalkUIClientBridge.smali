.class public Lorg/xwalk/core/internal/XWalkUIClientBridge;
.super Lorg/xwalk/core/internal/XWalkUIClientInternal;
.source "XWalkUIClientBridge.java"


# static fields
.field private static final WRAPPER_CLASS:Ljava/lang/String; = "org.xwalk.core.Object"


# instance fields
.field private enumInitiateByClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private enumInitiateByClassValueOfMethod:Ljava/lang/reflect/Method;

.field private enumJavascriptMessageTypeClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private enumJavascriptMessageTypeClassValueOfMethod:Ljava/lang/reflect/Method;

.field private enumLoadStatusClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private enumLoadStatusClassValueOfMethod:Ljava/lang/reflect/Method;

.field private onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod:Ljava/lang/reflect/Method;

.field private onFullscreenToggledXWalkViewInternalbooleanMethod:Ljava/lang/reflect/Method;

.field private onIconAvailableXWalkViewInternalStringMessageMethod:Ljava/lang/reflect/Method;

.field private onJavascriptCloseWindowXWalkViewInternalMethod:Ljava/lang/reflect/Method;

.field private onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod:Ljava/lang/reflect/Method;

.field private onPageLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod:Ljava/lang/reflect/Method;

.field private onReceivedIconXWalkViewInternalStringBitmapMethod:Ljava/lang/reflect/Method;

.field private onReceivedTitleXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

.field private onRequestFocusXWalkViewInternalMethod:Ljava/lang/reflect/Method;

.field private onScaleChangedXWalkViewInternalfloatfloatMethod:Ljava/lang/reflect/Method;

.field private onUnhandledKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

.field private openFileChooserXWalkViewInternalValueCallbackStringStringMethod:Ljava/lang/reflect/Method;

.field private shouldOverrideKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

.field private wrapper:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/Object;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "wrapper"    # Ljava/lang/Object;

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;-><init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 47
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    .line 49
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :goto_0
    return-void

    .line 50
    :catch_0
    move-exception v0

    .line 51
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/internal/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private ConvertInitiateByInternal(Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    .prologue
    .line 37
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumInitiateByClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private ConvertJavascriptMessageTypeInternal(Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    .prologue
    .line 32
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumJavascriptMessageTypeClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private ConvertLoadStatusInternal(Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .prologue
    .line 42
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumLoadStatusClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private reflectionInit()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 340
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 341
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.XWalkUIClient$JavascriptMessageType"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumJavascriptMessageTypeClass:Ljava/lang/Class;

    .line 342
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumJavascriptMessageTypeClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumJavascriptMessageTypeClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 343
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.XWalkUIClient$InitiateBy"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumInitiateByClass:Ljava/lang/Class;

    .line 344
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumInitiateByClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumInitiateByClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 345
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.XWalkUIClient$LoadStatus"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumLoadStatusClass:Ljava/lang/Class;

    .line 346
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumLoadStatusClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumLoadStatusClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 347
    const-string v1, "onCreateWindowRequested"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumInitiateByClass:Ljava/lang/Class;

    aput-object v3, v2, v6

    const-class v3, Landroid/webkit/ValueCallback;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod:Ljava/lang/reflect/Method;

    .line 348
    const-string v1, "onIconAvailable"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    const-class v3, Landroid/os/Message;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onIconAvailableXWalkViewInternalStringMessageMethod:Ljava/lang/reflect/Method;

    .line 349
    const-string v1, "onReceivedIcon"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    const-class v3, Landroid/graphics/Bitmap;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onReceivedIconXWalkViewInternalStringBitmapMethod:Ljava/lang/reflect/Method;

    .line 350
    const-string v1, "onRequestFocus"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onRequestFocusXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    .line 351
    const-string v1, "onJavascriptCloseWindow"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onJavascriptCloseWindowXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    .line 352
    const-string v1, "onJavascriptModalDialog"

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumJavascriptMessageTypeClass:Ljava/lang/Class;

    aput-object v3, v2, v6

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v7

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v8

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v9

    const/4 v3, 0x5

    const-string v4, "org.xwalk.core.XWalkJavascriptResult"

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod:Ljava/lang/reflect/Method;

    .line 353
    const-string v1, "onFullscreenToggled"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onFullscreenToggledXWalkViewInternalbooleanMethod:Ljava/lang/reflect/Method;

    .line 354
    const-string v1, "openFileChooser"

    new-array v2, v9, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Landroid/webkit/ValueCallback;

    aput-object v3, v2, v6

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v7

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v8

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->openFileChooserXWalkViewInternalValueCallbackStringStringMethod:Ljava/lang/reflect/Method;

    .line 355
    const-string v1, "onScaleChanged"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v6

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onScaleChangedXWalkViewInternalfloatfloatMethod:Ljava/lang/reflect/Method;

    .line 356
    const-string v1, "shouldOverrideKeyEvent"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Landroid/view/KeyEvent;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->shouldOverrideKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    .line 357
    const-string v1, "onUnhandledKeyEvent"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Landroid/view/KeyEvent;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onUnhandledKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    .line 358
    const-string v1, "onReceivedTitle"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onReceivedTitleXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 359
    const-string v1, "onPageLoadStarted"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onPageLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 360
    const-string v1, "onPageLoadStopped"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.XWalkView"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->enumLoadStatusClass:Ljava/lang/Class;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod:Ljava/lang/reflect/Method;

    .line 362
    return-void
.end method


# virtual methods
.method public getWrapper()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    return-object v0
.end method

.method public onCreateWindowRequested(Lorg/xwalk/core/internal/XWalkViewBridge;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z
    .locals 6
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "initiator"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewBridge;",
            "Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 66
    .local p3, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Lorg/xwalk/core/internal/XWalkViewInternal;>;"
    move-object v0, p3

    .line 67
    .local v0, "callbackFinal":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Lorg/xwalk/core/internal/XWalkViewInternal;>;"
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-direct {p0, p2}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->ConvertInitiateByInternal(Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    new-instance v5, Lorg/xwalk/core/internal/XWalkUIClientBridge$1;

    invoke-direct {v5, p0, v0}, Lorg/xwalk/core/internal/XWalkUIClientBridge$1;-><init>(Lorg/xwalk/core/internal/XWalkUIClientBridge;Landroid/webkit/ValueCallback;)V

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1
.end method

.method public onCreateWindowRequested(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "initiator"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            "Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 58
    .local p3, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Lorg/xwalk/core/internal/XWalkViewInternal;>;"
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 59
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onCreateWindowRequested(Lorg/xwalk/core/internal/XWalkViewBridge;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z

    move-result v0

    .line 61
    :goto_0
    return v0

    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onCreateWindowRequested(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z

    move-result v0

    goto :goto_0
.end method

.method public onCreateWindowRequestedSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "initiator"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewBridge;",
            "Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 78
    .local p3, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Lorg/xwalk/core/internal/XWalkViewInternal;>;"
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onCreateWindowRequested(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z

    move-result v0

    .line 80
    .local v0, "ret":Z
    return v0
.end method

.method public onFullscreenToggled(Lorg/xwalk/core/internal/XWalkViewBridge;Z)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "enterFullscreen"    # Z

    .prologue
    .line 192
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onFullscreenToggledXWalkViewInternalbooleanMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    return-void
.end method

.method public onFullscreenToggled(Lorg/xwalk/core/internal/XWalkViewInternal;Z)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "enterFullscreen"    # Z

    .prologue
    .line 184
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 185
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onFullscreenToggled(Lorg/xwalk/core/internal/XWalkViewBridge;Z)V

    .line 189
    :goto_0
    return-void

    .line 187
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onFullscreenToggled(Lorg/xwalk/core/internal/XWalkViewInternal;Z)V

    goto :goto_0
.end method

.method public onFullscreenToggledSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Z)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "enterFullscreen"    # Z

    .prologue
    .line 197
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onFullscreenToggled(Lorg/xwalk/core/internal/XWalkViewInternal;Z)V

    .line 198
    return-void
.end method

.method public onIconAvailable(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Landroid/os/Message;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "startDownload"    # Landroid/os/Message;

    .prologue
    .line 94
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onIconAvailableXWalkViewInternalStringMessageMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

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

    .line 96
    return-void
.end method

.method public onIconAvailable(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/os/Message;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "startDownload"    # Landroid/os/Message;

    .prologue
    .line 86
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 87
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onIconAvailable(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Landroid/os/Message;)V

    .line 91
    :goto_0
    return-void

    .line 89
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onIconAvailable(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/os/Message;)V

    goto :goto_0
.end method

.method public onIconAvailableSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Landroid/os/Message;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "startDownload"    # Landroid/os/Message;

    .prologue
    .line 99
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onIconAvailable(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/os/Message;)V

    .line 100
    return-void
.end method

.method public onJavascriptCloseWindow(Lorg/xwalk/core/internal/XWalkViewBridge;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;

    .prologue
    .line 151
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onJavascriptCloseWindowXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    return-void
.end method

.method public onJavascriptCloseWindow(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 143
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 144
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onJavascriptCloseWindow(Lorg/xwalk/core/internal/XWalkViewBridge;)V

    .line 148
    :goto_0
    return-void

    .line 146
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptCloseWindow(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    goto :goto_0
.end method

.method public onJavascriptCloseWindowSuper(Lorg/xwalk/core/internal/XWalkViewBridge;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;

    .prologue
    .line 156
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptCloseWindow(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 157
    return-void
.end method

.method public onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewBridge;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;)Z
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "type"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "message"    # Ljava/lang/String;
    .param p5, "defaultValue"    # Ljava/lang/String;
    .param p6, "result"    # Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;

    .prologue
    .line 170
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v0, 0x6

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x1

    invoke-direct {p0, p2}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->ConvertJavascriptMessageTypeInternal(Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x2

    aput-object p3, v3, v0

    const/4 v0, 0x3

    aput-object p4, v3, v0

    const/4 v0, 0x4

    aput-object p5, v3, v0

    const/4 v4, 0x5

    instance-of v0, p6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;

    if-eqz v0, :cond_0

    .end local p6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;
    :goto_0
    invoke-virtual {p6}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .restart local p6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;
    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;

    invoke-direct {v0, p6}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;-><init>(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)V

    move-object p6, v0

    goto :goto_0
.end method

.method public onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z
    .locals 7
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "type"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "message"    # Ljava/lang/String;
    .param p5, "defaultValue"    # Ljava/lang/String;
    .param p6, "result"    # Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;

    .prologue
    .line 162
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_1

    move-object v1, p1

    .line 163
    check-cast v1, Lorg/xwalk/core/internal/XWalkViewBridge;

    instance-of v0, p6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;

    if-eqz v0, :cond_0

    check-cast p6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;

    .end local p6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;
    move-object v6, p6

    :goto_0
    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewBridge;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;)Z

    move-result v0

    .line 165
    :goto_1
    return v0

    .line 163
    .restart local p6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;
    :cond_0
    new-instance v6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;

    check-cast p6, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    .end local p6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;
    invoke-direct {v6, p6}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;-><init>(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)V

    goto :goto_0

    .line 165
    .restart local p6    # "result":Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;
    :cond_1
    invoke-super/range {p0 .. p6}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z

    move-result v0

    goto :goto_1
.end method

.method public onJavascriptModalDialogSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "type"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "message"    # Ljava/lang/String;
    .param p5, "defaultValue"    # Ljava/lang/String;
    .param p6, "result"    # Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerBridge;

    .prologue
    .line 176
    invoke-super/range {p0 .. p6}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onJavascriptModalDialog(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;)Z

    move-result v0

    .line 178
    .local v0, "ret":Z
    return v0
.end method

.method public onPageLoadStarted(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 309
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onPageLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    return-void
.end method

.method public onPageLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 301
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 302
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onPageLoadStarted(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V

    .line 306
    :goto_0
    return-void

    .line 304
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onPageLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPageLoadStartedSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 314
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onPageLoadStarted(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 315
    return-void
.end method

.method public onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "status"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .prologue
    .line 328
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    invoke-direct {p0, p3}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->ConvertLoadStatusInternal(Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    return-void
.end method

.method public onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "status"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .prologue
    .line 320
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 321
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V

    .line 325
    :goto_0
    return-void

    .line 323
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V

    goto :goto_0
.end method

.method public onPageLoadStoppedSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "status"    # Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .prologue
    .line 333
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onPageLoadStopped(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;)V

    .line 334
    return-void
.end method

.method public onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "icon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 113
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onReceivedIconXWalkViewInternalStringBitmapMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

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

    .line 115
    return-void
.end method

.method public onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "icon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 105
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 106
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 110
    :goto_0
    return-void

    .line 108
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public onReceivedIconSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "icon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 118
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 119
    return-void
.end method

.method public onReceivedTitle(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    .line 290
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onReceivedTitleXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    return-void
.end method

.method public onReceivedTitle(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    .line 282
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 283
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onReceivedTitle(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V

    .line 287
    :goto_0
    return-void

    .line 285
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onReceivedTitle(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onReceivedTitleSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    .line 295
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onReceivedTitle(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;)V

    .line 296
    return-void
.end method

.method public onRequestFocus(Lorg/xwalk/core/internal/XWalkViewBridge;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;

    .prologue
    .line 132
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onRequestFocusXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    return-void
.end method

.method public onRequestFocus(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 124
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 125
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onRequestFocus(Lorg/xwalk/core/internal/XWalkViewBridge;)V

    .line 129
    :goto_0
    return-void

    .line 127
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onRequestFocus(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    goto :goto_0
.end method

.method public onRequestFocusSuper(Lorg/xwalk/core/internal/XWalkViewBridge;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;

    .prologue
    .line 137
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onRequestFocus(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 138
    return-void
.end method

.method public onScaleChanged(Lorg/xwalk/core/internal/XWalkViewBridge;FF)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "oldScale"    # F
    .param p3, "newScale"    # F

    .prologue
    .line 230
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onScaleChangedXWalkViewInternalfloatfloatMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    return-void
.end method

.method public onScaleChanged(Lorg/xwalk/core/internal/XWalkViewInternal;FF)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "oldScale"    # F
    .param p3, "newScale"    # F

    .prologue
    .line 222
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 223
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onScaleChanged(Lorg/xwalk/core/internal/XWalkViewBridge;FF)V

    .line 227
    :goto_0
    return-void

    .line 225
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onScaleChanged(Lorg/xwalk/core/internal/XWalkViewInternal;FF)V

    goto :goto_0
.end method

.method public onScaleChangedSuper(Lorg/xwalk/core/internal/XWalkViewBridge;FF)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "oldScale"    # F
    .param p3, "newScale"    # F

    .prologue
    .line 235
    invoke-super {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onScaleChanged(Lorg/xwalk/core/internal/XWalkViewInternal;FF)V

    .line 236
    return-void
.end method

.method public onUnhandledKeyEvent(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/view/KeyEvent;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 271
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onUnhandledKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    return-void
.end method

.method public onUnhandledKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 263
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 264
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->onUnhandledKeyEvent(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/view/KeyEvent;)V

    .line 268
    :goto_0
    return-void

    .line 266
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onUnhandledKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)V

    goto :goto_0
.end method

.method public onUnhandledKeyEventSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/view/KeyEvent;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 276
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->onUnhandledKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)V

    .line 277
    return-void
.end method

.method public openFileChooser(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p3, "acceptType"    # Ljava/lang/String;
    .param p4, "capture"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewBridge;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 211
    .local p2, "uploadFile":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Landroid/net/Uri;>;"
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->openFileChooserXWalkViewInternalValueCallbackStringStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewBridge;->getWrapper()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    const/4 v3, 0x3

    aput-object p4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    return-void
.end method

.method public openFileChooser(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p3, "acceptType"    # Ljava/lang/String;
    .param p4, "capture"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 203
    .local p2, "uploadFile":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Landroid/net/Uri;>;"
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 204
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->openFileChooser(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    :goto_0
    return-void

    .line 206
    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->openFileChooser(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public openFileChooserSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p3, "acceptType"    # Ljava/lang/String;
    .param p4, "capture"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/XWalkViewBridge;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 216
    .local p2, "uploadFile":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Landroid/net/Uri;>;"
    invoke-super {p0, p1, p2, p3, p4}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->openFileChooser(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    return-void
.end method

.method public shouldOverrideKeyEvent(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/view/KeyEvent;)Z
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 249
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->shouldOverrideKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge;->wrapper:Ljava/lang/Object;

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

.method public shouldOverrideKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 241
    instance-of v0, p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    if-eqz v0, :cond_0

    .line 242
    check-cast p1, Lorg/xwalk/core/internal/XWalkViewBridge;

    .end local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-virtual {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientBridge;->shouldOverrideKeyEvent(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/view/KeyEvent;)Z

    move-result v0

    .line 244
    :goto_0
    return v0

    .restart local p1    # "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->shouldOverrideKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public shouldOverrideKeyEventSuper(Lorg/xwalk/core/internal/XWalkViewBridge;Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewBridge;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 255
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkUIClientInternal;->shouldOverrideKeyEvent(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/view/KeyEvent;)Z

    move-result v0

    .line 257
    .local v0, "ret":Z
    return v0
.end method
