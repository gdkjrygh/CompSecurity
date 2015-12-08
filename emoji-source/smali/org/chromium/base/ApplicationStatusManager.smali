.class public Lorg/chromium/base/ApplicationStatusManager;
.super Ljava/lang/Object;
.source "ApplicationStatusManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;
    }
.end annotation


# static fields
.field private static sWindowFocusListeners:Lorg/chromium/base/ObserverList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/chromium/base/ObserverList",
            "<",
            "Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lorg/chromium/base/ObserverList;

    invoke-direct {v0}, Lorg/chromium/base/ObserverList;-><init>()V

    sput-object v0, Lorg/chromium/base/ApplicationStatusManager;->sWindowFocusListeners:Lorg/chromium/base/ObserverList;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method static synthetic access$000(Landroid/app/Activity;)V
    .locals 0
    .param p0, "x0"    # Landroid/app/Activity;

    .prologue
    .line 15
    invoke-static {p0}, Lorg/chromium/base/ApplicationStatusManager;->setWindowFocusChangedCallback(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$100()Lorg/chromium/base/ObserverList;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lorg/chromium/base/ApplicationStatusManager;->sWindowFocusListeners:Lorg/chromium/base/ObserverList;

    return-object v0
.end method

.method public static informActivityStarted(Landroid/app/Activity;)V
    .locals 0
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 94
    invoke-static {p0}, Lorg/chromium/base/ApplicationStatusManager;->setWindowFocusChangedCallback(Landroid/app/Activity;)V

    .line 95
    invoke-static {p0}, Lorg/chromium/base/ApplicationStatus;->informActivityStarted(Landroid/app/Activity;)V

    .line 96
    return-void
.end method

.method public static init(Landroid/app/Application;)V
    .locals 1
    .param p0, "app"    # Landroid/app/Application;

    .prologue
    .line 32
    invoke-static {p0}, Lorg/chromium/base/ApplicationStatus;->initialize(Landroid/app/Application;)V

    .line 34
    new-instance v0, Lorg/chromium/base/ApplicationStatusManager$1;

    invoke-direct {v0}, Lorg/chromium/base/ApplicationStatusManager$1;-><init>()V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 70
    return-void
.end method

.method public static registerWindowFocusChangedListener(Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;)V
    .locals 1
    .param p0, "listener"    # Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;

    .prologue
    .line 77
    sget-object v0, Lorg/chromium/base/ApplicationStatusManager;->sWindowFocusListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v0, p0}, Lorg/chromium/base/ObserverList;->addObserver(Ljava/lang/Object;)Z

    .line 78
    return-void
.end method

.method private static setWindowFocusChangedCallback(Landroid/app/Activity;)V
    .locals 3
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 99
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 100
    .local v0, "callback":Landroid/view/Window$Callback;
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    new-instance v2, Lorg/chromium/base/ApplicationStatusManager$2;

    invoke-direct {v2, v0, p0}, Lorg/chromium/base/ApplicationStatusManager$2;-><init>(Landroid/view/Window$Callback;Landroid/app/Activity;)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 110
    return-void
.end method

.method public static unregisterWindowFocusChangedListener(Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;)V
    .locals 1
    .param p0, "listener"    # Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;

    .prologue
    .line 85
    sget-object v0, Lorg/chromium/base/ApplicationStatusManager;->sWindowFocusListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v0, p0}, Lorg/chromium/base/ObserverList;->removeObserver(Ljava/lang/Object;)Z

    .line 86
    return-void
.end method
