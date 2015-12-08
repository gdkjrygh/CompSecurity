.class final Lcom/b/a/c/bh;
.super Lcom/b/a/c/bj;
.source "SourceFile"


# instance fields
.field a:Lcom/b/a/c/b;


# direct methods
.method public constructor <init>(Lcom/b/a/c/b;)V
    .locals 2

    .prologue
    .line 259
    const/4 v0, 0x6

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/b/a/c/bj;

    invoke-direct {p0, v0, v1}, Lcom/b/a/c/bj;-><init>(I[Lcom/b/a/c/bj;)V

    .line 260
    iput-object p1, p0, Lcom/b/a/c/bh;->a:Lcom/b/a/c/b;

    .line 261
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 265
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/b/a/c/bh;->a:Lcom/b/a/c/b;

    invoke-static {v0, v1}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v0

    return v0
.end method

.method public final a(Lcom/b/a/c/f;)V
    .locals 2

    .prologue
    .line 270
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/b/a/c/bh;->a:Lcom/b/a/c/b;

    invoke-virtual {p1, v0, v1}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 271
    return-void
.end method
