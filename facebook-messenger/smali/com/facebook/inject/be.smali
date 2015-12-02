.class public Lcom/facebook/inject/be;
.super Lcom/facebook/inject/d;
.source "ThreadLocalProvider.java"


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


# static fields
.field private static final a:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Lcom/facebook/inject/bg",
            "<TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 18
    const-class v0, Ljavax/inject/Singleton;

    const-class v1, Lcom/facebook/inject/ContextScoped;

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/inject/be;->a:Lcom/google/common/a/fi;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 28
    new-instance v0, Lcom/facebook/inject/bf;

    invoke-direct {v0, p0}, Lcom/facebook/inject/bf;-><init>(Lcom/facebook/inject/be;)V

    iput-object v0, p0, Lcom/facebook/inject/be;->c:Ljava/lang/ThreadLocal;

    .line 36
    iput-object p1, p0, Lcom/facebook/inject/be;->b:Ljavax/inject/a;

    .line 37
    return-void
.end method


# virtual methods
.method public declared-synchronized b()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 41
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v2

    .line 42
    sget-object v0, Lcom/facebook/inject/be;->a:Lcom/google/common/a/fi;

    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/inject/av;->a(Ljava/util/Set;Ljava/lang/Class;)V

    .line 44
    iget-object v0, p0, Lcom/facebook/inject/be;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/bg;

    .line 45
    invoke-static {v0}, Lcom/facebook/inject/bg;->a(Lcom/facebook/inject/bg;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 46
    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->a(Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 49
    :try_start_1
    const-class v1, Lcom/facebook/inject/n;

    invoke-virtual {p0, v1}, Lcom/facebook/inject/be;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/inject/n;

    .line 50
    invoke-virtual {v1}, Lcom/facebook/inject/n;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    :try_start_2
    iget-object v3, p0, Lcom/facebook/inject/be;->b:Ljavax/inject/a;

    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/facebook/inject/bg;->a(Lcom/facebook/inject/bg;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    const/4 v3, 0x1

    invoke-static {v0, v3}, Lcom/facebook/inject/bg;->a(Lcom/facebook/inject/bg;Z)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    :try_start_3
    invoke-virtual {v1}, Lcom/facebook/inject/n;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 58
    :try_start_4
    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    .line 61
    :cond_0
    invoke-static {v0}, Lcom/facebook/inject/bg;->b(Lcom/facebook/inject/bg;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 55
    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Lcom/facebook/inject/n;->b()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 58
    :catchall_1
    move-exception v0

    :try_start_6
    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 41
    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0
.end method
