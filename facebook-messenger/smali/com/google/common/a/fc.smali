.class Lcom/google/common/a/fc;
.super Lcom/google/common/a/em;
.source "ImmutableMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/em",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/common/a/ex;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ex",
            "<*TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/ex;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ex",
            "<*TV;>;)V"
        }
    .end annotation

    .prologue
    .line 572
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    .line 573
    iput-object p1, p0, Lcom/google/common/a/fc;->a:Lcom/google/common/a/ex;

    .line 574
    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 597
    const/4 v0, 0x1

    return v0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 577
    iget-object v0, p0, Lcom/google/common/a/fc;->a:Lcom/google/common/a/ex;

    invoke-virtual {v0}, Lcom/google/common/a/ex;->n()Lcom/google/common/a/em;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/em;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    .line 579
    new-instance v1, Lcom/google/common/a/fd;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/fd;-><init>(Lcom/google/common/a/fc;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 569
    invoke-virtual {p0}, Lcom/google/common/a/fc;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 593
    iget-object v0, p0, Lcom/google/common/a/fc;->a:Lcom/google/common/a/ex;

    invoke-virtual {v0}, Lcom/google/common/a/ex;->d()I

    move-result v0

    return v0
.end method
