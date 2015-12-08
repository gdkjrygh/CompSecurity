.class public final Lcom/b/a/t;
.super Lcom/b/a/z;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/o;


# direct methods
.method public constructor <init>(Lcom/b/a/m;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/b/a/z;-><init>(Lcom/b/a/m;)V

    .line 42
    return-void
.end method


# virtual methods
.method public final a(IIZ)V
    .locals 0

    .prologue
    .line 306
    invoke-virtual {p0, p1, p2, p3}, Lcom/b/a/t;->b(IIZ)V

    .line 307
    return-void
.end method

.method public final a(IJZ)V
    .locals 4

    .prologue
    .line 187
    iget-object v0, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    iget-object v1, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    const/4 v2, 0x0

    invoke-static {p1, v2}, Lcom/b/a/y;->a(II)I

    move-result v2

    iget-object v3, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v1, v2, p0, v3}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    invoke-virtual {v0, p2, p3, p0, v1}, Lcom/b/a/aa;->a(JLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 200
    return-void
.end method

.method public final a(ILcom/b/a/b;Z)V
    .locals 8

    .prologue
    .line 327
    invoke-virtual {p2}, Lcom/b/a/b;->a()[B

    move-result-object v0

    iget-object v1, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    array-length v2, v0

    iget-object v3, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    array-length v4, v0

    iget-object v5, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    const/4 v6, 0x2

    invoke-static {p1, v6}, Lcom/b/a/y;->a(II)I

    move-result v6

    iget-object v7, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v5, v6, p0, v7}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v5

    invoke-virtual {v3, v4, p0, v5}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v3

    invoke-virtual {v1, v0, v2, p0, v3}, Lcom/b/a/aa;->a([BILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 328
    return-void
.end method

.method public final a(ILjava/lang/Object;Lcom/b/a/u;Z)V
    .locals 3

    .prologue
    .line 368
    iget-object v0, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    const/4 v1, 0x3

    invoke-static {p1, v1}, Lcom/b/a/y;->a(II)I

    move-result v1

    iget-object v2, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v0, v1, p0, v2}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 373
    invoke-interface {p3, p0, p2}, Lcom/b/a/u;->a(Lcom/b/a/o;Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    const/4 v1, 0x4

    invoke-static {p1, v1}, Lcom/b/a/y;->a(II)I

    move-result v1

    iget-object v2, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v0, v1, p0, v2}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 379
    return-void
.end method

.method public final a(ILjava/lang/String;Z)V
    .locals 4

    .prologue
    .line 311
    iget-object v0, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    iget-object v1, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    const/4 v2, 0x2

    invoke-static {p1, v2}, Lcom/b/a/y;->a(II)I

    move-result v2

    iget-object v3, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v1, v2, p0, v3}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    invoke-virtual {v0, p2, p0, v1}, Lcom/b/a/aa;->a(Ljava/lang/String;Lcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 323
    return-void
.end method

.method public final a(IZZ)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 289
    iget-object v2, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v3, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    invoke-static {p1, v1}, Lcom/b/a/y;->a(II)I

    move-result v1

    iget-object v4, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v3, v1, p0, v4}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    invoke-virtual {v2, v0, p0, v1}, Lcom/b/a/aa;->a(BLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 302
    return-void

    :cond_0
    move v0, v1

    .line 289
    goto :goto_0
.end method

.method public final b(IIZ)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 60
    if-gez p2, :cond_0

    .line 62
    iget-object v0, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    int-to-long v2, p2

    iget-object v1, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    invoke-static {p1, v4}, Lcom/b/a/y;->a(II)I

    move-result v4

    iget-object v5, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v1, v4, p0, v5}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    invoke-virtual {v0, v2, v3, p0, v1}, Lcom/b/a/aa;->a(JLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 98
    :goto_0
    return-void

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    iget-object v1, p0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    invoke-static {p1, v4}, Lcom/b/a/y;->a(II)I

    move-result v2

    iget-object v3, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v1, v2, p0, v3}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    invoke-virtual {v0, p2, p0, v1}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/t;->b:Lcom/b/a/m;

    goto :goto_0
.end method
