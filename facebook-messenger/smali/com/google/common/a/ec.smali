.class public Lcom/google/common/a/ec;
.super Lcom/google/common/a/lj;
.source "HashBasedTable.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation

.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/lj",
        "<TR;TC;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/google/common/a/ed;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TR;",
            "Ljava/util/Map",
            "<TC;TV;>;>;",
            "Lcom/google/common/a/ed",
            "<TC;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 110
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/lj;-><init>(Ljava/util/Map;Lcom/google/common/base/Supplier;)V

    .line 111
    return-void
.end method

.method public static a()Lcom/google/common/a/ec;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/ec",
            "<TR;TC;TV;>;"
        }
    .end annotation

    .prologue
    .line 72
    new-instance v0, Lcom/google/common/a/ec;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lcom/google/common/a/ed;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/common/a/ed;-><init>(I)V

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/ec;-><init>(Ljava/util/Map;Lcom/google/common/a/ed;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
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
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 133
    invoke-super {p0, p1, p2}, Lcom/google/common/a/lj;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1, p2, p3}, Lcom/google/common/a/lj;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 125
    invoke-super {p0, p1}, Lcom/google/common/a/lj;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
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
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 142
    invoke-super {p0, p1, p2}, Lcom/google/common/a/lj;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Map;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/lj;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/google/common/a/lj;->b(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Ljava/util/Set;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/lj;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Ljava/util/Set;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/lj;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()I
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/lj;->e()I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 137
    invoke-super {p0, p1}, Lcom/google/common/a/lj;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/lj;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Lcom/google/common/a/lj;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
