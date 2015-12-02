.class public final Lcom/google/common/a/gv;
.super Lcom/google/common/a/q;
.source "LinkedHashMultiset.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/q",
        "<TE;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 79
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/common/a/q;-><init>(Ljava/util/Map;)V

    .line 80
    return-void
.end method

.method private constructor <init>(I)V
    .locals 2

    .prologue
    .line 84
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-static {p1}, Lcom/google/common/a/ik;->b(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/google/common/a/q;-><init>(Ljava/util/Map;)V

    .line 85
    return-void
.end method

.method public static a(I)Lcom/google/common/a/gv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lcom/google/common/a/gv",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 59
    new-instance v0, Lcom/google/common/a/gv;

    invoke-direct {v0, p0}, Lcom/google/common/a/gv;-><init>(I)V

    return-object v0
.end method

.method public static a(Ljava/lang/Iterable;)Lcom/google/common/a/gv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/common/a/gv",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 72
    invoke-static {p0}, Lcom/google/common/a/jh;->a(Ljava/lang/Iterable;)I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/gv;->a(I)Lcom/google/common/a/gv;

    move-result-object v0

    .line 74
    invoke-static {v0, p0}, Lcom/google/common/a/gb;->a(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 75
    return-object v0
.end method

.method public static h()Lcom/google/common/a/gv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/gv",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 48
    new-instance v0, Lcom/google/common/a/gv;

    invoke-direct {v0}, Lcom/google/common/a/gv;-><init>()V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1, p2}, Lcom/google/common/a/q;->a(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic addAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->addAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1, p2}, Lcom/google/common/a/q;->b(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b()Ljava/util/Set;
    .locals 1

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()V
    .locals 0

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->clear()V

    return-void
.end method

.method public bridge synthetic contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic f()Ljava/util/Set;
    .locals 1

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic isEmpty()Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic removeAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic retainAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/google/common/a/q;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic size()I
    .locals 1

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    invoke-super {p0}, Lcom/google/common/a/q;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
