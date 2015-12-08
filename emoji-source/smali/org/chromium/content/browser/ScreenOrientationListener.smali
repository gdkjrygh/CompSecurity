.class public Lorg/chromium/content/browser/ScreenOrientationListener;
.super Ljava/lang/Object;
.source "ScreenOrientationListener.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;,
        Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationConfigurationListener;,
        Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;,
        Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;
    }
.end annotation

.annotation build Lorg/chromium/base/VisibleForTesting;
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "ScreenOrientationListener"

.field private static sInstance:Lorg/chromium/content/browser/ScreenOrientationListener;


# instance fields
.field private mAppContext:Landroid/content/Context;

.field private mBackend:Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;

.field private final mObservers:Lorg/chromium/base/ObserverList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/chromium/base/ObserverList",
            "<",
            "Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;",
            ">;"
        }
    .end annotation
.end field

.field private mOrientation:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lorg/chromium/content/browser/ScreenOrientationListener;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ScreenOrientationListener;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    new-instance v0, Lorg/chromium/base/ObserverList;

    invoke-direct {v0}, Lorg/chromium/base/ObserverList;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mObservers:Lorg/chromium/base/ObserverList;

    .line 234
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    new-instance v0, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;

    invoke-direct {v0, p0, v2}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationDisplayListener;-><init>(Lorg/chromium/content/browser/ScreenOrientationListener;Lorg/chromium/content/browser/ScreenOrientationListener$1;)V

    :goto_0
    iput-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mBackend:Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;

    .line 237
    return-void

    .line 234
    :cond_0
    new-instance v0, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationConfigurationListener;

    invoke-direct {v0, p0, v2}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationConfigurationListener;-><init>(Lorg/chromium/content/browser/ScreenOrientationListener;Lorg/chromium/content/browser/ScreenOrientationListener$1;)V

    goto :goto_0
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/ScreenOrientationListener;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ScreenOrientationListener;

    .prologue
    .line 28
    iget-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$200(Lorg/chromium/content/browser/ScreenOrientationListener;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/ScreenOrientationListener;

    .prologue
    .line 28
    invoke-direct {p0}, Lorg/chromium/content/browser/ScreenOrientationListener;->notifyObservers()V

    return-void
.end method

.method static synthetic access$500(Lorg/chromium/content/browser/ScreenOrientationListener;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ScreenOrientationListener;

    .prologue
    .line 28
    iget v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    return v0
.end method

.method public static getInstance()Lorg/chromium/content/browser/ScreenOrientationListener;
    .locals 1

    .prologue
    .line 224
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 226
    sget-object v0, Lorg/chromium/content/browser/ScreenOrientationListener;->sInstance:Lorg/chromium/content/browser/ScreenOrientationListener;

    if-nez v0, :cond_0

    .line 227
    new-instance v0, Lorg/chromium/content/browser/ScreenOrientationListener;

    invoke-direct {v0}, Lorg/chromium/content/browser/ScreenOrientationListener;-><init>()V

    sput-object v0, Lorg/chromium/content/browser/ScreenOrientationListener;->sInstance:Lorg/chromium/content/browser/ScreenOrientationListener;

    .line 230
    :cond_0
    sget-object v0, Lorg/chromium/content/browser/ScreenOrientationListener;->sInstance:Lorg/chromium/content/browser/ScreenOrientationListener;

    return-object v0
.end method

.method private notifyObservers()V
    .locals 4

    .prologue
    .line 317
    iget v2, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    .line 318
    .local v2, "previousOrientation":I
    invoke-direct {p0}, Lorg/chromium/content/browser/ScreenOrientationListener;->updateOrientation()V

    .line 320
    iget v3, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    if-ne v3, v2, :cond_1

    .line 329
    :cond_0
    return-void

    .line 324
    :cond_1
    iget-object v3, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;

    invoke-static {v3}, Lorg/chromium/ui/gfx/DeviceDisplayInfo;->create(Landroid/content/Context;)Lorg/chromium/ui/gfx/DeviceDisplayInfo;

    move-result-object v3

    invoke-virtual {v3}, Lorg/chromium/ui/gfx/DeviceDisplayInfo;->updateNativeSharedDisplayInfo()V

    .line 326
    iget-object v3, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mObservers:Lorg/chromium/base/ObserverList;

    invoke-virtual {v3}, Lorg/chromium/base/ObserverList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;

    .line 327
    .local v1, "observer":Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;
    iget v3, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    invoke-interface {v1, v3}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;->onScreenOrientationChanged(I)V

    goto :goto_0
.end method

.method private updateOrientation()V
    .locals 3

    .prologue
    .line 335
    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 338
    .local v0, "windowManager":Landroid/view/WindowManager;
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 352
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Display.getRotation() shouldn\'t return that value"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 340
    :pswitch_0
    const/4 v1, 0x0

    iput v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    .line 355
    :goto_0
    return-void

    .line 343
    :pswitch_1
    const/16 v1, 0x5a

    iput v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    goto :goto_0

    .line 346
    :pswitch_2
    const/16 v1, 0xb4

    iput v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    goto :goto_0

    .line 349
    :pswitch_3
    const/16 v1, -0x5a

    iput v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mOrientation:I

    goto :goto_0

    .line 338
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public addObserver(Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;Landroid/content/Context;)V
    .locals 3
    .param p1, "observer"    # Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 248
    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 249
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;

    .line 252
    :cond_0
    sget-boolean v1, Lorg/chromium/content/browser/ScreenOrientationListener;->$assertionsDisabled:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eq v1, v2, :cond_1

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 253
    :cond_1
    sget-boolean v1, Lorg/chromium/content/browser/ScreenOrientationListener;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mAppContext:Landroid/content/Context;

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 255
    :cond_2
    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mObservers:Lorg/chromium/base/ObserverList;

    invoke-virtual {v1, p1}, Lorg/chromium/base/ObserverList;->addObserver(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 256
    const-string v1, "ScreenOrientationListener"

    const-string v2, "Adding an observer that is already present!"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    :goto_0
    return-void

    .line 261
    :cond_3
    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mObservers:Lorg/chromium/base/ObserverList;

    invoke-virtual {v1}, Lorg/chromium/base/ObserverList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 262
    invoke-direct {p0}, Lorg/chromium/content/browser/ScreenOrientationListener;->updateOrientation()V

    .line 263
    iget-object v1, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mBackend:Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;

    invoke-interface {v1}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;->startListening()V

    .line 268
    :cond_4
    move-object v0, p1

    .line 269
    .local v0, "obs":Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 270
    new-instance v1, Lorg/chromium/content/browser/ScreenOrientationListener$1;

    invoke-direct {v1, p0, v0}, Lorg/chromium/content/browser/ScreenOrientationListener$1;-><init>(Lorg/chromium/content/browser/ScreenOrientationListener;Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;)V

    invoke-static {v1}, Lorg/chromium/base/ThreadUtils;->postOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public removeObserver(Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;)V
    .locals 2
    .param p1, "observer"    # Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationObserver;

    .prologue
    .line 284
    iget-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mObservers:Lorg/chromium/base/ObserverList;

    invoke-virtual {v0, p1}, Lorg/chromium/base/ObserverList;->removeObserver(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 285
    const-string v0, "ScreenOrientationListener"

    const-string v1, "Removing an inexistent observer!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    :cond_0
    :goto_0
    return-void

    .line 289
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mObservers:Lorg/chromium/base/ObserverList;

    invoke-virtual {v0}, Lorg/chromium/base/ObserverList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mBackend:Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;

    invoke-interface {v0}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;->stopListening()V

    goto :goto_0
.end method

.method public startAccurateListening()V
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mBackend:Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;

    invoke-interface {v0}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;->startAccurateListening()V

    .line 301
    return-void
.end method

.method public stopAccurateListening()V
    .locals 1

    .prologue
    .line 308
    iget-object v0, p0, Lorg/chromium/content/browser/ScreenOrientationListener;->mBackend:Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;

    invoke-interface {v0}, Lorg/chromium/content/browser/ScreenOrientationListener$ScreenOrientationListenerBackend;->stopAccurateListening()V

    .line 309
    return-void
.end method
