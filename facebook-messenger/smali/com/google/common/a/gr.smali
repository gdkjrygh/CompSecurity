.class public final Lcom/google/common/a/gr;
.super Lcom/google/common/a/at;
.source "LinkedHashMultimap.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/at",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field transient a:I
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field transient b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 122
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/common/a/at;-><init>(Ljava/util/Map;)V

    .line 75
    const/16 v0, 0x8

    iput v0, p0, Lcom/google/common/a/gr;->a:I

    .line 123
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    .line 124
    return-void
.end method

.method public static m()Lcom/google/common/a/gr;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/gr",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 90
    new-instance v0, Lcom/google/common/a/gr;

    invoke-direct {v0}, Lcom/google/common/a/gr;-><init>()V

    return-object v0
.end method


# virtual methods
.method a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 153
    new-instance v0, Ljava/util/LinkedHashSet;

    iget v1, p0, Lcom/google/common/a/gr;->a:I

    invoke-static {v1}, Lcom/google/common/a/ik;->b(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1}, Lcom/google/common/a/at;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable",
            "<+TV;>;)",
            "Ljava/util/Set",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 325
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic b(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/gr;->a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Map;
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1}, Lcom/google/common/a/at;->b(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method synthetic c()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/google/common/a/gr;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Iterable;)Z
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->c(Ljava/lang/Object;Ljava/lang/Iterable;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic d()I
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->d()I

    move-result v0

    return v0
.end method

.method e(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 167
    new-instance v0, Lcom/google/common/a/gt;

    invoke-virtual {p0}, Lcom/google/common/a/gr;->a()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/common/a/gt;-><init>(Lcom/google/common/a/gr;Ljava/lang/Object;Ljava/util/Set;)V

    return-object v0
.end method

.method public bridge synthetic e()Z
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->e()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1}, Lcom/google/common/a/at;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic f()V
    .locals 0

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->f()V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 71
    invoke-super {p0, p1}, Lcom/google/common/a/at;->f(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic g()Ljava/util/Set;
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->g()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/google/common/a/jf;
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->h()Lcom/google/common/a/jf;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->hashCode()I

    move-result v0

    return v0
.end method

.method public synthetic i()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/google/common/a/gr;->l()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method k()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 290
    iget-object v0, p0, Lcom/google/common/a/gr;->b:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 292
    new-instance v1, Lcom/google/common/a/gs;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/gs;-><init>(Lcom/google/common/a/gr;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public l()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 341
    invoke-super {p0}, Lcom/google/common/a/at;->l()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    invoke-super {p0}, Lcom/google/common/a/at;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
