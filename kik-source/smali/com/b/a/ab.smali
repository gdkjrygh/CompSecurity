.class final enum Lcom/b/a/ab;
.super Lcom/b/a/aa;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0, v0}, Lcom/b/a/aa;-><init>(Ljava/lang/String;IB)V

    return-void
.end method


# virtual methods
.method public final a(BLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 3

    .prologue
    .line 99
    iget v0, p2, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p2, Lcom/b/a/z;->c:I

    .line 101
    iget v0, p3, Lcom/b/a/m;->c:I

    iget-object v1, p3, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 104
    new-instance v0, Lcom/b/a/m;

    iget v1, p2, Lcom/b/a/z;->d:I

    invoke-direct {v0, v1, p3}, Lcom/b/a/m;-><init>(ILcom/b/a/m;)V

    move-object p3, v0

    .line 106
    :cond_0
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lcom/b/a/m;->c:I

    aput-byte p1, v0, v1

    .line 108
    return-object p3
.end method

.method public final a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 3

    .prologue
    .line 184
    :goto_0
    iget v0, p2, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p2, Lcom/b/a/z;->c:I

    .line 185
    iget v0, p3, Lcom/b/a/m;->c:I

    iget-object v1, p3, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 188
    new-instance v0, Lcom/b/a/m;

    iget v1, p2, Lcom/b/a/z;->d:I

    invoke-direct {v0, v1, p3}, Lcom/b/a/m;-><init>(ILcom/b/a/m;)V

    move-object p3, v0

    .line 191
    :cond_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_1

    .line 193
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lcom/b/a/m;->c:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 194
    return-object p3

    .line 197
    :cond_1
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lcom/b/a/m;->c:I

    and-int/lit8 v2, p1, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 198
    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public final a(JLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 5

    .prologue
    .line 207
    :goto_0
    iget v0, p3, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p3, Lcom/b/a/z;->c:I

    .line 208
    iget v0, p4, Lcom/b/a/m;->c:I

    iget-object v1, p4, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 211
    new-instance v0, Lcom/b/a/m;

    iget v1, p3, Lcom/b/a/z;->d:I

    invoke-direct {v0, v1, p4}, Lcom/b/a/m;-><init>(ILcom/b/a/m;)V

    move-object p4, v0

    .line 214
    :cond_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 216
    iget-object v0, p4, Lcom/b/a/m;->a:[B

    iget v1, p4, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p4, Lcom/b/a/m;->c:I

    long-to-int v2, p1

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 217
    return-object p4

    .line 220
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

    .line 221
    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 1

    .prologue
    .line 264
    invoke-static {p1, p2, p3}, Lcom/b/a/w;->a(Ljava/lang/String;Lcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v0

    return-object v0
.end method

.method public final a([BILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 47
    if-nez p2, :cond_0

    .line 93
    :goto_0
    return-object p4

    .line 50
    :cond_0
    iget v0, p3, Lcom/b/a/z;->c:I

    add-int/2addr v0, p2

    iput v0, p3, Lcom/b/a/z;->c:I

    .line 52
    iget-object v0, p4, Lcom/b/a/m;->a:[B

    array-length v0, v0

    iget v1, p4, Lcom/b/a/m;->c:I

    sub-int v1, v0, v1

    .line 53
    if-le p2, v1, :cond_3

    .line 55
    iget v0, p3, Lcom/b/a/z;->d:I

    add-int/2addr v0, v1

    if-ge v0, p2, :cond_2

    .line 58
    if-nez v1, :cond_1

    .line 61
    new-instance v0, Lcom/b/a/m;

    iget v1, p3, Lcom/b/a/z;->d:I

    new-instance v2, Lcom/b/a/m;

    add-int/lit8 v3, p2, 0x0

    invoke-direct {v2, p1, v3, p4}, Lcom/b/a/m;-><init>([BILcom/b/a/m;)V

    invoke-direct {v0, v1, v2}, Lcom/b/a/m;-><init>(ILcom/b/a/m;)V

    move-object p4, v0

    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Lcom/b/a/m;

    new-instance v1, Lcom/b/a/m;

    add-int/lit8 v2, p2, 0x0

    invoke-direct {v1, p1, v2, p4}, Lcom/b/a/m;-><init>([BILcom/b/a/m;)V

    invoke-direct {v0, p4, v1}, Lcom/b/a/m;-><init>(Lcom/b/a/m;Lcom/b/a/m;)V

    move-object p4, v0

    goto :goto_0

    .line 71
    :cond_2
    iget-object v0, p4, Lcom/b/a/m;->a:[B

    iget v2, p4, Lcom/b/a/m;->c:I

    invoke-static {p1, v4, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 73
    iget v0, p4, Lcom/b/a/m;->c:I

    add-int/2addr v0, v1

    iput v0, p4, Lcom/b/a/m;->c:I

    .line 76
    new-instance v0, Lcom/b/a/m;

    iget v2, p3, Lcom/b/a/z;->d:I

    invoke-direct {v0, v2, p4}, Lcom/b/a/m;-><init>(ILcom/b/a/m;)V

    .line 78
    sub-int v2, p2, v1

    .line 81
    add-int/lit8 v1, v1, 0x0

    iget-object v3, v0, Lcom/b/a/m;->a:[B

    invoke-static {p1, v1, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    iget v1, v0, Lcom/b/a/m;->c:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/b/a/m;->c:I

    move-object p4, v0

    .line 85
    goto :goto_0

    .line 89
    :cond_3
    iget-object v0, p4, Lcom/b/a/m;->a:[B

    iget v1, p4, Lcom/b/a/m;->c:I

    invoke-static {p1, v4, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    iget v0, p4, Lcom/b/a/m;->c:I

    add-int/2addr v0, p2

    iput v0, p4, Lcom/b/a/m;->c:I

    goto :goto_0
.end method
