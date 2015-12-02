.class Lcom/google/common/a/as;
.super Lcom/google/common/a/jl;
.source "AbstractMultiset.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/jl",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/aq;


# direct methods
.method constructor <init>(Lcom/google/common/a/aq;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/google/common/a/as;->a:Lcom/google/common/a/aq;

    invoke-direct {p0}, Lcom/google/common/a/jl;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/google/common/a/jf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jf",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 173
    iget-object v0, p0, Lcom/google/common/a/as;->a:Lcom/google/common/a/aq;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 177
    iget-object v0, p0, Lcom/google/common/a/as;->a:Lcom/google/common/a/aq;

    invoke-virtual {v0}, Lcom/google/common/a/aq;->c()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/google/common/a/as;->a:Lcom/google/common/a/aq;

    invoke-virtual {v0}, Lcom/google/common/a/aq;->d()I

    move-result v0

    return v0
.end method
