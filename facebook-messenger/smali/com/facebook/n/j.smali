.class public Lcom/facebook/n/j;
.super Ljava/lang/Object;
.source "SpringSystem.java"


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/n/c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/n/c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/ui/b/d;

.field private final d:Lcom/facebook/n/k;

.field private final e:Lcom/facebook/common/time/a;

.field private f:J

.field private g:Lcom/facebook/common/b/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/b/d",
            "<",
            "Lcom/facebook/n/l;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/ui/b/d;Lcom/facebook/n/k;)V
    .locals 2

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/n/j;->a:Ljava/util/Map;

    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/n/j;->b:Ljava/util/Set;

    .line 35
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/n/j;->f:J

    .line 36
    new-instance v0, Lcom/facebook/common/b/d;

    invoke-direct {v0}, Lcom/facebook/common/b/d;-><init>()V

    iput-object v0, p0, Lcom/facebook/n/j;->g:Lcom/facebook/common/b/d;

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/n/j;->h:Z

    .line 52
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/n/j;->e:Lcom/facebook/common/time/a;

    .line 53
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/b/d;

    iput-object v0, p0, Lcom/facebook/n/j;->c:Lcom/facebook/ui/b/d;

    .line 54
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/k;

    iput-object v0, p0, Lcom/facebook/n/j;->d:Lcom/facebook/n/k;

    .line 55
    iget-object v0, p0, Lcom/facebook/n/j;->d:Lcom/facebook/n/k;

    invoke-virtual {v0, p0}, Lcom/facebook/n/k;->a(Lcom/facebook/n/j;)V

    .line 56
    return-void
.end method


# virtual methods
.method a(JJ)V
    .locals 8

    .prologue
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 139
    iget-object v0, p0, Lcom/facebook/n/j;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/c;

    .line 141
    invoke-virtual {v0}, Lcom/facebook/n/c;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 142
    long-to-double v2, p1

    div-double/2addr v2, v6

    long-to-double v4, p3

    div-double/2addr v4, v6

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/facebook/n/c;->a(DD)V

    goto :goto_0

    .line 144
    :cond_0
    iget-object v2, p0, Lcom/facebook/n/j;->b:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 147
    :cond_1
    return-void
.end method

.method a(Lcom/facebook/n/c;)V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 112
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    iget-object v0, p0, Lcom/facebook/n/j;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/n/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 114
    iget-object v0, p0, Lcom/facebook/n/j;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/n/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    return-void

    .line 113
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Ljava/lang/String;)V
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/n/j;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/c;

    .line 189
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tried to activate Spring with id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not registered to SpringSystem."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    monitor-enter p0

    .line 192
    :try_start_0
    iget-object v1, p0, Lcom/facebook/n/j;->b:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 193
    invoke-virtual {p0}, Lcom/facebook/n/j;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/n/j;->h:Z

    .line 195
    iget-object v0, p0, Lcom/facebook/n/j;->c:Lcom/facebook/ui/b/d;

    iget-object v1, p0, Lcom/facebook/n/j;->d:Lcom/facebook/n/k;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/b/d;->a(Lcom/facebook/ui/b/e;)V

    .line 197
    :cond_0
    monitor-exit p0

    .line 198
    return-void

    .line 197
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/facebook/n/j;->h:Z

    return v0
.end method

.method public b()Lcom/facebook/n/c;
    .locals 1

    .prologue
    .line 71
    new-instance v0, Lcom/facebook/n/c;

    invoke-direct {v0, p0}, Lcom/facebook/n/c;-><init>(Lcom/facebook/n/j;)V

    .line 72
    invoke-virtual {p0, v0}, Lcom/facebook/n/j;->a(Lcom/facebook/n/c;)V

    .line 73
    return-object v0
.end method

.method public b(Lcom/facebook/n/c;)V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 128
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lcom/facebook/n/j;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 130
    iget-object v0, p0, Lcom/facebook/n/j;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/n/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    return-void
.end method

.method c()V
    .locals 7

    .prologue
    const-wide/16 v5, -0x1

    .line 153
    iget-object v0, p0, Lcom/facebook/n/j;->e:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 154
    iget-wide v3, p0, Lcom/facebook/n/j;->f:J

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    .line 155
    const-wide/16 v3, 0x1

    sub-long v3, v1, v3

    iput-wide v3, p0, Lcom/facebook/n/j;->f:J

    .line 157
    :cond_0
    iget-wide v3, p0, Lcom/facebook/n/j;->f:J

    sub-long v3, v1, v3

    .line 158
    iput-wide v1, p0, Lcom/facebook/n/j;->f:J

    .line 160
    iget-object v0, p0, Lcom/facebook/n/j;->g:Lcom/facebook/common/b/d;

    invoke-virtual {v0}, Lcom/facebook/common/b/d;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/l;

    .line 161
    invoke-interface {v0, p0}, Lcom/facebook/n/l;->a(Lcom/facebook/n/j;)V

    goto :goto_0

    .line 163
    :cond_1
    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/facebook/n/j;->a(JJ)V

    .line 164
    monitor-enter p0

    .line 165
    :try_start_0
    iget-object v0, p0, Lcom/facebook/n/j;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 166
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/n/j;->h:Z

    .line 167
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/n/j;->f:J

    .line 169
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    iget-object v0, p0, Lcom/facebook/n/j;->g:Lcom/facebook/common/b/d;

    invoke-virtual {v0}, Lcom/facebook/common/b/d;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/l;

    .line 171
    invoke-interface {v0, p0}, Lcom/facebook/n/l;->b(Lcom/facebook/n/j;)V

    goto :goto_1

    .line 169
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 174
    :cond_3
    iget-object v0, p0, Lcom/facebook/n/j;->c:Lcom/facebook/ui/b/d;

    iget-object v1, p0, Lcom/facebook/n/j;->d:Lcom/facebook/n/k;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/b/d;->b(Lcom/facebook/ui/b/e;)V

    .line 175
    iget-boolean v0, p0, Lcom/facebook/n/j;->h:Z

    if-nez v0, :cond_4

    .line 176
    iget-object v0, p0, Lcom/facebook/n/j;->c:Lcom/facebook/ui/b/d;

    iget-object v1, p0, Lcom/facebook/n/j;->d:Lcom/facebook/n/k;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/b/d;->a(Lcom/facebook/ui/b/e;)V

    .line 178
    :cond_4
    return-void
.end method
