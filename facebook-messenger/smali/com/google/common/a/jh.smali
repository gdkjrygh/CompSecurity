.class public final Lcom/google/common/a/jh;
.super Ljava/lang/Object;
.source "Multisets.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/Iterable;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<*>;)I"
        }
    .end annotation

    .prologue
    .line 368
    instance-of v0, p0, Lcom/google/common/a/jf;

    if-eqz v0, :cond_0

    .line 369
    check-cast p0, Lcom/google/common/a/jf;

    invoke-interface {p0}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    .line 371
    :goto_0
    return v0

    :cond_0
    const/16 v0, 0xb

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;I)Lcom/google/common/a/jg;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;I)",
            "Lcom/google/common/a/jg",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 185
    new-instance v0, Lcom/google/common/a/jm;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/jm;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method static a(Lcom/google/common/a/jf;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/jf",
            "<TE;>;)",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 772
    new-instance v0, Lcom/google/common/a/jn;

    invoke-interface {p0}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/jn;-><init>(Lcom/google/common/a/jf;Ljava/util/Iterator;)V

    return-object v0
.end method

.method static a(Lcom/google/common/a/jf;Ljava/lang/Object;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jf",
            "<*>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 597
    if-ne p1, p0, :cond_0

    move v0, v1

    .line 619
    :goto_0
    return v0

    .line 600
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/jf;

    if-eqz v0, :cond_5

    .line 601
    check-cast p1, Lcom/google/common/a/jf;

    .line 608
    invoke-interface {p0}, Lcom/google/common/a/jf;->size()I

    move-result v0

    invoke-interface {p1}, Lcom/google/common/a/jf;->size()I

    move-result v3

    if-ne v0, v3, :cond_1

    invoke-interface {p0}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p1}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v0, v3, :cond_2

    :cond_1
    move v0, v2

    .line 610
    goto :goto_0

    .line 612
    :cond_2
    invoke-interface {p1}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 613
    invoke-interface {v0}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p0, v4}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;)I

    move-result v4

    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v0

    if-eq v4, v0, :cond_3

    move v0, v2

    .line 614
    goto :goto_0

    :cond_4
    move v0, v1

    .line 617
    goto :goto_0

    :cond_5
    move v0, v2

    .line 619
    goto :goto_0
.end method

.method static a(Lcom/google/common/a/jf;Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/jf",
            "<TE;>;",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    .prologue
    .line 627
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 628
    const/4 v0, 0x0

    .line 638
    :goto_0
    return v0

    .line 630
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/jf;

    if-eqz v0, :cond_1

    .line 631
    invoke-static {p1}, Lcom/google/common/a/jh;->b(Ljava/lang/Iterable;)Lcom/google/common/a/jf;

    move-result-object v0

    .line 632
    invoke-interface {v0}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 633
    invoke-interface {v0}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v0

    invoke-interface {p0, v2, v0}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;I)I

    goto :goto_1

    .line 636
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/common/a/gg;->a(Ljava/util/Collection;Ljava/util/Iterator;)Z

    .line 638
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static b(Lcom/google/common/a/jf;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jf",
            "<*>;)I"
        }
    .end annotation

    .prologue
    .line 829
    const-wide/16 v0, 0x0

    .line 830
    invoke-interface {p0}, Lcom/google/common/a/jf;->b()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-wide v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jg;

    .line 831
    invoke-interface {v0}, Lcom/google/common/a/jg;->b()I

    move-result v0

    int-to-long v4, v0

    add-long v0, v1, v4

    move-wide v1, v0

    goto :goto_0

    .line 833
    :cond_0
    invoke-static {v1, v2}, Lcom/google/common/c/a;->b(J)I

    move-result v0

    return v0
.end method

.method static b(Ljava/lang/Iterable;)Lcom/google/common/a/jf;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<TT;>;)",
            "Lcom/google/common/a/jf",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 844
    check-cast p0, Lcom/google/common/a/jf;

    return-object p0
.end method

.method static b(Lcom/google/common/a/jf;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jf",
            "<*>;",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 646
    instance-of v0, p1, Lcom/google/common/a/jf;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/common/a/jf;

    invoke-interface {p1}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object p1

    .line 649
    :cond_0
    invoke-interface {p0}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method static c(Lcom/google/common/a/jf;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jf",
            "<*>;",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 657
    instance-of v0, p1, Lcom/google/common/a/jf;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/common/a/jf;

    invoke-interface {p1}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object p1

    .line 660
    :cond_0
    invoke-interface {p0}, Lcom/google/common/a/jf;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method
