.class Lcom/android/core/ArrayDeque$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/core/ArrayDeque;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/android/core/ArrayDeque;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>(Lcom/android/core/ArrayDeque;)V
    .locals 1

    .prologue
    .line 707
    iput-object p1, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 713
    iget-object v0, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-static {v0}, Lcom/android/core/ArrayDeque;->b(Lcom/android/core/ArrayDeque;)I

    move-result v0

    iput v0, p0, Lcom/android/core/ArrayDeque$b;->b:I

    .line 714
    iget-object v0, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-static {v0}, Lcom/android/core/ArrayDeque;->a(Lcom/android/core/ArrayDeque;)I

    move-result v0

    iput v0, p0, Lcom/android/core/ArrayDeque$b;->c:I

    .line 715
    const/4 v0, -0x1

    iput v0, p0, Lcom/android/core/ArrayDeque$b;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/core/ArrayDeque;Lcom/android/core/ArrayDeque$1;)V
    .locals 0

    .prologue
    .line 707
    invoke-direct {p0, p1}, Lcom/android/core/ArrayDeque$b;-><init>(Lcom/android/core/ArrayDeque;)V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .prologue
    .line 719
    iget v0, p0, Lcom/android/core/ArrayDeque$b;->b:I

    iget v1, p0, Lcom/android/core/ArrayDeque$b;->c:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 724
    iget v0, p0, Lcom/android/core/ArrayDeque$b;->b:I

    iget v1, p0, Lcom/android/core/ArrayDeque$b;->c:I

    if-ne v0, v1, :cond_0

    .line 725
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 727
    :cond_0
    iget v0, p0, Lcom/android/core/ArrayDeque$b;->b:I

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-static {v1}, Lcom/android/core/ArrayDeque;->c(Lcom/android/core/ArrayDeque;)[Ljava/lang/Object;

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lcom/android/core/ArrayDeque$b;->b:I

    .line 728
    iget-object v0, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-static {v0}, Lcom/android/core/ArrayDeque;->c(Lcom/android/core/ArrayDeque;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/android/core/ArrayDeque$b;->b:I

    aget-object v0, v0, v1

    .line 729
    iget-object v1, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-static {v1}, Lcom/android/core/ArrayDeque;->a(Lcom/android/core/ArrayDeque;)I

    move-result v1

    iget v2, p0, Lcom/android/core/ArrayDeque$b;->c:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_2

    .line 730
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    .line 732
    :cond_2
    iget v1, p0, Lcom/android/core/ArrayDeque$b;->b:I

    iput v1, p0, Lcom/android/core/ArrayDeque$b;->d:I

    .line 733
    return-object v0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 738
    iget v0, p0, Lcom/android/core/ArrayDeque$b;->d:I

    if-gez v0, :cond_0

    .line 739
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 741
    :cond_0
    iget-object v0, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    iget v1, p0, Lcom/android/core/ArrayDeque$b;->d:I

    invoke-static {v0, v1}, Lcom/android/core/ArrayDeque;->a(Lcom/android/core/ArrayDeque;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 742
    iget v0, p0, Lcom/android/core/ArrayDeque$b;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-static {v1}, Lcom/android/core/ArrayDeque;->c(Lcom/android/core/ArrayDeque;)[Ljava/lang/Object;

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lcom/android/core/ArrayDeque$b;->b:I

    .line 743
    iget-object v0, p0, Lcom/android/core/ArrayDeque$b;->a:Lcom/android/core/ArrayDeque;

    invoke-static {v0}, Lcom/android/core/ArrayDeque;->a(Lcom/android/core/ArrayDeque;)I

    move-result v0

    iput v0, p0, Lcom/android/core/ArrayDeque$b;->c:I

    .line 745
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lcom/android/core/ArrayDeque$b;->d:I

    .line 746
    return-void
.end method
