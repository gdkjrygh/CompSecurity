.class public abstract Lcom/facebook/inject/t;
.super Ljava/lang/Object;
.source "FbInjector.java"

# interfaces
.implements Lcom/facebook/inject/ab;


# static fields
.field private static a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Landroid/content/Context;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/l;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->f()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->h()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/inject/t;->a:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 45
    const-class v0, Lcom/facebook/inject/bi;

    invoke-static {p0, v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;Ljava/lang/Class;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Class;)Lcom/facebook/inject/t;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)",
            "Lcom/facebook/inject/t;"
        }
    .end annotation

    .prologue
    .line 56
    const/4 v1, 0x0

    .line 58
    sget-object v0, Lcom/facebook/inject/t;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 59
    if-nez v0, :cond_0

    .line 60
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    .line 61
    sget-object v2, Lcom/facebook/inject/t;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, p0, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v0

    move-object v0, v1

    .line 66
    :goto_0
    if-nez v0, :cond_2

    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/aa;

    .line 68
    invoke-interface {v0}, Lcom/facebook/inject/aa;->f()Lcom/facebook/inject/t;

    move-result-object v0

    .line 69
    if-nez v0, :cond_1

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can NOT get FbInjector instance! Probably because this method was called in ContentProvider\'s onCreate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/inject/l;

    move-object v2, v0

    move-object v0, v1

    goto :goto_0

    .line 73
    :cond_1
    new-instance v1, Lcom/facebook/inject/l;

    invoke-virtual {v0, p1}, Lcom/facebook/inject/t;->f(Ljava/lang/Class;)Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Lcom/facebook/inject/n;

    invoke-virtual {v0, v4}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/n;

    invoke-direct {v1, v3, v0, p0}, Lcom/facebook/inject/l;-><init>(Lcom/facebook/inject/ab;Lcom/facebook/inject/n;Landroid/content/Context;)V

    .line 78
    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 80
    :cond_2
    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;)Lcom/facebook/inject/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;)",
            "Lcom/facebook/inject/t;"
        }
    .end annotation

    .prologue
    .line 93
    new-instance v0, Lcom/facebook/inject/u;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/inject/u;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    return-object v0
.end method

.method protected static f(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/a",
            "<",
            "Ljava/util/Set",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 112
    new-instance v0, Lcom/google/inject/a/g;

    const/4 v1, 0x0

    const-class v2, Ljava/util/Set;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/reflect/Type;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    invoke-direct {v0, v1, v2, v3}, Lcom/google/inject/a/g;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 114
    invoke-static {v0}, Lcom/google/inject/f;->a(Ljava/lang/reflect/Type;)Lcom/google/inject/f;

    move-result-object v0

    .line 115
    if-eqz p1, :cond_0

    .line 116
    invoke-static {v0, p1}, Lcom/google/inject/a;->a(Lcom/google/inject/f;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v0

    .line 118
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/inject/a;->a(Lcom/google/inject/f;)Lcom/google/inject/a;

    move-result-object v0

    goto :goto_0
.end method
