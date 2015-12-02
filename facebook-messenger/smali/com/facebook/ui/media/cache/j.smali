.class Lcom/facebook/ui/media/cache/j;
.super Ljava/lang/Object;
.source "MediaCache.java"

# interfaces
.implements Lcom/facebook/cache/a;


# annotations
.annotation build Lcom/google/common/annotations/VisibleForTesting;
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/cache/g;

.field private b:J


# direct methods
.method constructor <init>(Lcom/facebook/ui/media/cache/g;)V
    .locals 2

    .prologue
    .line 690
    iput-object p1, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 691
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/j;->b:J

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/cache/i;
    .locals 1

    .prologue
    .line 714
    sget-object v0, Lcom/facebook/cache/i;->LOW:Lcom/facebook/cache/i;

    return-object v0
.end method

.method public a(D)V
    .locals 7

    .prologue
    .line 719
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p1

    if-gtz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "trimRatio should be in range [0..1]"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 721
    iget-object v0, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/g;->d(Lcom/facebook/ui/media/cache/g;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 722
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/g;)I

    move-result v0

    iget-object v2, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v2}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/g;)I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, p1

    double-to-int v2, v2

    sub-int v2, v0, v2

    .line 723
    iget-object v0, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/g;->c(Lcom/facebook/ui/media/cache/g;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    .line 725
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/cache/i;

    .line 728
    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->c(Lcom/facebook/ui/media/cache/i;)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, Lcom/facebook/ui/media/cache/i;->a(Lcom/facebook/ui/media/cache/i;J)J

    goto :goto_1

    .line 744
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 719
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 730
    :cond_1
    :try_start_1
    new-instance v0, Lcom/facebook/ui/media/cache/h;

    iget-object v4, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-direct {v0, v4}, Lcom/facebook/ui/media/cache/h;-><init>(Lcom/facebook/ui/media/cache/g;)V

    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 733
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/cache/i;

    .line 734
    iget-object v4, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v4}, Lcom/facebook/ui/media/cache/g;->e(Lcom/facebook/ui/media/cache/g;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v4

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->d(Lcom/facebook/ui/media/cache/i;)Lcom/facebook/ui/media/cache/l;

    move-result-object v5

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->a(Lcom/facebook/ui/media/cache/i;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    iget-object v4, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v4}, Lcom/facebook/ui/media/cache/g;->c(Lcom/facebook/ui/media/cache/g;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v4

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->d(Lcom/facebook/ui/media/cache/i;)Lcom/facebook/ui/media/cache/l;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    iget-object v4, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/i;->b(Lcom/facebook/ui/media/cache/i;)I

    move-result v0

    invoke-static {v4, v0}, Lcom/facebook/ui/media/cache/g;->a(Lcom/facebook/ui/media/cache/g;I)I

    .line 738
    iget-object v0, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/g;)I

    move-result v0

    if-ge v0, v2, :cond_2

    .line 742
    :cond_3
    invoke-static {}, Lcom/facebook/ui/media/cache/g;->g()Ljava/lang/Class;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Finished cleaning out in memory cache: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v3}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/g;)I

    move-result v3

    div-int/lit16 v3, v3, 0x400

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " KB with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v3}, Lcom/facebook/ui/media/cache/g;->c(Lcom/facebook/ui/media/cache/g;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " values"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 744
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 745
    return-void
.end method

.method public a(Lcom/facebook/cache/q;)V
    .locals 0

    .prologue
    .line 710
    return-void
.end method

.method public b()Lcom/facebook/cache/l;
    .locals 1

    .prologue
    .line 695
    sget-object v0, Lcom/facebook/cache/l;->MEMORY:Lcom/facebook/cache/l;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 700
    iget-object v0, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/g;->b(Lcom/facebook/ui/media/cache/g;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 705
    iget-object v0, p0, Lcom/facebook/ui/media/cache/j;->a:Lcom/facebook/ui/media/cache/g;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/g;->c(Lcom/facebook/ui/media/cache/g;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 749
    const-string v0, "MediaCache.SyndicatedMemoryCache"

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 754
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/j;->b:J

    return-wide v0
.end method
