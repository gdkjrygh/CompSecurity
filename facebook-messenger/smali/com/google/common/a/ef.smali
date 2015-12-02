.class public final Lcom/google/common/a/ef;
.super Lcom/google/common/a/at;
.source "HashMultimap.java"


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


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 91
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/common/a/at;-><init>(Ljava/util/Map;)V

    .line 53
    const/16 v0, 0x8

    iput v0, p0, Lcom/google/common/a/ef;->a:I

    .line 92
    return-void
.end method

.method public static m()Lcom/google/common/a/ef;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/ef",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 61
    new-instance v0, Lcom/google/common/a/ef;

    invoke-direct {v0}, Lcom/google/common/a/ef;-><init>()V

    return-object v0
.end method


# virtual methods
.method a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 114
    iget v0, p0, Lcom/google/common/a/ef;->a:I

    invoke-static {v0}, Lcom/google/common/a/kl;->a(I)Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1}, Lcom/google/common/a/at;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->a(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic b()Ljava/util/Map;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1}, Lcom/google/common/a/at;->b(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method synthetic c()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/google/common/a/ef;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Iterable;)Z
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->c(Ljava/lang/Object;Ljava/lang/Iterable;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Lcom/google/common/a/at;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic d()I
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->d()I

    move-result v0

    return v0
.end method

.method public bridge synthetic e()Z
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->e()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1}, Lcom/google/common/a/at;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic f()V
    .locals 0

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->f()V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 49
    invoke-super {p0, p1}, Lcom/google/common/a/at;->f(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic g()Ljava/util/Set;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->g()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/google/common/a/jf;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->h()Lcom/google/common/a/jf;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic l()Ljava/util/Set;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->l()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    invoke-super {p0}, Lcom/google/common/a/at;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
