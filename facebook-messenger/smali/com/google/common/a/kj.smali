.class final Lcom/google/common/a/kj;
.super Lcom/google/common/a/jq;
.source "ReverseOrdering.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/jq",
        "<TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/common/a/jq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jq",
            "<-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/jq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jq",
            "<-TT;>;)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/google/common/a/jq;-><init>()V

    .line 33
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jq;

    iput-object v0, p0, Lcom/google/common/a/kj;->a:Lcom/google/common/a/jq;

    .line 34
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/jq;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>()",
            "Lcom/google/common/a/jq",
            "<TS;>;"
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/google/common/a/kj;->a:Lcom/google/common/a/jq;

    return-object v0
.end method

.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lcom/google/common/a/kj;->a:Lcom/google/common/a/jq;

    invoke-virtual {v0, p2, p1}, Lcom/google/common/a/jq;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 76
    if-ne p1, p0, :cond_0

    .line 77
    const/4 v0, 0x1

    .line 83
    :goto_0
    return v0

    .line 79
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/kj;

    if-eqz v0, :cond_1

    .line 80
    check-cast p1, Lcom/google/common/a/kj;

    .line 81
    iget-object v0, p0, Lcom/google/common/a/kj;->a:Lcom/google/common/a/jq;

    iget-object v1, p1, Lcom/google/common/a/kj;->a:Lcom/google/common/a/jq;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 83
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/google/common/a/kj;->a:Lcom/google/common/a/jq;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/common/a/kj;->a:Lcom/google/common/a/jq;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".reverse()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
