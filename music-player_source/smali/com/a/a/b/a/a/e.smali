.class abstract Lcom/a/a/b/a/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field a:Lcom/a/a/b/a/a/g;

.field b:Ljava/lang/Object;

.field final synthetic c:Lcom/a/a/b/a/a/d;

.field private d:Lcom/a/a/b/a/a/g;


# direct methods
.method constructor <init>(Lcom/a/a/b/a/a/d;)V
    .locals 2

    iput-object p1, p0, Lcom/a/a/b/a/a/e;->c:Lcom/a/a/b/a/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p1, Lcom/a/a/b/a/a/d;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lcom/a/a/b/a/a/e;->a()Lcom/a/a/b/a/a/g;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    iget-object v0, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/a/a/b/a/a/e;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    iget-object v0, v0, Lcom/a/a/b/a/a/g;->a:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method private b()V
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/a/a/b/a/a/e;->c:Lcom/a/a/b/a/a/d;

    iget-object v3, v1, Lcom/a/a/b/a/a/d;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v1, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    move-object v2, v1

    :goto_0
    invoke-virtual {p0, v2}, Lcom/a/a/b/a/a/e;->a(Lcom/a/a/b/a/a/g;)Lcom/a/a/b/a/a/g;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, v0

    :cond_0
    :goto_1
    iput-object v1, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    iget-object v1, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    if-nez v1, :cond_3

    :goto_2
    iput-object v0, p0, Lcom/a/a/b/a/a/e;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :cond_1
    :try_start_1
    iget-object v4, v1, Lcom/a/a/b/a/a/g;->a:Ljava/lang/Object;

    if-nez v4, :cond_0

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, Lcom/a/a/b/a/a/e;->a()Lcom/a/a/b/a/a/g;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v2, v1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    iget-object v0, v0, Lcom/a/a/b/a/a/g;->a:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method


# virtual methods
.method abstract a()Lcom/a/a/b/a/a/g;
.end method

.method abstract a(Lcom/a/a/b/a/a/g;)Lcom/a/a/b/a/a/g;
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/a/a/e;->a:Lcom/a/a/b/a/a/g;

    iput-object v0, p0, Lcom/a/a/b/a/a/e;->d:Lcom/a/a/b/a/a/g;

    iget-object v0, p0, Lcom/a/a/b/a/a/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/a/a/b/a/a/e;->b()V

    return-object v0
.end method

.method public remove()V
    .locals 3

    iget-object v0, p0, Lcom/a/a/b/a/a/e;->d:Lcom/a/a/b/a/a/g;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/a/a/b/a/a/e;->d:Lcom/a/a/b/a/a/g;

    iget-object v1, p0, Lcom/a/a/b/a/a/e;->c:Lcom/a/a/b/a/a/d;

    iget-object v1, v1, Lcom/a/a/b/a/a/d;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v2, v0, Lcom/a/a/b/a/a/g;->a:Ljava/lang/Object;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/a/a/b/a/a/e;->c:Lcom/a/a/b/a/a/d;

    invoke-virtual {v2, v0}, Lcom/a/a/b/a/a/d;->a(Lcom/a/a/b/a/a/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method
