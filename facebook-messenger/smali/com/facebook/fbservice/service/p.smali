.class public Lcom/facebook/fbservice/service/p;
.super Ljava/lang/Object;
.source "BlueServiceRegistry.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/common/process/c;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/fbservice/service/OperationType;",
            "Lcom/facebook/fbservice/service/r;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/fbservice/service/a;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/fbservice/service/a;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/facebook/fbservice/service/p;

    sput-object v0, Lcom/facebook/fbservice/service/p;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/process/c;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/facebook/fbservice/service/p;->b:Landroid/content/Context;

    .line 54
    iput-object p2, p0, Lcom/facebook/fbservice/service/p;->c:Lcom/facebook/common/process/c;

    .line 55
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/p;->d:Ljava/util/Map;

    .line 56
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/p;->e:Ljava/util/concurrent/ConcurrentMap;

    .line 57
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/p;->f:Ljava/util/concurrent/ConcurrentMap;

    .line 58
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/p;->g:Ljava/util/concurrent/ConcurrentMap;

    .line 59
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/common/process/c;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/process/c;",
            ")",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/fbservice/service/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 227
    invoke-virtual {p1}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v0

    .line 228
    if-nez v0, :cond_1

    .line 230
    const-class v0, Lcom/facebook/fbservice/service/DefaultBlueService;

    .line 238
    :cond_0
    :goto_0
    return-object v0

    .line 232
    :cond_1
    iget-object v1, p0, Lcom/facebook/fbservice/service/p;->g:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 233
    if-nez v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v0}, Lcom/facebook/common/process/c;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v0}, Lcom/facebook/common/process/c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 236
    :cond_2
    const-class v0, Lcom/facebook/fbservice/service/DefaultBlueService;

    goto :goto_0

    .line 238
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            ")",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationType;->c()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/r;

    .line 97
    if-nez v0, :cond_0

    .line 98
    const/4 v0, 0x0

    .line 104
    :goto_0
    return-object v0

    .line 100
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationType;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 101
    iget-object v1, v0, Lcom/facebook/fbservice/service/r;->b:Ljava/lang/Class;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 102
    iget-object v0, v0, Lcom/facebook/fbservice/service/r;->b:Ljava/lang/Class;

    goto :goto_0

    .line 101
    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    .line 104
    :cond_2
    iget-object v0, v0, Lcom/facebook/fbservice/service/r;->a:Ljava/lang/Class;

    goto :goto_0
.end method

.method public a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/fbservice/service/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 174
    const-class v1, Lcom/facebook/fbservice/service/LocalQueueSet;

    if-ne v0, v1, :cond_0

    .line 175
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->c:Lcom/facebook/common/process/c;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/common/process/c;)Ljava/lang/Class;

    move-result-object v0

    .line 176
    if-nez v0, :cond_1

    .line 177
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No service registered for process "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/fbservice/service/p;->c:Lcom/facebook/common/process/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 180
    :cond_0
    if-eqz v0, :cond_2

    .line 181
    iget-object v1, p0, Lcom/facebook/fbservice/service/p;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 182
    if-eqz v0, :cond_2

    .line 186
    :cond_1
    :goto_0
    return-object v0

    :cond_2
    const-class v0, Lcom/facebook/fbservice/service/DefaultBlueService;

    goto :goto_0
.end method

.method public a(Lcom/facebook/common/process/c;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/process/c;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/fbservice/service/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 198
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->g:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 202
    if-eqz v0, :cond_0

    .line 203
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " multiple times"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationType;->c()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    new-instance v2, Lcom/facebook/fbservice/service/r;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v3}, Lcom/facebook/fbservice/service/r;-><init>(Ljava/lang/Class;Lcom/facebook/fbservice/service/q;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationType;->c()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    new-instance v2, Lcom/facebook/fbservice/service/r;

    const/4 v3, 0x0

    invoke-direct {v2, p2, p3, v3}, Lcom/facebook/fbservice/service/r;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/facebook/fbservice/service/q;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    return-void
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 126
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 129
    if-eqz v0, :cond_0

    .line 130
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " multiple times"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            ")",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 108
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v0

    .line 109
    if-nez v0, :cond_0

    .line 110
    const/4 v0, 0x0

    .line 113
    :goto_0
    return-object v0

    .line 112
    :cond_0
    iget-object v1, p0, Lcom/facebook/fbservice/service/p;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    goto :goto_0
.end method

.method public b(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/fbservice/service/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 143
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    iget-object v0, p0, Lcom/facebook/fbservice/service/p;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 146
    if-eqz v0, :cond_0

    .line 147
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " multiple times"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 149
    :cond_0
    return-void
.end method

.method public c(Lcom/facebook/fbservice/service/OperationType;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 158
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v0

    .line 159
    if-nez v0, :cond_0

    .line 160
    const/4 v0, 0x0

    .line 163
    :goto_0
    return-object v0

    .line 162
    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 163
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/fbservice/service/p;->b:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0
.end method

.method public d(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            ")",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/fbservice/service/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 214
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v0

    .line 215
    if-nez v0, :cond_0

    .line 216
    const/4 v0, 0x0

    .line 218
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_0
.end method
