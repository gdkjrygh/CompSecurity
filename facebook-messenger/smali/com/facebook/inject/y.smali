.class Lcom/facebook/inject/y;
.super Ljava/lang/Object;
.source "FbInjectorInitializer.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/inject/t;

.field private final c:Landroid/content/Context;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/inject/n;

.field private final f:Lcom/facebook/inject/ba;

.field private final g:Z

.field private final h:Ljava/util/Map;
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

.field private final i:Ljava/util/Map;
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

.field private final j:Ljava/util/Map;
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

.field private final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/inject/ag;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;>;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/inject/au;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Lcom/facebook/inject/ah;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Lcom/google/common/a/iw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/iw",
            "<",
            "Lcom/facebook/inject/ag;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;>;"
        }
    .end annotation
.end field

.field private final s:Lcom/google/common/a/iw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/iw",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/inject/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/inject/y;

    sput-object v0, Lcom/facebook/inject/y;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/inject/t;Landroid/content/Context;Ljava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/t;",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;ZZ)V"
        }
    .end annotation

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->h:Ljava/util/Map;

    .line 49
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->i:Ljava/util/Map;

    .line 50
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->j:Ljava/util/Map;

    .line 51
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->k:Ljava/util/Set;

    .line 52
    invoke-static {}, Lcom/google/common/a/ik;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->l:Ljava/util/Map;

    .line 54
    invoke-static {}, Lcom/google/common/a/ik;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->m:Ljava/util/LinkedHashMap;

    .line 56
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->n:Ljava/util/Set;

    .line 57
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->o:Ljava/util/Map;

    .line 58
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->p:Ljava/util/Map;

    .line 59
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->q:Ljava/util/Set;

    .line 60
    invoke-static {}, Lcom/google/common/a/ef;->m()Lcom/google/common/a/ef;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->r:Lcom/google/common/a/iw;

    .line 61
    invoke-static {}, Lcom/google/common/a/ef;->m()Lcom/google/common/a/ef;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/y;->s:Lcom/google/common/a/iw;

    .line 70
    iput-object p1, p0, Lcom/facebook/inject/y;->b:Lcom/facebook/inject/t;

    .line 71
    iput-object p2, p0, Lcom/facebook/inject/y;->c:Landroid/content/Context;

    .line 72
    iput-object p3, p0, Lcom/facebook/inject/y;->d:Ljava/util/List;

    .line 73
    new-instance v0, Lcom/facebook/inject/ba;

    invoke-direct {v0, p4}, Lcom/facebook/inject/ba;-><init>(Z)V

    iput-object v0, p0, Lcom/facebook/inject/y;->f:Lcom/facebook/inject/ba;

    .line 74
    new-instance v0, Lcom/facebook/inject/n;

    invoke-direct {v0, p2}, Lcom/facebook/inject/n;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/inject/y;->e:Lcom/facebook/inject/n;

    .line 75
    iput-boolean p5, p0, Lcom/facebook/inject/y;->g:Z

    .line 76
    return-void
.end method

.method private a(Ljava/lang/Class;)Lcom/facebook/inject/af;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;)",
            "Lcom/facebook/inject/af;"
        }
    .end annotation

    .prologue
    .line 291
    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 292
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 293
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/af;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    return-object v0

    .line 294
    :catch_0
    move-exception v0

    .line 295
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to find public default constructor for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 296
    :catch_1
    move-exception v0

    .line 297
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to invoke constructor for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 298
    :catch_2
    move-exception v0

    .line 299
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to instantiate "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 300
    :catch_3
    move-exception v0

    .line 301
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to access constructor for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static a(Lcom/facebook/inject/ag;Ljava/util/LinkedHashMap;Ljava/lang/Class;)Ljava/lang/IllegalArgumentException;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/ag;",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/af;",
            ">;)",
            "Ljava/lang/IllegalArgumentException;"
        }
    .end annotation

    .prologue
    .line 323
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    const-string v0, "Circular loop in requires while processing "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    const/4 v0, 0x1

    .line 327
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 328
    const-string v4, "   "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    if-eqz v1, :cond_0

    .line 330
    const-string v0, " required\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    const/4 v0, 0x0

    :goto_1
    move v1, v0

    .line 333
    goto :goto_0

    :cond_0
    const-string v0, " which required\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v0, v1

    goto :goto_1

    .line 336
    :cond_1
    const-string v0, "   "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private a(Lcom/facebook/inject/ag;)V
    .locals 8

    .prologue
    .line 200
    new-instance v4, Lcom/facebook/inject/g;

    invoke-direct {v4}, Lcom/facebook/inject/g;-><init>()V

    .line 201
    invoke-interface {p1, v4}, Lcom/facebook/inject/ag;->a(Lcom/facebook/inject/e;)V

    .line 202
    invoke-direct {p0, p1, v4}, Lcom/facebook/inject/y;->a(Lcom/facebook/inject/ag;Lcom/facebook/inject/e;)V

    .line 204
    iget-object v0, p0, Lcom/facebook/inject/y;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 205
    iget-object v0, p0, Lcom/facebook/inject/y;->n:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 207
    invoke-interface {v4}, Lcom/facebook/inject/e;->h()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 208
    iget-object v2, p0, Lcom/facebook/inject/y;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 212
    :cond_0
    invoke-interface {v4}, Lcom/facebook/inject/e;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 213
    iget-object v2, p0, Lcom/facebook/inject/y;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 215
    iget-object v1, p0, Lcom/facebook/inject/y;->m:Ljava/util/LinkedHashMap;

    invoke-static {p1, v1, v0}, Lcom/facebook/inject/y;->a(Lcom/facebook/inject/ag;Ljava/util/LinkedHashMap;Ljava/lang/Class;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 218
    :cond_2
    iget-object v2, p0, Lcom/facebook/inject/y;->l:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 219
    invoke-direct {p0, v0}, Lcom/facebook/inject/y;->a(Ljava/lang/Class;)Lcom/facebook/inject/af;

    move-result-object v2

    .line 220
    iget-object v3, p0, Lcom/facebook/inject/y;->l:Ljava/util/Map;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    iget-object v3, p0, Lcom/facebook/inject/y;->m:Ljava/util/LinkedHashMap;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v0, v5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    invoke-direct {p0, v2}, Lcom/facebook/inject/y;->a(Lcom/facebook/inject/ag;)V

    .line 223
    iget-object v2, p0, Lcom/facebook/inject/y;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 228
    :cond_3
    invoke-interface {v4}, Lcom/facebook/inject/e;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/ag;

    .line 229
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Module "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v3

    .line 230
    instance-of v1, v0, Lcom/facebook/inject/af;

    if-nez v1, :cond_4

    const/4 v1, 0x1

    :goto_3
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 231
    invoke-direct {p0, v0}, Lcom/facebook/inject/y;->a(Lcom/facebook/inject/ag;)V

    .line 232
    invoke-virtual {v3}, Lcom/facebook/debug/d/e;->a()J

    goto :goto_2

    .line 230
    :cond_4
    const/4 v1, 0x0

    goto :goto_3

    .line 235
    :cond_5
    iget-object v0, p0, Lcom/facebook/inject/y;->b:Lcom/facebook/inject/t;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->f(Ljava/lang/Class;)Lcom/facebook/inject/ab;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/t;

    .line 236
    invoke-interface {v4}, Lcom/facebook/inject/e;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/inject/h;

    .line 237
    invoke-virtual {v1}, Lcom/facebook/inject/h;->a()Lcom/google/inject/a;

    move-result-object v6

    .line 238
    invoke-virtual {v1}, Lcom/facebook/inject/h;->b()Ljavax/inject/a;

    move-result-object v3

    .line 239
    instance-of v2, v3, Lcom/facebook/inject/ak;

    if-eqz v2, :cond_7

    move-object v2, v3

    .line 240
    check-cast v2, Lcom/facebook/inject/ak;

    invoke-interface {v2, v0}, Lcom/facebook/inject/ak;->a(Lcom/facebook/inject/t;)V

    .line 242
    :cond_7
    invoke-virtual {v1}, Lcom/facebook/inject/h;->c()Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 243
    invoke-virtual {v1}, Lcom/facebook/inject/h;->c()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/inject/y;->b(Ljava/lang/Class;)Lcom/facebook/inject/au;

    move-result-object v2

    invoke-interface {v2, v6, v3}, Lcom/facebook/inject/au;->a(Lcom/google/inject/a;Ljavax/inject/a;)Ljavax/inject/a;

    move-result-object v3

    .line 244
    instance-of v2, v3, Lcom/facebook/inject/ak;

    if-eqz v2, :cond_8

    move-object v2, v3

    .line 245
    check-cast v2, Lcom/facebook/inject/ak;

    invoke-interface {v2, v0}, Lcom/facebook/inject/ak;->a(Lcom/facebook/inject/t;)V

    .line 251
    :cond_8
    iget-boolean v2, p0, Lcom/facebook/inject/y;->g:Z

    if-eqz v2, :cond_9

    new-instance v2, Lcom/facebook/inject/ap;

    invoke-direct {v2, v6, v3}, Lcom/facebook/inject/ap;-><init>(Lcom/google/inject/a;Ljavax/inject/a;)V

    move-object v3, v2

    .line 255
    :cond_9
    invoke-virtual {v1}, Lcom/facebook/inject/h;->e()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 256
    iget-object v2, p0, Lcom/facebook/inject/y;->i:Ljava/util/Map;

    invoke-interface {v2, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    :goto_5
    invoke-virtual {v1}, Lcom/facebook/inject/h;->d()Lcom/facebook/inject/f;

    move-result-object v2

    sget-object v3, Lcom/facebook/inject/f;->NONE:Lcom/facebook/inject/f;

    if-eq v2, v3, :cond_6

    .line 261
    invoke-virtual {v1}, Lcom/facebook/inject/h;->c()Ljava/lang/Class;

    move-result-object v2

    if-nez v2, :cond_b

    .line 262
    new-instance v0, Lcom/facebook/inject/aq;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EagerInitFlag specified with no scope for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 258
    :cond_a
    iget-object v2, p0, Lcom/facebook/inject/y;->j:Ljava/util/Map;

    invoke-interface {v2, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 264
    :cond_b
    iget-object v2, p0, Lcom/facebook/inject/y;->s:Lcom/google/common/a/iw;

    invoke-virtual {v1}, Lcom/facebook/inject/h;->c()Ljava/lang/Class;

    move-result-object v3

    new-instance v7, Lcom/facebook/inject/s;

    invoke-virtual {v1}, Lcom/facebook/inject/h;->d()Lcom/facebook/inject/f;

    move-result-object v1

    invoke-direct {v7, v6, v1}, Lcom/facebook/inject/s;-><init>(Lcom/google/inject/a;Lcom/facebook/inject/f;)V

    invoke-interface {v2, v3, v7}, Lcom/google/common/a/iw;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 268
    :cond_c
    invoke-interface {v4}, Lcom/facebook/inject/e;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 269
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/a;

    .line 270
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/aj;

    .line 271
    iget-object v2, p0, Lcom/facebook/inject/y;->p:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/inject/ah;

    .line 272
    if-nez v2, :cond_e

    .line 273
    new-instance v2, Lcom/facebook/inject/ah;

    iget-object v5, p0, Lcom/facebook/inject/y;->b:Lcom/facebook/inject/t;

    invoke-direct {v2, v5, v1}, Lcom/facebook/inject/ah;-><init>(Lcom/facebook/inject/t;Lcom/google/inject/a;)V

    .line 274
    iget-object v5, p0, Lcom/facebook/inject/y;->p:Ljava/util/Map;

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    :cond_e
    invoke-virtual {v0}, Lcom/facebook/inject/aj;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/a;

    .line 277
    invoke-virtual {v2, v0}, Lcom/facebook/inject/ah;->a(Lcom/google/inject/a;)V

    goto :goto_6

    .line 281
    :cond_f
    iget-object v0, p0, Lcom/facebook/inject/y;->q:Ljava/util/Set;

    invoke-interface {v4}, Lcom/facebook/inject/e;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 282
    iget-object v0, p0, Lcom/facebook/inject/y;->r:Lcom/google/common/a/iw;

    invoke-interface {v4}, Lcom/facebook/inject/e;->d()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/google/common/a/iw;->c(Ljava/lang/Object;Ljava/lang/Iterable;)Z

    .line 283
    return-void
.end method

.method private a(Lcom/facebook/inject/ag;Lcom/facebook/inject/e;)V
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Lcom/facebook/inject/y;->h:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    return-void
.end method

.method private b(Ljava/lang/Class;)Lcom/facebook/inject/au;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/facebook/inject/au;"
        }
    .end annotation

    .prologue
    .line 312
    iget-object v0, p0, Lcom/facebook/inject/y;->o:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/au;

    .line 313
    if-nez v0, :cond_0

    .line 314
    new-instance v0, Lcom/facebook/inject/aq;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No scope registered for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 316
    :cond_0
    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 306
    iget-object v0, p0, Lcom/facebook/inject/y;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/ah;

    .line 307
    iget-object v2, p0, Lcom/facebook/inject/y;->j:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/inject/ah;->b()Lcom/google/inject/a;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/inject/ah;->a()Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 309
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/inject/z;
    .locals 6

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/inject/y;->o:Ljava/util/Map;

    const-class v1, Ljavax/inject/Singleton;

    iget-object v2, p0, Lcom/facebook/inject/y;->f:Lcom/facebook/inject/ba;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    iget-object v0, p0, Lcom/facebook/inject/y;->o:Ljava/util/Map;

    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-static {}, Lcom/facebook/inject/bh;->get()Lcom/facebook/inject/bh;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    const-string v0, "FbInjectorImpl.init#modules"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 125
    new-instance v0, Lcom/facebook/inject/i;

    iget-object v2, p0, Lcom/facebook/inject/y;->e:Lcom/facebook/inject/n;

    iget-object v3, p0, Lcom/facebook/inject/y;->c:Landroid/content/Context;

    invoke-direct {v0, v2, v3}, Lcom/facebook/inject/i;-><init>(Lcom/facebook/inject/n;Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/facebook/inject/y;->a(Lcom/facebook/inject/ag;)V

    .line 126
    iget-object v0, p0, Lcom/facebook/inject/y;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/ag;

    .line 127
    invoke-direct {p0, v0}, Lcom/facebook/inject/y;->a(Lcom/facebook/inject/ag;)V

    goto :goto_0

    .line 129
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 132
    invoke-direct {p0}, Lcom/facebook/inject/y;->c()V

    .line 134
    iget-object v0, p0, Lcom/facebook/inject/y;->q:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/a;

    .line 135
    iget-object v2, p0, Lcom/facebook/inject/y;->j:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/facebook/inject/y;->i:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 137
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No binding for required key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 140
    :cond_2
    iget-object v0, p0, Lcom/facebook/inject/y;->q:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 142
    iget-object v0, p0, Lcom/facebook/inject/y;->r:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/google/common/a/iw;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 143
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/inject/ag;

    .line 144
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 145
    iget-object v3, p0, Lcom/facebook/inject/y;->n:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 146
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Module "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " is required by "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " but was not installed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 150
    :cond_4
    iget-object v0, p0, Lcom/facebook/inject/y;->r:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/google/common/a/iw;->f()V

    .line 151
    new-instance v0, Lcom/facebook/inject/z;

    iget-object v1, p0, Lcom/facebook/inject/y;->h:Ljava/util/Map;

    iget-object v2, p0, Lcom/facebook/inject/y;->f:Lcom/facebook/inject/ba;

    iget-object v3, p0, Lcom/facebook/inject/y;->e:Lcom/facebook/inject/n;

    iget-object v4, p0, Lcom/facebook/inject/y;->i:Ljava/util/Map;

    iget-object v5, p0, Lcom/facebook/inject/y;->j:Ljava/util/Map;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/inject/z;-><init>(Ljava/util/Map;Lcom/facebook/inject/ba;Lcom/facebook/inject/n;Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method public b()V
    .locals 7

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/inject/y;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/au;

    .line 164
    instance-of v2, v0, Lcom/facebook/inject/ay;

    if-eqz v2, :cond_0

    .line 165
    check-cast v0, Lcom/facebook/inject/ay;

    iget-object v2, p0, Lcom/facebook/inject/y;->b:Lcom/facebook/inject/t;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ay;->a(Lcom/facebook/inject/t;)V

    goto :goto_0

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/facebook/inject/y;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/ag;

    .line 171
    iget-object v1, p0, Lcom/facebook/inject/y;->b:Lcom/facebook/inject/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/facebook/inject/t;->f(Ljava/lang/Class;)Lcom/facebook/inject/ab;

    move-result-object v1

    check-cast v1, Lcom/facebook/inject/t;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ag;->a(Lcom/facebook/inject/t;)V

    goto :goto_1

    .line 173
    :cond_2
    iget-object v0, p0, Lcom/facebook/inject/y;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 176
    iget-object v0, p0, Lcom/facebook/inject/y;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/au;

    .line 177
    instance-of v2, v0, Lcom/facebook/inject/ax;

    if-eqz v2, :cond_3

    .line 178
    iget-object v2, p0, Lcom/facebook/inject/y;->s:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/facebook/inject/au;->annotationType()Ljava/lang/Class;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/common/a/iw;->d(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    .line 180
    check-cast v0, Lcom/facebook/inject/ax;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ax;->a(Ljava/util/List;)V

    goto :goto_2

    .line 185
    :cond_4
    iget-object v0, p0, Lcom/facebook/inject/y;->s:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/google/common/a/iw;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 186
    iget-object v0, p0, Lcom/facebook/inject/y;->s:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/google/common/a/iw;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 187
    sget-object v2, Lcom/facebook/inject/y;->a:Ljava/lang/Class;

    const-string v3, "Scope %s does not support eager scoping for key %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 190
    :cond_5
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Illegal scoping. See earlier warnings"

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 192
    :cond_6
    return-void
.end method
