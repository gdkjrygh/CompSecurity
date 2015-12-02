.class Lcom/google/common/a/kr;
.super Lcom/google/common/a/mi;
.source "SingletonImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/mi",
        "<TE;>;"
    }
.end annotation


# instance fields
.field a:Z

.field final synthetic b:I

.field final synthetic c:Lcom/google/common/a/kq;


# direct methods
.method constructor <init>(Lcom/google/common/a/kq;I)V
    .locals 1

    .prologue
    .line 64
    iput-object p1, p0, Lcom/google/common/a/kr;->c:Lcom/google/common/a/kq;

    iput p2, p0, Lcom/google/common/a/kr;->b:I

    invoke-direct {p0}, Lcom/google/common/a/mi;-><init>()V

    .line 66
    iget v0, p0, Lcom/google/common/a/kr;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 69
    iget-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    .prologue
    .line 73
    iget-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 77
    iget-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    if-nez v0, :cond_0

    .line 78
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 80
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    .line 81
    iget-object v0, p0, Lcom/google/common/a/kr;->c:Lcom/google/common/a/kq;

    iget-object v0, v0, Lcom/google/common/a/kq;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 89
    iget-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    if-eqz v0, :cond_0

    .line 90
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 92
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    .line 93
    iget-object v0, p0, Lcom/google/common/a/kr;->c:Lcom/google/common/a/kq;

    iget-object v0, v0, Lcom/google/common/a/kq;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .prologue
    .line 97
    iget-boolean v0, p0, Lcom/google/common/a/kr;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
