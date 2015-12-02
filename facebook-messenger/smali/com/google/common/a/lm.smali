.class Lcom/google/common/a/lm;
.super Lcom/google/common/a/lw;
.source "StandardTable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/lj",
        "<TR;TC;TV;>.com/google/common/a/lw<",
        "Lcom/google/common/a/ly",
        "<TR;TC;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/lj;


# direct methods
.method private constructor <init>(Lcom/google/common/a/lj;)V
    .locals 1

    .prologue
    .line 278
    iput-object p1, p0, Lcom/google/common/a/lm;->a:Lcom/google/common/a/lj;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/common/a/lw;-><init>(Lcom/google/common/a/lj;Lcom/google/common/a/lk;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/a/lj;Lcom/google/common/a/lk;)V
    .locals 0

    .prologue
    .line 278
    invoke-direct {p0, p1}, Lcom/google/common/a/lm;-><init>(Lcom/google/common/a/lj;)V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    .line 288
    instance-of v0, p1, Lcom/google/common/a/ly;

    if-eqz v0, :cond_0

    .line 289
    check-cast p1, Lcom/google/common/a/ly;

    .line 290
    iget-object v0, p0, Lcom/google/common/a/lm;->a:Lcom/google/common/a/lj;

    invoke-interface {p1}, Lcom/google/common/a/ly;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/common/a/ly;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/common/a/ly;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/google/common/a/lj;->a(Lcom/google/common/a/lj;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 293
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/common/a/ly",
            "<TR;TC;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 280
    new-instance v0, Lcom/google/common/a/ll;

    iget-object v1, p0, Lcom/google/common/a/lm;->a:Lcom/google/common/a/lj;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/ll;-><init>(Lcom/google/common/a/lj;Lcom/google/common/a/lk;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    .line 297
    instance-of v0, p1, Lcom/google/common/a/ly;

    if-eqz v0, :cond_0

    .line 298
    check-cast p1, Lcom/google/common/a/ly;

    .line 299
    iget-object v0, p0, Lcom/google/common/a/lm;->a:Lcom/google/common/a/lj;

    invoke-interface {p1}, Lcom/google/common/a/ly;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/common/a/ly;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/common/a/ly;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/google/common/a/lj;->b(Lcom/google/common/a/lj;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 302
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lcom/google/common/a/lm;->a:Lcom/google/common/a/lj;

    invoke-virtual {v0}, Lcom/google/common/a/lj;->e()I

    move-result v0

    return v0
.end method
