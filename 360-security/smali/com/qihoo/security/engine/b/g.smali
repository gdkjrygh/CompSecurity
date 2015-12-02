.class public Lcom/qihoo/security/engine/b/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/engine/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/b/g$a;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Runnable;

.field final b:Lcom/qihoo/security/engine/b/c;

.field final c:Landroid/os/Handler;

.field final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field final e:Lcom/qihoo/security/engine/b/g$a;

.field f:Z


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/b/c;Landroid/os/Handler;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/qihoo/security/engine/b/g$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/g$1;-><init>(Lcom/qihoo/security/engine/b/g;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/g;->a:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/g;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/qihoo/security/engine/b/g$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/g$a;-><init>(Lcom/qihoo/security/engine/b/g;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/g;->e:Lcom/qihoo/security/engine/b/g$a;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/g;->f:Z

    iput-object p1, p0, Lcom/qihoo/security/engine/b/g;->b:Lcom/qihoo/security/engine/b/c;

    iput-object p2, p0, Lcom/qihoo/security/engine/b/g;->c:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->a()I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/g;->f:Z

    return-void
.end method

.method public a(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/g;->c()V

    :cond_0
    return-void
.end method

.method public a(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/g;->c()V

    :cond_0
    return-void
.end method

.method public a(ILjava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public a(J)V
    .locals 3

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->c:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/engine/b/g$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/engine/b/g$2;-><init>(Lcom/qihoo/security/engine/b/g;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/g;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/g;->a()V

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    new-instance v0, Lcom/qihoo/security/engine/a;

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/qihoo/security/engine/b/g;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v2, v2, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-direct {v0, v1, v2, p1, p0}, Lcom/qihoo/security/engine/a;-><init>(ILcom/qihoo/security/services/d;Ljava/util/List;Lcom/qihoo/security/engine/a$a;)V

    iget-object v1, p0, Lcom/qihoo/security/engine/b/g;->e:Lcom/qihoo/security/engine/b/g$a;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/b/g$a;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->d(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->b()I

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/g;->a:Ljava/lang/Runnable;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->e:Lcom/qihoo/security/engine/b/g$a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g$a;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g;->e:Lcom/qihoo/security/engine/b/g$a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/g$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
