.class Lcom/google/common/a/me;
.super Lcom/google/common/a/mc;
.source "TransformedImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mc",
        "<TD;TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/mc;


# direct methods
.method constructor <init>(Lcom/google/common/a/mc;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<TD;>;)V"
        }
    .end annotation

    .prologue
    .line 36
    iput-object p1, p0, Lcom/google/common/a/me;->a:Lcom/google/common/a/mc;

    .line 37
    invoke-direct {p0, p2}, Lcom/google/common/a/mc;-><init>(Lcom/google/common/a/es;)V

    .line 38
    return-void
.end method


# virtual methods
.method b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)TE;"
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lcom/google/common/a/me;->a:Lcom/google/common/a/mc;

    invoke-virtual {v0, p1}, Lcom/google/common/a/mc;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 35
    invoke-super {p0, p1}, Lcom/google/common/a/mc;->a(I)Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic subList(II)Ljava/util/List;
    .locals 1

    .prologue
    .line 35
    invoke-super {p0, p1, p2}, Lcom/google/common/a/mc;->a(II)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
