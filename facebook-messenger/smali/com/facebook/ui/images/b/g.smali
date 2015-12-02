.class Lcom/facebook/ui/images/b/g;
.super Ljava/lang/Object;
.source "FetchImageDecodingExecutor.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/ui/images/b/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/cache/d;

.field final synthetic b:Lcom/facebook/ui/images/b/e;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/e;Lcom/facebook/ui/images/cache/d;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/ui/images/b/g;->b:Lcom/facebook/ui/images/b/e;

    iput-object p2, p0, Lcom/facebook/ui/images/b/g;->a:Lcom/facebook/ui/images/cache/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ui/images/b/r;)V
    .locals 3

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/ui/images/b/g;->b:Lcom/facebook/ui/images/b/e;

    invoke-static {v0}, Lcom/facebook/ui/images/b/e;->b(Lcom/facebook/ui/images/b/e;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/g;->b:Lcom/facebook/ui/images/b/e;

    invoke-static {v0}, Lcom/facebook/ui/images/b/e;->c(Lcom/facebook/ui/images/b/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/ui/images/b/g;->a:Lcom/facebook/ui/images/cache/d;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    monitor-exit v1

    .line 93
    return-void

    .line 92
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 87
    check-cast p1, Lcom/facebook/ui/images/b/r;

    invoke-virtual {p0, p1}, Lcom/facebook/ui/images/b/g;->a(Lcom/facebook/ui/images/b/r;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/ui/images/b/g;->b:Lcom/facebook/ui/images/b/e;

    invoke-static {v0}, Lcom/facebook/ui/images/b/e;->b(Lcom/facebook/ui/images/b/e;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 97
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/g;->b:Lcom/facebook/ui/images/b/e;

    invoke-static {v0}, Lcom/facebook/ui/images/b/e;->c(Lcom/facebook/ui/images/b/e;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/ui/images/b/g;->a:Lcom/facebook/ui/images/cache/d;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    monitor-exit v1

    .line 99
    return-void

    .line 98
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
