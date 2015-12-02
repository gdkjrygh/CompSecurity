.class public Lcom/facebook/common/b/e;
.super Ljava/lang/Object;
.source "RingBuffer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput v0, p0, Lcom/facebook/common/b/e;->b:I

    .line 16
    iput v0, p0, Lcom/facebook/common/b/e;->c:I

    .line 17
    iput v0, p0, Lcom/facebook/common/b/e;->d:I

    .line 20
    new-array v0, p1, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    .line 21
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 31
    iget v0, p0, Lcom/facebook/common/b/e;->b:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Underflow"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 32
    iget-object v0, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/facebook/common/b/e;->c:I

    aget-object v0, v0, v1

    .line 33
    iget-object v1, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    iget v2, p0, Lcom/facebook/common/b/e;->c:I

    const/4 v3, 0x0

    aput-object v3, v1, v2

    .line 34
    iget v1, p0, Lcom/facebook/common/b/e;->c:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    array-length v2, v2

    rem-int/2addr v1, v2

    iput v1, p0, Lcom/facebook/common/b/e;->c:I

    .line 35
    iget v1, p0, Lcom/facebook/common/b/e;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/facebook/common/b/e;->b:I

    .line 36
    return-object v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .prologue
    .line 40
    iget v0, p0, Lcom/facebook/common/b/e;->b:I

    if-gt v0, p1, :cond_0

    .line 41
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 43
    :cond_0
    iget v0, p0, Lcom/facebook/common/b/e;->c:I

    add-int/2addr v0, p1

    iget-object v1, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    array-length v1, v1

    rem-int/2addr v0, v1

    .line 44
    iget-object v1, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 24
    iget v0, p0, Lcom/facebook/common/b/e;->b:I

    iget-object v1, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Overflow"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 25
    iget-object v0, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/facebook/common/b/e;->d:I

    aput-object p1, v0, v1

    .line 26
    iget v0, p0, Lcom/facebook/common/b/e;->d:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/common/b/e;->d:I

    .line 27
    iget v0, p0, Lcom/facebook/common/b/e;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/common/b/e;->b:I

    .line 28
    return-void

    .line 24
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 52
    iget v0, p0, Lcom/facebook/common/b/e;->b:I

    iget-object v1, p0, Lcom/facebook/common/b/e;->a:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/facebook/common/b/e;->b:I

    return v0
.end method
