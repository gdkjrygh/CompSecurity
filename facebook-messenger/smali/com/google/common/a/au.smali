.class public final Lcom/google/common/a/au;
.super Lcom/google/common/a/p;
.source "ArrayListMultimap.java"


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
        "Lcom/google/common/a/p",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field transient a:I
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 103
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/common/a/p;-><init>(Ljava/util/Map;)V

    .line 104
    const/16 v0, 0xa

    iput v0, p0, Lcom/google/common/a/au;->a:I

    .line 105
    return-void
.end method


# virtual methods
.method a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 126
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lcom/google/common/a/au;->a:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/google/common/a/p;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/google/common/a/p;->a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/google/common/a/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/google/common/a/p;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Map;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/google/common/a/p;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method synthetic c()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/google/common/a/au;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Iterable;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/google/common/a/p;->c(Ljava/lang/Object;Ljava/lang/Iterable;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/google/common/a/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic d()I
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->d()I

    move-result v0

    return v0
.end method

.method public bridge synthetic e()Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->e()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/google/common/a/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic f()V
    .locals 0

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->f()V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/google/common/a/p;->f(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic g()Ljava/util/Set;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->g()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/google/common/a/jf;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->h()Lcom/google/common/a/jf;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->i()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    invoke-super {p0}, Lcom/google/common/a/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
