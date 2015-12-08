.class final Lcom/c/b/bn$c;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field a:Lcom/c/b/bn;


# virtual methods
.method final a()V
    .locals 1

    .prologue
    .line 699
    iget v0, p0, Lcom/c/b/bn$c;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/bn$c;->modCount:I

    .line 700
    return-void
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 677
    iget-object v0, p0, Lcom/c/b/bn$c;->a:Lcom/c/b/bn;

    invoke-virtual {v0, p1}, Lcom/c/b/bn;->c(I)Lcom/c/b/bg;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 691
    iget-object v0, p0, Lcom/c/b/bn$c;->a:Lcom/c/b/bn;

    invoke-virtual {v0}, Lcom/c/b/bn;->c()I

    move-result v0

    return v0
.end method
