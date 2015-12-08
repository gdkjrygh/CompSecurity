.class public final Lcom/b/a/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I
    .locals 3

    .prologue
    .line 325
    new-instance v0, Lcom/b/a/m;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lcom/b/a/m;-><init>(I)V

    .line 326
    new-instance v1, Lcom/b/a/t;

    invoke-direct {v1, v0}, Lcom/b/a/t;-><init>(Lcom/b/a/m;)V

    .line 327
    new-instance v2, Lcom/b/a/j;

    invoke-direct {v2, v1}, Lcom/b/a/j;-><init>(Lcom/b/a/t;)V

    .line 328
    invoke-interface {p2, v2, p1}, Lcom/b/a/u;->a(Lcom/b/a/o;Ljava/lang/Object;)V

    .line 329
    iget v2, v1, Lcom/b/a/t;->c:I

    invoke-static {p0, v2}, Lcom/b/a/r;->a(Ljava/io/DataOutput;I)V

    .line 330
    invoke-static {p0, v0}, Lcom/b/a/m;->a(Ljava/io/DataOutput;Lcom/b/a/m;)I

    .line 331
    iget v0, v1, Lcom/b/a/t;->c:I

    return v0
.end method

.method public static a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v4, 0x0

    .line 189
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v0

    .line 190
    and-int/lit16 v1, v0, 0x80

    if-nez v1, :cond_2

    .line 192
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 195
    const/16 v1, 0x1000

    if-le v0, v1, :cond_8

    instance-of v1, p0, Ljava/io/InputStream;

    if-eqz v1, :cond_8

    .line 198
    new-instance v1, Lcom/b/a/c;

    new-instance v2, Lcom/b/a/l;

    check-cast p0, Ljava/io/InputStream;

    invoke-direct {v2, p0, v0}, Lcom/b/a/l;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {v1, v2}, Lcom/b/a/c;-><init>(Ljava/io/InputStream;)V

    .line 200
    new-instance v0, Lcom/b/a/g;

    invoke-direct {v0, v1}, Lcom/b/a/g;-><init>(Lcom/b/a/c;)V

    .line 201
    invoke-interface {p2, v0, p1}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V

    .line 202
    invoke-virtual {v1, v4}, Lcom/b/a/c;->a(I)V

    .line 224
    :cond_1
    :goto_1
    invoke-interface {p2, p1}, Lcom/b/a/u;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 225
    new-instance v0, Lcom/b/a/x;

    invoke-direct {v0, p1, p2}, Lcom/b/a/x;-><init>(Ljava/lang/Object;Lcom/b/a/u;)V

    throw v0

    .line 190
    :cond_2
    and-int/lit8 v0, v0, 0x7f

    const/4 v1, 0x7

    :goto_2
    const/16 v2, 0x20

    if-ge v1, v2, :cond_5

    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v2

    if-ne v2, v5, :cond_3

    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_3
    and-int/lit8 v3, v2, 0x7f

    shl-int/2addr v3, v1

    or-int/2addr v0, v3

    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x7

    goto :goto_2

    :cond_4
    add-int/lit8 v1, v1, 0x7

    :cond_5
    const/16 v2, 0x40

    if-ge v1, v2, :cond_7

    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v2

    if-ne v2, v5, :cond_6

    invoke-static {}, Lcom/b/a/p;->a()Lcom/b/a/p;

    move-result-object v0

    throw v0

    :cond_6
    and-int/lit16 v2, v2, 0x80

    if-nez v2, :cond_4

    goto :goto_0

    :cond_7
    invoke-static {}, Lcom/b/a/p;->d()Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 206
    :cond_8
    new-array v1, v0, [B

    .line 207
    invoke-interface {p0, v1, v4, v0}, Ljava/io/DataInput;->readFully([BII)V

    .line 208
    new-instance v2, Lcom/b/a/a;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v0, v3}, Lcom/b/a/a;-><init>([BIZ)V

    .line 210
    new-instance v0, Lcom/b/a/f;

    invoke-direct {v0, v2}, Lcom/b/a/f;-><init>(Lcom/b/a/a;)V

    .line 213
    :try_start_0
    invoke-interface {p2, v0, p1}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    invoke-virtual {v2, v4}, Lcom/b/a/a;->a(I)V

    goto :goto_1

    .line 215
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/b/a/p;->a(Ljava/lang/Throwable;)Lcom/b/a/p;

    move-result-object v0

    throw v0

    .line 226
    :cond_9
    return-void
.end method
