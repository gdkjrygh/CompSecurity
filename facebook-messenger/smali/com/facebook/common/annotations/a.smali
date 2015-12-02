.class public Lcom/facebook/common/annotations/a;
.super Ljava/lang/Object;
.source "AnnotationCache.java"


# static fields
.field private static final a:Lcom/facebook/common/annotations/a;


# instance fields
.field private final b:Lcom/google/common/a/lx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/lx",
            "<",
            "Ljava/lang/reflect/AnnotatedElement;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/AnnotatedElement;",
            "[[",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    new-instance v0, Lcom/facebook/common/annotations/a;

    invoke-direct {v0}, Lcom/facebook/common/annotations/a;-><init>()V

    sput-object v0, Lcom/facebook/common/annotations/a;->a:Lcom/facebook/common/annotations/a;

    return-void
.end method

.method constructor <init>()V
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-static {}, Lcom/google/common/a/ec;->a()Lcom/google/common/a/ec;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/annotations/a;->b:Lcom/google/common/a/lx;

    .line 44
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/annotations/a;->c:Ljava/util/Map;

    .line 45
    return-void
.end method

.method public static a()Lcom/facebook/common/annotations/a;
    .locals 1

    .prologue
    .line 53
    sget-object v0, Lcom/facebook/common/annotations/a;->a:Lcom/facebook/common/annotations/a;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/reflect/AnnotatedElement;",
            "Ljava/lang/Class",
            "<TA;>;)TA;"
        }
    .end annotation

    .prologue
    .line 70
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/annotations/a;->b:Lcom/google/common/a/lx;

    invoke-interface {v0, p1, p2}, Lcom/google/common/a/lx;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Optional;

    .line 71
    if-eqz v0, :cond_0

    .line 72
    iget v1, p0, Lcom/facebook/common/annotations/a;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/facebook/common/annotations/a;->d:I

    .line 73
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->orNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Annotation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    :goto_0
    monitor-exit p0

    return-object v0

    .line 75
    :cond_0
    :try_start_1
    invoke-interface {p1, p2}, Ljava/lang/reflect/AnnotatedElement;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 76
    iget-object v1, p0, Lcom/facebook/common/annotations/a;->b:Lcom/google/common/a/lx;

    invoke-static {v0}, Lcom/google/common/base/Optional;->fromNullable(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v2

    invoke-interface {v1, p1, p2, v2}, Lcom/google/common/a/lx;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    iget v1, p0, Lcom/facebook/common/annotations/a;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/facebook/common/annotations/a;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/reflect/Constructor;)[[Ljava/lang/annotation/Annotation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor",
            "<*>;)[[",
            "Ljava/lang/annotation/Annotation;"
        }
    .end annotation

    .prologue
    .line 105
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/annotations/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Ljava/lang/annotation/Annotation;

    .line 106
    if-eqz v0, :cond_0

    .line 107
    iget v1, p0, Lcom/facebook/common/annotations/a;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/facebook/common/annotations/a;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    :goto_0
    monitor-exit p0

    return-object v0

    .line 110
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/facebook/common/annotations/a;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget v1, p0, Lcom/facebook/common/annotations/a;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/facebook/common/annotations/a;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 105
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/AnnotatedElement;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 94
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/common/annotations/a;->a(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
