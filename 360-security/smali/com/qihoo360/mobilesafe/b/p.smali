.class public Lcom/qihoo360/mobilesafe/b/p;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo360/mobilesafe/b/p;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static a()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/qihoo360/mobilesafe/b/p;->a:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 24
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/b/p;->a:Ljava/util/concurrent/ExecutorService;

    .line 26
    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/b/p;->a:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
