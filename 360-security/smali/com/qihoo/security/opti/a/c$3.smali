.class Lcom/qihoo/security/opti/a/c$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/a/c;->a(Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:Lcom/qihoo/security/opti/a/c$a;

.field final synthetic c:Ljava/util/concurrent/CountDownLatch;

.field final synthetic d:Lcom/qihoo/security/opti/a/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/a/c;Ljava/util/concurrent/CountDownLatch;Lcom/qihoo/security/opti/a/c$a;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .prologue
    .line 216
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c$3;->d:Lcom/qihoo/security/opti/a/c;

    iput-object p2, p0, Lcom/qihoo/security/opti/a/c$3;->a:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lcom/qihoo/security/opti/a/c$3;->b:Lcom/qihoo/security/opti/a/c$a;

    iput-object p4, p0, Lcom/qihoo/security/opti/a/c$3;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 220
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$3;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$3;->d:Lcom/qihoo/security/opti/a/c;

    iget-object v1, p0, Lcom/qihoo/security/opti/a/c$3;->b:Lcom/qihoo/security/opti/a/c$a;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c;Lcom/qihoo/security/opti/a/c$a;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$3;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 227
    :goto_0
    return-void

    .line 222
    :catch_0
    move-exception v0

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$3;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/qihoo/security/opti/a/c$3;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method
