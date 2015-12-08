.class final enum Lcom/b/a/ac;
.super Lcom/b/a/aa;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 276
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/b/a/aa;-><init>(Ljava/lang/String;IB)V

    return-void
.end method


# virtual methods
.method public final a(BLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 5

    .prologue
    .line 325
    iget v0, p2, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p2, Lcom/b/a/z;->c:I

    .line 327
    iget v0, p3, Lcom/b/a/m;->c:I

    iget-object v1, p3, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 330
    iget-object v0, p2, Lcom/b/a/z;->e:Ljava/io/OutputStream;

    iget-object v1, p3, Lcom/b/a/m;->a:[B

    iget v2, p3, Lcom/b/a/m;->b:I

    iget v3, p3, Lcom/b/a/m;->c:I

    iget v4, p3, Lcom/b/a/m;->b:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 331
    iget v0, p3, Lcom/b/a/m;->b:I

    iput v0, p3, Lcom/b/a/m;->c:I

    .line 333
    :cond_0
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lcom/b/a/m;->c:I

    aput-byte p1, v0, v1

    .line 335
    return-object p3
.end method

.method public final a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 5

    .prologue
    .line 415
    :goto_0
    iget v0, p2, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p2, Lcom/b/a/z;->c:I

    .line 416
    iget v0, p3, Lcom/b/a/m;->c:I

    iget-object v1, p3, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 419
    iget-object v0, p2, Lcom/b/a/z;->e:Ljava/io/OutputStream;

    iget-object v1, p3, Lcom/b/a/m;->a:[B

    iget v2, p3, Lcom/b/a/m;->b:I

    iget v3, p3, Lcom/b/a/m;->c:I

    iget v4, p3, Lcom/b/a/m;->b:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 420
    iget v0, p3, Lcom/b/a/m;->b:I

    iput v0, p3, Lcom/b/a/m;->c:I

    .line 423
    :cond_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_1

    .line 425
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lcom/b/a/m;->c:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 426
    return-object p3

    .line 429
    :cond_1
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lcom/b/a/m;->c:I

    and-int/lit8 v2, p1, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 430
    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public final a(JLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 5

    .prologue
    .line 439
    :goto_0
    iget v0, p3, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p3, Lcom/b/a/z;->c:I

    .line 440
    iget v0, p4, Lcom/b/a/m;->c:I

    iget-object v1, p4, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 443
    iget-object v0, p3, Lcom/b/a/z;->e:Ljava/io/OutputStream;

    iget-object v1, p4, Lcom/b/a/m;->a:[B

    iget v2, p4, Lcom/b/a/m;->b:I

    iget v3, p4, Lcom/b/a/m;->c:I

    iget v4, p4, Lcom/b/a/m;->b:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 444
    iget v0, p4, Lcom/b/a/m;->b:I

    iput v0, p4, Lcom/b/a/m;->c:I

    .line 447
    :cond_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 449
    iget-object v0, p4, Lcom/b/a/m;->a:[B

    iget v1, p4, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p4, Lcom/b/a/m;->c:I

    long-to-int v2, p1

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 450
    return-object p4

    .line 453
    :cond_1
    iget-object v0, p4, Lcom/b/a/m;->a:[B

    iget v1, p4, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p4, Lcom/b/a/m;->c:I

    long-to-int v2, p1

    and-int/lit8 v2, v2, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 454
    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 1

    .prologue
    .line 497
    iget-object v0, p2, Lcom/b/a/z;->e:Ljava/io/OutputStream;

    invoke-static {p1, p2, v0, p3}, Lcom/b/a/v;->a(Ljava/lang/String;Lcom/b/a/z;Ljava/io/OutputStream;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    return-object v0
.end method

.method public final a([BILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 298
    if-nez p2, :cond_0

    .line 318
    :goto_0
    return-object p4

    .line 301
    :cond_0
    iget v0, p3, Lcom/b/a/z;->c:I

    add-int/2addr v0, p2

    iput v0, p3, Lcom/b/a/z;->c:I

    .line 303
    iget v0, p4, Lcom/b/a/m;->c:I

    add-int/2addr v0, p2

    iget-object v1, p4, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-le v0, v1, :cond_1

    .line 306
    iget-object v0, p3, Lcom/b/a/z;->e:Ljava/io/OutputStream;

    iget-object v1, p4, Lcom/b/a/m;->a:[B

    iget v2, p4, Lcom/b/a/m;->b:I

    iget v3, p4, Lcom/b/a/m;->c:I

    iget v4, p4, Lcom/b/a/m;->b:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 307
    iget v0, p4, Lcom/b/a/m;->b:I

    iput v0, p4, Lcom/b/a/m;->c:I

    .line 310
    iget-object v0, p3, Lcom/b/a/z;->e:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, v5, p2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    .line 315
    :cond_1
    iget-object v0, p4, Lcom/b/a/m;->a:[B

    iget v1, p4, Lcom/b/a/m;->c:I

    invoke-static {p1, v5, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 316
    iget v0, p4, Lcom/b/a/m;->c:I

    add-int/2addr v0, p2

    iput v0, p4, Lcom/b/a/m;->c:I

    goto :goto_0
.end method
