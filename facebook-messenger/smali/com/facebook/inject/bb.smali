.class public Lcom/facebook/inject/bb;
.super Lcom/facebook/inject/a;
.source "StrictInjector.java"

# interfaces
.implements Lcom/facebook/inject/bd;


# static fields
.field private static a:Z


# instance fields
.field private final b:Lcom/facebook/inject/ab;

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/google/inject/a",
            "<*>;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;

.field private f:Lcom/facebook/inject/ab;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mSync"
    .end annotation
.end field

.field private g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a",
            "<*>;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mSync"
    .end annotation
.end field

.field private h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/inject/bc;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mSync"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/inject/bb;->a:Z

    return-void
.end method

.method private constructor <init>(Lcom/facebook/inject/ab;Ljava/lang/Class;Ljava/util/Set;Ljava/util/concurrent/ConcurrentMap;)V
    .locals 1
    .param p3    # Ljava/util/Set;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/ConcurrentMap;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/ab;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a",
            "<*>;>;",
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/google/inject/a",
            "<*>;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 108
    invoke-direct {p0}, Lcom/facebook/inject/a;-><init>()V

    .line 109
    iput-object p1, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    .line 110
    iput-object p2, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    .line 111
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/inject/bb;->e:Ljava/lang/Object;

    .line 112
    iput-object p3, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    .line 114
    if-nez p4, :cond_0

    .line 115
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/bb;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 119
    :goto_0
    return-void

    .line 117
    :cond_0
    iput-object p4, p0, Lcom/facebook/inject/bb;->d:Ljava/util/concurrent/ConcurrentMap;

    goto :goto_0
.end method

.method public constructor <init>(Lcom/facebook/inject/t;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/t;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 123
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/facebook/inject/bb;-><init>(Lcom/facebook/inject/ab;Ljava/lang/Class;Ljava/util/Set;Ljava/util/concurrent/ConcurrentMap;)V

    .line 124
    return-void
.end method

.method private c()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/inject/bc;",
            ">;"
        }
    .end annotation

    .prologue
    .line 131
    iget-object v1, p0, Lcom/facebook/inject/bb;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 132
    :try_start_0
    iget-object v0, p0, Lcom/facebook/inject/bb;->h:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/facebook/inject/bb;->h:Ljava/util/Set;

    monitor-exit v1

    .line 142
    :goto_0
    return-object v0

    .line 136
    :cond_0
    const-class v0, Lcom/facebook/inject/bc;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/inject/t;->f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    .line 137
    iget-object v2, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    invoke-interface {v2, v0}, Lcom/facebook/inject/ab;->d(Lcom/google/inject/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    const-class v2, Lcom/facebook/inject/bc;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/bb;->h:Ljava/util/Set;

    .line 142
    :goto_1
    iget-object v0, p0, Lcom/facebook/inject/bb;->h:Ljava/util/Set;

    monitor-exit v1

    goto :goto_0

    .line 143
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 140
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/bb;->h:Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method private e(Lcom/google/inject/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 229
    invoke-direct {p0}, Lcom/facebook/inject/bb;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    sget-boolean v0, Lcom/facebook/inject/bb;->a:Z

    if-eqz v0, :cond_2

    .line 231
    iget-object v0, p0, Lcom/facebook/inject/bb;->d:Ljava/util/concurrent/ConcurrentMap;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 254
    :cond_0
    :goto_0
    return-void

    .line 236
    :cond_1
    iget-object v0, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    const-class v1, Lcom/facebook/inject/bi;

    if-eq v0, v1, :cond_0

    .line 242
    :cond_2
    const/4 v0, 0x0

    .line 243
    invoke-direct {p0}, Lcom/facebook/inject/bb;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/bc;

    .line 244
    iget-object v2, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    invoke-interface {v0, v2, p1}, Lcom/facebook/inject/bc;->a(Ljava/lang/Class;Lcom/google/inject/a;)V

    .line 245
    const/4 v0, 0x1

    goto :goto_1

    .line 248
    :cond_3
    if-nez v0, :cond_0

    .line 250
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Module "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " used undeclared binding "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private f()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 151
    iget-object v2, p0, Lcom/facebook/inject/bb;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 152
    :try_start_0
    iget-object v0, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    monitor-exit v2

    .line 180
    :goto_0
    return-object v0

    .line 156
    :cond_0
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v3

    .line 158
    iget-object v0, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    const-class v1, Lcom/facebook/inject/bi;

    if-ne v0, v1, :cond_1

    .line 162
    invoke-virtual {v3}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    .line 163
    iget-object v0, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    monitor-exit v2

    goto :goto_0

    .line 181
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 166
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/inject/bb;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/e;

    .line 167
    invoke-interface {v0}, Lcom/facebook/inject/e;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/a;

    .line 168
    invoke-virtual {v3, v1}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_1

    .line 170
    :cond_3
    invoke-interface {v0}, Lcom/facebook/inject/e;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/inject/h;

    .line 171
    invoke-virtual {v1}, Lcom/facebook/inject/h;->a()Lcom/google/inject/a;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_2

    .line 173
    :cond_4
    invoke-interface {v0}, Lcom/facebook/inject/e;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/a;

    .line 174
    invoke-virtual {v0}, Lcom/google/inject/a;->a()Lcom/google/inject/f;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/inject/f;->a()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/inject/a;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/facebook/inject/bb;->f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    .line 176
    invoke-virtual {v3, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_3

    .line 179
    :cond_5
    invoke-virtual {v3}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    .line 180
    iget-object v0, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0
.end method

.method private g()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/inject/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 188
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 189
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v3

    .line 191
    invoke-virtual {p0}, Lcom/facebook/inject/bb;->d()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/e;

    .line 192
    if-nez v0, :cond_0

    move-object v0, v2

    .line 225
    :goto_0
    return-object v0

    .line 196
    :cond_0
    iget-object v1, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    invoke-interface {v3, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 199
    invoke-interface {v0}, Lcom/facebook/inject/e;->g()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Queue;->addAll(Ljava/util/Collection;)Z

    .line 202
    :cond_1
    invoke-interface {v3}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_4

    .line 203
    invoke-virtual {p0}, Lcom/facebook/inject/bb;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/e;

    .line 204
    if-nez v0, :cond_2

    .line 205
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Module was not installed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_2
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 212
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 214
    invoke-interface {v0}, Lcom/facebook/inject/e;->g()Ljava/util/Map;

    move-result-object v4

    .line 215
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 216
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/inject/q;

    invoke-interface {v1}, Lcom/facebook/inject/q;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 217
    invoke-interface {v3, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 223
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/inject/bb;->d()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/facebook/inject/i;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v0, v2

    .line 225
    goto :goto_0
.end method

.method private h()Lcom/facebook/inject/bd;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 306
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    instance-of v0, v0, Lcom/facebook/inject/bd;

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    check-cast v0, Lcom/facebook/inject/bd;

    .line 309
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 322
    invoke-direct {p0}, Lcom/facebook/inject/bb;->h()Lcom/facebook/inject/bd;

    move-result-object v0

    .line 323
    if-eqz v0, :cond_0

    .line 324
    invoke-interface {v0}, Lcom/facebook/inject/bd;->a()V

    .line 326
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 1

    .prologue
    .line 314
    invoke-direct {p0}, Lcom/facebook/inject/bb;->h()Lcom/facebook/inject/bd;

    move-result-object v0

    .line 315
    if-eqz v0, :cond_0

    .line 316
    invoke-interface {v0, p1}, Lcom/facebook/inject/bd;->a(Lcom/facebook/inject/t;)V

    .line 318
    :cond_0
    return-void
.end method

.method public b()Lcom/facebook/inject/ab;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    return-object v0
.end method

.method public b(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 263
    invoke-direct {p0, p1}, Lcom/facebook/inject/bb;->e(Lcom/google/inject/a;)V

    .line 264
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    invoke-interface {v0, p1}, Lcom/facebook/inject/ab;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/a",
            "<TT;>;)",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 269
    invoke-direct {p0, p1}, Lcom/facebook/inject/bb;->e(Lcom/google/inject/a;)V

    .line 270
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    invoke-interface {v0, p1}, Lcom/facebook/inject/ab;->c(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 280
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    invoke-interface {v0}, Lcom/facebook/inject/ab;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/inject/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 275
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    invoke-interface {v0, p1}, Lcom/facebook/inject/ab;->d(Lcom/google/inject/a;)Z

    move-result v0

    return v0
.end method

.method public e()Lcom/facebook/inject/ab;
    .locals 6

    .prologue
    .line 285
    iget-object v1, p0, Lcom/facebook/inject/bb;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 286
    :try_start_0
    iget-object v0, p0, Lcom/facebook/inject/bb;->f:Lcom/facebook/inject/ab;

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Lcom/facebook/inject/bb;->f:Lcom/facebook/inject/ab;

    monitor-exit v1

    .line 300
    :goto_0
    return-object v0

    .line 289
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    invoke-interface {v0}, Lcom/facebook/inject/ab;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    .line 290
    iget-object v2, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    if-ne v0, v2, :cond_1

    .line 291
    iput-object p0, p0, Lcom/facebook/inject/bb;->f:Lcom/facebook/inject/ab;

    .line 300
    :goto_1
    iget-object v0, p0, Lcom/facebook/inject/bb;->f:Lcom/facebook/inject/ab;

    monitor-exit v1

    goto :goto_0

    .line 301
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 294
    :cond_1
    :try_start_1
    new-instance v2, Lcom/facebook/inject/bb;

    iget-object v3, p0, Lcom/facebook/inject/bb;->c:Ljava/lang/Class;

    iget-object v4, p0, Lcom/facebook/inject/bb;->g:Ljava/util/Set;

    iget-object v5, p0, Lcom/facebook/inject/bb;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-direct {v2, v0, v3, v4, v5}, Lcom/facebook/inject/bb;-><init>(Lcom/facebook/inject/ab;Ljava/lang/Class;Ljava/util/Set;Ljava/util/concurrent/ConcurrentMap;)V

    iput-object v2, p0, Lcom/facebook/inject/bb;->f:Lcom/facebook/inject/ab;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method public f(Ljava/lang/Class;)Lcom/facebook/inject/ab;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)",
            "Lcom/facebook/inject/ab;"
        }
    .end annotation

    .prologue
    .line 258
    iget-object v0, p0, Lcom/facebook/inject/bb;->b:Lcom/facebook/inject/ab;

    invoke-interface {v0, p1}, Lcom/facebook/inject/ab;->f(Ljava/lang/Class;)Lcom/facebook/inject/ab;

    move-result-object v0

    return-object v0
.end method
