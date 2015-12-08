.class public Lorg/xwalk/core/XWalkUIClient;
.super Ljava/lang/Object;
.source "XWalkUIClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/XWalkUIClient$LoadStatus;,
        Lorg/xwalk/core/XWalkUIClient$InitiateBy;,
        Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;
    }
.end annotation


# static fields
.field private static final BRIDGE_CLASS:Ljava/lang/String; = "org.xwalk.core.internal.XWalkUIClientBridge"


# instance fields
.field private bridge:Ljava/lang/Object;

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


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 364
    const-string v0, "XWalkUIClientInternalXWalkViewInternalConstructor"

    const-string v1, "org.xwalk.core.internal.XWalkUIClientBridge"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->registerConstructor(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    return-void
.end method

.method public constructor <init>(Lorg/xwalk/core/XWalkView;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    const-string v1, "XWalkUIClientInternalXWalkViewInternalConstructor"

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

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    .line 107
    :try_start_0
    invoke-direct {p0}, Lorg/xwalk/core/XWalkUIClient;->reflectionInit()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    :goto_0
    return-void

    .line 108
    :catch_0
    move-exception v0

    .line 109
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v0}, Lorg/xwalk/core/ReflectionHelper;->handleException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private ConvertInitiateBy(Lorg/xwalk/core/XWalkUIClient$InitiateBy;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    .prologue
    .line 65
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->enumInitiateByClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkUIClient$InitiateBy;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private ConvertJavascriptMessageType(Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->enumJavascriptMessageTypeClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private ConvertLoadStatus(Lorg/xwalk/core/XWalkUIClient$LoadStatus;)Ljava/lang/Object;
    .locals 5
    .param p1, "type"    # Lorg/xwalk/core/XWalkUIClient$LoadStatus;

    .prologue
    .line 85
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->enumLoadStatusClassValueOfMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkUIClient$LoadStatus;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 338
    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 339
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.internal.XWalkUIClientInternal$JavascriptMessageTypeInternal"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumJavascriptMessageTypeClass:Ljava/lang/Class;

    .line 340
    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumJavascriptMessageTypeClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumJavascriptMessageTypeClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 341
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.internal.XWalkUIClientInternal$InitiateByInternal"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumInitiateByClass:Ljava/lang/Class;

    .line 342
    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumInitiateByClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumInitiateByClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 343
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "org.xwalk.core.internal.XWalkUIClientInternal$LoadStatusInternal"

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumLoadStatusClass:Ljava/lang/Class;

    .line 344
    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumLoadStatusClass:Ljava/lang/Class;

    const-string v2, "valueOf"

    new-array v3, v6, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->enumLoadStatusClassValueOfMethod:Ljava/lang/reflect/Method;

    .line 345
    const-string v1, "onCreateWindowRequestedSuper"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    iget-object v3, p0, Lorg/xwalk/core/XWalkUIClient;->enumInitiateByClass:Ljava/lang/Class;

    aput-object v3, v2, v6

    const-class v3, Landroid/webkit/ValueCallback;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod:Ljava/lang/reflect/Method;

    .line 346
    const-string v1, "onIconAvailableSuper"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    const-class v3, Landroid/os/Message;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onIconAvailableXWalkViewInternalStringMessageMethod:Ljava/lang/reflect/Method;

    .line 347
    const-string v1, "onReceivedIconSuper"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    const-class v3, Landroid/graphics/Bitmap;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onReceivedIconXWalkViewInternalStringBitmapMethod:Ljava/lang/reflect/Method;

    .line 348
    const-string v1, "onRequestFocusSuper"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onRequestFocusXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    .line 349
    const-string v1, "onJavascriptCloseWindowSuper"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onJavascriptCloseWindowXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    .line 350
    const-string v1, "onJavascriptModalDialogSuper"

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    iget-object v3, p0, Lorg/xwalk/core/XWalkUIClient;->enumJavascriptMessageTypeClass:Ljava/lang/Class;

    aput-object v3, v2, v6

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v7

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v8

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v9

    const/4 v3, 0x5

    const-string v4, "org.xwalk.core.internal.XWalkJavascriptResultHandlerBridge"

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod:Ljava/lang/reflect/Method;

    .line 351
    const-string v1, "onFullscreenToggledSuper"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onFullscreenToggledXWalkViewInternalbooleanMethod:Ljava/lang/reflect/Method;

    .line 352
    const-string v1, "openFileChooserSuper"

    new-array v2, v9, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Landroid/webkit/ValueCallback;

    aput-object v3, v2, v6

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v7

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v8

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->openFileChooserXWalkViewInternalValueCallbackStringStringMethod:Ljava/lang/reflect/Method;

    .line 353
    const-string v1, "onScaleChangedSuper"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v6

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onScaleChangedXWalkViewInternalfloatfloatMethod:Ljava/lang/reflect/Method;

    .line 354
    const-string v1, "shouldOverrideKeyEventSuper"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Landroid/view/KeyEvent;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->shouldOverrideKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    .line 355
    const-string v1, "onUnhandledKeyEventSuper"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Landroid/view/KeyEvent;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onUnhandledKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    .line 356
    const-string v1, "onReceivedTitleSuper"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onReceivedTitleXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 357
    const-string v1, "onPageLoadStartedSuper"

    new-array v2, v7, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onPageLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    .line 358
    const-string v1, "onPageLoadStoppedSuper"

    new-array v2, v8, [Ljava/lang/Object;

    const-string v3, "org.xwalk.core.internal.XWalkViewBridge"

    aput-object v3, v2, v5

    const-class v3, Ljava/lang/String;

    aput-object v3, v2, v6

    iget-object v3, p0, Lorg/xwalk/core/XWalkUIClient;->enumLoadStatusClass:Ljava/lang/Class;

    aput-object v3, v2, v7

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->loadMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod:Ljava/lang/reflect/Method;

    .line 360
    return-void
.end method


# virtual methods
.method getBridge()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    return-object v0
.end method

.method public onCreateWindowRequested(Lorg/xwalk/core/XWalkView;Lorg/xwalk/core/XWalkUIClient$InitiateBy;Landroid/webkit/ValueCallback;)Z
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "initiator"    # Lorg/xwalk/core/XWalkUIClient$InitiateBy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/XWalkView;",
            "Lorg/xwalk/core/XWalkUIClient$InitiateBy;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Lorg/xwalk/core/XWalkView;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 126
    .local p3, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Lorg/xwalk/core/XWalkView;>;"
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onCreateWindowRequestedXWalkViewInternalInitiateByInternalValueCallbackMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-direct {p0, p2}, Lorg/xwalk/core/XWalkUIClient;->ConvertInitiateBy(Lorg/xwalk/core/XWalkUIClient$InitiateBy;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public onFullscreenToggled(Lorg/xwalk/core/XWalkView;Z)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "enterFullscreen"    # Z

    .prologue
    .line 208
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onFullscreenToggledXWalkViewInternalbooleanMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    return-void
.end method

.method public onIconAvailable(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Landroid/os/Message;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "startDownload"    # Landroid/os/Message;

    .prologue
    .line 140
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onIconAvailableXWalkViewInternalStringMessageMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

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

    .line 141
    return-void
.end method

.method public onJavascriptCloseWindow(Lorg/xwalk/core/XWalkView;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;

    .prologue
    .line 178
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onJavascriptCloseWindowXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    return-void
.end method

.method public onJavascriptModalDialog(Lorg/xwalk/core/XWalkView;Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xwalk/core/XWalkJavascriptResult;)Z
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "type"    # Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;
    .param p3, "url"    # Ljava/lang/String;
    .param p4, "message"    # Ljava/lang/String;
    .param p5, "defaultValue"    # Ljava/lang/String;
    .param p6, "result"    # Lorg/xwalk/core/XWalkJavascriptResult;

    .prologue
    .line 195
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onJavascriptModalDialogXWalkViewInternalJavascriptMessageTypeInternalStringStringStringXWalkJavascriptResultInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-direct {p0, p2}, Lorg/xwalk/core/XWalkUIClient;->ConvertJavascriptMessageType(Lorg/xwalk/core/XWalkUIClient$JavascriptMessageType;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    const/4 v3, 0x3

    aput-object p4, v2, v3

    const/4 v3, 0x4

    aput-object p5, v2, v3

    const/4 v3, 0x5

    check-cast p6, Lorg/xwalk/core/XWalkJavascriptResultHandler;

    .end local p6    # "result":Lorg/xwalk/core/XWalkJavascriptResult;
    invoke-virtual {p6}, Lorg/xwalk/core/XWalkJavascriptResultHandler;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public onPageLoadStarted(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 313
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onPageLoadStartedXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    return-void
.end method

.method public onPageLoadStopped(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Lorg/xwalk/core/XWalkUIClient$LoadStatus;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "status"    # Lorg/xwalk/core/XWalkUIClient$LoadStatus;

    .prologue
    .line 331
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onPageLoadStoppedXWalkViewInternalStringLoadStatusInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    invoke-direct {p0, p3}, Lorg/xwalk/core/XWalkUIClient;->ConvertLoadStatus(Lorg/xwalk/core/XWalkUIClient$LoadStatus;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    return-void
.end method

.method public onReceivedIcon(Lorg/xwalk/core/XWalkView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "icon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 154
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onReceivedIconXWalkViewInternalStringBitmapMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

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

    .line 155
    return-void
.end method

.method public onReceivedTitle(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    .line 294
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onReceivedTitleXWalkViewInternalStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    return-void
.end method

.method public onRequestFocus(Lorg/xwalk/core/XWalkView;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;

    .prologue
    .line 166
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onRequestFocusXWalkViewInternalMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    return-void
.end method

.method public onScaleChanged(Lorg/xwalk/core/XWalkView;FF)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "oldScale"    # F
    .param p3, "newScale"    # F

    .prologue
    .line 241
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onScaleChangedXWalkViewInternalfloatfloatMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

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

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    return-void
.end method

.method public onUnhandledKeyEvent(Lorg/xwalk/core/XWalkView;Landroid/view/KeyEvent;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 281
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->onUnhandledKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    return-void
.end method

.method public openFileChooser(Lorg/xwalk/core/XWalkView;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p3, "acceptType"    # Ljava/lang/String;
    .param p4, "capture"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/XWalkView;",
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
    .line 227
    .local p2, "uploadFile":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Landroid/net/Uri;>;"
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->openFileChooserXWalkViewInternalValueCallbackStringStringMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lorg/xwalk/core/XWalkView;->getBridge()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    const/4 v3, 0x3

    aput-object p4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/xwalk/core/ReflectionHelper;->invokeMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    return-void
.end method

.method public shouldOverrideKeyEvent(Lorg/xwalk/core/XWalkView;Landroid/view/KeyEvent;)Z
    .locals 5
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 262
    iget-object v0, p0, Lorg/xwalk/core/XWalkUIClient;->shouldOverrideKeyEventXWalkViewInternalKeyEventMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/xwalk/core/XWalkUIClient;->bridge:Ljava/lang/Object;

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
