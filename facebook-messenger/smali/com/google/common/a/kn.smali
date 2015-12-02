.class final Lcom/google/common/a/kn;
.super Lcom/google/common/a/kp;
.source "Sets.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/kp",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Lcom/google/common/base/Predicate;

.field final synthetic c:Ljava/util/Set;


# direct methods
.method constructor <init>(Ljava/util/Set;Lcom/google/common/base/Predicate;Ljava/util/Set;)V
    .locals 1

    .prologue
    .line 664
    iput-object p1, p0, Lcom/google/common/a/kn;->a:Ljava/util/Set;

    iput-object p2, p0, Lcom/google/common/a/kn;->b:Lcom/google/common/base/Predicate;

    iput-object p3, p0, Lcom/google/common/a/kn;->c:Ljava/util/Set;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/common/a/kp;-><init>(Lcom/google/common/a/km;)V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 675
    iget-object v0, p0, Lcom/google/common/a/kn;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/common/a/kn;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 2

    .prologue
    .line 672
    iget-object v0, p0, Lcom/google/common/a/kn;->c:Ljava/util/Set;

    iget-object v1, p0, Lcom/google/common/a/kn;->a:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 666
    iget-object v0, p0, Lcom/google/common/a/kn;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/kn;->b:Lcom/google/common/base/Predicate;

    invoke-static {v0, v1}, Lcom/google/common/a/gg;->a(Ljava/util/Iterator;Lcom/google/common/base/Predicate;)Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 669
    invoke-virtual {p0}, Lcom/google/common/a/kn;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/gg;->b(Ljava/util/Iterator;)I

    move-result v0

    return v0
.end method
