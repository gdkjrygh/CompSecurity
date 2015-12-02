.class abstract Lcom/google/common/a/aq;
.super Ljava/util/AbstractCollection;
.source "AbstractMultiset.java"

# interfaces
.implements Lcom/google/common/a/jf;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractCollection",
        "<TE;>;",
        "Lcom/google/common/a/jf",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private transient a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TE;>;"
        }
    .end annotation
.end field

.field private transient b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 171
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/google/common/a/aq;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 70
    invoke-interface {v0}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 71
    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v0

    .line 74
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    .prologue
    .line 86
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 80
    invoke-virtual {p0, p1, v0}, Lcom/google/common/a/aq;->a(Ljava/lang/Object;I)I

    .line 81
    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    .prologue
    .line 117
    invoke-static {p0, p1}, Lcom/google/common/a/jh;->a(Lcom/google/common/a/jf;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 95
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 167
    iget-object v0, p0, Lcom/google/common/a/aq;->b:Ljava/util/Set;

    .line 168
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/aq;->g()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/aq;->b:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method abstract c()Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 129
    invoke-virtual {p0}, Lcom/google/common/a/aq;->c()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/gg;->f(Ljava/util/Iterator;)V

    .line 130
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 60
    invoke-virtual {p0, p1}, Lcom/google/common/a/aq;->a(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method abstract d()I
.end method

.method e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 150
    new-instance v0, Lcom/google/common/a/ar;

    invoke-direct {v0, p0}, Lcom/google/common/a/ar;-><init>(Lcom/google/common/a/aq;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 199
    invoke-static {p0, p1}, Lcom/google/common/a/jh;->a(Lcom/google/common/a/jf;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 138
    iget-object v0, p0, Lcom/google/common/a/aq;->a:Ljava/util/Set;

    .line 139
    if-nez v0, :cond_0

    .line 140
    invoke-virtual {p0}, Lcom/google/common/a/aq;->e()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/aq;->a:Ljava/util/Set;

    .line 142
    :cond_0
    return-object v0
.end method

.method g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 186
    new-instance v0, Lcom/google/common/a/as;

    invoke-direct {v0, p0}, Lcom/google/common/a/as;-><init>(Lcom/google/common/a/aq;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 209
    invoke-virtual {p0}, Lcom/google/common/a/aq;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/google/common/a/aq;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 64
    invoke-static {p0}, Lcom/google/common/a/jh;->a(Lcom/google/common/a/jf;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 90
    invoke-virtual {p0, p1, v0}, Lcom/google/common/a/aq;->b(Ljava/lang/Object;I)I

    move-result v1

    if-lez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 121
    invoke-static {p0, p1}, Lcom/google/common/a/jh;->b(Lcom/google/common/a/jf;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 125
    invoke-static {p0, p1}, Lcom/google/common/a/jh;->c(Lcom/google/common/a/jf;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 52
    invoke-static {p0}, Lcom/google/common/a/jh;->b(Lcom/google/common/a/jf;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 219
    invoke-virtual {p0}, Lcom/google/common/a/aq;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
