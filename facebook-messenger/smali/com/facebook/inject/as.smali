.class public Lcom/facebook/inject/as;
.super Lcom/facebook/inject/d;
.source "ReflectionProviderPassThrough.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/inject/d",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljavax/inject/a",
            "<+TT;>;>;"
        }
    .end annotation
.end field

.field private b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljavax/inject/a",
            "<+TT;>;>;)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/inject/as;->a:Ljava/lang/Class;

    .line 41
    invoke-direct {p0}, Lcom/facebook/inject/as;->f()Ljava/lang/reflect/Constructor;

    .line 42
    return-void
.end method

.method private a()Ljavax/inject/a;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 67
    invoke-direct {p0}, Lcom/facebook/inject/as;->f()Ljava/lang/reflect/Constructor;

    move-result-object v6

    .line 68
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v7

    .line 69
    invoke-static {}, Lcom/facebook/common/annotations/a;->a()Lcom/facebook/common/annotations/a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/facebook/common/annotations/a;->a(Ljava/lang/reflect/Constructor;)[[Ljava/lang/annotation/Annotation;

    move-result-object v8

    .line 70
    array-length v0, v7

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v9

    move v1, v2

    .line 72
    :goto_0
    array-length v0, v7

    if-ge v1, v0, :cond_4

    .line 73
    aget-object v0, v7, v1

    .line 74
    aget-object v10, v8, v1

    .line 75
    const/4 v4, 0x0

    .line 76
    array-length v11, v10

    move v5, v2

    :goto_1
    if-ge v5, v11, :cond_2

    aget-object v3, v10, v5

    .line 77
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12}, Lcom/google/inject/a/a;->b(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_0

    .line 78
    if-eqz v4, :cond_1

    .line 79
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Parameter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for ctor of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/inject/as;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " has multiple binding annotations"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move-object v3, v4

    .line 76
    :cond_1
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move-object v4, v3

    goto :goto_1

    .line 87
    :cond_2
    invoke-static {v0}, Lcom/google/inject/f;->a(Ljava/lang/reflect/Type;)Lcom/google/inject/f;

    move-result-object v3

    .line 88
    const-class v5, Ljavax/inject/a;

    invoke-virtual {v3}, Lcom/google/inject/f;->a()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    .line 89
    if-eqz v5, :cond_7

    .line 90
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 91
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    .line 92
    aget-object v0, v0, v2

    .line 93
    invoke-static {v0}, Lcom/google/inject/f;->a(Ljava/lang/reflect/Type;)Lcom/google/inject/f;

    move-result-object v0

    .line 97
    :goto_2
    if-eqz v4, :cond_3

    .line 98
    invoke-static {v0, v4}, Lcom/google/inject/a;->a(Lcom/google/inject/f;Ljava/lang/annotation/Annotation;)Lcom/google/inject/a;

    move-result-object v0

    .line 102
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 100
    :cond_3
    invoke-static {v0}, Lcom/google/inject/a;->a(Lcom/google/inject/f;)Lcom/google/inject/a;

    move-result-object v0

    goto :goto_3

    .line 106
    :cond_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v2

    .line 107
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 108
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lcom/google/inject/a;

    .line 109
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    invoke-virtual {p0, v1}, Lcom/facebook/inject/as;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 113
    :cond_5
    invoke-virtual {p0, v1}, Lcom/facebook/inject/as;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 119
    :cond_6
    :try_start_0
    invoke-interface {v2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/inject/a;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    return-object v0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 122
    :catch_1
    move-exception v0

    .line 123
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 124
    :catch_2
    move-exception v0

    .line 125
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_7
    move-object v0, v3

    goto :goto_2
.end method

.method private f()Ljava/lang/reflect/Constructor;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor",
            "<",
            "Ljavax/inject/a",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/inject/as;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 132
    const/4 v1, 0x0

    .line 133
    array-length v4, v3

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_2

    aget-object v0, v3, v2

    .line 134
    const-class v5, Ljavax/inject/Inject;

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    .line 135
    if-eqz v5, :cond_0

    .line 136
    if-eqz v1, :cond_1

    .line 137
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/inject/as;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " has multiple constructors with @Inject"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move-object v0, v1

    .line 133
    :cond_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_0

    .line 143
    :cond_2
    if-nez v1, :cond_3

    .line 144
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/inject/as;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " does not have a constructor with @Inject"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_3
    return-object v1
.end method


# virtual methods
.method public declared-synchronized b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 46
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v2

    .line 47
    iget-object v0, p0, Lcom/facebook/inject/as;->b:Ljavax/inject/a;

    if-nez v0, :cond_0

    .line 48
    const-class v0, Lcom/facebook/inject/n;

    invoke-virtual {p0, v0}, Lcom/facebook/inject/as;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/n;

    .line 49
    const-class v1, Ljavax/inject/Singleton;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->a(Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 51
    :try_start_1
    invoke-virtual {v0}, Lcom/facebook/inject/n;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    :try_start_2
    invoke-direct {p0}, Lcom/facebook/inject/as;->a()Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/inject/as;->b:Ljavax/inject/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    :try_start_3
    invoke-virtual {v0}, Lcom/facebook/inject/n;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 58
    :try_start_4
    const-class v0, Ljavax/inject/Singleton;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/as;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 55
    :catchall_0
    move-exception v1

    :try_start_5
    invoke-virtual {v0}, Lcom/facebook/inject/n;->b()V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 58
    :catchall_1
    move-exception v0

    :try_start_6
    const-class v1, Ljavax/inject/Singleton;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 46
    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0
.end method
