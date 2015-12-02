.class Lcom/google/common/a/ke;
.super Lcom/google/common/a/fe;
.source "RegularImmutableMultiset.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/fe",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final transient a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<TE;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final transient b:I


# direct methods
.method constructor <init>(Lcom/google/common/a/ev;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<TE;",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/google/common/a/fe;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    .line 41
    iput p2, p0, Lcom/google/common/a/ke;->b:I

    .line 42
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 51
    iget-object v0, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 52
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method a()Z
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->d()Z

    move-result v0

    return v0
.end method

.method public c()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 67
    iget-object v0, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

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
    .line 62
    iget-object v0, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method d()Lcom/google/common/a/mh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<",
            "Lcom/google/common/a/jg",
            "<TE;>;>;"
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    .line 74
    new-instance v1, Lcom/google/common/a/kf;

    invoke-direct {v1, p0, v0}, Lcom/google/common/a/kf;-><init>(Lcom/google/common/a/ke;Ljava/util/Iterator;)V

    return-object v1
.end method

.method e()I
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->size()I

    move-result v0

    return v0
.end method

.method public synthetic f()Ljava/util/Set;
    .locals 1

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/google/common/a/ke;->c()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/google/common/a/ke;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->hashCode()I

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lcom/google/common/a/ke;->b:I

    return v0
.end method
