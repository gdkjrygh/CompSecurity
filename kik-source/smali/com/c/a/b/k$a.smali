.class abstract Lcom/c/a/b/k$a;
.super Lcom/c/a/b/k$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# instance fields
.field a:[Ljava/lang/Object;

.field b:I


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 320
    invoke-direct {p0}, Lcom/c/a/b/k$b;-><init>()V

    .line 321
    const-string v0, "initialCapacity"

    invoke-static {v1, v0}, Lcom/c/a/b/d;->a(ILjava/lang/String;)I

    .line 322
    new-array v0, v1, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/c/a/b/k$a;->a:[Ljava/lang/Object;

    .line 323
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/a/b/k$a;->b:I

    .line 324
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/c/a/b/k$a;
    .locals 3

    .prologue
    .line 339
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    iget v0, p0, Lcom/c/a/b/k$a;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/c/a/b/k$a;->a:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v1, v0, :cond_0

    iget-object v1, p0, Lcom/c/a/b/k$a;->a:[Ljava/lang/Object;

    iget-object v2, p0, Lcom/c/a/b/k$a;->a:[Ljava/lang/Object;

    array-length v2, v2

    invoke-static {v2, v0}, Lcom/c/a/b/k$a;->a(II)I

    move-result v0

    invoke-static {v1, v0}, Lcom/c/a/b/ae;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/k$a;->a:[Ljava/lang/Object;

    .line 341
    :cond_0
    iget-object v0, p0, Lcom/c/a/b/k$a;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/c/a/b/k$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/c/a/b/k$a;->b:I

    aput-object p1, v0, v1

    .line 342
    return-object p0
.end method

.method public synthetic b(Ljava/lang/Object;)Lcom/c/a/b/k$b;
    .locals 1

    .prologue
    .line 316
    invoke-virtual {p0, p1}, Lcom/c/a/b/k$a;->a(Ljava/lang/Object;)Lcom/c/a/b/k$a;

    move-result-object v0

    return-object v0
.end method
