.class abstract Lcom/google/common/a/jl;
.super Ljava/util/AbstractSet;
.source "Multisets.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractSet",
        "<",
        "Lcom/google/common/a/jg",
        "<TE;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 740
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a()Lcom/google/common/a/jf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jf",
            "<TE;>;"
        }
    .end annotation
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 764
    invoke-virtual {p0}, Lcom/google/common/a/jl;->a()Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->clear()V

    .line 765
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 744
    instance-of v1, p1, Lcom/google/common/a/jg;

    if-eqz v1, :cond_0

    .line 746
    check-cast p1, Lcom/google/common/a/jg;

    .line 747
    invoke-interface {p1}, Lcom/google/common/a/jg;->b()I

    move-result v1

    if-gtz v1, :cond_1

    .line 754
    :cond_0
    :goto_0
    return v0

    .line 750
    :cond_1
    invoke-virtual {p0}, Lcom/google/common/a/jl;->a()Lcom/google/common/a/jf;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;)I

    move-result v1

    .line 751
    invoke-interface {p1}, Lcom/google/common/a/jg;->b()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 759
    invoke-virtual {p0, p1}, Lcom/google/common/a/jl;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/jl;->a()Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object v0

    check-cast p1, Lcom/google/common/a/jg;

    invoke-interface {p1}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
