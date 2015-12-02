.class public Lcom/facebook/inject/p;
.super Ljava/lang/Object;
.source "ContextScopedProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
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
.field private final b:Lcom/facebook/inject/n;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    const-class v0, Ljavax/inject/Singleton;

    const-class v1, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/inject/p;->a:Lcom/google/common/a/fi;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/inject/n;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/inject/n;",
            "Ljavax/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/facebook/inject/p;->b:Lcom/facebook/inject/n;

    .line 32
    iput-object p2, p0, Lcom/facebook/inject/p;->c:Ljavax/inject/a;

    .line 33
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 37
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v2

    .line 39
    iget-object v0, p0, Lcom/facebook/inject/p;->b:Lcom/facebook/inject/n;

    invoke-virtual {v0}, Lcom/facebook/inject/n;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Called context scoped provider outside of context scope"

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_0
    instance-of v1, v0, Landroid/app/Application;

    if-nez v1, :cond_1

    .line 45
    sget-object v1, Lcom/facebook/inject/p;->a:Lcom/google/common/a/fi;

    const-class v3, Lcom/facebook/inject/ContextScoped;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/av;->a(Ljava/util/Set;Ljava/lang/Class;)V

    .line 48
    :cond_1
    const-class v1, Lcom/facebook/inject/ContextScoped;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->a(Ljava/lang/Class;)V

    .line 50
    :try_start_0
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_3

    .line 55
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    :try_start_1
    iget-object v0, p0, Lcom/facebook/inject/p;->d:Ljava/lang/Object;

    if-nez v0, :cond_2

    .line 57
    iget-object v0, p0, Lcom/facebook/inject/p;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/p;->d:Ljava/lang/Object;

    .line 59
    :cond_2
    iget-object v0, p0, Lcom/facebook/inject/p;->d:Ljava/lang/Object;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    const-class v1, Lcom/facebook/inject/ContextScoped;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    :goto_0
    return-object v0

    .line 60
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 76
    :catchall_1
    move-exception v0

    const-class v1, Lcom/facebook/inject/ContextScoped;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    throw v0

    .line 62
    :cond_3
    :try_start_4
    instance-of v1, v0, Lcom/facebook/base/h;

    if-nez v1, :cond_4

    .line 63
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Context must support PropertyBag interface"

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_4
    check-cast v0, Lcom/facebook/base/h;

    .line 66
    monitor-enter p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 67
    :try_start_5
    invoke-interface {v0, p0}, Lcom/facebook/base/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 68
    if-nez v1, :cond_5

    .line 69
    iget-object v1, p0, Lcom/facebook/inject/p;->c:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    .line 70
    invoke-interface {v0, p0, v1}, Lcom/facebook/base/h;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    move-object v0, v1

    .line 72
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 76
    const-class v1, Lcom/facebook/inject/ContextScoped;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    goto :goto_0

    .line 73
    :catchall_2
    move-exception v0

    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1
.end method
