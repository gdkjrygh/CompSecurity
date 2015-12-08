.class public final Lcom/roidapp/baselib/c/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/AbstractExecutorService;

.field private static b:Ljava/util/concurrent/AbstractExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const-wide/16 v4, 0xa

    const/4 v6, 0x2

    const/4 v2, 0x1

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 34
    new-instance v0, Lcom/roidapp/baselib/c/ak;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v3, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v3}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct {v0, v6, v6, v1, v3}, Lcom/roidapp/baselib/c/ak;-><init>(IILjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 35
    sput-object v0, Lcom/roidapp/baselib/c/t;->a:Ljava/util/concurrent/AbstractExecutorService;

    check-cast v0, Lcom/roidapp/baselib/c/ak;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/ak;->b()V

    .line 37
    new-instance v0, Lcom/roidapp/baselib/c/ak;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v3, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v3}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct {v0, v2, v2, v1, v3}, Lcom/roidapp/baselib/c/ak;-><init>(IILjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 38
    sput-object v0, Lcom/roidapp/baselib/c/t;->b:Ljava/util/concurrent/AbstractExecutorService;

    check-cast v0, Lcom/roidapp/baselib/c/ak;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/ak;->b()V

    .line 45
    :goto_0
    return-void

    .line 42
    :cond_0
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move v3, v2

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v1, Lcom/roidapp/baselib/c/t;->a:Ljava/util/concurrent/AbstractExecutorService;

    .line 43
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move v3, v2

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v1, Lcom/roidapp/baselib/c/t;->b:Ljava/util/concurrent/AbstractExecutorService;

    goto :goto_0
.end method

.method public static a()Ljava/util/concurrent/AbstractExecutorService;
    .locals 1

    .prologue
    .line 53
    sget-object v0, Lcom/roidapp/baselib/c/t;->a:Ljava/util/concurrent/AbstractExecutorService;

    return-object v0
.end method

.method public static b()Ljava/util/concurrent/AbstractExecutorService;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Lcom/roidapp/baselib/c/t;->b:Ljava/util/concurrent/AbstractExecutorService;

    return-object v0
.end method
