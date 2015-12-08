.class public Lorg/chromium/content/common/CleanupReference;
.super Ljava/lang/ref/WeakReference;
.source "CleanupReference.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/common/CleanupReference$LazyHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final ADD_REF:I = 0x1

.field private static final DEBUG:Z = false

.field private static final REMOVE_REF:I = 0x2

.field private static final TAG:Ljava/lang/String; = "CleanupReference"

.field private static sCleanupMonitor:Ljava/lang/Object;

.field private static sGcQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final sReaperThread:Ljava/lang/Thread;

.field private static sRefs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lorg/chromium/content/common/CleanupReference;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCleanupTask:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 42
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    sput-object v0, Lorg/chromium/content/common/CleanupReference;->sGcQueue:Ljava/lang/ref/ReferenceQueue;

    .line 43
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lorg/chromium/content/common/CleanupReference;->sCleanupMonitor:Ljava/lang/Object;

    .line 45
    new-instance v0, Lorg/chromium/content/common/CleanupReference$1;

    const-string v1, "CleanupReference"

    invoke-direct {v0, v1}, Lorg/chromium/content/common/CleanupReference$1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/chromium/content/common/CleanupReference;->sReaperThread:Ljava/lang/Thread;

    .line 66
    sget-object v0, Lorg/chromium/content/common/CleanupReference;->sReaperThread:Ljava/lang/Thread;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 67
    sget-object v0, Lorg/chromium/content/common/CleanupReference;->sReaperThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 121
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/chromium/content/common/CleanupReference;->sRefs:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Runnable;)V
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;
    .param p2, "cleanupTask"    # Ljava/lang/Runnable;

    .prologue
    .line 131
    sget-object v0, Lorg/chromium/content/common/CleanupReference;->sGcQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p0, p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 133
    iput-object p2, p0, Lorg/chromium/content/common/CleanupReference;->mCleanupTask:Ljava/lang/Runnable;

    .line 134
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/chromium/content/common/CleanupReference;->handleOnUiThread(I)V

    .line 135
    return-void
.end method

.method static synthetic access$000()Ljava/lang/ref/ReferenceQueue;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lorg/chromium/content/common/CleanupReference;->sGcQueue:Ljava/lang/ref/ReferenceQueue;

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lorg/chromium/content/common/CleanupReference;->sCleanupMonitor:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$200()Ljava/util/Set;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lorg/chromium/content/common/CleanupReference;->sRefs:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic access$300(Lorg/chromium/content/common/CleanupReference;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/common/CleanupReference;

    .prologue
    .line 33
    invoke-direct {p0}, Lorg/chromium/content/common/CleanupReference;->runCleanupTaskInternal()V

    return-void
.end method

.method private handleOnUiThread(I)V
    .locals 3
    .param p1, "what"    # I

    .prologue
    .line 146
    sget-object v1, Lorg/chromium/content/common/CleanupReference$LazyHolder;->sHandler:Landroid/os/Handler;

    invoke-static {v1, p1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 147
    .local v0, "msg":Landroid/os/Message;
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 148
    invoke-virtual {v0}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 149
    invoke-virtual {v0}, Landroid/os/Message;->recycle()V

    .line 153
    :goto_0
    return-void

    .line 151
    :cond_0
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0
.end method

.method private runCleanupTaskInternal()V
    .locals 1

    .prologue
    .line 157
    sget-object v0, Lorg/chromium/content/common/CleanupReference;->sRefs:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 158
    iget-object v0, p0, Lorg/chromium/content/common/CleanupReference;->mCleanupTask:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 160
    iget-object v0, p0, Lorg/chromium/content/common/CleanupReference;->mCleanupTask:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/common/CleanupReference;->mCleanupTask:Ljava/lang/Runnable;

    .line 163
    :cond_0
    invoke-virtual {p0}, Lorg/chromium/content/common/CleanupReference;->clear()V

    .line 164
    return-void
.end method


# virtual methods
.method public cleanupNow()V
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lorg/chromium/content/common/CleanupReference;->handleOnUiThread(I)V

    .line 143
    return-void
.end method
