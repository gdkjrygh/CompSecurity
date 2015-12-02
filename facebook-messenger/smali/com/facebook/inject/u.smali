.class public Lcom/facebook/inject/u;
.super Lcom/facebook/inject/a;
.source "FbInjectorImpl.java"

# interfaces
.implements Lcom/facebook/inject/bd;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
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
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljavax/inject/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljavax/inject/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljavax/inject/a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/inject/x;

.field private final f:Lcom/facebook/inject/l;

.field private final g:Lcom/facebook/inject/ba;

.field private final h:Z

.field private i:Z

.field private final j:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/t;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    .line 53
    invoke-direct {p0}, Lcom/facebook/inject/a;-><init>()V

    .line 38
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/u;->d:Ljava/util/Map;

    .line 46
    new-instance v0, Lcom/facebook/inject/v;

    invoke-direct {v0, p0}, Lcom/facebook/inject/v;-><init>(Lcom/facebook/inject/u;)V

    iput-object v0, p0, Lcom/facebook/inject/u;->j:Ljava/lang/ThreadLocal;

    .line 54
    const-string v0, "FbInjectorImpl.init"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v7

    .line 57
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/inject/u;->h:Z

    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-ne p1, v0, :cond_0

    move v0, v6

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 60
    new-instance v0, Lcom/facebook/inject/x;

    invoke-direct {v0, p0}, Lcom/facebook/inject/x;-><init>(Lcom/facebook/inject/u;)V

    iput-object v0, p0, Lcom/facebook/inject/u;->e:Lcom/facebook/inject/x;

    .line 62
    new-instance v0, Lcom/facebook/inject/y;

    iget-boolean v5, p0, Lcom/facebook/inject/u;->h:Z

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/inject/y;-><init>(Lcom/facebook/inject/t;Landroid/content/Context;Ljava/util/List;ZZ)V

    .line 70
    invoke-virtual {v0}, Lcom/facebook/inject/y;->a()Lcom/facebook/inject/z;

    move-result-object v1

    .line 71
    iget-object v2, v1, Lcom/facebook/inject/z;->a:Ljava/util/Map;

    iput-object v2, p0, Lcom/facebook/inject/u;->a:Ljava/util/Map;

    .line 72
    iget-object v2, v1, Lcom/facebook/inject/z;->e:Ljava/util/Map;

    iput-object v2, p0, Lcom/facebook/inject/u;->b:Ljava/util/Map;

    .line 73
    iget-object v2, v1, Lcom/facebook/inject/z;->d:Ljava/util/Map;

    iput-object v2, p0, Lcom/facebook/inject/u;->c:Ljava/util/Map;

    .line 74
    iget-object v2, v1, Lcom/facebook/inject/z;->b:Lcom/facebook/inject/ba;

    iput-object v2, p0, Lcom/facebook/inject/u;->g:Lcom/facebook/inject/ba;

    .line 75
    new-instance v2, Lcom/facebook/inject/l;

    iget-object v1, v1, Lcom/facebook/inject/z;->c:Lcom/facebook/inject/n;

    invoke-direct {v2, p0, v1, p1}, Lcom/facebook/inject/l;-><init>(Lcom/facebook/inject/ab;Lcom/facebook/inject/n;Landroid/content/Context;)V

    iput-object v2, p0, Lcom/facebook/inject/u;->f:Lcom/facebook/inject/l;

    .line 76
    iput-boolean v6, p0, Lcom/facebook/inject/u;->i:Z

    .line 77
    invoke-virtual {v0}, Lcom/facebook/inject/y;->b()V

    .line 78
    invoke-virtual {v7}, Lcom/facebook/debug/d/e;->a()J

    .line 79
    return-void

    .line 59
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/inject/u;)Lcom/facebook/inject/ba;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/inject/u;->g:Lcom/facebook/inject/ba;

    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 160
    iget-boolean v0, p0, Lcom/facebook/inject/u;->i:Z

    if-nez v0, :cond_0

    .line 161
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Called injector during binding"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_0
    return-void
.end method

.method private e(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 6
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
    const/4 v1, 0x0

    .line 166
    invoke-virtual {p1}, Lcom/google/inject/a;->c()Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/inject/a;->b()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v0, v1

    .line 199
    :goto_0
    return-object v0

    .line 169
    :cond_1
    invoke-virtual {p1}, Lcom/google/inject/a;->a()Lcom/google/inject/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/f;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 170
    instance-of v2, v0, Ljava/lang/reflect/GenericArrayType;

    if-nez v2, :cond_2

    instance-of v2, v0, Ljava/lang/reflect/ParameterizedType;

    if-nez v2, :cond_2

    instance-of v2, v0, Ljava/lang/reflect/WildcardType;

    if-nez v2, :cond_2

    instance-of v0, v0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_3

    :cond_2
    move-object v0, v1

    .line 174
    goto :goto_0

    .line 177
    :cond_3
    invoke-virtual {p1}, Lcom/google/inject/a;->a()Lcom/google/inject/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/f;->a()Ljava/lang/Class;

    move-result-object v0

    .line 179
    const/4 v2, 0x0

    :try_start_0
    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    .line 180
    if-eqz v2, :cond_4

    .line 181
    const-string v3, "OrcaInjector"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Created just-in-time provider for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    new-instance v0, Lcom/facebook/inject/w;

    invoke-direct {v0, p0, v2}, Lcom/facebook/inject/w;-><init>(Lcom/facebook/inject/u;Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 198
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 199
    goto :goto_0

    :cond_4
    move-object v0, v1

    .line 197
    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/inject/u;->j:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 139
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 140
    return-void
.end method

.method public a(Lcom/facebook/inject/t;)V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/inject/u;->j:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    return-void
.end method

.method public b()Lcom/facebook/inject/x;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/inject/u;->e:Lcom/facebook/inject/x;

    return-object v0
.end method

.method public b(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 3
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
    .line 92
    invoke-direct {p0}, Lcom/facebook/inject/u;->c()V

    .line 94
    iget-boolean v0, p0, Lcom/facebook/inject/u;->h:Z

    if-eqz v0, :cond_0

    .line 95
    sget-object v0, Lcom/facebook/inject/ao;->PROVIDER_GET:Lcom/facebook/inject/ao;

    invoke-static {v0, p1}, Lcom/facebook/inject/al;->a(Lcom/facebook/inject/ao;Lcom/google/inject/a;)V

    .line 98
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/inject/u;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/inject/a;

    .line 99
    if-nez v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/facebook/inject/u;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/inject/a;

    .line 101
    if-nez v0, :cond_1

    .line 102
    iget-object v0, p0, Lcom/facebook/inject/u;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/inject/a;

    .line 103
    if-nez v0, :cond_1

    .line 104
    invoke-direct {p0, p1}, Lcom/facebook/inject/u;->e(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_1

    .line 106
    iget-object v1, p0, Lcom/facebook/inject/u;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    :cond_1
    if-nez v0, :cond_3

    .line 112
    new-instance v0, Lcom/facebook/inject/aq;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No provider bound for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :catchall_0
    move-exception v0

    iget-boolean v1, p0, Lcom/facebook/inject/u;->h:Z

    if-eqz v1, :cond_2

    .line 117
    invoke-static {}, Lcom/facebook/inject/al;->a()V

    :cond_2
    throw v0

    .line 116
    :cond_3
    iget-boolean v1, p0, Lcom/facebook/inject/u;->h:Z

    if-eqz v1, :cond_4

    .line 117
    invoke-static {}, Lcom/facebook/inject/al;->a()V

    :cond_4
    return-object v0
.end method

.method public c(Lcom/google/inject/a;)Ljavax/inject/a;
    .locals 2
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
    .line 144
    invoke-direct {p0}, Lcom/facebook/inject/u;->c()V

    .line 146
    iget-object v0, p0, Lcom/facebook/inject/u;->j:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 147
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 148
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/t;

    .line 149
    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->c(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    .line 151
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/inject/u;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    goto :goto_0
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
    .line 128
    iget-object v0, p0, Lcom/facebook/inject/u;->a:Ljava/util/Map;

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
    .line 123
    iget-object v0, p0, Lcom/facebook/inject/u;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/inject/u;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Lcom/facebook/inject/ab;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/inject/u;->f:Lcom/facebook/inject/l;

    return-object v0
.end method

.method public synthetic f(Ljava/lang/Class;)Lcom/facebook/inject/ab;
    .locals 1

    .prologue
    .line 32
    invoke-virtual {p0, p1}, Lcom/facebook/inject/u;->g(Ljava/lang/Class;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Class;)Lcom/facebook/inject/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)",
            "Lcom/facebook/inject/t;"
        }
    .end annotation

    .prologue
    .line 83
    iget-boolean v0, p0, Lcom/facebook/inject/u;->h:Z

    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Lcom/facebook/inject/bb;

    invoke-direct {v0, p0, p1}, Lcom/facebook/inject/bb;-><init>(Lcom/facebook/inject/t;Ljava/lang/Class;)V

    move-object p0, v0

    .line 86
    :cond_0
    return-object p0
.end method
