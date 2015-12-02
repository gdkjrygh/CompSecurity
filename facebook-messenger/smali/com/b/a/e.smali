.class public Lcom/b/a/e;
.super Ljava/lang/Object;
.source "StrictModeHelper.java"


# static fields
.field private static sHandler:Landroid/os/Handler;

.field private static sRestoreStrictMode:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 17
    sput-object v0, Lcom/b/a/e;->sRestoreStrictMode:Ljava/lang/Runnable;

    .line 18
    sput-object v0, Lcom/b/a/e;->sHandler:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static disableStrictMode()V
    .locals 3

    .prologue
    .line 41
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/b/a/a/g;

    const/4 v1, 0x0

    sget-object v2, Lcom/b/a/a/c;->Reset:Lcom/b/a/a/c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/b/a/a/c;->Lax:Lcom/b/a/a/c;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/b/a/e;->setStrictMode([Lcom/b/a/a/g;)V

    .line 42
    return-void
.end method

.method public static enableStrictMode()V
    .locals 3

    .prologue
    .line 29
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/b/a/a/g;

    const/4 v1, 0x0

    sget-object v2, Lcom/b/a/a/c;->Reset:Lcom/b/a/a/c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/b/a/a/d;->DetectAll:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/b/a/a/d;->PenaltyDeathOnNetwork:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/b/a/a/d;->PenaltyFlashScreen:Lcom/b/a/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/b/a/a/e;->DetectAll:Lcom/b/a/a/e;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/b/a/a/e;->PenaltyLog:Lcom/b/a/a/e;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/b/a/e;->setStrictMode([Lcom/b/a/a/g;)V

    .line 35
    return-void
.end method

.method public static enableUniqueViolations(ZLcom/b/a/c;)V
    .locals 0

    .prologue
    .line 22
    invoke-static {p0, p1}, Lcom/b/a/a;->enableUniqueViolations(ZLcom/b/a/c;)V

    .line 23
    return-void
.end method

.method public static setStrictMode(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/b/a/a/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/a/g;

    .line 54
    invoke-interface {v0}, Lcom/b/a/a/g;->set()V

    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, Lcom/b/a/a/a/g;

    invoke-direct {v0}, Lcom/b/a/a/a/g;-><init>()V

    .line 58
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_3

    .line 60
    const-class v1, Lcom/b/a/e;

    monitor-enter v1

    .line 61
    :try_start_0
    sget-object v2, Lcom/b/a/e;->sHandler:Landroid/os/Handler;

    if-nez v2, :cond_1

    .line 62
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v2, Lcom/b/a/e;->sHandler:Landroid/os/Handler;

    .line 65
    :cond_1
    sget-object v2, Lcom/b/a/e;->sRestoreStrictMode:Ljava/lang/Runnable;

    if-eqz v2, :cond_2

    .line 66
    sget-object v2, Lcom/b/a/e;->sHandler:Landroid/os/Handler;

    sget-object v3, Lcom/b/a/e;->sRestoreStrictMode:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 68
    :cond_2
    new-instance v2, Lcom/b/a/f;

    invoke-direct {v2, v0}, Lcom/b/a/f;-><init>(Lcom/b/a/a/a/g;)V

    sput-object v2, Lcom/b/a/e;->sRestoreStrictMode:Ljava/lang/Runnable;

    .line 74
    sget-object v0, Lcom/b/a/e;->sHandler:Landroid/os/Handler;

    sget-object v2, Lcom/b/a/e;->sRestoreStrictMode:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 75
    monitor-exit v1

    .line 77
    :cond_3
    return-void

    .line 75
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static varargs setStrictMode([Lcom/b/a/a/g;)V
    .locals 4

    .prologue
    .line 45
    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 47
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 49
    :cond_0
    invoke-static {v1}, Lcom/b/a/e;->setStrictMode(Ljava/util/List;)V

    .line 50
    return-void
.end method
