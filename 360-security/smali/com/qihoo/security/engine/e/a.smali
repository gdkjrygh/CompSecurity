.class public Lcom/qihoo/security/engine/e/a;
.super Ljava/lang/Object;


# instance fields
.field final a:I

.field final b:Lcom/qihoo/security/engine/b/c;

.field final c:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field private volatile d:Z

.field private final e:I


# direct methods
.method public constructor <init>(ILcom/qihoo/security/engine/b/c;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/e/a;->d:Z

    iput p1, p0, Lcom/qihoo/security/engine/e/a;->a:I

    iput-object p2, p0, Lcom/qihoo/security/engine/e/a;->b:Lcom/qihoo/security/engine/b/c;

    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {v0, p3}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/e/a;->c:Ljava/util/concurrent/ArrayBlockingQueue;

    iput p3, p0, Lcom/qihoo/security/engine/e/a;->e:I

    return-void
.end method


# virtual methods
.method public a()Lcom/qihoo/security/engine/a;
    .locals 5

    invoke-virtual {p0}, Lcom/qihoo/security/engine/e/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/qihoo/security/engine/e/a;->c:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;->drainTo(Ljava/util/Collection;)I

    new-instance v0, Lcom/qihoo/security/engine/a;

    iget v2, p0, Lcom/qihoo/security/engine/e/a;->a:I

    iget-object v3, p0, Lcom/qihoo/security/engine/e/a;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v3, v3, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    iget-object v4, p0, Lcom/qihoo/security/engine/e/a;->b:Lcom/qihoo/security/engine/b/c;

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/qihoo/security/engine/a;-><init>(ILcom/qihoo/security/services/d;Ljava/util/List;Lcom/qihoo/security/engine/a$a;)V

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/services/ScanResult;Z)Lcom/qihoo/security/engine/a;
    .locals 5

    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/a;->d:Z

    if-eqz v0, :cond_0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/e/a;->c:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ArrayBlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/engine/e/a;->a()Lcom/qihoo/security/engine/a;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/qihoo/security/engine/e/a;->c:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;->drainTo(Ljava/util/Collection;)I

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/qihoo/security/engine/a;

    iget v2, p0, Lcom/qihoo/security/engine/e/a;->a:I

    iget-object v3, p0, Lcom/qihoo/security/engine/e/a;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v3, v3, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    iget-object v4, p0, Lcom/qihoo/security/engine/e/a;->b:Lcom/qihoo/security/engine/b/c;

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/qihoo/security/engine/a;-><init>(ILcom/qihoo/security/services/d;Ljava/util/List;Lcom/qihoo/security/engine/a$a;)V

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/e/a;->c:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/e/a;->d:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/e/a;->c:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ArrayBlockingQueue;->clear()V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/e/a;->d:Z

    return-void
.end method
