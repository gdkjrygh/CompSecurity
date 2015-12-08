.class public final Lcom/google/inject/internal/util/$Iterables;
.super Ljava/lang/Object;
.source "Iterables.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$Iterables$IterableWithToString;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static concat(Ljava/lang/Iterable;)Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+",
            "Ljava/lang/Iterable",
            "<+TT;>;>;)",
            "Ljava/lang/Iterable",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 94
    .local p0, "inputs":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Ljava/lang/Iterable<+TT;>;>;"
    new-instance v0, Lcom/google/inject/internal/util/$Iterables$1;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$Iterables$1;-><init>()V

    .line 100
    .local v0, "function":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<Ljava/lang/Iterable<+TT;>;Ljava/util/Iterator<+TT;>;>;"
    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$Iterables;->transform(Ljava/lang/Iterable;Lcom/google/inject/internal/util/$Function;)Ljava/lang/Iterable;

    move-result-object v1

    .line 102
    .local v1, "iterators":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Ljava/util/Iterator<+TT;>;>;"
    new-instance v2, Lcom/google/inject/internal/util/$Iterables$2;

    invoke-direct {v2, v1}, Lcom/google/inject/internal/util/$Iterables$2;-><init>(Ljava/lang/Iterable;)V

    return-object v2
.end method

.method public static concat(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TT;>;",
            "Ljava/lang/Iterable",
            "<+TT;>;)",
            "Ljava/lang/Iterable",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 64
    .local p0, "a":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+TT;>;"
    .local p1, "b":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+TT;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    invoke-static {p1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Iterable;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$Iterables;->concat(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public static getOnlyElement(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 50
    .local p0, "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<TT;>;"
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$Iterators;->getOnlyElement(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 39
    .local p0, "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$Iterators;->toString(Ljava/util/Iterator;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static transform(Ljava/lang/Iterable;Lcom/google/inject/internal/util/$Function;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<TF;>;",
            "Lcom/google/inject/internal/util/$Function",
            "<-TF;+TT;>;)",
            "Ljava/lang/Iterable",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 119
    .local p0, "fromIterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<TF;>;"
    .local p1, "function":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<-TF;+TT;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    invoke-static {p1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    new-instance v0, Lcom/google/inject/internal/util/$Iterables$3;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/internal/util/$Iterables$3;-><init>(Ljava/lang/Iterable;Lcom/google/inject/internal/util/$Function;)V

    return-object v0
.end method
