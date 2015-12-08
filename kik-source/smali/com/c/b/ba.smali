.class Lcom/c/b/ba;
.super Lcom/c/b/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/ba$a;
    }
.end annotation


# instance fields
.field protected final c:[B

.field private d:I


# direct methods
.method constructor <init>([B)V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Lcom/c/b/f;-><init>()V

    .line 251
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/b/ba;->d:I

    .line 65
    iput-object p1, p0, Lcom/c/b/ba;->c:[B

    .line 66
    return-void
.end method

.method private static a(I[BII)I
    .locals 3

    .prologue
    .line 285
    move v0, p2

    :goto_0
    add-int v1, p2, p3

    if-ge v0, v1, :cond_0

    .line 286
    mul-int/lit8 v1, p0, 0x1f

    aget-byte v2, p1, v0

    add-int p0, v1, v2

    .line 285
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 288
    :cond_0
    return p0
.end method

.method static b([B)I
    .locals 3

    .prologue
    .line 292
    array-length v0, p0

    const/4 v1, 0x0

    array-length v2, p0

    invoke-static {v0, p0, v1, v2}, Lcom/c/b/ba;->a(I[BII)I

    move-result v0

    .line 293
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method public a(I)B
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/c/b/ba;->c:[B

    aget-byte v0, v0, p1

    return v0
.end method

.method public a()I
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/c/b/ba;->c:[B

    array-length v0, v0

    return v0
.end method

.method protected final a(III)I
    .locals 3

    .prologue
    .line 170
    invoke-virtual {p0}, Lcom/c/b/ba;->b()I

    move-result v0

    add-int/2addr v0, p2

    .line 171
    iget-object v1, p0, Lcom/c/b/ba;->c:[B

    add-int v2, v0, p3

    invoke-static {p1, v1, v0, v2}, Lcom/c/b/cc;->a(I[BII)I

    move-result v0

    return v0
.end method

.method protected final a(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 156
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/c/b/ba;->c:[B

    invoke-virtual {p0}, Lcom/c/b/ba;->b()I

    move-result v2

    invoke-virtual {p0}, Lcom/c/b/ba;->a()I

    move-result v3

    invoke-direct {v0, v1, v2, v3, p1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method final a(Ljava/io/OutputStream;II)V
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lcom/c/b/ba;->c:[B

    invoke-virtual {p0}, Lcom/c/b/ba;->b()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {p1, v0, v1, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 152
    return-void
.end method

.method protected a([BIII)V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/c/b/ba;->c:[B

    invoke-static {v0, p2, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 120
    return-void
.end method

.method final a(Lcom/c/b/ba;II)Z
    .locals 7

    .prologue
    .line 223
    invoke-virtual {p1}, Lcom/c/b/ba;->a()I

    move-result v0

    if-le p3, v0, :cond_0

    .line 224
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Length too large: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/c/b/ba;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :cond_0
    add-int v0, p2, p3

    invoke-virtual {p1}, Lcom/c/b/ba;->a()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 228
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ran off end of other: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/c/b/ba;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :cond_1
    iget-object v2, p0, Lcom/c/b/ba;->c:[B

    .line 234
    iget-object v3, p1, Lcom/c/b/ba;->c:[B

    .line 235
    invoke-virtual {p0}, Lcom/c/b/ba;->b()I

    move-result v0

    add-int v4, v0, p3

    .line 236
    invoke-virtual {p0}, Lcom/c/b/ba;->b()I

    move-result v0

    invoke-virtual {p1}, Lcom/c/b/ba;->b()I

    move-result v1

    add-int/2addr v1, p2

    .line 238
    :goto_0
    if-ge v0, v4, :cond_3

    .line 239
    aget-byte v5, v2, v0

    aget-byte v6, v3, v1

    if-eq v5, v6, :cond_2

    .line 240
    const/4 v0, 0x0

    .line 243
    :goto_1
    return v0

    .line 238
    :cond_2
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 243
    :cond_3
    const/4 v0, 0x1

    goto :goto_1
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 370
    const/4 v0, 0x0

    return v0
.end method

.method protected final b(III)I
    .locals 2

    .prologue
    .line 281
    iget-object v0, p0, Lcom/c/b/ba;->c:[B

    invoke-virtual {p0}, Lcom/c/b/ba;->b()I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {p1, v0, v1, p3}, Lcom/c/b/ba;->a(I[BII)I

    move-result v0

    return v0
.end method

.method public c()Lcom/c/b/f$a;
    .locals 2

    .prologue
    .line 317
    new-instance v0, Lcom/c/b/ba$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/b/ba$a;-><init>(Lcom/c/b/ba;B)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 179
    if-ne p1, p0, :cond_0

    move v0, v1

    .line 205
    :goto_0
    return v0

    .line 182
    :cond_0
    instance-of v0, p1, Lcom/c/b/f;

    if-nez v0, :cond_1

    move v0, v2

    .line 183
    goto :goto_0

    .line 186
    :cond_1
    invoke-virtual {p0}, Lcom/c/b/ba;->a()I

    move-result v3

    move-object v0, p1

    check-cast v0, Lcom/c/b/f;

    invoke-virtual {v0}, Lcom/c/b/f;->a()I

    move-result v0

    if-eq v3, v0, :cond_2

    move v0, v2

    .line 187
    goto :goto_0

    .line 189
    :cond_2
    invoke-virtual {p0}, Lcom/c/b/ba;->a()I

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    .line 190
    goto :goto_0

    .line 193
    :cond_3
    instance-of v0, p1, Lcom/c/b/ba;

    if-eqz v0, :cond_5

    move-object v0, p1

    .line 194
    check-cast v0, Lcom/c/b/ba;

    .line 197
    iget v1, p0, Lcom/c/b/ba;->d:I

    if-eqz v1, :cond_4

    iget v1, v0, Lcom/c/b/ba;->d:I

    if-eqz v1, :cond_4

    iget v1, p0, Lcom/c/b/ba;->d:I

    iget v0, v0, Lcom/c/b/ba;->d:I

    if-eq v1, v0, :cond_4

    move v0, v2

    .line 200
    goto :goto_0

    .line 203
    :cond_4
    check-cast p1, Lcom/c/b/ba;

    invoke-virtual {p0}, Lcom/c/b/ba;->a()I

    move-result v0

    invoke-virtual {p0, p1, v2, v0}, Lcom/c/b/ba;->a(Lcom/c/b/ba;II)Z

    move-result v0

    goto :goto_0

    .line 204
    :cond_5
    instance-of v0, p1, Lcom/c/b/bo;

    if-eqz v0, :cond_6

    .line 205
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 207
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Has a new type of ByteString been created? Found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()Z
    .locals 3

    .prologue
    .line 164
    invoke-virtual {p0}, Lcom/c/b/ba;->b()I

    move-result v0

    .line 165
    iget-object v1, p0, Lcom/c/b/ba;->c:[B

    invoke-virtual {p0}, Lcom/c/b/ba;->a()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v1, v0, v2}, Lcom/c/b/cc;->a([BII)Z

    move-result v0

    return v0
.end method

.method public final h()Lcom/c/b/g;
    .locals 1

    .prologue
    .line 309
    invoke-static {p0}, Lcom/c/b/g;->a(Lcom/c/b/ba;)Lcom/c/b/g;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 261
    iget v0, p0, Lcom/c/b/ba;->d:I

    .line 263
    if-nez v0, :cond_1

    .line 264
    invoke-virtual {p0}, Lcom/c/b/ba;->a()I

    move-result v0

    .line 265
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lcom/c/b/ba;->b(III)I

    move-result v0

    .line 266
    if-nez v0, :cond_0

    .line 267
    const/4 v0, 0x1

    .line 269
    :cond_0
    iput v0, p0, Lcom/c/b/ba;->d:I

    .line 271
    :cond_1
    return v0
.end method

.method protected final i()I
    .locals 1

    .prologue
    .line 276
    iget v0, p0, Lcom/c/b/ba;->d:I

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0}, Lcom/c/b/ba;->c()Lcom/c/b/f$a;

    move-result-object v0

    return-object v0
.end method
