.class public abstract Lcom/google/common/a/jq;
.super Ljava/lang/Object;
.source "Ordering.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lcom/google/common/a/jq;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtCompatible;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator",
            "<TT;>;)",
            "Lcom/google/common/a/jq",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 95
    instance-of v0, p0, Lcom/google/common/a/jq;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/common/a/jq;

    :goto_0
    return-object p0

    :cond_0
    new-instance v0, Lcom/google/common/a/ba;

    invoke-direct {v0, p0}, Lcom/google/common/a/ba;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    goto :goto_0
.end method

.method public static b()Lcom/google/common/a/jq;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtCompatible;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lcom/google/common/a/jq",
            "<TC;>;"
        }
    .end annotation

    .prologue
    .line 82
    sget-object v0, Lcom/google/common/a/jo;->a:Lcom/google/common/a/jo;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/common/a/jq;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtCompatible;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>()",
            "Lcom/google/common/a/jq",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 321
    new-instance v0, Lcom/google/common/a/kj;

    invoke-direct {v0, p0}, Lcom/google/common/a/kj;-><init>(Lcom/google/common/a/jq;)V

    return-object v0
.end method

.method public a(Lcom/google/common/base/Function;)Lcom/google/common/a/jq;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtCompatible;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/base/Function",
            "<TF;+TT;>;)",
            "Lcom/google/common/a/jq",
            "<TF;>;"
        }
    .end annotation

    .prologue
    .line 335
    new-instance v0, Lcom/google/common/a/aw;

    invoke-direct {v0, p1, p0}, Lcom/google/common/a/aw;-><init>(Lcom/google/common/base/Function;Lcom/google/common/a/jq;)V

    return-object v0
.end method

.method public a(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable",
            "<TE;>;)",
            "Ljava/util/List",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 512
    invoke-static {p1}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 513
    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 514
    return-object v0
.end method

.method public b(Ljava/lang/Iterable;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable",
            "<TE;>;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 534
    invoke-virtual {p0, p1}, Lcom/google/common/a/jq;->a(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method
