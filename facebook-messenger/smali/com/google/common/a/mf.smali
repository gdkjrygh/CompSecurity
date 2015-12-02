.class public final Lcom/google/common/a/mf;
.super Lcom/google/common/a/q;
.source "TreeMultiset.java"

# interfaces
.implements Lcom/google/common/a/kv;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/q",
        "<TE;>;",
        "Lcom/google/common/a/kv",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<-TE;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 128
    invoke-static {}, Lcom/google/common/a/jq;->b()Lcom/google/common/a/jq;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/common/a/mf;-><init>(Ljava/util/Comparator;)V

    .line 129
    return-void
.end method

.method private constructor <init>(Ljava/util/Comparator;)V
    .locals 2
    .param p1    # Ljava/util/Comparator;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator",
            "<-TE;>;)V"
        }
    .end annotation

    .prologue
    .line 132
    new-instance v1, Ljava/util/TreeMap;

    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Comparator;

    invoke-direct {v1, v0}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    invoke-direct {p0, v1}, Lcom/google/common/a/q;-><init>(Ljava/util/Map;)V

    .line 133
    iput-object p1, p0, Lcom/google/common/a/mf;->a:Ljava/util/Comparator;

    .line 134
    return-void
.end method

.method public static h()Lcom/google/common/a/mf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lcom/google/common/a/mf",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 73
    new-instance v0, Lcom/google/common/a/mf;

    invoke-direct {v0}, Lcom/google/common/a/mf;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 158
    :try_start_0
    invoke-super {p0, p1}, Lcom/google/common/a/q;->a(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    .line 162
    :goto_0
    return v0

    .line 159
    :catch_0
    move-exception v1

    goto :goto_0

    .line 161
    :catch_1
    move-exception v1

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
    .line 168
    if-nez p1, :cond_0

    .line 169
    iget-object v0, p0, Lcom/google/common/a/mf;->a:Ljava/util/Comparator;

    invoke-interface {v0, p1, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 171
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/google/common/a/q;->a(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/q;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic addAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/q;->addAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1, p2}, Lcom/google/common/a/q;->b(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b()Ljava/util/Set;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/q;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()V
    .locals 0

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/q;->clear()V

    return-void
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<-TE;>;"
        }
    .end annotation

    .prologue
    .line 143
    iget-object v0, p0, Lcom/google/common/a/mf;->a:Ljava/util/Comparator;

    return-object v0
.end method

.method public bridge synthetic contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/q;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method e()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 175
    new-instance v1, Lcom/google/common/a/mg;

    invoke-virtual {p0}, Lcom/google/common/a/mf;->a()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/SortedMap;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/mg;-><init>(Lcom/google/common/a/mf;Ljava/util/SortedMap;)V

    return-object v1
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic f()Ljava/util/Set;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0}, Lcom/google/common/a/mf;->i()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/q;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/util/SortedSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 153
    invoke-super {p0}, Lcom/google/common/a/q;->f()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/SortedSet;

    return-object v0
.end method

.method public bridge synthetic isEmpty()Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/q;->isEmpty()Z

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
    .line 103
    invoke-super {p0}, Lcom/google/common/a/q;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/q;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic removeAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/q;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic retainAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/q;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic size()I
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/q;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/q;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
