.class public final Lcom/google/common/a/fz;
.super Lcom/google/common/a/fk;
.source "ImmutableSortedSet.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/fk",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<-TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator",
            "<-TE;>;)V"
        }
    .end annotation

    .prologue
    .line 500
    invoke-direct {p0}, Lcom/google/common/a/fk;-><init>()V

    .line 501
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Comparator;

    iput-object v0, p0, Lcom/google/common/a/fz;->b:Ljava/util/Comparator;

    .line 502
    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0}, Lcom/google/common/a/fz;->c()Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Iterable;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0, p1}, Lcom/google/common/a/fz;->c(Ljava/lang/Iterable;)Lcom/google/common/a/fz;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Object;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0, p1}, Lcom/google/common/a/fz;->c(Ljava/lang/Object;)Lcom/google/common/a/fz;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a([Ljava/lang/Object;)Lcom/google/common/a/eo;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0, p1}, Lcom/google/common/a/fz;->c([Ljava/lang/Object;)Lcom/google/common/a/fz;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Lcom/google/common/a/fi;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0}, Lcom/google/common/a/fz;->c()Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Iterable;)Lcom/google/common/a/fk;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0, p1}, Lcom/google/common/a/fz;->c(Ljava/lang/Iterable;)Lcom/google/common/a/fz;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Object;)Lcom/google/common/a/fk;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0, p1}, Lcom/google/common/a/fz;->c(Ljava/lang/Object;)Lcom/google/common/a/fz;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b([Ljava/lang/Object;)Lcom/google/common/a/fk;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0, p1}, Lcom/google/common/a/fz;->c([Ljava/lang/Object;)Lcom/google/common/a/fz;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/common/a/fy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 563
    iget-object v0, p0, Lcom/google/common/a/fz;->b:Ljava/util/Comparator;

    iget-object v1, p0, Lcom/google/common/a/fz;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/fy;->a(Ljava/util/Comparator;Ljava/util/Iterator;)Lcom/google/common/a/fy;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Iterable;)Lcom/google/common/a/fz;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/common/a/fz",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 541
    invoke-super {p0, p1}, Lcom/google/common/a/fk;->b(Ljava/lang/Iterable;)Lcom/google/common/a/fk;

    .line 542
    return-object p0
.end method

.method public c(Ljava/lang/Object;)Lcom/google/common/a/fz;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/common/a/fz",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 515
    invoke-super {p0, p1}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 516
    return-object p0
.end method

.method public varargs c([Ljava/lang/Object;)Lcom/google/common/a/fz;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lcom/google/common/a/fz",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 528
    invoke-super {p0, p1}, Lcom/google/common/a/fk;->b([Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 529
    return-object p0
.end method
