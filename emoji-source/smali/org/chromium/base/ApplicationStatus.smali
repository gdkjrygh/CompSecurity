.class public Lorg/chromium/base/ApplicationStatus;
.super Ljava/lang/Object;
.source "ApplicationStatus.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/base/ApplicationStatus$ActivityStateListener;,
        Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;,
        Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "base::android"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static sActivity:Landroid/app/Activity;

.field private static final sActivityInfo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/app/Activity;",
            "Lorg/chromium/base/ApplicationStatus$ActivityInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static sApplication:Landroid/app/Application;

.field private static final sApplicationStateListeners:Lorg/chromium/base/ObserverList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/chromium/base/ObserverList",
            "<",
            "Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;",
            ">;"
        }
    .end annotation
.end field

.field private static sCachedApplicationState:Ljava/lang/Integer;

.field private static sCachedApplicationStateLock:Ljava/lang/Object;

.field private static final sGeneralActivityStateListeners:Lorg/chromium/base/ObserverList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/chromium/base/ObserverList",
            "<",
            "Lorg/chromium/base/ApplicationStatus$ActivityStateListener;",
            ">;"
        }
    .end annotation
.end field

.field private static sNativeApplicationStateListener:Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lorg/chromium/base/ApplicationStatus;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/ApplicationStatus;->$assertionsDisabled:Z

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lorg/chromium/base/ApplicationStatus;->sCachedApplicationStateLock:Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    .line 72
    new-instance v0, Lorg/chromium/base/ObserverList;

    invoke-direct {v0}, Lorg/chromium/base/ObserverList;-><init>()V

    sput-object v0, Lorg/chromium/base/ApplicationStatus;->sGeneralActivityStateListeners:Lorg/chromium/base/ObserverList;

    .line 79
    new-instance v0, Lorg/chromium/base/ObserverList;

    invoke-direct {v0}, Lorg/chromium/base/ObserverList;-><init>()V

    sput-object v0, Lorg/chromium/base/ApplicationStatus;->sApplicationStateListeners:Lorg/chromium/base/ObserverList;

    return-void

    .line 23
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$002(Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0
    .param p0, "x0"    # Landroid/app/Activity;

    .prologue
    .line 24
    sput-object p0, Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$100(Landroid/app/Activity;I)V
    .locals 0
    .param p0, "x0"    # Landroid/app/Activity;
    .param p1, "x1"    # I

    .prologue
    .line 24
    invoke-static {p0, p1}, Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V

    return-void
.end method

.method static synthetic access$300()Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sNativeApplicationStateListener:Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    return-object v0
.end method

.method static synthetic access$302(Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;)Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;
    .locals 0
    .param p0, "x0"    # Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    .prologue
    .line 24
    sput-object p0, Lorg/chromium/base/ApplicationStatus;->sNativeApplicationStateListener:Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    return-object p0
.end method

.method static synthetic access$400(I)V
    .locals 0
    .param p0, "x0"    # I

    .prologue
    .line 24
    invoke-static {p0}, Lorg/chromium/base/ApplicationStatus;->nativeOnApplicationStateChange(I)V

    return-void
.end method

.method private static determineApplicationState()I
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v5, 0x4

    .line 439
    const/4 v0, 0x0

    .line 440
    .local v0, "hasPausedActivity":Z
    const/4 v1, 0x0

    .line 442
    .local v1, "hasStoppedActivity":Z
    sget-object v6, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/chromium/base/ApplicationStatus$ActivityInfo;

    .line 443
    .local v3, "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    invoke-virtual {v3}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->getStatus()I

    move-result v4

    .line 444
    .local v4, "state":I
    if-eq v4, v5, :cond_2

    if-eq v4, v7, :cond_2

    const/4 v6, 0x6

    if-eq v4, v6, :cond_2

    .line 447
    const/4 v5, 0x1

    .line 457
    .end local v3    # "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    .end local v4    # "state":I
    :cond_1
    :goto_1
    return v5

    .line 448
    .restart local v3    # "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    .restart local v4    # "state":I
    :cond_2
    if-ne v4, v5, :cond_3

    .line 449
    const/4 v0, 0x1

    goto :goto_0

    .line 450
    :cond_3
    if-ne v4, v7, :cond_0

    .line 451
    const/4 v1, 0x1

    goto :goto_0

    .line 455
    .end local v3    # "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    .end local v4    # "state":I
    :cond_4
    if-eqz v0, :cond_5

    const/4 v5, 0x2

    goto :goto_1

    .line 456
    :cond_5
    if-eqz v1, :cond_1

    const/4 v5, 0x3

    goto :goto_1
.end method

.method public static getApplicationContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 256
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sApplication:Landroid/app/Application;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sApplication:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getLastTrackedFocusedActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 238
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public static getRunningActivities()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 245
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .local v0, "activities":Ljava/util/List;, "Ljava/util/List<Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;>;"
    sget-object v3, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 247
    .local v1, "activity":Landroid/app/Activity;
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 249
    .end local v1    # "activity":Landroid/app/Activity;
    :cond_0
    return-object v0
.end method

.method public static getStateForActivity(Landroid/app/Activity;)I
    .locals 2
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 303
    sget-object v1, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/base/ApplicationStatus$ActivityInfo;

    .line 304
    .local v0, "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->getStatus()I

    move-result v1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x6

    goto :goto_0
.end method

.method public static getStateForApplication()I
    .locals 2

    .prologue
    .line 311
    sget-object v1, Lorg/chromium/base/ApplicationStatus;->sCachedApplicationStateLock:Ljava/lang/Object;

    monitor-enter v1

    .line 312
    :try_start_0
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sCachedApplicationState:Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 313
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->determineApplicationState()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lorg/chromium/base/ApplicationStatus;->sCachedApplicationState:Ljava/lang/Integer;

    .line 315
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sCachedApplicationState:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 315
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static hasVisibleActivities()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 327
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->getStateForApplication()I

    move-result v0

    .line 328
    .local v0, "state":I
    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static informActivityStarted(Landroid/app/Activity;)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 400
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V

    .line 401
    const/4 v0, 0x2

    invoke-static {p0, v0}, Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V

    .line 402
    const/4 v0, 0x3

    invoke-static {p0, v0}, Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V

    .line 403
    return-void
.end method

.method public static initialize(Landroid/app/Application;)V
    .locals 2
    .param p0, "app"    # Landroid/app/Application;

    .prologue
    .line 113
    sput-object p0, Lorg/chromium/base/ApplicationStatus;->sApplication:Landroid/app/Application;

    .line 115
    new-instance v0, Lorg/chromium/base/ApplicationStatus$1;

    invoke-direct {v0}, Lorg/chromium/base/ApplicationStatus$1;-><init>()V

    invoke-static {v0}, Lorg/chromium/base/ApplicationStatusManager;->registerWindowFocusChangedListener(Lorg/chromium/base/ApplicationStatusManager$WindowFocusChangedListener;)V

    .line 131
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sApplication:Landroid/app/Application;

    new-instance v1, Lorg/chromium/base/ApplicationStatus$2;

    invoke-direct {v1}, Lorg/chromium/base/ApplicationStatus$2;-><init>()V

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 165
    return-void
.end method

.method public static isEveryActivityDestroyed()Z
    .locals 1

    .prologue
    .line 337
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method private static native nativeOnApplicationStateChange(I)V
.end method

.method private static onStateChange(Landroid/app/Activity;I)V
    .locals 8
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "newState"    # I

    .prologue
    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 174
    if-nez p0, :cond_0

    new-instance v5, Ljava/lang/IllegalArgumentException;

    const-string v6, "null activity is not supported"

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 176
    :cond_0
    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;

    if-eqz v5, :cond_1

    if-eq p1, v6, :cond_1

    const/4 v5, 0x3

    if-eq p1, v5, :cond_1

    const/4 v5, 0x2

    if-ne p1, v5, :cond_2

    .line 180
    :cond_1
    sput-object p0, Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;

    .line 183
    :cond_2
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->getStateForApplication()I

    move-result v4

    .line 185
    .local v4, "oldApplicationState":I
    if-ne p1, v6, :cond_4

    .line 186
    sget-boolean v5, Lorg/chromium/base/ApplicationStatus;->$assertionsDisabled:Z

    if-nez v5, :cond_3

    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v5, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v5, Ljava/lang/AssertionError;

    invoke-direct {v5}, Ljava/lang/AssertionError;-><init>()V

    throw v5

    .line 187
    :cond_3
    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    new-instance v6, Lorg/chromium/base/ApplicationStatus$ActivityInfo;

    invoke-direct {v6, v7}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;-><init>(Lorg/chromium/base/ApplicationStatus$1;)V

    invoke-interface {v5, p0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    :cond_4
    sget-object v6, Lorg/chromium/base/ApplicationStatus;->sCachedApplicationStateLock:Ljava/lang/Object;

    monitor-enter v6

    .line 192
    const/4 v5, 0x0

    :try_start_0
    sput-object v5, Lorg/chromium/base/ApplicationStatus;->sCachedApplicationState:Ljava/lang/Integer;

    .line 193
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v5, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/chromium/base/ApplicationStatus$ActivityInfo;

    .line 197
    .local v2, "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    if-nez v2, :cond_6

    .line 223
    :cond_5
    :goto_0
    return-void

    .line 193
    .end local v2    # "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    :catchall_0
    move-exception v5

    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v5

    .line 199
    .restart local v2    # "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    :cond_6
    invoke-virtual {v2, p1}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->setStatus(I)V

    .line 202
    invoke-virtual {v2}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->getListeners()Lorg/chromium/base/ObserverList;

    move-result-object v5

    invoke-virtual {v5}, Lorg/chromium/base/ObserverList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/chromium/base/ApplicationStatus$ActivityStateListener;

    .line 203
    .local v3, "listener":Lorg/chromium/base/ApplicationStatus$ActivityStateListener;
    invoke-interface {v3, p0, p1}, Lorg/chromium/base/ApplicationStatus$ActivityStateListener;->onActivityStateChange(Landroid/app/Activity;I)V

    goto :goto_1

    .line 208
    .end local v3    # "listener":Lorg/chromium/base/ApplicationStatus$ActivityStateListener;
    :cond_7
    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sGeneralActivityStateListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v5}, Lorg/chromium/base/ObserverList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/chromium/base/ApplicationStatus$ActivityStateListener;

    .line 209
    .restart local v3    # "listener":Lorg/chromium/base/ApplicationStatus$ActivityStateListener;
    invoke-interface {v3, p0, p1}, Lorg/chromium/base/ApplicationStatus$ActivityStateListener;->onActivityStateChange(Landroid/app/Activity;I)V

    goto :goto_2

    .line 212
    .end local v3    # "listener":Lorg/chromium/base/ApplicationStatus$ActivityStateListener;
    :cond_8
    invoke-static {}, Lorg/chromium/base/ApplicationStatus;->getStateForApplication()I

    move-result v0

    .line 213
    .local v0, "applicationState":I
    if-eq v0, v4, :cond_9

    .line 214
    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sApplicationStateListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v5}, Lorg/chromium/base/ObserverList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    .line 215
    .local v3, "listener":Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;
    invoke-interface {v3, v0}, Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;->onApplicationStateChange(I)V

    goto :goto_3

    .line 219
    .end local v3    # "listener":Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;
    :cond_9
    const/4 v5, 0x6

    if-ne p1, v5, :cond_5

    .line 220
    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v5, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    sget-object v5, Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;

    if-ne p0, v5, :cond_5

    sput-object v7, Lorg/chromium/base/ApplicationStatus;->sActivity:Landroid/app/Activity;

    goto :goto_0
.end method

.method public static onStateChangeForTesting(Landroid/app/Activity;I)V
    .locals 0
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "newState"    # I
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 230
    invoke-static {p0, p1}, Lorg/chromium/base/ApplicationStatus;->onStateChange(Landroid/app/Activity;I)V

    .line 231
    return-void
.end method

.method public static registerApplicationStateListener(Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;)V
    .locals 1
    .param p0, "listener"    # Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    .prologue
    .line 383
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sApplicationStateListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v0, p0}, Lorg/chromium/base/ObserverList;->addObserver(Ljava/lang/Object;)Z

    .line 384
    return-void
.end method

.method public static registerStateListenerForActivity(Lorg/chromium/base/ApplicationStatus$ActivityStateListener;Landroid/app/Activity;)V
    .locals 3
    .param p0, "listener"    # Lorg/chromium/base/ApplicationStatus$ActivityStateListener;
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 358
    sget-boolean v1, Lorg/chromium/base/ApplicationStatus;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    if-nez p1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 360
    :cond_0
    sget-object v1, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/base/ApplicationStatus$ActivityInfo;

    .line 361
    .local v0, "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    sget-boolean v1, Lorg/chromium/base/ApplicationStatus;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->getStatus()I

    move-result v1

    const/4 v2, 0x6

    if-ne v1, v2, :cond_2

    :cond_1
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 362
    :cond_2
    invoke-virtual {v0}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->getListeners()Lorg/chromium/base/ObserverList;

    move-result-object v1

    invoke-virtual {v1, p0}, Lorg/chromium/base/ObserverList;->addObserver(Ljava/lang/Object;)Z

    .line 363
    return-void
.end method

.method public static registerStateListenerForAllActivities(Lorg/chromium/base/ApplicationStatus$ActivityStateListener;)V
    .locals 1
    .param p0, "listener"    # Lorg/chromium/base/ApplicationStatus$ActivityStateListener;

    .prologue
    .line 345
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sGeneralActivityStateListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v0, p0}, Lorg/chromium/base/ObserverList;->addObserver(Ljava/lang/Object;)Z

    .line 346
    return-void
.end method

.method private static registerThreadSafeNativeApplicationStateListener()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 413
    new-instance v0, Lorg/chromium/base/ApplicationStatus$3;

    invoke-direct {v0}, Lorg/chromium/base/ApplicationStatus$3;-><init>()V

    invoke-static {v0}, Lorg/chromium/base/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 427
    return-void
.end method

.method public static unregisterActivityStateListener(Lorg/chromium/base/ApplicationStatus$ActivityStateListener;)V
    .locals 3
    .param p0, "listener"    # Lorg/chromium/base/ApplicationStatus$ActivityStateListener;

    .prologue
    .line 370
    sget-object v2, Lorg/chromium/base/ApplicationStatus;->sGeneralActivityStateListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v2, p0}, Lorg/chromium/base/ObserverList;->removeObserver(Ljava/lang/Object;)Z

    .line 373
    sget-object v2, Lorg/chromium/base/ApplicationStatus;->sActivityInfo:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/chromium/base/ApplicationStatus$ActivityInfo;

    .line 374
    .local v1, "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    invoke-virtual {v1}, Lorg/chromium/base/ApplicationStatus$ActivityInfo;->getListeners()Lorg/chromium/base/ObserverList;

    move-result-object v2

    invoke-virtual {v2, p0}, Lorg/chromium/base/ObserverList;->removeObserver(Ljava/lang/Object;)Z

    goto :goto_0

    .line 376
    .end local v1    # "info":Lorg/chromium/base/ApplicationStatus$ActivityInfo;
    :cond_0
    return-void
.end method

.method public static unregisterApplicationStateListener(Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;)V
    .locals 1
    .param p0, "listener"    # Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;

    .prologue
    .line 391
    sget-object v0, Lorg/chromium/base/ApplicationStatus;->sApplicationStateListeners:Lorg/chromium/base/ObserverList;

    invoke-virtual {v0, p0}, Lorg/chromium/base/ObserverList;->removeObserver(Ljava/lang/Object;)Z

    .line 392
    return-void
.end method
