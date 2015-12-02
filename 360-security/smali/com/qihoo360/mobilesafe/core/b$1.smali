.class Lcom/qihoo360/mobilesafe/core/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/b;->b(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/b;

.field private final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field private final synthetic c:Ljava/util/concurrent/CountDownLatch;

.field private final synthetic d:Lcom/qihoo360/mobilesafe/service/ProcessInfo;

.field private final synthetic e:Z


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/CountDownLatch;Lcom/qihoo360/mobilesafe/service/ProcessInfo;Z)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/b$1;->a:Lcom/qihoo360/mobilesafe/core/b;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/core/b$1;->b:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/core/b$1;->c:Ljava/util/concurrent/CountDownLatch;

    iput-object p4, p0, Lcom/qihoo360/mobilesafe/core/b$1;->d:Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    iput-boolean p5, p0, Lcom/qihoo360/mobilesafe/core/b$1;->e:Z

    .line 323
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 327
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$1;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 328
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 330
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$1;->a:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b;->b(Lcom/qihoo360/mobilesafe/core/b;)Landroid/app/ActivityManager;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b$1;->d:Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/core/b$1;->e:Z

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/app/ActivityManager;Lcom/qihoo360/mobilesafe/service/ProcessInfo;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 346
    :goto_0
    return-void

    .line 337
    :catch_0
    move-exception v0

    .line 344
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 342
    :catchall_0
    move-exception v0

    .line 344
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 345
    throw v0
.end method
