.class final Lcom/google/common/a/fo;
.super Lcom/google/common/a/es;
.source "ImmutableSortedAsList.java"

# interfaces
.implements Lcom/google/common/a/kv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/es",
        "<TE;>;",
        "Lcom/google/common/a/kv",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final transient a:Lcom/google/common/a/fy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fy",
            "<TE;>;"
        }
    .end annotation
.end field

.field private final transient b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/fy;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/fy",
            "<TE;>;",
            "Lcom/google/common/a/es",
            "<TE;>;)V"
        }
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/google/common/a/es;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/google/common/a/fo;->a:Lcom/google/common/a/fy;

    .line 37
    iput-object p2, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    .line 38
    return-void
.end method


# virtual methods
.method public a(II)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/google/common/a/fo;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/google/common/base/Preconditions;->checkPositionIndexes(III)V

    .line 63
    if-ne p1, p2, :cond_0

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/kh;

    iget-object v1, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v1, p1, p2}, Lcom/google/common/a/es;->a(II)Lcom/google/common/a/es;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/fo;->a:Lcom/google/common/a/fy;

    invoke-virtual {v2}, Lcom/google/common/a/fy;->comparator()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/kh;-><init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V

    invoke-virtual {v0}, Lcom/google/common/a/kh;->h()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method public a(I)Lcom/google/common/a/mi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/a/mi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->a(I)Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method a()Z
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->a()Z

    move-result v0

    return v0
.end method

.method public c()Lcom/google/common/a/mi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->c()Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<-TE;>;"
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lcom/google/common/a/fo;->a:Lcom/google/common/a/fy;

    invoke-virtual {v0}, Lcom/google/common/a/fy;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 48
    iget-object v0, p0, Lcom/google/common/a/fo;->a:Lcom/google/common/a/fy;

    invoke-virtual {v0, p1}, Lcom/google/common/a/fy;->a(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 95
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 79
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 75
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->hashCode()I

    move-result v0

    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 52
    iget-object v0, p0, Lcom/google/common/a/fo;->a:Lcom/google/common/a/fy;

    invoke-virtual {v0, p1}, Lcom/google/common/a/fy;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/google/common/a/fo;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 56
    iget-object v0, p0, Lcom/google/common/a/fo;->a:Lcom/google/common/a/fy;

    invoke-virtual {v0, p1}, Lcom/google/common/a/fy;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/google/common/a/fo;->c()Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0, p1}, Lcom/google/common/a/fo;->a(I)Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/google/common/a/fo;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public synthetic subList(II)Ljava/util/List;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/fo;->a(II)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
