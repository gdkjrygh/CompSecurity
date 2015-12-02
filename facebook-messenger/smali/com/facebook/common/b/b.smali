.class Lcom/facebook/common/b/b;
.super Ljava/lang/Object;
.source "ArraySet.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TT;>;"
    }
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/facebook/common/b/a;


# direct methods
.method constructor <init>(Lcom/facebook/common/b/a;)V
    .locals 1

    .prologue
    .line 146
    iput-object p1, p0, Lcom/facebook/common/b/b;->b:Lcom/facebook/common/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/common/b/b;->a:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .prologue
    .line 150
    iget v0, p0, Lcom/facebook/common/b/b;->a:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/facebook/common/b/b;->b:Lcom/facebook/common/b/a;

    invoke-static {v1}, Lcom/facebook/common/b/a;->a(Lcom/facebook/common/b/a;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 155
    iget v0, p0, Lcom/facebook/common/b/b;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/common/b/b;->a:I

    .line 156
    iget-object v0, p0, Lcom/facebook/common/b/b;->b:Lcom/facebook/common/b/a;

    invoke-static {v0}, Lcom/facebook/common/b/a;->a(Lcom/facebook/common/b/a;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/facebook/common/b/b;->a:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 162
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Remove not supported for this set iterator"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
