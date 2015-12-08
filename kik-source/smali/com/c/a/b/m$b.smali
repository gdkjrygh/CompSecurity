.class final Lcom/c/a/b/m$b;
.super Lcom/c/a/b/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final transient a:I

.field final transient b:I

.field final synthetic c:Lcom/c/a/b/m;


# direct methods
.method constructor <init>(Lcom/c/a/b/m;II)V
    .locals 0

    .prologue
    .line 406
    iput-object p1, p0, Lcom/c/a/b/m$b;->c:Lcom/c/a/b/m;

    invoke-direct {p0}, Lcom/c/a/b/m;-><init>()V

    .line 407
    iput p2, p0, Lcom/c/a/b/m$b;->a:I

    .line 408
    iput p3, p0, Lcom/c/a/b/m$b;->b:I

    .line 409
    return-void
.end method


# virtual methods
.method public final a(II)Lcom/c/a/b/m;
    .locals 3

    .prologue
    .line 424
    iget v0, p0, Lcom/c/a/b/m$b;->b:I

    invoke-static {p1, p2, v0}, Lcom/c/a/a/u;->a(III)V

    .line 425
    iget-object v0, p0, Lcom/c/a/b/m$b;->c:Lcom/c/a/b/m;

    iget v1, p0, Lcom/c/a/b/m$b;->a:I

    add-int/2addr v1, p1

    iget v2, p0, Lcom/c/a/b/m$b;->a:I

    add-int/2addr v2, p2

    invoke-virtual {v0, v1, v2}, Lcom/c/a/b/m;->a(II)Lcom/c/a/b/m;

    move-result-object v0

    return-object v0
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 430
    const/4 v0, 0x1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 418
    iget v0, p0, Lcom/c/a/b/m$b;->b:I

    invoke-static {p1, v0}, Lcom/c/a/a/u;->a(II)I

    .line 419
    iget-object v0, p0, Lcom/c/a/b/m$b;->c:Lcom/c/a/b/m;

    iget v1, p0, Lcom/c/a/b/m$b;->a:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 402
    invoke-super {p0}, Lcom/c/a/b/m;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 402
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/c/a/b/m;->a(I)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 402
    invoke-super {p0, p1}, Lcom/c/a/b/m;->a(I)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 413
    iget v0, p0, Lcom/c/a/b/m$b;->b:I

    return v0
.end method

.method public final synthetic subList(II)Ljava/util/List;
    .locals 1

    .prologue
    .line 402
    invoke-virtual {p0, p1, p2}, Lcom/c/a/b/m$b;->a(II)Lcom/c/a/b/m;

    move-result-object v0

    return-object v0
.end method
