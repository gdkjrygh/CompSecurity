.class final Lcom/qihoo/security/opti/a/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/a/a;->c(Ljava/util/List;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:Lcom/qihoo/security/opti/a/a$b;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Ljava/util/concurrent/CountDownLatch;Lcom/qihoo/security/opti/a/a$b;Ljava/util/Map;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .prologue
    .line 125
    iput-object p1, p0, Lcom/qihoo/security/opti/a/a$1;->a:Ljava/util/concurrent/CountDownLatch;

    iput-object p2, p0, Lcom/qihoo/security/opti/a/a$1;->b:Lcom/qihoo/security/opti/a/a$b;

    iput-object p3, p0, Lcom/qihoo/security/opti/a/a$1;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/qihoo/security/opti/a/a$1;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 129
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/a$1;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/opti/a/a$1;->b:Lcom/qihoo/security/opti/a/a$b;

    iget-object v0, v0, Lcom/qihoo/security/opti/a/a$b;->b:[I

    invoke-static {v0}, Lcom/qihoo/security/opti/a/a;->a([I)F

    move-result v0

    .line 131
    new-instance v1, Lcom/qihoo/security/opti/a/a$a;

    iget-object v2, p0, Lcom/qihoo/security/opti/a/a$1;->b:Lcom/qihoo/security/opti/a/a$b;

    iget-object v2, v2, Lcom/qihoo/security/opti/a/a$b;->a:Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lcom/qihoo/security/opti/a/a$a;-><init>(Ljava/lang/String;F)V

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/opti/a/a$1;->c:Ljava/util/Map;

    iget-object v2, p0, Lcom/qihoo/security/opti/a/a$1;->b:Lcom/qihoo/security/opti/a/a$b;

    iget-object v2, v2, Lcom/qihoo/security/opti/a/a$b;->a:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/opti/a/a$1;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 141
    :goto_0
    return-void

    .line 133
    :catch_0
    move-exception v0

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/opti/a/a$1;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/qihoo/security/opti/a/a$1;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method
