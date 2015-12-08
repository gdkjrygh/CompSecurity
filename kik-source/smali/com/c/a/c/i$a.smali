.class final Lcom/c/a/c/i$a;
.super Lcom/c/a/c/i;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/c/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field final a:[B


# direct methods
.method constructor <init>([B)V
    .locals 1

    .prologue
    .line 260
    invoke-direct {p0}, Lcom/c/a/c/i;-><init>()V

    .line 261
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    .line 262
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    return v0
.end method

.method final a(Lcom/c/a/c/i;)Z
    .locals 2

    .prologue
    .line 312
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    invoke-virtual {p1}, Lcom/c/a/c/i;->e()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 276
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    array-length v0, v0

    const/4 v3, 0x4

    if-lt v0, v3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes)."

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/c/a/c/i$a;->a:[B

    array-length v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/c/a/a/u;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 278
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    iget-object v2, p0, Lcom/c/a/c/i$a;->a:[B

    aget-byte v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iget-object v1, p0, Lcom/c/a/c/i$a;->a:[B

    const/4 v2, 0x2

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    iget-object v1, p0, Lcom/c/a/c/i$a;->a:[B

    const/4 v2, 0x3

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0

    :cond_0
    move v0, v2

    .line 276
    goto :goto_0
.end method

.method public final c()J
    .locals 9

    .prologue
    const/16 v8, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 286
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    array-length v0, v0

    if-lt v0, v8, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes)."

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/c/a/c/i$a;->a:[B

    array-length v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/c/a/a/u;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 288
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    int-to-long v2, v0

    :goto_1
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    array-length v0, v0

    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    aget-byte v0, v0, v1

    int-to-long v4, v0

    const-wide/16 v6, 0xff

    and-long/2addr v4, v6

    mul-int/lit8 v0, v1, 0x8

    shl-long/2addr v4, v0

    or-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    move v0, v2

    .line 286
    goto :goto_0

    .line 288
    :cond_1
    return-wide v2
.end method

.method public final d()[B
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method final e()[B
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/c/a/c/i$a;->a:[B

    return-object v0
.end method
